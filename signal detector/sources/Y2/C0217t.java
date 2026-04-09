package Y2;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC0709Rg;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C0837Yp;
import com.google.android.gms.internal.ads.C0969c3;
import com.google.android.gms.internal.ads.C1437kl;
import com.google.android.gms.internal.ads.InterfaceC0803Wp;
import com.google.android.gms.internal.ads.K9;
import com.google.android.gms.internal.ads.Qv;
import com.google.android.gms.internal.ads.Rv;
import com.google.android.gms.internal.ads.Sv;
import com.google.android.gms.internal.ads.Wv;
import com.google.android.gms.internal.ads.Ww;
import d4.C2267a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: Y2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217t implements InterfaceC0803Wp, d4.g {

    /* renamed from: a, reason: collision with root package name */
    public Object f4365a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4366b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4367c;

    /* renamed from: d, reason: collision with root package name */
    public int f4368d;

    /* renamed from: e, reason: collision with root package name */
    public int f4369e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4370f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4371g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Y2.C0217t b(android.util.JsonReader r12) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0217t.b(android.util.JsonReader):Y2.t");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0803Wp
    /* renamed from: a */
    public Object mo8a() {
        String str = (String) this.f4365a;
        String str2 = (String) this.f4366b;
        String str3 = (String) this.f4367c;
        int i = this.f4368d;
        WebView webView = (WebView) this.f4370f;
        String str4 = (String) this.f4371g;
        int i3 = this.f4369e;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        K9 k9 = new K9(str, str2);
        Wv wvM = C1437kl.m("javascript");
        Wv wvM2 = C1437kl.m(str3);
        Sv svO = C1437kl.o(AbstractC1135f5.e(i));
        Wv wv = Wv.NONE;
        if (wvM == wv) {
            u2.k.h("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (svO == null) {
            u2.k.h("Omid js session error; Unable to parse creative type: ".concat(AbstractC1135f5.s(i)));
            return null;
        }
        if (svO == Sv.VIDEO && wvM2 == wv) {
            u2.k.h("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str3)));
            return null;
        }
        C0969c3 c0969c3 = new C0969c3(k9, webView, str4, "", Qv.JAVASCRIPT);
        Ww wwA = Ww.a(svO, C1437kl.n(AbstractC1135f5.f(i3)), wvM, wvM2, true);
        if (AbstractC0709Rg.f10942z.f16455b) {
            return new C0837Yp(new Rv(wwA, c0969c3, UUID.randomUUID().toString()), c0969c3);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    @Override // d4.g
    public a4.d m(a4.d dVar) {
        Integer num = (Integer) this.f4365a;
        int i = this.f4368d;
        int i3 = this.f4369e;
        Long l2 = (Long) this.f4366b;
        Long l6 = (Long) this.f4367c;
        List arrayList = (List) this.f4370f;
        List arrayList2 = (List) this.f4371g;
        int i6 = C2267a.f19773p;
        a4.d dVarA = dVar == null ? a4.d.a(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : dVar;
        int iIntValue = num == null ? dVarA.f4679a : num.intValue();
        long jLongValue = l2 == null ? dVarA.f4682d : l2.longValue();
        long jLongValue2 = l6 == null ? dVarA.f4683e : l6.longValue();
        if (arrayList == null) {
            List list = dVarA.f4684f;
            arrayList = list != null ? new ArrayList(list) : new ArrayList();
        }
        if (arrayList2 == null) {
            List list2 = dVarA.f4685g;
            arrayList2 = list2 != null ? new ArrayList(list2) : new ArrayList();
        }
        return a4.d.a(iIntValue, i, i3, jLongValue, jLongValue2, arrayList, arrayList2);
    }
}
