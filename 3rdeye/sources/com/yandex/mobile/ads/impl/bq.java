package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import b9.C1992A;
import com.yandex.mobile.ads.impl.cq;

/* loaded from: classes3.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    private final vp1 f25361a;

    public static final class a extends kotlin.jvm.internal.m implements p9.p<String, String, C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri.Builder f25363c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri.Builder builder) {
            super(2);
            this.f25363c = builder;
        }

        @Override // p9.p
        public final C1992A invoke(String str, String str2) {
            String key = str;
            String str3 = str2;
            kotlin.jvm.internal.l.f(key, "key");
            vp1 vp1Var = bq.this.f25361a;
            Uri.Builder builder = this.f25363c;
            vp1Var.getClass();
            kotlin.jvm.internal.l.f(builder, "builder");
            if (str3 != null && str3.length() != 0) {
                kotlin.jvm.internal.l.c(builder.appendQueryParameter(key, str3));
            }
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements p9.p<String, String, C1992A> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn1 f25364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cn1 cn1Var) {
            super(2);
            this.f25364b = cn1Var;
        }

        @Override // p9.p
        public final C1992A invoke(String str, String str2) {
            String key = str;
            kotlin.jvm.internal.l.f(key, "key");
            this.f25364b.a(key, str2);
            return C1992A.f18074a;
        }
    }

    public bq(vp1 requestHelper) {
        kotlin.jvm.internal.l.f(requestHelper, "requestHelper");
        this.f25361a = requestHelper;
    }

    public final void a(Context context, Uri.Builder builder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(builder, "builder");
        a aVar = new a(builder);
        cq.f25747a.getClass();
        eq eqVar = (eq) cq.a.a(context);
        aVar.invoke("gdpr", eqVar.a());
        aVar.invoke("gdpr_consent", eqVar.b());
        aVar.invoke("parsed_purpose_consents", eqVar.c());
        aVar.invoke("parsed_vendor_consents", eqVar.f());
        aVar.invoke("cmp_present", Integer.valueOf(eqVar.e() ? 1 : 0).toString());
    }

    public static void a(Context context, cn1 queryParams) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(queryParams, "queryParams");
        b bVar = new b(queryParams);
        cq.f25747a.getClass();
        eq eqVar = (eq) cq.a.a(context);
        bVar.invoke("gdpr", eqVar.a());
        bVar.invoke("gdpr_consent", eqVar.b());
        bVar.invoke("parsed_purpose_consents", eqVar.c());
        bVar.invoke("parsed_vendor_consents", eqVar.f());
        bVar.invoke("cmp_present", Integer.valueOf(eqVar.e() ? 1 : 0).toString());
    }
}
