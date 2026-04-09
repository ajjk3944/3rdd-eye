package androidx.compose.foundation.text.handwriting;

import E0.V;
import G.b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElementWithNegativePadding;", "LE0/V;", "LG/b;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Lmh/a;)V", "d", "()LG/b;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(LG/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lmh/a;", "getOnHandwritingSlopExceeded", "()Lmh/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class StylusHandwritingElementWithNegativePadding extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6824a onHandwritingSlopExceeded;

    public StylusHandwritingElementWithNegativePadding(InterfaceC6824a interfaceC6824a) {
        this.onHandwritingSlopExceeded = interfaceC6824a;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this.onHandwritingSlopExceeded);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(b node) {
        node.L2(this.onHandwritingSlopExceeded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StylusHandwritingElementWithNegativePadding) && AbstractC6492s.d(this.onHandwritingSlopExceeded, ((StylusHandwritingElementWithNegativePadding) other).onHandwritingSlopExceeded);
    }

    public int hashCode() {
        return this.onHandwritingSlopExceeded.hashCode();
    }

    public String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.onHandwritingSlopExceeded + ')';
    }
}
