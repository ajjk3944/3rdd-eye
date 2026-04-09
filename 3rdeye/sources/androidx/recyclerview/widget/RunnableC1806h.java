package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1806h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f16638c;

    public RunnableC1806h(o oVar, ArrayList arrayList) {
        this.f16638c = oVar;
        this.f16637b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f16637b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            o oVar = this.f16638c;
            if (!zHasNext) {
                arrayList.clear();
                oVar.f16669n.remove(arrayList);
                return;
            }
            o.a aVar = (o.a) it.next();
            oVar.getClass();
            RecyclerView.F f10 = aVar.f16674a;
            View view = f10 == null ? null : f10.itemView;
            RecyclerView.F f11 = aVar.f16675b;
            View view2 = f11 != null ? f11.itemView : null;
            ArrayList<RecyclerView.F> arrayList2 = oVar.f16673r;
            long j4 = oVar.f16494f;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(j4);
                arrayList2.add(aVar.f16674a);
                duration.translationX(aVar.f16678e - aVar.f16676c);
                duration.translationY(aVar.f16679f - aVar.f16677d);
                duration.alpha(0.0f).setListener(new m(oVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(aVar.f16675b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j4).alpha(1.0f).setListener(new n(oVar, aVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
