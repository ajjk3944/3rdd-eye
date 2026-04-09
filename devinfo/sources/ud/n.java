package ud;

import com.google.android.gms.internal.measurement.z3;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f35321i;
    public static final n j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f35322d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f35323e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f35324f;
    public final transient int g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f35325h;

    static {
        Object[] objArr = new Object[0];
        f35321i = objArr;
        j = new n(0, 0, 0, objArr, objArr);
    }

    public n(int i4, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f35322d = objArr;
        this.f35323e = i4;
        this.f35324f = objArr2;
        this.g = i10;
        this.f35325h = i11;
    }

    @Override // ud.a
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f35322d;
        int i4 = this.f35325h;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // ud.a
    public final Object[] c() {
        return this.f35322d;
    }

    @Override // ud.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f35324f;
            if (objArr.length != 0) {
                int iV = z3.v(obj.hashCode());
                while (true) {
                    int i4 = iV & this.g;
                    Object obj2 = objArr[i4];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iV = i4 + 1;
                }
            }
        }
        return false;
    }

    @Override // ud.a
    public final int d() {
        return this.f35325h;
    }

    @Override // ud.a
    public final int f() {
        return 0;
    }

    @Override // ud.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f35323e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // ud.f
    public final d k() {
        return d.g(this.f35322d, this.f35325h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f35325h;
    }
}
