package androidx.compose.foundation;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.i1;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "LE0/V;", "Landroidx/compose/foundation/c;", "Lm0/v0;", "color", "Lm0/l0;", "brush", "", "alpha", "Lm0/i1;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "LYg/J;", "inspectorInfo", "<init>", "(JLm0/l0;FLm0/i1;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/c;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "J", SnmpConfigurator.O_BIND_ADDRESS, "Lm0/l0;", SnmpConfigurator.O_COMMUNITY, "F", "Lm0/i1;", "Lmh/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6713l0 brush;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i1 shape;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l inspectorInfo;

    public /* synthetic */ BackgroundElement(long j10, AbstractC6713l0 abstractC6713l0, float f10, i1 i1Var, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, abstractC6713l0, f10, i1Var, interfaceC6835l);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(c node) {
        node.I2(this.color);
        node.H2(this.brush);
        node.a(this.alpha);
        node.I1(this.shape);
    }

    public boolean equals(Object other) {
        BackgroundElement backgroundElement = other instanceof BackgroundElement ? (BackgroundElement) other : null;
        return backgroundElement != null && C6733v0.m(this.color, backgroundElement.color) && AbstractC6492s.d(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && AbstractC6492s.d(this.shape, backgroundElement.shape);
    }

    public int hashCode() {
        int iS = C6733v0.s(this.color) * 31;
        AbstractC6713l0 abstractC6713l0 = this.brush;
        return ((((iS + (abstractC6713l0 != null ? abstractC6713l0.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    public /* synthetic */ BackgroundElement(long j10, AbstractC6713l0 abstractC6713l0, float f10, i1 i1Var, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6733v0.f52951b.e() : j10, (i10 & 2) != 0 ? null : abstractC6713l0, f10, i1Var, interfaceC6835l, null);
    }

    private BackgroundElement(long j10, AbstractC6713l0 abstractC6713l0, float f10, i1 i1Var, InterfaceC6835l interfaceC6835l) {
        this.color = j10;
        this.brush = abstractC6713l0;
        this.alpha = f10;
        this.shape = i1Var;
        this.inspectorInfo = interfaceC6835l;
    }
}
