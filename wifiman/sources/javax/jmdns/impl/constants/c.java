package javax.jmdns.impl.constants;

/* loaded from: classes4.dex */
public enum c {
    Unknown("Unknown", 65535),
    LLQ("LLQ", 1),
    UL("UL", 2),
    NSID("NSID", 3),
    Owner("Owner", 4);

    private final String _externalName;
    private final int _index;

    c(String str, int i10) {
        this._externalName = str;
        this._index = i10;
    }

    public static c resultCodeForFlags(int i10) {
        for (c cVar : values()) {
            if (cVar._index == i10) {
                return cVar;
            }
        }
        return Unknown;
    }

    public String externalName() {
        return this._externalName;
    }

    public int indexValue() {
        return this._index;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + indexValue();
    }
}
