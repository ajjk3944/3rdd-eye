package cj;

import a5.d0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bc.f0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import com.squareup.picasso.a0;
import com.squareup.picasso.i0;
import com.squareup.picasso.n0;
import com.squareup.picasso.q0;
import com.squareup.picasso.s0;
import com.squareup.picasso.t0;
import com.survicate.surveys.infrastructure.network.URLRequest;
import ee.x;
import h2.j0;
import io.sentry.android.core.e0;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.h0;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jj.o0;
import mq.w;
import qb.v;
import tg.p0;

/* loaded from: classes.dex */
public final class a implements hk.d, h2.r, js.o, eb.e, o9.b, n6.b, vg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3973a;

    /* renamed from: d, reason: collision with root package name */
    public Object f3974d;

    /* renamed from: g, reason: collision with root package name */
    public Object f3975g;

    /* renamed from: r, reason: collision with root package name */
    public Object f3976r;

    /* renamed from: x, reason: collision with root package name */
    public Object f3977x;

    /* renamed from: y, reason: collision with root package name */
    public Object f3978y;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3973a = i10;
        this.f3974d = obj;
        this.f3975g = obj2;
        this.f3976r = obj3;
        this.f3977x = obj4;
        this.f3978y = obj5;
    }

    public static void E(Exception exc, String str) {
        br.l.e(str, "message");
        ch.n.b("InternalCrashReporterImpl", "report() called with: message = " + str + ", e = " + exc);
        h0 h0Var = new h0();
        h0Var.c(str, "Message");
        c4.a(exc, h0Var);
    }

    public static void F(String str) {
        ch.n.b("InternalCrashReporterImpl", c7.a.p("report() called with: message = ", str));
        if (str != null) {
            b1 b1VarC = c4.c();
            b1VarC.getClass();
            b1VarC.v(str, b5.INFO);
        }
    }

    public static void G(Throwable th2) {
        ch.n.b("InternalCrashReporterImpl", "report() called with: e = " + th2);
        b1 b1VarC = c4.c();
        b1VarC.getClass();
        b1VarC.u(th2, new h0());
    }

    public static a o(View view) {
        int i10 = qk.h.cardInfoLogo;
        ImageView imageView = (ImageView) b4.A(view, i10);
        if (imageView != null) {
            i10 = qk.h.cardInfoLogoContainer;
            RelativeLayout relativeLayout = (RelativeLayout) b4.A(view, i10);
            if (relativeLayout != null) {
                i10 = qk.h.cardInfoSubtitle;
                TextView textView = (TextView) b4.A(view, i10);
                if (textView != null) {
                    i10 = qk.h.cardInfoTitle;
                    TextView textView2 = (TextView) b4.A(view, i10);
                    if (textView2 != null) {
                        i10 = qk.h.closeButtonContainer;
                        RelativeLayout relativeLayout2 = (RelativeLayout) b4.A(view, i10);
                        if (relativeLayout2 != null) {
                            return new a(imageView, relativeLayout, textView, textView2, relativeLayout2, 3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        a aVar = new a(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) aVar.f3977x)) {
            try {
                ((ArrayDeque) aVar.f3977x).clear();
                String string = ((SharedPreferences) aVar.f3974d).getString((String) aVar.f3975g, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) aVar.f3976r)) {
                    String[] strArrSplit = string.split((String) aVar.f3976r, -1);
                    if (strArrSplit.length == 0) {
                        e0.d("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) aVar.f3977x).add(str);
                        }
                    }
                    return aVar;
                }
                return aVar;
            } finally {
            }
        }
    }

    public int A(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = ((Layout) this.f3974d).getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((br.l.g(cCharAt, 8192) < 0 || br.l.g(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i10;
            }
            i10--;
        }
        return i10;
    }

    public void B(String str, f0 f0Var) {
        br.l.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (f0Var == null) {
            if (str.equals(URLRequest.METHOD_POST) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(h0.b.o("method ", str, " must have a request body.").toString());
            }
        } else if (!i3.g.z(str)) {
            throw new IllegalArgumentException(h0.b.o("method ", str, " must not have a request body.").toString());
        }
        this.f3975g = str;
        this.f3977x = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C(wi.a aVar) {
        Context context = (Context) this.f3974d;
        br.l.e(aVar, "receiver");
        ch.n.b("ReceiverRegistry", "Register ".concat(aVar.getClass().getName()));
        wi.f fVar = (wi.f) aVar;
        if (((ch.f) this.f3975g).h()) {
            try {
                context.getApplicationContext().registerReceiver(aVar, fVar.getIntentFilter(), aVar.isExported() ? 2 : 4);
                return;
            } catch (IllegalArgumentException e4) {
                ch.n.g("ReceiverRegistry", "Error registering ".concat(aVar.getClass().getName()), e4.toString());
                return;
            }
        }
        try {
            context.getApplicationContext().registerReceiver(aVar, fVar.getIntentFilter());
        } catch (IllegalArgumentException e10) {
            ch.n.g("ReceiverRegistry", "Error registering ".concat(aVar.getClass().getName()), e10.toString());
        }
    }

    public void D(ik.a aVar) {
        wi.a aVarH;
        br.l.e(aVar, "trigger");
        synchronized (((oh.p) this.f3977x)) {
            try {
                o0 o0VarA = aVar.a();
                wi.h hVarC = ai.g.c(o0VarA);
                ch.n.b("ReceiverRegistry", "Try to register " + hVarC + " for trigger type " + o0VarA);
                if (hVarC != null) {
                    oh.p pVar = (oh.p) this.f3977x;
                    synchronized (((HashMap) pVar.f19481d)) {
                        aVarH = (wi.a) ((HashMap) pVar.f19481d).get(hVarC);
                    }
                    boolean z10 = aVarH != null;
                    if (aVarH == null) {
                        ((sm.f) this.f3976r).getClass();
                        aVarH = sm.f.H(hVarC);
                    }
                    if (z10) {
                        ch.n.b("ReceiverRegistry", "receiver - " + aVarH.getClass().getSimpleName() + " already registered");
                    } else {
                        ch.n.b("ReceiverRegistry", "Register receiver - ".concat(aVarH.getClass().getSimpleName()));
                        oh.p pVar2 = (oh.p) this.f3977x;
                        pVar2.getClass();
                        synchronized (((HashMap) pVar2.f19481d)) {
                            ((HashMap) pVar2.f19481d).put(hVarC, aVarH);
                        }
                        C(aVarH);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void H(j9.a aVar, j9.g gVar) {
        m9.o oVar = (m9.o) this.f3978y;
        m9.i iVar = (m9.i) this.f3974d;
        String str = (String) this.f3975g;
        j9.e eVar = (j9.e) this.f3977x;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        j9.c cVar = (j9.c) this.f3976r;
        r9.b bVar = oVar.f16373c;
        m9.i iVarB = iVar.b(aVar.f13426b);
        al.c cVar2 = new al.c(4);
        cVar2.f825g = new HashMap();
        cVar2.f823e = Long.valueOf(oVar.f16371a.e());
        cVar2.f824f = Long.valueOf(oVar.f16372b.e());
        cVar2.f820b = str;
        cVar2.f822d = new m9.k(cVar, (byte[]) eVar.apply(aVar.f13425a));
        cVar2.f821c = null;
        j9.b bVar2 = aVar.f13427c;
        if (bVar2 != null) {
            cVar2.f826h = bVar2.f13428a;
        }
        r9.a aVar2 = (r9.a) bVar;
        aVar2.f21427b.execute(new io.sentry.android.core.internal.util.h(aVar2, iVarB, gVar, cVar2.e(), 5));
    }

    public boolean I(List list) {
        br.l.e(list, "jobs");
        ch.n.b("InternalQosResultsRepository", "shouldSave() called with: jobs = " + list);
        ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((vj.b) it.next()).f());
        }
        return arrayList.containsAll((List) this.f3978y) || arrayList.containsAll((List) this.f3977x);
    }

    public void J(wi.a aVar) {
        br.l.e(aVar, "receiver");
        ch.n.b("ReceiverRegistry", "Unregister ".concat(aVar.getClass().getName()));
        try {
            ((Context) this.f3974d).getApplicationContext().unregisterReceiver(aVar);
            ch.n.b("ReceiverRegistry", "******** Unregister ".concat(aVar.getClass().getName()));
        } catch (IllegalArgumentException e4) {
            ch.n.g("ReceiverRegistry", "Error unregistering ".concat(aVar.getClass().getName()), e4.toString());
        }
    }

    @Override // js.o
    public js.o K(qs.b bVar, qs.g gVar) {
        return ((of.b) this.f3974d).K(bVar, gVar);
    }

    public void L(ik.a aVar) {
        wi.a aVar2;
        synchronized (((oh.p) this.f3977x)) {
            try {
                wi.h hVarC = ai.g.c(aVar.a());
                if (hVarC != null) {
                    oh.p pVar = (oh.p) this.f3977x;
                    synchronized (((HashMap) pVar.f19481d)) {
                        aVar2 = (wi.a) ((HashMap) pVar.f19481d).get(hVarC);
                    }
                    if (aVar2 != null) {
                        oh.p pVar2 = (oh.p) this.f3977x;
                        pVar2.getClass();
                        synchronized (((HashMap) pVar2.f19481d)) {
                        }
                        J(aVar2);
                    } else {
                        ch.n.g("ReceiverRegistry", "Receiver type for " + aVar.a() + " not registered");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // js.o
    public void M(qs.g gVar, vs.f fVar) {
        ((of.b) this.f3974d).M(gVar, fVar);
    }

    public void N(String str) {
        br.l.e(str, "url");
        if (tt.s.n0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            br.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(strSubstring);
        } else if (tt.s.n0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            br.l.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(strSubstring2);
        }
        br.l.e(str, "<this>");
        x xVar = new x(1);
        xVar.f(null, str);
        this.f3974d = xVar.b();
    }

    @Override // js.o
    public js.p P(qs.g gVar) {
        return ((of.b) this.f3974d).P(gVar);
    }

    @Override // eb.e, n6.b
    public int a(long j) {
        switch (this.f3973a) {
            case 22:
                long[] jArr = (long[]) this.f3975g;
                int iB = v.b(jArr, j, false);
                if (iB < jArr.length) {
                    return iB;
                }
                return -1;
            default:
                long[] jArr2 = (long[]) this.f3975g;
                int iB2 = d0.b(jArr2, j, false);
                if (iB2 < jArr2.length) {
                    return iB2;
                }
                return -1;
        }
    }

    @Override // js.o
    public void b() {
        ((of.b) this.f3975g).b();
        of.b bVar = (of.b) this.f3976r;
        ((HashMap) bVar.f19422d).put((qs.g) this.f3977x, new vs.a((sr.b) mq.o.I0((ArrayList) this.f3978y)));
    }

    @Override // hk.d
    public void c(hk.h hVar) {
        br.l.e(hVar, "task");
        ch.n.b("AlarmManagerExecutionPipeline", c7.a.o(hVar, new StringBuilder(), " stop alarm"));
        PendingIntent pendingIntentU = u(hVar, true);
        pendingIntentU.cancel();
        ((AlarmManager) this.f3976r).cancel(pendingIntentU);
    }

    @Override // h2.r
    public boolean d() {
        ArrayList arrayList = (ArrayList) this.f3978y;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((h2.q) arrayList.get(i10)).f9866a.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // eb.e, n6.b
    public long e(int i10) {
        switch (this.f3973a) {
        }
        return ((long[]) this.f3975g)[i10];
    }

    @Override // eb.e, n6.b
    public List f(long j) {
        switch (this.f3973a) {
            case 22:
                lb.e eVar = (lb.e) this.f3974d;
                Map map = (Map) this.f3976r;
                HashMap map2 = (HashMap) this.f3977x;
                HashMap map3 = (HashMap) this.f3978y;
                ArrayList arrayList = new ArrayList();
                eVar.g(j, eVar.f15102h, arrayList);
                TreeMap treeMap = new TreeMap();
                eVar.i(j, false, eVar.f15102h, treeMap);
                eVar.h(j, map, map2, eVar.f15102h, treeMap);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    String str = (String) map3.get(pair.second);
                    if (str != null) {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        lb.f fVar = (lb.f) map2.get(pair.first);
                        fVar.getClass();
                        arrayList2.add(new eb.b(null, null, null, bitmapDecodeByteArray, fVar.f15108c, 0, fVar.f15110e, fVar.f15107b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f15111f, fVar.f15112g, false, -16777216, fVar.j, 0.0f));
                    }
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    lb.f fVar2 = (lb.f) map2.get(entry.getKey());
                    fVar2.getClass();
                    eb.a aVar = (eb.a) entry.getValue();
                    CharSequence charSequence = aVar.f8040a;
                    charSequence.getClass();
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                    for (lb.a aVar2 : (lb.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), lb.a.class)) {
                        spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
                    }
                    for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                        if (spannableStringBuilder.charAt(i10) == ' ') {
                            int i11 = i10 + 1;
                            int i12 = i11;
                            while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                                i12++;
                            }
                            int i13 = i12 - i11;
                            if (i13 > 0) {
                                spannableStringBuilder.delete(i10, i13 + i10);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                        spannableStringBuilder.delete(0, 1);
                    }
                    for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                        if (spannableStringBuilder.charAt(i14) == '\n') {
                            int i15 = i14 + 1;
                            if (spannableStringBuilder.charAt(i15) == ' ') {
                                spannableStringBuilder.delete(i15, i14 + 2);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                    for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                        if (spannableStringBuilder.charAt(i16) == ' ') {
                            int i17 = i16 + 1;
                            if (spannableStringBuilder.charAt(i17) == '\n') {
                                spannableStringBuilder.delete(i16, i17);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                    float f10 = fVar2.f15108c;
                    int i18 = fVar2.f15109d;
                    aVar.f8044e = f10;
                    aVar.f8045f = i18;
                    aVar.f8046g = fVar2.f15110e;
                    aVar.f8047h = fVar2.f15107b;
                    aVar.f8049l = fVar2.f15111f;
                    float f11 = fVar2.f15114i;
                    int i19 = fVar2.f15113h;
                    aVar.k = f11;
                    aVar.j = i19;
                    aVar.f8053p = fVar2.j;
                    arrayList2.add(aVar.a());
                }
                return arrayList2;
            default:
                t6.d dVar = (t6.d) this.f3974d;
                Map map4 = (Map) this.f3976r;
                HashMap map5 = (HashMap) this.f3977x;
                HashMap map6 = (HashMap) this.f3978y;
                ArrayList arrayList3 = new ArrayList();
                dVar.g(j, dVar.f22423h, arrayList3);
                TreeMap treeMap2 = new TreeMap();
                dVar.i(j, false, dVar.f22423h, treeMap2);
                dVar.h(j, map4, map5, dVar.f22423h, treeMap2);
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    String str2 = (String) map6.get(pair2.second);
                    if (str2 != null) {
                        byte[] bArrDecode2 = Base64.decode(str2, 0);
                        Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length);
                        t6.e eVar2 = (t6.e) map5.get(pair2.first);
                        eVar2.getClass();
                        arrayList4.add(new z4.b(null, null, null, bitmapDecodeByteArray2, eVar2.f22429c, 0, eVar2.f22431e, eVar2.f22428b, 0, Integer.MIN_VALUE, -3.4028235E38f, eVar2.f22432f, eVar2.f22433g, false, -16777216, eVar2.j, 0.0f));
                    }
                }
                for (Map.Entry entry2 : treeMap2.entrySet()) {
                    t6.e eVar3 = (t6.e) map5.get(entry2.getKey());
                    eVar3.getClass();
                    z4.a aVar3 = (z4.a) entry2.getValue();
                    CharSequence charSequence2 = aVar3.f26625a;
                    charSequence2.getClass();
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequence2;
                    for (t6.a aVar4 : (t6.a[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), t6.a.class)) {
                        spannableStringBuilder2.replace(spannableStringBuilder2.getSpanStart(aVar4), spannableStringBuilder2.getSpanEnd(aVar4), (CharSequence) "");
                    }
                    for (int i20 = 0; i20 < spannableStringBuilder2.length(); i20++) {
                        if (spannableStringBuilder2.charAt(i20) == ' ') {
                            int i21 = i20 + 1;
                            int i22 = i21;
                            while (i22 < spannableStringBuilder2.length() && spannableStringBuilder2.charAt(i22) == ' ') {
                                i22++;
                            }
                            int i23 = i22 - i21;
                            if (i23 > 0) {
                                spannableStringBuilder2.delete(i20, i23 + i20);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(0) == ' ') {
                        spannableStringBuilder2.delete(0, 1);
                    }
                    for (int i24 = 0; i24 < spannableStringBuilder2.length() - 1; i24++) {
                        if (spannableStringBuilder2.charAt(i24) == '\n') {
                            int i25 = i24 + 1;
                            if (spannableStringBuilder2.charAt(i25) == ' ') {
                                spannableStringBuilder2.delete(i25, i24 + 2);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == ' ') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                    for (int i26 = 0; i26 < spannableStringBuilder2.length() - 1; i26++) {
                        if (spannableStringBuilder2.charAt(i26) == ' ') {
                            int i27 = i26 + 1;
                            if (spannableStringBuilder2.charAt(i27) == '\n') {
                                spannableStringBuilder2.delete(i26, i27);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == '\n') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                    float f12 = eVar3.f22429c;
                    int i28 = eVar3.f22430d;
                    aVar3.f26629e = f12;
                    aVar3.f26630f = i28;
                    aVar3.f26631g = eVar3.f22431e;
                    aVar3.f26632h = eVar3.f22428b;
                    aVar3.f26634l = eVar3.f22432f;
                    float f13 = eVar3.f22435i;
                    int i29 = eVar3.f22434h;
                    aVar3.k = f13;
                    aVar3.j = i29;
                    aVar3.f26638p = eVar3.j;
                    arrayList4.add(aVar3.a());
                }
                return arrayList4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // h2.r
    public float g() {
        return ((Number) this.f3977x.getValue()).floatValue();
    }

    @Override // kq.a
    public Object get() {
        switch (this.f3973a) {
            case 26:
                return new r9.a((Executor) ((kq.a) this.f3974d).get(), (n9.e) ((kq.a) this.f3975g).get(), (qm.c) ((qm.c) this.f3976r).get(), (t9.d) ((kq.a) this.f3977x).get(), (u9.c) ((kq.a) this.f3978y).get());
            default:
                return new p0((se.f) ((i5.c) this.f3974d).f11238a, (fg.e) ((kq.a) this.f3975g).get(), (wg.k) ((kq.a) this.f3976r).get(), (tg.l) ((vg.c) this.f3977x).get(), (pq.h) ((kq.a) this.f3978y).get());
        }
    }

    @Override // eb.e, n6.b
    public int h() {
        switch (this.f3973a) {
        }
        return ((long[]) this.f3975g).length;
    }

    @Override // hk.d
    public void i(hk.h hVar) {
        ch.n.b("AlarmManagerExecutionPipeline", c7.a.o(hVar, new StringBuilder(), " unschedule alarm"));
        PendingIntent pendingIntentU = u(hVar, true);
        pendingIntentU.cancel();
        ((AlarmManager) this.f3976r).cancel(pendingIntentU);
    }

    public void j(f8.f fVar, Class cls) {
        ((ArrayList) this.f3977x).add(new lq.l(fVar, cls));
    }

    public void k(i8.a aVar, Class cls) {
        ((ArrayList) this.f3975g).add(new lq.l(aVar, cls));
    }

    @Override // js.o
    public void l(qs.g gVar, Object obj) {
        ((of.b) this.f3974d).l(gVar, obj);
    }

    @Override // hk.d
    public void m(hk.h hVar, boolean z10) {
        AlarmManager alarmManager = (AlarmManager) this.f3976r;
        boolean zCanScheduleExactAlarms = false;
        PendingIntent pendingIntentU = u(hVar, false);
        long j = hVar.f10809f.f9622h;
        ch.n.b("AlarmManagerExecutionPipeline", hVar.c() + " Add to alarm manager for task " + hVar.f10805b + " @ " + j);
        if (!((ch.f) this.f3975g).g()) {
            try {
                alarmManager.setExact(1, j, pendingIntentU);
                return;
            } catch (Exception e4) {
                ch.n.e("AlarmManagerExecutionPipeline", e4);
                G(e4);
                return;
            }
        }
        try {
            zCanScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            ch.n.b("AlarmManagerExecutionPipeline", hVar.c() + " can use Exact Alarm " + zCanScheduleExactAlarms);
        } catch (Exception e10) {
            ch.n.e("AlarmManagerExecutionPipeline", e10);
            G(e10);
        }
        try {
            if (zCanScheduleExactAlarms) {
                alarmManager.setExact(1, j, pendingIntentU);
            } else {
                alarmManager.set(1, j, pendingIntentU);
            }
        } catch (Exception e11) {
            ch.n.e("AlarmManagerExecutionPipeline", e11);
            G(e11);
        }
    }

    public void n(ArrayList arrayList) {
        br.l.e(arrayList, "jobResults");
        ch.n.b("InternalQosResultsRepository", "addResults() called with: jobResults = " + arrayList);
        rj.d dVar = (rj.d) ((ee.f) this.f3975g).g(arrayList);
        qj.a aVar = (qj.a) this.f3974d;
        hi.a aVar2 = (hi.a) this.f3976r;
        aVar.k(aVar2, aVar2.k(dVar));
    }

    public com.squareup.picasso.f0 p() throws ClassNotFoundException {
        Object q0Var;
        Context context = (Context) this.f3974d;
        if (((com.squareup.picasso.q) this.f3975g) == null) {
            try {
                Class.forName("com.squareup.okhttp.OkHttpClient");
                File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                q0Var = new a0(file, t0.a(file));
            } catch (ClassNotFoundException unused) {
                q0Var = new q0(context);
            }
            this.f3975g = q0Var;
        }
        if (((com.squareup.picasso.s) this.f3977x) == null) {
            this.f3977x = new com.squareup.picasso.s(context, 0);
        }
        if (((i0) this.f3976r) == null) {
            this.f3976r = new i0(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new s0());
        }
        if (((com.squareup.picasso.e0) this.f3978y) == null) {
            this.f3978y = com.squareup.picasso.e0.f5881a;
        }
        n0 n0Var = new n0((com.squareup.picasso.s) this.f3977x);
        return new com.squareup.picasso.f0(context, new com.squareup.picasso.n(context, (i0) this.f3976r, com.squareup.picasso.f0.j, (com.squareup.picasso.q) this.f3975g, (com.squareup.picasso.s) this.f3977x, n0Var), (com.squareup.picasso.s) this.f3977x, (com.squareup.picasso.e0) this.f3978y, n0Var);
    }

    @Override // js.o
    public void q(qs.g gVar, qs.b bVar, qs.g gVar2) {
        ((of.b) this.f3974d).q(gVar, bVar, gVar2);
    }

    public ou.a0 r() {
        Map mapUnmodifiableMap;
        ou.t tVar = (ou.t) this.f3974d;
        if (tVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f3975g;
        ou.s sVarF = ((fh.f) this.f3976r).f();
        f0 f0Var = (f0) this.f3977x;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3978y;
        byte[] bArr = pu.b.f20645a;
        br.l.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = mq.x.f16946a;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            br.l.d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new ou.a0(tVar, str, sVarF, f0Var, mapUnmodifiableMap);
    }

    public void s(ou.h hVar) {
        br.l.e(hVar, "cacheControl");
        String string = hVar.toString();
        if (string.length() == 0) {
            ((fh.f) this.f3976r).j("Cache-Control");
        } else {
            y("Cache-Control", string);
        }
    }

    public PendingIntent u(hk.h hVar, boolean z10) {
        Context context = (Context) this.f3974d;
        br.l.e(hVar, "task");
        si.a aVar = new si.a(hVar);
        int i10 = (!z10 || ((ak.g) ((q3.a) this.f3978y).f20680g).f529f.f449a.f483n) ? 134217728 : 268435456;
        if (((ch.f) this.f3975g).a()) {
            i10 |= 67108864;
        }
        Intent intent = new Intent("com.opensignal.sdk.data.receiver.ALARM_PIPELINE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("com.opensignal.sdk.data.receiver.SDK_INTENT_EXTRA_PIPELINE_DATA", (Bundle) ((xj.i) this.f3977x).a(aVar));
        PendingIntent broadcast = PendingIntent.getBroadcast(context, aVar.f22060b.hashCode(), intent, i10);
        br.l.d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public HashMap v() {
        ch.f fVar = (ch.f) this.f3975g;
        bk.k kVar = (bk.k) this.f3976r;
        List listB = kVar.B();
        if (((HashMap) this.f3977x) != null && ((List) this.f3978y).size() == listB.size() && ((List) this.f3978y).containsAll(listB)) {
            HashMap map = (HashMap) this.f3977x;
            if (map != null) {
                return map;
            }
            br.l.l("_allTelephonyManagers");
            throw null;
        }
        HashMap map2 = new HashMap();
        Object systemService = ((Context) this.f3974d).getApplicationContext().getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager != null) {
            ch.n.b("TelephonyManagerProvider", "Subscription IDs found: " + listB);
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                TelephonyManager telephonyManagerCreateForSubscriptionId = fVar.b() ? telephonyManager.createForSubscriptionId(iIntValue) : null;
                if (telephonyManagerCreateForSubscriptionId == null) {
                    ch.n.b("TelephonyManagerProvider", "TelephonyManager is null");
                } else {
                    map2.put(Integer.valueOf(iIntValue), telephonyManagerCreateForSubscriptionId);
                }
            }
            this.f3978y = listB;
            if (map2.isEmpty()) {
                TelephonyManager telephonyManagerCreateForSubscriptionId2 = fVar.b() ? telephonyManager.createForSubscriptionId(kVar.x()) : null;
                if (telephonyManagerCreateForSubscriptionId2 != null) {
                    telephonyManager = telephonyManagerCreateForSubscriptionId2;
                }
                map2.put(Integer.valueOf(kVar.x()), telephonyManager);
            }
        }
        this.f3977x = map2;
        return map2;
    }

    public float w(int i10, boolean z10) {
        Layout layout = (Layout) this.f3974d;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float x(int r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.a.x(int, boolean, boolean):float");
    }

    public void y(String str, String str2) {
        br.l.e(str2, "value");
        fh.f fVar = (fh.f) this.f3976r;
        fVar.getClass();
        ou.d.a(str);
        ou.d.b(str2, str);
        fVar.j(str);
        fVar.c(str, str2);
    }

    public synchronized boolean z() {
        boolean zH;
        Boolean bool = (Boolean) this.f3977x;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = ((se.f) this.f3974d).h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return zH;
    }

    public /* synthetic */ a(boolean z10) {
        this.f3973a = 25;
    }

    public a(com.opensignal.sdk.common.measurements.base.e eVar, q3.a aVar, ch.f fVar, com.opensignal.sdk.common.measurements.base.f fVar2, com.opensignal.sdk.common.measurements.base.c cVar) {
        this.f3973a = 14;
        this.f3974d = eVar;
        this.f3978y = aVar;
        this.f3975g = fVar;
        this.f3976r = fVar2;
        this.f3977x = cVar;
    }

    public a(Context context, bk.k kVar, ch.f fVar) {
        this.f3973a = 15;
        this.f3974d = context;
        this.f3976r = kVar;
        this.f3975g = fVar;
        this.f3978y = w.f16945a;
    }

    public a(qj.a aVar, ee.f fVar, xj.j jVar, ai.g gVar, hi.a aVar2) {
        this.f3973a = 13;
        this.f3974d = aVar;
        this.f3975g = fVar;
        this.f3976r = aVar2;
        this.f3977x = e5.I("THROUGHPUT_ICMP", "THROUGHPUT_SERVER_RESPONSE");
        this.f3978y = e5.I("THROUGHPUT_ICMP_PING", "THROUGHPUT_ICMP_TRACEROUTE", "THROUGHPUT_SERVER_RESPONSE");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Boolean bool, Double d6) {
        this(bool, d6, (Double) null, Boolean.FALSE, (Double) null);
        this.f3973a = 19;
    }

    public a(Context context, sm.f fVar, oh.p pVar, ai.g gVar, List list, ch.f fVar2) {
        this.f3973a = 9;
        br.l.e(fVar, "broadcastReceiverFactory");
        br.l.e(pVar, "broadcastReceiverRepository");
        this.f3974d = context;
        this.f3976r = fVar;
        this.f3977x = pVar;
        this.f3978y = list;
        this.f3975g = fVar2;
    }

    public a(Context context, js.e eVar, xh.a aVar) {
        this.f3973a = 12;
        br.l.e(aVar, "deviceReportingExclusionRepository");
        this.f3974d = context;
        this.f3975g = eVar;
        this.f3976r = aVar;
        this.f3977x = e5.I("VONTAR", "SHV44");
        this.f3978y = e5.I("RPIS31.Q2-42-25-3", "RKQ1.210303.002", "RPXS31.Q2-58-17-7-3", "RZCS31.Q2-57-12-14", "RPLS31.Q2-63-10-2-9");
    }

    public a(Context context, ch.f fVar, AlarmManager alarmManager, gi.a aVar, t tVar, a aVar2, q3.a aVar3) {
        this.f3973a = 0;
        br.l.e(alarmManager, "alarmManager");
        br.l.e(aVar, "alarmManagerJobDataMapper");
        this.f3974d = context;
        this.f3975g = fVar;
        this.f3976r = alarmManager;
        this.f3977x = aVar;
        this.f3978y = aVar3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Boolean bool, Double d6, Double d10) {
        this(bool, d6, d10, Boolean.FALSE, (Double) null);
        this.f3973a = 19;
    }

    public a(Layout layout) {
        this.f3973a = 18;
        this.f3974d = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iA0 = tt.l.A0(((Layout) this.f3974d).getText(), '\n', length, 4);
            length = iA0 < 0 ? ((Layout) this.f3974d).getText().length() : iA0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f3974d).getText().length());
        this.f3975g = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f3976r = arrayList2;
        this.f3977x = new boolean[((ArrayList) this.f3975g).size()];
        ((ArrayList) this.f3975g).size();
    }

    public a(lb.e eVar, HashMap map, HashMap map2, HashMap map3) {
        this.f3973a = 22;
        this.f3974d = eVar;
        this.f3977x = map2;
        this.f3978y = map3;
        this.f3976r = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        eVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f3975g = jArr;
    }

    public a(t6.d dVar, HashMap map, HashMap map2, HashMap map3) {
        this.f3973a = 28;
        this.f3974d = dVar;
        this.f3977x = map2;
        this.f3978y = map3;
        this.f3976r = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f3975g = jArr;
    }

    public a(Boolean bool, Double d6, Double d10, Boolean bool2, Double d11) {
        this.f3973a = 19;
        this.f3974d = bool;
        this.f3975g = d6;
        this.f3976r = d10;
        this.f3977x = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f3978y = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    public a(h2.f fVar, j0 j0Var, List list, t2.c cVar, k2.g gVar) {
        int i10;
        String strSubstring;
        List list2;
        ArrayList arrayList;
        ?? arrayList2;
        int i11;
        String str;
        int i12;
        int i13;
        w wVar;
        List list3;
        h2.f fVar2 = fVar;
        this.f3973a = 16;
        this.f3974d = fVar2;
        this.f3975g = list;
        lq.j jVar = lq.j.NONE;
        final int i14 = 0;
        this.f3976r = kc.f.E(jVar, new ar.a(this) { // from class: h2.n

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ cj.a f9857d;

            {
                this.f9857d = this;
            }

            @Override // ar.a
            public final Object c() {
                Object obj;
                Object obj2;
                switch (i14) {
                    case 0:
                        ArrayList arrayList3 = (ArrayList) this.f9857d.f3978y;
                        if (arrayList3.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList3.get(0);
                            float fA = ((q) obj3).f9866a.a();
                            int iZ = e5.z(arrayList3);
                            int i15 = 1;
                            if (1 <= iZ) {
                                while (true) {
                                    Object obj4 = arrayList3.get(i15);
                                    float fA2 = ((q) obj4).f9866a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i15 != iZ) {
                                        i15++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        q qVar = (q) obj;
                        return Float.valueOf(qVar != null ? qVar.f9866a.a() : 0.0f);
                    default:
                        ArrayList arrayList4 = (ArrayList) this.f9857d.f3978y;
                        if (arrayList4.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList4.get(0);
                            float fC = ((q) obj5).f9866a.E.c();
                            int iZ2 = e5.z(arrayList4);
                            int i16 = 1;
                            if (1 <= iZ2) {
                                while (true) {
                                    Object obj6 = arrayList4.get(i16);
                                    float fC2 = ((q) obj6).f9866a.E.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i16 != iZ2) {
                                        i16++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        q qVar2 = (q) obj2;
                        return Float.valueOf(qVar2 != null ? qVar2.f9866a.E.c() : 0.0f);
                }
            }
        });
        final int i15 = 1;
        this.f3977x = kc.f.E(jVar, new ar.a(this) { // from class: h2.n

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ cj.a f9857d;

            {
                this.f9857d = this;
            }

            @Override // ar.a
            public final Object c() {
                Object obj;
                Object obj2;
                switch (i15) {
                    case 0:
                        ArrayList arrayList3 = (ArrayList) this.f9857d.f3978y;
                        if (arrayList3.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList3.get(0);
                            float fA = ((q) obj3).f9866a.a();
                            int iZ = e5.z(arrayList3);
                            int i152 = 1;
                            if (1 <= iZ) {
                                while (true) {
                                    Object obj4 = arrayList3.get(i152);
                                    float fA2 = ((q) obj4).f9866a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i152 != iZ) {
                                        i152++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        q qVar = (q) obj;
                        return Float.valueOf(qVar != null ? qVar.f9866a.a() : 0.0f);
                    default:
                        ArrayList arrayList4 = (ArrayList) this.f9857d.f3978y;
                        if (arrayList4.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList4.get(0);
                            float fC = ((q) obj5).f9866a.E.c();
                            int iZ2 = e5.z(arrayList4);
                            int i16 = 1;
                            if (1 <= iZ2) {
                                while (true) {
                                    Object obj6 = arrayList4.get(i16);
                                    float fC2 = ((q) obj6).f9866a.E.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i16 != iZ2) {
                                        i16++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        q qVar2 = (q) obj2;
                        return Float.valueOf(qVar2 != null ? qVar2.f9866a.E.c() : 0.0f);
                }
            }
        });
        h2.s sVar = j0Var.f9841b;
        int i16 = h2.g.f9823a;
        ArrayList arrayList3 = fVar2.f9813r;
        String str2 = fVar2.f9811d;
        w wVar2 = w.f16945a;
        List listM0 = arrayList3 != null ? mq.o.M0(arrayList3, new h2.e(i15)) : wVar2;
        ArrayList arrayList4 = new ArrayList();
        mq.k kVar = new mq.k();
        int size = listM0.size();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            h2.d dVar = (h2.d) listM0.get(i17);
            h2.s sVarA = sVar.a((h2.s) dVar.f9800a);
            int i19 = dVar.f9801b;
            int i20 = dVar.f9802c;
            if (i19 > i20) {
                m2.a.a("Reversed range is not supported");
            }
            while (i18 < i19 && !kVar.isEmpty()) {
                h2.d dVar2 = (h2.d) kVar.last();
                List list4 = listM0;
                int i21 = dVar2.f9802c;
                w wVar3 = wVar2;
                Object obj = dVar2.f9800a;
                if (i19 < i21) {
                    arrayList4.add(new h2.d(i18, i19, obj));
                    i18 = i19;
                    listM0 = list4;
                    wVar2 = wVar3;
                } else {
                    int i22 = size;
                    arrayList4.add(new h2.d(i18, i21, obj));
                    i18 = dVar2.f9802c;
                    while (!kVar.isEmpty() && i18 == ((h2.d) kVar.last()).f9802c) {
                        kVar.removeLast();
                    }
                    listM0 = list4;
                    wVar2 = wVar3;
                    size = i22;
                }
            }
            List list5 = listM0;
            w wVar4 = wVar2;
            int i23 = size;
            if (i18 < i19) {
                arrayList4.add(new h2.d(i18, i19, sVar));
                i18 = i19;
            }
            h2.d dVar3 = (h2.d) (kVar.isEmpty() ? null : kVar.f16938d[kVar.k(e5.z(kVar) + kVar.f16937a)]);
            if (dVar3 != null) {
                int i24 = dVar3.f9802c;
                Object obj2 = dVar3.f9800a;
                int i25 = dVar3.f9801b;
                if (i25 == i19 && i24 == i20) {
                    kVar.removeLast();
                    kVar.addLast(new h2.d(i19, i20, ((h2.s) obj2).a(sVarA)));
                } else if (i25 == i24) {
                    arrayList4.add(new h2.d(i25, i24, obj2));
                    kVar.removeLast();
                    kVar.addLast(new h2.d(i19, i20, sVarA));
                } else if (i24 >= i20) {
                    kVar.addLast(new h2.d(i19, i20, ((h2.s) obj2).a(sVarA)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                kVar.addLast(new h2.d(i19, i20, sVarA));
            }
            i17++;
            listM0 = list5;
            wVar2 = wVar4;
            size = i23;
        }
        w wVar5 = wVar2;
        while (i18 <= str2.length() && !kVar.isEmpty()) {
            h2.d dVar4 = (h2.d) kVar.last();
            Object obj3 = dVar4.f9800a;
            int i26 = dVar4.f9802c;
            arrayList4.add(new h2.d(i18, i26, obj3));
            while (!kVar.isEmpty() && i26 == ((h2.d) kVar.last()).f9802c) {
                kVar.removeLast();
            }
            i18 = i26;
        }
        if (i18 < str2.length()) {
            arrayList4.add(new h2.d(i18, str2.length(), sVar));
        }
        if (arrayList4.isEmpty()) {
            i10 = 0;
            arrayList4.add(new h2.d(0, 0, sVar));
        } else {
            i10 = 0;
        }
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int size2 = arrayList4.size();
        int i27 = i10;
        while (i27 < size2) {
            h2.d dVar5 = (h2.d) arrayList4.get(i27);
            int i28 = dVar5.f9801b;
            int i29 = dVar5.f9802c;
            if (i28 != i29) {
                strSubstring = str2.substring(i28, i29);
                br.l.d(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            if (i28 == i29 || (list2 = fVar2.f9810a) == null) {
                arrayList = arrayList4;
                str = str2;
                i12 = size2;
                i13 = i27;
                wVar = null;
            } else {
                if (i28 == 0 && i29 >= str2.length()) {
                    arrayList2 = new ArrayList(list2.size());
                    int size3 = list2.size();
                    arrayList = arrayList4;
                    int i30 = 0;
                    while (i30 < size3) {
                        int i31 = size3;
                        Object obj4 = list2.get(i30);
                        int i32 = i30;
                        if (!(((h2.c) ((h2.d) obj4).f9800a) instanceof h2.s)) {
                            arrayList2.add(obj4);
                        }
                        i30 = i32 + 1;
                        size3 = i31;
                    }
                } else {
                    arrayList = arrayList4;
                    arrayList2 = new ArrayList(list2.size());
                    int size4 = list2.size();
                    int i33 = 0;
                    while (i33 < size4) {
                        int i34 = size4;
                        h2.d dVar6 = (h2.d) list2.get(i33);
                        int i35 = i33;
                        Object obj5 = dVar6.f9800a;
                        int i36 = dVar6.f9802c;
                        String str3 = str2;
                        int i37 = dVar6.f9801b;
                        int i38 = size2;
                        if ((((h2.c) obj5) instanceof h2.s) || !h2.g.a(i28, i29, i37, i36)) {
                            i11 = i27;
                        } else {
                            i11 = i27;
                            arrayList2.add(new h2.d((h2.c) dVar6.f9800a, vc.e.h(i37, i28, i29) - i28, vc.e.h(i36, i28, i29) - i28, dVar6.f9803d));
                        }
                        i33 = i35 + 1;
                        size4 = i34;
                        str2 = str3;
                        size2 = i38;
                        i27 = i11;
                    }
                }
                str = str2;
                i12 = size2;
                i13 = i27;
                wVar = arrayList2;
            }
            h2.f fVar3 = new h2.f(strSubstring, wVar == null ? wVar5 : wVar);
            h2.s sVar2 = (h2.s) dVar5.f9800a;
            j0 j0Var2 = new j0(j0Var.f9840a, sVar.a(sVar2.f9870b == Integer.MIN_VALUE ? new h2.s(sVar2.f9869a, sVar.f9870b, sVar2.f9871c, sVar2.f9872d, sVar2.f9873e, sVar2.f9874f, sVar2.f9875g, sVar2.f9876h, sVar2.f9877i) : sVar2));
            ?? r12 = fVar3.f9810a;
            w wVar6 = r12 == 0 ? wVar5 : r12;
            List list6 = (List) this.f3975g;
            ArrayList arrayList6 = new ArrayList(list6.size());
            int size5 = list6.size();
            int i39 = 0;
            while (i39 < size5) {
                h2.d dVar7 = (h2.d) list6.get(i39);
                int i40 = dVar7.f9801b;
                int i41 = dVar7.f9802c;
                if (h2.g.a(i28, i29, i40, i41)) {
                    if (i28 > i40 || i41 > i29) {
                        m2.a.a("placeholder can not overlap with paragraph.");
                    }
                    list3 = list6;
                    arrayList6.add(new h2.d(i40 - i28, i41 - i28, dVar7.f9800a));
                } else {
                    list3 = list6;
                }
                i39++;
                list6 = list3;
            }
            arrayList5.add(new h2.q(new o2.d(strSubstring, j0Var2, wVar6, arrayList6, gVar, cVar), i28, i29));
            i27 = i13 + 1;
            fVar2 = fVar;
            arrayList4 = arrayList;
            str2 = str;
            size2 = i12;
        }
        this.f3978y = arrayList5;
    }

    public a(se.f fVar) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f3973a = 17;
        this.f3975g = new Object();
        this.f3976r = new dd.h();
        this.f3978y = new dd.h();
        fVar.a();
        Context context = fVar.f22007a;
        this.f3974d = fVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        Boolean boolValueOf = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e4) {
                e0.c("FirebaseCrashlytics", "Could not read data collection permission from manifest", e4);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            boolValueOf = boolValueOf2 == null ? null : Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
        }
        this.f3977x = boolValueOf;
        synchronized (this.f3975g) {
            try {
                if (z()) {
                    ((dd.h) this.f3976r).c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f3973a = 21;
        this.f3977x = new ArrayDeque();
        this.f3974d = sharedPreferences;
        this.f3975g = "topic_operation_queue";
        this.f3976r = ",";
        this.f3978y = scheduledThreadPoolExecutor;
    }

    public a(ds.a aVar, ds.e eVar, lq.h hVar) {
        this.f3973a = 11;
        br.l.e(eVar, "typeParameterResolver");
        this.f3974d = aVar;
        this.f3975g = eVar;
        this.f3976r = hVar;
        this.f3977x = hVar;
        this.f3978y = new bm.d(this, eVar);
    }

    public a(a8.a aVar) {
        this.f3973a = 1;
        this.f3974d = mq.o.R0(aVar.f186a);
        this.f3975g = mq.o.R0(aVar.f187b);
        this.f3976r = mq.o.R0(aVar.f188c);
        this.f3977x = mq.o.R0(aVar.f189d);
        this.f3978y = mq.o.R0(aVar.f190e);
    }

    public a() {
        this.f3973a = 25;
        this.f3978y = new LinkedHashMap();
        this.f3975g = URLRequest.METHOD_GET;
        this.f3976r = new fh.f(2);
    }

    public a(of.b bVar, of.b bVar2, qs.g gVar, ArrayList arrayList) {
        this.f3973a = 20;
        this.f3975g = bVar;
        this.f3976r = bVar2;
        this.f3977x = gVar;
        this.f3978y = arrayList;
        this.f3974d = bVar;
    }

    public a(u5.i iVar) {
        this.f3973a = 24;
        this.f3974d = iVar;
        this.f3975g = new HashMap();
        this.f3976r = new HashSet();
        this.f3977x = new HashMap();
    }

    public a(Context context) {
        this.f3973a = 10;
        if (context != null) {
            this.f3974d = context.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }
}
