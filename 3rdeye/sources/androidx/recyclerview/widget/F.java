package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class F extends RecyclerView.m {

    /* renamed from: g, reason: collision with root package name */
    public boolean f16380g;

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean a(RecyclerView.F f10, RecyclerView.F f11, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i;
        int i10;
        int i11 = cVar.f16495a;
        int i12 = cVar.f16496b;
        if (f11.shouldIgnore()) {
            int i13 = cVar.f16495a;
            i10 = cVar.f16496b;
            i = i13;
        } else {
            i = cVar2.f16495a;
            i10 = cVar2.f16496b;
        }
        o oVar = (o) this;
        if (f10 == f11) {
            return oVar.g(f10, i11, i12, i, i10);
        }
        float translationX = f10.itemView.getTranslationX();
        float translationY = f10.itemView.getTranslationY();
        float alpha = f10.itemView.getAlpha();
        oVar.l(f10);
        f10.itemView.setTranslationX(translationX);
        f10.itemView.setTranslationY(translationY);
        f10.itemView.setAlpha(alpha);
        oVar.l(f11);
        f11.itemView.setTranslationX(-((int) ((i - i11) - translationX)));
        f11.itemView.setTranslationY(-((int) ((i10 - i12) - translationY)));
        f11.itemView.setAlpha(0.0f);
        ArrayList<o.a> arrayList = oVar.f16666k;
        o.a aVar = new o.a();
        aVar.f16674a = f10;
        aVar.f16675b = f11;
        aVar.f16676c = i11;
        aVar.f16677d = i12;
        aVar.f16678e = i;
        aVar.f16679f = i10;
        arrayList.add(aVar);
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean g(RecyclerView.F f10, int i, int i10, int i11, int i12);
}
