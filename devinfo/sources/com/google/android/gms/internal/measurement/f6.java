package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f6 {

    /* renamed from: c, reason: collision with root package name */
    public static final f6 f19741c = new f6();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f19743b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final v5 f19742a = new v5(0);

    public final i6 a(Class cls) {
        i6 i6VarU;
        Charset charset = n5.f19843a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f19743b;
        i6 i6Var = (i6) concurrentHashMap.get(cls);
        if (i6Var != null) {
            return i6Var;
        }
        v5 v5Var = this.f19742a;
        v5Var.getClass();
        e5 e5Var = j6.f19789a;
        g5.class.isAssignableFrom(cls);
        h6 h6VarE = ((v5) v5Var.f19970a).e(cls);
        if ((h6VarE.f19772d & 2) == 2) {
            e5 e5Var2 = j6.f19789a;
            e5 e5Var3 = a5.f19609a;
            i6VarU = new c6(e5Var2, h6VarE.f19769a);
        } else {
            int i4 = d6.f19662a;
            int i10 = s5.f19925a;
            e5 e5Var4 = j6.f19789a;
            e5 e5Var5 = h6VarE.a() + (-1) != 1 ? a5.f19609a : null;
            int i11 = y5.f20053a;
            i6VarU = b6.u(h6VarE, e5Var4, e5Var5);
        }
        i6 i6Var2 = (i6) concurrentHashMap.putIfAbsent(cls, i6VarU);
        return i6Var2 != null ? i6Var2 : i6VarU;
    }
}
