package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivIndicatorItemPlacement.kt */
/* loaded from: classes.dex */
public abstract class H5 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5390a;

    /* compiled from: DivIndicatorItemPlacement.kt */
    public static final class a extends H5 {

        /* renamed from: b, reason: collision with root package name */
        public final C1089a4 f5391b;

        public a(C1089a4 c1089a4) {
            this.f5391b = c1089a4;
        }
    }

    /* compiled from: DivIndicatorItemPlacement.kt */
    public static final class b extends H5 {

        /* renamed from: b, reason: collision with root package name */
        public final C1140da f5392b;

        public b(C1140da c1140da) {
            this.f5392b = c1140da;
        }
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((I5) D7.a.f1071b.X3.getValue()).b(D7.a.f1070a, this);
    }
}
