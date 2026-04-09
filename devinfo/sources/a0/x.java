package a0;

import android.app.ApplicationExitInfo;
import android.content.ContentResolver;
import android.provider.Settings;
import com.applovin.impl.h5;
import com.applovin.impl.k3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.u3;
import com.applovin.impl.y2;
import com.google.android.gms.internal.measurement.z3;
import com.liuzh.deviceinfo.pro.account.AccountProActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements w, s.a, f.b, l.d, s3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143a;

    public /* synthetic */ x(int i4) {
        this.f143a = i4;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo c(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    @Override // com.applovin.impl.s3.b
    public Object a(Object obj) {
        return u3.a((Long) obj);
    }

    @Override // s.a
    public Object apply(Object obj) {
        Iterator it;
        t6.f0 f0Var;
        t6.f0 f0Var2;
        int i4;
        t6.e eVar;
        t6.g0 g0Var;
        long j;
        int i10;
        long jB;
        int i11;
        boolean z3;
        switch (this.f143a) {
            case 2:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(zj.o.T(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    b7.q qVar = (b7.q) it2.next();
                    List list2 = qVar.f2028q;
                    t6.g0 g0Var2 = qVar.f2015b;
                    t6.h hVar = !list2.isEmpty() ? (t6.h) list2.get(0) : t6.h.f34355b;
                    UUID uuidFromString = UUID.fromString(qVar.f2014a);
                    nk.k.d(uuidFromString, "fromString(...)");
                    HashSet hashSet = new HashSet(qVar.f2027p);
                    t6.h hVar2 = qVar.f2016c;
                    int i12 = qVar.f2020h;
                    int i13 = qVar.f2024m;
                    t6.e eVar2 = qVar.g;
                    ArrayList arrayList2 = arrayList;
                    long j8 = qVar.f2017d;
                    long j9 = qVar.f2018e;
                    if (j9 != 0) {
                        it = it2;
                        f0Var = new t6.f0(j9, qVar.f2019f);
                    } else {
                        it = it2;
                        f0Var = null;
                    }
                    t6.g0 g0Var3 = t6.g0.f34349a;
                    if (g0Var2 == g0Var3) {
                        String str = b7.r.f2029z;
                        if (g0Var2 != g0Var3 || i12 <= 0) {
                            i11 = i13;
                            i10 = i12;
                            z3 = false;
                        } else {
                            i11 = i13;
                            i10 = i12;
                            z3 = true;
                        }
                        f0Var2 = f0Var;
                        eVar = eVar2;
                        i4 = i11;
                        g0Var = g0Var2;
                        jB = z3.b(z3, i10, qVar.f2021i, qVar.j, qVar.f2022k, qVar.f2023l, j9 != 0, j8, qVar.f2019f, j9, qVar.f2025n);
                        j = j8;
                    } else {
                        f0Var2 = f0Var;
                        i4 = i13;
                        eVar = eVar2;
                        g0Var = g0Var2;
                        j = j8;
                        i10 = i12;
                        jB = Long.MAX_VALUE;
                    }
                    arrayList2.add(new t6.h0(uuidFromString, g0Var, hashSet, hVar2, hVar, i10, i4, eVar, j, f0Var2, jB, qVar.f2026o));
                    arrayList = arrayList2;
                    it2 = it;
                }
                return arrayList;
            case 8:
                return k3.a((h5) obj);
            case 9:
                return com.applovin.impl.sdk.ad.b.m((h5) obj);
            case 10:
                return com.applovin.impl.sdk.ad.b.n((h5) obj);
            case 11:
                return com.applovin.impl.sdk.ad.b.r((h5) obj);
            case 12:
                return com.applovin.impl.sdk.ad.b.l((h5) obj);
            case 13:
                return com.applovin.impl.sdk.ad.b.h((h5) obj);
            case 14:
                return com.applovin.impl.sdk.ad.b.q((h5) obj);
            case 22:
                return AppLovinNativeAdImpl.lambda$getCustomTabsSettings$1((h5) obj);
            case 24:
                return y2.f((h5) obj);
            case 25:
                return y2.b((h5) obj);
            case 26:
                return y2.d((h5) obj);
            case 27:
                return y2.g((h5) obj);
            default:
                return y2.e((h5) obj);
        }
    }

    @Override // f.b
    public void k(Object obj) {
        ((Boolean) obj).getClass();
        int i4 = AccountProActivity.H;
    }

    @Override // com.applovin.impl.sdk.l.d
    public String a(ContentResolver contentResolver, String str) {
        switch (this.f143a) {
            case 19:
                return Settings.System.getString(contentResolver, str);
            case 20:
                return Settings.Secure.getString(contentResolver, str);
            default:
                return Settings.Global.getString(contentResolver, str);
        }
    }

    @Override // a0.w
    public float a(float f10) {
        return f10;
    }
}
