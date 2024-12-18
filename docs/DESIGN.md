# Design Documentation

## Package Structure

The project is divided into several packages, each responsible for different aspects of the application. Below is an overview of the package structure and their interactions:

### 1. `client` Package
- **Purpose**: Contains all client-side code.
- **Sub-packages**:
    - `audio`: Handles audio recording, playback, and utilities.
        - `Audio_recorder.java`: Manages audio recording functionality.
        - `Audio_player.java`: Manages audio playback functionality.
        - `AudioUtils.java`: Provides helper methods for audio processing.
    - `network`: Manages network communication for the client.
        - `ClientSocket.java`: Handles client-side socket communication.
        - `Package_handler.java`: Manages the packaging and unpackaging of data packets.
    - `gui`: Contains the graphical user interface components.
        - `MainFrame.java`: The main window of the client application.
        - `ChatWindow.java`: The chat window for displaying and sending messages.
        - `Setting_panel.java`: The settings panel for configuring client options.
    - `MainClient.java`: The entry point for the client application.

### 2. `server` Package
- **Purpose**: Contains all server-side code.
- **Sub-packages**:
    - `audio`: (Optional) Handles audio forwarding if needed.
        - `AudioForwarder.java`: Manages the relaying of audio data.
    - `network`: Manages network communication for the server.
        - `ServerSocket.java`: Handles server-side socket communication.
        - `ClientHandler.java`: Manages individual client connections.
    - `MainServer.java`: The entry point for the server application.

### 3. `common` Package
- **Purpose**: Contains shared utilities and constants used by both client and server.
- **Classes**:
    - `Constants.java`: Defines constants such as port numbers and buffer sizes.
    - `AudioPacket.java`: Represents serializable audio data packets.
    - `Logger.java`: Provides logging functionality.

### 4. `test` Package
- **Purpose**: Contains unit tests for the application.
- **Sub-packages**:
    - `client`: Contains tests for client-side code.
        - `AudioRecorderTest.java`: Tests for the audio recording functionality.
        - `ClientSocketTest.java`: Tests for the client socket communication.
    - `server`: Contains tests for server-side code.
        - `ServerSocketTest.java`: Tests for the server socket communication.

### 5. `resources` Package
- **Purpose**: Contains configuration files and audio samples.
- **Files**:
    - `config.properties`: Configuration properties for the application.
    - `sample.wav`: Sample audio file for testing.

## Interaction Between Packages

### Client-Server Communication
- The `client.network.ClientSocket` class establishes a connection to the server using sockets.
- The `server.network.ServerSocket` class listens for incoming client connections and spawns `ClientHandler` instances to manage each connection.
- Data packets are exchanged between the client and server using the `common.AudioPacket` class.

### Audio Handling
- The `client.audio.Audio_recorder` class records audio data and stores it in `common.AudioPacket` instances.
- The `client.audio.Audio_player` class plays back audio data from `common.AudioPacket` instances.
- The `server.audio.AudioForwarder` class (if used) relays audio data between clients.

### GUI Interaction
- The `client.gui.MainFrame` class serves as the main window of the client application, integrating various GUI components.
- The `client.gui.ChatWindow` class displays chat messages and allows users to send messages.
- The `client.gui.Setting_panel` class provides a user interface for configuring client settings.

### Logging
- The `common.Logger` class is used throughout the application to log important events and errors.

### Configuration
- The `resources/config.properties` file contains configuration settings that are loaded by the application at runtime.

This design ensures a clear separation of concerns, making the application modular and easier to maintain. Each package has a specific responsibility, and the interactions between packages are well-defined.