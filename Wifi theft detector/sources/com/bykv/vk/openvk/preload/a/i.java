package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* loaded from: classes.dex */
final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    protected e f8996a;

    /* renamed from: b, reason: collision with root package name */
    private int f8997b;

    /* renamed from: c, reason: collision with root package name */
    private List<h> f8998c;

    /* renamed from: d, reason: collision with root package name */
    private d f8999d;

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public i(List<h> list, int i10, e eVar, d dVar) {
        this.f8998c = list;
        this.f8997b = i10;
        this.f8996a = eVar;
        this.f8999d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f8999d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f8978a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f8999d;
        if (dVar != null) {
            dVar.f8980c = obj;
            dVar.e();
        }
        if (this.f8997b >= this.f8998c.size()) {
            return obj;
        }
        h hVar = this.f8998c.get(this.f8997b);
        Class<? extends d> cls = hVar.f8990a;
        d dVar2 = (d) this.f8996a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f8998c, this.f8997b + 1, this.f8996a, dVar2);
        dVar2.a(iVar, this.f8999d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e10) {
            dVar2.c(e10.getCause());
            throw e10;
        } catch (Throwable th) {
            dVar2.b(th);
            throw new a(th);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f8980c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f8979b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
