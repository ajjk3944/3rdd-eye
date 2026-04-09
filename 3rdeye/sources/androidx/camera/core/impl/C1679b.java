package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.U0;
import java.util.List;

/* compiled from: AutoValue_AttachedSurfaceInfo.java */
/* renamed from: androidx.camera.core.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1679b extends AbstractC1677a {

    /* renamed from: a, reason: collision with root package name */
    public final C1703n f14999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15000b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f15001c;

    /* renamed from: d, reason: collision with root package name */
    public final C.C f15002d;

    /* renamed from: e, reason: collision with root package name */
    public final List<U0.b> f15003e;

    /* renamed from: f, reason: collision with root package name */
    public final U f15004f;

    /* renamed from: g, reason: collision with root package name */
    public final Range<Integer> f15005g;

    public C1679b(C1703n c1703n, int i, Size size, C.C c10, List list, U u8, Range range) {
        if (c1703n == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f14999a = c1703n;
        this.f15000b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f15001c = size;
        if (c10 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f15002d = c10;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f15003e = list;
        this.f15004f = u8;
        this.f15005g = range;
    }

    @Override // androidx.camera.core.impl.AbstractC1677a
    public final List<U0.b> a() {
        return this.f15003e;
    }

    @Override // androidx.camera.core.impl.AbstractC1677a
    public final C.C b() {
        return this.f15002d;
    }

    @Override // androidx.camera.core.impl.AbstractC1677a
    public final int c() {
        return this.f15000b;
    }

    @Override // androidx.camera.core.impl.AbstractC1677a
    public final U d() {
        return this.f15004f;
    }

    @Override // androidx.camera.core.impl.AbstractC1677a
    public final Size e() {
        return this.f15001c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1677a)) {
            return false;
        }
        AbstractC1677a abstractC1677a = (AbstractC1677a) obj;
        if (!this.f14999a.equals(abstractC1677a.f()) || this.f15000b != abstractC1677a.c() || !this.f15001c.equals(abstractC1677a.e()) || !this.f15002d.equals(abstractC1677a.b()) || !this.f15003e.equals(abstractC1677a.a())) {
            return false;
        }
        U u8 = this.f15004f;
        if (u8 == null) {
            if (abstractC1677a.d() != null) {
                return false;
            }
        } else if (!u8.equals(abstractC1677a.d())) {
            return false;
        }
        Range<Integer> range = this.f15005g;
        return range == null ? abstractC1677a.g() == null : range.equals(abstractC1677a.g());
    }

    @Override // androidx.camera.core.impl.AbstractC1677a
    public final N0 f() {
        return this.f14999a;
    }

    @Override // androidx.camera.core.impl.AbstractC1677a
    public final Range<Integer> g() {
        return this.f15005g;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f14999a.hashCode() ^ 1000003) * 1000003) ^ this.f15000b) * 1000003) ^ this.f15001c.hashCode()) * 1000003) ^ this.f15002d.hashCode()) * 1000003) ^ this.f15003e.hashCode()) * 1000003;
        U u8 = this.f15004f;
        int iHashCode2 = (iHashCode ^ (u8 == null ? 0 : u8.hashCode())) * 1000003;
        Range<Integer> range = this.f15005g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f14999a + ", imageFormat=" + this.f15000b + ", size=" + this.f15001c + ", dynamicRange=" + this.f15002d + ", captureTypes=" + this.f15003e + ", implementationOptions=" + this.f15004f + ", targetFrameRate=" + this.f15005g + "}";
    }
}
