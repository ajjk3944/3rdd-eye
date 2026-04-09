package vk;

import g1.c0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends zj.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36279a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36280b;

    public d(List list) {
        nk.k.e(list, "delegate");
        this.f36280b = list;
    }

    @Override // zj.a, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f36279a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i4) {
        switch (this.f36279a) {
            case 0:
                String strGroup = ((f) this.f36280b).f36283a.group(i4);
                return strGroup == null ? "" : strGroup;
            default:
                List list = (List) this.f36280b;
                if (i4 >= 0 && i4 <= cm.g.r(this)) {
                    return list.get(cm.g.r(this) - i4);
                }
                StringBuilder sbW = u.w(i4, "Element index ", " must be in range [");
                sbW.append(new sk.d(0, cm.g.r(this), 1));
                sbW.append("].");
                throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    @Override // zj.a
    public final int getSize() {
        switch (this.f36279a) {
            case 0:
                return ((f) this.f36280b).f36283a.groupCount() + 1;
            default:
                return ((List) this.f36280b).size();
        }
    }

    @Override // zj.e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f36279a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // zj.e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f36279a) {
            case 1:
                return new c0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // zj.e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f36279a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // zj.e, java.util.List
    public ListIterator listIterator() {
        switch (this.f36279a) {
            case 1:
                return new c0(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // zj.e, java.util.List
    public ListIterator listIterator(int i4) {
        switch (this.f36279a) {
            case 1:
                return new c0(this, i4);
            default:
                return super.listIterator(i4);
        }
    }

    public d(f fVar) {
        this.f36280b = fVar;
    }
}
