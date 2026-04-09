package javax.jmdns.impl.constants;

/* loaded from: classes4.dex */
public enum b {
    Unknown("", 128),
    Standard("standard label", 0),
    Compressed("compressed label", LABEL_MASK),
    Extended("extended label", 64);

    static final int LABEL_MASK = 192;
    static final int LABEL_NOT_MASK = 63;
    private final String _externalName;
    private final int _index;

    b(String str, int i10) {
        this._externalName = str;
        this._index = i10;
    }

    public static b labelForByte(int i10) {
        int i11 = i10 & LABEL_MASK;
        for (b bVar : values()) {
            if (bVar._index == i11) {
                return bVar;
            }
        }
        return Unknown;
    }

    public static int labelValue(int i10) {
        return i10 & LABEL_NOT_MASK;
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
