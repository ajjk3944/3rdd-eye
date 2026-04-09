package mq;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class e0 extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16932a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16933d;

    public e0(List list) {
        br.l.e(list, "delegate");
        this.f16933d = list;
    }

    @Override // mq.a
    public final int a() {
        switch (this.f16932a) {
            case 0:
                return ((List) this.f16933d).size();
            default:
                return ((tt.j) this.f16933d).f23004a.groupCount() + 1;
        }
    }

    @Override // mq.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f16932a) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f16932a) {
            case 0:
                return ((List) this.f16933d).get(o.h0(i10, this));
            default:
                String strGroup = ((tt.j) this.f16933d).f23004a.group(i10);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // mq.d, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f16932a) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // mq.d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f16932a) {
            case 0:
                return new c0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // mq.d, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f16932a) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // mq.d, java.util.List
    public ListIterator listIterator() {
        switch (this.f16932a) {
            case 0:
                return new c0(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // mq.d, java.util.List
    public ListIterator listIterator(int i10) {
        switch (this.f16932a) {
            case 0:
                return new c0(this, i10);
            default:
                return super.listIterator(i10);
        }
    }

    public e0(tt.j jVar) {
        this.f16933d = jVar;
    }
}
