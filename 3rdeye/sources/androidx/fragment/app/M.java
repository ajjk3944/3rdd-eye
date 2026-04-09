package androidx.fragment.app;

import L0.I;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public final class M implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15823f;

    public M(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f15819b = i;
        this.f15820c = arrayList;
        this.f15821d = arrayList2;
        this.f15822e = arrayList3;
        this.f15823f = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f15819b; i++) {
            View view = (View) this.f15820c.get(i);
            String str = (String) this.f15821d.get(i);
            WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
            I.d.v(view, str);
            I.d.v((View) this.f15822e.get(i), (String) this.f15823f.get(i));
        }
    }
}
