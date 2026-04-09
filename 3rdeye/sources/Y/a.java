package Y;

import androidx.camera.core.impl.InterfaceC1680b0;
import java.util.List;

/* compiled from: AutoValue_VideoValidatedEncoderProfilesProxy.java */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final int f13688a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13689b;

    /* renamed from: c, reason: collision with root package name */
    public final List<InterfaceC1680b0.a> f13690c;

    /* renamed from: d, reason: collision with root package name */
    public final List<InterfaceC1680b0.c> f13691d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1680b0.a f13692e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1680b0.c f13693f;

    public a(int i, int i10, List<InterfaceC1680b0.a> list, List<InterfaceC1680b0.c> list2, InterfaceC1680b0.a aVar, InterfaceC1680b0.c cVar) {
        this.f13688a = i;
        this.f13689b = i10;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f13690c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f13691d = list2;
        this.f13692e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f13693f = cVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0
    public final int a() {
        return this.f13688a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0
    public final int b() {
        return this.f13689b;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0
    public final List<InterfaceC1680b0.a> c() {
        return this.f13690c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1680b0
    public final List<InterfaceC1680b0.c> d() {
        return this.f13691d;
    }

    @Override // Y.f
    public final InterfaceC1680b0.a e() {
        return this.f13692e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        a aVar = (a) fVar;
        if (this.f13688a != aVar.f13688a) {
            return false;
        }
        if (this.f13689b != aVar.f13689b || !this.f13690c.equals(aVar.f13690c) || !this.f13691d.equals(aVar.f13691d)) {
            return false;
        }
        InterfaceC1680b0.a aVar2 = this.f13692e;
        if (aVar2 == null) {
            if (fVar.e() != null) {
                return false;
            }
        } else if (!aVar2.equals(fVar.e())) {
            return false;
        }
        return this.f13693f.equals(fVar.f());
    }

    @Override // Y.f
    public final InterfaceC1680b0.c f() {
        return this.f13693f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f13688a ^ 1000003) * 1000003) ^ this.f13689b) * 1000003) ^ this.f13690c.hashCode()) * 1000003) ^ this.f13691d.hashCode()) * 1000003;
        InterfaceC1680b0.a aVar = this.f13692e;
        return ((iHashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f13693f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f13688a + ", recommendedFileFormat=" + this.f13689b + ", audioProfiles=" + this.f13690c + ", videoProfiles=" + this.f13691d + ", defaultAudioProfile=" + this.f13692e + ", defaultVideoProfile=" + this.f13693f + "}";
    }
}
