package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ev3 extends mr3 {
    public final String a;
    public final i04 b;

    public ev3(String str, i04 i04Var) {
        this.a = str;
        this.b = i04Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return this.b != i04.RAW;
    }

    public final String toString() {
        int iOrdinal = this.b.ordinal();
        return "(typeUrl=" + this.a + ", outputPrefixType=" + (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK") + ")";
    }
}
