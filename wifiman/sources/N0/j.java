package N0;

/* loaded from: classes.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f14880a;

    /* renamed from: b, reason: collision with root package name */
    private final i f14881b;

    public j(CharSequence charSequence, i iVar) {
        this.f14880a = charSequence;
        this.f14881b = iVar;
    }

    @Override // N0.f
    public int a(int i10) {
        do {
            i10 = this.f14881b.n(i10);
            if (i10 == -1 || i10 == this.f14880a.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f14880a.charAt(i10)));
        return i10;
    }

    @Override // N0.f
    public int b(int i10) {
        do {
            i10 = this.f14881b.o(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f14880a.charAt(i10 - 1)));
        return i10;
    }

    @Override // N0.f
    public int c(int i10) {
        do {
            i10 = this.f14881b.o(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f14880a.charAt(i10)));
        return i10;
    }

    @Override // N0.f
    public int d(int i10) {
        do {
            i10 = this.f14881b.n(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f14880a.charAt(i10 - 1)));
        return i10;
    }
}
