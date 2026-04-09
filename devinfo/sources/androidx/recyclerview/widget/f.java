package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1351c;

    public /* synthetic */ f(l lVar, ArrayList arrayList, int i4) {
        this.f1349a = i4;
        this.f1351c = lVar;
        this.f1350b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1349a) {
            case 0:
                ArrayList arrayList = this.f1350b;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    l lVar = this.f1351c;
                    if (i4 >= size) {
                        arrayList.clear();
                        lVar.f1440m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i4);
                        i4++;
                        k kVar = (k) obj;
                        x1 x1Var = kVar.f1422a;
                        int i10 = kVar.f1423b;
                        int i11 = kVar.f1424c;
                        int i12 = kVar.f1425d;
                        int i13 = kVar.f1426e;
                        lVar.getClass();
                        View view = x1Var.itemView;
                        int i14 = i12 - i10;
                        int i15 = i13 - i11;
                        if (i14 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i15 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        lVar.f1443p.add(x1Var);
                        viewPropertyAnimatorAnimate.setDuration(lVar.f1303e).setListener(new h(lVar, x1Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f1350b;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (true) {
                    l lVar2 = this.f1351c;
                    if (i16 >= size2) {
                        arrayList2.clear();
                        lVar2.f1441n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i16);
                        i16++;
                        j jVar = (j) obj2;
                        ArrayList arrayList3 = lVar2.f1445r;
                        long j = lVar2.f1304f;
                        x1 x1Var2 = jVar.f1411a;
                        View view2 = x1Var2 == null ? null : x1Var2.itemView;
                        x1 x1Var3 = jVar.f1412b;
                        View view3 = x1Var3 != null ? x1Var3.itemView : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(jVar.f1411a);
                            duration.translationX(jVar.f1415e - jVar.f1413c);
                            duration.translationY(jVar.f1416f - jVar.f1414d);
                            duration.alpha(0.0f).setListener(new i(lVar2, jVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(jVar.f1412b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new i(lVar2, jVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f1350b;
                int size3 = arrayList4.size();
                int i17 = 0;
                while (true) {
                    l lVar3 = this.f1351c;
                    if (i17 >= size3) {
                        arrayList4.clear();
                        lVar3.f1439l.remove(arrayList4);
                        break;
                    } else {
                        Object obj3 = arrayList4.get(i17);
                        i17++;
                        x1 x1Var4 = (x1) obj3;
                        lVar3.getClass();
                        View view4 = x1Var4.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        lVar3.f1442o.add(x1Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(lVar3.f1301c).setListener(new g(lVar3, x1Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
