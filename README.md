# Starwit AI Cockpit API Data Model
This repository contains generated code, that implements the data model of project AI Cockpit. Data model is defined [here](https://github.com/KI-Cockpit/ai-cockpit-api) If you want to know more about project AI Cockpit, more details can be found at <https://www.kicockpit.eu/>.

## Supported Languages
Data model is made available in a number of languages.

### Java
Java class library is packaged in to a jar file and published at Maven Central Repository. Latest versions can be found here:
https://central.sonatype.com/artifact/de.starwit.aic/aicockpit-api/versions

You can then use library in your projects like so:
```XML
<dependency>
    <groupId>de.starwit.aic</groupId>
    <artifactId>aicockpit-api</artifactId>
    <version>0.0.9</version>
</dependency>
```
For other Java build tools, please refer to their respective documentation, to use Maven dependencies.

### Python
Add the following to your `pyproject.toml` dependencies section:\
  `starwit_aic_api = { git = "https://github.com/starwit/starwit-aic-api.git", subdirectory = "python/generated-library", tag = "0.0.9" }`

## Contact & Contribution
This project was partly funded by the government of the federal republic of Germany. It is part of a research project aiming to keep _humans in command_ and is organized by the Federal Ministry of Labour and Social Affairs.

![BMAS](doc/BMAS_Logo.svg)

# License

Software in this repository is licensed under the AGPL-3.0 license. See [license agreement](LICENSE) for more details.
