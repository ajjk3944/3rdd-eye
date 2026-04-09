package F3;

/* loaded from: classes.dex */
final class J extends N {

    /* renamed from: a, reason: collision with root package name */
    private String f5861a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5862b;

    /* renamed from: c, reason: collision with root package name */
    private int f5863c;

    /* renamed from: d, reason: collision with root package name */
    private byte f5864d;

    J() {
    }

    @Override // F3.N
    public final N a(boolean z10) {
        this.f5862b = true;
        this.f5864d = (byte) (1 | this.f5864d);
        return this;
    }

    @Override // F3.N
    public final N b(int i10) {
        this.f5863c = 1;
        this.f5864d = (byte) (this.f5864d | 2);
        return this;
    }

    @Override // F3.N
    public final O c() {
        String str;
        if (this.f5864d == 3 && (str = this.f5861a) != null) {
            return new L(str, this.f5862b, this.f5863c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f5861a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f5864d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f5864d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final N d(String str) {
        this.f5861a = str;
        return this;
    }
}
