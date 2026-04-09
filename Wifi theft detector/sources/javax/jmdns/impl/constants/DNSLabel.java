package javax.jmdns.impl.constants;

/* loaded from: classes4.dex */
public enum DNSLabel {
    Unknown("", 128),
    Standard("standard label", 0),
    Compressed("compressed label", 192),
    Extended("extended label", 64);

    static final int LABEL_MASK = 192;
    static final int LABEL_NOT_MASK = 63;
    private final String _externalName;
    private final int _index;

    DNSLabel(String str, int i10) {
        this._externalName = str;
        this._index = i10;
    }

    public static DNSLabel labelForByte(int i10) {
        int i11 = i10 & 192;
        for (DNSLabel dNSLabel : values()) {
            if (dNSLabel._index == i11) {
                return dNSLabel;
            }
        }
        return Unknown;
    }

    public static int labelValue(int i10) {
        return i10 & 63;
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
