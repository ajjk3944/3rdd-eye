package d2;

import android.os.Handler;
import android.os.Looper;
import androidx.work.p;

/* loaded from: classes.dex */
public class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20659a = n0.f.a(Looper.getMainLooper());

    @Override // androidx.work.p
    public void a(Runnable runnable) {
        this.f20659a.removeCallbacks(runnable);
    }

    @Override // androidx.work.p
    public void b(long j10, Runnable runnable) {
        this.f20659a.postDelayed(runnable, j10);
    }
}
