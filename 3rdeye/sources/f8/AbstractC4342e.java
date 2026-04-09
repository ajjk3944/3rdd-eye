package f8;

import A9.C0575f;
import A9.U;
import D9.C0641c;
import G2.j;
import J8.I;
import J8.Q;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.lifecycle.C1768a;
import androidx.lifecycle.E;
import androidx.lifecycle.Q;
import androidx.lifecycle.c0;
import b9.C2001h;
import b9.p;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.e;
import k8.G;
import kotlin.jvm.internal.l;
import y9.q;

/* compiled from: PremiumViewModel.kt */
/* renamed from: f8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4342e extends C1768a {

    /* renamed from: c, reason: collision with root package name */
    public final Q f37833c;

    /* renamed from: d, reason: collision with root package name */
    public final I f37834d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37835e;

    /* renamed from: f, reason: collision with root package name */
    public final p f37836f;

    /* renamed from: g, reason: collision with root package name */
    public final p f37837g;

    /* renamed from: h, reason: collision with root package name */
    public final E<b> f37838h;
    public final E i;

    /* renamed from: j, reason: collision with root package name */
    public final E<String> f37839j;

    /* renamed from: k, reason: collision with root package name */
    public final E f37840k;

    /* renamed from: l, reason: collision with root package name */
    public final C9.b f37841l;

    /* renamed from: m, reason: collision with root package name */
    public final C0641c f37842m;

    /* renamed from: n, reason: collision with root package name */
    public G f37843n;

    /* renamed from: o, reason: collision with root package name */
    public h f37844o;

    /* compiled from: PremiumViewModel.kt */
    /* renamed from: f8.e$a */
    public interface a {

        /* compiled from: PremiumViewModel.kt */
        /* renamed from: f8.e$a$a, reason: collision with other inner class name */
        public static final class C0454a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0454a f37845a = new C0454a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0454a);
            }

            public final int hashCode() {
                return -91071282;
            }

            public final String toString() {
                return "CloseScreen";
            }
        }

        /* compiled from: PremiumViewModel.kt */
        /* renamed from: f8.e$a$b */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public final Class<? extends Activity> f37846a;

            public b(Class<? extends Activity> cls) {
                this.f37846a = cls;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && l.b(this.f37846a, ((b) obj).f37846a);
            }

            public final int hashCode() {
                return this.f37846a.hashCode();
            }

            public final String toString() {
                return "OpenNewScreen(activityClass=" + this.f37846a + ")";
            }
        }
    }

    /* compiled from: PremiumViewModel.kt */
    /* renamed from: f8.e$b */
    public interface b {

        /* compiled from: PremiumViewModel.kt */
        /* renamed from: f8.e$b$a */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f37847a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 603139453;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: PremiumViewModel.kt */
        /* renamed from: f8.e$b$b, reason: collision with other inner class name */
        public static final class C0455b implements b {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f37848a;

            /* renamed from: b, reason: collision with root package name */
            public final String f37849b;

            /* renamed from: c, reason: collision with root package name */
            public final String f37850c;

            /* renamed from: d, reason: collision with root package name */
            public final String f37851d;

            public C0455b(CharSequence charSequence, String str, String str2, String str3) {
                this.f37848a = charSequence;
                this.f37849b = str;
                this.f37850c = str2;
                this.f37851d = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0455b)) {
                    return false;
                }
                C0455b c0455b = (C0455b) obj;
                return l.b(this.f37848a, c0455b.f37848a) && l.b(this.f37849b, c0455b.f37849b) && l.b(this.f37850c, c0455b.f37850c) && l.b(this.f37851d, c0455b.f37851d);
            }

            public final int hashCode() {
                int iHashCode = this.f37848a.hashCode() * 31;
                String str = this.f37849b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f37850c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f37851d;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(productInfoText=");
                sb.append((Object) this.f37848a);
                sb.append(", ctaButtonText=");
                sb.append(this.f37849b);
                sb.append(", priceText=");
                sb.append(this.f37850c);
                sb.append(", oldPriceText=");
                return B4.f.c(sb, this.f37851d, ")");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4342e(Application application, Q q10, EnumC4341d premiumScreenType) {
        super(application);
        l.f(premiumScreenType, "premiumScreenType");
        this.f37833c = q10;
        this.f37834d = new I(application);
        this.f37835e = premiumScreenType == EnumC4341d.START_LIKE_PRO;
        this.f37836f = C2001h.b(new B8.a(3));
        this.f37837g = C2001h.b(new j(this, 4));
        E<b> e4 = new E<>(b.a.f37847a);
        this.f37838h = e4;
        this.i = e4;
        E<String> e10 = new E<>();
        this.f37839j = e10;
        this.f37840k = e10;
        C9.b bVarA = C9.j.a(-2, 6, null);
        this.f37841l = bVarA;
        this.f37842m = new C0641c(bVarA);
        C0575f.e(c0.a(this), U.f212b, null, new f(this, null), 2);
    }

    public static final String e(AbstractC4342e abstractC4342e, Application application, G g10) {
        Q.a aVar;
        abstractC4342e.getClass();
        boolean z10 = g10 instanceof G.c;
        G.c cVar = z10 ? (G.c) g10 : null;
        if ((cVar != null ? cVar.f43458d : null) == null && !(g10 instanceof G.a)) {
            String string = application.getString(R.string.ph_start_trial_cta);
            l.c(string);
            return string;
        }
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        if (g10 instanceof G.a) {
            ((G.a) g10).getClass();
            aVar = q.b0(null, "trial_0d", false) ? Q.a.NONE : q.b0(null, "trial_3d", false) ? Q.a.THREE_DAYS : q.b0(null, "trial_7d", false) ? Q.a.SEVEN_DAYS : q.b0(null, "trial_30d", false) ? Q.a.THIRTY_DAYS : Q.a.NONE;
        } else if (g10 instanceof G.b) {
            aVar = Q.a.NONE;
        } else {
            if (!z10) {
                throw new b9.j();
            }
            String productId = ((G.c) g10).f43458d.getProductId();
            l.e(productId, "getProductId(...)");
            aVar = q.b0(productId, "trial_0d", false) ? Q.a.NONE : q.b0(productId, "trial_3d", false) ? Q.a.THREE_DAYS : q.b0(productId, "trial_7d", false) ? Q.a.SEVEN_DAYS : q.b0(productId, "trial_30d", false) ? Q.a.THIRTY_DAYS : Q.a.NONE;
        }
        if (aVar == Q.a.NONE) {
            String string2 = application.getString(R.string.ph_start_premium_cta);
            l.c(string2);
            return string2;
        }
        String string3 = application.getString(R.string.start_like_pro_text_trial);
        l.e(string3, "getString(...)");
        if (!q.i0(string3)) {
            String string4 = application.getString(R.string.start_like_pro_text_trial);
            l.e(string4, "getString(...)");
            return string4;
        }
        l8.d<Boolean> PH_SHOW_TRIAL_ON_CTA = i8.d.f38552c0;
        l.e(PH_SHOW_TRIAL_ON_CTA, "PH_SHOW_TRIAL_ON_CTA");
        if (((Boolean) eVarA.f37020j.h(PH_SHOW_TRIAL_ON_CTA)).booleanValue()) {
            String str = application.getResources().getStringArray(R.array.cta_titles)[aVar.ordinal()];
            l.e(str, "get(...)");
            return str;
        }
        String string5 = application.getString(R.string.ph_start_trial_cta);
        l.e(string5, "getString(...)");
        return string5;
    }

    public static final Spanned f(AbstractC4342e abstractC4342e) {
        abstractC4342e.getClass();
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        l8.d<String> PH_TERMS_URL = i8.d.f38562h0;
        l.e(PH_TERMS_URL, "PH_TERMS_URL");
        String str = (String) eVarA.f37020j.h(PH_TERMS_URL);
        com.zipoapps.premiumhelper.e eVarA2 = e.a.a();
        l8.d<String> PH_PRIVACY_URL = i8.d.f38535O;
        l.e(PH_PRIVACY_URL, "PH_PRIVACY_URL");
        String str2 = (String) eVarA2.f37020j.h(PH_PRIVACY_URL);
        Application application = abstractC4342e.f16123b;
        l.d(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        String string = application.getString(R.string.premium_terms_and_conditions, str, str2);
        Spanned spannedA = Build.VERSION.SDK_INT >= 24 ? J0.b.a(string, 0) : Html.fromHtml(string);
        l.e(spannedA, "fromHtml(...)");
        return spannedA;
    }

    @Override // androidx.lifecycle.b0
    public final void d() {
        h hVar = this.f37844o;
        if (hVar != null) {
            hVar.cancel();
        }
    }

    public final String h() {
        return (String) this.f37837g.getValue();
    }

    public final boolean i() {
        return ((Boolean) this.f37836f.getValue()).booleanValue();
    }

    public void g() {
    }
}
