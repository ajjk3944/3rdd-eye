package j$.util;

import j$.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public class i extends h implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f26407c;

    public i(java.util.List list) {
        super(list);
        this.f26407c = list;
    }

    public i(java.util.List list, Object obj) {
        super(list, obj);
        this.f26407c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f26403b) {
            zEquals = this.f26407c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f26403b) {
            iHashCode = this.f26407c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Object obj;
        synchronized (this.f26403b) {
            obj = this.f26407c.get(i4);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        Object obj2;
        synchronized (this.f26403b) {
            obj2 = this.f26407c.set(i4, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        synchronized (this.f26403b) {
            this.f26407c.add(i4, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        Object objRemove;
        synchronized (this.f26403b) {
            objRemove = this.f26407c.remove(i4);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.f26403b) {
            iIndexOf = this.f26407c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.f26403b) {
            iLastIndexOf = this.f26407c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i4, java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.f26403b) {
            zAddAll = this.f26407c.addAll(i4, collection);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f26407c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        return this.f26407c.listIterator(i4);
    }

    @Override // java.util.List
    public java.util.List subList(int i4, int i10) {
        i iVar;
        synchronized (this.f26403b) {
            iVar = new i(this.f26407c.subList(i4, i10), this.f26403b);
        }
        return iVar;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f26403b) {
            java.util.List list = this.f26407c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        synchronized (this.f26403b) {
            c.u(this.f26407c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.f26407c;
        return list instanceof RandomAccess ? new k(list) : this;
    }
}
