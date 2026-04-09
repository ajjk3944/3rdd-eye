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

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00104R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u00105R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00104R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "LE0/V;", "Landroidx/compose/foundation/text/modifiers/a;", "LL0/d;", "text", "LL0/U;", "style", "LQ0/k$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LL0/M;", "LYg/J;", "onTextLayout", "LW0/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LL0/d$c;", "LL0/x;", "placeholders", "Ll0/i;", "onPlaceholderLayout", "LL/g;", "selectionController", "Lm0/y0;", "color", "<init>", "(LL0/d;LL0/U;LQ0/k$b;Lmh/l;IZIILjava/util/List;Lmh/l;LL/g;Lm0/y0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/text/modifiers/a;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/text/modifiers/a;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, "LL0/d;", SnmpConfigurator.O_BIND_ADDRESS, "LL0/U;", SnmpConfigurator.O_COMMUNITY, "LQ0/k$b;", "Lmh/l;", "I", "f", "Z", "g", "h", "i", "Ljava/util/List;", "j", "k", "LL/g;", "l", "Lm0/y0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SelectableTextAnnotatedStringElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C3174d text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final U style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC3434k.b fontFamilyResolver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6835l onTextLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int overflow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean softWrap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List placeholders;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6835l onPlaceholderLayout;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final g selectionController;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6739y0 color;

    public /* synthetic */ SelectableTextAnnotatedStringElement(C3174d c3174d, U u10, AbstractC3434k.b bVar, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, List list, InterfaceC6835l interfaceC6835l2, g gVar, InterfaceC6739y0 interfaceC6739y0, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, u10, bVar, interfaceC6835l, i10, z10, i11, i12, list, interfaceC6835l2, gVar, interfaceC6739y0);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null, 4096, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(a node) {
        node.J2(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) other;
        return AbstractC6492s.d(this.color, selectableTextAnnotatedStringElement.color) && AbstractC6492s.d(this.text, selectableTextAnnotatedStringElement.text) && AbstractC6492s.d(this.style, selectableTextAnnotatedStringElement.style) && AbstractC6492s.d(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && AbstractC6492s.d(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && t.e(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && AbstractC6492s.d(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
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
        return iHashCode4 + (interfaceC6739y0 != null ? interfaceC6739y0.hashCode() : 0);
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) t.g(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ')';
    }

    private SelectableTextAnnotatedStringElement(C3174d c3174d, U u10, AbstractC3434k.b bVar, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, List list, InterfaceC6835l interfaceC6835l2, g gVar, InterfaceC6739y0 interfaceC6739y0) {
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
    }
}
