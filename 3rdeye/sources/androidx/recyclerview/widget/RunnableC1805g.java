package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1805g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f16636c;

    public RunnableC1805g(o oVar, ArrayList arrayList) {
        this.f16636c = oVar;
        this.f16635b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f16635b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            o oVar = this.f16636c;
            if (!zHasNext) {
                arrayList.clear();
                oVar.f16668m.remove(arrayList);
                return;
            }
            o.b bVar = (o.b) it.next();
            RecyclerView.F f10 = bVar.f16680a;
            oVar.getClass();
            View view = f10.itemView;
            int i = bVar.f16683d - bVar.f16681b;
            int i10 = bVar.f16684e - bVar.f16682c;
            if (i != 0) {
                view.animate().translationX(0.0f);
            }
            if (i10 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            oVar.f16671p.add(f10);
            viewPropertyAnimatorAnimate.setDuration(oVar.f16493e).setListener(new l(oVar, f10, i, view, i10, viewPropertyAnimatorAnimate)).start();
        }
    }
}
