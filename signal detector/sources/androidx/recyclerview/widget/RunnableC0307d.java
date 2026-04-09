package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0307d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0313j f5441c;

    public /* synthetic */ RunnableC0307d(C0313j c0313j, ArrayList arrayList, int i) {
        this.f5439a = i;
        this.f5441c = c0313j;
        this.f5440b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5439a) {
            case 0:
                ArrayList arrayList = this.f5440b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    C0313j c0313j = this.f5441c;
                    if (i >= size) {
                        arrayList.clear();
                        c0313j.f5501m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        C0312i c0312i = (C0312i) obj;
                        g0 g0Var = c0312i.f5488a;
                        int i3 = c0312i.f5489b;
                        int i6 = c0312i.f5490c;
                        int i7 = c0312i.f5491d;
                        int i8 = c0312i.f5492e;
                        c0313j.getClass();
                        View view = g0Var.itemView;
                        int i9 = i7 - i3;
                        int i10 = i8 - i6;
                        if (i9 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i10 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0313j.f5504p.add(g0Var);
                        viewPropertyAnimatorAnimate.setDuration(c0313j.f5296e).setListener(new C0309f(c0313j, g0Var, i9, view, i10, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f5440b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    C0313j c0313j2 = this.f5441c;
                    if (i11 >= size2) {
                        arrayList2.clear();
                        c0313j2.f5502n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        C0311h c0311h = (C0311h) obj2;
                        ArrayList arrayList3 = c0313j2.f5506r;
                        long j6 = c0313j2.f5297f;
                        g0 g0Var2 = c0311h.f5479a;
                        View view2 = g0Var2 == null ? null : g0Var2.itemView;
                        g0 g0Var3 = c0311h.f5480b;
                        View view3 = g0Var3 != null ? g0Var3.itemView : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j6);
                            arrayList3.add(c0311h.f5479a);
                            duration.translationX(c0311h.f5483e - c0311h.f5481c);
                            duration.translationY(c0311h.f5484f - c0311h.f5482d);
                            duration.alpha(0.0f).setListener(new C0310g(c0313j2, c0311h, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0311h.f5480b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j6).alpha(1.0f).setListener(new C0310g(c0313j2, c0311h, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f5440b;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    C0313j c0313j3 = this.f5441c;
                    if (i12 >= size3) {
                        arrayList4.clear();
                        c0313j3.f5500l.remove(arrayList4);
                        break;
                    } else {
                        Object obj3 = arrayList4.get(i12);
                        i12++;
                        g0 g0Var4 = (g0) obj3;
                        c0313j3.getClass();
                        View view4 = g0Var4.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0313j3.f5503o.add(g0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0313j3.f5294c).setListener(new C0308e(c0313j3, g0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
