package androidx.compose.animation;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import org.snmp4j.util.SnmpConfigurator;
import r.H;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "LE0/V;", "Landroidx/compose/animation/m;", "Lr/H;", "LY0/r;", "animationSpec", "Lf0/c;", "alignment", "Lkotlin/Function2;", "LYg/J;", "finishedListener", "<init>", "(Lr/H;Lf0/c;Lmh/p;)V", "d", "()Landroidx/compose/animation/m;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/animation/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lr/H;", "getAnimationSpec", "()Lr/H;", SnmpConfigurator.O_BIND_ADDRESS, "Lf0/c;", "getAlignment", "()Lf0/c;", SnmpConfigurator.O_COMMUNITY, "Lmh/p;", "getFinishedListener", "()Lmh/p;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class SizeAnimationModifierElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final H animationSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final f0.c alignment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6839p finishedListener;

    public SizeAnimationModifierElement(H h10, f0.c cVar, InterfaceC6839p interfaceC6839p) {
        this.animationSpec = h10;
        this.alignment = cVar;
        this.finishedListener = interfaceC6839p;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public m a() {
        return new m(this.animationSpec, this.alignment, this.finishedListener);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(m node) {
        node.K2(this.animationSpec);
        node.L2(this.finishedListener);
        node.I2(this.alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) other;
        return AbstractC6492s.d(this.animationSpec, sizeAnimationModifierElement.animationSpec) && AbstractC6492s.d(this.alignment, sizeAnimationModifierElement.alignment) && AbstractC6492s.d(this.finishedListener, sizeAnimationModifierElement.finishedListener);
    }

    public int hashCode() {
        int iHashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        InterfaceC6839p interfaceC6839p = this.finishedListener;
        return iHashCode + (interfaceC6839p == null ? 0 : interfaceC6839p.hashCode());
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", alignment=" + this.alignment + ", finishedListener=" + this.finishedListener + ')';
    }
}
