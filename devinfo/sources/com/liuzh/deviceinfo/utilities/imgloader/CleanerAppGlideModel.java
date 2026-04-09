package com.liuzh.deviceinfo.utilities.imgloader;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.k;
import d8.y;
import ec.x;
import ec.z;
import ei.c;
import java.util.HashMap;
import kg.d;
import nh.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class CleanerAppGlideModel extends a {
    @Override // nh.a
    public final void u(Context context, b bVar, k kVar) {
        z zVar = new z(23);
        y yVar = kVar.f6503a;
        synchronized (yVar) {
            yVar.f22051a.e(c.class, zVar);
            ((HashMap) yVar.f22052b.f31385a).clear();
        }
        kVar.i(d.class, new x(24));
    }
}
