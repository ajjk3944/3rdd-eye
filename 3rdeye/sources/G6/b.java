package G6;

import K6.P0;

/* compiled from: ExpressionValidator.kt */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public final P0 f1933b;

    public b(boolean z10, P0 p02) {
        super(z10);
        this.f1933b = p02;
    }

    @Override // G6.a
    public final boolean a(String str) {
        return (this.f1932a && str.length() == 0) || ((Boolean) this.f1933b.invoke()).booleanValue();
    }
}
