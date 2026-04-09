package androidx.compose.ui.graphics;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import m0.d1;
import m0.i1;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b5\u00100R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00100R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b:\u00100R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b<\u00100R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u00100R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010B\u001a\u0004\bN\u0010DR\u001d\u0010\u0018\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010B\u001a\u0004\bP\u0010DR\u001d\u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "LE0/V;", "Landroidx/compose/ui/graphics/e;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lm0/i1;", "shape", "", "clip", "Lm0/d1;", "renderEffect", "Lm0/v0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLm0/i1;ZLm0/d1;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/ui/graphics/e;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/ui/graphics/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "F", "getScaleX", "()F", SnmpConfigurator.O_BIND_ADDRESS, "getScaleY", SnmpConfigurator.O_COMMUNITY, "getAlpha", "getTranslationX", "getTranslationY", "f", "getShadowElevation", "g", "getRotationX", "h", "getRotationY", "i", "getRotationZ", "j", "getCameraDistance", "k", "J", "getTransformOrigin-SzJe1aQ", "()J", "l", "Lm0/i1;", "getShape", "()Lm0/i1;", "m", "Z", "getClip", "()Z", SnmpConfigurator.O_CONTEXT_NAME, "getAmbientShadowColor-0d7_KjU", SnmpConfigurator.O_OPERATION, "getSpotShadowColor-0d7_KjU", "p", "I", "getCompositingStrategy--NrFUSI", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleX;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scaleY;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationX;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float translationY;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float shadowElevation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationX;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationY;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final float rotationZ;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final float cameraDistance;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long transformOrigin;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final i1 shape;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientShadowColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotShadowColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final int compositingStrategy;

    public /* synthetic */ GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, i1Var, z10, d1Var, j11, j12, i10);
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a() {
        return new e(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, null, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(e node) {
        node.i(this.scaleX);
        node.g(this.scaleY);
        node.a(this.alpha);
        node.j(this.translationX);
        node.f(this.translationY);
        node.o(this.shadowElevation);
        node.m(this.rotationX);
        node.d(this.rotationY);
        node.e(this.rotationZ);
        node.l(this.cameraDistance);
        node.y1(this.transformOrigin);
        node.I1(this.shape);
        node.G(this.clip);
        node.k(null);
        node.D(this.ambientShadowColor);
        node.I(this.spotShadowColor);
        node.t(this.compositingStrategy);
        node.M2();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) other;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && f.e(this.transformOrigin, graphicsLayerElement.transformOrigin) && AbstractC6492s.d(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && AbstractC6492s.d(null, null) && C6733v0.m(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && C6733v0.m(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && a.e(this.compositingStrategy, graphicsLayerElement.compositingStrategy);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + f.h(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 961) + C6733v0.s(this.ambientShadowColor)) * 31) + C6733v0.s(this.spotShadowColor)) * 31) + a.f(this.compositingStrategy);
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) f.i(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) C6733v0.t(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) C6733v0.t(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) a.g(this.compositingStrategy)) + ')';
    }

    private GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10) {
        this.scaleX = f10;
        this.scaleY = f11;
        this.alpha = f12;
        this.translationX = f13;
        this.translationY = f14;
        this.shadowElevation = f15;
        this.rotationX = f16;
        this.rotationY = f17;
        this.rotationZ = f18;
        this.cameraDistance = f19;
        this.transformOrigin = j10;
        this.shape = i1Var;
        this.clip = z10;
        this.ambientShadowColor = j11;
        this.spotShadowColor = j12;
        this.compositingStrategy = i10;
    }
}
