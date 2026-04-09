package androidx.compose.foundation.layout;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "LE0/V;", "Landroidx/compose/foundation/layout/c;", "Lf0/c;", "alignment", "", "matchParentSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "LYg/J;", "inspectorInfo", "<init>", "(Lf0/c;ZLmh/l;)V", "d", "()Landroidx/compose/foundation/layout/c;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/layout/c;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lf0/c;", "getAlignment", "()Lf0/c;", SnmpConfigurator.O_BIND_ADDRESS, "Z", "getMatchParentSize", "()Z", SnmpConfigurator.O_COMMUNITY, "Lmh/l;", "getInspectorInfo", "()Lmh/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BoxChildDataElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f0.c alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean matchParentSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l inspectorInfo;

    public BoxChildDataElement(f0.c cVar, boolean z10, InterfaceC6835l interfaceC6835l) {
        this.alignment = cVar;
        this.matchParentSize = z10;
        this.inspectorInfo = interfaceC6835l;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.alignment, this.matchParentSize);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(c node) {
        node.G2(this.alignment);
        node.H2(this.matchParentSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = other instanceof BoxChildDataElement ? (BoxChildDataElement) other : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return AbstractC6492s.d(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.matchParentSize);
    }
}
