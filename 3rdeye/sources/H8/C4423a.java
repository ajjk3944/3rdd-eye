package h8;

import A9.C0575f;
import A9.C0580h0;
import android.app.Application;
import androidx.lifecycle.Q;
import com.zipoapps.premiumhelper.b;
import com.zipoapps.premiumhelper.e;
import f8.AbstractC4342e;
import f8.EnumC4341d;
import i8.C4461a;
import kotlin.jvm.internal.l;

/* compiled from: StartLikeProViewModel.kt */
/* renamed from: h8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4423a extends AbstractC4342e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4423a(Application application, Q savedStateHandle) {
        super(application, savedStateHandle, EnumC4341d.START_LIKE_PRO);
        l.f(application, "application");
        l.f(savedStateHandle, "savedStateHandle");
        e.f37006D.getClass();
        C4461a c4461a = e.a.a().f37021k;
        c4461a.getClass();
        C0575f.e(C0580h0.f248b, null, null, new b(c4461a, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    @Override // f8.AbstractC4342e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.zipoapps.premiumhelper.e$a r2 = com.zipoapps.premiumhelper.e.f37006D
            r2.getClass()
            com.zipoapps.premiumhelper.e r2 = com.zipoapps.premiumhelper.e.a.a()
            com.zipoapps.premiumhelper.c r2 = r2.i
            android.content.SharedPreferences r2 = r2.f37004a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "is_onboarding_complete"
            r2.putBoolean(r3, r1)
            r2.apply()
            k8.G r2 = r7.f37843n
            if (r2 == 0) goto L30
            boolean r3 = r2 instanceof k8.G.c
            r4 = 0
            if (r3 == 0) goto L27
            k8.G$c r2 = (k8.G.c) r2
            goto L28
        L27:
            r2 = r4
        L28:
            if (r2 == 0) goto L2c
            com.android.billingclient.api.ProductDetails r4 = r2.f43458d
        L2c:
            if (r4 == 0) goto L30
            r2 = r1
            goto L31
        L30:
            r2 = r0
        L31:
            com.zipoapps.premiumhelper.e r3 = com.zipoapps.premiumhelper.e.a.a()
            i8.a r3 = r3.f37021k
            r3.getClass()
            l8.d<java.lang.String> r4 = i8.d.f38525E
            java.lang.String r5 = "PH_MAIN_SKU"
            kotlin.jvm.internal.l.e(r4, r5)
            l8.b r5 = r3.f38484b
            java.lang.Object r4 = r5.h(r4)
            b9.l r5 = new b9.l
            java.lang.String r6 = "sku"
            r5.<init>(r6, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            b9.l r4 = new b9.l
            java.lang.String r6 = "offer_loaded"
            r4.<init>(r6, r2)
            r2 = 2
            b9.l[] r2 = new b9.l[r2]
            r2[r0] = r5
            r2[r1] = r4
            android.os.Bundle r2 = G0.d.a(r2)
            android.os.Bundle[] r1 = new android.os.Bundle[r1]
            r1[r0] = r2
            java.lang.String r0 = "Onboarding_complete"
            r3.s(r0, r1)
            com.zipoapps.premiumhelper.e r0 = com.zipoapps.premiumhelper.e.a.a()
            boolean r0 = r0.h()
            if (r0 == 0) goto L84
            com.zipoapps.premiumhelper.e r0 = com.zipoapps.premiumhelper.e.a.a()
            l8.b r0 = r0.f37020j
            com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r0 = r0.f43910b
            java.lang.Class r0 = r0.getMainActivityClass()
            goto L90
        L84:
            com.zipoapps.premiumhelper.e r0 = com.zipoapps.premiumhelper.e.a.a()
            l8.b r0 = r0.f37020j
            com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r0 = r0.f43910b
            java.lang.Class r0 = r0.getIntroActivityClass()
        L90:
            C9.b r1 = r7.f37841l
            if (r0 != 0) goto L9a
            f8.e$a$a r0 = f8.AbstractC4342e.a.C0454a.f37845a
            r1.i(r0)
            return
        L9a:
            f8.e$a$b r2 = new f8.e$a$b
            r2.<init>(r0)
            r1.i(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.C4423a.g():void");
    }
}
