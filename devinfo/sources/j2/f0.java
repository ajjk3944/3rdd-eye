package j2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f27138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2.c f27139b;

    public f0(Configuration configuration, n2.c cVar) {
        this.f27138a = configuration;
        this.f27139b = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f27138a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f27139b.f29564a.entrySet().iterator();
        while (it.hasNext()) {
            n2.a aVar = (n2.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f29562b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f27139b.f29564a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        this.f27139b.f29564a.clear();
    }
}
