package i;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public Object f11119a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11120b;

    public x(Context context) {
        this.f11119a = context;
    }

    public void c() {
        a5.s sVar = (a5.s) this.f11119a;
        if (sVar != null) {
            try {
                ((a0) this.f11120b).G.unregisterReceiver(sVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f11119a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i10);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof m3.a)) {
            return menuItem;
        }
        m3.a aVar = (m3.a) menuItem;
        if (((u.i0) this.f11120b) == null) {
            this.f11120b = new u.i0(0);
        }
        MenuItem menuItem2 = (MenuItem) ((u.i0) this.f11120b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        o.t tVar = new o.t((Context) this.f11119a, aVar);
        ((u.i0) this.f11120b).put(aVar, tVar);
        return tVar;
    }

    public int[] h(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = (int[]) this.f11120b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public String i() {
        String str = (String) this.f11119a;
        if (str != null) {
            return str;
        }
        br.l.l("text");
        throw null;
    }

    public abstract void j();

    public abstract int[] k(int i10);

    public void l() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((a5.s) this.f11119a) == null) {
            this.f11119a = new a5.s(5, this);
        }
        ((a0) this.f11120b).G.registerReceiver((a5.s) this.f11119a, intentFilterD);
    }

    public x() {
        this.f11120b = new int[2];
    }

    public x(a0 a0Var) {
        this.f11120b = a0Var;
    }
}
