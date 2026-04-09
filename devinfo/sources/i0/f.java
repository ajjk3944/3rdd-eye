package i0;

import a0.x0;
import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.f1;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.up;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.provider.ContentFileProvider;
import com.liuzh.deviceinfo.view.SettingsItemView;
import g2.f0;
import i2.e0;
import i2.m1;
import i2.v1;
import i2.w1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.zip.Adler32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import nk.x;
import nm.d0;
import p.o0;
import pf.g1;
import pf.k0;
import u0.n1;
import va.l0;
import x.a0;
import xk.g0;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements u0.c, ga.b, ej.a, l8.a, qd.c, rf.b, d4.c, hm.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25415a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25416b;

    /* renamed from: c, reason: collision with root package name */
    public Object f25417c;

    /* renamed from: d, reason: collision with root package name */
    public Object f25418d;

    public /* synthetic */ f(int i4, boolean z3) {
        this.f25415a = i4;
    }

    public static String D(String str, String[] strArr, long j) {
        StringBuilder sb2 = new StringBuilder("apk_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(j);
        sb2.append((strArr == null || strArr.length == 0) ? ".apk" : ".apks");
        return sb2.toString();
    }

    public static f G(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_input_with_tips, (ViewGroup) null, false);
        int i4 = R.id.input;
        AppCompatEditText appCompatEditText = (AppCompatEditText) wb.e.s(R.id.input, viewInflate);
        if (appCompatEditText != null) {
            i4 = R.id.tv_tips;
            TextView textView = (TextView) wb.e.s(R.id.tv_tips, viewInflate);
            if (textView != null) {
                return new f((LinearLayout) viewInflate, appCompatEditText, textView, 17);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    public static f J(Context context, AttributeSet attributeSet, int[] iArr, int i4) {
        return new f(context, context.obtainStyledAttributes(attributeSet, iArr, i4, 0));
    }

    public static void S(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        a.a.f3c.getClass();
        intent.putExtra("android.intent.extra.STREAM", ContentFileProvider.e(new File(str)));
        intent.setType("application/vnd.android.package-archive");
        try {
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.appi_share_apk_using)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.appi_failed, 0).show();
        }
    }

    public static void o(File file, ZipOutputStream zipOutputStream, long j, long j8, byte[] bArr, d2.b bVar) throws IOException {
        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
        FileInputStream fileInputStream = new FileInputStream(file);
        long j9 = 0;
        while (true) {
            try {
                int i4 = fileInputStream.read(bArr);
                if (-1 == i4) {
                    fileInputStream.close();
                    zipOutputStream.closeEntry();
                    return;
                } else {
                    zipOutputStream.write(bArr, 0, i4);
                    j9 += i4;
                    bVar.a(j8 + j9, j);
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static String t(HashMap map, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return d.h.E(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return d.h.s(str, string);
    }

    public Drawable A(int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f25417c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) ? typedArray.getDrawable(i4) : jm.a.l(resourceId, (Context) this.f25416b);
    }

    public Drawable B(int i4) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f25417c).hasValue(i4) || (resourceId = ((TypedArray) this.f25417c).getResourceId(i4, 0)) == 0) {
            return null;
        }
        p.s sVarA = p.s.a();
        Context context = (Context) this.f25416b;
        synchronized (sVarA) {
            drawableG = sVarA.f30852a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface C(int i4, int i10, o0 o0Var) {
        int resourceId = ((TypedArray) this.f25417c).getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f25418d) == null) {
            this.f25418d = new TypedValue();
        }
        Context context = (Context) this.f25416b;
        TypedValue typedValue = (TypedValue) this.f25418d;
        ThreadLocal threadLocal = u3.k.f35091a;
        if (context.isRestricted()) {
            return null;
        }
        return u3.k.b(context, resourceId, typedValue, i10, o0Var, true, false);
    }

    public long E() {
        return ((r1.b) this.f25418d).f32717a.f32716d;
    }

    public void F(String str, String str2) {
        ((HashMap) this.f25418d).put(str, str2);
    }

    public boolean H() {
        return !(((v1) ((o7.c) this.f25416b).f30419b).isEmpty() && ((v1) ((o7.c) this.f25418d).f30419b).isEmpty() && ((v1) ((o7.c) this.f25417c).f30419b).isEmpty());
    }

    public boolean I(int i4, k3.d dVar, n3.e eVar) {
        l3.b bVar = (l3.b) this.f25417c;
        int[] iArr = dVar.f27868p0;
        int[] iArr2 = dVar.f27872t;
        bVar.f28547a = iArr[0];
        bVar.f28548b = iArr[1];
        bVar.f28549c = dVar.q();
        bVar.f28550d = dVar.k();
        bVar.f28554i = false;
        bVar.j = i4;
        boolean z3 = bVar.f28547a == 3;
        boolean z10 = bVar.f28548b == 3;
        boolean z11 = z3 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z11 && iArr2[0] == 4) {
            bVar.f28547a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar.f28548b = 1;
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.f28551e);
        dVar.L(bVar.f28552f);
        dVar.E = bVar.f28553h;
        dVar.I(bVar.g);
        bVar.j = 0;
        return bVar.f28554i;
    }

    public void L(f fVar, c1.o oVar) {
        Exception exc;
        x.t tVar = (x.t) this.f25416b;
        int i4 = tVar.f36945b;
        a0 a0Var = (a0) this.f25417c;
        a0 a0Var2 = new a0();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i4) {
            int i12 = i10 + 1;
            try {
                try {
                    switch (tVar.b(i10)) {
                        case 0:
                            fVar.j();
                            i10 = i12;
                        case 1:
                            int i13 = i11 + 1;
                            fVar.d(a0Var.f(i11));
                            i11 = i13;
                            i10 = i12;
                        case 2:
                            int i14 = i10 + 2;
                            i10 += 3;
                            fVar.h(tVar.b(i12), tVar.b(i14));
                        case 3:
                            int i15 = i10 + 2;
                            try {
                                int i16 = i10 + 3;
                                try {
                                    i10 += 4;
                                    fVar.g(tVar.b(i12), tVar.b(i15), tVar.b(i16));
                                } catch (Exception e2) {
                                    exc = e2;
                                    i10 = i16;
                                    throw new u0.j(a0Var, a0Var2, tVar, i10 - 1, exc);
                                }
                            } catch (Exception e10) {
                                exc = e10;
                                i10 = i15;
                            }
                        case 4:
                            fVar.q();
                            i10 = i12;
                        case 5:
                            i10 += 2;
                            int i17 = i11 + 1;
                            fVar.c(tVar.b(i12), a0Var.f(i11));
                            i11 = i17;
                        case 6:
                            i10 += 2;
                            try {
                                tVar.b(i12);
                                int i18 = i11 + 1;
                                i11 = i18;
                            } catch (Exception e11) {
                                exc = e11;
                                throw new u0.j(a0Var, a0Var2, tVar, i10 - 1, exc);
                            }
                        case 7:
                            int i19 = i11 + 1;
                            Object objF = a0Var.f(i11);
                            nk.k.c(objF, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            x.d(2, objF);
                            i11 += 2;
                            ((mk.e) objF).invoke(fVar.z(), a0Var.f(i19));
                            i10 = i12;
                        case 8:
                            Object obj = fVar.f25418d;
                            if (obj instanceof u0.h) {
                                u0.h hVar = (u0.h) obj;
                                if (((w0.e) oVar.f2574f).k(hVar)) {
                                    hVar.b();
                                }
                            }
                            a0Var2.a(obj);
                            fVar.f();
                            i10 = i12;
                        default:
                            i10 = i12;
                    }
                } catch (Throwable th2) {
                    fVar.n();
                    throw th2;
                }
            } catch (Exception e12) {
                exc = e12;
                i10 = i12;
            }
        }
        if (i11 != a0Var.f36847b) {
            u0.r.a("Applier operation size mismatch");
        }
        a0Var.d();
        tVar.f36945b = 0;
        fVar.n();
    }

    public void M() {
        ((TypedArray) this.f25417c).recycle();
    }

    public void N(ea.i iVar, int i4, boolean z3) {
        char c9;
        ka.a aVar = (ka.a) this.f25418d;
        Context context = (Context) this.f25416b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f22494a;
        String str2 = iVar.f22494a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ba.c cVar = iVar.f22496c;
        adler32.update(byteBufferAllocate.putInt(oa.a.a(cVar)).array());
        byte[] bArr = iVar.f22495b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i4) {
                        ii.a.j("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((la.h) ((la.d) this.f25417c)).c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(oa.a.a(cVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(cVar, jLongValue, i4));
            Set set = ((ka.b) aVar.f28110b.get(cVar)).f28113c;
            if (set.contains(ka.c.f28114a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(ka.c.f28116c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(ka.c.f28115b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i4);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", oa.a.a(cVar));
            if (bArr != null) {
                c9 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c9 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf2 = Long.valueOf(aVar.a(cVar, jLongValue, i4));
            Integer numValueOf2 = Integer.valueOf(i4);
            Object[] objArr = new Object[5];
            objArr[c9] = iVar;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf2;
            objArr[3] = lValueOf;
            objArr[4] = numValueOf2;
            String strR = ii.a.r("JobInfoScheduler");
            if (Log.isLoggable(strR, 3)) {
                Log.d(strR, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public void O(p1.q qVar) {
        ((r1.b) this.f25418d).f32717a.f32715c = qVar;
    }

    public void P(d3.c cVar) {
        ((r1.b) this.f25418d).f32717a.f32713a = cVar;
    }

    public void Q(d3.l lVar) {
        ((r1.b) this.f25418d).f32717a.f32714b = lVar;
    }

    public void R(long j) {
        ((r1.b) this.f25418d).f32717a.f32716d = j;
    }

    public void T(Activity activity, pi.i iVar) {
        nk.k.e(activity, "activity");
        ab.a aVar = (ab.a) this.f25416b;
        qi.f fVar = new qi.f(iVar, (pi.a) this.f25417c, (pi.g) this.f25418d);
        up upVar = (up) aVar;
        upVar.getClass();
        try {
            l0 l0Var = upVar.f17283c;
            if (l0Var != null) {
                l0Var.F0(new va.t(fVar));
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
        aVar.b(activity);
    }

    public void U(k3.e eVar, int i4, int i10, int i11) {
        eVar.getClass();
        int i12 = eVar.f27842b0;
        int i13 = eVar.f27844c0;
        eVar.f27842b0 = 0;
        eVar.f27844c0 = 0;
        eVar.O(i10);
        eVar.L(i11);
        if (i12 < 0) {
            eVar.f27842b0 = 0;
        } else {
            eVar.f27842b0 = i12;
        }
        if (i13 < 0) {
            eVar.f27844c0 = 0;
        } else {
            eVar.f27844c0 = i13;
        }
        k3.e eVar2 = (k3.e) this.f25418d;
        eVar2.f27882t0 = i4;
        eVar2.U();
    }

    public void V(k3.e eVar) {
        ArrayList arrayList = (ArrayList) this.f25416b;
        arrayList.clear();
        int size = eVar.f27879q0.size();
        for (int i4 = 0; i4 < size; i4++) {
            k3.d dVar = (k3.d) eVar.f27879q0.get(i4);
            int[] iArr = dVar.f27868p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f27881s0.f27615a = true;
    }

    @Override // u0.c
    public void a(Object obj, mk.e eVar) {
        switch (this.f25415a) {
            case 2:
                eVar.invoke(z(), obj);
                break;
            default:
                ((x.t) this.f25416b).a(7);
                a0 a0Var = (a0) this.f25417c;
                a0Var.a(eVar);
                a0Var.a(obj);
                break;
        }
    }

    @Override // qd.c
    public Object b() {
        Object objB = ((qd.c) this.f25416b).b();
        return new pd.f((pd.i) objB, ((d8.h) ((km.i) this.f25418d).f28426b).f22020b);
    }

    @Override // u0.c
    public void c(int i4, Object obj) {
        switch (this.f25415a) {
            case 2:
                ((e0) this.f25418d).B(i4, (e0) obj);
                break;
            default:
                x.t tVar = (x.t) this.f25416b;
                tVar.a(5);
                tVar.a(i4);
                ((a0) this.f25417c).a(obj);
                break;
        }
    }

    @Override // u0.c
    public void d(Object obj) {
        switch (this.f25415a) {
            case 2:
                ((ArrayList) this.f25417c).add(this.f25418d);
                this.f25418d = obj;
                break;
            default:
                ((x.t) this.f25416b).a(1);
                ((a0) this.f25417c).a(obj);
                break;
        }
    }

    @Override // hm.v
    public hm.w e() {
        return (hm.q) this.f25417c;
    }

    @Override // u0.c
    public void f() {
        q2.b rectManager;
        j1.c cVar;
        q2.b rectManager2;
        switch (this.f25415a) {
            case 2:
                e0 e0Var = (e0) this.f25418d;
                com.google.android.gms.internal.consent_sdk.a0 a0Var = e0Var.G;
                if (!e0Var.H()) {
                    f2.a.a("onReuse is only expected on attached node");
                }
                g3.x xVar = e0Var.f25640p;
                if (xVar != null) {
                    View view = xVar.f24479b;
                    if (view.getParent() != xVar) {
                        xVar.addView(view);
                    } else {
                        xVar.f24483f.invoke();
                    }
                }
                f0 f0Var = e0Var.I;
                if (f0Var != null) {
                    f0Var.i(false);
                }
                e0Var.f25645u = false;
                if (e0Var.R) {
                    e0Var.R = false;
                } else {
                    i1.m mVar = (w1) e0Var.G.f19259f;
                    for (i1.m mVar2 = mVar; mVar2 != null; mVar2 = mVar2.f25558e) {
                        if (mVar2.f25565n) {
                            mVar2.k0();
                        }
                    }
                    for (i1.m mVar3 = mVar; mVar3 != null; mVar3 = mVar3.f25558e) {
                        if (mVar3.f25565n) {
                            mVar3.m0();
                        }
                    }
                    while (mVar != null) {
                        if (mVar.f25565n) {
                            mVar.e0();
                        }
                        mVar = mVar.f25558e;
                    }
                }
                int i4 = e0Var.f25628b;
                m1 m1Var = e0Var.f25639o;
                if (m1Var != null && (rectManager2 = ((j2.r) m1Var).getRectManager()) != null) {
                    rectManager2.g(e0Var);
                }
                e0Var.f25628b = p2.n.f31099a.addAndGet(1);
                m1 m1Var2 = e0Var.f25639o;
                if (m1Var2 != null) {
                    j2.r rVar = (j2.r) m1Var2;
                    rVar.getLayoutNodes().g(i4);
                    rVar.getLayoutNodes().h(e0Var.f25628b, e0Var);
                }
                for (i1.m mVar4 = (i1.m) a0Var.g; mVar4 != null; mVar4 = mVar4.f25559f) {
                    mVar4.d0();
                }
                a0Var.g();
                if (a0Var.f(8)) {
                    e0Var.F();
                }
                e0.W(e0Var);
                m1 m1Var3 = e0Var.f25639o;
                if (m1Var3 != null) {
                    j2.r rVar2 = (j2.r) m1Var3;
                    if (j2.r.i() && (cVar = rVar2.L) != null) {
                        j2.r rVar3 = cVar.f27043c;
                        j1.q qVar = cVar.f27041a;
                        x.v vVar = cVar.g;
                        if (vVar.e(i4)) {
                            qVar.j(rVar3, i4, false);
                        }
                        p2.l lVarX = e0Var.x();
                        if (lVarX != null && lVarX.f31095a.b(p2.t.f31128q)) {
                            vVar.a(e0Var.f25628b);
                            qVar.j(rVar3, e0Var.f25628b, true);
                        }
                    }
                }
                m1 m1Var4 = e0Var.f25639o;
                if (m1Var4 != null && (rectManager = ((j2.r) m1Var4).getRectManager()) != null) {
                    rectManager.e(e0Var, true);
                    break;
                }
                break;
            default:
                ((x.t) this.f25416b).a(8);
                break;
        }
    }

    @Override // u0.c
    public void g(int i4, int i10, int i11) {
        switch (this.f25415a) {
            case 2:
                ((e0) this.f25418d).L(i4, i10, i11);
                break;
            default:
                x.t tVar = (x.t) this.f25416b;
                tVar.a(3);
                tVar.a(i4);
                tVar.a(i10);
                tVar.a(i11);
                break;
        }
    }

    @Override // xj.a
    public Object get() {
        switch (this.f25415a) {
            case 6:
                return new f((Context) ((xj.a) this.f25416b).get(), (la.d) ((xj.a) this.f25417c).get(), (ka.a) ((ja.c) this.f25418d).get(), 8);
            case 15:
                Context context = (Context) ((rf.c) this.f25416b).f32941a;
                ck.h hVar = (ck.h) ((xj.a) this.f25417c).get();
                k0 k0Var = (k0) ((rf.d) this.f25418d).get();
                nk.k.e(context, "appContext");
                nk.k.e(hVar, "blockingDispatcher");
                nk.k.e(k0Var, "sessionDataSerializer");
                return pf.q.a(k0Var, new m1.g(new b7.u(16, k0Var)), xk.x.b(hVar), new pf.p(context, 1));
            default:
                return new sf.n((ck.h) ((xj.a) this.f25416b).get(), (g1) ((xj.a) this.f25417c).get(), (p4.g) ((rf.d) this.f25418d).get());
        }
    }

    @Override // u0.c
    public void h(int i4, int i10) {
        switch (this.f25415a) {
            case 2:
                ((e0) this.f25418d).Q(i4, i10);
                break;
            default:
                x.t tVar = (x.t) this.f25416b;
                tVar.a(2);
                tVar.a(i4);
                tVar.a(i10);
                break;
        }
    }

    @Override // d4.c
    public boolean i(Object obj) {
        if (obj instanceof u8.b) {
            ((u8.b) obj).d().f35199a = true;
        }
        ((u8.c) this.f25417c).k(obj);
        return ((d4.e) this.f25418d).i(obj);
    }

    @Override // u0.c
    public void j() {
        switch (this.f25415a) {
            case 2:
                this.f25418d = ((ArrayList) this.f25417c).remove(r0.size() - 1);
                break;
            default:
                ((x.t) this.f25416b).a(0);
                break;
        }
    }

    @Override // d4.c
    public Object k() {
        Object objK = ((d4.e) this.f25418d).k();
        if (objK == null) {
            objK = ((u8.a) this.f25416b).h();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objK.getClass());
            }
        }
        if (objK instanceof u8.b) {
            ((u8.b) objK).d().f35199a = false;
        }
        return objK;
    }

    @Override // u0.c
    public void l(int i4, Object obj) {
        switch (this.f25415a) {
            case 2:
                break;
            default:
                x.t tVar = (x.t) this.f25416b;
                tVar.a(6);
                tVar.a(i4);
                ((a0) this.f25417c).a(obj);
                break;
        }
    }

    @Override // l8.a
    public y m(y yVar, x7.h hVar) {
        Drawable drawable = (Drawable) yVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((t7.m) this.f25417c).m(g8.c.c((a8.b) this.f25416b, ((BitmapDrawable) drawable).getBitmap()), hVar);
        }
        if (drawable instanceof k8.b) {
            return ((l8.d) this.f25418d).m(yVar, hVar);
        }
        return null;
    }

    @Override // u0.c
    public void n() {
        switch (this.f25415a) {
            case 2:
                m1 m1Var = ((e0) this.f25416b).f25639o;
                if (m1Var != null) {
                    ((j2.r) m1Var).A();
                    break;
                }
                break;
        }
    }

    public void p(e0 e0Var, i2.r rVar) {
        o7.c cVar = (o7.c) this.f25416b;
        o7.c cVar2 = (o7.c) this.f25417c;
        o7.c cVar3 = (o7.c) this.f25418d;
        int iOrdinal = rVar.ordinal();
        if (iOrdinal == 0) {
            cVar.p(e0Var);
            cVar3.p(e0Var);
            return;
        }
        if (iOrdinal == 1) {
            cVar2.p(e0Var);
            cVar3.p(e0Var);
            return;
        }
        if (iOrdinal == 2) {
            if (e0Var.f25634i != null) {
                cVar3.p(e0Var);
                return;
            } else {
                cVar.p(e0Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new ac.m();
        }
        if (e0Var.f25634i != null) {
            cVar3.p(e0Var);
        } else {
            cVar2.p(e0Var);
        }
    }

    public void q() {
        ((ArrayList) this.f25417c).clear();
        this.f25418d = this.f25416b;
        ((e0) this.f25416b).P();
    }

    public boolean r(e0 e0Var) {
        return !(e0Var.f25634i == null) && (((v1) ((o7.c) this.f25416b).f30419b).contains(e0Var) || ((v1) ((o7.c) this.f25417c).f30419b).contains(e0Var));
    }

    @Override // hm.v
    public hm.u s() {
        return (hm.p) this.f25418d;
    }

    public String toString() {
        switch (this.f25415a) {
            case 24:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f25416b);
                sb2.append('{');
                km.n nVar = (km.n) ((km.n) this.f25417c).f28443c;
                String str = "";
                while (nVar != null) {
                    Object obj = nVar.f28442b;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    nVar = (km.n) nVar.f28443c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // ej.a
    public void u() {
        ((jj.f) this.f25416b).g.h(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t7.m v() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            ke.c.b()
            r2 = 0
            java.lang.Object r3 = r8.f25416b     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r4 = r8.f25417c     // Catch: java.lang.Throwable -> Lbb
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = t(r4, r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb6
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb6
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L2e
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            goto Lb9
        L2e:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb6
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb6
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb6
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb6
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r8.f25418d     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L52:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6e
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6e
            goto L52
        L6e:
            r1 = move-exception
            goto Lbd
        L70:
            r0.connect()     // Catch: java.lang.Throwable -> L6e
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto La6
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La3
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La3
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La3
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r5.<init>()     // Catch: java.lang.Throwable -> La3
        L92:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La3
            r7 = -1
            if (r6 == r7) goto L9e
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La3
            goto L92
        L9e:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La3
            goto La6
        La3:
            r1 = move-exception
            r2 = r3
            goto Lbd
        La6:
            if (r3 == 0) goto Lab
            r3.close()
        Lab:
            r0.disconnect()
            t7.m r0 = new t7.m
            r3 = 17
            r0.<init>(r1, r2, r3)
            return r0
        Lb6:
            r1 = move-exception
        Lb7:
            r0 = r2
            goto Lbd
        Lb9:
            r1 = r0
            goto Lb7
        Lbb:
            r0 = move-exception
            goto Lb9
        Lbd:
            if (r2 == 0) goto Lc2
            r2.close()
        Lc2:
            if (r0 == 0) goto Lc7
            r0.disconnect()
        Lc7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.v():t7.m");
    }

    @Override // ej.a
    public void w() {
        jj.f fVar = (jj.f) this.f25416b;
        i5.a aVar = fVar.f27695e;
        el.e eVar = g0.f37189a;
        xk.x.v(aVar, cl.o.f2935a, null, new bh.t(fVar, (ArrayList) this.f25417c, (ArrayList) this.f25418d, null, 15), 2);
    }

    public p1.q x() {
        return ((r1.b) this.f25418d).f32717a.f32715c;
    }

    public ColorStateList y(int i4) {
        int resourceId;
        ColorStateList colorStateListR;
        TypedArray typedArray = (TypedArray) this.f25417c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (colorStateListR = wd.b.r(resourceId, (Context) this.f25416b)) == null) ? typedArray.getColorStateList(i4) : colorStateListR;
    }

    public Object z() {
        return this.f25418d;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i4) {
        this.f25415a = i4;
        this.f25416b = obj;
        this.f25417c = obj2;
        this.f25418d = obj3;
    }

    public f(List list) {
        this.f25415a = 4;
        this.f25418d = list;
        this.f25416b = new ArrayList(list.size());
        this.f25417c = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((ArrayList) this.f25416b).add(new i7.n((List) ((m7.f) list.get(i4)).f28903b.f218b));
            ((ArrayList) this.f25417c).add(((m7.f) list.get(i4)).f28904c.g());
        }
    }

    public f(n1 n1Var) {
        this.f25415a = 26;
        this.f25416b = new c1.a(0);
        this.f25417c = new f1(1);
        this.f25418d = new c0.p(9, this, n1Var);
    }

    public f(x0 x0Var) {
        this.f25415a = 29;
        this.f25416b = x0Var;
        this.f25417c = u6.t.d((im.d) x0Var.f146c);
        im.c cVar = (im.c) x0Var.f147d;
        nk.k.e(cVar, "<this>");
        this.f25418d = new hm.p(cVar);
    }

    private final /* synthetic */ void K() {
    }

    public f(FrameLayout frameLayout, SettingsItemView settingsItemView, SettingsItemView settingsItemView2, LinearLayout linearLayout, Toolbar toolbar) {
        this.f25415a = 16;
        this.f25416b = frameLayout;
        this.f25417c = linearLayout;
        this.f25418d = toolbar;
    }

    public f(HashMap map, String str) {
        this.f25415a = 11;
        this.f25416b = str;
        this.f25417c = map;
        this.f25418d = new HashMap();
    }

    public f(r1.b bVar) {
        this.f25415a = 19;
        this.f25418d = bVar;
        this.f25416b = new d0(7, this);
    }

    public f(Context context, TypedArray typedArray) {
        this.f25415a = 12;
        this.f25416b = context;
        this.f25417c = typedArray;
    }

    public f(Context context, f.c cVar) {
        this.f25415a = 25;
        this.f25416b = context;
        this.f25418d = cVar.h(new b5.o0(2), new lf.e(16, this));
    }

    public f(k3.e eVar) {
        this.f25415a = 9;
        this.f25416b = new ArrayList();
        this.f25417c = new l3.b();
        this.f25418d = eVar;
    }

    public f(t.q qVar) {
        this.f25415a = 22;
        this.f25418d = qVar;
    }

    public f(int i4) {
        this.f25415a = i4;
        switch (i4) {
            case 5:
                long[] jArr = x.l0.f36914a;
                this.f25416b = new x.e0();
                break;
            case 20:
                String string = UUID.randomUUID().toString();
                nk.k.d(string, "toString(...)");
                hm.h hVar = hm.h.f25175d;
                this.f25416b = ec.y.f(string);
                this.f25417c = rl.r.f33128f;
                this.f25418d = new ArrayList();
                break;
            case 23:
                List list = Collections.EMPTY_LIST;
                this.f25416b = list;
                this.f25417c = list;
                break;
            default:
                this.f25416b = new o7.c(26);
                this.f25417c = new o7.c(26);
                this.f25418d = new o7.c(26);
                break;
        }
    }

    public f(d4.e eVar, u8.a aVar, u8.c cVar) {
        this.f25415a = 28;
        this.f25418d = eVar;
        this.f25416b = aVar;
        this.f25417c = cVar;
    }

    public f(String str) {
        this.f25415a = 24;
        km.n nVar = new km.n((char) 0, 21);
        this.f25417c = nVar;
        this.f25418d = nVar;
        this.f25416b = str;
    }

    public f(e0 e0Var) {
        this.f25415a = 2;
        this.f25416b = e0Var;
        this.f25417c = new ArrayList();
        this.f25418d = e0Var;
    }

    public f(Object obj) {
        this.f25415a = 27;
        this.f25416b = new x.t();
        this.f25417c = new a0();
        this.f25418d = obj;
    }
}
