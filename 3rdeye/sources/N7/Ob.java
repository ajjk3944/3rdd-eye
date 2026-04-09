package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTooltipModeTemplate.kt */
/* loaded from: classes.dex */
public abstract class Ob implements InterfaceC5868a, z7.b<Ab> {

    /* compiled from: DivTooltipModeTemplate.kt */
    public static final class a extends Ob {

        /* renamed from: a, reason: collision with root package name */
        public final Ib f5996a;

        public a(Ib ib) {
            this.f5996a = ib;
        }
    }

    /* compiled from: DivTooltipModeTemplate.kt */
    public static final class b extends Ob {

        /* renamed from: a, reason: collision with root package name */
        public final Nb f5997a;

        public b(Nb nb) {
            this.f5997a = nb;
        }
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Cb) D7.a.f1071b.N8.getValue()).b(D7.a.f1070a, this);
    }
}
