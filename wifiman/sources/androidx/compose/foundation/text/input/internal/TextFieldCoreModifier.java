package androidx.compose.foundation.text.input.internal;

import E0.V;
import I.c1;
import I.l1;
import I.o1;
import J.j;
import androidx.compose.foundation.o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6713l0;
import org.snmp4j.util.SnmpConfigurator;
import w.q;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010&R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldCoreModifier;", "LE0/V;", "LI/c1;", "", "isFocused", "isDragHovered", "LI/l1;", "textLayoutState", "LI/o1;", "textFieldState", "LJ/j;", "textFieldSelectionState", "Lm0/l0;", "cursorBrush", "writeable", "Landroidx/compose/foundation/o;", "scrollState", "Lw/q;", "orientation", "<init>", "(ZZLI/l1;LI/o1;LJ/j;Lm0/l0;ZLandroidx/compose/foundation/o;Lw/q;)V", "d", "()LI/c1;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(LI/c1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Z", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "LI/l1;", "LI/o1;", "LJ/j;", "f", "Lm0/l0;", "g", "h", "Landroidx/compose/foundation/o;", "i", "Lw/q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldCoreModifier extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFocused;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDragHovered;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l1 textLayoutState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final o1 textFieldState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final j textFieldSelectionState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6713l0 cursorBrush;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean writeable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final o scrollState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final q orientation;

    public TextFieldCoreModifier(boolean z10, boolean z11, l1 l1Var, o1 o1Var, j jVar, AbstractC6713l0 abstractC6713l0, boolean z12, o oVar, q qVar) {
        this.isFocused = z10;
        this.isDragHovered = z11;
        this.textLayoutState = l1Var;
        this.textFieldState = o1Var;
        this.textFieldSelectionState = jVar;
        this.cursorBrush = abstractC6713l0;
        this.writeable = z12;
        this.scrollState = oVar;
        this.orientation = qVar;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c1 getNode() {
        return new c1(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(c1 node) {
        node.X2(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) other;
        return this.isFocused == textFieldCoreModifier.isFocused && this.isDragHovered == textFieldCoreModifier.isDragHovered && AbstractC6492s.d(this.textLayoutState, textFieldCoreModifier.textLayoutState) && AbstractC6492s.d(this.textFieldState, textFieldCoreModifier.textFieldState) && AbstractC6492s.d(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && AbstractC6492s.d(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && AbstractC6492s.d(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isFocused) * 31) + Boolean.hashCode(this.isDragHovered)) * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31) + this.cursorBrush.hashCode()) * 31) + Boolean.hashCode(this.writeable)) * 31) + this.scrollState.hashCode()) * 31) + this.orientation.hashCode();
    }

    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", isDragHovered=" + this.isDragHovered + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ')';
    }
}
