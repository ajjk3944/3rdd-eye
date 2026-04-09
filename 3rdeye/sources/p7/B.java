package P7;

import A9.C0575f;
import A9.U;
import P7.B;
import P7.x;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.UserMessagingPlatform;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import g0.C4356c;
import p9.InterfaceC5480a;
import va.a;

/* compiled from: PhConsentManager.kt */
@h9.e(c = "com.zipoapps.ads.PhConsentManager$prepareConsentInfo$1", f = "PhConsentManager.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class B extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10667l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f10668m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f10669n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5480a<C1992A> f10670o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H8.e f10671p;

    /* compiled from: PhConsentManager.kt */
    @h9.e(c = "com.zipoapps.ads.PhConsentManager$prepareConsentInfo$1$2$1$1", f = "PhConsentManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x f10672l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f10673m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ x.d f10674n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ H8.e f10675o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.w<InterfaceC5480a<C1992A>> f10676p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, AppCompatActivity appCompatActivity, x.d dVar, H8.e eVar, kotlin.jvm.internal.w wVar, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f10672l = xVar;
            this.f10673m = appCompatActivity;
            this.f10674n = dVar;
            this.f10675o = eVar;
            this.f10676p = wVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            kotlin.jvm.internal.w<InterfaceC5480a<C1992A>> wVar = this.f10676p;
            return new a(this.f10672l, this.f10673m, this.f10674n, this.f10675o, wVar, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            InterfaceC5480a<C1992A> interfaceC5480a = this.f10676p.f43660b;
            x xVar = this.f10672l;
            ConsentInformation consentInformation = xVar.f10825b;
            if (consentInformation != null) {
                x.d dVar = this.f10674n;
                UserMessagingPlatform.loadConsentForm(this.f10673m, new w(consentInformation, xVar, dVar, this.f10675o, interfaceC5480a), new N.g(dVar, xVar));
            } else {
                xVar.f10829f = false;
                a.b bVar = va.a.f47104a;
                bVar.o("x");
                bVar.c("loadForm()-> Consent info is missing. Should never happen", new Object[0]);
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(x xVar, AppCompatActivity appCompatActivity, InterfaceC5480a interfaceC5480a, H8.e eVar, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10668m = xVar;
        this.f10669n = appCompatActivity;
        this.f10670o = interfaceC5480a;
        this.f10671p = eVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new B(this.f10668m, this.f10669n, this.f10670o, this.f10671p, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((B) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        String string;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10667l;
        if (i == 0) {
            b9.n.b(obj);
            x xVar = this.f10668m;
            xVar.f10829f = true;
            this.f10667l = 1;
            xVar.f10830g.setValue(null);
            if (C1992A.f18074a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        ConsentRequestParameters.Builder tagForUnderAgeOfConsent = new ConsentRequestParameters.Builder().setTagForUnderAgeOfConsent(false);
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        boolean zIsDebugMode = e.a.a().f37020j.f43910b.isDebugMode();
        AppCompatActivity appCompatActivity = this.f10669n;
        if (zIsDebugMode) {
            ConsentDebugSettings.Builder builder = new ConsentDebugSettings.Builder(appCompatActivity);
            builder.setDebugGeography(1);
            Bundle debugData = e.a.a().f37020j.f43910b.getDebugData();
            if (debugData != null && (string = debugData.getString("consent_device_id")) != null) {
                builder.addTestDeviceHashedId(string);
                va.a.f47104a.a("Adding test device hash id: ".concat(string), new Object[0]);
            }
            tagForUnderAgeOfConsent.setConsentDebugSettings(builder.build());
        }
        final ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(appCompatActivity);
        final x.d dVar = new x.d(0);
        ConsentRequestParameters consentRequestParametersBuild = tagForUnderAgeOfConsent.build();
        final InterfaceC5480a<C1992A> interfaceC5480a = this.f10670o;
        final H8.e eVar = this.f10671p;
        final x xVar2 = this.f10668m;
        final AppCompatActivity appCompatActivity2 = this.f10669n;
        consentInformation.requestConsentInfoUpdate(appCompatActivity2, consentRequestParametersBuild, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: P7.A
            /* JADX WARN: Type inference failed for: r3v0, types: [T, p9.a] */
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                x xVar3 = xVar2;
                ConsentInformation consentInformation2 = consentInformation;
                xVar3.f10825b = consentInformation2;
                boolean zIsConsentFormAvailable = consentInformation2.isConsentFormAvailable();
                ?? r32 = interfaceC5480a;
                x.d dVar2 = dVar;
                if (!zIsConsentFormAvailable) {
                    a.b bVar = va.a.f47104a;
                    bVar.o("x");
                    bVar.a("No consent form available", new Object[0]);
                    dVar2.f10835a = new x.a(2);
                    xVar3.f(dVar2);
                    xVar3.f10829f = false;
                    xVar3.d();
                    r32.invoke();
                    return;
                }
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                wVar.f43660b = r32;
                if (consentInformation2.getConsentStatus() == 3 || consentInformation2.getConsentStatus() == 1) {
                    a.b bVar2 = va.a.f47104a;
                    bVar2.o("x");
                    bVar2.a(C4356c.h(consentInformation2.getConsentStatus(), "Current status doesn't require consent: "), new Object[0]);
                    r32.invoke();
                    xVar3.d();
                    wVar.f43660b = null;
                } else {
                    a.b bVar3 = va.a.f47104a;
                    bVar3.o("x");
                    bVar3.a("Consent is required", new Object[0]);
                }
                I9.c cVar = U.f211a;
                C0575f.e(A9.F.a(F9.q.f1782a), null, null, new B.a(xVar3, appCompatActivity2, dVar2, eVar, wVar, null), 3);
            }
        }, new D3.b(dVar, xVar2, interfaceC5480a, 5));
        return C1992A.f18074a;
    }
}
