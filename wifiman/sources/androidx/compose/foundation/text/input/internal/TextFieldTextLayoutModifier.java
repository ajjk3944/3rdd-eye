package androidx.compose.foundation.text.input.internal;

import E0.V;
import I.j1;
import I.l1;
import I.o1;
import L0.U;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\"\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R0\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "LE0/V;", "LI/j1;", "LI/l1;", "textLayoutState", "LI/o1;", "textFieldState", "LL0/U;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "LY0/d;", "Lkotlin/Function0;", "LL0/M;", "LYg/J;", "onTextLayout", "<init>", "(LI/l1;LI/o1;LL0/U;ZLmh/p;)V", "d", "()LI/j1;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(LI/j1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "LI/l1;", SnmpConfigurator.O_BIND_ADDRESS, "LI/o1;", SnmpConfigurator.O_COMMUNITY, "LL0/U;", "Z", "Lmh/p;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldTextLayoutModifier extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final l1 textLayoutState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o1 textFieldState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final U textStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean singleLine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6839p onTextLayout;

    public TextFieldTextLayoutModifier(l1 l1Var, o1 o1Var, U u10, boolean z10, InterfaceC6839p interfaceC6839p) {
        this.textLayoutState = l1Var;
        this.textFieldState = o1Var;
        this.textStyle = u10;
        this.singleLine = z10;
        this.onTextLayout = interfaceC6839p;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public j1 a() {
        return new j1(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(j1 node) {
        node.D2(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) other;
        return AbstractC6492s.d(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && AbstractC6492s.d(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && AbstractC6492s.d(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.singleLine == textFieldTextLayoutModifier.singleLine && AbstractC6492s.d(this.onTextLayout, textFieldTextLayoutModifier.onTextLayout);
    }

    public int hashCode() {
        int iHashCode = ((((((this.textLayoutState.hashCode() * 31) + this.textFieldState.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
        InterfaceC6839p interfaceC6839p = this.onTextLayout;
        return iHashCode + (interfaceC6839p == null ? 0 : interfaceC6839p.hashCode());
    }

    public String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", onTextLayout=" + this.onTextLayout + ')';
    }
}
