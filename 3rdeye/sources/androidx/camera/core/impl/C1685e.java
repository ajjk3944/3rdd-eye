package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC1680b0;

/* compiled from: AutoValue_EncoderProfilesProxy_AudioProfileProxy.java */
/* renamed from: androidx.camera.core.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1685e extends InterfaceC1680b0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15015b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15016c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15017d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15018e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15019f;

    public C1685e(int i, int i10, int i11, int i12, int i13, String str) {
        this.f15014a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f15015b = str;
        this.f15016c = i10;
        this.f15017d = i11;
        this.f15018e = i12;
        this.f15019f = i13;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.a
    public final int a() {
        return this.f15016c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.a
    public final int b() {
        return this.f15018e;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.a
    public final int c() {
        return this.f15014a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.a
    public final String d() {
        return this.f15015b;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.a
    public final int e() {
        return this.f15019f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC1680b0.a)) {
            return false;
        }
        InterfaceC1680b0.a aVar = (InterfaceC1680b0.a) obj;
        return this.f15014a == aVar.c() && this.f15015b.equals(aVar.d()) && this.f15016c == aVar.a() && this.f15017d == aVar.f() && this.f15018e == aVar.b() && this.f15019f == aVar.e();
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0.a
    public final int f() {
        return this.f15017d;
    }

    public final int hashCode() {
        return ((((((((((this.f15014a ^ 1000003) * 1000003) ^ this.f15015b.hashCode()) * 1000003) ^ this.f15016c) * 1000003) ^ this.f15017d) * 1000003) ^ this.f15018e) * 1000003) ^ this.f15019f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.f15014a);
        sb.append(", mediaType=");
        sb.append(this.f15015b);
        sb.append(", bitrate=");
        sb.append(this.f15016c);
        sb.append(", sampleRate=");
        sb.append(this.f15017d);
        sb.append(", channels=");
        sb.append(this.f15018e);
        sb.append(", profile=");
        return B4.i.j(sb, this.f15019f, "}");
    }
}
