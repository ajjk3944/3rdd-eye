package z8;

/* loaded from: classes.dex */
public enum l {
    STAR(1),
    POLYGON(2);

    private final int value;

    l(int i10) {
        this.value = i10;
    }

    public static l forValue(int i10) {
        for (l lVar : values()) {
            if (lVar.value == i10) {
                return lVar;
            }
        }
        return null;
    }
}
