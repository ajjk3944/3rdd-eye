package oe;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19381a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f19382d;

    public /* synthetic */ u(w wVar, int i10) {
        this.f19381a = i10;
        this.f19382d = wVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f19381a) {
            case 0:
                this.f19382d.clear();
                break;
            default:
                this.f19382d.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f19381a) {
            case 0:
                w wVar = this.f19382d;
                Map mapC = wVar.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = wVar.e(entry.getKey());
                    if (iE != -1 && a.a.k(wVar.k()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f19382d.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f19381a) {
            case 0:
                w wVar = this.f19382d;
                Map mapC = wVar.c();
                return mapC != null ? mapC.entrySet().iterator() : new t(wVar, 1);
            default:
                w wVar2 = this.f19382d;
                Map mapC2 = wVar2.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new t(wVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f19381a) {
            case 0:
                w wVar = this.f19382d;
                Map mapC = wVar.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!wVar.g()) {
                        int iD = wVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = wVar.f19390a;
                        Objects.requireNonNull(obj2);
                        int iP = s.p(key, value, iD, obj2, wVar.i(), wVar.j(), wVar.k());
                        if (iP != -1) {
                            wVar.f(iP, iD);
                            wVar.f19395y--;
                            wVar.f19394x += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                w wVar2 = this.f19382d;
                Map mapC2 = wVar2.c();
                return mapC2 != null ? mapC2.keySet().remove(obj) : wVar2.h(obj) != w.F;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f19381a) {
        }
        return this.f19382d.size();
    }
}
