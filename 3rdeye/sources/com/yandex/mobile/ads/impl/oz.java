package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.nz;
import com.yandex.mobile.ads.impl.tz;
import com.yandex.mobile.ads.impl.xv0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class oz implements e40 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f31530a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private xv0.d f31531b;

    /* renamed from: c, reason: collision with root package name */
    private nz f31532c;

    private static nz a(xv0.d dVar) {
        tz.a aVarB = new tz.a().b();
        Uri uri = dVar.f35465b;
        jh0 jh0Var = new jh0(uri == null ? null : uri.toString(), dVar.f35469f, aVarB);
        v72<Map.Entry<String, String>> it = dVar.f35466c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            jh0Var.a(next.getKey(), next.getValue());
        }
        nz nzVarA = new nz.a().a(dVar.f35464a, mc0.f30341e).a(dVar.f35467d).b(dVar.f35468e).a(up0.a(dVar.f35470g)).a(jh0Var);
        nzVarA.a(dVar.a());
        return nzVarA;
    }

    @Override // com.yandex.mobile.ads.impl.e40
    public final d40 a(xv0 xv0Var) {
        nz nzVar;
        xv0Var.f35439c.getClass();
        xv0.d dVar = xv0Var.f35439c.f35488c;
        if (dVar != null && s82.f32899a >= 18) {
            synchronized (this.f31530a) {
                try {
                    if (!s82.a(dVar, this.f31531b)) {
                        this.f31531b = dVar;
                        this.f31532c = a(dVar);
                    }
                    nzVar = this.f31532c;
                    nzVar.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return nzVar;
        }
        return d40.f25945a;
    }
}
