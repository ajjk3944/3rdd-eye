package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC1680b0;

/* compiled from: AutoValue_EncoderProfilesProxy_VideoProfileProxy.java */
/* renamed from: androidx.camera.core.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689g extends InterfaceC1680b0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f15025a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15026b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15027c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15028d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15029e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15030f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15031g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15032h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15033j;

    public C1689g(int i, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f15025a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f15026b = str;
        this.f15027c = i10;
        this.f15028d = i11;
        this.f15029e = i12;
        this.f15030f = i13;
        this.f15031g = i14;
        this.f15032h = i15;
        this.i = i16;
        this.f15033j = i17;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final int a() {
        return this.f15032h;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final int b() {
        return this.f15027c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final int c() {
        return this.i;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final int d() {
        return this.f15025a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final int e() {
        return this.f15028d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC1680b0.c)) {
            return false;
        }
        InterfaceC1680b0.c cVar = (InterfaceC1680b0.c) obj;
        return this.f15025a == cVar.d() && this.f15026b.equals(cVar.h()) && this.f15027c == cVar.b() && this.f15028d == cVar.e() && this.f15029e == cVar.j() && this.f15030f == cVar.g() && this.f15031g == cVar.i() && this.f15032h == cVar.a() && this.i == cVar.c() && this.f15033j == cVar.f();
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final int f() {
        return this.f15033j;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final int g() {
        return this.f15030f;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final String h() {
        return this.f15026b;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f15025a ^ 1000003) * 1000003) ^ this.f15026b.hashCode()) * 1000003) ^ this.f15027c) * 1000003) ^ this.f15028d) * 1000003) ^ this.f15029e) * 1000003) ^ this.f15030f) * 1000003) ^ this.f15031g) * 1000003) ^ this.f15032h) * 1000003) ^ this.i) * 1000003) ^ this.f15033j;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final int i() {
        return this.f15031g;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.c
    public final int j() {
        return this.f15029e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.f15025a);
        sb.append(", mediaType=");
        sb.append(this.f15026b);
        sb.append(", bitrate=");
        sb.append(this.f15027c);
        sb.append(", frameRate=");
        sb.append(this.f15028d);
        sb.append(", width=");
        sb.append(this.f15029e);
        sb.append(", height=");
        sb.append(this.f15030f);
        sb.append(", profile=");
        sb.append(this.f15031g);
        sb.append(", bitDepth=");
        sb.append(this.f15032h);
        sb.append(", chromaSubsampling=");
        sb.append(this.i);
        sb.append(", hdrFormat=");
        return B4.i.j(sb, this.f15033j, "}");
    }
}
