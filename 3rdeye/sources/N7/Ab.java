package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTooltipMode.kt */
/* loaded from: classes.dex */
public abstract class Ab implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f4825a;

    /* compiled from: DivTooltipMode.kt */
    public static final class a extends Ab {

        /* renamed from: b, reason: collision with root package name */
        public final Eb f4826b;

        public a(Eb eb) {
            this.f4826b = eb;
        }
    }

    /* compiled from: DivTooltipMode.kt */
    public static final class b extends Ab {

        /* renamed from: b, reason: collision with root package name */
        public final Jb f4827b;

        public b(Jb jb) {
            this.f4827b = jb;
        }
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Bb) D7.a.f1071b.f6541M8.getValue()).b(D7.a.f1070a, this);
    }
}
