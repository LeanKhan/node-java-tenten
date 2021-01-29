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
