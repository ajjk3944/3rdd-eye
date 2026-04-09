package com.bykv.vk.openvk.preload.geckox.c;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.k;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g extends k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: d, reason: collision with root package name */
    private int f6730d = 0;

    @Override // com.bykv.vk.openvk.preload.a.k
    public final boolean a(Throwable th2) {
        GeckoLogger.w("gecko-debug-tag", "full update failed and retry", th2);
        if (this.f6730d >= g().getFullPackage().getUrlList().size()) {
            return false;
        }
        return (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.a) || (th2 instanceof com.bykv.vk.openvk.preload.geckox.b.b);
    }

    @Override // com.bykv.vk.openvk.preload.a.k
    public final /* synthetic */ Pair<Uri, UpdatePackage> a() {
        UpdatePackage updatePackageG = g();
        List<String> urlList = updatePackageG.getFullPackage().getUrlList();
        int i4 = this.f6730d;
        this.f6730d = i4 + 1;
        return new Pair<>(Uri.parse(urlList.get(i4)), updatePackageG);
    }
}
