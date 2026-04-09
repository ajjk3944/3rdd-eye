package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.ads.zo1;
import com.google.android.gms.internal.consent_sdk.s6;
import com.google.android.gms.internal.measurement.k6;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f947a;

    /* renamed from: b, reason: collision with root package name */
    public int f948b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f949c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f951e;

    public /* synthetic */ b1(zo1 zo1Var) {
        this.f947a = 1;
        Objects.requireNonNull(zo1Var);
        this.f951e = zo1Var;
        this.f948b = -1;
    }

    public Iterator a() {
        if (this.f950d == null) {
            this.f950d = ((z0) this.f951e).f1088b.entrySet().iterator();
        }
        return this.f950d;
    }

    public Iterator b() {
        switch (this.f947a) {
            case 1:
                if (this.f950d == null) {
                    this.f950d = ((zo1) this.f951e).f19138c.entrySet().iterator();
                }
                break;
            case 2:
                if (this.f950d == null) {
                    this.f950d = ((s6) this.f951e).f19512c.entrySet().iterator();
                }
                break;
            default:
                if (this.f950d == null) {
                    this.f950d = ((k6) this.f951e).f19804c.entrySet().iterator();
                }
                break;
        }
        return this.f950d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f947a) {
            case 0:
                int i4 = this.f948b + 1;
                z0 z0Var = (z0) this.f951e;
                if (i4 >= z0Var.f1087a.size()) {
                    if (z0Var.f1088b.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
            case 1:
                int i10 = this.f948b + 1;
                zo1 zo1Var = (zo1) this.f951e;
                if (i10 >= zo1Var.f19137b) {
                    if (zo1Var.f19138c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            case 2:
                int i11 = this.f948b + 1;
                s6 s6Var = (s6) this.f951e;
                if (i11 >= s6Var.f19511b) {
                    if (s6Var.f19512c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                int i12 = this.f948b + 1;
                k6 k6Var = (k6) this.f951e;
                if (i12 >= k6Var.f19803b) {
                    if (k6Var.f19804c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f947a) {
            case 0:
                this.f949c = true;
                int i4 = this.f948b + 1;
                this.f948b = i4;
                z0 z0Var = (z0) this.f951e;
                if (i4 >= z0Var.f1087a.size()) {
                    break;
                } else {
                    break;
                }
            case 1:
                this.f949c = true;
                int i10 = this.f948b + 1;
                this.f948b = i10;
                zo1 zo1Var = (zo1) this.f951e;
                if (i10 >= zo1Var.f19137b) {
                    break;
                } else {
                    break;
                }
            case 2:
                this.f949c = true;
                int i11 = this.f948b + 1;
                this.f948b = i11;
                s6 s6Var = (s6) this.f951e;
                if (i11 >= s6Var.f19511b) {
                    break;
                } else {
                    break;
                }
            default:
                this.f949c = true;
                int i12 = this.f948b + 1;
                this.f948b = i12;
                k6 k6Var = (k6) this.f951e;
                if (i12 >= k6Var.f19803b) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i4 = this.f947a;
        AbstractMap abstractMap = this.f951e;
        switch (i4) {
            case 0:
                z0 z0Var = (z0) abstractMap;
                if (!this.f949c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f949c = false;
                int i10 = z0.f1086f;
                z0Var.b();
                if (this.f948b >= z0Var.f1087a.size()) {
                    a().remove();
                    return;
                }
                int i11 = this.f948b;
                this.f948b = i11 - 1;
                z0Var.h(i11);
                return;
            case 1:
                if (!this.f949c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f949c = false;
                zo1 zo1Var = (zo1) abstractMap;
                zo1Var.f();
                int i12 = this.f948b;
                if (i12 >= zo1Var.f19137b) {
                    b().remove();
                    return;
                } else {
                    this.f948b = i12 - 1;
                    zo1Var.d(i12);
                    return;
                }
            case 2:
                if (!this.f949c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f949c = false;
                s6 s6Var = (s6) abstractMap;
                int i13 = s6.g;
                s6Var.g();
                int i14 = this.f948b;
                if (i14 >= s6Var.f19511b) {
                    b().remove();
                    return;
                } else {
                    this.f948b = i14 - 1;
                    s6Var.e(i14);
                    return;
                }
            default:
                if (!this.f949c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f949c = false;
                k6 k6Var = (k6) abstractMap;
                k6Var.f();
                int i15 = this.f948b;
                if (i15 >= k6Var.f19803b) {
                    b().remove();
                    return;
                } else {
                    this.f948b = i15 - 1;
                    k6Var.d(i15);
                    return;
                }
        }
    }

    public /* synthetic */ b1(s6 s6Var) {
        this.f947a = 2;
        Objects.requireNonNull(s6Var);
        this.f951e = s6Var;
        this.f948b = -1;
    }

    public /* synthetic */ b1(k6 k6Var) {
        this.f947a = 3;
        Objects.requireNonNull(k6Var);
        this.f951e = k6Var;
        this.f948b = -1;
    }

    public b1(z0 z0Var) {
        this.f947a = 0;
        this.f951e = z0Var;
        this.f948b = -1;
    }
}
