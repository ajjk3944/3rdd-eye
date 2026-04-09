package androidx.compose.foundation;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;
import s.C7837J;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u001a\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010(R\u001a\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010(R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "LE0/V;", "Ls/J;", "Lkotlin/Function1;", "LY0/d;", "Ll0/g;", "sourceCenter", "magnifierCenter", "LY0/k;", "LYg/J;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "LY0/h;", "cornerRadius", "elevation", "clippingEnabled", "Ls/V;", "platformMagnifierFactory", "<init>", "(Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Ls/J;", "node", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ls/J;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "Lmh/l;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "F", "Z", "f", "J", "g", "h", "i", "j", "Ls/V;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MagnifierElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l sourceCenter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l magnifierCenter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6835l onSizeChanged;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float zoom;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean useTextDefault;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float cornerRadius;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean clippingEnabled;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final s.V platformMagnifierFactory;

    public /* synthetic */ MagnifierElement(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, s.V v10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6835l, interfaceC6835l2, interfaceC6835l3, f10, z10, j10, f11, f12, z11, v10);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C7837J a() {
        return new C7837J(this.sourceCenter, this.magnifierCenter, this.onSizeChanged, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.platformMagnifierFactory, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(C7837J node) {
        node.L2(this.sourceCenter, this.magnifierCenter, this.zoom, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, this.onSizeChanged, this.platformMagnifierFactory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) other;
        return this.sourceCenter == magnifierElement.sourceCenter && this.magnifierCenter == magnifierElement.magnifierCenter && this.zoom == magnifierElement.zoom && this.useTextDefault == magnifierElement.useTextDefault && Y0.k.f(this.size, magnifierElement.size) && Y0.h.n(this.cornerRadius, magnifierElement.cornerRadius) && Y0.h.n(this.elevation, magnifierElement.elevation) && this.clippingEnabled == magnifierElement.clippingEnabled && this.onSizeChanged == magnifierElement.onSizeChanged && AbstractC6492s.d(this.platformMagnifierFactory, magnifierElement.platformMagnifierFactory);
    }

    public int hashCode() {
        int iHashCode = this.sourceCenter.hashCode() * 31;
        InterfaceC6835l interfaceC6835l = this.magnifierCenter;
        int iHashCode2 = (((((((((((((iHashCode + (interfaceC6835l != null ? interfaceC6835l.hashCode() : 0)) * 31) + Float.hashCode(this.zoom)) * 31) + Boolean.hashCode(this.useTextDefault)) * 31) + Y0.k.i(this.size)) * 31) + Y0.h.p(this.cornerRadius)) * 31) + Y0.h.p(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31;
        InterfaceC6835l interfaceC6835l2 = this.onSizeChanged;
        return ((iHashCode2 + (interfaceC6835l2 != null ? interfaceC6835l2.hashCode() : 0)) * 31) + this.platformMagnifierFactory.hashCode();
    }

    private MagnifierElement(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, s.V v10) {
        this.sourceCenter = interfaceC6835l;
        this.magnifierCenter = interfaceC6835l2;
        this.onSizeChanged = interfaceC6835l3;
        this.zoom = f10;
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f11;
        this.elevation = f12;
        this.clippingEnabled = z11;
        this.platformMagnifierFactory = v10;
    }
}
