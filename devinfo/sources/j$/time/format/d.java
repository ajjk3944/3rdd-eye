package j$.time.format;

/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final char f26130a;

    public d(char c9) {
        this.f26130a = c9;
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb2) {
        sb2.append(this.f26130a);
        return true;
    }

    public final String toString() {
        char c9 = this.f26130a;
        if (c9 == '\'') {
            return "''";
        }
        return "'" + c9 + "'";
    }
}
