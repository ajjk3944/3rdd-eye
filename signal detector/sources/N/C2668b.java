package n;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import o.AbstractViewOnTouchListenerC2737s0;
import o.C2713g;
import o.C2715h;
import o.C2719j;
import o.C2723l;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2668b extends AbstractViewOnTouchListenerC2737s0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22024j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f22025k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2668b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f22025k = actionMenuItemView;
    }

    @Override // o.AbstractViewOnTouchListenerC2737s0
    public final InterfaceC2664A b() {
        C2713g c2713g;
        switch (this.f22024j) {
            case 0:
                AbstractC2669c abstractC2669c = ((ActionMenuItemView) this.f22025k).f4768m;
                if (abstractC2669c == null || (c2713g = ((C2715h) abstractC2669c).f22511a.f22549I) == null) {
                    return null;
                }
                return c2713g.a();
            default:
                C2713g c2713g2 = ((C2719j) this.f22025k).f22536d.f22548H;
                if (c2713g2 == null) {
                    return null;
                }
                return c2713g2.a();
        }
    }

    @Override // o.AbstractViewOnTouchListenerC2737s0
    public final boolean c() {
        InterfaceC2664A interfaceC2664AB;
        switch (this.f22024j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f22025k;
                InterfaceC2676j interfaceC2676j = actionMenuItemView.f4766k;
                return interfaceC2676j != null && interfaceC2676j.c(actionMenuItemView.f4764h) && (interfaceC2664AB = b()) != null && interfaceC2664AB.a();
            default:
                ((C2719j) this.f22025k).f22536d.n();
                return true;
        }
    }

    @Override // o.AbstractViewOnTouchListenerC2737s0
    public boolean d() {
        switch (this.f22024j) {
            case 1:
                C2723l c2723l = ((C2719j) this.f22025k).f22536d;
                if (c2723l.f22550J != null) {
                    return false;
                }
                c2723l.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2668b(C2719j c2719j, C2719j c2719j2) {
        super(c2719j2);
        this.f22025k = c2719j;
    }
}
