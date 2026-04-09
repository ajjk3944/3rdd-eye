package p2;

import android.graphics.PointF;
import i2.C4448h;
import i2.z;
import k2.InterfaceC5212c;
import o2.C5411b;
import o2.C5414e;
import o2.InterfaceC5418i;

/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public final class k implements InterfaceC5442b {

    /* renamed from: a, reason: collision with root package name */
    public final String f45058a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5418i<PointF, PointF> f45059b;

    /* renamed from: c, reason: collision with root package name */
    public final C5414e f45060c;

    /* renamed from: d, reason: collision with root package name */
    public final C5411b f45061d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45062e;

    public k(String str, InterfaceC5418i interfaceC5418i, C5414e c5414e, C5411b c5411b, boolean z10) {
        this.f45058a = str;
        this.f45059b = interfaceC5418i;
        this.f45060c = c5414e;
        this.f45061d = c5411b;
        this.f45062e = z10;
    }

    @Override // p2.InterfaceC5442b
    public final InterfaceC5212c a(z zVar, C4448h c4448h, q2.b bVar) {
        return new k2.o(zVar, bVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f45059b + ", size=" + this.f45060c + '}';
    }
}
