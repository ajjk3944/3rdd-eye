package P4;

import L2.m;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* loaded from: classes.dex */
public final class b implements NsdManager.ResolveListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f3146a;

    public b(m mVar) {
        this.f3146a = mVar;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        m mVar = this.f3146a;
        mVar.f2536a = false;
        m.b(mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    @Override // android.net.nsd.NsdManager.ResolveListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceResolved(android.net.nsd.NsdServiceInfo r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.b.onServiceResolved(android.net.nsd.NsdServiceInfo):void");
    }
}
