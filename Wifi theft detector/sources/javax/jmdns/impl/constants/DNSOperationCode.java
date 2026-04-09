package javax.jmdns.impl.constants;

/* loaded from: classes4.dex */
public enum DNSOperationCode {
    Query("Query", 0),
    IQuery("Inverse Query", 1),
    Status("Status", 2),
    Unassigned("Unassigned", 3),
    Notify("Notify", 4),
    Update("Update", 5);

    static final int OpCode_MASK = 30720;
    private final String _externalName;
    private final int _index;

    DNSOperationCode(String str, int i10) {
        this._externalName = str;
        this._index = i10;
    }

    public static DNSOperationCode operationCodeForFlags(int i10) {
        int i11 = (i10 & 30720) >> 11;
        for (DNSOperationCode dNSOperationCode : values()) {
            if (dNSOperationCode._index == i11) {
                return dNSOperationCode;
            }
        }
        return Unassigned;
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
