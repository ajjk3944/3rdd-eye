package mq;

import com.google.android.gms.internal.measurement.b4;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f16925a;

    /* renamed from: d, reason: collision with root package name */
    public final int f16926d;

    /* renamed from: g, reason: collision with root package name */
    public final int f16927g;

    public c(d dVar, int i10, int i11) {
        this.f16925a = dVar;
        this.f16926d = i10;
        b4.h(i10, i11, dVar.a());
        this.f16927g = i11 - i10;
    }

    @Override // mq.a
    public final int a() {
        return this.f16927g;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f16927g;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, i11, ", size: "));
        }
        return this.f16925a.get(this.f16926d + i10);
    }

    @Override // mq.d, java.util.List
    public final List subList(int i10, int i11) {
        b4.h(i10, i11, this.f16927g);
        int i12 = this.f16926d;
        return new c(this.f16925a, i10 + i12, i12 + i11);
    }
}
