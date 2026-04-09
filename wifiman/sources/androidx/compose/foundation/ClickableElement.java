package androidx.compose.foundation;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;
import s.InterfaceC7836I;
import y.InterfaceC8558m;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "LE0/V;", "Landroidx/compose/foundation/e;", "Ly/m;", "interactionSource", "Ls/I;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "LJ0/g;", "role", "Lkotlin/Function0;", "LYg/J;", "onClick", "<init>", "(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/e;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "Ly/m;", SnmpConfigurator.O_BIND_ADDRESS, "Ls/I;", SnmpConfigurator.O_COMMUNITY, "Z", "Ljava/lang/String;", "LJ0/g;", "f", "Lmh/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC8558m interactionSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC7836I indicationNodeFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String onClickLabel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final J0.g role;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6824a onClick;

    public /* synthetic */ ClickableElement(InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8558m, interfaceC7836I, z10, str, gVar, interfaceC6824a);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a() {
        return new e(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(e node) {
        node.d3(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || ClickableElement.class != other.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) other;
        return AbstractC6492s.d(this.interactionSource, clickableElement.interactionSource) && AbstractC6492s.d(this.indicationNodeFactory, clickableElement.indicationNodeFactory) && this.enabled == clickableElement.enabled && AbstractC6492s.d(this.onClickLabel, clickableElement.onClickLabel) && AbstractC6492s.d(this.role, clickableElement.role) && this.onClick == clickableElement.onClick;
    }

    public int hashCode() {
        InterfaceC8558m interfaceC8558m = this.interactionSource;
        int iHashCode = (interfaceC8558m != null ? interfaceC8558m.hashCode() : 0) * 31;
        InterfaceC7836I interfaceC7836I = this.indicationNodeFactory;
        int iHashCode2 = (((iHashCode + (interfaceC7836I != null ? interfaceC7836I.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        J0.g gVar = this.role;
        return ((iHashCode3 + (gVar != null ? J0.g.l(gVar.n()) : 0)) * 31) + this.onClick.hashCode();
    }

    private ClickableElement(InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a) {
        this.interactionSource = interfaceC8558m;
        this.indicationNodeFactory = interfaceC7836I;
        this.enabled = z10;
        this.onClickLabel = str;
        this.role = gVar;
        this.onClick = interfaceC6824a;
    }
}
