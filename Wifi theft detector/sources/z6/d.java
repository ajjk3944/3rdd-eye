package z6;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import java.util.List;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f25369b = new d();

    /* renamed from: a, reason: collision with root package name */
    public List f25370a;

    public class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f25371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(d.this, null);
            this.f25371b = eVar;
        }

        @Override // a7.a
        public void a() {
            d.this.j(this.f25371b);
        }

        @Override // z6.d.b, a7.a
        public void onAdClicked() {
            super.onAdClicked();
            d.this.i(this.f25371b);
        }

        @Override // z6.d.b, a7.a
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.k(this.f25371b);
        }
    }

    public class b implements a7.a {
        public b() {
        }

        public /* synthetic */ b(d dVar, a aVar) {
            this();
        }

        @Override // a7.a
        public void onAdClicked() {
        }

        @Override // a7.a
        public void onAdLoaded() {
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f25374a;

        /* renamed from: b, reason: collision with root package name */
        public String f25375b;

        public String a() {
            return this.f25375b;
        }

        public String b() {
            return this.f25374a;
        }

        public void c(String str) {
            this.f25375b = str;
        }

        public void d(String str) {
            this.f25374a = str;
        }
    }

    public static d e() {
        return f25369b;
    }

    public final c d(String str) {
        for (c cVar : this.f25370a) {
            if (cVar.b().equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    public void f(Context context, List list) {
        this.f25370a = list;
        MobileAds.initialize(context);
    }

    public void g(e eVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.e())) {
            return;
        }
        h(eVar);
    }

    public void h(e eVar) {
        c cVarD;
        if (eVar == null || TextUtils.isEmpty(eVar.e()) || (cVarD = d(eVar.e())) == null || TextUtils.isEmpty(cVarD.a())) {
            return;
        }
        new z6.c(cVarD.a()).e(eVar).f(new a(eVar)).d();
    }

    public final void i(e eVar) {
        if (eVar.c() != null) {
            eVar.c().onAdClicked();
        }
    }

    public final void j(e eVar) {
        if (eVar.c() != null) {
            eVar.c().a();
        }
    }

    public final void k(e eVar) {
        if (eVar.c() != null) {
            eVar.c().onAdLoaded();
        }
    }
}
