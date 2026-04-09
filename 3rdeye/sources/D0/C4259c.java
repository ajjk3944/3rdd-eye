package d0;

import androidx.camera.core.impl.Q0;
import d0.AbstractC4257a;

/* compiled from: AutoValue_AudioEncoderConfig.java */
/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4259c extends AbstractC4257a {

    /* renamed from: a, reason: collision with root package name */
    public final String f37198a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37199b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0 f37200c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37201d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37202e;

    /* renamed from: f, reason: collision with root package name */
    public final int f37203f;

    /* compiled from: AutoValue_AudioEncoderConfig.java */
    /* renamed from: d0.c$a */
    public static final class a extends AbstractC4257a.AbstractC0435a {

        /* renamed from: a, reason: collision with root package name */
        public String f37204a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f37205b;

        /* renamed from: c, reason: collision with root package name */
        public Q0 f37206c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f37207d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f37208e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f37209f;
    }

    public C4259c(String str, int i, Q0 q02, int i10, int i11, int i12) {
        this.f37198a = str;
        this.f37199b = i;
        this.f37200c = q02;
        this.f37201d = i10;
        this.f37202e = i11;
        this.f37203f = i12;
    }

    @Override // d0.m
    public final Q0 b() {
        return this.f37200c;
    }

    @Override // d0.m
    public final String c() {
        return this.f37198a;
    }

    @Override // d0.AbstractC4257a
    public final int d() {
        return this.f37201d;
    }

    @Override // d0.AbstractC4257a
    public final int e() {
        return this.f37203f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4257a)) {
            return false;
        }
        AbstractC4257a abstractC4257a = (AbstractC4257a) obj;
        if (this.f37198a.equals(((C4259c) abstractC4257a).f37198a)) {
            return this.f37199b == abstractC4257a.f() && this.f37200c.equals(((C4259c) abstractC4257a).f37200c) && this.f37201d == abstractC4257a.d() && this.f37202e == abstractC4257a.g() && this.f37203f == abstractC4257a.e();
        }
        return false;
    }

    @Override // d0.AbstractC4257a
    public final int f() {
        return this.f37199b;
    }

    @Override // d0.AbstractC4257a
    public final int g() {
        return this.f37202e;
    }

    public final int hashCode() {
        return ((((((((((this.f37198a.hashCode() ^ 1000003) * 1000003) ^ this.f37199b) * 1000003) ^ this.f37200c.hashCode()) * 1000003) ^ this.f37201d) * 1000003) ^ this.f37202e) * 1000003) ^ this.f37203f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.f37198a);
        sb.append(", profile=");
        sb.append(this.f37199b);
        sb.append(", inputTimebase=");
        sb.append(this.f37200c);
        sb.append(", bitrate=");
        sb.append(this.f37201d);
        sb.append(", sampleRate=");
        sb.append(this.f37202e);
        sb.append(", channelCount=");
        return B4.i.j(sb, this.f37203f, "}");
    }
}
