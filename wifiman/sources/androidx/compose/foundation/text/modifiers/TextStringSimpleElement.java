package androidx.compose.foundation.text.modifiers;

import E0.V;
import L.i;
import L0.U;
import Q0.AbstractC3434k;
import W0.t;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.InterfaceC6739y0;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "LE0/V;", "LL/i;", "", "text", "LL0/U;", "style", "LQ0/k$b;", "fontFamilyResolver", "LW0/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lm0/y0;", "color", "<init>", "(Ljava/lang/String;LL0/U;LQ0/k$b;IZIILm0/y0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()LL/i;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(LL/i;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "LL0/U;", SnmpConfigurator.O_COMMUNITY, "LQ0/k$b;", "I", "Z", "f", "g", "h", "Lm0/y0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final U style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3434k.b fontFamilyResolver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6739y0 color;

    public /* synthetic */ TextStringSimpleElement(String str, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC6739y0 interfaceC6739y0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, u10, bVar, i10, z10, i11, i12, interfaceC6739y0);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public i a() {
        return new i(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(i node) {
        node.L2(node.Q2(this.color, this.style), node.S2(this.text), node.R2(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) other;
        return AbstractC6492s.d(this.color, textStringSimpleElement.color) && AbstractC6492s.d(this.text, textStringSimpleElement.text) && AbstractC6492s.d(this.style, textStringSimpleElement.style) && AbstractC6492s.d(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && t.e(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + t.f(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        InterfaceC6739y0 interfaceC6739y0 = this.color;
        return iHashCode + (interfaceC6739y0 != null ? interfaceC6739y0.hashCode() : 0);
    }

    private TextStringSimpleElement(String str, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC6739y0 interfaceC6739y0) {
        this.text = str;
        this.style = u10;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.color = interfaceC6739y0;
    }
}
