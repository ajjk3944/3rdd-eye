package aj;

import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* renamed from: aj.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3873g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26355a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26356b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26357c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26358d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26359e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26360f;

    /* renamed from: g, reason: collision with root package name */
    private final String f26361g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f26362h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f26363i;

    /* renamed from: j, reason: collision with root package name */
    private final String f26364j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f26365k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f26366l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f26367m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f26368n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f26369o;

    /* renamed from: p, reason: collision with root package name */
    private EnumC3867a f26370p;

    public C3873g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String prettyPrintIndent, boolean z16, boolean z17, String classDiscriminator, boolean z18, boolean z19, InterfaceC3860A interfaceC3860A, boolean z20, boolean z21, boolean z22, EnumC3867a classDiscriminatorMode) {
        AbstractC6492s.i(prettyPrintIndent, "prettyPrintIndent");
        AbstractC6492s.i(classDiscriminator, "classDiscriminator");
        AbstractC6492s.i(classDiscriminatorMode, "classDiscriminatorMode");
        this.f26355a = z10;
        this.f26356b = z11;
        this.f26357c = z12;
        this.f26358d = z13;
        this.f26359e = z14;
        this.f26360f = z15;
        this.f26361g = prettyPrintIndent;
        this.f26362h = z16;
        this.f26363i = z17;
        this.f26364j = classDiscriminator;
        this.f26365k = z18;
        this.f26366l = z19;
        this.f26367m = z20;
        this.f26368n = z21;
        this.f26369o = z22;
        this.f26370p = classDiscriminatorMode;
    }

    public final boolean a() {
        return this.f26369o;
    }

    public final boolean b() {
        return this.f26365k;
    }

    public final boolean c() {
        return this.f26358d;
    }

    public final boolean d() {
        return this.f26368n;
    }

    public final String e() {
        return this.f26364j;
    }

    public final EnumC3867a f() {
        return this.f26370p;
    }

    public final boolean g() {
        return this.f26362h;
    }

    public final boolean h() {
        return this.f26367m;
    }

    public final boolean i() {
        return this.f26355a;
    }

    public final boolean j() {
        return this.f26360f;
    }

    public final boolean k() {
        return this.f26356b;
    }

    public final InterfaceC3860A l() {
        return null;
    }

    public final boolean m() {
        return this.f26359e;
    }

    public final String n() {
        return this.f26361g;
    }

    public final boolean o() {
        return this.f26366l;
    }

    public final boolean p() {
        return this.f26363i;
    }

    public final boolean q() {
        return this.f26357c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f26355a + ", ignoreUnknownKeys=" + this.f26356b + ", isLenient=" + this.f26357c + ", allowStructuredMapKeys=" + this.f26358d + ", prettyPrint=" + this.f26359e + ", explicitNulls=" + this.f26360f + ", prettyPrintIndent='" + this.f26361g + "', coerceInputValues=" + this.f26362h + ", useArrayPolymorphism=" + this.f26363i + ", classDiscriminator='" + this.f26364j + "', allowSpecialFloatingPointValues=" + this.f26365k + ", useAlternativeNames=" + this.f26366l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f26367m + ", allowTrailingComma=" + this.f26368n + ", allowComments=" + this.f26369o + ", classDiscriminatorMode=" + this.f26370p + ')';
    }

    public /* synthetic */ C3873g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, InterfaceC3860A interfaceC3860A, boolean z20, boolean z21, boolean z22, EnumC3867a enumC3867a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) != 0 ? false : z18, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : interfaceC3860A, (i10 & 8192) != 0 ? false : z20, (i10 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? EnumC3867a.POLYMORPHIC : enumC3867a);
    }
}
