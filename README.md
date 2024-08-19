# LPU-navsystem


---

# Campus Map and Shortest Path Finder

This project is designed for Lovely Professional University (LPU) and includes two main components:

1. **Dijkstra's Algorithm Implementation**: To find the shortest path between different locations on the LPU campus.
2. **Campus Map Visualization**: A graphical representation of the campus with various key locations.

## Project Components

### 1. Dijkstra's Algorithm

**Description**: This component implements Dijkstra's algorithm to calculate the shortest path from a source vertex to all other vertices in a graph. In this project, the graph represents the campus, and each vertex is a key location.

- **Java Code**: `Dijkstra.java`
- **Features**:
  - Calculates shortest paths using Dijkstra’s algorithm.
  - Handles a graph with 12 vertices.
  - Outputs the shortest distance from a source location to all other locations.

**Example Usage**:
```java
Dijkstra t = new Dijkstra();
t.dijkstra(graph, 0);  // Start from vertex A (index 0)
```

### 2. Campus Map Visualization

**Description**: This component provides a graphical visualization of the LPU campus, displaying key locations with different colors and labels.

- **Java Code**: `CampusMap.java`
- **Features**:
  - Visual representation of various campus buildings and facilities.
  - Uses `JPanel` and `Graphics` to draw the map.
  - Includes labels and color codes for different locations.

**Example Usage**:
```java
JFrame frame = new JFrame();
frame.setSize(1370, 768);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(new CampusMap());
frame.setVisible(true);
```

## How to Run

1. **Compile the Java Files**:
   ```bash
   javac Dijkstra.java
   javac CampusMap.java
   ```

2. **Run the Dijkstra Algorithm**:
   ```bash
   java Dijkstra
   ```

3. **Run the Campus Map Visualization**:
   ```bash
   java CampusMap
   ```

## Requirements

- Java Development Kit (JDK) 8 or later
- An IDE or a text editor for editing and running Java code

## Contributing

Feel free to contribute to this project by opening issues or submitting pull requests. If you have suggestions for improvements or additional features, please let me know!

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Feel free to adjust any details to better fit your project specifics!
