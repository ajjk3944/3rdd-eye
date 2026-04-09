package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.m6;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1287a;

    /* renamed from: d, reason: collision with root package name */
    public int f1288d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1289g;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f1290r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f1291x;

    public /* synthetic */ h1(AbstractMap abstractMap, int i10) {
        this.f1287a = i10;
        this.f1291x = abstractMap;
        this.f1288d = -1;
    }

    public Iterator a() {
        switch (this.f1287a) {
            case 0:
                if (this.f1290r == null) {
                    this.f1290r = ((f1) this.f1291x).f1272d.entrySet().iterator();
                }
                break;
            default:
                if (this.f1290r == null) {
                    this.f1290r = ((rs.b0) this.f1291x).f21736g.entrySet().iterator();
                }
                break;
        }
        return this.f1290r;
    }

    public Iterator b() {
        if (this.f1290r == null) {
            this.f1290r = ((l6) this.f1291x).f5103g.entrySet().iterator();
        }
        return this.f1290r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1287a) {
            case 0:
                int i10 = this.f1288d + 1;
                f1 f1Var = (f1) this.f1291x;
                if (i10 >= f1Var.f1271a.size()) {
                    return !f1Var.f1272d.isEmpty() && a().hasNext();
                }
                return true;
            case 1:
                int i11 = this.f1288d + 1;
                l6 l6Var = (l6) this.f1291x;
                if (i11 >= l6Var.f5102d) {
                    return !l6Var.f5103g.isEmpty() && b().hasNext();
                }
                return true;
            default:
                return this.f1288d + 1 < ((rs.b0) this.f1291x).f21735d.size() || a().hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1287a) {
            case 0:
                this.f1289g = true;
                int i10 = this.f1288d + 1;
                this.f1288d = i10;
                f1 f1Var = (f1) this.f1291x;
                return i10 < f1Var.f1271a.size() ? (Map.Entry) f1Var.f1271a.get(this.f1288d) : (Map.Entry) a().next();
            case 1:
                this.f1289g = true;
                int i11 = this.f1288d + 1;
                this.f1288d = i11;
                l6 l6Var = (l6) this.f1291x;
                return i11 < l6Var.f5102d ? (m6) l6Var.f5101a[i11] : (Map.Entry) b().next();
            default:
                this.f1289g = true;
                int i12 = this.f1288d + 1;
                this.f1288d = i12;
                rs.b0 b0Var = (rs.b0) this.f1291x;
                return i12 < b0Var.f21735d.size() ? (Map.Entry) b0Var.f21735d.get(this.f1288d) : (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f1287a;
        AbstractMap abstractMap = this.f1291x;
        switch (i10) {
            case 0:
                f1 f1Var = (f1) abstractMap;
                if (!this.f1289g) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1289g = false;
                int i11 = f1.f1270y;
                f1Var.b();
                if (this.f1288d >= f1Var.f1271a.size()) {
                    a().remove();
                    return;
                }
                int i12 = this.f1288d;
                this.f1288d = i12 - 1;
                f1Var.h(i12);
                return;
            case 1:
                if (!this.f1289g) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1289g = false;
                l6 l6Var = (l6) abstractMap;
                l6Var.f();
                int i13 = this.f1288d;
                if (i13 >= l6Var.f5102d) {
                    b().remove();
                    return;
                } else {
                    this.f1288d = i13 - 1;
                    l6Var.d(i13);
                    return;
                }
            default:
                rs.b0 b0Var = (rs.b0) abstractMap;
                if (!this.f1289g) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f1289g = false;
                int i14 = rs.b0.f21733y;
                b0Var.b();
                if (this.f1288d >= b0Var.f21735d.size()) {
                    a().remove();
                    return;
                }
                int i15 = this.f1288d;
                this.f1288d = i15 - 1;
                b0Var.f(i15);
                return;
        }
    }

    public /* synthetic */ h1(l6 l6Var) {
        this.f1287a = 1;
        Objects.requireNonNull(l6Var);
        this.f1291x = l6Var;
        this.f1288d = -1;
    }
}
