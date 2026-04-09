package h7;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10075a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10076d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f10077g;

    public /* synthetic */ h(n nVar, ArrayList arrayList, int i10) {
        this.f10075a = i10;
        this.f10077g = nVar;
        this.f10076d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10075a) {
            case 0:
                ArrayList arrayList = this.f10076d;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    n nVar = this.f10077g;
                    if (!zHasNext) {
                        arrayList.clear();
                        nVar.f10147m.remove(arrayList);
                        break;
                    } else {
                        m mVar = (m) it.next();
                        n1 n1Var = mVar.f10129a;
                        int i10 = mVar.f10130b;
                        int i11 = mVar.f10131c;
                        int i12 = mVar.f10132d;
                        int i13 = mVar.f10133e;
                        nVar.getClass();
                        View view = n1Var.f10155a;
                        int i14 = i12 - i10;
                        int i15 = i13 - i11;
                        if (i14 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i15 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        nVar.f10150p.add(n1Var);
                        viewPropertyAnimatorAnimate.setDuration(nVar.f10222e).setListener(new j(nVar, n1Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f10076d;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    n nVar2 = this.f10077g;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        nVar2.f10148n.remove(arrayList2);
                        break;
                    } else {
                        l lVar = (l) it2.next();
                        ArrayList arrayList3 = nVar2.f10152r;
                        long j = nVar2.f10223f;
                        n1 n1Var2 = lVar.f10119a;
                        View view2 = n1Var2 == null ? null : n1Var2.f10155a;
                        n1 n1Var3 = lVar.f10120b;
                        View view3 = n1Var3 != null ? n1Var3.f10155a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(lVar.f10119a);
                            duration.translationX(lVar.f10123e - lVar.f10121c);
                            duration.translationY(lVar.f10124f - lVar.f10122d);
                            duration.alpha(0.0f).setListener(new k(nVar2, lVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(lVar.f10120b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new k(nVar2, lVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f10076d;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    n nVar3 = this.f10077g;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        nVar3.f10146l.remove(arrayList4);
                        break;
                    } else {
                        n1 n1Var4 = (n1) it3.next();
                        nVar3.getClass();
                        View view4 = n1Var4.f10155a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        nVar3.f10149o.add(n1Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(nVar3.f10220c).setListener(new i(nVar3, n1Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
