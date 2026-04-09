package androidx.compose.foundation.layout;

import E0.V;
import f0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import org.snmp4j.util.SnmpConfigurator;
import z.EnumC8691n;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "LE0/V;", "Landroidx/compose/foundation/layout/u;", "Lz/n;", "direction", "", "unbounded", "Lkotlin/Function2;", "LY0/r;", "LY0/t;", "LY0/n;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(Lz/n;ZLmh/p;Ljava/lang/Object;Ljava/lang/String;)V", "d", "()Landroidx/compose/foundation/layout/u;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/layout/u;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "Lz/n;", SnmpConfigurator.O_BIND_ADDRESS, "Z", SnmpConfigurator.O_COMMUNITY, "Lmh/p;", "Ljava/lang/Object;", "Ljava/lang/String;", "f", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement extends V {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EnumC8691n direction;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6839p alignmentCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object align;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        static final class C1047a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.InterfaceC1752c f28089a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1047a(c.InterfaceC1752c interfaceC1752c) {
                super(2);
                this.f28089a = interfaceC1752c;
            }

            public final long a(long j10, Y0.t tVar) {
                return Y0.o.a(0, this.f28089a.a(0, Y0.r.f(j10)));
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Y0.n.b(a(((Y0.r) obj).j(), (Y0.t) obj2));
            }
        }

        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$b */
        static final class b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f0.c f28090a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f0.c cVar) {
                super(2);
                this.f28090a = cVar;
            }

            public final long a(long j10, Y0.t tVar) {
                return this.f28090a.a(Y0.r.f24545b.a(), j10, tVar);
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Y0.n.b(a(((Y0.r) obj).j(), (Y0.t) obj2));
            }
        }

        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$c */
        static final class c extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.b f28091a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(c.b bVar) {
                super(2);
                this.f28091a = bVar;
            }

            public final long a(long j10, Y0.t tVar) {
                return Y0.o.a(this.f28091a.a(0, Y0.r.g(j10), tVar), 0);
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Y0.n.b(a(((Y0.r) obj).j(), (Y0.t) obj2));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WrapContentElement a(c.InterfaceC1752c interfaceC1752c, boolean z10) {
            return new WrapContentElement(EnumC8691n.Vertical, z10, new C1047a(interfaceC1752c), interfaceC1752c, "wrapContentHeight");
        }

        public final WrapContentElement b(f0.c cVar, boolean z10) {
            return new WrapContentElement(EnumC8691n.Both, z10, new b(cVar), cVar, "wrapContentSize");
        }

        public final WrapContentElement c(c.b bVar, boolean z10) {
            return new WrapContentElement(EnumC8691n.Horizontal, z10, new c(bVar), bVar, "wrapContentWidth");
        }

        private Companion() {
        }
    }

    public WrapContentElement(EnumC8691n enumC8691n, boolean z10, InterfaceC6839p interfaceC6839p, Object obj, String str) {
        this.direction = enumC8691n;
        this.unbounded = z10;
        this.alignmentCallback = interfaceC6839p;
        this.align = obj;
        this.inspectorName = str;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public u a() {
        return new u(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(u node) {
        node.F2(this.direction);
        node.G2(this.unbounded);
        node.E2(this.alignmentCallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WrapContentElement.class != other.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) other;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && AbstractC6492s.d(this.align, wrapContentElement.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }
}
