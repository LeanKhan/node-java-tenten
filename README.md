## a test? experiment? proof of concept?

The NodeJS server renders the pages, we send the requests to the Java server
and render the results. That's basically it.

## What you need:

1. Nodejs
2. Java 11 (jdk sha when you open vscode it will tell you to download it)
3. VSCode
4. The VSCode Java Extension Pack
5. Maven (not necassary tbh)
6. Download thes Jackson JAR files and save them in something like: c://dev/jarDownloads/\*.jar
7. Add the packages to your workspace from VSCode...
8. NPM

I think that's all you need. I will update this sha...

To get started:

1. Fork the repo or something
2. Get it on your local machine
3. Get everything you don't have in "What you need". Pay attention to the versions lol
4. Open 2 vscode windows. One for `Client` and the other for `SocketServer` (if you want but I found this to be optimal for now)
5. Run `npm install` from the Client directory
6. After the Node modules have installed, go to the Java server and click the play button besides SocketServer in the 'Java Projects' panel. (it's bottom left)
7. If it runs successfully you should see 'waiting for connection...'
8. THEN you run the Nodejs server by doing `node server.js` from the Client directory. The order is important. Always start the Java before the Node.
9. Go to `localhost:3000`
10. Voila! It _should_ work lol

- LeanKhan

links:

- https://gist.github.com/mpj/a979ded460dd52eb536a => my lucky break lol. I tried other Java socket server implementations but this one just worked and they showed me how to connect the Nodejs client. Awesome. grateful I am

- More about Nodejs NET module https://www.javatpoint.com/nodejs-net

- https://stackoverflow.com/questions/47359632/nodejs-getting-response-from-net-socket-write the comment under the accepted answer was a game changer!

- https://github.com/redhat-developer/vscode-java/wiki/JDK-Requirements#java.configuration.runtimes => about redhat java vscode extension

- about jackson json package => https://blog.codota.com/how-to-convert-a-java-object-into-a-json-string/

- The jackson package homepage => https://github.com/FasterXML/jackson

- about jackson installation NOTE: you don't need to do the maven stuff, just download the .jar files from Maven (link below) and add them to your project from vscode... => http://tutorials.jenkov.com/java-json/jackson-installation.html

- jackson packages on Maven NOTE download all three: annotation, core and databindind => https://search.maven.org/search?q=g:com.fasterxml.jackson.core

- very good guide on using java on vscode RECOMMENDED READING => https://blog.usejournal.com/visual-studio-code-for-java-the-ultimate-guide-2019-8de7d2b59902
  NOTE=> when you get to the part about adding package, you don't need to make a .classpath file just add the packages form vscode gan.

- some stuff about Java Socket servers for more knowledge and shii => https://www.codejava.net/java-se/networking/java-socket-server-examples-tcp-ip

- the java server might be stuck waiting for the end of the clients request => https://stackoverflow.com/questions/55870574/cant-send-data-from-java-socket-server-to-nodejs-client
  NOTE: the end of every request from the nodejs server is a new line '\n' because that's how Java will know the line has ended! If there's no new line it will think more data is coming and will hang...

- some oracle java scoket shii (might be useful) => https://docs.oracle.com/javase/tutorial/networking/sockets/clientServer.html
