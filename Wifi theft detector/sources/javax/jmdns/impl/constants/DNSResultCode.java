package javax.jmdns.impl.constants;

/* loaded from: classes4.dex */
public enum DNSResultCode {
    Unknown("Unknown", 65535),
    NoError("No Error", 0),
    FormErr("Format Error", 1),
    ServFail("Server Failure", 2),
    NXDomain("Non-Existent Domain", 3),
    NotImp("Not Implemented", 4),
    Refused("Query Refused", 5),
    YXDomain("Name Exists when it should not", 6),
    YXRRSet("RR Set Exists when it should not", 7),
    NXRRSet("RR Set that should exist does not", 8),
    NotAuth("Server Not Authoritative for zone", 9),
    NotZone("NotZone Name not contained in zone", 10);

    static final int ExtendedRCode_MASK = 255;
    static final int RCode_MASK = 15;
    private final String _externalName;
    private final int _index;

    DNSResultCode(String str, int i10) {
        this._externalName = str;
        this._index = i10;
    }

    public static DNSResultCode resultCodeForFlags(int i10) {
        int i11 = i10 & 15;
        for (DNSResultCode dNSResultCode : values()) {
            if (dNSResultCode._index == i11) {
                return dNSResultCode;
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

    public static DNSResultCode resultCodeForFlags(int i10, int i11) {
        int i12 = (i10 & 15) | ((i11 >> 28) & 255);
        for (DNSResultCode dNSResultCode : values()) {
            if (dNSResultCode._index == i12) {
                return dNSResultCode;
            }
        }
        return Unknown;
    }
}
