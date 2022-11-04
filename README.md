# AssociationAssignment-Questions

# 1.Which method on the session object can be used to remove an object from the cache?

Some useful methods:

    Session.evict(): to remove the cached/stored entity.
    refresh(): method to refresh the cache.
    clear(): method to remove all the entities from the cache.

# 2.What does @transactional annotation do?

The @Transactional annotation is the metadata that specifies the semantics of the transactions on a method. 
Follows the ACID properties of database.


