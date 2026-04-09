package androidx.compose.animation;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;
import q.InterfaceC7397p;
import r.o0;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b)\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010-\u001a\u0004\b5\u0010/\"\u0004\b6\u00101R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\b\u0013\u0010D\"\u0004\bE\u0010FR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006M"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "LE0/V;", "Landroidx/compose/animation/h;", "Lr/o0;", "Lq/k;", "transition", "Lr/o0$a;", "LY0/r;", "Lr/n;", "sizeAnimation", "LY0/n;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/i;", "enter", "Landroidx/compose/animation/k;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lq/p;", "graphicsLayerBlock", "<init>", "(Lr/o0;Lr/o0$a;Lr/o0$a;Lr/o0$a;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Lmh/a;Lq/p;)V", "d", "()Landroidx/compose/animation/h;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/animation/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lr/o0;", "getTransition", "()Lr/o0;", SnmpConfigurator.O_BIND_ADDRESS, "Lr/o0$a;", "getSizeAnimation", "()Lr/o0$a;", "setSizeAnimation", "(Lr/o0$a;)V", SnmpConfigurator.O_COMMUNITY, "getOffsetAnimation", "setOffsetAnimation", "getSlideAnimation", "setSlideAnimation", "Landroidx/compose/animation/i;", "getEnter", "()Landroidx/compose/animation/i;", "setEnter", "(Landroidx/compose/animation/i;)V", "f", "Landroidx/compose/animation/k;", "getExit", "()Landroidx/compose/animation/k;", "setExit", "(Landroidx/compose/animation/k;)V", "g", "Lmh/a;", "()Lmh/a;", "setEnabled", "(Lmh/a;)V", "h", "Lq/p;", "getGraphicsLayerBlock", "()Lq/p;", "setGraphicsLayerBlock", "(Lq/p;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class EnterExitTransitionElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final o0 transition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private o0.a sizeAnimation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private o0.a offsetAnimation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private o0.a slideAnimation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private i enter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private k exit;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private InterfaceC6824a isEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private InterfaceC7397p graphicsLayerBlock;

    public EnterExitTransitionElement(o0 o0Var, o0.a aVar, o0.a aVar2, o0.a aVar3, i iVar, k kVar, InterfaceC6824a interfaceC6824a, InterfaceC7397p interfaceC7397p) {
        this.transition = o0Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = iVar;
        this.exit = kVar;
        this.isEnabled = interfaceC6824a;
        this.graphicsLayerBlock = interfaceC7397p;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h a() {
        return new h(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(h node) {
        node.O2(this.transition);
        node.M2(this.sizeAnimation);
        node.L2(this.offsetAnimation);
        node.N2(this.slideAnimation);
        node.H2(this.enter);
        node.I2(this.exit);
        node.G2(this.isEnabled);
        node.J2(this.graphicsLayerBlock);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) other;
        return AbstractC6492s.d(this.transition, enterExitTransitionElement.transition) && AbstractC6492s.d(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && AbstractC6492s.d(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && AbstractC6492s.d(this.slideAnimation, enterExitTransitionElement.slideAnimation) && AbstractC6492s.d(this.enter, enterExitTransitionElement.enter) && AbstractC6492s.d(this.exit, enterExitTransitionElement.exit) && AbstractC6492s.d(this.isEnabled, enterExitTransitionElement.isEnabled) && AbstractC6492s.d(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        o0.a aVar = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        o0.a aVar2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        o0.a aVar3 = this.slideAnimation;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }
}
