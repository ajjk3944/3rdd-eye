package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* compiled from: AutoValue_SurfaceSizeDefinition.java */
/* renamed from: androidx.camera.core.impl.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705o extends O0 {

    /* renamed from: a, reason: collision with root package name */
    public final Size f15105a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Integer, Size> f15106b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f15107c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Integer, Size> f15108d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f15109e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Integer, Size> f15110f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<Integer, Size> f15111g;

    public C1705o(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f15105a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f15106b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f15107c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f15108d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f15109e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f15110f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f15111g = map4;
    }

    @Override // androidx.camera.core.impl.O0
    public final Size a() {
        return this.f15105a;
    }

    @Override // androidx.camera.core.impl.O0
    public final Map<Integer, Size> b() {
        return this.f15110f;
    }

    @Override // androidx.camera.core.impl.O0
    public final Size c() {
        return this.f15107c;
    }

    @Override // androidx.camera.core.impl.O0
    public final Size d() {
        return this.f15109e;
    }

    @Override // androidx.camera.core.impl.O0
    public final Map<Integer, Size> e() {
        return this.f15108d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        return this.f15105a.equals(o02.a()) && this.f15106b.equals(o02.f()) && this.f15107c.equals(o02.c()) && this.f15108d.equals(o02.e()) && this.f15109e.equals(o02.d()) && this.f15110f.equals(o02.b()) && this.f15111g.equals(o02.g());
    }

    @Override // androidx.camera.core.impl.O0
    public final Map<Integer, Size> f() {
        return this.f15106b;
    }

    @Override // androidx.camera.core.impl.O0
    public final Map<Integer, Size> g() {
        return this.f15111g;
    }

    public final int hashCode() {
        return ((((((((((((this.f15105a.hashCode() ^ 1000003) * 1000003) ^ this.f15106b.hashCode()) * 1000003) ^ this.f15107c.hashCode()) * 1000003) ^ this.f15108d.hashCode()) * 1000003) ^ this.f15109e.hashCode()) * 1000003) ^ this.f15110f.hashCode()) * 1000003) ^ this.f15111g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f15105a + ", s720pSizeMap=" + this.f15106b + ", previewSize=" + this.f15107c + ", s1440pSizeMap=" + this.f15108d + ", recordSize=" + this.f15109e + ", maximumSizeMap=" + this.f15110f + ", ultraMaximumSizeMap=" + this.f15111g + "}";
    }
}
