package androidx.compose.foundation.layout;

import C0.AbstractC2521a;
import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "LE0/V;", "Landroidx/compose/foundation/layout/b;", "LC0/a;", "alignmentLine", "LY0/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "LYg/J;", "inspectorInfo", "<init>", "(LC0/a;FFLmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/b;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/layout/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "LC0/a;", "getAlignmentLine", "()LC0/a;", SnmpConfigurator.O_BIND_ADDRESS, "F", "getBefore-D9Ej5fM", "()F", SnmpConfigurator.O_COMMUNITY, "getAfter-D9Ej5fM", "Lmh/l;", "getInspectorInfo", "()Lmh/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC2521a alignmentLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float before;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float after;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(AbstractC2521a abstractC2521a, float f10, float f11, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2521a, f10, f11, interfaceC6835l);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this.alignmentLine, this.before, this.after, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(b node) {
        node.E2(this.alignmentLine);
        node.F2(this.before);
        node.D2(this.after);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = other instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) other : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return AbstractC6492s.d(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && Y0.h.n(this.before, alignmentLineOffsetDpElement.before) && Y0.h.n(this.after, alignmentLineOffsetDpElement.after);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + Y0.h.p(this.before)) * 31) + Y0.h.p(this.after);
    }

    private AlignmentLineOffsetDpElement(AbstractC2521a abstractC2521a, float f10, float f11, InterfaceC6835l interfaceC6835l) {
        this.alignmentLine = abstractC2521a;
        this.before = f10;
        this.after = f11;
        this.inspectorInfo = interfaceC6835l;
        if ((f10 < 0.0f && !Y0.h.n(f10, Y0.h.f24523b.c())) || (f11 < 0.0f && !Y0.h.n(f11, Y0.h.f24523b.c()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }
}
