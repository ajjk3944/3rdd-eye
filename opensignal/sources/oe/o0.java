package oe;

import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19361a = 1;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f19362d;

    public /* synthetic */ o0() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19361a) {
        }
        return this.f19362d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19361a) {
        }
        return (String) this.f19362d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f19361a) {
            case 0:
                this.f19362d.remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public o0(zzbe zzbeVar) {
        this.f19362d = zzbeVar.f5404a.keySet().iterator();
    }

    public o0(Iterator it) {
        it.getClass();
        this.f19362d = it;
    }
}
