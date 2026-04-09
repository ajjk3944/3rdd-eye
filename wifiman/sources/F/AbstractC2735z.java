package F;

import android.view.KeyEvent;
import w0.AbstractC8250d;
import w0.C8247a;

/* renamed from: F.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2735z {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2733x f5638a = new a();

    /* renamed from: F.z$a */
    public static final class a implements InterfaceC2733x {
        a() {
        }

        @Override // F.InterfaceC2733x
        public EnumC2731v a(KeyEvent keyEvent) {
            EnumC2731v enumC2731v = null;
            if (AbstractC8250d.f(keyEvent) && AbstractC8250d.d(keyEvent)) {
                long jA = AbstractC8250d.a(keyEvent);
                I i10 = I.f4888a;
                if (C8247a.p(jA, i10.i())) {
                    enumC2731v = EnumC2731v.SELECT_LINE_LEFT;
                } else if (C8247a.p(jA, i10.j())) {
                    enumC2731v = EnumC2731v.SELECT_LINE_RIGHT;
                } else if (C8247a.p(jA, i10.k())) {
                    enumC2731v = EnumC2731v.SELECT_HOME;
                } else if (C8247a.p(jA, i10.h())) {
                    enumC2731v = EnumC2731v.SELECT_END;
                }
            } else if (AbstractC8250d.d(keyEvent)) {
                long jA2 = AbstractC8250d.a(keyEvent);
                I i11 = I.f4888a;
                if (C8247a.p(jA2, i11.i())) {
                    enumC2731v = EnumC2731v.LINE_LEFT;
                } else if (C8247a.p(jA2, i11.j())) {
                    enumC2731v = EnumC2731v.LINE_RIGHT;
                } else if (C8247a.p(jA2, i11.k())) {
                    enumC2731v = EnumC2731v.HOME;
                } else if (C8247a.p(jA2, i11.h())) {
                    enumC2731v = EnumC2731v.END;
                }
            }
            return enumC2731v == null ? AbstractC2734y.b().a(keyEvent) : enumC2731v;
        }
    }

    public static final InterfaceC2733x a() {
        return f5638a;
    }
}
