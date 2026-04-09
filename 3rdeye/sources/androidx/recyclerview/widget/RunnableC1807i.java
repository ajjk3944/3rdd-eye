package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1807i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f16640c;

    public RunnableC1807i(o oVar, ArrayList arrayList) {
        this.f16640c = oVar;
        this.f16639b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f16639b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            o oVar = this.f16640c;
            if (!zHasNext) {
                arrayList.clear();
                oVar.f16667l.remove(arrayList);
                return;
            }
            RecyclerView.F f10 = (RecyclerView.F) it.next();
            oVar.getClass();
            View view = f10.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            oVar.f16670o.add(f10);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(oVar.f16491c).setListener(new k(view, viewPropertyAnimatorAnimate, oVar, f10)).start();
        }
    }
}
