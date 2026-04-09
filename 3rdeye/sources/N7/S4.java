package N7;

import A7.b;
import D7.a;
import N7.T4;
import N7.U4;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivFixedLengthInputMask.kt */
/* loaded from: classes.dex */
public final class S4 implements InterfaceC5868a, InterfaceC1253l6 {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Boolean> f6196a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<String> f6197b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f6198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6199d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f6200e;

    /* compiled from: DivFixedLengthInputMask.kt */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final A7.b<String> f6201a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.b<String> f6202b;

        /* renamed from: c, reason: collision with root package name */
        public final A7.b<String> f6203c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f6204d;

        static {
            new b.d("_");
        }

        public a(A7.b<String> bVar, A7.b<String> placeholder, A7.b<String> bVar2) {
            kotlin.jvm.internal.l.f(placeholder, "placeholder");
            this.f6201a = bVar;
            this.f6202b = placeholder;
            this.f6203c = bVar2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            U4.a aVar = (U4.a) D7.a.f1071b.f6865q3.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            aVar.getClass();
            return U4.a.d(c0011a, this);
        }
    }

    static {
        new b.C0000b(Boolean.FALSE);
    }

    public S4(A7.b<Boolean> alwaysVisible, A7.b<String> bVar, List<a> list, String str) {
        kotlin.jvm.internal.l.f(alwaysVisible, "alwaysVisible");
        this.f6196a = alwaysVisible;
        this.f6197b = bVar;
        this.f6198c = list;
        this.f6199d = str;
    }

    @Override // N7.InterfaceC1253l6
    public final String a() {
        return this.f6199d;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((T4.a) D7.a.f1071b.f6833n3.getValue()).b(D7.a.f1070a, this);
    }
}
