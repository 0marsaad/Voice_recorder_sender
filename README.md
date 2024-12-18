# Voice Recorder Sender

Voice Recorder Sender is a Java-based voice chat application that allows users to record, play, and send voice messages over a network using socket programming.

## Features

- **Record Audio**: Users can record their voice messages.
- **Play Audio**: Users can play back their recorded messages.
- **Send Audio**: Users can send their voice messages to other users over the network.

## Project Structure

```
Voice_Recorder_Sender/
│
├── src/                         # Main source folder
│   ├── client/                  # Client-side code
│   │   ├── audio/               # Audio handling for the client
│   │   │   ├── Audio_recorder.java
│   │   │   ├── Audio_player.java
│   │   │   ├── AudioUtils.java  # Helper methods for audio processing
│   │   ├── network/             # Network handling for the client
│   │   │   ├── ClientSocket.java
│   │   │   ├── Package_handler.java
│   │   ├── gui/                 # GUI (Frontend) for the client
│   │   │   ├── MainFrame.java
│   │   │   ├── ChatWindow.java
│   │   │   ├── Setting_panel.java
│   │   ├── MainClient.java      # Entry point for the client application
│   │
│   ├── server/                  # Server-side code
│   │   ├── audio/               # Optional: Audio handling for server if needed
│   │   │   ├── AudioForwarder.java  # Server relaying audio (optional)
│   │   ├── network/             # Network handling for the server
│   │   │   ├── ServerSocket.java
│   │   │   ├── ClientHandler.java
│   │   ├── MainServer.java      # Entry point for the server application
│   │
│   ├── common/                  # Shared utilities between client and server
│       ├── Constants.java       # Port numbers, buffer sizes, etc.
│       ├── AudioPacket.java     # Serializable audio data packets
│       ├── Logger.java          # Logging utility
│
├── lib/                         # External libraries
│ 
│
├── test/                        # Unit tests
│   ├── client/
│   │   ├── AudioRecorderTest.java
│   │   ├── ClientSocketTest.java
│   ├── server/
│   │   ├── ServerSocketTest.java
│
├── bin/                         # Compiled Java classes
├── docs/                        # Documentation
│   ├── API.md                   # API documentation
│   ├── DESIGN.md                # Design documentation
│   ├── FILE_STRUCT.md           # File structure documentation
│
├── resources/                   # Configuration files, audio samples
│   ├── config.properties
│   ├── sample.wav
│
├── .gitignore                   # Ignore file for Git
├── README.md                    # Project overview and setup instructions
├── pom.xml                      # Maven configuration (if using Maven)
└── build.gradle                 # Gradle configuration (if using Gradle)
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven or Gradle (depending on your build tool preference)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/Voice_Recorder_Sender.git
    ```
2. Navigate to the project directory:
    ```sh
    cd Voice_Recorder_Sender
    ```
3. Build the project using Maven or Gradle:
    ```sh
    mvn clean install
    ```
    or
    ```sh
    gradle build
    ```

### Usage

1. Start the server:
    ```sh
    java -cp target/Voice_Recorder_Sender-1.0-SNAPSHOT.jar server.MainServer
    ```
2. Start the client:
    ```sh
    java -cp target/Voice_Recorder_Sender-1.0-SNAPSHOT.jar client.MainClient
    ```

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

## Acknowledgements

- Java Socket Programming
- Audio Processing in Java
- Open Source Libraries
