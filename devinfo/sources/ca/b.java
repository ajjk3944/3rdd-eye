package ca;

import a0.x0;
import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.f1;
import b5.o0;
import cm.g;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.c;
import com.google.android.gms.internal.ads.e80;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.gson.internal.n;
import com.google.gson.internal.t;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import com.liuzh.deviceinfo.pro.account.AccountActivity;
import com.liuzh.deviceinfo.pro.account.delete.DeleteAccountActivity;
import com.liuzh.deviceinfo.pro.account.register.BindEmailActivity;
import com.liuzh.deviceinfo.pro.account.register.RegisterActivity;
import com.liuzh.deviceinfo.pro.account.register.ResetPwdActivity;
import com.liuzho.lib.fileanalyzer.activity.PicPreviewActivity;
import da.m;
import da.u;
import e4.c2;
import e4.s;
import e4.v0;
import e4.z1;
import hh.v;
import i0.f;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import je.y;
import kf.i;
import la.h;
import me.t1;
import nk.k;
import nm.d0;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements s.a, c.b, n, de.d, s, cf.a, f.b, Continuation, ma.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2827b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f2826a = i4;
        this.f2827b = obj;
    }

    @Override // com.applovin.impl.sdk.c.b
    public void a(c.a aVar) {
        ((com.applovin.impl.sdk.d) this.f2827b).c(aVar);
    }

    @Override // s.a
    public Object apply(Object obj) {
        return com.applovin.impl.sdk.ad.b.a((s.a) ((e) this.f2827b), (h5) obj);
    }

    @Override // com.google.gson.internal.n
    public Object b() {
        int i4 = this.f2826a;
        Object obj = this.f2827b;
        switch (i4) {
            case 3:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    t1 t1Var = wf.c.f36639a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e10) {
                    throw new RuntimeException("Failed to invoke constructor '" + wf.c.b(constructor) + "' with no args", e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to invoke constructor '" + wf.c.b(constructor) + "' with no args", e11.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return t.f20881a.a(cls);
                } catch (Exception e12) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e12);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x056e A[Catch: Exception -> 0x059b, TryCatch #2 {Exception -> 0x059b, blocks: (B:108:0x0469, B:110:0x0540, B:111:0x0545, B:113:0x056e, B:115:0x0576, B:117:0x0584, B:119:0x058a, B:121:0x0593, B:122:0x0597), top: B:152:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05a6  */
    @Override // de.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(androidx.lifecycle.f1 r51) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.b.c(androidx.lifecycle.f1):java.lang.Object");
    }

    @Override // cf.a
    public void d(cf.b bVar) {
        switch (this.f2826a) {
            case 13:
                ge.b bVar2 = (ge.b) this.f2827b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                bVar2.f24694b.set((ge.b) bVar.get());
                break;
            default:
                ge.c cVar = (ge.c) this.f2827b;
                x0 x0Var = ((i) ((nf.a) bVar.get())).a().j;
                ((Set) x0Var.f147d).add(cVar);
                Task taskB = ((lf.b) x0Var.f148e).b();
                taskB.addOnSuccessListener((Executor) x0Var.f146c, new ah.d(x0Var, taskB, cVar, 14));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    break;
                }
                break;
        }
    }

    public c e(yb.e eVar) throws IOException {
        d dVar = (d) this.f2827b;
        URL url = (URL) eVar.f37509b;
        String strR = ii.a.r("CctTransportBackend");
        if (Log.isLoggable(strR, 4)) {
            Log.i(strR, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) eVar.f37511d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    d0 d0Var = dVar.f2832a;
                    m mVar = (m) eVar.f37510c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ye.d dVar2 = (ye.d) d0Var.f30011b;
                    ye.e eVar2 = new ye.e(bufferedWriter, dVar2.f37577a, dVar2.f37578b, dVar2.f37579c, dVar2.f37580d);
                    eVar2.h(mVar);
                    eVar2.j();
                    eVar2.f37582b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strR2 = ii.a.r("CctTransportBackend");
                    if (Log.isLoggable(strR2, 4)) {
                        Log.i(strR2, String.format("Status Code: %d", numValueOf));
                    }
                    ii.a.j("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    ii.a.j("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new c(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            c cVar = new c(responseCode, (URL) null, u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f22169a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return cVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e2) {
            e = e2;
            ii.a.k("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, (URL) null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            ii.a.k("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new c(500, (URL) null, 0L);
        } catch (IOException e11) {
            e = e11;
            ii.a.k("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, (URL) null, 0L);
        } catch (we.b e12) {
            e = e12;
            ii.a.k("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new c(400, (URL) null, 0L);
        }
    }

    @Override // ma.b
    public Object execute() {
        SQLiteDatabase sQLiteDatabaseC;
        int i4 = this.f2826a;
        boolean z3 = false;
        Object obj = this.f2827b;
        switch (i4) {
            case 22:
                h hVar = (h) ((la.c) obj);
                hVar.getClass();
                int i10 = ha.a.f25016e;
                x0 x0Var = new x0(14, z3);
                x0Var.f148e = null;
                x0Var.f145b = new ArrayList();
                x0Var.f146c = null;
                x0Var.f147d = "";
                HashMap map = new HashMap();
                sQLiteDatabaseC = hVar.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    ha.a aVar = (ha.a) h.y(sQLiteDatabaseC.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ah.d(hVar, map, x0Var, 12));
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 23:
                h hVar2 = (h) ((la.d) obj);
                long jI = hVar2.f28642b.i() - hVar2.f28644d.f28631d;
                sQLiteDatabaseC = hVar2.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jI)};
                    Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            hVar2.p(cursorRawQuery.getInt(0), ha.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseC.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseC.setTransactionSuccessful();
                    sQLiteDatabaseC.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 24:
                h hVar3 = (h) ((la.c) ((com.google.android.gms.internal.consent_sdk.d) obj).f19302i);
                sQLiteDatabaseC = hVar3.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    sQLiteDatabaseC.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseC.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f28642b.i()).execute();
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                x0 x0Var2 = (x0) obj;
                Iterator it = ((Iterable) ((h) ((la.d) x0Var2.f145b)).g(new y(9))).iterator();
                while (it.hasNext()) {
                    ((f) x0Var2.f146c).N((ea.i) it.next(), 1, false);
                }
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void f() {
        mk.e eVar = (mk.e) this.f2827b;
        synchronized (g1.m.f24260c) {
            ?? r22 = g1.m.f24264h;
            k.e(r22, "<this>");
            ArrayList arrayList = new ArrayList(o.T(r22, 10));
            boolean z3 = false;
            for (Object obj : r22) {
                boolean z10 = true;
                if (!z3 && k.a(obj, eVar)) {
                    z3 = true;
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            g1.m.f24264h = arrayList;
        }
    }

    public void g(kj.f fVar) {
        HashMap map;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ej.m mVar = (ej.m) this.f2827b;
        k.e(fVar, "it");
        mVar.f23523f.h(fVar);
        kj.e eVar = fVar.f28365e;
        ej.k kVar = new ej.k(mVar);
        if (eVar.f28358f) {
            map = eVar.f28354b;
        } else {
            eVar.f28356d.add(kVar);
            map = null;
        }
        if (map != null) {
            jj.f fVar2 = mVar.f23519b;
            ArrayList arrayList4 = fVar.f28365e.f28355c;
            fVar2.f27699k = arrayList4;
            fVar2.f27698i.h(arrayList4);
            mVar.f23524h.h(yj.u.f37649a);
        }
        jj.d dVar = mVar.f23520c;
        kj.a aVar = fVar.g;
        dVar.getClass();
        if (aVar == null || (arrayList = aVar.f28342c) == null) {
            arrayList = new ArrayList();
        }
        dVar.b(arrayList);
        jj.d dVar2 = mVar.f23521d;
        kj.a aVar2 = fVar.f28364d;
        dVar2.getClass();
        if (aVar2 == null || (arrayList2 = aVar2.f28342c) == null) {
            arrayList2 = new ArrayList();
        }
        dVar2.b(arrayList2);
        jj.d dVar3 = mVar.f23522e;
        kj.a aVar3 = fVar.f28366f;
        dVar3.getClass();
        if (aVar3 == null || (arrayList3 = aVar3.f28342c) == null) {
            arrayList3 = new ArrayList();
        }
        dVar3.b(arrayList3);
        fVar.f28361a.a(mVar.f23530o);
    }

    public boolean h(o7.d dVar, int i4, Bundle bundle) {
        e4.e dVar2;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f2827b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i4 & 1) != 0) {
            try {
                ((g4.f) dVar.f30421b).e();
                Parcelable parcelable = (Parcelable) ((g4.f) dVar.f30421b).h();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        g4.f fVar = (g4.f) dVar.f30421b;
        ClipData clipData = new ClipData(fVar.getDescription(), new ClipData.Item(fVar.d()));
        if (i10 >= 31) {
            dVar2 = new e4.d(clipData, 2);
        } else {
            e4.f fVar2 = new e4.f();
            fVar2.f22329b = clipData;
            fVar2.f22330c = 2;
            dVar2 = fVar2;
        }
        dVar2.a(fVar.f());
        dVar2.setExtras(bundle);
        return v0.k(appCompatEditText, dVar2.build()) == null;
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) {
        int i4 = this.f2826a;
        Object obj = this.f2827b;
        switch (i4) {
            case 7:
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) obj;
                int i10 = DeleteAccountActivity.D;
                k.e(view, "v");
                v3.b bVarX = nh.a.x(c2Var);
                f1 f1Var = deleteAccountActivity.C;
                if (f1Var == null) {
                    k.k("binding");
                    throw null;
                }
                zh.i.a((Toolbar) f1Var.f1138f, bVarX);
                f1 f1Var2 = deleteAccountActivity.C;
                if (f1Var2 == null) {
                    k.k("binding");
                    throw null;
                }
                ScrollView scrollView = (ScrollView) f1Var2.f1137e;
                int i11 = bVarX.f35793a;
                if (f1Var2 != null) {
                    scrollView.setPadding(i11, ((Toolbar) f1Var2.f1138f).getLayoutParams().height, bVarX.f35795c, bVarX.f35796d);
                    return v0.j(view, c2Var);
                }
                k.k("binding");
                throw null;
            case 10:
                PicPreviewActivity picPreviewActivity = (PicPreviewActivity) obj;
                int i12 = PicPreviewActivity.C;
                k.e(view, "v");
                v3.b bVarX2 = nh.a.x(c2Var);
                int i13 = bVarX2.f35794b;
                int i14 = bVarX2.f35795c;
                int i15 = bVarX2.f35793a;
                f1 f1Var3 = picPreviewActivity.A;
                if (f1Var3 == null) {
                    k.k("binding");
                    throw null;
                }
                FrameLayout frameLayout = (FrameLayout) f1Var3.f1135c;
                frameLayout.setPadding(i15, frameLayout.getPaddingTop(), i14, bVarX2.f35796d);
                f1 f1Var4 = picPreviewActivity.A;
                if (f1Var4 == null) {
                    k.k("binding");
                    throw null;
                }
                Toolbar toolbar = (Toolbar) f1Var4.f1138f;
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = g.n(R.attr.actionBarSize, picPreviewActivity) + i13;
                toolbar.setLayoutParams(layoutParams);
                f1 f1Var5 = picPreviewActivity.A;
                if (f1Var5 == null) {
                    k.k("binding");
                    throw null;
                }
                Toolbar toolbar2 = (Toolbar) f1Var5.f1138f;
                toolbar2.setPadding(i15, i13, i14, toolbar2.getPaddingBottom());
                return v0.j(view, c2Var);
            case 15:
                h4.g gVar = (h4.g) obj;
                ArrayList arrayList = gVar.f24875b;
                z1 z1Var = c2Var.f22315a;
                v3.b bVarB = v3.b.b(z1Var.g(519), z1Var.g(64));
                v3.b bVarB2 = v3.b.b(z1Var.h(519), z1Var.h(64));
                if (!bVarB.equals(gVar.f24876c) || !bVarB2.equals(gVar.f24877d)) {
                    gVar.f24876c = bVarB;
                    gVar.f24877d = bVarB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        h4.c cVar = (h4.c) arrayList.get(size);
                        cVar.f24862c = bVarB;
                        cVar.f24863d = bVarB2;
                        cVar.c();
                    }
                }
                return c2Var;
            case 16:
                BindEmailActivity bindEmailActivity = (BindEmailActivity) obj;
                int i16 = BindEmailActivity.E;
                k.e(view, "v");
                v3.b bVarX3 = nh.a.x(c2Var);
                e80 e80Var = bindEmailActivity.C;
                if (e80Var == null) {
                    k.k("binding");
                    throw null;
                }
                zh.i.a((Toolbar) e80Var.f10741o, bVarX3);
                e80 e80Var2 = bindEmailActivity.C;
                if (e80Var2 == null) {
                    k.k("binding");
                    throw null;
                }
                ScrollView scrollView2 = (ScrollView) e80Var2.f10740n;
                int i17 = bVarX3.f35793a;
                if (e80Var2 != null) {
                    scrollView2.setPadding(i17, ((Toolbar) e80Var2.f10741o).getLayoutParams().height, bVarX3.f35795c, bVarX3.f35796d);
                    return v0.j(view, c2Var);
                }
                k.k("binding");
                throw null;
            case 17:
                o0 o0Var = RegisterActivity.B;
                k.e(view, "v");
                v3.b bVarX4 = nh.a.x(c2Var);
                LinearLayout linearLayout = (LinearLayout) ((km.n) obj).f28442b;
                k.d(linearLayout, "getRoot(...)");
                linearLayout.setPadding(bVarX4.f35793a, bVarX4.f35794b, bVarX4.f35795c, bVarX4.f35796d);
                return v0.j(view, c2Var);
            case 18:
                int i18 = ResetPwdActivity.C;
                k.e(view, "v");
                v3.b bVarX5 = nh.a.x(c2Var);
                LinearLayout linearLayout2 = (LinearLayout) ((km.o) obj).f28445a;
                k.d(linearLayout2, "getRoot(...)");
                linearLayout2.setPadding(bVarX5.f35793a, bVarX5.f35794b, bVarX5.f35795c, bVarX5.f35796d);
                return v0.j(view, c2Var);
            case 21:
                StorageCleanActivity storageCleanActivity = (StorageCleanActivity) obj;
                int i19 = StorageCleanActivity.K;
                k.e(view, "v");
                v3.b bVarX6 = nh.a.x(c2Var);
                int i20 = bVarX6.f35796d;
                int i21 = bVarX6.f35795c;
                int i22 = bVarX6.f35793a;
                e80 e80Var3 = storageCleanActivity.E;
                if (e80Var3 == null) {
                    k.k("binding");
                    throw null;
                }
                zh.i.a((Toolbar) e80Var3.f10739m, bVarX6);
                c1.o oVar = storageCleanActivity.F;
                if (oVar == null) {
                    k.k("scanningBinding");
                    throw null;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) oVar.f2570b;
                e80 e80Var4 = storageCleanActivity.E;
                if (e80Var4 == null) {
                    k.k("binding");
                    throw null;
                }
                constraintLayout.setPadding(i22, ((Toolbar) e80Var4.f10739m).getLayoutParams().height, i21, i20);
                e80 e80Var5 = storageCleanActivity.E;
                if (e80Var5 == null) {
                    k.k("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) e80Var5.f10737k;
                if (e80Var5 == null) {
                    k.k("binding");
                    throw null;
                }
                constraintLayout2.setPadding(i22, ((Toolbar) e80Var5.f10739m).getLayoutParams().height, i21, i20);
                e80 e80Var6 = storageCleanActivity.E;
                if (e80Var6 == null) {
                    k.k("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) e80Var6.f10731c;
                if (e80Var6 != null) {
                    constraintLayout3.setPadding(i22, ((Toolbar) e80Var6.f10739m).getLayoutParams().height, i21, i20);
                    return v0.j(view, c2Var);
                }
                k.k("binding");
                throw null;
            default:
                k.e(view, "v");
                ((ki.m) obj).f28339m = nh.a.x(c2Var);
                return v0.j(view, c2Var);
        }
    }

    @Override // f.b
    public void k(Object obj) {
        i.g gVarN;
        v vVar = (v) this.f2827b;
        k.e((yj.u) obj, "loginData");
        bh.c cVar = bh.c.f2188a;
        if (!bh.c.c() || (gVarN = vVar.n()) == null) {
            return;
        }
        gVarN.finish();
        vVar.b0(new Intent(gVarN, (Class<?>) AccountActivity.class));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f2826a) {
            case 20:
                ((CountDownLatch) this.f2827b).countDown();
                return null;
            case 27:
                return (Task) ((je.k) this.f2827b).call();
            default:
                ((Runnable) this.f2827b).run();
                return Tasks.forResult(null);
        }
    }
}
