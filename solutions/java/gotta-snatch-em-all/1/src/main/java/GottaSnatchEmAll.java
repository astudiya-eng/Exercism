import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
       return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        
        Set<String> result = new HashSet<>(collections.get(0));

        for (Set<String> friendCollection : collections) {
            result.retainAll(friendCollection);
        }
        return result;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>(collections.get(0));

        for (Set<String> friendCollection : collections) {
            result.addAll(friendCollection);
        }
        return result;
    }
}
