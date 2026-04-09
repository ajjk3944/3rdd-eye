package com.zipoapps.premiumhelper.ui.preferences.common;

import android.content.Context;
import android.util.AttributeSet;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.preferences.PremiumPreference;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: PremiumSupportPreference.kt */
/* loaded from: classes3.dex */
public final class PremiumSupportPreference extends PremiumPreference {

    /* renamed from: Q, reason: collision with root package name */
    public String f37078Q;

    /* renamed from: R, reason: collision with root package name */
    public String f37079R;

    /* renamed from: S, reason: collision with root package name */
    public String f37080S;

    /* renamed from: T, reason: collision with root package name */
    public String f37081T;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PremiumSupportPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        l.f(context, "context");
    }

    @Override // com.zipoapps.premiumhelper.ui.preferences.PremiumPreference
    public final boolean A() {
        return this.f37079R == null && super.A();
    }

    @Override // com.zipoapps.premiumhelper.ui.preferences.PremiumPreference
    public final void B() {
        C(this.f37080S, this.f37081T);
    }

    public final void C(String title, String vipTitle) {
        l.f(title, "title");
        l.f(vipTitle, "vipTitle");
        this.f37080S = title;
        this.f37081T = vipTitle;
        e.f37006D.getClass();
        if (e.a.a().i.j()) {
            title = vipTitle;
        }
        w(title);
    }

    public /* synthetic */ PremiumSupportPreference(Context context, AttributeSet attributeSet, int i, g gVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r2 = r9.getAttributeResourceValue(r4, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r2 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r9 = r7.f16248b.getResources().getString(r2);
        kotlin.jvm.internal.l.c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r9 = r9.getAttributeValue(r4);
        kotlin.jvm.internal.l.c(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PremiumSupportPreference(android.content.Context r8, android.util.AttributeSet r9) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l.f(r8, r0)
            r7.<init>(r8, r9)
            java.lang.String r0 = ""
            r7.f37080S = r0
            r7.f37081T = r0
            int[] r1 = i8.r.f38632b
            android.content.res.TypedArray r1 = r8.obtainStyledAttributes(r9, r1)
            r2 = 34
            java.lang.String r2 = r1.getString(r2)
            if (r2 != 0) goto L1d
            r2 = r0
        L1d:
            r7.f37080S = r2
            java.lang.CharSequence r2 = y9.q.w0(r2)
            java.lang.String r2 = r2.toString()
            int r2 = r2.length()
            r3 = 0
            if (r2 != 0) goto L65
            if (r9 == 0) goto L62
            int r2 = r9.getAttributeCount()
            r4 = r3
        L35:
            if (r4 >= r2) goto L62
            java.lang.String r5 = r9.getAttributeName(r4)
            java.lang.String r6 = "title"
            boolean r5 = kotlin.jvm.internal.l.b(r5, r6)
            if (r5 == 0) goto L5f
            int r2 = r9.getAttributeResourceValue(r4, r3)
            if (r2 == 0) goto L57
            android.content.Context r9 = r7.f16248b     // Catch: java.lang.Exception -> L62
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Exception -> L62
            java.lang.String r9 = r9.getString(r2)     // Catch: java.lang.Exception -> L62
            kotlin.jvm.internal.l.c(r9)     // Catch: java.lang.Exception -> L62
            goto L63
        L57:
            java.lang.String r9 = r9.getAttributeValue(r4)
            kotlin.jvm.internal.l.c(r9)
            goto L63
        L5f:
            int r4 = r4 + 1
            goto L35
        L62:
            r9 = r0
        L63:
            r7.f37080S = r9
        L65:
            r9 = 8
            java.lang.String r9 = r1.getString(r9)
            if (r9 != 0) goto L6e
            goto L6f
        L6e:
            r0 = r9
        L6f:
            r7.f37081T = r0
            r9 = 7
            java.lang.String r9 = r1.getString(r9)
            if (r9 != 0) goto La1
            com.zipoapps.premiumhelper.e$a r9 = com.zipoapps.premiumhelper.e.f37006D
            r9.getClass()
            com.zipoapps.premiumhelper.e r9 = com.zipoapps.premiumhelper.e.a.a()
            l8.d<java.lang.String> r0 = i8.d.f38558f0
            java.lang.String r2 = "PH_SUPPORT_EMAIL"
            kotlin.jvm.internal.l.e(r0, r2)
            l8.b r9 = r9.f37020j
            java.lang.Object r9 = r9.h(r0)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r0 = y9.q.i0(r9)
            if (r0 != 0) goto L99
            java.lang.String r9 = (java.lang.String) r9
            goto La1
        L99:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "You have to set support_email value for Support Preference"
            r8.<init>(r9)
            throw r8
        La1:
            r7.f37078Q = r9
            r9 = 9
            java.lang.String r9 = r1.getString(r9)
            if (r9 != 0) goto Lcc
            com.zipoapps.premiumhelper.e$a r9 = com.zipoapps.premiumhelper.e.f37006D
            r9.getClass()
            com.zipoapps.premiumhelper.e r9 = com.zipoapps.premiumhelper.e.a.a()
            l8.d<java.lang.String> r0 = i8.d.f38560g0
            java.lang.String r2 = "PH_SUPPORT_VIP_EMAIL"
            kotlin.jvm.internal.l.e(r0, r2)
            l8.b r9 = r9.f37020j
            java.lang.Object r9 = r9.h(r0)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r0 = r9.length()
            if (r0 != 0) goto Lca
            r9 = 0
        Lca:
            java.lang.String r9 = (java.lang.String) r9
        Lcc:
            r7.f37079R = r9
            r1.recycle()
            java.lang.String r9 = r7.f37079R
            if (r9 == 0) goto Ld9
            x8.b r9 = r7.f37071P
            r9.f47814g = r3
        Ld9:
            C.f0 r9 = new C.f0
            r0 = 12
            r9.<init>(r0, r8, r7)
            C.e0 r8 = new C.e0
            r0 = 20
            r8.<init>(r0, r7, r9)
            r7.f16252f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.ui.preferences.common.PremiumSupportPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
