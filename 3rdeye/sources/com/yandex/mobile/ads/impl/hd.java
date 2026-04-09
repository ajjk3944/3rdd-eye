package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import c9.C2091l;
import com.yandex.mobile.ads.impl.id;
import com.yandex.mobile.ads.impl.jd;
import com.yandex.mobile.ads.impl.qd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class hd extends lh1 {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f28185e;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f28186d;

    static {
        f28185e = "Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
    }

    public hd() {
        id idVarA = id.a.a();
        int i = qd.f32142g;
        ArrayList arrayListL = C2091l.l(new z02[]{idVarA, new s00(qd.a.a())});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((z02) next).a()) {
                arrayList.add(next);
            }
        }
        this.f28186d = arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final yn a(X509TrustManager trustManager) {
        kotlin.jvm.internal.l.f(trustManager, "trustManager");
        jd jdVarA = jd.a.a(trustManager);
        return jdVarA != null ? jdVarA : new qk(b(trustManager));
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final String b(SSLSocket sslSocket) {
        Object next;
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        Iterator it = this.f28186d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((z02) next).a(sslSocket)) {
                break;
            }
        }
        z02 z02Var = (z02) next;
        if (z02Var != null) {
            return z02Var.b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    public final void a(SSLSocket sslSocket, String str, List<? extends gm1> protocols) {
        Object next;
        kotlin.jvm.internal.l.f(sslSocket, "sslSocket");
        kotlin.jvm.internal.l.f(protocols, "protocols");
        Iterator it = this.f28186d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((z02) next).a(sslSocket)) {
                    break;
                }
            }
        }
        z02 z02Var = (z02) next;
        if (z02Var != null) {
            z02Var.a(sslSocket, str, protocols);
        }
    }

    @Override // com.yandex.mobile.ads.impl.lh1
    @SuppressLint({"NewApi"})
    public final boolean a(String hostname) {
        kotlin.jvm.internal.l.f(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
