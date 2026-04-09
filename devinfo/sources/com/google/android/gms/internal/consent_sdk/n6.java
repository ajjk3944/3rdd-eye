package com.google.android.gms.internal.consent_sdk;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n6 {

    /* renamed from: c, reason: collision with root package name */
    public static final n6 f19445c = new n6();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f19447b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final e6 f19446a = new e6(0);

    public final q6 a(Class cls) {
        q6 q6VarJ;
        Charset charset = a6.f19264a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f19447b;
        q6 q6Var = (q6) concurrentHashMap.get(cls);
        if (q6Var != null) {
            return q6Var;
        }
        e6 e6Var = this.f19446a;
        e6Var.getClass();
        w6 w6Var = r6.f19504a;
        if (!w5.class.isAssignableFrom(cls)) {
            int i4 = n5.f19444a;
        }
        p6 p6VarD = ((e6) e6Var.f19335b).d(cls);
        if ((p6VarD.f19468d & 2) == 2) {
            int i10 = n5.f19444a;
            w6 w6Var2 = r6.f19504a;
            q4 q4Var = s5.f19509a;
            q6VarJ = new l6(w6Var2, p6VarD.f19465a);
        } else {
            int i11 = n5.f19444a;
            int i12 = m6.f19439a;
            int i13 = d6.f19316a;
            w6 w6Var3 = r6.f19504a;
            q4 q4Var2 = p6VarD.a() + (-1) != 1 ? s5.f19509a : null;
            int i14 = h6.f19370a;
            q6VarJ = k6.j(p6VarD, w6Var3, q4Var2);
        }
        q6 q6Var2 = (q6) concurrentHashMap.putIfAbsent(cls, q6VarJ);
        return q6Var2 != null ? q6Var2 : q6VarJ;
    }
}
