package me;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public f1 f29109a;

    /* renamed from: b, reason: collision with root package name */
    public String f29110b;

    /* renamed from: c, reason: collision with root package name */
    public String f29111c;

    /* renamed from: d, reason: collision with root package name */
    public long f29112d;

    /* renamed from: e, reason: collision with root package name */
    public byte f29113e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.f29113e == 1 && (f1Var = this.f29109a) != null && (str = this.f29110b) != null && (str2 = this.f29111c) != null) {
            return new e1(f1Var, str, str2, this.f29112d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f29109a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f29110b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f29111c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f29113e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }
}
