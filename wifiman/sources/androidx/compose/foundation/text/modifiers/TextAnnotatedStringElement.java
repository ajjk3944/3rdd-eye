package androidx.compose.foundation.text.modifiers;

import E0.V;
import L.g;
import L0.C3174d;
import L0.U;
import Q0.AbstractC3434k;
import W0.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.InterfaceC6739y0;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u00104R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00104R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00103R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "LE0/V;", "Landroidx/compose/foundation/text/modifiers/b;", "LL0/d;", "text", "LL0/U;", "style", "LQ0/k$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LL0/M;", "LYg/J;", "onTextLayout", "LW0/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LL0/d$c;", "LL0/x;", "placeholders", "Ll0/i;", "onPlaceholderLayout", "LL/g;", "selectionController", "Lm0/y0;", "color", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/text/modifiers/b;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/text/modifiers/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "LL0/d;", SnmpConfigurator.O_BIND_ADDRESS, "LL0/U;", SnmpConfigurator.O_COMMUNITY, "LQ0/k$b;", "Lmh/l;", "I", "f", "Z", "g", "h", "i", "Ljava/util/List;", "j", "k", "LL/g;", "l", "Lm0/y0;", "m", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C3174d text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final U style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3434k.b fontFamilyResolver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l onTextLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List placeholders;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l onPlaceholderLayout;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g selectionController;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6739y0 color;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l onShowTranslation;

    public /* synthetic */ TextAnnotatedStringElement(C3174d c3174d, U u10, AbstractC3434k.b bVar, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, List list, InterfaceC6835l interfaceC6835l2, g gVar, InterfaceC6739y0 interfaceC6739y0, InterfaceC6835l interfaceC6835l3, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, u10, bVar, interfaceC6835l, i10, z10, i11, i12, list, interfaceC6835l2, gVar, interfaceC6739y0, interfaceC6835l3);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.onShowTranslation, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(b node) {
        node.K2(node.X2(this.color, this.style), node.Z2(this.text), node.Y2(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), node.W2(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) other;
        return AbstractC6492s.d(this.color, textAnnotatedStringElement.color) && AbstractC6492s.d(this.text, textAnnotatedStringElement.text) && AbstractC6492s.d(this.style, textAnnotatedStringElement.style) && AbstractC6492s.d(this.placeholders, textAnnotatedStringElement.placeholders) && AbstractC6492s.d(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && t.e(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && AbstractC6492s.d(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        InterfaceC6835l interfaceC6835l = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (interfaceC6835l != null ? interfaceC6835l.hashCode() : 0)) * 31) + t.f(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        InterfaceC6835l interfaceC6835l2 = this.onPlaceholderLayout;
        int iHashCode4 = (((iHashCode3 + (interfaceC6835l2 != null ? interfaceC6835l2.hashCode() : 0)) * 31) + 0) * 31;
        InterfaceC6739y0 interfaceC6739y0 = this.color;
        int iHashCode5 = (iHashCode4 + (interfaceC6739y0 != null ? interfaceC6739y0.hashCode() : 0)) * 31;
        InterfaceC6835l interfaceC6835l3 = this.onShowTranslation;
        return iHashCode5 + (interfaceC6835l3 != null ? interfaceC6835l3.hashCode() : 0);
    }

    private TextAnnotatedStringElement(C3174d c3174d, U u10, AbstractC3434k.b bVar, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, List list, InterfaceC6835l interfaceC6835l2, g gVar, InterfaceC6739y0 interfaceC6739y0, InterfaceC6835l interfaceC6835l3) {
        this.text = c3174d;
        this.style = u10;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = interfaceC6835l;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.onPlaceholderLayout = interfaceC6835l2;
        this.color = interfaceC6739y0;
        this.onShowTranslation = interfaceC6835l3;
    }
}
