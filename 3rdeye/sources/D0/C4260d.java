package d0;

import N7.G8;
import android.util.Size;
import androidx.camera.core.impl.Q0;
import d0.AbstractC4254A;

/* compiled from: AutoValue_VideoEncoderConfig.java */
/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4260d extends AbstractC4254A {

    /* renamed from: a, reason: collision with root package name */
    public final String f37210a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37211b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0 f37212c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f37213d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37214e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC4255B f37215f;

    /* renamed from: g, reason: collision with root package name */
    public final int f37216g;

    /* renamed from: h, reason: collision with root package name */
    public final int f37217h;
    public final int i;

    /* compiled from: AutoValue_VideoEncoderConfig.java */
    /* renamed from: d0.d$a */
    public static final class a extends AbstractC4254A.a {

        /* renamed from: a, reason: collision with root package name */
        public String f37218a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f37219b;

        /* renamed from: c, reason: collision with root package name */
        public Q0 f37220c;

        /* renamed from: d, reason: collision with root package name */
        public Size f37221d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f37222e;

        /* renamed from: f, reason: collision with root package name */
        public AbstractC4255B f37223f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f37224g;

        /* renamed from: h, reason: collision with root package name */
        public Integer f37225h;
        public Integer i;

        public final C4260d a() {
            String strS = this.f37218a == null ? " mimeType" : "";
            if (this.f37220c == null) {
                strS = G8.s(strS, " inputTimebase");
            }
            if (this.f37221d == null) {
                strS = G8.s(strS, " resolution");
            }
            if (this.f37223f == null) {
                strS = G8.s(strS, " dataSpace");
            }
            if (this.f37224g == null) {
                strS = G8.s(strS, " frameRate");
            }
            if (this.i == null) {
                strS = G8.s(strS, " bitrate");
            }
            if (strS.isEmpty()) {
                return new C4260d(this.f37218a, this.f37219b.intValue(), this.f37220c, this.f37221d, this.f37222e.intValue(), this.f37223f, this.f37224g.intValue(), this.f37225h.intValue(), this.i.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strS));
        }
    }

    public C4260d(String str, int i, Q0 q02, Size size, int i10, AbstractC4255B abstractC4255B, int i11, int i12, int i13) {
        this.f37210a = str;
        this.f37211b = i;
        this.f37212c = q02;
        this.f37213d = size;
        this.f37214e = i10;
        this.f37215f = abstractC4255B;
        this.f37216g = i11;
        this.f37217h = i12;
        this.i = i13;
    }

    @Override // d0.m
    public final Q0 b() {
        return this.f37212c;
    }

    @Override // d0.m
    public final String c() {
        return this.f37210a;
    }

    @Override // d0.AbstractC4254A
    public final int e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4254A)) {
            return false;
        }
        AbstractC4254A abstractC4254A = (AbstractC4254A) obj;
        if (this.f37210a.equals(((C4260d) abstractC4254A).f37210a)) {
            return this.f37211b == abstractC4254A.j() && this.f37212c.equals(((C4260d) abstractC4254A).f37212c) && this.f37213d.equals(abstractC4254A.k()) && this.f37214e == abstractC4254A.f() && this.f37215f.equals(abstractC4254A.g()) && this.f37216g == abstractC4254A.h() && this.f37217h == abstractC4254A.i() && this.i == abstractC4254A.e();
        }
        return false;
    }

    @Override // d0.AbstractC4254A
    public final int f() {
        return this.f37214e;
    }

    @Override // d0.AbstractC4254A
    public final AbstractC4255B g() {
        return this.f37215f;
    }

    @Override // d0.AbstractC4254A
    public final int h() {
        return this.f37216g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f37210a.hashCode() ^ 1000003) * 1000003) ^ this.f37211b) * 1000003) ^ this.f37212c.hashCode()) * 1000003) ^ this.f37213d.hashCode()) * 1000003) ^ this.f37214e) * 1000003) ^ this.f37215f.hashCode()) * 1000003) ^ this.f37216g) * 1000003) ^ this.f37217h) * 1000003) ^ this.i;
    }

    @Override // d0.AbstractC4254A
    public final int i() {
        return this.f37217h;
    }

    @Override // d0.AbstractC4254A
    public final int j() {
        return this.f37211b;
    }

    @Override // d0.AbstractC4254A
    public final Size k() {
        return this.f37213d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.f37210a);
        sb.append(", profile=");
        sb.append(this.f37211b);
        sb.append(", inputTimebase=");
        sb.append(this.f37212c);
        sb.append(", resolution=");
        sb.append(this.f37213d);
        sb.append(", colorFormat=");
        sb.append(this.f37214e);
        sb.append(", dataSpace=");
        sb.append(this.f37215f);
        sb.append(", frameRate=");
        sb.append(this.f37216g);
        sb.append(", IFrameInterval=");
        sb.append(this.f37217h);
        sb.append(", bitrate=");
        return B4.i.j(sb, this.i, "}");
    }
}
