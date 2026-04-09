package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Timer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q81 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15259a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15260b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15261c;

    public /* synthetic */ q81(int i4, Object obj, Object obj2) {
        this.f15259a = i4;
        this.f15260b = obj;
        this.f15261c = obj2;
    }

    private final void a() {
        hh hhVar = (hh) this.f15261c;
        View view = (View) this.f15260b;
        hhVar.getClass();
        try {
            ch chVar = new ch(hhVar.f11869f, hhVar.g, hhVar.f11870h, hhVar.f11871i, hhVar.j, hhVar.f11872k, hhVar.f11873l, hhVar.f11876o);
            Application applicationK = ua.j.C.g.k();
            if (applicationK != null) {
                String str = hhVar.f11874m;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(applicationK.getResources().getIdentifier((String) va.s.f36163e.f36166c.a(sk.f16377w0), FacebookMediationAdapter.KEY_ID, applicationK.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            androidx.recyclerview.widget.z0 z0VarB = hhVar.b(view, chVar);
            chVar.d();
            if (z0VarB.f1563a == 0 && z0VarB.f1564b == 0) {
                return;
            }
            int i4 = z0VarB.f1564b;
            if (i4 != 0) {
                if (i4 == 0) {
                }
                hhVar.f11867d.t(chVar);
            } else if (chVar.f10126k == 0) {
                return;
            }
            oa oaVar = hhVar.f11867d;
            synchronized (oaVar.f14618c) {
                try {
                    if (((LinkedList) oaVar.f14619d).contains(chVar)) {
                        return;
                    }
                    hhVar.f11867d.t(chVar);
                } finally {
                }
            }
        } catch (Exception e2) {
            za.i.f("Exception in fetchContentOnUIThread", e2);
            ua.j.C.f35265h.f("ContentFetchTask.fetchContent", e2);
        }
    }

    private final void b() {
        sv svVar = (sv) this.f15260b;
        Bitmap bitmap = (Bitmap) this.f15261c;
        svVar.getClass();
        zm1 zm1Var = bn1.f9729b;
        an1 an1Var = new an1();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, an1Var);
        synchronized (svVar.f16558h) {
            yp1 yp1Var = svVar.f16552a;
            tq1 tq1VarA = uq1.A();
            bn1 bn1VarC = an1Var.c();
            tq1VarA.b();
            ((uq1) tq1VarA.f14755b).C(bn1VarC);
            tq1VarA.b();
            ((uq1) tq1VarA.f14755b).B("image/png");
            tq1VarA.b();
            ((uq1) tq1VarA.f14755b).D(2);
            uq1 uq1Var = (uq1) tq1VarA.e();
            yp1Var.b();
            ((dr1) yp1Var.f14755b).K(uq1Var);
        }
    }

    private final void c() {
        qz qzVar;
        ix0 ix0Var = new ix0(14, (b00) this.f15260b);
        wh0 wh0Var = (wh0) this.f15261c;
        synchronized (wh0Var) {
            zt0 zt0Var = wh0Var.f18027f;
            if (zt0Var == null || (qzVar = wh0Var.f18025d) == null) {
                return;
            }
            ua.j.C.f35280x.getClass();
            h80.s(new q81(29, zt0Var, ix0Var));
            wh0Var.f18027f = null;
            qzVar.x0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0284  */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q81.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q81.e():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, JSONException, InterruptedException, za.j {
        Throwable thB;
        MediaPlayer.TrackInfo[] trackInfoArr;
        String str;
        MediaFormat format;
        String strB;
        int i4 = 21;
        Object rgVar = null;
        int i10 = 0;
        int i11 = 1;
        switch (this.f15259a) {
            case 0:
                p81 p81Var = (p81) this.f15261c;
                Future future = (Future) this.f15260b;
                if ((future instanceof i91) && (thB = ((i91) future).b()) != null) {
                    p81Var.n(thB);
                    return;
                }
                try {
                    p81Var.mo163h(yo0.H(future));
                    return;
                } catch (ExecutionException e2) {
                    p81Var.n(e2.getCause());
                    return;
                } catch (Throwable th2) {
                    p81Var.n(th2);
                    return;
                }
            case 1:
                g1 g1Var = (g1) this.f15260b;
                vr vrVar = (vr) this.f15261c;
                String str2 = bq0.f9768a;
                bt1 bt1Var = g1Var.f11342b;
                bt1Var.getClass();
                at1 at1Var = new at1(vrVar);
                yf0 yf0Var = bt1Var.f9804a.f12460n;
                yf0Var.c(25, at1Var);
                yf0Var.d();
                return;
            case 2:
                g1 g1Var2 = (g1) this.f15260b;
                os1 os1Var = (os1) this.f15261c;
                synchronized (os1Var) {
                }
                String str3 = bq0.f9768a;
                wu1 wu1Var = g1Var2.f11342b.f9804a.f12465s;
                qu1 qu1VarO = wu1Var.o((jy1) wu1Var.f18200d.f9334e);
                wu1Var.l(qu1VarO, 1020, new kh0(i4, qu1VarO, os1Var));
                return;
            case 3:
                try {
                    ((y9) this.f15261c).f18678b.put((ha) this.f15260b);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 4:
                a();
                return;
            case 5:
                if (((gi) this.f15261c).isCancelled()) {
                    ((Future) this.f15260b).cancel(true);
                    return;
                }
                return;
            case 6:
                boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.U5)).booleanValue();
                Context context = (Context) this.f15261c;
                m8.s sVar = (m8.s) this.f15260b;
                if (zBooleanValue) {
                    try {
                        try {
                            IBinder iBinderB = za.i.b(context).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                            int i12 = sg.f16011a;
                            if (iBinderB != null) {
                                IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                rgVar = iInterfaceQueryLocalInterface instanceof ug ? (ug) iInterfaceQueryLocalInterface : new rg(iBinderB, "com.google.android.gms.ads.clearcut.IClearcut", 1);
                            }
                            sVar.f28983b = rgVar;
                            ((rg) ((ug) sVar.f28983b)).k2(new vb.b(context));
                            sVar.f28982a = true;
                            return;
                        } catch (Exception e10) {
                            throw new za.j(e10);
                        }
                    } catch (RemoteException | NullPointerException | za.j unused2) {
                        za.i.c("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 7:
                iq iqVar = (iq) this.f15261c;
                y50 y50Var = (y50) this.f15260b;
                ua.j.C.f35267k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    ya.a0.m("loadJavascriptEngine > Before createJavascriptEngine");
                    Context context2 = y50Var.f18642a;
                    za.a aVar = (za.a) y50Var.f18645d;
                    zp zpVar = new zp();
                    qz qzVarF = hl.f(context2, new h0(0, 0, 0), "", false, false, null, null, aVar, null, null, new li(), null, null, null, null, null);
                    zpVar.f19142a = qzVarF;
                    qzVarF.N().setWillNotDraw(true);
                    ya.a0.m("loadJavascriptEngine > After createJavascriptEngine");
                    ya.a0.m("loadJavascriptEngine > Before setting new engine loaded listener");
                    b8.d dVar = new b8.d();
                    dVar.f2074b = y50Var;
                    dVar.f2075c = arrayList;
                    dVar.f2073a = jCurrentTimeMillis;
                    dVar.f2076d = iqVar;
                    dVar.f2077e = zpVar;
                    qz qzVar = zpVar.f19142a;
                    if (qzVar != null) {
                        qzVar.X().f12087h = new fk0(12, dVar);
                    }
                    ya.a0.m("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    zpVar.e("/jsLoaded", new bq(y50Var, jCurrentTimeMillis, iqVar, zpVar));
                    nm.d0 d0Var = new nm.d0(i4);
                    cq cqVar = new cq(y50Var, zpVar, d0Var);
                    d0Var.f30011b = cqVar;
                    ya.a0.m("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) ul.f17244d.u()).booleanValue() || TextUtils.equals(y50Var.f18642a.getPackageName(), "com.google.android.gms")) {
                        zpVar.e("/requestReload", cqVar);
                    }
                    String str4 = (String) y50Var.f18644c;
                    ya.a0.m("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str4)));
                    if (str4.endsWith(".js")) {
                        ya.a0.m("loadJavascriptEngine > Before newEngine.loadJavascript");
                        ya.a0.m("loadJavascript on adWebView from path: ".concat(str4));
                        zp.d(new yp(zpVar, "<!DOCTYPE html><html><head><script src=\"" + str4 + "\"></script></head><body></body></html>", i10));
                        ya.a0.m("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str4.startsWith("<html>")) {
                        ya.a0.m("loadJavascriptEngine > Before newEngine.loadHtml");
                        ya.a0.m("loadHtml on adWebView from html");
                        zp.d(new yp(zpVar, str4, 1));
                        ya.a0.m("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        ya.a0.m("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        ya.a0.m("loadHtmlWrapper on adWebView from path: ".concat(str4));
                        zp.d(new yp(zpVar, str4, 2));
                        ya.a0.m("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    ya.a0.m("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    ya.f0.f37440l.postDelayed(new eq(y50Var, iqVar, zpVar, arrayList, jCurrentTimeMillis, 0), ((Integer) va.s.f36163e.f36166c.a(sk.f16099e)).intValue());
                    return;
                } catch (Throwable th3) {
                    za.i.f("Error creating webview.", th3);
                    pk pkVar = sk.B8;
                    va.s sVar2 = va.s.f36163e;
                    if (((Boolean) sVar2.f36166c.a(pkVar)).booleanValue()) {
                        iqVar.x("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th3);
                        return;
                    } else if (((Boolean) sVar2.f36166c.a(sk.D8)).booleanValue()) {
                        ua.j.C.f35265h.g("SdkJavascriptFactory.loadJavascriptEngine", th3);
                        iqVar.w();
                        return;
                    } else {
                        ua.j.C.f35265h.f("SdkJavascriptFactory.loadJavascriptEngine", th3);
                        iqVar.w();
                        return;
                    }
                }
            case 8:
                ja.c cVar = ua.j.C.f35260b;
                ja.c.E(((zzbwl) this.f15261c).f19248a, (AdOverlayInfoParcel) this.f15260b, true, null);
                return;
            case 9:
                ((za.l) this.f15260b).a(null, (String) this.f15261c);
                return;
            case 10:
                b();
                return;
            case 11:
                nx nxVar = (nx) this.f15261c;
                MediaPlayer mediaPlayer = (MediaPlayer) this.f15260b;
                String str5 = "height";
                qz qzVar2 = nxVar.f14461c;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue() && qzVar2 != null && mediaPlayer != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap map = new HashMap();
                            while (i10 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i10];
                                if (trackInfo2 == null) {
                                    trackInfoArr = trackInfo;
                                } else {
                                    int trackType = trackInfo2.getTrackType();
                                    trackInfoArr = trackInfo;
                                    if (trackType == i11) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused3) {
                                                    map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                nxVar.f14475s = numValueOf;
                                                map.put("bitRate", String.valueOf(numValueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey(str5)) {
                                                int integer = format2.getInteger("width");
                                                int integer2 = format2.getInteger(str5);
                                                str = str5;
                                                StringBuilder sb2 = new StringBuilder(r5.c.e(integer, 1) + String.valueOf(integer2).length());
                                                sb2.append(integer);
                                                sb2.append("x");
                                                sb2.append(integer2);
                                                map.put("resolution", sb2.toString());
                                            } else {
                                                str = str5;
                                            }
                                            if (format2.containsKey("mime")) {
                                                map.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                map.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                        }
                                        i10++;
                                        trackInfo = trackInfoArr;
                                        str5 = str;
                                        i11 = 1;
                                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            map.put("audioMime", format.getString("mime"));
                                        }
                                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                            map.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                }
                                str = str5;
                                i10++;
                                trackInfo = trackInfoArr;
                                str5 = str;
                                i11 = 1;
                            }
                            if (!map.isEmpty()) {
                                qzVar2.a("onMetadataEvent", map);
                            }
                        }
                    } catch (RuntimeException e11) {
                        ua.j.C.f35265h.f("AdMediaPlayerView.reportMetadata", e11);
                    }
                }
                sx sxVar = nxVar.f14473q;
                if (sxVar != null) {
                    sxVar.e();
                    return;
                }
                return;
            case 12:
                Context context3 = (Context) this.f15260b;
                za0 za0Var = (za0) this.f15261c;
                jz.f12880a = (AudioManager) context3.getSystemService("audio");
                za0Var.a();
                return;
            case 13:
                AtomicInteger atomicInteger = fz.f11292u;
                ((qz) this.f15260b).a("onGcacheInfoEvent", (HashMap) this.f15261c);
                return;
            case 14:
                c();
                return;
            case 15:
                ((e00) this.f15260b).u((String) this.f15261c);
                return;
            case 16:
                ((g00) this.f15260b).f11329a.a("pubVideoCmd", (HashMap) this.f15261c);
                return;
            case 17:
                h00 h00Var = (h00) this.f15260b;
                String str6 = (String) this.f15261c;
                mx0 mx0Var = h00Var.f11674a;
                Uri uri = Uri.parse(str6);
                i00 i00Var = ((e00) mx0Var.f14041b).f10645n;
                if (i00Var == null) {
                    za.i.e("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                } else {
                    i00Var.f(uri);
                    return;
                }
            case 18:
                m30 m30Var = (m30) this.f15260b;
                JSONObject jSONObject = (JSONObject) this.f15261c;
                String string = jSONObject.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 31);
                sb3.append("Calling AFMA_updateActiveView(");
                sb3.append(string);
                sb3.append(")");
                za.i.c(sb3.toString());
                m30Var.f13741a.c("AFMA_updateActiveView", jSONObject);
                return;
            case 19:
                try {
                    ((c80) this.f15260b).mo162c(this.f15261c);
                    return;
                } catch (Throwable th4) {
                    ua.j.C.f35265h.g("EventEmitter.notify", th4);
                    ya.a0.n("Event emitter exception.", th4);
                    return;
                }
            case 20:
                be1 be1Var = (be1) this.f15260b;
                Integer num = (Integer) this.f15261c;
                if (be1Var.f9657a == 0) {
                    be1Var.M(num);
                    return;
                }
                return;
            case 21:
                be1 be1Var2 = (be1) this.f15260b;
                Object obj = this.f15261c;
                int i13 = be1Var2.f9657a - 1;
                be1Var2.f9657a = i13;
                if (i13 == 0) {
                    be1Var2.M(obj);
                    return;
                }
                return;
            case 22:
                be1 be1Var3 = (be1) this.f15260b;
                Object objApply = ((zs1) this.f15261c).apply(be1Var3.f9662f);
                be1Var3.f9662f = objApply;
                q81 q81Var = new q81(i4, be1Var3, objApply);
                no0 no0Var = (no0) be1Var3.f9659c;
                if (no0Var.f14385a.getLooper().getThread().isAlive()) {
                    no0Var.e(q81Var);
                    return;
                }
                return;
            case 23:
                pa0 pa0Var = (pa0) this.f15260b;
                ViewGroup viewGroup = (ViewGroup) this.f15261c;
                hq0 hq0Var = pa0Var.f14944b;
                ya.c0 c0Var = pa0Var.f14943a;
                ga0 ga0Var = pa0Var.f14946d;
                if (ga0Var.j() != null) {
                    boolean z3 = viewGroup != null;
                    if (ga0Var.W() == 2 || ga0Var.W() == 1) {
                        c0Var.y(hq0Var.g, String.valueOf(ga0Var.W()), z3);
                        return;
                    } else {
                        if (ga0Var.W() == 6) {
                            String str7 = hq0Var.g;
                            c0Var.y(str7, "2", z3);
                            c0Var.y(str7, "1", z3);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 24:
                d();
                return;
            case 25:
                e();
                return;
            case 26:
                ((re0) this.f15260b).f15624i.execute(new s30(9, (gx) this.f15261c));
                return;
            case 27:
                try {
                    ((mp) this.f15261c).p3(((re0) this.f15260b).b());
                    return;
                } catch (RemoteException e12) {
                    za.i.f("", e12);
                    return;
                }
            case 28:
                vf0 vf0Var = (vf0) this.f15260b;
                Context context4 = (Context) this.f15261c;
                qd0 qd0Var = vf0Var.f17613b;
                zk zkVar = ua.j.C.f35270n;
                if (zkVar.f19095b.getAndSet(true)) {
                    return;
                }
                zkVar.f19096c = context4;
                zkVar.f19097d = qd0Var;
                if (zkVar.f19099f != null || (strB = u.h.b(context4, null, false)) == null || strB.equals(context4.getPackageName())) {
                    return;
                }
                u.h.a(context4, strB, zkVar);
                return;
            default:
                zt0 zt0Var = (zt0) this.f15260b;
                ix0 ix0Var = (ix0) this.f15261c;
                Iterator it = zt0Var.f19178d.values().iterator();
                while (it.hasNext()) {
                    ((vt0) it.next()).c();
                }
                Timer timer = new Timer();
                timer.schedule(new mh0(zt0Var, ix0Var, timer), 1000L);
                return;
        }
    }

    public String toString() {
        switch (this.f15259a) {
            case 0:
                av0 av0Var = new av0(q81.class.getSimpleName());
                p81 p81Var = (p81) this.f15261c;
                l90 l90Var = new l90(21);
                ((l90) av0Var.f9424d).f13427c = l90Var;
                av0Var.f9424d = l90Var;
                l90Var.f13426b = p81Var;
                return av0Var.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q81(pa0 pa0Var, bb0 bb0Var) {
        this.f15259a = 24;
        this.f15260b = pa0Var;
        this.f15261c = (mg) bb0Var;
    }

    public /* synthetic */ q81(Object obj, boolean z3, Object obj2, int i4) {
        this.f15259a = i4;
        this.f15260b = obj2;
        this.f15261c = obj;
    }
}
