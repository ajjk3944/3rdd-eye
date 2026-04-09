package tt;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f22993d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22994a;

    /* renamed from: b, reason: collision with root package name */
    public final e f22995b;

    /* renamed from: c, reason: collision with root package name */
    public final f f22996c;

    static {
        e eVar = e.f22990a;
        f fVar = f.f22991b;
        f22993d = new g(false, eVar, fVar);
        new g(true, eVar, fVar);
    }

    public g(boolean z10, e eVar, f fVar) {
        br.l.e(eVar, "bytes");
        br.l.e(fVar, "number");
        this.f22994a = z10;
        this.f22995b = eVar;
        this.f22996c = fVar;
    }

    public final String toString() {
        StringBuilder sbT = c7.a.t("HexFormat(\n    upperCase = ");
        sbT.append(this.f22994a);
        sbT.append(",\n    bytes = BytesHexFormat(\n");
        this.f22995b.a("        ", sbT);
        sbT.append('\n');
        sbT.append("    ),");
        sbT.append('\n');
        sbT.append("    number = NumberHexFormat(");
        sbT.append('\n');
        this.f22996c.a("        ", sbT);
        sbT.append('\n');
        sbT.append("    )");
        sbT.append('\n');
        sbT.append(")");
        return sbT.toString();
    }
}
