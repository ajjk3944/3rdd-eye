package jg;

import android.content.res.Configuration;
import android.view.KeyEvent;
import android.widget.TextView;
import c1.o;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements AdViewParentApi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f27677b;

    public /* synthetic */ l(KeyEvent.Callback callback, int i4) {
        this.f27676a = i4;
        this.f27677b = callback;
    }

    public void a(long j, lg.e eVar) {
        switch (this.f27676a) {
            case 0:
                StorageCleanActivity storageCleanActivity = (StorageCleanActivity) this.f27677b;
                o oVar = storageCleanActivity.F;
                if (oVar != null) {
                    StorageCleanActivity.D(storageCleanActivity, (TextView) oVar.f2576i, j);
                    return;
                } else {
                    nk.k.k("scanningBinding");
                    throw null;
                }
            default:
                StorageCleanActivity storageCleanActivity2 = (StorageCleanActivity) this.f27677b;
                if (eVar instanceof lg.d) {
                    o oVar2 = storageCleanActivity2.F;
                    if (oVar2 != null) {
                        StorageCleanActivity.D(storageCleanActivity2, (TextView) oVar2.f2575h, j);
                        return;
                    } else {
                        nk.k.k("scanningBinding");
                        throw null;
                    }
                }
                if (eVar instanceof lg.g) {
                    o oVar3 = storageCleanActivity2.F;
                    if (oVar3 != null) {
                        StorageCleanActivity.D(storageCleanActivity2, (TextView) oVar3.j, j);
                        return;
                    } else {
                        nk.k.k("scanningBinding");
                        throw null;
                    }
                }
                if (eVar instanceof lg.h) {
                    o oVar4 = storageCleanActivity2.F;
                    if (oVar4 != null) {
                        StorageCleanActivity.D(storageCleanActivity2, (TextView) oVar4.f2577k, j);
                        return;
                    } else {
                        nk.k.k("scanningBinding");
                        throw null;
                    }
                }
                if (eVar instanceof lg.i) {
                    o oVar5 = storageCleanActivity2.F;
                    if (oVar5 != null) {
                        StorageCleanActivity.D(storageCleanActivity2, (TextView) oVar5.f2569a, j);
                        return;
                    } else {
                        nk.k.k("scanningBinding");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.widget.RelativeLayout*/.onConfigurationChanged(configuration);
    }
}
