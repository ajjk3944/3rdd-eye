package androidx.camera.core.impl;

import N7.C1094a9;
import androidx.camera.core.impl.InterfaceC1680b0;
import java.util.List;

/* compiled from: AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy.java */
/* renamed from: androidx.camera.core.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1687f extends InterfaceC1680b0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f15021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15022b;

    /* renamed from: c, reason: collision with root package name */
    public final List<InterfaceC1680b0.a> f15023c;

    /* renamed from: d, reason: collision with root package name */
    public final List<InterfaceC1680b0.c> f15024d;

    public C1687f(int i, int i10, List<InterfaceC1680b0.a> list, List<InterfaceC1680b0.c> list2) {
        this.f15021a = i;
        this.f15022b = i10;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f15023c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f15024d = list2;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0
    public final int a() {
        return this.f15021a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0
    public final int b() {
        return this.f15022b;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0
    public final List<InterfaceC1680b0.a> c() {
        return this.f15023c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0
    public final List<InterfaceC1680b0.c> d() {
        return this.f15024d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1680b0.b) {
            InterfaceC1680b0.b bVar = (InterfaceC1680b0.b) obj;
            if (this.f15021a == ((C1687f) bVar).f15021a) {
                C1687f c1687f = (C1687f) bVar;
                if (this.f15022b == c1687f.f15022b && this.f15023c.equals(c1687f.f15023c) && this.f15024d.equals(c1687f.f15024d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f15021a ^ 1000003) * 1000003) ^ this.f15022b) * 1000003) ^ this.f15023c.hashCode()) * 1000003) ^ this.f15024d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.f15021a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.f15022b);
        sb.append(", audioProfiles=");
        sb.append(this.f15023c);
        sb.append(", videoProfiles=");
        return C1094a9.h(sb, this.f15024d, "}");
    }
}
