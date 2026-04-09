package lu;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15943a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15944b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15945c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15946d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15947e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15948f;

    /* renamed from: g, reason: collision with root package name */
    public final a f15949g;

    public i(boolean z10, boolean z11, boolean z12, String str, String str2, boolean z13, a aVar) {
        br.l.e(str, "prettyPrintIndent");
        br.l.e(str2, "classDiscriminator");
        br.l.e(aVar, "classDiscriminatorMode");
        this.f15943a = z10;
        this.f15944b = z11;
        this.f15945c = z12;
        this.f15946d = str;
        this.f15947e = str2;
        this.f15948f = z13;
        this.f15949g = aVar;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f15943a + ", ignoreUnknownKeys=" + this.f15944b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f15945c + ", prettyPrintIndent='" + this.f15946d + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f15947e + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f15948f + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f15949g + ')';
    }
}
