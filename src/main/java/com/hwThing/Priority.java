package com.hwThing;

public enum Priority {
    High(3),
    Medium(2),
    Low(1);

    private final int importance;

    Priority(int importance) {
        this.importance = importance;
    }

    public int getImportance() {
        return importance;
    }


}
