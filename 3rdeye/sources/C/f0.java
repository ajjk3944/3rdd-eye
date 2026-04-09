package C;

import A9.C0609x;
import F3.m;
import G3.b;
import X8.a;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.preference.Preference;
import com.applovin.impl.privacy.cmp.a;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import com.yandex.mobile.ads.impl.C4137j5;
import com.yandex.mobile.ads.impl.C4158m5;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.n00;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.tn0;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.preferences.common.PremiumSupportPreference;
import f9.C4351i;
import f9.InterfaceC4348f;
import f9.InterfaceC4350h;
import g5.InterfaceC4391a;
import g5.InterfaceC4392b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;
import r5.g;
import y3.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements b.c, b.a, m.a, InterfaceC4391a.InterfaceC0459a, OnPaidEventListener, UserMessagingPlatform.OnConsentFormLoadSuccessListener, C4137j5.a, n00.g.a, nr0.a, Continuation, Preference.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f701c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f702d;

    public /* synthetic */ f0(int i, Object obj, Object obj2) {
        this.f700b = i;
        this.f701c = obj;
        this.f702d = obj2;
    }

    @Override // com.yandex.mobile.ads.impl.n00.g.a
    public List a(int i, l52 l52Var, int[] iArr) {
        return n00.a((n00.c) this.f701c, (int[]) this.f702d, i, l52Var, iArr);
    }

    @Override // F3.m.a
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        F3.m mVar = (F3.m) this.f701c;
        F3.e eVar = mVar.f1622e;
        int iC = eVar.c();
        y3.j jVar = (y3.j) this.f702d;
        ArrayList arrayListA = mVar.A(sQLiteDatabase, jVar, iC);
        for (v3.e eVar2 : v3.e.values()) {
            if (eVar2 != jVar.f48077c) {
                int iC2 = eVar.c() - arrayListA.size();
                if (iC2 <= 0) {
                    break;
                }
                arrayListA.addAll(mVar.A(sQLiteDatabase, jVar.e(eVar2), iC2));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListA.size(); i++) {
            sb.append(((F3.g) arrayListA.get(i)).b());
            if (i < arrayListA.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                long j4 = cursor.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j4));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j4), hashSet);
                }
                hashSet.add(new m.b(cursor.getString(1), cursor.getString(2)));
            }
            cursorQuery.close();
            ListIterator listIterator = arrayListA.listIterator();
            while (listIterator.hasNext()) {
                F3.g gVar = (F3.g) listIterator.next();
                if (map.containsKey(Long.valueOf(gVar.b()))) {
                    h.a aVarM = gVar.a().m();
                    for (m.b bVar : (Set) map.get(Long.valueOf(gVar.b()))) {
                        aVarM.a(bVar.f1624a, bVar.f1625b);
                    }
                    listIterator.set(new F3.b(gVar.b(), gVar.c(), aVarM.b()));
                }
            }
            return arrayListA;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    public void b(a.C0198a c0198a) {
        InterfaceC4350h interfaceC4350hA = C0609x.a(C4351i.f37871b, (InterfaceC4350h) this.f701c, true);
        I9.c cVar = A9.U.f211a;
        if (interfaceC4350hA != cVar && interfaceC4350hA.get(InterfaceC4348f.a.f37870b) == null) {
            interfaceC4350hA = interfaceC4350hA.plus(cVar);
        }
        H9.b bVar = new H9.b(interfaceC4350hA, c0198a);
        U8.b.set(c0198a, new U8.a(new H9.a(bVar)));
        A9.G.DEFAULT.invoke((i8.g) this.f702d, bVar, bVar);
    }

    @Override // androidx.preference.Preference.c
    public boolean e(Preference it) {
        kotlin.jvm.internal.l.f(it, "it");
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        PremiumSupportPreference premiumSupportPreference = (PremiumSupportPreference) this.f702d;
        String email = premiumSupportPreference.f37078Q;
        String str = premiumSupportPreference.f37079R;
        eVarA.f37011C.getClass();
        Context context = (Context) this.f701c;
        kotlin.jvm.internal.l.f(email, "email");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return true;
        }
        e.a.a().f37036z.e(activity, email, str);
        return true;
    }

    @Override // G3.b.a
    public Object execute() {
        ((E3.j) this.f701c).f1399c.z((Iterable) this.f702d);
        return null;
    }

    @Override // g5.InterfaceC4391a.InterfaceC0459a
    public void h(InterfaceC4392b interfaceC4392b) {
        ((InterfaceC4391a.InterfaceC0459a) this.f701c).h(interfaceC4392b);
        ((InterfaceC4391a.InterfaceC0459a) this.f702d).h(interfaceC4392b);
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        ((AtomicReference) this.f701c).set(aVar);
        return B4.f.c(new StringBuilder(), (String) this.f702d, "-Surface");
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        ed edVar = (ed) obj;
        switch (this.f700b) {
            case 9:
                edVar.getClass();
                break;
            default:
                edVar.getClass();
                break;
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((com.applovin.impl.privacy.cmp.a) this.f701c).a((a.InterfaceC0315a) this.f702d, consentForm);
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        kotlin.jvm.internal.l.f(adValue, "adValue");
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        ResponseInfo responseInfo = ((AdView) this.f701c).getResponseInfo();
        eVarA.f37021k.m((String) this.f702d, adValue, responseInfo != null ? responseInfo.getMediationAdapterClassName() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.remoteconfig.internal.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.net.HttpURLConnection] */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Throwable {
        Integer num;
        Throwable th;
        Integer numValueOf;
        r5.i iVar;
        int responseCode;
        boolean zD;
        ?? r12 = (com.google.firebase.remoteconfig.internal.e) this.f701c;
        ?? r22 = (Task) this.f702d;
        r12.getClass();
        try {
            try {
            } catch (IOException e4) {
                e = e4;
                r22 = 0;
                numValueOf = null;
            } catch (Throwable th2) {
                num = null;
                th = th2;
                r22 = 0;
            }
            if (!r22.isSuccessful()) {
                throw new IOException(r22.getException());
            }
            r12.i(true);
            r22 = (HttpURLConnection) r22.getResult();
            try {
                responseCode = r22.getResponseCode();
                numValueOf = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        synchronized (r12) {
                            r12.f23338c = 8;
                        }
                        r12.f23349o.e(0, com.google.firebase.remoteconfig.internal.d.f23325f);
                        r12.k(r22).c();
                    } catch (IOException e10) {
                        e = e10;
                        Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                        com.google.firebase.remoteconfig.internal.e.b(r22);
                        r12.i(false);
                        boolean z10 = numValueOf == null || com.google.firebase.remoteconfig.internal.e.d(numValueOf.intValue());
                        if (z10) {
                            r12.l(new Date(r12.f23348n.currentTimeMillis()));
                        }
                        if (!z10 && numValueOf.intValue() != 200) {
                            String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (numValueOf.intValue() == 403) {
                                strF = com.google.firebase.remoteconfig.internal.e.f(r22.getErrorStream());
                            }
                            int iIntValue = numValueOf.intValue();
                            g.a aVar = g.a.UNKNOWN;
                            iVar = new r5.i(iIntValue, strF, 0);
                            r12.g(iVar);
                            return Tasks.forResult(null);
                        }
                        r12.h();
                        return Tasks.forResult(null);
                    }
                }
                com.google.firebase.remoteconfig.internal.e.b(r22);
                r12.i(false);
                zD = com.google.firebase.remoteconfig.internal.e.d(responseCode);
                if (zD) {
                    r12.l(new Date(r12.f23348n.currentTimeMillis()));
                }
            } catch (IOException e11) {
                e = e11;
                numValueOf = null;
            } catch (Throwable th3) {
                num = null;
                th = th3;
                com.google.firebase.remoteconfig.internal.e.b(r22);
                r12.i(false);
                boolean z11 = num == null || com.google.firebase.remoteconfig.internal.e.d(num.intValue());
                if (z11) {
                    r12.l(new Date(r12.f23348n.currentTimeMillis()));
                }
                if (z11 || num.intValue() == 200) {
                    r12.h();
                } else {
                    String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        strF2 = com.google.firebase.remoteconfig.internal.e.f(r22.getErrorStream());
                    }
                    int iIntValue2 = num.intValue();
                    g.a aVar2 = g.a.UNKNOWN;
                    r12.g(new r5.i(iIntValue2, strF2, 0));
                }
                throw th;
            }
            if (!zD && responseCode != 200) {
                String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                if (responseCode == 403) {
                    strF3 = com.google.firebase.remoteconfig.internal.e.f(r22.getErrorStream());
                }
                g.a aVar3 = g.a.UNKNOWN;
                iVar = new r5.i(responseCode, strF3, 0);
                r12.g(iVar);
                return Tasks.forResult(null);
            }
            r12.h();
            return Tasks.forResult(null);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public /* synthetic */ f0(String str, AdView adView) {
        this.f700b = 5;
        this.f702d = str;
        this.f701c = adView;
    }

    @Override // com.yandex.mobile.ads.impl.C4137j5.a
    public void a() {
        C4158m5.a((C4158m5) this.f701c, (tn0) this.f702d);
    }
}
