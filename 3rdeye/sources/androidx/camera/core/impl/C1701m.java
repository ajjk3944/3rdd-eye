package androidx.camera.core.impl;

import N7.G8;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.L0;

/* compiled from: AutoValue_StreamSpec.java */
/* renamed from: androidx.camera.core.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701m extends L0 {

    /* renamed from: b, reason: collision with root package name */
    public final Size f15085b;

    /* renamed from: c, reason: collision with root package name */
    public final C.C f15086c;

    /* renamed from: d, reason: collision with root package name */
    public final Range<Integer> f15087d;

    /* renamed from: e, reason: collision with root package name */
    public final U f15088e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15089f;

    /* compiled from: AutoValue_StreamSpec.java */
    /* renamed from: androidx.camera.core.impl.m$a */
    public static final class a extends L0.a {

        /* renamed from: a, reason: collision with root package name */
        public Size f15090a;

        /* renamed from: b, reason: collision with root package name */
        public C.C f15091b;

        /* renamed from: c, reason: collision with root package name */
        public Range<Integer> f15092c;

        /* renamed from: d, reason: collision with root package name */
        public U f15093d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f15094e;

        public final C1701m a() {
            String strS = this.f15090a == null ? " resolution" : "";
            if (this.f15091b == null) {
                strS = strS.concat(" dynamicRange");
            }
            if (this.f15092c == null) {
                strS = G8.s(strS, " expectedFrameRateRange");
            }
            if (this.f15094e == null) {
                strS = G8.s(strS, " zslDisabled");
            }
            if (strS.isEmpty()) {
                return new C1701m(this.f15090a, this.f15091b, this.f15092c, this.f15093d, this.f15094e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strS));
        }
    }

    public C1701m(Size size, C.C c10, Range range, U u8, boolean z10) {
        this.f15085b = size;
        this.f15086c = c10;
        this.f15087d = range;
        this.f15088e = u8;
        this.f15089f = z10;
    }

    @Override // androidx.camera.core.impl.L0
    public final C.C a() {
        return this.f15086c;
    }

    @Override // androidx.camera.core.impl.L0
    public final Range<Integer> b() {
        return this.f15087d;
    }

    @Override // androidx.camera.core.impl.L0
    public final U c() {
        return this.f15088e;
    }

    @Override // androidx.camera.core.impl.L0
    public final Size d() {
        return this.f15085b;
    }

    @Override // androidx.camera.core.impl.L0
    public final boolean e() {
        return this.f15089f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (!this.f15085b.equals(l02.d()) || !this.f15086c.equals(l02.a()) || !this.f15087d.equals(l02.b())) {
            return false;
        }
        U u8 = this.f15088e;
        if (u8 == null) {
            if (l02.c() != null) {
                return false;
            }
        } else if (!u8.equals(l02.c())) {
            return false;
        }
        return this.f15089f == l02.e();
    }

    @Override // androidx.camera.core.impl.L0
    public final a f() {
        a aVar = new a();
        aVar.f15090a = this.f15085b;
        aVar.f15091b = this.f15086c;
        aVar.f15092c = this.f15087d;
        aVar.f15093d = this.f15088e;
        aVar.f15094e = Boolean.valueOf(this.f15089f);
        return aVar;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f15085b.hashCode() ^ 1000003) * 1000003) ^ this.f15086c.hashCode()) * 1000003) ^ this.f15087d.hashCode()) * 1000003;
        U u8 = this.f15088e;
        return ((iHashCode ^ (u8 == null ? 0 : u8.hashCode())) * 1000003) ^ (this.f15089f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.f15085b);
        sb.append(", dynamicRange=");
        sb.append(this.f15086c);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.f15087d);
        sb.append(", implementationOptions=");
        sb.append(this.f15088e);
        sb.append(", zslDisabled=");
        return androidx.work.s.h(sb, this.f15089f, "}");
    }
}
