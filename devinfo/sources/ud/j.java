package ud;

import com.google.android.gms.internal.play_billing.s;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends f {

    /* renamed from: d, reason: collision with root package name */
    public final transient s f35310d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f35311e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f35312f;

    public j(s sVar, Object[] objArr, int i4) {
        this.f35310d = sVar;
        this.f35311e = objArr;
        this.f35312f = i4;
    }

    @Override // ud.a
    public final int a(Object[] objArr) {
        return g().a(objArr);
    }

    @Override // ud.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f35310d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // ud.f
    public final d k() {
        return new i(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ac.h iterator() {
        return g().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f35312f;
    }
}
