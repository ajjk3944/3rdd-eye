package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Xq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821Xq implements InterfaceC1064dq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12502a;

    /* renamed from: b, reason: collision with root package name */
    public final C0563In f12503b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12504c;

    public C0821Xq(C1497lr c1497lr, C0563In c0563In) {
        this.f12502a = 1;
        this.f12504c = c1497lr;
        this.f12503b = c0563In;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1064dq
    public final C1119eq a(String str, JSONObject jSONObject) {
        C1119eq c1119eq;
        InterfaceC1860sd interfaceC1860sdB;
        switch (this.f12502a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap map = (HashMap) this.f12504c;
                        c1119eq = (C1119eq) map.get(str);
                        if (c1119eq == null) {
                            c1119eq = new C1119eq(this.f12503b.a(str, jSONObject), new BinderC0430Aq(), str);
                            map.put(str, c1119eq);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1119eq;
            default:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8716b2)).booleanValue()) {
                    try {
                        interfaceC1860sdB = this.f12503b.b(str);
                    } catch (RemoteException e6) {
                        u2.k.f("Coundn't create RTB adapter: ", e6);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((C1497lr) this.f12504c).f15481a;
                    interfaceC1860sdB = concurrentHashMap.containsKey(str) ? (InterfaceC1860sd) concurrentHashMap.get(str) : null;
                }
                if (interfaceC1860sdB == null) {
                    return null;
                }
                return new C1119eq(interfaceC1860sdB, new BinderC2251zq(), str);
        }
    }

    public C0821Xq(C0563In c0563In) {
        this.f12502a = 0;
        this.f12504c = new HashMap();
        this.f12503b = c0563In;
    }
}
