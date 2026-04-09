package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fn implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ln h;

    public /* synthetic */ fn(ln lnVar, ArrayList arrayList, int i) {
        this.f = i;
        this.h = lnVar;
        this.g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    ln lnVar = this.h;
                    if (i >= size) {
                        arrayList.clear();
                        lnVar.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        kn knVar = (kn) obj;
                        wo0 wo0Var = knVar.a;
                        int i2 = knVar.b;
                        int i3 = knVar.c;
                        int i4 = knVar.d;
                        int i5 = knVar.e;
                        lnVar.getClass();
                        View view = wo0Var.a;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        lnVar.p.add(wo0Var);
                        viewPropertyAnimatorAnimate.setDuration(lnVar.e).setListener(new hn(lnVar, wo0Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.g;
                int size2 = arrayList2.size();
                int i8 = 0;
                while (true) {
                    ln lnVar2 = this.h;
                    if (i8 >= size2) {
                        arrayList2.clear();
                        lnVar2.n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                        jn jnVar = (jn) obj2;
                        ArrayList arrayList3 = lnVar2.r;
                        long j = lnVar2.f;
                        wo0 wo0Var2 = jnVar.a;
                        View view2 = wo0Var2 == null ? null : wo0Var2.a;
                        wo0 wo0Var3 = jnVar.b;
                        View view3 = wo0Var3 != null ? wo0Var3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(jnVar.a);
                            duration.translationX(jnVar.e - jnVar.c);
                            duration.translationY(jnVar.f - jnVar.d);
                            duration.alpha(0.0f).setListener(new in(lnVar2, jnVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(jnVar.b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new in(lnVar2, jnVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.g;
                int size3 = arrayList4.size();
                int i9 = 0;
                while (true) {
                    ln lnVar3 = this.h;
                    if (i9 >= size3) {
                        arrayList4.clear();
                        lnVar3.l.remove(arrayList4);
                        break;
                    } else {
                        Object obj3 = arrayList4.get(i9);
                        i9++;
                        wo0 wo0Var4 = (wo0) obj3;
                        lnVar3.getClass();
                        View view4 = wo0Var4.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        lnVar3.o.add(wo0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(lnVar3.c).setListener(new gn(lnVar3, wo0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
