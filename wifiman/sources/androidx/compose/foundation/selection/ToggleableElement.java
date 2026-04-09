package androidx.compose.foundation.selection;

import E0.V;
import J0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;
import s.InterfaceC7836I;
import y.InterfaceC8558m;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010#R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "LE0/V;", "Landroidx/compose/foundation/selection/d;", "", "value", "Ly/m;", "interactionSource", "Ls/I;", "indicationNodeFactory", "enabled", "LJ0/g;", "role", "Lkotlin/Function1;", "LYg/J;", "onValueChange", "<init>", "(ZLy/m;Ls/I;ZLJ0/g;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/selection/d;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/selection/d;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "Z", SnmpConfigurator.O_BIND_ADDRESS, "Ly/m;", SnmpConfigurator.O_COMMUNITY, "Ls/I;", "LJ0/g;", "f", "Lmh/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ToggleableElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC8558m interactionSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC7836I indicationNodeFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g role;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l onValueChange;

    public /* synthetic */ ToggleableElement(boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z11, g gVar, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, interfaceC8558m, interfaceC7836I, z11, gVar, interfaceC6835l);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d a() {
        return new d(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(d node) {
        node.g3(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ToggleableElement.class != other.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) other;
        return this.value == toggleableElement.value && AbstractC6492s.d(this.interactionSource, toggleableElement.interactionSource) && AbstractC6492s.d(this.indicationNodeFactory, toggleableElement.indicationNodeFactory) && this.enabled == toggleableElement.enabled && AbstractC6492s.d(this.role, toggleableElement.role) && this.onValueChange == toggleableElement.onValueChange;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.value) * 31;
        InterfaceC8558m interfaceC8558m = this.interactionSource;
        int iHashCode2 = (iHashCode + (interfaceC8558m != null ? interfaceC8558m.hashCode() : 0)) * 31;
        InterfaceC7836I interfaceC7836I = this.indicationNodeFactory;
        int iHashCode3 = (((iHashCode2 + (interfaceC7836I != null ? interfaceC7836I.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        g gVar = this.role;
        return ((iHashCode3 + (gVar != null ? g.l(gVar.n()) : 0)) * 31) + this.onValueChange.hashCode();
    }

    private ToggleableElement(boolean z10, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z11, g gVar, InterfaceC6835l interfaceC6835l) {
        this.value = z10;
        this.interactionSource = interfaceC8558m;
        this.indicationNodeFactory = interfaceC7836I;
        this.enabled = z11;
        this.role = gVar;
        this.onValueChange = interfaceC6835l;
    }
}
