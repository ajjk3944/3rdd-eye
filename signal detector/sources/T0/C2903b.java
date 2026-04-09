package t0;

import A3.y;
import T2.g;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import q0.InterfaceC2791d;
import q0.InterfaceC2797j;
import q0.v;
import q0.z;
import q5.i;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2903b implements InterfaceC2797j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f23527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f23528b;

    public C2903b(WeakReference weakReference, z zVar) {
        this.f23527a = weakReference;
        this.f23528b = zVar;
    }

    @Override // q0.InterfaceC2797j
    public final void a(z zVar, v vVar, Bundle bundle) {
        i.e(vVar, "destination");
        y yVar = (y) this.f23527a.get();
        if (yVar == null) {
            this.f23528b.f23069p.remove(this);
            return;
        }
        if (vVar instanceof InterfaceC2791d) {
            return;
        }
        Menu menu = yVar.getMenu();
        i.d(menu, "view.menu");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            if (item == null) {
                IllegalStateException illegalStateException = new IllegalStateException("getItem(index)".concat(" must not be null"));
                i.f(illegalStateException, i.class.getName());
                throw illegalStateException;
            }
            if (g.u(vVar, item.getItemId())) {
                item.setChecked(true);
            }
        }
    }
}
