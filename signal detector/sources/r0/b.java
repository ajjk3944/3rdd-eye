package R0;

import C0.k;
import F0.f;
import R.O;
import U4.m;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC0284f;
import androidx.lifecycle.C0280b;
import androidx.lifecycle.C0282d;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.InterfaceC0283e;
import androidx.lifecycle.InterfaceC0296s;
import androidx.lifecycle.InterfaceC0297t;
import androidx.lifecycle.InterfaceC0298u;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import q5.i;

/* loaded from: classes.dex */
public final class b implements InterfaceC0296s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3374a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3375b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3376c;

    public /* synthetic */ b(Object obj, int i, Object obj2) {
        this.f3374a = i;
        this.f3375b = obj;
        this.f3376c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0296s
    public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = this.f3374a;
        Object obj = this.f3375b;
        Object obj2 = this.f3376c;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                m mVar = (m) obj2;
                if (mVar.f3750b.M()) {
                    return;
                }
                interfaceC0298u.j().f(this);
                FrameLayout frameLayout = (FrameLayout) eVar.itemView;
                WeakHashMap weakHashMap = O.f3270a;
                if (frameLayout.isAttachedToWindow()) {
                    mVar.e(eVar);
                    return;
                }
                return;
            case 1:
                if (enumC0291m == EnumC0291m.ON_DESTROY) {
                    ((Handler) obj).removeCallbacks((k) obj2);
                    interfaceC0298u.j().f(this);
                    return;
                }
                return;
            case 2:
                InterfaceC0283e interfaceC0283e = (InterfaceC0283e) obj;
                switch (AbstractC0284f.f5241a[enumC0291m.ordinal()]) {
                    case 1:
                        interfaceC0283e.b(interfaceC0298u);
                        break;
                    case 2:
                        interfaceC0283e.onStart(interfaceC0298u);
                        break;
                    case 3:
                        interfaceC0283e.a(interfaceC0298u);
                        break;
                    case 4:
                        interfaceC0283e.e(interfaceC0298u);
                        break;
                    case 5:
                        interfaceC0283e.onStop(interfaceC0298u);
                        break;
                    case 6:
                        interfaceC0283e.onDestroy(interfaceC0298u);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0296s interfaceC0296s = (InterfaceC0296s) obj2;
                if (interfaceC0296s != null) {
                    interfaceC0296s.d(interfaceC0298u, enumC0291m);
                    return;
                }
                return;
            case 3:
                if (enumC0291m == EnumC0291m.ON_START) {
                    ((C0300w) obj).f(this);
                    ((f) obj2).g();
                    return;
                }
                return;
            default:
                HashMap map = ((C0280b) obj2).f5234a;
                C0280b.a((List) map.get(enumC0291m), interfaceC0298u, enumC0291m, obj);
                C0280b.a((List) map.get(EnumC0291m.ON_ANY), interfaceC0298u, enumC0291m, obj);
                return;
        }
    }

    public b(InterfaceC0283e interfaceC0283e, InterfaceC0296s interfaceC0296s) {
        this.f3374a = 2;
        i.e(interfaceC0283e, "defaultLifecycleObserver");
        this.f3375b = interfaceC0283e;
        this.f3376c = interfaceC0296s;
    }

    public b(InterfaceC0297t interfaceC0297t) {
        this.f3374a = 4;
        this.f3375b = interfaceC0297t;
        C0282d c0282d = C0282d.f5238c;
        Class<?> cls = interfaceC0297t.getClass();
        C0280b c0280b = (C0280b) c0282d.f5239a.get(cls);
        this.f3376c = c0280b == null ? c0282d.a(cls, null) : c0280b;
    }

    public b(m mVar, e eVar) {
        this.f3374a = 0;
        this.f3376c = mVar;
        this.f3375b = eVar;
    }
}
