package N7;

import A7.b;
import D7.a;
import N7.C1102b2;
import N7.U1;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionSubmitTemplate.kt */
/* renamed from: N7.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117c2 implements InterfaceC5868a, z7.b<U1> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<String>> f7958a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<List<C1132d2>> f7959b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<List<C1132d2>> f7960c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<a> f7961d;

    /* compiled from: DivActionSubmitTemplate.kt */
    /* renamed from: N7.c2$a */
    public static final class a implements InterfaceC5868a, z7.b<U1.a> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5371a<List<C0100a>> f7962a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5371a<A7.b<U1.a.b>> f7963b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC5371a<A7.b<Uri>> f7964c;

        /* compiled from: DivActionSubmitTemplate.kt */
        /* renamed from: N7.c2$a$a, reason: collision with other inner class name */
        public static final class C0100a implements InterfaceC5868a, z7.b<U1.a.C0096a> {

            /* renamed from: a, reason: collision with root package name */
            public final AbstractC5371a<A7.b<String>> f7965a;

            /* renamed from: b, reason: collision with root package name */
            public final AbstractC5371a<A7.b<String>> f7966b;

            public C0100a(AbstractC5371a<A7.b<String>> abstractC5371a, AbstractC5371a<A7.b<String>> abstractC5371a2) {
                this.f7965a = abstractC5371a;
                this.f7966b = abstractC5371a2;
            }

            @Override // z7.InterfaceC5868a
            public final JSONObject i() {
                Z1 z12 = (Z1) D7.a.f1071b.f6639W0.getValue();
                a.C0011a context = D7.a.f1070a;
                z12.getClass();
                kotlin.jvm.internal.l.f(context, "context");
                JSONObject jSONObject = new JSONObject();
                l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, this.f7965a);
                l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f7966b);
                return jSONObject;
            }
        }

        static {
            U1.a.b value = U1.a.b.POST;
            kotlin.jvm.internal.l.f(value, "value");
            new b.C0000b(value);
        }

        public a(AbstractC5371a<List<C0100a>> abstractC5371a, AbstractC5371a<A7.b<U1.a.b>> abstractC5371a2, AbstractC5371a<A7.b<Uri>> abstractC5371a3) {
            this.f7962a = abstractC5371a;
            this.f7963b = abstractC5371a2;
            this.f7964c = abstractC5371a3;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            return ((C1102b2.c) D7.a.f1071b.f6607T0.getValue()).b(D7.a.f1070a, this);
        }
    }

    public C1117c2(AbstractC5371a<A7.b<String>> abstractC5371a, AbstractC5371a<List<C1132d2>> abstractC5371a2, AbstractC5371a<List<C1132d2>> abstractC5371a3, AbstractC5371a<a> abstractC5371a4) {
        this.f7958a = abstractC5371a;
        this.f7959b = abstractC5371a2;
        this.f7960c = abstractC5371a3;
        this.f7961d = abstractC5371a4;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((W1) D7.a.f1071b.f6575Q0.getValue()).b(D7.a.f1070a, this);
    }
}
