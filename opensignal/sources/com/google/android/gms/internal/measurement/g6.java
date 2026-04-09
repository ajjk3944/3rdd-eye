package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: c, reason: collision with root package name */
    public static final g6 f5043c = new g6();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5045b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final w5 f5044a = new w5(0);

    public final j6 a(Class cls) {
        j6 j6VarT;
        Charset charset = o5.f5148a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f5045b;
        j6 j6Var = (j6) concurrentHashMap.get(cls);
        if (j6Var != null) {
            return j6Var;
        }
        w5 w5Var = this.f5044a;
        w5Var.getClass();
        f5 f5Var = k6.f5095a;
        h5.class.isAssignableFrom(cls);
        i6 i6VarB = ((w5) w5Var.f5247a).b(cls);
        if ((i6VarB.f5082d & 2) == 2) {
            f5 f5Var2 = k6.f5095a;
            f5 f5Var3 = b5.f4919a;
            j6VarT = new d6(f5Var2, i6VarB.f5079a);
        } else {
            int i10 = e6.f4976a;
            int i11 = t5.f5209a;
            f5 f5Var4 = k6.f5095a;
            f5 f5Var5 = i6VarB.a() + (-1) != 1 ? b5.f4919a : null;
            int i12 = z5.f5286a;
            j6VarT = c6.t(i6VarB, f5Var4, f5Var5);
        }
        j6 j6Var2 = (j6) concurrentHashMap.putIfAbsent(cls, j6VarT);
        return j6Var2 != null ? j6Var2 : j6VarT;
    }
}
