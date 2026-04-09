package b5;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j0 implements e4.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1827b;

    public /* synthetic */ j0(int i4, Object obj) {
        this.f1826a = i4;
        this.f1827b = obj;
    }

    @Override // e4.n
    public final boolean a(MenuItem menuItem) {
        switch (this.f1826a) {
            case 0:
                return ((u0) this.f1827b).p();
            default:
                nk.k.e(menuItem, "menuItem");
                ej.i iVar = (ej.i) this.f1827b;
                nj.b bVar = iVar.f23506b0;
                if (bVar != null && bVar.d(menuItem)) {
                    return true;
                }
                if (menuItem.getItemId() != 16908332) {
                    return false;
                }
                iVar.i0();
                return true;
        }
    }

    @Override // e4.n
    public final void b(Menu menu) {
        switch (this.f1826a) {
            case 0:
                ((u0) this.f1827b).q();
                break;
        }
    }

    @Override // e4.n
    public final void c(Menu menu, MenuInflater menuInflater) {
        switch (this.f1826a) {
            case 0:
                ((u0) this.f1827b).k();
                break;
            default:
                nk.k.e(menu, "menu");
                nk.k.e(menuInflater, "menuInflater");
                nj.b bVar = ((ej.i) this.f1827b).f23506b0;
                if (bVar != null) {
                    bVar.b(menu, menuInflater);
                    break;
                }
                break;
        }
    }

    @Override // e4.n
    public final void d(Menu menu) {
        switch (this.f1826a) {
            case 0:
                ((u0) this.f1827b).t();
                break;
        }
    }

    private final /* synthetic */ void e(Menu menu) {
    }

    private final /* synthetic */ void f(Menu menu) {
    }
}
