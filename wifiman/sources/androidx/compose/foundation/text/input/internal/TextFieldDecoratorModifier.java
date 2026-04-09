package androidx.compose.foundation.text.input.internal;

import E0.V;
import F.D;
import H.b;
import H.d;
import I.e1;
import I.l1;
import I.o1;
import J.j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;
import y.InterfaceC8558m;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "LE0/V;", "LI/e1;", "LI/o1;", "textFieldState", "LI/l1;", "textLayoutState", "LJ/j;", "textFieldSelectionState", "LH/b;", "filter", "", "enabled", "readOnly", "LF/D;", "keyboardOptions", "LH/d;", "keyboardActionHandler", "singleLine", "Ly/m;", "interactionSource", "<init>", "(LI/o1;LI/l1;LJ/j;LH/b;ZZLF/D;LH/d;ZLy/m;)V", "d", "()LI/e1;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(LI/e1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "LI/o1;", SnmpConfigurator.O_BIND_ADDRESS, "LI/l1;", SnmpConfigurator.O_COMMUNITY, "LJ/j;", "LH/b;", "Z", "f", "g", "LF/D;", "h", "LH/d;", "i", "j", "Ly/m;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TextFieldDecoratorModifier extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final o1 textFieldState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final l1 textLayoutState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final j textFieldSelectionState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b filter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean readOnly;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final D keyboardOptions;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final d keyboardActionHandler;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean singleLine;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC8558m interactionSource;

    public TextFieldDecoratorModifier(o1 o1Var, l1 l1Var, j jVar, b bVar, boolean z10, boolean z11, D d10, d dVar, boolean z12, InterfaceC8558m interfaceC8558m) {
        this.textFieldState = o1Var;
        this.textLayoutState = l1Var;
        this.textFieldSelectionState = jVar;
        this.filter = bVar;
        this.enabled = z10;
        this.readOnly = z11;
        this.keyboardOptions = d10;
        this.keyboardActionHandler = dVar;
        this.singleLine = z12;
        this.interactionSource = interfaceC8558m;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e1 getNode() {
        return new e1(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(e1 node) {
        node.m3(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) other;
        return AbstractC6492s.d(this.textFieldState, textFieldDecoratorModifier.textFieldState) && AbstractC6492s.d(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && AbstractC6492s.d(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && AbstractC6492s.d(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && AbstractC6492s.d(this.keyboardOptions, textFieldDecoratorModifier.keyboardOptions) && AbstractC6492s.d(this.keyboardActionHandler, textFieldDecoratorModifier.keyboardActionHandler) && this.singleLine == textFieldDecoratorModifier.singleLine && AbstractC6492s.d(this.interactionSource, textFieldDecoratorModifier.interactionSource);
    }

    public int hashCode() {
        int iHashCode = ((((this.textFieldState.hashCode() * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31;
        b bVar = this.filter;
        int iHashCode2 = (((((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.keyboardOptions.hashCode()) * 31;
        d dVar = this.keyboardActionHandler;
        return ((((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.singleLine)) * 31) + this.interactionSource.hashCode();
    }

    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.textFieldState + ", textLayoutState=" + this.textLayoutState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", filter=" + this.filter + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActionHandler=" + this.keyboardActionHandler + ", singleLine=" + this.singleLine + ", interactionSource=" + this.interactionSource + ')';
    }
}
