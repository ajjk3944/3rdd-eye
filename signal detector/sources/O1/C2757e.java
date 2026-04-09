package o1;

import G.m;

/* renamed from: o1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2757e extends m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2757e(int i) {
        super(2);
        this.f22678b = i;
    }

    public final InterfaceC2759g l() {
        switch (this.f22678b) {
            case 0:
                return new C2756d(this);
            default:
                return new i(this);
        }
    }
}
