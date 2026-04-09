package T1;

import android.util.Log;
import androidx.work.l;
import androidx.work.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class J implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f12138c;

    public J(K k10, String str) {
        this.f12138c = k10;
        this.f12137b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f12137b;
        K k10 = this.f12138c;
        try {
            try {
                l.a aVar = k10.f12155r.get();
                if (aVar == null) {
                    androidx.work.m.e().c(K.f12139t, k10.f12143e.f17140c + " returned a null result. Treating it as a failure.");
                } else {
                    androidx.work.m.e().a(K.f12139t, k10.f12143e.f17140c + " returned a " + aVar + ".");
                    k10.f12146h = aVar;
                }
                k10.b();
            } catch (InterruptedException e4) {
                e = e4;
                androidx.work.m.e().d(K.f12139t, str + " failed because it threw an exception/error", e);
                k10.b();
            } catch (CancellationException e10) {
                androidx.work.m mVarE = androidx.work.m.e();
                String str2 = K.f12139t;
                String str3 = str + " was cancelled";
                if (((m.a) mVarE).f16950c <= 4) {
                    Log.i(str2, str3, e10);
                }
                k10.b();
            } catch (ExecutionException e11) {
                e = e11;
                androidx.work.m.e().d(K.f12139t, str + " failed because it threw an exception/error", e);
                k10.b();
            }
        } catch (Throwable th) {
            k10.b();
            throw th;
        }
    }
}
