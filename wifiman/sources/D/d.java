package D;

import C0.AbstractC2538s;
import C0.r;
import E0.AbstractC2634l;
import E0.InterfaceC2632j;
import Yg.J;
import android.graphics.Rect;
import android.view.View;
import dh.InterfaceC5380e;
import l0.C6533i;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class d {

    static final class a implements D.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2632j f2763a;

        a(InterfaceC2632j interfaceC2632j) {
            this.f2763a = interfaceC2632j;
        }

        @Override // D.a
        public final Object r1(r rVar, InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
            View viewA = AbstractC2634l.a(this.f2763a);
            long jE = AbstractC2538s.e(rVar);
            C6533i c6533i = (C6533i) interfaceC6824a.invoke();
            C6533i c6533iX = c6533i != null ? c6533i.x(jE) : null;
            if (c6533iX != null) {
                viewA.requestRectangleOnScreen(d.c(c6533iX), false);
            }
            return J.f24997a;
        }
    }

    public static final D.a b(InterfaceC2632j interfaceC2632j) {
        return new a(interfaceC2632j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(C6533i c6533i) {
        return new Rect((int) c6533i.k(), (int) c6533i.n(), (int) c6533i.l(), (int) c6533i.e());
    }
}
