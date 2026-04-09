package th;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.liuzh.deviceinfo.R;
import p.z2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements e4.n {

    /* renamed from: a, reason: collision with root package name */
    public final f f34620a;

    /* renamed from: b, reason: collision with root package name */
    public final q f34621b;

    /* renamed from: c, reason: collision with root package name */
    public z2 f34622c;

    public i(f fVar, q qVar) {
        nk.k.e(qVar, "viewModel");
        this.f34620a = fVar;
        this.f34621b = qVar;
    }

    @Override // e4.n
    public final boolean a(MenuItem menuItem) {
        nk.k.e(menuItem, "menuItem");
        return false;
    }

    @Override // e4.n
    public final void c(Menu menu, MenuInflater menuInflater) {
        nk.k.e(menu, "menu");
        nk.k.e(menuInflater, "menuInflater");
        MenuItem menuItemAdd = menu.add(0, 2, 1, R.string.search);
        menuItemAdd.setIcon(R.drawable.ic_search);
        f fVar = this.f34620a;
        z2 z2Var = new z2(fVar.W());
        z2Var.setIconifiedByDefault(true);
        z2Var.setIconified(true);
        z2Var.setQueryHint(fVar.u(R.string.search_name_or_pkg));
        z2Var.setOnQueryTextListener(new o.e(18, this));
        z2Var.setOnCloseListener(new lf.e(14, this));
        this.f34622c = z2Var;
        menuItemAdd.setActionView(z2Var);
        menuItemAdd.setShowAsActionFlags(2);
    }

    @Override // e4.n
    public final /* synthetic */ void b(Menu menu) {
    }

    @Override // e4.n
    public final /* synthetic */ void d(Menu menu) {
    }
}
