package defpackage;

import android.database.Observable;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bo0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((po0) ((Observable) this).mObservers.get(size)).a;
            recyclerView.i(null);
            recyclerView.k0.f = true;
            recyclerView.U(true);
            if (!recyclerView.i.j()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i, int i2, Preference preference) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            po0 po0Var = (po0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = po0Var.a;
            recyclerView.i(null);
            fw3 fw3Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) fw3Var.h;
            if (i2 >= 1) {
                arrayList.add(fw3Var.l(preference, 4, i, i2));
                fw3Var.f = 4 | fw3Var.f;
                if (arrayList.size() == 1) {
                    po0Var.a();
                }
            }
        }
    }

    public final void d(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            po0 po0Var = (po0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = po0Var.a;
            recyclerView.i(null);
            fw3 fw3Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) fw3Var.h;
            if (i2 >= 1) {
                arrayList.add(fw3Var.l(null, 1, i, i2));
                fw3Var.f |= 1;
                if (arrayList.size() == 1) {
                    po0Var.a();
                }
            }
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            po0 po0Var = (po0) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = po0Var.a;
            recyclerView.i(null);
            fw3 fw3Var = recyclerView.i;
            ArrayList arrayList = (ArrayList) fw3Var.h;
            if (i2 >= 1) {
                arrayList.add(fw3Var.l(null, 2, i, i2));
                fw3Var.f |= 2;
                if (arrayList.size() == 1) {
                    po0Var.a();
                }
            }
        }
    }
}
