package i4;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class m extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f20610b;

    public /* synthetic */ m(o oVar, int i) {
        this.f20609a = i;
        this.f20610b = oVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f20609a) {
            case 0:
                this.f20610b.clear();
                break;
            default:
                this.f20610b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        n nVarA;
        switch (this.f20609a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                o oVar = this.f20610b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                n nVar = null;
                if (key != null) {
                    try {
                        nVarA = oVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    nVarA = null;
                }
                if (nVarA != null && Objects.equals(nVarA.f20618h, entry.getValue())) {
                    nVar = nVarA;
                }
                return nVar != null;
            default:
                return this.f20610b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f20609a) {
            case 0:
                return new l(this.f20610b, 0);
            default:
                return new l(this.f20610b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        n nVarA;
        switch (this.f20609a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    o oVar = this.f20610b;
                    n nVar = null;
                    if (key != null) {
                        try {
                            nVarA = oVar.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        nVarA = null;
                    }
                    if (nVarA != null && Objects.equals(nVarA.f20618h, entry.getValue())) {
                        nVar = nVarA;
                    }
                    if (nVar != null) {
                        oVar.c(nVar, true);
                        break;
                    }
                }
                break;
            default:
                o oVar2 = this.f20610b;
                n nVarA2 = null;
                if (obj != null) {
                    try {
                        nVarA2 = oVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (nVarA2 != null) {
                    oVar2.c(nVarA2, true);
                }
                if (nVarA2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f20609a) {
        }
        return this.f20610b.f20622d;
    }
}
