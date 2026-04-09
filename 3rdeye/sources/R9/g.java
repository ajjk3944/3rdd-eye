package R9;

/* compiled from: JsonConfiguration.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11799a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11800b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11801c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11802d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11803e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11804f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11805g;

    public g(boolean z10, boolean z11, boolean z12, boolean z13, String prettyPrintIndent, String classDiscriminator, boolean z14) {
        kotlin.jvm.internal.l.f(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.l.f(classDiscriminator, "classDiscriminator");
        this.f11799a = z10;
        this.f11800b = z11;
        this.f11801c = z12;
        this.f11802d = z13;
        this.f11803e = prettyPrintIndent;
        this.f11804f = classDiscriminator;
        this.f11805g = z14;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.f11799a);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.f11800b);
        sb.append(", isLenient=false, allowStructuredMapKeys=");
        sb.append(this.f11801c);
        sb.append(", prettyPrint=false, explicitNulls=");
        sb.append(this.f11802d);
        sb.append(", prettyPrintIndent='");
        sb.append(this.f11803e);
        sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.f11804f);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        return androidx.work.s.h(sb, this.f11805g, ", namingStrategy=null)");
    }
}
