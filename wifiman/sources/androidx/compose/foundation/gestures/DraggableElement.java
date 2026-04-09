package androidx.compose.foundation.gestures;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;
import w.m;
import w.q;
import y.InterfaceC8558m;
import y0.C8604y;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R6\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R6\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010(¨\u0006/"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "LE0/V;", "Landroidx/compose/foundation/gestures/c;", "Lw/m;", "state", "Lw/q;", "orientation", "", "enabled", "Ly/m;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LIi/N;", "Ll0/g;", "Ldh/e;", "LYg/J;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lw/m;Lw/q;ZLy/m;ZLmh/q;Lmh/q;Z)V", "d", "()Landroidx/compose/foundation/gestures/c;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/gestures/c;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "Lw/m;", SnmpConfigurator.O_BIND_ADDRESS, "Lw/q;", SnmpConfigurator.O_COMMUNITY, "Z", "Ly/m;", "f", "Lmh/q;", "g", "h", "i", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableElement extends V {

    /* renamed from: j, reason: collision with root package name */
    private static final InterfaceC6835l f27853j = a.f27862a;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q orientation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC8558m interactionSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean startDragImmediately;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mh.q onDragStarted;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mh.q onDragStopped;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27862a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C8604y c8604y) {
            return Boolean.TRUE;
        }
    }

    public DraggableElement(m mVar, q qVar, boolean z10, InterfaceC8558m interfaceC8558m, boolean z11, mh.q qVar2, mh.q qVar3, boolean z12) {
        this.state = mVar;
        this.orientation = qVar;
        this.enabled = z10;
        this.interactionSource = interfaceC8558m;
        this.startDragImmediately = z11;
        this.onDragStarted = qVar2;
        this.onDragStopped = qVar3;
        this.reverseDirection = z12;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.state, f27853j, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(c node) {
        node.l3(this.state, f27853j, this.orientation, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DraggableElement.class != other.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) other;
        return AbstractC6492s.d(this.state, draggableElement.state) && this.orientation == draggableElement.orientation && this.enabled == draggableElement.enabled && AbstractC6492s.d(this.interactionSource, draggableElement.interactionSource) && this.startDragImmediately == draggableElement.startDragImmediately && AbstractC6492s.d(this.onDragStarted, draggableElement.onDragStarted) && AbstractC6492s.d(this.onDragStopped, draggableElement.onDragStopped) && this.reverseDirection == draggableElement.reverseDirection;
    }

    public int hashCode() {
        int iHashCode = ((((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        InterfaceC8558m interfaceC8558m = this.interactionSource;
        return ((((((((iHashCode + (interfaceC8558m != null ? interfaceC8558m.hashCode() : 0)) * 31) + Boolean.hashCode(this.startDragImmediately)) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }
}
