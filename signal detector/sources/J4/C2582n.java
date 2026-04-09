package j4;

import g4.InterfaceC2336A;
import java.util.Calendar;
import java.util.GregorianCalendar;
import n4.C2689a;

/* renamed from: j4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2582n implements InterfaceC2336A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21434b;

    public /* synthetic */ C2582n(int i, Object obj) {
        this.f21433a = i;
        this.f21434b = obj;
    }

    @Override // g4.InterfaceC2336A
    public final g4.z a(g4.m mVar, C2689a c2689a) {
        switch (this.f21433a) {
            case 0:
                if (c2689a.f22327a == Number.class) {
                    return (C2583o) this.f21434b;
                }
                return null;
            case 1:
                if (c2689a.f22327a == Object.class) {
                    return new C2584p(mVar, (g4.x) this.f21434b);
                }
                return null;
            default:
                Class cls = c2689a.f22327a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (O) this.f21434b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f21433a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((O) this.f21434b) + "]";
            default:
                return super.toString();
        }
    }
}
