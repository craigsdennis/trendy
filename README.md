# Trendy

Welcome to the trendiest application you've ever seen.  The goal here is to dynamically discover
tech trends and then evolve the application to use them.

## Initial approach
The domain probably looks something similar to this...

* TrendProfile
    * name
    * Searches (Search)
        * provider
        * SearchRuns
            * search since (start all, then grow)
            * total results
            * SearchResults (SearchResult)
                * URL (unique)
                * body (might not be legal?)
                * keywords (helper, using extraction)
    * SubTrends (TrendProfile)

A trend profile is user created and let's assume it is something *Java*.  More providers will be 
added, probably going to start with the aggregator [Indeed.com](http://indeed.com).  An initial exhaustive search
 will run and gather results.  After that a scheduled daily run will get the new information.  Keywords
 will create new trends and recursion will kill us all.