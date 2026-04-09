package E3;

import G3.b;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f1383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y3.j f1384c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f1386e;

    public /* synthetic */ f(j jVar, y3.j jVar2, int i, Runnable runnable) {
        this.f1383b = jVar;
        this.f1384c = jVar2;
        this.f1385d = i;
        this.f1386e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final y3.j jVar = this.f1384c;
        final int i = this.f1385d;
        Runnable runnable = this.f1386e;
        final j jVar2 = this.f1383b;
        G3.b bVar = jVar2.f1402f;
        try {
            F3.d dVar = jVar2.f1399c;
            Objects.requireNonNull(dVar);
            bVar.e(new D7.c(dVar, 2));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) jVar2.f1397a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                bVar.e(new b.a() { // from class: E3.g
                    @Override // G3.b.a
                    public final Object execute() {
                        jVar2.f1400d.a(jVar, i + 1);
                        return null;
                    }
                });
            } else {
                jVar2.a(jVar, i);
            }
        } catch (G3.a unused) {
            jVar2.f1400d.a(jVar, i + 1);
        } finally {
            runnable.run();
        }
    }
}
