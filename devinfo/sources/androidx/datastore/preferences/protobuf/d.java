package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.consent_sdk.p5;
import com.google.android.gms.internal.measurement.x4;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f956a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f957b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f958c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f959d;

    public d(p5 p5Var) {
        this.f959d = p5Var;
        this.f958c = p5Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f956a) {
            case 0:
                if (this.f957b < this.f958c) {
                }
                break;
            case 1:
                if (this.f957b < this.f958c) {
                }
                break;
            case 2:
                if (this.f957b < this.f958c) {
                }
                break;
            default:
                if (this.f957b < this.f958c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f956a) {
            case 0:
                int i4 = this.f957b;
                if (i4 >= this.f958c) {
                    throw new NoSuchElementException();
                }
                this.f957b = i4 + 1;
                return Byte.valueOf(((g) this.f959d).i(i4));
            case 1:
                int i10 = this.f957b;
                if (i10 >= this.f958c) {
                    throw new NoSuchElementException();
                }
                this.f957b = i10 + 1;
                return Byte.valueOf(((p5) this.f959d).c(i10));
            case 2:
                int i11 = this.f957b;
                if (i11 >= this.f958c) {
                    throw new NoSuchElementException();
                }
                this.f957b = i11 + 1;
                return Byte.valueOf(((x4) this.f959d).c(i11));
            default:
                int i12 = this.f957b;
                if (i12 >= this.f958c) {
                    throw new NoSuchElementException();
                }
                this.f957b = i12 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.play_billing.g1) this.f959d).c(i12));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f956a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public d(x4 x4Var) {
        this.f959d = x4Var;
        this.f958c = x4Var.d();
    }

    public d(com.google.android.gms.internal.play_billing.g1 g1Var) {
        this.f959d = g1Var;
        this.f958c = g1Var.d();
    }

    public d(g gVar) {
        this.f959d = gVar;
        this.f958c = gVar.size();
    }
}
