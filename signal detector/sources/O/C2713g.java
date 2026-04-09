package o;

import android.content.Context;
import android.view.View;
import com.apm.insight.R;
import h0.C2352b;
import n.MenuC2677k;
import n.SubMenuC2666C;

/* renamed from: o.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2713g extends n.u {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f22507l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2723l f22508m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2713g(C2723l c2723l, Context context, MenuC2677k menuC2677k, View view) {
        super(context, menuC2677k, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f22508m = c2723l;
        this.f22136f = 8388613;
        C2352b c2352b = c2723l.f22552L;
        this.f22138h = c2352b;
        n.s sVar = this.i;
        if (sVar != null) {
            sVar.l(c2352b);
        }
    }

    @Override // n.u
    public final void c() {
        switch (this.f22507l) {
            case 0:
                C2723l c2723l = this.f22508m;
                c2723l.f22549I = null;
                c2723l.M = 0;
                super.c();
                break;
            default:
                C2723l c2723l2 = this.f22508m;
                MenuC2677k menuC2677k = c2723l2.f22555c;
                if (menuC2677k != null) {
                    menuC2677k.c(true);
                }
                c2723l2.f22548H = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2713g(C2723l c2723l, Context context, SubMenuC2666C subMenuC2666C, View view) {
        super(context, subMenuC2666C, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f22508m = c2723l;
        if ((subMenuC2666C.f22008O.f22101L & 32) != 32) {
            View view2 = c2723l.f22561j;
            this.f22135e = view2 == null ? (View) c2723l.f22560h : view2;
        }
        C2352b c2352b = c2723l.f22552L;
        this.f22138h = c2352b;
        n.s sVar = this.i;
        if (sVar != null) {
            sVar.l(c2352b);
        }
    }
}
