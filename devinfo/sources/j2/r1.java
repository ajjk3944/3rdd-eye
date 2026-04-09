package j2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r1 implements i2.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27303a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27304b;

    /* renamed from: c, reason: collision with root package name */
    public Float f27305c = null;

    /* renamed from: d, reason: collision with root package name */
    public Float f27306d = null;

    /* renamed from: e, reason: collision with root package name */
    public p2.i f27307e = null;

    /* renamed from: f, reason: collision with root package name */
    public p2.i f27308f = null;

    public r1(int i4, ArrayList arrayList) {
        this.f27303a = i4;
        this.f27304b = arrayList;
    }

    @Override // i2.n1
    public final boolean i() {
        return this.f27304b.contains(this);
    }
}
