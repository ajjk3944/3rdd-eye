package mq;

import com.google.android.gms.internal.measurement.e5;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a0 implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16921a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f16922d;

    /* renamed from: g, reason: collision with root package name */
    public int f16923g;

    public a0(Iterator it) {
        br.l.e(it, "iterator");
        this.f16922d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f16921a) {
            case 0:
                return this.f16922d.hasNext();
        }
        while (true) {
            int i10 = this.f16923g;
            it = this.f16922d;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f16923g--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f16921a) {
            case 0:
                int i10 = this.f16923g;
                this.f16923g = i10 + 1;
                if (i10 >= 0) {
                    return new z(i10, this.f16922d.next());
                }
                e5.Q();
                throw null;
        }
        while (true) {
            int i11 = this.f16923g;
            it = this.f16922d;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f16923g--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f16921a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a0(st.b bVar) {
        this.f16922d = bVar.f22277a.iterator();
        this.f16923g = bVar.f22278b;
    }
}
