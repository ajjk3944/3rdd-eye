package javax.jmdns.impl.constants;

/* loaded from: classes4.dex */
public enum DNSOptionCode {
    Unknown("Unknown", 65535),
    LLQ("LLQ", 1),
    UL("UL", 2),
    NSID("NSID", 3),
    Owner("Owner", 4);

    private final String _externalName;
    private final int _index;

    DNSOptionCode(String str, int i10) {
        this._externalName = str;
        this._index = i10;
    }

    public static DNSOptionCode resultCodeForFlags(int i10) {
        for (DNSOptionCode dNSOptionCode : values()) {
            if (dNSOptionCode._index == i10) {
                return dNSOptionCode;
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
