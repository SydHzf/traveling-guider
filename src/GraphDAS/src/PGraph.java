import java.util.*;

class City {
    int index;
    String name;
    String start;
    Integer distance = Integer.MAX_VALUE;
    Map<City,Integer> connectedCity = new HashMap<>();
    List<City> shortestPath = new LinkedList<>();


    public List<City> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<City> shortestPath) {
        this.shortestPath = shortestPath;
    }
    public Integer getDistance() {
        return distance;
    }
    public void setDistance(Integer distance) {
        this.distance = distance;
    }
    public Map<City, Integer> getConnectedCity() {
        return connectedCity;
    }
    public City(int i, String name, String start) {
        index = i;
        this.name = name;
        this.start = start;
    }
}
public class PGraph {

    int size = 0;
    static List<City> cities = new ArrayList<>();
    // shaher ko naam jama krny k lia.
    void addCity(String start, String name){
        int i = size++;
        City city = new City(i,name, start);
        cities.add(city);
    }
    //shaher dhundny k lia start k tha.
    static City cityLookup(String start){
        for(City c:cities){
            if(c.start.equalsIgnoreCase(start)){
                return c;
            }
        }
        return null;
    }
    static City cityLookup2(String cityName){
        for(City c:cities){
            if(c.name.equalsIgnoreCase(cityName)){
                return c;
            }
        }
        return null;
    }
    // Dijkstra's Algo
    public static void calculateShortestPathFromSource(String start,String end) {
        City source = cityLookup2(start);
        City destination = cityLookup2(end);

        source.setDistance(0);

        Set<City> settledNodes = new HashSet<>();
        Set<City> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            City currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<City, Integer> adjacencyPair: currentNode.getConnectedCity().entrySet()) {
                City adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
//                System.out.print(adjacentNode.name+">>");

                if (!settledNodes.contains(adjacentNode)) {
                    CalculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
//                    System.out.print(adjacentNode.name+">"+adjacentNode.getDistance()+">");
                    unsettledNodes.add(adjacentNode);

                }
            }
            settledNodes.add(currentNode);
        }
        for(City i: destination.getShortestPath()) {
            System.out.print("-"+i.distance+">"+i.name);
        }
        System.out.println("-"+destination.distance+">"+destination.name);
        // return graph;
    }
    private static City getLowestDistanceNode(Set<City> unsettledNodes) {
        City lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (City node: unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }
    private static void CalculateMinimumDistance(City evaluationNode, Integer edgeWeigh, City sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if ((sourceDistance + edgeWeigh) < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<City> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }
    // do shahero k jorny k lia.
    void connectCity(String code1, String code2,int distance){
        City c1 = cityLookup(code1);
        City c2 = cityLookup(code2);
        if( c1 == null || c2 == null){
            System.out.println("Cannot connect, Invalid city start.");
            return;
        }
        c1.connectedCity.put(c2, distance);
//        public void addDestination(Node destination, int distance) {
//            connectedCity.put(destination, distance);
//        }
    }


    public static void main(String[] args) {

        PGraph g = new PGraph();

//        g.addCity("SFO","San Fransisco");
//        g.addCity("AUS","Austin");
//        g.addCity("NY","New york");
//        g.addCity("BOM","Mumbai");
//        g.addCity("IND","Indore");
//        g.addCity("DEW","Dewas");

        // Add vertex or cities in the air line graph

        g.addCity("KRC","Karachi");
        g.addCity("LHR","Lahore");
        g.addCity("FSlB","Faisalabad");
        g.addCity("RWPD","Rawalpindi");
        g.addCity("MUL","Multan");
        g.addCity("HDRB","Hyderabad");

        // Add edges or air ways in the graph
        g.connectCity("HDRB","MUL",12);
        g.connectCity("MUL", "RWPD",14);
        g.connectCity("RWPD","FSLB",10);
        g.connectCity("RWPD","KRC",16);
        g.connectCity("FSLB", "HDRB",15);
//        g.connectCity("NY", "AUS");
//        g.connectCity("NY", "SFO");
        g.connectCity("FSLB","RWPD",14);
        g.connectCity("LHR", "KRC",11);

         calculateShortestPathFromSource("Rawalpindi","Hyderabad");


        // System.out.println(cityLookup("KRC") == cityLookup2("Karachi"));

        // DFS to find path
        // g.findDFSpath("DEW");
//        g.findBFSpath("FSLB","RWPD");


        // BFS to find path
        // g.findDFSpath("NY");
        // g.findBFSpath("NY");


    }
}

