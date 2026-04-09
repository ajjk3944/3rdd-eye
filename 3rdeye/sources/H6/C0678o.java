package H6;

import b9.C1992A;
import p9.InterfaceC5480a;

/* compiled from: Div2View.kt */
/* renamed from: H6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678o extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2215g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0675l f2216h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0678o(C0675l c0675l, int i) {
        super(0);
        this.f2215g = i;
        this.f2216h = c0675l;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        switch (this.f2215g) {
            case 0:
                return this.f2216h.getDiv2Component$div_release().b();
            default:
                this.f2216h.getHistogramReporter().b();
                return C1992A.f18074a;
        }
    }
}
