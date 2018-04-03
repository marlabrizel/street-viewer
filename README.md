# street-viewer

A Reagent component to render images from the Google Street View Image API based on a
user-supplied location.

## Overview

A Reagent component to render images from the [Google Street View Image API](https://developers.google.com/maps/documentation/streetview/intro) based on a
user-supplied location. 

Inspired by a similar component in the Reagent Cookbook, and originally used as
a simple demo project for my ClojureScript for JavaScript programmers workshop at
[DinosaurJS 2017](https://dinosaurjs.org/)

## Setup

#### ClojureScript Prerequisites
- Java (recommend OpenJDK 8; as of early 2018 Java 9/10 don't work well with
  other deps)
- Leiningen - `brew install leiningen` or see the [Leiningen
  docs](https://leiningen.org/) for other suggestions

#### Project Prerequisites

You will need an [API key](https://developers.google.com/maps/documentation/streetview/get-api-key) for the Google Street View Image API. You may wish
to consider restricting the key via the Google API Console in some way to prevent unauthorized usage.

To get an interactive development environment run:

    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).

Once you've done that, you can make a request to the API by navigating to
`http://localhost:3449/?api-key=MY-KEY`, where `MY-KEY` is the API key that you created for the application.

NB: This is clearly not a production-quality solution for credential management. Stated differently, please do not clone and deploy this project to a production environment without first implementing a proper credential management strategy. I am not responsible in the event that you disregard this and expose private or sensitive information to the public.

If you're curious why I use this approach here, please see the Overview section of this README.

## Following Along

Once you've run through the setup above, you can follow along with how I built
this demo by checking out the various branches in the project. Branches are
prefixed with numbers: start with 01 and work your way up in numerical order.

You will likely have to restart your server at various points, such as when
atoms are updated, in order for the compiler to acknowledge changes. If you are
new to Clojure(Script), I recommend the more tedious but potentially less
frustration-inducing approach of restarting
figwheel each time you check out a new branch.

All other errors you may notice in the browser console/compiler are intentional and
are designed to illustrate common errors one might encounter during the
development process. 

## License

Copyright © 2017 Marla Brizel

Distributed under the Eclipse Public License Version 1.0.
