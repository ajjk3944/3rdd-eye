package P;

import android.graphics.Rect;
import android.util.Size;
import androidx.work.s;
import java.util.UUID;

/* compiled from: AutoValue_OutConfig.java */
/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f10535a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10537c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f10538d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f10539e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10540f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10541g;

    public b(UUID uuid, int i, int i10, Rect rect, Size size, int i11, boolean z10) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f10535a = uuid;
        this.f10536b = i;
        this.f10537c = i10;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f10538d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f10539e = size;
        this.f10540f = i11;
        this.f10541g = z10;
    }

    @Override // P.f
    public final Rect a() {
        return this.f10538d;
    }

    @Override // P.f
    public final int b() {
        return this.f10537c;
    }

    @Override // P.f
    public final int c() {
        return this.f10540f;
    }

    @Override // P.f
    public final Size d() {
        return this.f10539e;
    }

    @Override // P.f
    public final int e() {
        return this.f10536b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f10535a.equals(fVar.f()) && this.f10536b == fVar.e() && this.f10537c == fVar.b() && this.f10538d.equals(fVar.a()) && this.f10539e.equals(fVar.d()) && this.f10540f == fVar.c() && this.f10541g == fVar.g() && !fVar.h();
    }

    @Override // P.f
    public final UUID f() {
        return this.f10535a;
    }

    @Override // P.f
    public final boolean g() {
        return this.f10541g;
    }

    @Override // P.f
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f10535a.hashCode() ^ 1000003) * 1000003) ^ this.f10536b) * 1000003) ^ this.f10537c) * 1000003) ^ this.f10538d.hashCode()) * 1000003) ^ this.f10539e.hashCode()) * 1000003) ^ this.f10540f) * 1000003) ^ (this.f10541g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.f10535a);
        sb.append(", getTargets=");
        sb.append(this.f10536b);
        sb.append(", getFormat=");
        sb.append(this.f10537c);
        sb.append(", getCropRect=");
        sb.append(this.f10538d);
        sb.append(", getSize=");
        sb.append(this.f10539e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f10540f);
        sb.append(", isMirroring=");
        return s.h(sb, this.f10541g, ", shouldRespectInputCropRect=false}");
    }
}
