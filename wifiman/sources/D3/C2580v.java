package D3;

/* renamed from: D3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2580v extends A {

    /* renamed from: a, reason: collision with root package name */
    private String f2878a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2879b;

    /* renamed from: c, reason: collision with root package name */
    private int f2880c;

    /* renamed from: d, reason: collision with root package name */
    private byte f2881d;

    C2580v() {
    }

    @Override // D3.A
    public final A a(boolean z10) {
        this.f2879b = true;
        this.f2881d = (byte) (1 | this.f2881d);
        return this;
    }

    @Override // D3.A
    public final A b(int i10) {
        this.f2880c = 1;
        this.f2881d = (byte) (this.f2881d | 2);
        return this;
    }

    @Override // D3.A
    public final B c() {
        String str;
        if (this.f2881d == 3 && (str = this.f2878a) != null) {
            return new x(str, this.f2879b, this.f2880c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f2878a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f2881d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f2881d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final A d(String str) {
        this.f2878a = "common";
        return this;
    }
}
