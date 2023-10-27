# design_patterns

## Overview

- The beans layer (e.g. Employee) will interact directly with the database.
- The service layer contains business logic and interacts with the model.
- The view is responsible for interactions with the client, e.g. UI, REST API.

## DP1 - Singleton

- Restrict the client for their own good

## DP2 - Factory

- Don't touch DAO

## DP3 - Prototype

- The new object is slightly different from the existing one
- if only the state is different, then we can create the instances with the appropriate state beforehand and
then clone them whenever we want.

