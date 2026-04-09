package oe;

import java.util.Map;

/* loaded from: classes.dex */
public final class v extends o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19386a;

    /* renamed from: d, reason: collision with root package name */
    public int f19387d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f19388g;

    public v(w wVar, int i10) {
        this.f19388g = wVar;
        Object obj = w.F;
        this.f19386a = wVar.j()[i10];
        this.f19387d = i10;
    }

    public final void a() {
        int i10 = this.f19387d;
        Object obj = this.f19386a;
        w wVar = this.f19388g;
        if (i10 != -1 && i10 < wVar.size()) {
            if (a.a.k(obj, wVar.j()[this.f19387d])) {
                return;
            }
        }
        Object obj2 = w.F;
        this.f19387d = wVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19386a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        w wVar = this.f19388g;
        Map mapC = wVar.c();
        if (mapC != null) {
            return mapC.get(this.f19386a);
        }
        a();
        int i10 = this.f19387d;
        if (i10 == -1) {
            return null;
        }
        return wVar.k()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        w wVar = this.f19388g;
        Map mapC = wVar.c();
        Object obj2 = this.f19386a;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i10 = this.f19387d;
        if (i10 == -1) {
            wVar.put(obj2, obj);
            return null;
        }
        Object obj3 = wVar.k()[i10];
        wVar.k()[this.f19387d] = obj;
        return obj3;
    }
}
