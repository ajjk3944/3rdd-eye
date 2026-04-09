package androidx.compose.foundation;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.i1;
import org.snmp4j.util.SnmpConfigurator;
import s.C7845f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "LE0/V;", "Ls/f;", "LY0/h;", "width", "Lm0/l0;", "brush", "Lm0/i1;", "shape", "<init>", "(FLm0/l0;Lm0/i1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Ls/f;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ls/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "F", "getWidth-D9Ej5fM", "()F", SnmpConfigurator.O_BIND_ADDRESS, "Lm0/l0;", "getBrush", "()Lm0/l0;", SnmpConfigurator.O_COMMUNITY, "Lm0/i1;", "getShape", "()Lm0/i1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BorderModifierNodeElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6713l0 brush;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i1 shape;

    public /* synthetic */ BorderModifierNodeElement(float f10, AbstractC6713l0 abstractC6713l0, i1 i1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, abstractC6713l0, i1Var);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C7845f a() {
        return new C7845f(this.width, this.brush, this.shape, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(C7845f node) {
        node.R2(this.width);
        node.Q2(this.brush);
        node.I1(this.shape);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) other;
        return Y0.h.n(this.width, borderModifierNodeElement.width) && AbstractC6492s.d(this.brush, borderModifierNodeElement.brush) && AbstractC6492s.d(this.shape, borderModifierNodeElement.shape);
    }

    public int hashCode() {
        return (((Y0.h.p(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) Y0.h.r(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + ')';
    }

    private BorderModifierNodeElement(float f10, AbstractC6713l0 abstractC6713l0, i1 i1Var) {
        this.width = f10;
        this.brush = abstractC6713l0;
        this.shape = i1Var;
    }
}
