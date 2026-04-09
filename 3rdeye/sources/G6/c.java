package G6;

import y9.C5826h;

/* compiled from: RegexValidator.kt */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final C5826h f1934b;

    public c(C5826h c5826h, boolean z10) {
        super(z10);
        this.f1934b = c5826h;
    }

    @Override // G6.a
    public final boolean a(String str) {
        return (this.f1932a && str.length() == 0) || this.f1934b.a(str);
    }
}
