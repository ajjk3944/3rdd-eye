package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vj0 implements bi0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17632a;

    /* renamed from: b, reason: collision with root package name */
    public final ed0 f17633b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17634c;

    public vj0(ik0 ik0Var, ed0 ed0Var) {
        this.f17632a = 1;
        this.f17634c = ik0Var;
        this.f17633b = ed0Var;
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final ci0 a(String str, JSONObject jSONObject) {
        ci0 ci0Var;
        is isVarB;
        switch (this.f17632a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap map = (HashMap) this.f17634c;
                        ci0Var = (ci0) map.get(str);
                        if (ci0Var == null) {
                            ci0Var = new ci0(this.f17633b.a(str, jSONObject), new wi0(), str);
                            map.put(str, ci0Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return ci0Var;
            default:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16053b2)).booleanValue()) {
                    try {
                        isVarB = this.f17633b.b(str);
                    } catch (RemoteException e2) {
                        za.i.f("Coundn't create RTB adapter: ", e2);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((ik0) this.f17634c).f12359a;
                    isVarB = concurrentHashMap.containsKey(str) ? (is) concurrentHashMap.get(str) : null;
                }
                if (isVarB == null) {
                    return null;
                }
                return new ci0(isVarB, new vi0(), str);
        }
    }

    public vj0(ed0 ed0Var) {
        this.f17632a = 0;
        this.f17634c = new HashMap();
        this.f17633b = ed0Var;
    }
}
