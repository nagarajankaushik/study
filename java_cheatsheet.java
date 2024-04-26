import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Integer constants
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);

        // Arrays syntax
        int k = 10;
        int[] ans = new int[k];
        System.out.println("ans.length: " + ans.length);
        Arrays.fill(ans, 0);

        int[][] intervals = new int[10][2]; // Example initialization
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] x, int[] y) {
                if (x[1] == y[1]) {
                    if (x[0] > y[0]) return -1;
                    else return 1;
                } else if (x[1] < y[1]) return -1;
                else return 1;
            }
        });

        Arrays.sort(intervals, Comparator.reverseOrder()); // Sorting intervals in reverse order
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // Sorting intervals based on starting position using lambda

        int[][] y = new int[10][2]; // Example initialization
        Arrays.binarySearch(y, intervals[0][0]);

        // ArrayList syntax
        ArrayList<Integer> temp = new ArrayList<>();
        System.out.println("temp.size(): " + temp.size());
        temp.add(5);
        temp.set(1, 10);
        System.out.println("temp.get(0): " + temp.get(0));

        Set<List<Integer>> res = new HashSet<>();
        new ArrayList<>(res); // Convert set to ArrayList

        List<List<Integer>> ansList = new ArrayList<>();
        Collections.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] x, int[] y) {
                // Your comparison logic
                return 0;
            }
        });

        ansList.toArray(new int[ansList.size()][]);

        // Set operations
        Set<List<Integer>> resultSet = new HashSet<>();
        resultSet.add(temp);
        System.out.println("res.contains(temp): " + resultSet.contains(temp));
        resultSet.remove(temp);

        // HashMap operations
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {1, 2, 3}; // Example nums array
        map.put(nums[0], 1);
        map.get(nums[1]);
        map.getOrDefault(1, 0);
        map.remove(nums[1]);
        map.containsKey(1);
        map.keySet();
        map.values();
        map.entrySet();

        // Iterating over HashMap
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }

        for (int value : map.values()) {
            System.out.println("value = " + value);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        // Converting values of HashMap to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(map.values());

        // TreeMap operations
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.floorEntry(5); // Example usage

        // LinkedList operations
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("linkedList.size(): " + linkedList.size());
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.clear();
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.get(0);
        linkedList.remove();
        linkedList.removeFirst();
        linkedList.removeLast();

        // String operations
        String s = "Raghu";
        System.out.println("s.charAt(0): " + s.charAt(0));
        System.out.println("s.equals(p): " + s.equals("p"));
        System.out.println("s.compareTo(p): " + s.compareTo("p"));
        System.out.println("s.substring(0, 3): " + s.substring(0, 3));
        String[] x = s.split(" ");
        x = s.split("\\.");

        StringBuilder sb = new StringBuilder();
        sb.append('-');
        sb.toString();

        // Stack operations
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.pop();
        stack.isEmpty();
        stack.size();
        stack.peek();

        // Random operations
        Random rand = new Random(); // Corrected initialization

        // PriorityQueue operations
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.poll();
        pq.peek();
        pq.size();
        pq.clear();

        PriorityQueue<Integer> pqReverse = new PriorityQueue<>(Comparator.reverseOrder());
    }
}
