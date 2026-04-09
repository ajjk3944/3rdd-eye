package o;

import n.InterfaceC5344f;
import o.C5402u;

/* compiled from: AppCompatSpinner.java */
/* renamed from: o.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5401t extends AbstractViewOnTouchListenerC5378F {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C5402u.e f44712k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C5402u f44713l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5401t(C5402u c5402u, C5402u c5402u2, C5402u.e eVar) {
        super(c5402u2);
        this.f44713l = c5402u;
        this.f44712k = eVar;
    }

    @Override // o.AbstractViewOnTouchListenerC5378F
    public final InterfaceC5344f b() {
        return this.f44712k;
    }

    @Override // o.AbstractViewOnTouchListenerC5378F
    public final boolean c() {
        C5402u c5402u = this.f44713l;
        if (c5402u.getInternalPopup().a()) {
            return true;
        }
        c5402u.f44720g.l(c5402u.getTextDirection(), c5402u.getTextAlignment());
        return true;
    }
}
