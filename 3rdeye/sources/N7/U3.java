package N7;

import A7.b;
import N7.V3;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivData.kt */
/* loaded from: classes.dex */
public final class U3 implements InterfaceC5868a {
    public static final /* synthetic */ int i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List<C1210i5> f6374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6375b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f6376c;

    /* renamed from: d, reason: collision with root package name */
    public final List<C1397vb> f6377d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Tb> f6378e;

    /* renamed from: f, reason: collision with root package name */
    public final List<Vb> f6379f;

    /* renamed from: g, reason: collision with root package name */
    public final List<AbstractC1142dc> f6380g;

    /* renamed from: h, reason: collision with root package name */
    public final List<Exception> f6381h;

    /* compiled from: DivData.kt */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final Z f6382a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6383b;

        public a(Z z10, long j4) {
            this.f6382a = z10;
            this.f6383b = j4;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            return ((W3) D7.a.f1071b.f6441D2.getValue()).b(D7.a.f1070a, this);
        }
    }

    static {
        Tb value = Tb.NONE;
        kotlin.jvm.internal.l.f(value, "value");
        new b.C0000b(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U3(List<C1210i5> list, String str, List<a> list2, List<C1397vb> list3, A7.b<Tb> transitionAnimationSelector, List<Vb> list4, List<? extends AbstractC1142dc> list5, List<? extends Exception> list6) {
        kotlin.jvm.internal.l.f(transitionAnimationSelector, "transitionAnimationSelector");
        this.f6374a = list;
        this.f6375b = str;
        this.f6376c = list2;
        this.f6377d = list3;
        this.f6378e = transitionAnimationSelector;
        this.f6379f = list4;
        this.f6380g = list5;
        this.f6381h = list6;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((V3.b) D7.a.f1071b.f6419B2.getValue()).b(D7.a.f1070a, this);
    }
}
