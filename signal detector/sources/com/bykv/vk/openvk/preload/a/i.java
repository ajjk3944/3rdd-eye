package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* loaded from: classes.dex */
final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    protected e f6617a;

    /* renamed from: b, reason: collision with root package name */
    private int f6618b;

    /* renamed from: c, reason: collision with root package name */
    private List<h> f6619c;

    /* renamed from: d, reason: collision with root package name */
    private d f6620d;

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public i(List<h> list, int i, e eVar, d dVar) {
        this.f6619c = list;
        this.f6618b = i;
        this.f6617a = eVar;
        this.f6620d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f6620d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f6599a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws a {
        d dVar = this.f6620d;
        if (dVar != null) {
            dVar.f6601c = obj;
            dVar.e();
        }
        if (this.f6618b >= this.f6619c.size()) {
            return obj;
        }
        h hVar = this.f6619c.get(this.f6618b);
        Class<? extends d> cls = hVar.f6611a;
        d dVar2 = (d) this.f6617a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f6619c, this.f6618b + 1, this.f6617a, dVar2);
        dVar2.a(iVar, this.f6620d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e6) {
            dVar2.c(e6.getCause());
            throw e6;
        } catch (Throwable th) {
            dVar2.b(th);
            throw new a(th);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f6601c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f6600b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
