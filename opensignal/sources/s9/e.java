package s9;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.exoplayer2.w;
import java.util.Objects;
import m9.i;
import t9.h;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al.b f21936a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f21937d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21938g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Runnable f21939r;

    public /* synthetic */ e(al.b bVar, i iVar, int i10, Runnable runnable) {
        this.f21936a = bVar;
        this.f21937d = iVar;
        this.f21938g = i10;
        this.f21939r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f21937d;
        int i10 = this.f21938g;
        Runnable runnable = this.f21939r;
        al.b bVar = this.f21936a;
        u9.c cVar = (u9.c) bVar.f815g;
        try {
            try {
                t9.d dVar = (t9.d) bVar.f812d;
                Objects.requireNonNull(dVar);
                ((h) cVar).w(new io.sentry.android.replay.capture.e(29, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) bVar.f810b).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((h) cVar).w(new w(bVar, iVar, i10, 3));
                } else {
                    bVar.k(iVar, i10);
                }
                runnable.run();
            } catch (u9.a unused) {
                ((qm.c) bVar.f813e).O(iVar, i10 + 1, false);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }
}
