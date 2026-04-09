package androidx.compose.foundation.layout;

import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;
import z.EnumC8691n;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "LE0/V;", "Landroidx/compose/foundation/layout/g;", "Lz/n;", "direction", "", "fraction", "", "inspectorName", "<init>", "(Lz/n;FLjava/lang/String;)V", "d", "()Landroidx/compose/foundation/layout/g;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/foundation/layout/g;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", SnmpConfigurator.O_AUTH_PROTOCOL, "Lz/n;", SnmpConfigurator.O_BIND_ADDRESS, "F", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FillElement extends V {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EnumC8691n direction;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float fraction;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* renamed from: androidx.compose.foundation.layout.FillElement$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FillElement a(float f10) {
            return new FillElement(EnumC8691n.Vertical, f10, "fillMaxHeight");
        }

        public final FillElement b(float f10) {
            return new FillElement(EnumC8691n.Both, f10, "fillMaxSize");
        }

        public final FillElement c(float f10) {
            return new FillElement(EnumC8691n.Horizontal, f10, "fillMaxWidth");
        }

        private Companion() {
        }
    }

    public FillElement(EnumC8691n enumC8691n, float f10, String str) {
        this.direction = enumC8691n;
        this.fraction = f10;
        this.inspectorName = str;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public g a() {
        return new g(this.direction, this.fraction);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(g node) {
        node.D2(this.direction);
        node.E2(this.fraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) other;
        return this.direction == fillElement.direction && this.fraction == fillElement.fraction;
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }
}
