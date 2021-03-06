# randomizer

<div align="center">

[![Build Status](https://travis-ci.org/astrapi69/randomizer.svg?branch=develop)](https://travis-ci.org/astrapi69/randomizer) 
[![Coverage Status](https://coveralls.io/repos/github/astrapi69/randomizer/badge.svg?branch=develop)](https://coveralls.io/github/astrapi69/randomizer?branch=develop) 
[![Open Issues](https://img.shields.io/github/issues/astrapi69/randomizer.svg?style=flat)](https://github.com/astrapi69/randomizer/issues) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/randomizer/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/randomizer-core)
[![Javadocs](http://www.javadoc.io/badge/de.alpharogroup/randomizer.svg)](http://www.javadoc.io/doc/de.alpharogroup/randomizer-core)
[![MIT license](http://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](http://opensource.org/licenses/MIT)

</div>

Generate random data 

## License

The source code comes under the liberal MIT License, making randomizer great for all types of applications.

## Javadoc

[![Javadoc](https://javadoc-emblem.rhcloud.com/doc/de.alpharogroup/randomizer/badge.svg)](http://www.javadoc.io/doc/de.alpharogroup/randomizer-core) randomizer-core

[![Javadoc](https://javadoc-emblem.rhcloud.com/doc/de.alpharogroup/randomizer/badge.svg)](http://www.javadoc.io/doc/de.alpharogroup/randomizer-api) randomizer-api

[![Javadoc](https://javadoc-emblem.rhcloud.com/doc/de.alpharogroup/randomizer/badge.svg)](http://www.javadoc.io/doc/de.alpharogroup/randomizer-data) randomizer-data

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~randomizer~~~) for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core functionality of randomizer:

Than you can add the dependency to your dependencies:


	<properties>
			...
		<!-- RANDOMIZER versions -->
		<randomizer.version>5.6</randomizer.version>
		<randomizer-api.version>${randomizer.version}</randomizer-api.version>
		<randomizer-core.version>${randomizer.version}</randomizer-core.version>
		<randomizer-data.version>${randomizer.version}</randomizer-data.version>
			...
	</properties>
	
You can add the following dependencies to your project for use the functionality of randomizer.

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of randomizer-api:

		<dependencies>
			...
			<!-- RANDOMIZER DEPENDENCY -->
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>randomizer-api</artifactId>
				<version>${randomizer-api.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of randomizer-core:

		<dependencies>
			...
			<!-- RANDOMIZER DEPENDENCY -->
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>randomizer-core</artifactId>
				<version>${randomizer-core.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of randomizer-data:

		<dependencies>
			...
			<!-- RANDOMIZER DEPENDENCY -->
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>randomizer-data</artifactId>
				<version>${randomizer-data.version}</version>
			</dependency>
			...
		</dependencies>

## Semantic Versioning

The versions of randomizer are maintained with the Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning you can visit the [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Semantic-Versioning).

## Want to Help and improve it? ###

The source code for randomizer are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/randomizer/fork](https://github.com/astrapi69/randomizer/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/randomizer/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developer

Do not hesitate to contact the randomizer developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/astrapi69/randomizer/issues).

## Note

No animals were harmed in the making of this library.

# Donations

This project is kept as an open source product and relies on contributions to remain being developed. 
If you like this project, please consider a donation through paypal: <a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=GVBTWLRAZ7HB8" target="_blank">
<img src="https://www.paypalobjects.com/en_US/GB/i/btn/btn_donateCC_LG.gif" alt="PayPal this" title="PayPal – The safer, easier way to pay online!" border="0" />
</a>

or over bitcoin or bitcoin-cash with:

1Jzso5h7U82QCNmgxxSCya1yUK7UVcSXsW

or over ether with:

0xaB6EaE10F352268B0CA672Dd6e999C86344D49D8

or over flattr: <a href="http://flattr.com/thing/4152938/astrapi69randomizer-on-GitHub" target="_blank">
<img src="http://api.flattr.com/button/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0" />
</a>

# Similar projects

Here is a list of awesome projects:

 * [random-beans](https://github.com/benas/random-beans) Because life is too short to generate random Java beans by hand..

## Credits

|Travis CI|
|:-:|
|![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)|
|Many thanks to [Travis CI](https://travis-ci.org) for providing a free continuous integration service for open source projects.|
