package androidx.compose.foundation.layout;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "LE0/V;", "Landroidx/compose/foundation/layout/s;", "LY0/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/B0;", "LYg/J;", "inspectorInfo", "<init>", "(FFFFZLmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/layout/s;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/layout/s;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "F", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "Z", "f", "Lmh/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float maxWidth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float maxHeight;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceIncoming;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l inspectorInfo;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC6835l interfaceC6835l, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, interfaceC6835l);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public s a() {
        return new s(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(s node) {
        node.I2(this.minWidth);
        node.H2(this.minHeight);
        node.G2(this.maxWidth);
        node.F2(this.maxHeight);
        node.E2(this.enforceIncoming);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) other;
        return Y0.h.n(this.minWidth, sizeElement.minWidth) && Y0.h.n(this.minHeight, sizeElement.minHeight) && Y0.h.n(this.maxWidth, sizeElement.maxWidth) && Y0.h.n(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    public int hashCode() {
        return (((((((Y0.h.p(this.minWidth) * 31) + Y0.h.p(this.minHeight)) * 31) + Y0.h.p(this.maxWidth)) * 31) + Y0.h.p(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Y0.h.f24523b.c() : f10, (i10 & 2) != 0 ? Y0.h.f24523b.c() : f11, (i10 & 4) != 0 ? Y0.h.f24523b.c() : f12, (i10 & 8) != 0 ? Y0.h.f24523b.c() : f13, z10, interfaceC6835l, null);
    }

    private SizeElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC6835l interfaceC6835l) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
        this.inspectorInfo = interfaceC6835l;
    }
}
