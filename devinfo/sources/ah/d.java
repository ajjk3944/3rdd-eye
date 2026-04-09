package ah;

import a0.x0;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import bh.t;
import com.applovin.impl.c9;
import com.applovin.impl.j2;
import com.applovin.impl.l8;
import com.applovin.impl.p;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.q;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.s4;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.gms.internal.ads.l90;
import com.google.android.gms.internal.ads.xn;
import com.google.android.gms.internal.ads.xs;
import com.google.android.gms.internal.consent_sdk.a0;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.tabs.TabLayout;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;
import com.liuzh.deviceinfo.pro.ProActivity;
import com.liuzho.lib.appinfo.AppInfoActivity;
import e4.c2;
import e4.s;
import e4.v0;
import ec.r1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import t6.i0;
import xk.w;
import xk.x;
import xk.y0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements s, s4.b, s2.a, ConsentInformation.OnConsentInfoUpdateSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener, f.b, ma.b, Continuation, la.f, OnSuccessListener, eb.c, h3.i, ti.m, zg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f378d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(ck.h hVar, w wVar, mk.e eVar) {
        this.f375a = 17;
        this.f376b = hVar;
        this.f377c = wVar;
        this.f378d = (ek.j) eVar;
    }

    @Override // com.applovin.impl.s2.a
    public void a(j2 j2Var, r2 r2Var) {
        switch (this.f375a) {
            case 2:
                ((p) this.f376b).a((com.applovin.impl.sdk.k) this.f377c, (com.applovin.impl.n) this.f378d, j2Var, r2Var);
                break;
            default:
                ((q) this.f376b).a((List) this.f377c, (com.applovin.impl.sdk.k) this.f378d, j2Var, r2Var);
                break;
        }
    }

    @Override // la.f
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        ha.c cVar;
        ha.c cVar2;
        int i4 = this.f375a;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        ha.c cVar3 = ha.c.CACHE_FULL;
        int i13 = 2;
        Object obj2 = this.f378d;
        Object obj3 = this.f377c;
        Object obj4 = this.f376b;
        int i14 = 0;
        int i15 = 1;
        switch (i4) {
            case 10:
                la.h hVar = (la.h) obj4;
                ea.h hVar2 = (ea.h) obj3;
                ea.l lVar = hVar2.f22488c;
                String str = hVar2.f22486a;
                ea.i iVar = (ea.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = hVar.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.c().compileStatement("PRAGMA page_count").simpleQueryForLong();
                la.a aVar = hVar.f28644d;
                if (jSimpleQueryForLong >= aVar.f28628a) {
                    hVar.p(1L, cVar3, str);
                    return -1L;
                }
                Long lE = la.h.e(sQLiteDatabase, iVar);
                if (lE != null) {
                    jInsert = lE.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f22494a);
                    contentValues.put("priority", Integer.valueOf(oa.a.a(iVar.f22496c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f22495b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i16 = aVar.f28632e;
                byte[] bArr2 = lVar.f22504b;
                boolean z3 = bArr2.length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.f22489d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.f22490e));
                contentValues2.put("payload_encoding", lVar.f22503a.f2089a);
                contentValues2.put("code", hVar2.f22487b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z3));
                contentValues2.put("payload", z3 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", hVar2.g);
                contentValues2.put("pseudonymous_id", hVar2.f22492h);
                contentValues2.put("experiment_ids_clear_blob", hVar2.f22493i);
                contentValues2.put("experiment_ids_encrypted_blob", hVar2.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z3) {
                    int iCeil = (int) Math.ceil(bArr2.length / i16);
                    for (int i17 = 1; i17 <= iCeil; i17++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(hVar2.f22491f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 11:
                la.h hVar3 = (la.h) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ea.i iVar2 = (ea.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i18 = cursor2.getInt(7) != 0 ? i15 : 0;
                    a0 a0Var = new a0(i15);
                    a0Var.f19260h = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    a0Var.f19255b = string;
                    a0Var.f19259f = Long.valueOf(cursor2.getLong(i13));
                    a0Var.g = Long.valueOf(cursor2.getLong(3));
                    if (i18 != 0) {
                        String string2 = cursor2.getString(4);
                        a0Var.f19258e = new ea.l(string2 == null ? la.h.f28640f : new ba.b(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        ba.b bVar = string3 == null ? la.h.f28640f : new ba.b(string3);
                        Cursor cursorQuery = hVar3.c().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i19 = 0;
                            int length2 = 0;
                            while (i19 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i19);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i19++;
                                    cursorQuery = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            a0Var.f19258e = new ea.l(bVar, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        a0Var.f19257d = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        a0Var.f19261i = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        a0Var.f19256c = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        a0Var.j = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        a0Var.f19262k = cursor2.getBlob(11);
                    }
                    arrayList.add(new la.b(j, iVar2, a0Var.c()));
                    i15 = 1;
                    i13 = 2;
                }
                return null;
            default:
                la.h hVar4 = (la.h) obj4;
                HashMap map = (HashMap) obj3;
                x0 x0Var = (x0) obj2;
                ArrayList arrayList4 = (ArrayList) x0Var.f145b;
                Cursor cursor3 = (Cursor) obj;
                hVar4.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i14);
                    int i20 = cursor3.getInt(1);
                    ha.c cVar4 = ha.c.REASON_UNKNOWN;
                    if (i20 != 0) {
                        if (i20 == 1) {
                            cVar4 = ha.c.MESSAGE_TOO_OLD;
                        } else if (i20 == 2) {
                            cVar = cVar3;
                            cVar2 = cVar;
                        } else if (i20 == i12) {
                            cVar4 = ha.c.PAYLOAD_TOO_BIG;
                        } else if (i20 == i11) {
                            cVar4 = ha.c.MAX_RETRIES_REACHED;
                        } else if (i20 == i10) {
                            cVar4 = ha.c.INVALID_PAYLOD;
                        } else if (i20 == 6) {
                            cVar4 = ha.c.SERVER_ERROR;
                        } else {
                            ii.a.j("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i20));
                        }
                        cVar2 = cVar3;
                        cVar = cVar4;
                    } else {
                        cVar2 = cVar3;
                        cVar = cVar4;
                    }
                    long j8 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new ha.d(j8, cVar));
                    cVar3 = cVar2;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                    i14 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i21 = ha.e.f25032c;
                    new ArrayList();
                    arrayList4.add(new ha.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long jI = hVar4.f28642b.i();
                SQLiteDatabase sQLiteDatabaseC = hVar4.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        ha.g gVar = new ha.g(cursorRawQuery.getLong(0), jI);
                        cursorRawQuery.close();
                        sQLiteDatabaseC.setTransactionSuccessful();
                        sQLiteDatabaseC.endTransaction();
                        x0Var.f148e = gVar;
                        x0Var.f146c = new ha.b(new ha.f(hVar4.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar4.c().compileStatement("PRAGMA page_count").simpleQueryForLong(), la.a.f28627f.f28628a));
                        x0Var.f147d = (String) hVar4.f28645e.get();
                        return new ha.a((ha.g) x0Var.f148e, DesugarCollections.unmodifiableList(arrayList4), (ha.b) x0Var.f146c, (String) x0Var.f147d);
                    } catch (Throwable th4) {
                        cursorRawQuery.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    sQLiteDatabaseC.endTransaction();
                    throw th5;
                }
        }
    }

    @Override // ti.m
    public void b(Uri uri) {
        switch (this.f375a) {
            case 20:
                i0.f fVar = (i0.f) this.f376b;
                String str = (String) this.f377c;
                km.i iVar = (km.i) this.f378d;
                fVar.getClass();
                new Thread(new c9(fVar, uri, str, new Handler(Looper.getMainLooper()), iVar, 9)).start();
                break;
            case 21:
                new Thread(new c9((i0.f) this.f376b, (Drawable) this.f377c, new Handler(Looper.getMainLooper()), (wi.b) this.f378d, uri, 8)).start();
                break;
            default:
                new Thread(new r1((String) this.f376b, (th.e) this.f378d, (String[]) this.f377c, uri)).start();
                break;
        }
    }

    @Override // eb.c
    public void d(xs xsVar) {
        xn xnVar = xsVar.f18456a;
        Context context = (Context) this.f376b;
        pi.a aVar = (pi.a) this.f377c;
        pi.g gVar = (pi.g) this.f378d;
        try {
            xnVar.d2(new va.s2(new qi.c(aVar, gVar, 3)));
        } catch (RemoteException e2) {
            za.i.f("Failed to setOnPaidEventListener", e2);
        }
        eb.e eVar = new eb.e(context);
        LayoutInflater.from(context).inflate(aVar.f32008f, eVar);
        TextView textView = (TextView) eVar.findViewById(R.id.ad_title);
        if (textView != null) {
            textView.setText(xsVar.b());
            textView.setBackgroundColor(0);
            eVar.setHeadlineView(textView);
        }
        TextView textView2 = (TextView) eVar.findViewById(R.id.ad_description);
        if (textView2 != null) {
            textView2.setText(xsVar.a());
            textView2.setBackgroundColor(0);
            eVar.setBodyView(textView2);
        }
        ImageView imageView = (ImageView) eVar.findViewById(R.id.ad_icon);
        String strC1 = null;
        if (imageView != null) {
            l90 l90Var = xsVar.f18458c;
            imageView.setImageDrawable(l90Var != null ? (Drawable) l90Var.f13427c : null);
            eVar.setIconView(imageView);
        }
        TextView textView3 = (TextView) eVar.findViewById(R.id.ad_button);
        if (textView3 != null) {
            try {
                strC1 = xnVar.C1();
            } catch (RemoteException e10) {
                za.i.f("", e10);
            }
            textView3.setText(strC1);
            eVar.setCallToActionView(textView3);
        }
        ViewGroup viewGroup = (ViewGroup) eVar.findViewById(R.id.ad_media_view);
        if (viewGroup != null) {
            eb.b bVar = new eb.b(eVar.getContext());
            viewGroup.addView(bVar, new ViewGroup.LayoutParams(-1, -1));
            eVar.setMediaView(bVar);
        }
        View viewFindViewById = eVar.findViewById(R.id.ad_close);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new com.applovin.mediation.nativeAds.a(18, gVar));
        }
        eVar.setNativeAd(xsVar);
        gVar.D(new qi.e(eVar, 1));
    }

    @Override // zg.b
    public void e() {
        Context context = (Context) this.f376b;
        yk.c cVar = (yk.c) this.f377c;
        f.b bVar = (f.b) this.f378d;
        t7.m mVar = new t7.m(context);
        mVar.y(R.string.missing_permission);
        mVar.v(R.string.storage_analyze_permission_summary);
        mVar.x(R.string.grant, new eg.d(13, cVar));
        mVar.w(android.R.string.cancel, new eg.d(14, bVar));
        ((i.b) mVar.f34474c).f25240m = false;
        i.e eVarA = mVar.A();
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        com.liuzh.deviceinfo.utilities.f.a();
        dj.b.t(eVarA, com.liuzh.deviceinfo.utilities.f.d());
    }

    @Override // ma.b
    public Object execute() {
        ja.a aVar = (ja.a) this.f376b;
        ea.i iVar = (ea.i) this.f377c;
        ea.h hVar = (ea.h) this.f378d;
        la.h hVar2 = (la.h) aVar.f27479d;
        hVar2.getClass();
        ba.c cVar = iVar.f22496c;
        String str = hVar.f22486a;
        String str2 = iVar.f22494a;
        String strR = ii.a.r("SQLiteEventStore");
        if (Log.isLoggable(strR, 3)) {
            Log.d(strR, "Storing event with priority=" + cVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.g(new d(hVar2, hVar, iVar, 10))).getClass();
        aVar.f27476a.N(iVar, 1, false);
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ek.j, mk.e] */
    @Override // h3.i
    public Object i(h3.h hVar) {
        switch (this.f375a) {
            case 17:
                ck.h hVar2 = (ck.h) this.f376b;
                w wVar = (w) this.f377c;
                ?? r22 = (ek.j) this.f378d;
                ig.l lVar = new ig.l(17, (y0) hVar2.O(xk.s.f37235b));
                h3.m mVar = hVar.f24835c;
                if (mVar != null) {
                    mVar.a(lVar, t6.k.f34375a);
                }
                return x.v(x.b(hVar2), null, wVar, new t((mk.e) r22, hVar, (ck.c) null), 1);
            default:
                Executor executor = (Executor) this.f376b;
                String str = (String) this.f377c;
                mk.a aVar = (mk.a) this.f378d;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                t6.o oVar = new t6.o(atomicBoolean, 0);
                h3.m mVar2 = hVar.f24835c;
                if (mVar2 != null) {
                    mVar2.a(oVar, t6.k.f34375a);
                }
                executor.execute(new t6.p(atomicBoolean, hVar, aVar, 0));
                return str;
        }
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) {
        int i4 = this.f375a;
        Object obj = this.f378d;
        Object obj2 = this.f377c;
        Object obj3 = this.f376b;
        switch (i4) {
            case 0:
                ProActivity proActivity = (ProActivity) obj3;
                View view2 = (View) obj2;
                int i10 = ProActivity.L;
                v3.b bVarX = nh.a.x(c2Var);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                int i11 = bVarX.f35794b;
                marginLayoutParams.topMargin = i11;
                marginLayoutParams.rightMargin = bVarX.f35795c;
                marginLayoutParams.leftMargin = bVarX.f35793a;
                view2.setLayoutParams(marginLayoutParams);
                View viewFindViewById = proActivity.findViewById(R.id.header);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
                marginLayoutParams2.height = a4.a.b(160.0f) + i11;
                viewFindViewById.setLayoutParams(marginLayoutParams2);
                nh.a.a(proActivity.getResources().getDimensionPixelSize(R.dimen.content_padding_x1_5), proActivity.findViewById(R.id.title), bVarX);
                nh.a.a(0, proActivity.findViewById(R.id.feature_ads), bVarX);
                nh.a.a(0, proActivity.findViewById(R.id.feature_themes), bVarX);
                nh.a.a(0, proActivity.findViewById(R.id.feature_custom_monitor), bVarX);
                nh.a.a(0, proActivity.findViewById(R.id.feature_smart_selection), bVarX);
                nh.a.a(0, proActivity.findViewById(R.id.bottom_container), bVarX);
                nh.a.a(0, proActivity.findViewById(R.id.restore), bVarX);
                nh.a.a(0, proActivity.findViewById(R.id.pay_notice_title), bVarX);
                nh.a.a(0, proActivity.findViewById(R.id.pay_notice), bVarX);
                ((View) obj).setPadding(0, 0, 0, bVarX.f35796d);
                break;
            default:
                AppInfoActivity appInfoActivity = (AppInfoActivity) obj3;
                Toolbar toolbar = (Toolbar) obj2;
                int i12 = AppInfoActivity.I;
                v3.b bVarX2 = nh.a.x(c2Var);
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                int iN = cm.g.n(R.attr.actionBarSize, appInfoActivity);
                int i13 = bVarX2.f35794b;
                layoutParams.height = iN + i13;
                toolbar.setLayoutParams(layoutParams);
                int i14 = bVarX2.f35793a;
                int i15 = bVarX2.f35795c;
                toolbar.setPadding(i14, i13, i15, toolbar.getPaddingBottom());
                ((TabLayout) obj).setPadding(i14, 0, i15, 0);
                appInfoActivity.findViewById(R.id.content_container).setPadding(i14, 0, i15, bVarX2.f35796d);
                break;
        }
        return v0.j(view, c2Var);
    }

    @Override // f.b
    public void k(Object obj) {
        StorageAnalyzeActivity storageAnalyzeActivity = (StorageAnalyzeActivity) this.f376b;
        Bundle bundle = (Bundle) this.f377c;
        String str = (String) this.f378d;
        Boolean bool = (Boolean) obj;
        int i4 = StorageAnalyzeActivity.C;
        storageAnalyzeActivity.getClass();
        if (i0.l(storageAnalyzeActivity)) {
            return;
        }
        if (bool.booleanValue()) {
            storageAnalyzeActivity.D(bundle, str);
        } else {
            storageAnalyzeActivity.finish();
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((com.applovin.impl.privacy.cmp.a) this.f376b).a((a.InterfaceC0017a) this.f377c, (FormError) this.f378d, formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        switch (this.f375a) {
            case 3:
                ((com.applovin.impl.privacy.cmp.a) this.f376b).a((Activity) this.f377c, (a.InterfaceC0017a) this.f378d);
                break;
            default:
                final mg.c cVar = (mg.c) this.f376b;
                i.g gVar = (i.g) this.f377c;
                final mg.a aVar = (mg.a) this.f378d;
                cVar.f29371a.canRequestAds();
                UserMessagingPlatform.loadAndShowConsentFormIfRequired(gVar, new ConsentForm.OnConsentFormDismissedListener() { // from class: mg.b
                    @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                    public final void onConsentFormDismissed(FormError formError) {
                        cVar.f29371a.canRequestAds();
                        a aVar2 = aVar;
                        if (formError == null) {
                            a.a.q();
                            aVar2.c();
                            return;
                        }
                        formError.getErrorCode();
                        formError.getMessage();
                        a.a.q();
                        formError.getErrorCode();
                        formError.getMessage();
                        aVar2.d();
                    }
                });
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) throws JSONException {
        x0 x0Var = (x0) this.f376b;
        Task task = (Task) this.f377c;
        ge.c cVar = (ge.c) this.f378d;
        try {
            lf.c cVar2 = (lf.c) task.getResult();
            if (cVar2 != null) {
                ((Executor) x0Var.f146c).execute(new mf.a(cVar, ((km.o) x0Var.f145b).d(cVar2), 1));
            }
        } catch (kf.d e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e2);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws NoSuchAlgorithmException {
        lf.c cVar;
        URL url;
        switch (this.f375a) {
            case 8:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f376b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f377c;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f378d;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
            case 9:
                kf.b bVar = (kf.b) this.f376b;
                Task task2 = (Task) this.f377c;
                Task task3 = (Task) this.f378d;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                lf.c cVar2 = (lf.c) task2.getResult();
                return (task3.isSuccessful() && (cVar = (lf.c) task3.getResult()) != null && cVar2.f28748c.equals(cVar.f28748c)) ? Tasks.forResult(Boolean.FALSE) : bVar.f28266e.e(cVar2).continueWith(bVar.f28264c, new kf.a(bVar));
            default:
                lf.j jVar = (lf.j) this.f376b;
                Task task4 = (Task) this.f377c;
                Task task5 = (Task) this.f378d;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new kf.c("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                if (!task5.isSuccessful()) {
                    return Tasks.forException(new kf.c("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                }
                try {
                    try {
                        url = new URL(jVar.c(jVar.f28788n));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    jVar.l(httpURLConnection, (String) task5.getResult(), ((df.a) task4.getResult()).f22226a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e2) {
                    return Tasks.forException(new kf.c("Failed to open HTTP stream connection", e2));
                }
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i4) {
        this.f375a = i4;
        this.f376b = obj;
        this.f377c = obj2;
        this.f378d = obj3;
    }

    @Override // com.applovin.impl.s4.b
    public void a(boolean z3, Object obj, Object obj2) {
        ((l8) this.f376b).a((AppLovinPostbackListener) this.f377c, (String) this.f378d, z3, (String) obj, (String) obj2);
    }
}
