package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class EL {

    /* renamed from: c, reason: collision with root package name */
    public static final EL f7942c = new EL();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f7944b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Nx f7943a = new Nx(1);

    public final JL a(Class cls) {
        JL jlZ;
        Charset charset = AbstractC1528mL.f15610a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f7944b;
        JL jl = (JL) concurrentHashMap.get(cls);
        if (jl != null) {
            return jl;
        }
        Nx nx = this.f7943a;
        nx.getClass();
        C1994v2 c1994v2 = KL.f9483a;
        if (!AbstractC1096eL.class.isAssignableFrom(cls)) {
            int i = JK.f9277a;
        }
        GL glM = ((C2255zu) nx.f10110b).m(cls);
        if ((glM.f8362d & 2) == 2) {
            int i3 = JK.f9277a;
            C1994v2 c1994v22 = KL.f9483a;
            ZJ zj = YK.f12633a;
            jlZ = new AL(c1994v22, glM.f8359a);
        } else {
            int i6 = JK.f9277a;
            int i7 = BL.f7331a;
            int i8 = AbstractC1797rL.f16514a;
            C1994v2 c1994v23 = KL.f9483a;
            ZJ zj2 = glM.a() + (-1) != 1 ? YK.f12633a : null;
            int i9 = AbstractC2013vL.f17262a;
            jlZ = C2229zL.z(glM, c1994v23, zj2);
        }
        JL jl2 = (JL) concurrentHashMap.putIfAbsent(cls, jlZ);
        return jl2 != null ? jl2 : jlZ;
    }
}
