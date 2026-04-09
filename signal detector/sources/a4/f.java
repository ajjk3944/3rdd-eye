package a4;

import b4.InterfaceC0353r;

/* loaded from: classes.dex */
public final class f implements InterfaceC0353r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4692a;

    /* renamed from: b, reason: collision with root package name */
    public final J2.i f4693b;

    public /* synthetic */ f(J2.i iVar, int i) {
        this.f4692a = i;
        this.f4693b = iVar;
    }

    @Override // b4.InterfaceC0353r
    public final Object a() {
        switch (this.f4692a) {
            case 0:
                return this.f4693b.f2065b;
            default:
                v vVarE = v.e(this.f4693b.f2065b);
                if (vVarE != null) {
                    return vVarE;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
