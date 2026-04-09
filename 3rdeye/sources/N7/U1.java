package N7;

import A7.b;
import D7.a;
import N7.C1102b2;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionSubmit.kt */
/* loaded from: classes.dex */
public final class U1 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<String> f6358a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C1175g0> f6359b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C1175g0> f6360c;

    /* renamed from: d, reason: collision with root package name */
    public final a f6361d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f6362e;

    /* compiled from: DivActionSubmit.kt */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final List<C0096a> f6363a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.b<b> f6364b;

        /* renamed from: c, reason: collision with root package name */
        public final A7.b<Uri> f6365c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f6366d;

        /* compiled from: DivActionSubmit.kt */
        /* renamed from: N7.U1$a$a, reason: collision with other inner class name */
        public static final class C0096a implements InterfaceC5868a {

            /* renamed from: a, reason: collision with root package name */
            public final A7.b<String> f6367a;

            /* renamed from: b, reason: collision with root package name */
            public final A7.b<String> f6368b;

            /* renamed from: c, reason: collision with root package name */
            public Integer f6369c;

            public C0096a(A7.b<String> bVar, A7.b<String> bVar2) {
                this.f6367a = bVar;
                this.f6368b = bVar2;
            }

            @Override // z7.InterfaceC5868a
            public final JSONObject i() {
                Y1 y12 = (Y1) D7.a.f1071b.f6628V0.getValue();
                a.C0011a context = D7.a.f1070a;
                y12.getClass();
                kotlin.jvm.internal.l.f(context, "context");
                JSONObject jSONObject = new JSONObject();
                l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, this.f6367a);
                l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f6368b);
                return jSONObject;
            }
        }

        /* compiled from: DivActionSubmit.kt */
        public enum b {
            GET("get"),
            POST("post"),
            PUT("put"),
            PATCH("patch"),
            DELETE("delete"),
            HEAD("head"),
            OPTIONS("options");

            private final String value;
            public static final c Converter = new c();
            public static final p9.l<b, String> TO_STRING = C0098b.f6371g;
            public static final p9.l<String, b> FROM_STRING = C0097a.f6370g;

            /* compiled from: DivActionSubmit.kt */
            /* renamed from: N7.U1$a$b$a, reason: collision with other inner class name */
            public static final class C0097a extends kotlin.jvm.internal.m implements p9.l<String, b> {

                /* renamed from: g, reason: collision with root package name */
                public static final C0097a f6370g = new C0097a(1);

                @Override // p9.l
                public final b invoke(String str) {
                    String value = str;
                    kotlin.jvm.internal.l.f(value, "value");
                    b.Converter.getClass();
                    b bVar = b.GET;
                    if (value.equals(bVar.value)) {
                        return bVar;
                    }
                    b bVar2 = b.POST;
                    if (value.equals(bVar2.value)) {
                        return bVar2;
                    }
                    b bVar3 = b.PUT;
                    if (value.equals(bVar3.value)) {
                        return bVar3;
                    }
                    b bVar4 = b.PATCH;
                    if (value.equals(bVar4.value)) {
                        return bVar4;
                    }
                    b bVar5 = b.DELETE;
                    if (value.equals(bVar5.value)) {
                        return bVar5;
                    }
                    b bVar6 = b.HEAD;
                    if (value.equals(bVar6.value)) {
                        return bVar6;
                    }
                    b bVar7 = b.OPTIONS;
                    if (value.equals(bVar7.value)) {
                        return bVar7;
                    }
                    return null;
                }
            }

            /* compiled from: DivActionSubmit.kt */
            /* renamed from: N7.U1$a$b$b, reason: collision with other inner class name */
            public static final class C0098b extends kotlin.jvm.internal.m implements p9.l<b, String> {

                /* renamed from: g, reason: collision with root package name */
                public static final C0098b f6371g = new C0098b(1);

                @Override // p9.l
                public final String invoke(b bVar) {
                    b value = bVar;
                    kotlin.jvm.internal.l.f(value, "value");
                    b.Converter.getClass();
                    return value.value;
                }
            }

            /* compiled from: DivActionSubmit.kt */
            public static final class c {
            }

            b(String str) {
                this.value = str;
            }
        }

        static {
            b value = b.POST;
            kotlin.jvm.internal.l.f(value, "value");
            new b.C0000b(value);
        }

        public a(List<C0096a> list, A7.b<b> method, A7.b<Uri> bVar) {
            kotlin.jvm.internal.l.f(method, "method");
            this.f6363a = list;
            this.f6364b = method;
            this.f6365c = bVar;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            return ((C1102b2.b) D7.a.f1071b.f6596S0.getValue()).b(D7.a.f1070a, this);
        }
    }

    public U1(A7.b<String> bVar, List<C1175g0> list, List<C1175g0> list2, a aVar) {
        this.f6358a = bVar;
        this.f6359b = list;
        this.f6360c = list2;
        this.f6361d = aVar;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((V1) D7.a.f1071b.f6564P0.getValue()).b(D7.a.f1070a, this);
    }
}
