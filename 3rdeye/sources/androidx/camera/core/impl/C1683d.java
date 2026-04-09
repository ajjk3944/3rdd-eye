package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.U;

/* compiled from: AutoValue_Config_Option.java */
/* renamed from: androidx.camera.core.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1683d<T> extends U.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f15010a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f15011b;

    /* renamed from: c, reason: collision with root package name */
    public final CaptureRequest.Key f15012c;

    public C1683d(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f15010a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f15011b = cls;
        this.f15012c = key;
    }

    @Override // androidx.camera.core.impl.U.a
    public final String b() {
        return this.f15010a;
    }

    @Override // androidx.camera.core.impl.U.a
    public final Object c() {
        return this.f15012c;
    }

    @Override // androidx.camera.core.impl.U.a
    public final Class<T> d() {
        return this.f15011b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U.a)) {
            return false;
        }
        U.a aVar = (U.a) obj;
        if (!this.f15010a.equals(aVar.b()) || !this.f15011b.equals(aVar.d())) {
            return false;
        }
        CaptureRequest.Key key = this.f15012c;
        return key == null ? aVar.c() == null : key.equals(aVar.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.f15010a.hashCode() ^ 1000003) * 1000003) ^ this.f15011b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.f15012c;
        return iHashCode ^ (key == null ? 0 : key.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.f15010a + ", valueClass=" + this.f15011b + ", token=" + this.f15012c + "}";
    }
}
