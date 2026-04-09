package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sg2 extends WebViewClient implements fd1, xp2 {
    public static final /* synthetic */ int M = 0;
    public q82 A;
    public su1 B;
    public o82 C;
    public sb2 D;
    public mv2 E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public final HashSet J;
    public final pz2 K;
    public mw L;
    public final jg2 f;
    public final cx1 g;
    public final HashMap h;
    public final Object i;
    public fd1 j;
    public ye4 k;
    public ug2 l;
    public vg2 m;
    public l32 n;
    public m32 o;
    public xp2 p;
    public boolean q;
    public boolean r;
    public int s;
    public String t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public kf1 z;

    public sg2(jg2 jg2Var, cx1 cx1Var, boolean z, pz2 pz2Var) {
        q82 q82Var = new q82(jg2Var, jg2Var.a0(), new sq0(jg2Var.getContext()));
        this.h = new HashMap();
        this.i = new Object();
        this.s = 0;
        this.t = "";
        this.u = "";
        this.g = cx1Var;
        this.f = jg2Var;
        this.v = z;
        this.A = q82Var;
        this.C = null;
        this.J = new HashSet(Arrays.asList(((String) tw1.e.c.a(mz1.d6)).split(",")));
        this.K = pz2Var;
    }

    public static final boolean J(jg2 jg2Var) {
        a83 a83Var = jg2Var.f.o;
        return a83Var != null && a83Var.b();
    }

    public static final boolean O(boolean z, jg2 jg2Var) {
        return (!z || jg2Var.f.x().b() || jg2Var.f.V().equals("interstitial_mb")) ? false : true;
    }

    public static WebResourceResponse w() {
        if (((Boolean) tw1.e.c.a(mz1.S0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        r11 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011c, code lost:
    
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
    
        if (r0.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
    
        if (r1 >= r0.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (r0[r1].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
    
        r2 = r0[r1].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014f, code lost:
    
        if (r2.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0158, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        r0 = r7.getHeaderFields();
        r15 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0174, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0180, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0192, code lost:
    
        if (r1.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
    
        r15.put(r1.getKey(), r1.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01aa, code lost:
    
        r0 = defpackage.hg4.C.f;
        r13 = r7.getResponseCode();
        r14 = r7.getResponseMessage();
        r16 = r7.getInputStream();
        r0.getClass();
        r10 = new android.webkit.WebResourceResponse(r11, r12, r13, r14, r15, r16);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse B(java.lang.String r18, java.util.Map r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg2.B(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // defpackage.fd1
    public final void C() {
        fd1 fd1Var = this.j;
        if (fd1Var != null) {
            fd1Var.C();
        }
    }

    public final void H(Map map, List list, String str) {
        if (gi2.R()) {
            gi2.G("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                gi2.G(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((y32) it.next()).c(this.f, map);
        }
    }

    public final void R(gj2 gj2Var, jz2 jz2Var, eb3 eb3Var) {
        c("/click");
        if (jz2Var != null && eb3Var != null) {
            b("/click", new cr2(this.p, gj2Var, eb3Var, jz2Var));
            return;
        }
        xp2 xp2Var = this.p;
        o32 o32Var = x32.a;
        b("/click", new v32(xp2Var, gj2Var, 0));
    }

    public final void S(gj2 gj2Var, jz2 jz2Var, mv2 mv2Var) {
        c("/open");
        b("/open", new i42(this.B, this.C, jz2Var, mv2Var, gj2Var, null));
    }

    public final boolean T() {
        boolean z;
        synchronized (this.i) {
            z = this.w;
        }
        return z;
    }

    public final void U() {
        sb2 sb2Var = this.D;
        if (sb2Var != null) {
            jg2 jg2Var = this.f;
            og2 og2Var = jg2Var.f;
            WeakHashMap weakHashMap = e61.a;
            if (og2Var.isAttachedToWindow()) {
                s(og2Var, sb2Var, 10);
                return;
            }
            mw mwVar = this.L;
            if (mwVar != null) {
                jg2Var.removeOnAttachStateChangeListener(mwVar);
            }
            mw mwVar2 = new mw(this, sb2Var, 1);
            this.L = mwVar2;
            jg2Var.addOnAttachStateChangeListener(mwVar2);
        }
    }

    @Override // defpackage.xp2
    public final void U0() {
        xp2 xp2Var = this.p;
        if (xp2Var != null) {
            xp2Var.U0();
        }
    }

    public final void Y() {
        og2 og2Var;
        vq2 vq2Var;
        ug2 ug2Var = this.l;
        jg2 jg2Var = this.f;
        if (ug2Var != null && ((this.F && this.H <= 0) || this.G || this.r)) {
            if (((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue() && (vq2Var = (og2Var = jg2Var.f).Q) != null) {
                pu1.t((tz1) vq2Var.h, og2Var.O, "awfllc");
            }
            ug2 ug2Var2 = this.l;
            boolean z = false;
            if (!this.G && !this.r) {
                z = true;
            }
            ug2Var2.v(this.t, this.s, this.u, z);
            this.l = null;
        }
        og2 og2Var2 = jg2Var.f;
        if (og2Var2.P == null) {
            vq2 vq2Var2 = og2Var2.Q;
            vq2Var2.getClass();
            rz1 rz1VarD = tz1.d();
            og2Var2.P = rz1VarD;
            ((HashMap) vq2Var2.g).put("native:view_load", rz1VarD);
        }
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        fc2 fc2Var;
        o82 o82Var = this.C;
        if (o82Var != null) {
            synchronized (o82Var.q) {
                z = o82Var.x != null;
            }
        }
        y24 y24Var = hg4.C.b;
        y24.b(this.f.getContext(), adOverlayInfoParcel, !z, this.E);
        sb2 sb2Var = this.D;
        if (sb2Var != null) {
            String str = adOverlayInfoParcel.q;
            if (str == null && (fc2Var = adOverlayInfoParcel.f) != null) {
                str = fc2Var.g;
            }
            ((qb2) sb2Var).a(str);
        }
    }

    public final void b(String str, y32 y32Var) {
        synchronized (this.i) {
            try {
                HashMap map = this.h;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(y32Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str) {
        synchronized (this.i) {
            try {
                List list = (List) this.h.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d0(fc2 fc2Var, boolean z, boolean z2, String str) {
        boolean z3;
        jg2 jg2Var = this.f;
        boolean zY0 = jg2Var.f.Y0();
        boolean z4 = false;
        boolean z5 = O(zY0, jg2Var) || z2;
        if (z5 || !z) {
            z3 = zY0;
            z4 = true;
        } else {
            z3 = zY0;
        }
        a(new AdOverlayInfoParcel(fc2Var, z5 ? null : this.j, z3 ? null : this.k, this.z, jg2Var.f.j, jg2Var, z4 ? null : this.p, str));
    }

    public final void e() {
        sb2 sb2Var = this.D;
        if (sb2Var != null) {
            qb2 qb2Var = (qb2) sb2Var;
            synchronized (qb2Var.h) {
                qb2Var.b.keySet();
                lq3 lq3VarR = pu1.r(Collections.EMPTY_MAP);
                u42 u42Var = new u42(1, qb2Var);
                ld2 ld2Var = md2.g;
                qp3 qp3VarO = pu1.O(lq3VarR, u42Var, ld2Var);
                n70 n70VarN = pu1.N(qp3VarO, 10L, TimeUnit.SECONDS, md2.d);
                qp3VarO.c(new jq3(qp3VarO, new z71(qb2Var, n70VarN), 0), ld2Var);
                qb2.l.add(n70VarN);
            }
            this.D = null;
        }
        mw mwVar = this.L;
        if (mwVar != null) {
            this.f.removeOnAttachStateChangeListener(mwVar);
        }
        synchronized (this.i) {
            try {
                this.h.clear();
                this.j = null;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.q = false;
                this.v = false;
                this.w = false;
                this.x = false;
                this.z = null;
                this.B = null;
                this.A = null;
                o82 o82Var = this.C;
                if (o82Var != null) {
                    o82Var.K(true);
                    this.C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02fd A[Catch: NoClassDefFoundError -> 0x0024, Exception -> 0x0027, TryCatch #17 {Exception -> 0x0027, NoClassDefFoundError -> 0x0024, blocks: (B:3:0x0014, B:5:0x0021, B:10:0x002a, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0083, B:22:0x009c, B:24:0x00a2, B:26:0x00a6, B:28:0x00b8, B:31:0x00c2, B:33:0x00d0, B:35:0x00e5, B:94:0x0232, B:83:0x0205, B:120:0x02fd, B:123:0x030f, B:125:0x0315, B:127:0x0323, B:95:0x026b, B:96:0x02a4, B:82:0x01cf, B:52:0x014a, B:34:0x00db, B:97:0x02a5, B:99:0x02af, B:101:0x02b5, B:103:0x02b8, B:104:0x02b9, B:105:0x02d6, B:107:0x02d9, B:108:0x02da, B:110:0x02e8, B:114:0x02f5, B:117:0x02f8, B:106:0x02d7, B:102:0x02b6), top: B:142:0x0014, inners: #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0315 A[Catch: NoClassDefFoundError -> 0x0024, Exception -> 0x0027, TryCatch #17 {Exception -> 0x0027, NoClassDefFoundError -> 0x0024, blocks: (B:3:0x0014, B:5:0x0021, B:10:0x002a, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0083, B:22:0x009c, B:24:0x00a2, B:26:0x00a6, B:28:0x00b8, B:31:0x00c2, B:33:0x00d0, B:35:0x00e5, B:94:0x0232, B:83:0x0205, B:120:0x02fd, B:123:0x030f, B:125:0x0315, B:127:0x0323, B:95:0x026b, B:96:0x02a4, B:82:0x01cf, B:52:0x014a, B:34:0x00db, B:97:0x02a5, B:99:0x02af, B:101:0x02b5, B:103:0x02b8, B:104:0x02b9, B:105:0x02d6, B:107:0x02d9, B:108:0x02da, B:110:0x02e8, B:114:0x02f5, B:117:0x02f8, B:106:0x02d7, B:102:0x02b6), top: B:142:0x0014, inners: #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0224 A[Catch: all -> 0x022d, TryCatch #8 {all -> 0x022d, blocks: (B:87:0x0212, B:89:0x0224, B:93:0x022f), top: B:136:0x0212 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse h(java.lang.String r24, java.util.Map r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg2.h(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void l(Uri uri) {
        gi2.G("Received GMSG: ".concat(String.valueOf(uri)));
        String path = uri.getPath();
        List list = (List) this.h.get(path);
        if (path == null || list == null) {
            gi2.G("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) tw1.e.c.a(mz1.c7)).booleanValue() || hg4.C.h.a() == null) {
                return;
            }
            md2.a.execute(new fu1(17, (path == null || path.length() < 2) ? "null" : path.substring(1)));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        iz1 iz1Var = mz1.c6;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && this.J.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) tw1Var.c.a(mz1.e6)).intValue()) {
                gi2.G("Parsing gmsg query params on BG thread: ".concat(path));
                lf4 lf4Var = hg4.C.c;
                lf4Var.getClass();
                ar3 ar3VarD = pu1.D(new w53(12, uri), lf4Var.k);
                ar3VarD.c(new jq3(ar3VarD, new mc2(this, list, path, uri, 12), 0), md2.f);
                return;
            }
        }
        lf4 lf4Var2 = hg4.C.c;
        H(lf4.o(uri), list, path);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        gi2.G("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            l(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.i) {
            try {
                jg2 jg2Var = this.f;
                if (jg2Var.f.o0()) {
                    gi2.G("Blank page loaded, 1...");
                    jg2Var.r();
                    return;
                }
                this.F = true;
                vg2 vg2Var = this.m;
                if (vg2Var != null) {
                    vg2Var.mo7a();
                    this.m = null;
                }
                Y();
                jg2 jg2Var2 = this.f;
                if (jg2Var2.f.z0() != null) {
                    if (!((Boolean) tw1.e.c.a(mz1.Ic)).booleanValue() || (toolbar = jg2Var2.f.z0().A) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.r = true;
        this.s = i;
        this.t = str;
        this.u = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        final boolean zDidCrash = renderProcessGoneDetail.didCrash();
        final int iRendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        jg2 jg2Var = this.f;
        if (jg2Var.h.compareAndSet(false, true)) {
            if (((Boolean) tw1.e.c.a(mz1.U0)).booleanValue()) {
                return false;
            }
            og2 og2Var = jg2Var.f;
            if (og2Var.getParent() instanceof ViewGroup) {
                ((ViewGroup) og2Var.getParent()).removeView(og2Var);
            }
            og2Var.destroy();
            bx1 bx1Var = new bx1() { // from class: lg2
                @Override // defpackage.bx1
                public final void e(yy1 yy1Var) {
                    int i = og2.h0;
                    ny1 ny1VarB = oy1.B();
                    boolean zA = ((oy1) ny1VarB.g).A();
                    boolean z = zDidCrash;
                    if (zA != z) {
                        ny1VarB.b();
                        ((oy1) ny1VarB.g).C(z);
                    }
                    ny1VarB.b();
                    ((oy1) ny1VarB.g).D(iRendererPriorityAtExit);
                    oy1 oy1Var = (oy1) ny1VarB.d();
                    yy1Var.b();
                    ((zy1) yy1Var.g).J(oy1Var);
                }
            };
            cx1 cx1Var = og2Var.f0;
            cx1Var.a(bx1Var);
            cx1Var.b(10003);
        }
        return true;
    }

    public final void p(fd1 fd1Var, l32 l32Var, ye4 ye4Var, m32 m32Var, kf1 kf1Var, boolean z, e42 e42Var, su1 su1Var, of3 of3Var, sb2 sb2Var, jz2 jz2Var, eb3 eb3Var, mv2 mv2Var, z32 z32Var, xp2 xp2Var, k32 k32Var, k32 k32Var2, z32 z32Var2, gj2 gj2Var, xv2 xv2Var, im2 im2Var) {
        a83 a83Var;
        jg2 jg2Var = this.f;
        su1 su1Var2 = su1Var == null ? new su1(jg2Var.getContext(), sb2Var) : su1Var;
        this.C = new o82(jg2Var, of3Var);
        this.D = sb2Var;
        iz1 iz1Var = mz1.b1;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            b("/adMetadata", new k32(0, l32Var));
        }
        if (m32Var != null) {
            b("/appEvent", new k32(1, m32Var));
        }
        b("/backButton", x32.e);
        b("/refresh", x32.f);
        b("/canOpenApp", o32.g);
        b("/canOpenURLs", o32.k);
        b("/canOpenIntents", o32.h);
        b("/close", x32.a);
        b("/customClose", x32.b);
        b("/instrument", x32.i);
        b("/delayPageLoaded", x32.k);
        b("/delayPageClosed", x32.l);
        b("/getLocationInfo", x32.m);
        b("/log", x32.c);
        b("/mraid", new f42(su1Var2, this.C, of3Var));
        q82 q82Var = this.A;
        if (q82Var != null) {
            b("/mraidLoaded", q82Var);
        }
        su1 su1Var3 = su1Var2;
        b("/open", new i42(su1Var3, this.C, jz2Var, mv2Var, gj2Var, im2Var));
        b("/precache", new o32(26));
        b("/touch", o32.j);
        b("/video", x32.g);
        b("/videoMeta", x32.h);
        if (jz2Var == null || eb3Var == null) {
            b("/click", new v32(xp2Var, gj2Var, 0));
            b("/httpTrack", o32.i);
        } else {
            b("/click", new cr2(xp2Var, gj2Var, eb3Var, jz2Var));
            b("/httpTrack", new v32(eb3Var, jz2Var, 6));
        }
        oc2 oc2Var = hg4.C.y;
        Context context = jg2Var.getContext();
        og2 og2Var = jg2Var.f;
        if (oc2Var.a(context)) {
            HashMap map = new HashMap();
            a83 a83Var2 = og2Var.o;
            if (a83Var2 != null) {
                map = a83Var2.w0;
            }
            b("/logScionEvent", new v32(jg2Var.getContext(), map, 1));
        }
        if (e42Var != null) {
            b("/setInterstitialProperties", new k32(2, e42Var));
        }
        if (z32Var != null && ((Boolean) kz1Var2.a(mz1.I9)).booleanValue()) {
            b("/inspectorNetworkExtras", z32Var);
        }
        if (((Boolean) kz1Var2.a(mz1.ba)).booleanValue() && k32Var != null) {
            b("/shareSheet", k32Var);
        }
        if (((Boolean) kz1Var2.a(mz1.l8)).booleanValue() && xv2Var != null) {
            b("/onDeviceStorageEvent", new k32(3, xv2Var));
        }
        if (((Boolean) kz1Var2.a(mz1.ga)).booleanValue() && k32Var2 != null) {
            b("/inspectorOutOfContextTest", k32Var2);
        }
        if (((Boolean) kz1Var2.a(mz1.la)).booleanValue() && z32Var2 != null) {
            b("/inspectorStorage", z32Var2);
        }
        if (((Boolean) kz1Var2.a(mz1.nc)).booleanValue()) {
            b("/bindPlayStoreOverlay", x32.p);
            b("/presentPlayStoreOverlay", x32.q);
            b("/expandPlayStoreOverlay", x32.r);
            b("/collapsePlayStoreOverlay", x32.s);
            b("/closePlayStoreOverlay", x32.t);
        }
        if (((Boolean) kz1Var2.a(mz1.E3)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", x32.v);
            b("/resetPAID", x32.u);
        }
        if (((Boolean) kz1Var2.a(mz1.Hc)).booleanValue() && (a83Var = og2Var.o) != null && a83Var.r0) {
            b("/writeToLocalStorage", x32.w);
            b("/clearLocalStorageKeys", x32.x);
        }
        this.j = fd1Var;
        this.k = ye4Var;
        this.n = l32Var;
        this.o = m32Var;
        this.z = kf1Var;
        this.B = su1Var3;
        this.p = xp2Var;
        this.E = mv2Var;
        this.q = z;
    }

    public final void r(int i, int i2) {
        q82 q82Var = this.A;
        if (q82Var != null) {
            q82Var.K(i, i2);
        }
        o82 o82Var = this.C;
        if (o82Var != null) {
            synchronized (o82Var.q) {
                o82Var.k = i;
                o82Var.l = i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(android.view.View r8, defpackage.sb2 r9, int r10) throws java.lang.IllegalStateException, org.json.JSONException {
        /*
            r7 = this;
            qb2 r9 = (defpackage.qb2) r9
            rb2 r0 = r9.g
            boolean r0 = r0.h
            if (r0 == 0) goto Lb5
            boolean r1 = r9.j
            if (r1 != 0) goto Lb5
            if (r10 <= 0) goto Lb5
            if (r0 != 0) goto L12
            goto L9f
        L12:
            if (r1 != 0) goto L9f
            hg4 r0 = defpackage.hg4.C
            lf4 r0 = r0.c
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L1d
            goto L78
        L1d:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2f
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2f
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2f
            if (r3 == 0) goto L31
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2f
            goto L32
        L2f:
            r2 = move-exception
            goto L38
        L31:
            r3 = r1
        L32:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L36
            goto L3e
        L36:
            r2 = move-exception
            goto L39
        L38:
            r3 = r1
        L39:
            java.lang.String r4 = "Fail to capture the web view"
            defpackage.gi2.c0(r4, r2)
        L3e:
            if (r3 != 0) goto L77
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            if (r2 == 0) goto L6b
            if (r3 != 0) goto L4d
            goto L6b
        L4d:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L69
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L69
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L69
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L69
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L69
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L69
            r1 = r4
            goto L78
        L69:
            r2 = move-exception
            goto L71
        L6b:
            java.lang.String r2 = "Width or height of view is zero"
            defpackage.gi2.i0(r2)     // Catch: java.lang.RuntimeException -> L69
            goto L78
        L71:
            java.lang.String r3 = "Fail to capture the webview"
            defpackage.gi2.c0(r3, r2)
            goto L78
        L77:
            r1 = r3
        L78:
            if (r1 != 0) goto L80
            java.lang.String r0 = "Failed to capture the webview bitmap."
            defpackage.wl2.F(r0)
            goto L9f
        L80:
            r9.j = r0
            n62 r0 = new n62
            r2 = 4
            r0.<init>(r9, r1, r2)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r1 == r2) goto L9a
            r0.run()
            goto L9f
        L9a:
            ld2 r1 = defpackage.md2.a
            r1.execute(r0)
        L9f:
            rb2 r0 = r9.g
            boolean r0 = r0.h
            if (r0 == 0) goto Lb5
            boolean r0 = r9.j
            if (r0 != 0) goto Lb5
            i63 r0 = defpackage.lf4.l
            df2 r1 = new df2
            r1.<init>(r7, r8, r9, r10)
            r8 = 100
            r0.postDelayed(r1, r8)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sg2.s(android.view.View, sb2, int):void");
    }

    @Override // defpackage.xp2
    public final void s0() {
        xp2 xp2Var = this.p;
        if (xp2Var != null) {
            xp2Var.s0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String string = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof ag2)) {
                gi2.i0("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            ag2 ag2Var = (ag2) webView;
            sb2 sb2Var = this.D;
            if (sb2Var != null) {
                ((qb2) sb2Var).b(string, requestHeaders, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return h(string, requestHeaders);
            }
            if (ag2Var.e0() != null) {
                sg2 sg2VarE0 = ag2Var.e0();
                synchronized (sg2VarE0.i) {
                    sg2VarE0.q = false;
                    sg2VarE0.v = true;
                    md2.f.execute(new fu1(16, sg2VarE0));
                }
            }
            if (ag2Var.x().b()) {
                str = (String) tw1.e.c.a(mz1.Z);
            } else if (ag2Var.Y0()) {
                str = (String) tw1.e.c.a(mz1.Y);
            } else {
                str = (String) tw1.e.c.a(mz1.X);
            }
            hg4 hg4Var = hg4.C;
            lf4 lf4Var = hg4Var.c;
            Context context = ag2Var.getContext();
            String str2 = ag2Var.u().f;
            try {
                HashMap map = new HashMap();
                map.put("User-Agent", hg4Var.c.D(context, str2));
                map.put("Cache-Control", "max-stale=3600");
                t12 t12VarA = new p32(context).a(0, str, map, null);
                String str3 = (String) t12VarA.f.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
                }
            } catch (IOException | InterruptedException | ExecutionException | TimeoutException unused) {
                gi2.q0(5);
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        gi2.G("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriB = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriB.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriB.getHost())) {
            l(uriB);
            return true;
        }
        boolean z = this.q;
        jg2 jg2Var = this.f;
        if (z && webView == jg2Var.f) {
            String scheme = uriB.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                fd1 fd1Var = this.j;
                if (fd1Var != null) {
                    fd1Var.C();
                    sb2 sb2Var = this.D;
                    if (sb2Var != null) {
                        ((qb2) sb2Var).a(str);
                    }
                    this.j = null;
                }
                xp2 xp2Var = this.p;
                if (xp2Var != null) {
                    xp2Var.s0();
                    this.p = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        og2 og2Var = jg2Var.f;
        og2 og2Var2 = jg2Var.f;
        if (og2Var.willNotDraw()) {
            gi2.i0("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            vs1 vs1Var = og2Var2.g;
            m83 m83Var = og2Var2.h;
            if (!((Boolean) tw1.e.c.a(mz1.Mc)).booleanValue() || m83Var == null) {
                if (vs1Var != null && vs1Var.a(uriB)) {
                    uriB = vs1Var.b(uriB, jg2Var.getContext(), jg2Var, jg2Var.g());
                }
            } else if (vs1Var != null && vs1Var.a(uriB)) {
                uriB = m83Var.a(uriB, jg2Var.getContext(), jg2Var, jg2Var.g());
            }
        } catch (ws1 unused) {
            gi2.i0("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        su1 su1Var = this.B;
        if (su1Var == null || su1Var.a()) {
            d0(new fc2("android.intent.action.VIEW", uriB.toString(), null, null, null, null, null, null), true, false, og2Var2.o());
        } else {
            su1Var.b(str);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return h(str, Collections.EMPTY_MAP);
    }
}
