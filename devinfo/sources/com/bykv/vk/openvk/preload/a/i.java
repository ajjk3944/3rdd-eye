package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    protected e f6608a;

    /* renamed from: b, reason: collision with root package name */
    private int f6609b;

    /* renamed from: c, reason: collision with root package name */
    private List<h> f6610c;

    /* renamed from: d, reason: collision with root package name */
    private d f6611d;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public i(List<h> list, int i4, e eVar, d dVar) {
        this.f6610c = list;
        this.f6609b = i4;
        this.f6608a = eVar;
        this.f6611d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f6611d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f6591a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f6611d;
        if (dVar != null) {
            dVar.f6593c = obj;
            dVar.e();
        }
        if (this.f6609b >= this.f6610c.size()) {
            return obj;
        }
        h hVar = this.f6610c.get(this.f6609b);
        Class<? extends d> cls = hVar.f6602a;
        d dVar2 = (d) this.f6608a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f6610c, this.f6609b + 1, this.f6608a, dVar2);
        dVar2.a(iVar, this.f6611d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e2) {
            dVar2.c(e2.getCause());
            throw e2;
        } catch (Throwable th2) {
            dVar2.b(th2);
            throw new a(th2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f6593c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f6592b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
