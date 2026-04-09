package z9;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.xbill.DNS.KEYRecord;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25437a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25438b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25439c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25441e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25442f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25443g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25444h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f25445i;

    /* renamed from: j, reason: collision with root package name */
    public final String f25446j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f25447k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f25448l;

    public d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String prettyPrintIndent, boolean z16, boolean z17, String classDiscriminator, boolean z18, boolean z19) {
        kotlin.jvm.internal.p.e(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.p.e(classDiscriminator, "classDiscriminator");
        this.f25437a = z10;
        this.f25438b = z11;
        this.f25439c = z12;
        this.f25440d = z13;
        this.f25441e = z14;
        this.f25442f = z15;
        this.f25443g = prettyPrintIndent;
        this.f25444h = z16;
        this.f25445i = z17;
        this.f25446j = classDiscriminator;
        this.f25447k = z18;
        this.f25448l = z19;
    }

    public final boolean a() {
        return this.f25447k;
    }

    public final boolean b() {
        return this.f25440d;
    }

    public final String c() {
        return this.f25446j;
    }

    public final boolean d() {
        return this.f25444h;
    }

    public final boolean e() {
        return this.f25437a;
    }

    public final boolean f() {
        return this.f25442f;
    }

    public final boolean g() {
        return this.f25438b;
    }

    public final boolean h() {
        return this.f25441e;
    }

    public final String i() {
        return this.f25443g;
    }

    public final boolean j() {
        return this.f25448l;
    }

    public final boolean k() {
        return this.f25445i;
    }

    public final boolean l() {
        return this.f25439c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f25437a + ", ignoreUnknownKeys=" + this.f25438b + ", isLenient=" + this.f25439c + ", allowStructuredMapKeys=" + this.f25440d + ", prettyPrint=" + this.f25441e + ", explicitNulls=" + this.f25442f + ", prettyPrintIndent='" + this.f25443g + "', coerceInputValues=" + this.f25444h + ", useArrayPolymorphism=" + this.f25445i + ", classDiscriminator='" + this.f25446j + "', allowSpecialFloatingPointValues=" + this.f25447k + ')';
    }

    public /* synthetic */ d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, int i10, kotlin.jvm.internal.i iVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? HandleInvocationsFromAdViewer.KEY_AD_TYPE : str2, (i10 & 1024) == 0 ? z18 : false, (i10 & KEYRecord.Flags.FLAG4) != 0 ? true : z19);
    }
}
