package p2;

import N7.H7;
import i2.C4448h;
import i2.z;
import k2.InterfaceC5212c;
import o2.C5412c;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class q implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final String f45081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45082b;

    /* renamed from: c, reason: collision with root package name */
    public final C5412c f45083c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45084d;

    public q(String str, int i, C5412c c5412c, boolean z10) {
        this.f45081a = str;
        this.f45082b = i;
        this.f45083c = c5412c;
        this.f45084d = z10;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new k2.r(zVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f45081a);
        sb.append(", index=");
        return H7.p(sb, this.f45082b, '}');
    }
}
