package km;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f28456a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28457b;

    public s(v0 v0Var) {
        StringBuilder sb2 = new StringBuilder("HTTP ");
        rl.z zVar = v0Var.f28510a;
        int i4 = zVar.f33207d;
        sb2.append(i4);
        sb2.append(" ");
        String str = zVar.f33206c;
        sb2.append(str);
        super(sb2.toString());
        this.f28456a = i4;
        this.f28457b = str;
    }
}
