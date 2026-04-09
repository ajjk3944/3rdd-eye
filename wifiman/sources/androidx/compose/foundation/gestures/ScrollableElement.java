package androidx.compose.foundation.gestures;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;
import s.S;
import w.InterfaceC8243d;
import w.n;
import w.q;
import w.y;
import y.InterfaceC8558m;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b0\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "LE0/V;", "Landroidx/compose/foundation/gestures/f;", "Lw/y;", "state", "Lw/q;", "orientation", "Ls/S;", "overscrollEffect", "", "enabled", "reverseDirection", "Lw/n;", "flingBehavior", "Ly/m;", "interactionSource", "Lw/d;", "bringIntoViewSpec", "<init>", "(Lw/y;Lw/q;Ls/S;ZZLw/n;Ly/m;Lw/d;)V", "d", "()Landroidx/compose/foundation/gestures/f;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/gestures/f;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lw/y;", "getState", "()Lw/y;", SnmpConfigurator.O_BIND_ADDRESS, "Lw/q;", "getOrientation", "()Lw/q;", SnmpConfigurator.O_COMMUNITY, "Ls/S;", "getOverscrollEffect", "()Ls/S;", "Z", "getEnabled", "()Z", "getReverseDirection", "f", "Lw/n;", "getFlingBehavior", "()Lw/n;", "g", "Ly/m;", "getInteractionSource", "()Ly/m;", "h", "Lw/d;", "getBringIntoViewSpec", "()Lw/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q orientation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final S overscrollEffect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseDirection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n flingBehavior;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC8558m interactionSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC8243d bringIntoViewSpec;

    public ScrollableElement(y yVar, q qVar, S s10, boolean z10, boolean z11, n nVar, InterfaceC8558m interfaceC8558m, InterfaceC8243d interfaceC8243d) {
        this.state = yVar;
        this.orientation = qVar;
        this.overscrollEffect = s10;
        this.enabled = z10;
        this.reverseDirection = z11;
        this.flingBehavior = nVar;
        this.interactionSource = interfaceC8558m;
        this.bringIntoViewSpec = interfaceC8243d;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f a() {
        return new f(this.state, this.overscrollEffect, this.flingBehavior, this.orientation, this.enabled, this.reverseDirection, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(f node) {
        node.k3(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) other;
        return AbstractC6492s.d(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && AbstractC6492s.d(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && AbstractC6492s.d(this.flingBehavior, scrollableElement.flingBehavior) && AbstractC6492s.d(this.interactionSource, scrollableElement.interactionSource) && AbstractC6492s.d(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec);
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        S s10 = this.overscrollEffect;
        int iHashCode2 = (((((iHashCode + (s10 != null ? s10.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        n nVar = this.flingBehavior;
        int iHashCode3 = (iHashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        InterfaceC8558m interfaceC8558m = this.interactionSource;
        int iHashCode4 = (iHashCode3 + (interfaceC8558m != null ? interfaceC8558m.hashCode() : 0)) * 31;
        InterfaceC8243d interfaceC8243d = this.bringIntoViewSpec;
        return iHashCode4 + (interfaceC8243d != null ? interfaceC8243d.hashCode() : 0);
    }
}
