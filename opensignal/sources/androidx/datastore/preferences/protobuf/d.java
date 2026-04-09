package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.y4;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1259a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1260d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int f1261g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Iterable f1262r;

    public d(y4 y4Var) {
        this.f1262r = y4Var;
        this.f1261g = y4Var.c();
    }

    public byte a() {
        try {
            byte[] bArr = ((rs.w) this.f1262r).f21779d;
            int i10 = this.f1260d;
            this.f1260d = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1259a) {
            case 0:
                if (this.f1260d < this.f1261g) {
                }
                break;
            case 1:
                if (this.f1260d < this.f1261g) {
                }
                break;
            default:
                if (this.f1260d < this.f1261g) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1259a) {
            case 0:
                int i10 = this.f1260d;
                if (i10 >= this.f1261g) {
                    throw new NoSuchElementException();
                }
                this.f1260d = i10 + 1;
                return Byte.valueOf(((g) this.f1262r).g(i10));
            case 1:
                int i11 = this.f1260d;
                if (i11 >= this.f1261g) {
                    throw new NoSuchElementException();
                }
                this.f1260d = i11 + 1;
                return Byte.valueOf(((y4) this.f1262r).b(i11));
            default:
                return Byte.valueOf(a());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1259a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public d(g gVar) {
        this.f1262r = gVar;
        this.f1261g = gVar.size();
    }

    public d(rs.w wVar) {
        this.f1262r = wVar;
        this.f1261g = wVar.f21779d.length;
    }
}
