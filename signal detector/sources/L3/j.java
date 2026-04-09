package L3;

import R.O;
import androidx.recyclerview.widget.C0305b;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j extends I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2599b;

    public /* synthetic */ j(int i, Object obj) {
        this.f2598a = i;
        this.f2599b = obj;
    }

    @Override // androidx.recyclerview.widget.I
    public final void a() {
        switch (this.f2598a) {
            case 0:
                ((m) this.f2599b).b();
                break;
            case 1:
                ((R0.d) this.f2599b).b(true);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f2599b;
                recyclerView.i(null);
                recyclerView.f5372u0.f5447f = true;
                recyclerView.W(true);
                if (!recyclerView.f5345d.j()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final void b(int i, int i3, Object obj) {
        switch (this.f2598a) {
            case 0:
                ((m) this.f2599b).b();
                break;
            case 1:
                a();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f2599b;
                recyclerView.i(null);
                C0305b c0305b = recyclerView.f5345d;
                ArrayList arrayList = (ArrayList) c0305b.f5432c;
                if (i3 >= 1) {
                    arrayList.add(c0305b.l(obj, 4, i, i3));
                    c0305b.f5430a |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final void c(int i, int i3) {
        switch (this.f2598a) {
            case 0:
                ((m) this.f2599b).b();
                break;
            case 1:
                a();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f2599b;
                recyclerView.i(null);
                C0305b c0305b = recyclerView.f5345d;
                ArrayList arrayList = (ArrayList) c0305b.f5432c;
                if (i3 >= 1) {
                    arrayList.add(c0305b.l(null, 1, i, i3));
                    c0305b.f5430a |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final void d(int i, int i3) {
        switch (this.f2598a) {
            case 0:
                ((m) this.f2599b).b();
                break;
            case 1:
                a();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f2599b;
                recyclerView.i(null);
                C0305b c0305b = recyclerView.f5345d;
                ArrayList arrayList = (ArrayList) c0305b.f5432c;
                if (i != i3) {
                    arrayList.add(c0305b.l(null, 8, i, i3));
                    c0305b.f5430a |= 8;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final void e(int i, int i3) {
        switch (this.f2598a) {
            case 0:
                ((m) this.f2599b).b();
                break;
            case 1:
                a();
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f2599b;
                recyclerView.i(null);
                C0305b c0305b = recyclerView.f5345d;
                ArrayList arrayList = (ArrayList) c0305b.f5432c;
                if (i3 >= 1) {
                    arrayList.add(c0305b.l(null, 2, i, i3));
                    c0305b.f5430a |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.I
    public void f() {
        G g2;
        switch (this.f2598a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f2599b;
                if (recyclerView.f5343c != null && (g2 = recyclerView.f5360l) != null && g2.canRestoreState()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    public void g() {
        int[] iArr = RecyclerView.f5304N0;
        RecyclerView recyclerView = (RecyclerView) this.f2599b;
        if (!recyclerView.f5317G || !recyclerView.f5315F) {
            recyclerView.f5330N = true;
            recyclerView.requestLayout();
        } else {
            D d6 = recyclerView.f5353h;
            WeakHashMap weakHashMap = O.f3270a;
            recyclerView.postOnAnimation(d6);
        }
    }
}
