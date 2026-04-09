package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class n implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final p f42259a;

    public n(p pVar) {
        this.f42259a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f42259a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f42265e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f42261a.f42239a);
                tVar2.f42272c.add(pVar.f42263c);
                Iterator it = pVar.f42264d.iterator();
                while (it.hasNext()) {
                    tVar2.f42272c.add((Consumer) it.next());
                }
                pVar.f42265e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f42270a = pVar.f42261a.f42239a;
            }
            if (tVar.f42273d != null) {
                boolean zDidTimePassMillis = tVar.f42271b.didTimePassMillis(tVar.f42274e, tVar.f42270a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z10 = location.distanceTo(tVar.f42273d) > tVar.f42270a.getUpdateDistanceInterval();
                boolean z11 = tVar.f42273d == null || location.getTime() - tVar.f42273d.getTime() >= 0;
                if ((!zDidTimePassMillis && !z10) || !z11) {
                    return;
                }
            }
            tVar.f42273d = location;
            tVar.f42274e = System.currentTimeMillis();
            Iterator it2 = tVar.f42272c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
