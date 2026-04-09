package androidx.camera.core.impl;

import N7.G8;
import androidx.camera.core.impl.H0;
import java.util.List;

/* compiled from: AutoValue_SessionConfig_OutputConfig.java */
/* renamed from: androidx.camera.core.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1697k extends H0.f {

    /* renamed from: a, reason: collision with root package name */
    public final X f15064a;

    /* renamed from: b, reason: collision with root package name */
    public final List<X> f15065b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15066c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15067d;

    /* renamed from: e, reason: collision with root package name */
    public final C.C f15068e;

    /* compiled from: AutoValue_SessionConfig_OutputConfig.java */
    /* renamed from: androidx.camera.core.impl.k$a */
    public static final class a extends H0.f.a {

        /* renamed from: a, reason: collision with root package name */
        public X f15069a;

        /* renamed from: b, reason: collision with root package name */
        public List<X> f15070b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f15071c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f15072d;

        /* renamed from: e, reason: collision with root package name */
        public C.C f15073e;

        public final C1697k a() {
            String strS = this.f15069a == null ? " surface" : "";
            if (this.f15070b == null) {
                strS = strS.concat(" sharedSurfaces");
            }
            if (this.f15071c == null) {
                strS = G8.s(strS, " mirrorMode");
            }
            if (this.f15072d == null) {
                strS = G8.s(strS, " surfaceGroupId");
            }
            if (this.f15073e == null) {
                strS = G8.s(strS, " dynamicRange");
            }
            if (strS.isEmpty()) {
                return new C1697k(this.f15069a, this.f15070b, this.f15071c.intValue(), this.f15072d.intValue(), this.f15073e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strS));
        }
    }

    public C1697k(X x10, List list, int i, int i10, C.C c10) {
        this.f15064a = x10;
        this.f15065b = list;
        this.f15066c = i;
        this.f15067d = i10;
        this.f15068e = c10;
    }

    @Override // androidx.camera.core.impl.H0.f
    public final C.C b() {
        return this.f15068e;
    }

    @Override // androidx.camera.core.impl.H0.f
    public final int c() {
        return this.f15066c;
    }

    @Override // androidx.camera.core.impl.H0.f
    public final String d() {
        return null;
    }

    @Override // androidx.camera.core.impl.H0.f
    public final List<X> e() {
        return this.f15065b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H0.f)) {
            return false;
        }
        H0.f fVar = (H0.f) obj;
        return this.f15064a.equals(fVar.f()) && this.f15065b.equals(fVar.e()) && fVar.d() == null && this.f15066c == fVar.c() && this.f15067d == fVar.g() && this.f15068e.equals(fVar.b());
    }

    @Override // androidx.camera.core.impl.H0.f
    public final X f() {
        return this.f15064a;
    }

    @Override // androidx.camera.core.impl.H0.f
    public final int g() {
        return this.f15067d;
    }

    public final int hashCode() {
        return ((((((((this.f15064a.hashCode() ^ 1000003) * 1000003) ^ this.f15065b.hashCode()) * (-721379959)) ^ this.f15066c) * 1000003) ^ this.f15067d) * 1000003) ^ this.f15068e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f15064a + ", sharedSurfaces=" + this.f15065b + ", physicalCameraId=null, mirrorMode=" + this.f15066c + ", surfaceGroupId=" + this.f15067d + ", dynamicRange=" + this.f15068e + "}";
    }
}
