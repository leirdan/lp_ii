package imd.models;

import java.util.HashSet;
import java.util.Set;

public class School {
    private Set<Event> events;

    public School() {
        events = new HashSet<>();
    }

    public Set<Event> getEvents() {
        return events;
    }

    public Event getEvent(int index) {
        return events.stream().toList().get(index);
    }

    public void addEvent(Event event) {
        events.add(event);
    }
}