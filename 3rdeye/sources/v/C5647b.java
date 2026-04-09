package v;

import android.util.Size;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U0;
import java.util.ArrayList;
import java.util.List;
import v.C5664t;

/* compiled from: AutoValue_Camera2CameraImpl_UseCaseInfo.java */
/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5647b extends C5664t.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f46669a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f46670b;

    /* renamed from: c, reason: collision with root package name */
    public final H0 f46671c;

    /* renamed from: d, reason: collision with root package name */
    public final T0<?> f46672d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f46673e;

    /* renamed from: f, reason: collision with root package name */
    public final L0 f46674f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f46675g;

    public C5647b(String str, Class cls, H0 h02, T0 t02, Size size, L0 l02, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f46669a = str;
        this.f46670b = cls;
        if (h02 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f46671c = h02;
        if (t02 == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f46672d = t02;
        this.f46673e = size;
        this.f46674f = l02;
        this.f46675g = arrayList;
    }

    @Override // v.C5664t.h
    public final List<U0.b> a() {
        return this.f46675g;
    }

    @Override // v.C5664t.h
    public final H0 b() {
        return this.f46671c;
    }

    @Override // v.C5664t.h
    public final L0 c() {
        return this.f46674f;
    }

    @Override // v.C5664t.h
    public final Size d() {
        return this.f46673e;
    }

    @Override // v.C5664t.h
    public final T0<?> e() {
        return this.f46672d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5664t.h)) {
            return false;
        }
        C5664t.h hVar = (C5664t.h) obj;
        if (!this.f46669a.equals(hVar.f()) || !this.f46670b.equals(hVar.g()) || !this.f46671c.equals(hVar.b()) || !this.f46672d.equals(hVar.e())) {
            return false;
        }
        Size size = this.f46673e;
        if (size == null) {
            if (hVar.d() != null) {
                return false;
            }
        } else if (!size.equals(hVar.d())) {
            return false;
        }
        L0 l02 = this.f46674f;
        if (l02 == null) {
            if (hVar.c() != null) {
                return false;
            }
        } else if (!l02.equals(hVar.c())) {
            return false;
        }
        ArrayList arrayList = this.f46675g;
        return arrayList == null ? hVar.a() == null : arrayList.equals(hVar.a());
    }

    @Override // v.C5664t.h
    public final String f() {
        return this.f46669a;
    }

    @Override // v.C5664t.h
    public final Class<?> g() {
        return this.f46670b;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f46669a.hashCode() ^ 1000003) * 1000003) ^ this.f46670b.hashCode()) * 1000003) ^ this.f46671c.hashCode()) * 1000003) ^ this.f46672d.hashCode()) * 1000003;
        Size size = this.f46673e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        L0 l02 = this.f46674f;
        int iHashCode3 = (iHashCode2 ^ (l02 == null ? 0 : l02.hashCode())) * 1000003;
        ArrayList arrayList = this.f46675g;
        return iHashCode3 ^ (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f46669a + ", useCaseType=" + this.f46670b + ", sessionConfig=" + this.f46671c + ", useCaseConfig=" + this.f46672d + ", surfaceResolution=" + this.f46673e + ", streamSpec=" + this.f46674f + ", captureTypes=" + this.f46675g + "}";
    }
}
