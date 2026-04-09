package javax.jmdns.impl.constants;

/* loaded from: classes4.dex */
public enum d {
    CLASS_UNKNOWN("?", 0),
    CLASS_IN("in", 1),
    CLASS_CS("cs", 2),
    CLASS_CH("ch", 3),
    CLASS_HS("hs", 4),
    CLASS_NONE("none", 254),
    CLASS_ANY("any", 255);

    public static final int CLASS_MASK = 32767;
    public static final int CLASS_UNIQUE = 32768;
    public static final boolean NOT_UNIQUE = false;
    public static final boolean UNIQUE = true;
    private static Ej.b logger = Ej.c.i(d.class);
    private final String _externalName;
    private final int _index;

    d(String str, int i10) {
        this._externalName = str;
        this._index = i10;
    }

    public static d classForIndex(int i10) {
        int i11 = i10 & CLASS_MASK;
        for (d dVar : values()) {
            if (dVar._index == i11) {
                return dVar;
            }
        }
        logger.a("Could not find record class for index: {}", Integer.valueOf(i10));
        return CLASS_UNKNOWN;
    }

    public static d classForName(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            for (d dVar : values()) {
                if (dVar._externalName.equals(lowerCase)) {
                    return dVar;
                }
            }
        }
        logger.a("Could not find record class for name: {}", str);
        return CLASS_UNKNOWN;
    }

    public String externalName() {
        return this._externalName;
    }

    public int indexValue() {
        return this._index;
    }

    public boolean isUnique(int i10) {
        return (this == CLASS_UNKNOWN || (i10 & 32768) == 0) ? false : true;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + indexValue();
    }
}
