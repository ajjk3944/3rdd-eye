package y1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class j0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f25720a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2.c f25721d;

    public j0(Configuration configuration, c2.c cVar) {
        this.f25720a = configuration;
        this.f25721d = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f25720a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f25721d.f3134a.entrySet().iterator();
        while (it.hasNext()) {
            c2.a aVar = (c2.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f3131b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f25721d.f3134a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f25721d.f3134a.clear();
    }
}
