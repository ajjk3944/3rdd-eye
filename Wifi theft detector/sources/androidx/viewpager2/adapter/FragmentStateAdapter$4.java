package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.j;
import androidx.lifecycle.n;

/* loaded from: classes.dex */
class FragmentStateAdapter$4 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f4269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f4270b;

    @Override // androidx.lifecycle.j
    public void onStateChanged(n nVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f4269a.removeCallbacks(this.f4270b);
            nVar.getLifecycle().d(this);
        }
    }
}
