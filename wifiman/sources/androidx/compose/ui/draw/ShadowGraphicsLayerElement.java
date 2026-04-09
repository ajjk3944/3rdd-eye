package androidx.compose.ui.draw;

import E0.V;
import Y0.h;
import Yg.J;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6711k0;
import m0.C6733v0;
import m0.i1;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u000b\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b1\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "LE0/V;", "Lm0/k0;", "LY0/h;", "elevation", "Lm0/i1;", "shape", "", "clip", "Lm0/v0;", "ambientColor", "spotColor", "<init>", "(FLm0/i1;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Lmh/l;", "d", "()Lm0/k0;", "node", "k", "(Lm0/k0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "F", "h", "()F", SnmpConfigurator.O_BIND_ADDRESS, "Lm0/i1;", "i", "()Lm0/i1;", SnmpConfigurator.O_COMMUNITY, "Z", "g", "()Z", "J", "f", "()J", "j", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ShadowGraphicsLayerElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float elevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final i1 shape;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotColor;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.o(cVar.d1(ShadowGraphicsLayerElement.this.getElevation()));
            cVar.I1(ShadowGraphicsLayerElement.this.getShape());
            cVar.G(ShadowGraphicsLayerElement.this.getClip());
            cVar.D(ShadowGraphicsLayerElement.this.getAmbientColor());
            cVar.I(ShadowGraphicsLayerElement.this.getSpotColor());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return J.f24997a;
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, i1 i1Var, boolean z10, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i1Var, z10, j10, j11);
    }

    private final InterfaceC6835l e() {
        return new a();
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C6711k0 a() {
        return new C6711k0(e());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return h.n(this.elevation, shadowGraphicsLayerElement.elevation) && AbstractC6492s.d(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && C6733v0.m(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && C6733v0.m(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: h, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    public int hashCode() {
        return (((((((h.p(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + C6733v0.s(this.ambientColor)) * 31) + C6733v0.s(this.spotColor);
    }

    /* renamed from: i, reason: from getter */
    public final i1 getShape() {
        return this.shape;
    }

    /* renamed from: j, reason: from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    @Override // E0.V
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void c(C6711k0 node) {
        node.F2(e());
        node.E2();
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) h.r(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) C6733v0.t(this.ambientColor)) + ", spotColor=" + ((Object) C6733v0.t(this.spotColor)) + ')';
    }

    private ShadowGraphicsLayerElement(float f10, i1 i1Var, boolean z10, long j10, long j11) {
        this.elevation = f10;
        this.shape = i1Var;
        this.clip = z10;
        this.ambientColor = j10;
        this.spotColor = j11;
    }
}
