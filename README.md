# LPU-navsystem



---

# Campus Map and Shortest Path Finder

This project is designed for Lovely Professional University (LPU) and includes two main components:

1. **Dijkstra's Algorithm Implementation**: To find the shortest path between different locations on the LPU campus.
2. **Campus Map Visualization**: A graphical representation of the campus with various key locations.

## Problem Statement

The Lovely Professional University campus is large and contains various important locations such as the library, hostel, administrative blocks, and more. Students and staff often need to navigate the campus efficiently. To facilitate this, we need a solution that can:

1. **Visualize** the campus layout with key locations clearly marked.
2. **Compute** the shortest path between different locations to help users find the most efficient route.

## Methodology

### 1. Graph Representation

- **Campus Map**: The campus is represented as a graph where each key location is a vertex, and the edges between vertices represent the distance or time required to travel between locations.
- **Vertices**: Represent key locations on the campus (e.g., Library, Hostel, etc.).
- **Edges**: Represent the pathways between locations, with weights corresponding to the distances.

### 2. Dijkstra's Algorithm

- **Objective**: To compute the shortest path from a source location to all other locations on the campus.
- **Approach**:
  - Initialize distances from the source to all other vertices as infinity, except for the source itself which is set to zero.
  - Use a priority queue to repeatedly select the vertex with the smallest distance.
  - Update the distances of adjacent vertices based on the selected vertex.
  - Continue until all vertices have been processed.

### 3. Visualization

- **Objective**: To create a clear and visually appealing representation of the campus map.
- **Approach**:
  - Use Java's `Graphics` class to draw rectangles and labels representing different buildings and facilities.
  - Assign distinct colors to each location for easy identification.
  - Ensure that the map is scaled appropriately and labels are legible.

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

This should give a comprehensive overview of your project, covering both its purpose and how it achieves its goals.

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
