package i4;

import a5.u;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Patterns;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import ar.k;
import br.l;
import coil.memory.MemoryCache$Key;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import com.survicate.surveys.entities.views.InputValidationResult;
import com.survicate.surveys.entities.views.InputValidator;
import h7.h0;
import h7.r1;
import i.g0;
import ih.i;
import io.sentry.a5;
import io.sentry.b5;
import io.sentry.m;
import io.sentry.m4;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.r4;
import io.sentry.s6;
import io.sentry.t;
import io.sentry.u0;
import io.sentry.x5;
import io.sentry.y2;
import ir.f0;
import java.io.IOException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import k5.p;
import l5.j;
import lq.r;
import ls.i0;
import ls.j0;
import ls.k0;
import ls.l0;
import ma.a0;
import ma.b0;
import ma.d0;
import mq.o;
import n0.w0;
import p.l2;
import qb.v;
import u3.f1;
import u3.h1;
import u3.n;

/* loaded from: classes.dex */
public class b implements y2, io.sentry.clientreport.f, InputValidator, n, t0, j8.f, i, dt.g, p, eb.e, j, ca.e, a0, ns.f {

    /* renamed from: a, reason: collision with root package name */
    public Object f11196a;

    /* renamed from: d, reason: collision with root package name */
    public Object f11197d;

    public /* synthetic */ b(Object obj) {
        this.f11197d = null;
        this.f11196a = obj;
    }

    public static m D(a5 a5Var) {
        return a5.Event.equals(a5Var) ? m.Error : a5.Session.equals(a5Var) ? m.Session : a5.Transaction.equals(a5Var) ? m.Transaction : a5.UserFeedback.equals(a5Var) ? m.UserReport : a5.Feedback.equals(a5Var) ? m.Feedback : a5.Profile.equals(a5Var) ? m.Profile : a5.ProfileChunk.equals(a5Var) ? m.ProfileChunkUi : a5.Attachment.equals(a5Var) ? m.Attachment : a5.CheckIn.equals(a5Var) ? m.Monitor : a5.ReplayVideo.equals(a5Var) ? m.Replay : a5.Log.equals(a5Var) ? m.LogItem : m.Default;
    }

    @Override // ns.f
    public boolean A(int i10) {
        return ((Boolean) O(i10).f15582g).booleanValue();
    }

    @Override // dt.g
    public dt.f B(qs.b bVar) {
        l.e(bVar, "classId");
        l2 l2Var = (l2) this.f11196a;
        js.g gVar = (js.g) this.f11197d;
        l.e(gVar.c().f7495c, "<this>");
        wr.b bVarL = i4.l(l2Var, bVar, ps.f.f20634g);
        if (bVarL == null) {
            return null;
        }
        xr.d.a(bVarL.f24588a).equals(bVar);
        return gVar.f(bVarL);
    }

    public b C() throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f11196a;
        cVar.y();
        cVar.b();
        int i10 = cVar.f12846g;
        int[] iArr = cVar.f12845d;
        if (i10 == iArr.length) {
            cVar.f12845d = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = cVar.f12845d;
        int i11 = cVar.f12846g;
        cVar.f12846g = i11 + 1;
        iArr2[i11] = 3;
        cVar.f12844a.write(123);
        return this;
    }

    @Override // l5.j
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public l5.c v(l5.i iVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        l5.c cVar;
        String str = iVar.f14717a.f14723a;
        l5.c cVar2 = null;
        try {
            a5.a.b("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                cVar = new l5.c(mediaCodecCreateByCodecName, (HandlerThread) ((l5.b) this.f11196a).get(), (HandlerThread) ((l5.b) this.f11197d).get());
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodecCreateByCodecName = null;
        }
        try {
            a5.a.o();
            l5.c.m(cVar, iVar.f14718b, iVar.f14720d, iVar.f14721e);
            return cVar;
        } catch (Exception e11) {
            e = e11;
            cVar2 = cVar;
            if (cVar2 != null) {
                cVar2.release();
            } else if (mediaCodecCreateByCodecName != null) {
                mediaCodecCreateByCodecName.release();
            }
            throw e;
        }
    }

    public b F() throws IOException {
        ((io.sentry.vendor.gson.stream.c) this.f11196a).f(3, 5, '}');
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory G(java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.b.G(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public ArrayList H(Map map, ArrayList arrayList, boolean z10) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z11 = (thread == threadCurrentThread && !z10) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z10);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            z zVar = new z();
            zVar.f12663g = thread2.getName();
            zVar.f12662d = Integer.valueOf(thread2.getPriority());
            zVar.f12661a = Long.valueOf(thread2.getId());
            zVar.B = Boolean.valueOf(thread2.isDaemon());
            zVar.f12664r = thread2.getState().name();
            zVar.f12665x = Boolean.valueOf(z11);
            ArrayList arrayListZ = ((g0) this.f11196a).z(stackTraceElementArr, false);
            if (((x5) this.f11197d).isAttachStacktrace() && arrayListZ != null && !arrayListZ.isEmpty()) {
                y yVar = new y(arrayListZ);
                yVar.f12659g = Boolean.TRUE;
                zVar.E = yVar;
            }
            arrayList2.add(zVar);
        }
        return arrayList2;
    }

    public b I(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f11196a;
        if (str == null) {
            cVar.getClass();
            throw new NullPointerException("name == null");
        }
        if (cVar.B != null) {
            throw new IllegalStateException();
        }
        if (cVar.f12846g == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        cVar.B = str;
        return this;
    }

    public void J() {
        ((n7.b) this.f11196a).a();
    }

    public void K(Bundle bundle) {
        n7.b bVar = (n7.b) this.f11196a;
        Bundle bundleM = e5.m((lq.l[]) Arrays.copyOf(new lq.l[0], 0));
        Bundle bundle2 = bVar.f17393f;
        if (bundle2 != null) {
            bundleM.putAll(bundle2);
        }
        synchronized (bVar.f17390c) {
            for (Map.Entry entry : bVar.f17391d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((l7.d) entry.getValue()).a();
                l.e(str, "key");
                bundleM.putBundle(str, bundleA);
            }
        }
        if (bundleM.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM);
    }

    public void L(String str, String str2, Long l10) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((io.sentry.util.e) ((g0) this.f11196a).f11051a).a()).get(new io.sentry.clientreport.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l10.longValue());
        }
    }

    public void M(io.sentry.clientreport.b bVar) {
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.f12156d.iterator();
        while (it.hasNext()) {
            io.sentry.clientreport.e eVar = (io.sentry.clientreport.e) it.next();
            L(eVar.f12160a, eVar.f12161d, eVar.f12162g);
        }
    }

    public void N(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f11196a;
        if (str != null) {
            cVar.getClass();
            if (str.length() != 0) {
                cVar.f12847r = str;
                cVar.f12848x = ": ";
                return;
            }
        }
        cVar.f12847r = null;
        cVar.f12848x = ":";
    }

    public r O(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            j0 j0Var = (j0) ((k0) this.f11197d).f15817d.get(i10);
            String str = (String) ((l0) this.f11196a).f15828d.get(j0Var.f15808r);
            i0 i0Var = j0Var.f15809x;
            l.b(i0Var);
            int i11 = ns.g.f18552a[i0Var.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(str);
            } else if (i11 == 2) {
                linkedList.addFirst(str);
            } else if (i11 == 3) {
                linkedList2.addFirst(str);
                z10 = true;
            }
            i10 = j0Var.f15807g;
        }
        return new r(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    public void P(w0 w0Var) {
        Object objG = ((u.a0) this.f11197d).g(w0Var);
        if (objG != null) {
            if (!(objG instanceof u.z)) {
                throw new ClassCastException();
            }
            u.z zVar = (u.z) objG;
            Object[] objArr = zVar.f23134a;
            if (zVar.f23135b <= 0) {
                return;
            }
            l.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public b Q(double d6) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f11196a;
        cVar.y();
        if (cVar.f12849y || !(Double.isNaN(d6) || Double.isInfinite(d6))) {
            cVar.b();
            cVar.f12844a.append((CharSequence) Double.toString(d6));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d6);
    }

    public b R(long j) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f11196a;
        cVar.y();
        cVar.b();
        cVar.f12844a.write(Long.toString(j));
        return this;
    }

    public b S(u0 u0Var, Object obj) {
        ((r1) this.f11197d).c0(this, u0Var, obj);
        return this;
    }

    public b T(Boolean bool) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f11196a;
        if (bool == null) {
            cVar.i();
            return this;
        }
        cVar.y();
        cVar.b();
        cVar.f12844a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public b U(Number number) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f11196a;
        if (number == null) {
            cVar.i();
            return this;
        }
        cVar.y();
        String string = number.toString();
        if (cVar.f12849y || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            cVar.b();
            cVar.f12844a.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public b V(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f11196a;
        if (str == null) {
            cVar.i();
            return this;
        }
        cVar.y();
        cVar.b();
        cVar.w(str);
        return this;
    }

    public b W(boolean z10) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f11196a;
        cVar.y();
        cVar.b();
        cVar.f12844a.write(z10 ? "true" : "false");
        return this;
    }

    @Override // eb.e, n6.b
    public int a(long j) {
        long[] jArr = (long[]) this.f11197d;
        int iB = v.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // ca.e
    public void b() {
        fb.f fVar = (fb.f) this.f11197d;
        byte[] bArr = v.f20833f;
        fVar.getClass();
        fVar.w(bArr.length, bArr);
    }

    @Override // ma.a0
    public void c(fb.f fVar) {
        d0 d0Var = (d0) this.f11197d;
        SparseArray sparseArray = d0Var.f16415f;
        u uVar = (u) this.f11196a;
        if (fVar.o() == 0 && (fVar.o() & 128) != 0) {
            fVar.z(6);
            int iA = fVar.a() / 4;
            for (int i10 = 0; i10 < iA; i10++) {
                fVar.c(uVar.f158b, 0, 4);
                uVar.p(0);
                int i11 = uVar.i(16);
                uVar.s(3);
                if (i11 == 0) {
                    uVar.s(13);
                } else {
                    int i12 = uVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new b0(new bj.c(d0Var, i12)));
                        d0Var.f16419l++;
                    }
                }
            }
            if (d0Var.f16410a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // u3.n
    public h1 c0(View view, h1 h1Var) {
        l.e(view, "v");
        f1 f1Var = h1Var.f23176a;
        int i10 = f1Var.f(8).f14017d;
        int i11 = 0;
        if (i10 != 0) {
            int i12 = i10 - f1Var.f(7).f14017d;
            Iterator it = ((List) this.f11197d).iterator();
            int height = 0;
            while (it.hasNext()) {
                height += ((View) it.next()).getHeight();
            }
            if (height < i12) {
                i11 = i12 - height;
            }
        }
        View view2 = (View) this.f11196a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i11);
        view2.setLayoutParams(marginLayoutParams);
        return h1Var;
    }

    @Override // eb.e, n6.b
    public long e(int i10) {
        long[] jArr = (long[]) this.f11197d;
        qb.b.g(i10 >= 0);
        qb.b.g(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // eb.e, n6.b
    public List f(long j) {
        eb.b bVar;
        int iE = v.e((long[]) this.f11197d, j, false);
        return (iE == -1 || (bVar = ((eb.b[]) this.f11196a)[iE]) == eb.b.f8055r) ? Collections.EMPTY_LIST : Collections.singletonList(bVar);
    }

    @Override // k5.p
    public r5.p g() {
        return new t(((p) this.f11196a).g(), (List) this.f11197d);
    }

    @Override // ns.f
    public String getString(int i10) {
        String str = (String) ((l0) this.f11196a).f15828d.get(i10);
        l.d(str, "strings.getString(index)");
        return str;
    }

    @Override // eb.e, n6.b
    public int h() {
        return ((long[]) this.f11197d).length;
    }

    @Override // j8.f
    public void i(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        int i10;
        int iR = i4.r(bitmap);
        j8.d dVar = (j8.d) this.f11197d;
        synchronized (((cg.e) dVar.f10234g)) {
            i10 = dVar.f10229b;
        }
        if (iR <= i10) {
            ((j8.d) this.f11197d).l(memoryCache$Key, new j8.c(bitmap, map, iR));
        } else {
            ((j8.d) this.f11197d).m(memoryCache$Key);
            ((ag.b) this.f11196a).s(memoryCache$Key, bitmap, map, iR);
        }
    }

    @Override // androidx.lifecycle.t0
    public s0 j(Class cls) {
        return (s0) ((uv.b) this.f11196a).a(null, (ir.d) ((h0) this.f11197d).f10078a, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c A[EDGE_INSN: B:68:0x011c->B:52:0x011c BREAK  A[LOOP:1: B:38:0x00e3->B:51:0x010b], SYNTHETIC] */
    @Override // ca.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ca.d k(ca.l r17, long r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.b.k(ca.l, long):ca.d");
    }

    @Override // io.sentry.clientreport.f
    public void l(io.sentry.clientreport.d dVar, m mVar) {
        p(dVar, mVar, 1L);
    }

    @Override // io.sentry.clientreport.f
    public b m(b bVar) {
        x5 x5Var = (x5) this.f11197d;
        Date dateQ = dr.a.q();
        g0 g0Var = (g0) this.f11196a;
        g0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((io.sentry.util.e) g0Var.f11051a).a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new io.sentry.clientreport.e(((io.sentry.clientreport.c) entry.getKey()).f12158a, ((io.sentry.clientreport.c) entry.getKey()).f12159b, lValueOf));
            }
        }
        io.sentry.clientreport.b bVar2 = arrayList.isEmpty() ? null : new io.sentry.clientreport.b(dateQ, arrayList);
        if (bVar2 == null) {
            return bVar;
        }
        try {
            x5Var.getLogger().m(b5.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) bVar.f11197d).iterator();
            while (it.hasNext()) {
                arrayList2.add((r4) it.next());
            }
            arrayList2.add(r4.b(x5Var.getSerializer(), bVar2));
            return new b((m4) bVar.f11196a, (List) arrayList2);
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return bVar;
        }
    }

    @Override // ns.f
    public String n(int i10) throws IOException {
        r rVarO = O(i10);
        List list = (List) rVarO.f15580a;
        String strX0 = o.x0((List) rVarO.f15581d, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strX0;
        }
        return o.x0(list, "/", null, null, null, 62) + '/' + strX0;
    }

    @Override // io.sentry.clientreport.f
    public void p(io.sentry.clientreport.d dVar, m mVar, long j) {
        x5 x5Var = (x5) this.f11197d;
        try {
            L(dVar.getReason(), mVar.getCategory(), Long.valueOf(j));
            x5Var.getOnDiscard();
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.f
    public void q(io.sentry.clientreport.d dVar, b bVar) {
        if (bVar == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) bVar.f11197d).iterator();
            while (it.hasNext()) {
                w(dVar, (r4) it.next());
            }
        } catch (Throwable th2) {
            ((x5) this.f11197d).getLogger().f(b5.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // ih.i
    public String r() {
        return ((dh.b) this.f11197d).f7343a;
    }

    @Override // ih.i
    public String s() {
        return ((dh.b) this.f11197d).f7344b;
    }

    @Override // j8.f
    public j8.a t(MemoryCache$Key memoryCache$Key) {
        j8.c cVar = (j8.c) ((j8.d) this.f11197d).h(memoryCache$Key);
        if (cVar != null) {
            return new j8.a(cVar.f13416a, cVar.f13417b);
        }
        return null;
    }

    @Override // k5.p
    public r5.p u(k5.l lVar, k5.i iVar) {
        return new t(((p) this.f11196a).u(lVar, iVar), (List) this.f11197d);
    }

    @Override // com.survicate.surveys.entities.views.InputValidator
    public InputValidationResult validate(Object obj) {
        String str = (String) obj;
        l.e(str, "input");
        InputValidationResult inputValidationResultF = ((ic.b) this.f11197d).validate(str);
        if (!inputValidationResultF.isSuccess()) {
            return inputValidationResultF;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            return new InputValidationResult(false, ((Context) this.f11196a).getString(on.u.survicate_micro_error_invalid_email));
        }
        return new InputValidationResult(true, null, 2, 0 == true ? 1 : 0);
    }

    @Override // io.sentry.clientreport.f
    public void w(io.sentry.clientreport.d dVar, r4 r4Var) {
        io.sentry.protocol.a0 a0VarG;
        x5 x5Var = (x5) this.f11197d;
        if (r4Var == null) {
            return;
        }
        try {
            a5 a5Var = r4Var.f12690a.f12734x;
            if (a5.ClientReport.equals(a5Var)) {
                try {
                    M(r4Var.e(x5Var.getSerializer()));
                    return;
                } catch (Exception unused) {
                    x5Var.getLogger().m(b5.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            m mVarD = D(a5Var);
            if (mVarD.equals(m.Transaction) && (a0VarG = r4Var.g(x5Var.getSerializer())) != null) {
                ArrayList arrayList = a0VarG.O;
                L(dVar.getReason(), m.Span.getCategory(), Long.valueOf(arrayList.size() + 1));
                arrayList.size();
                x5Var.getOnDiscard();
            }
            L(dVar.getReason(), mVarD.getCategory(), 1L);
            x5Var.getOnDiscard();
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // ih.i
    public HttpURLConnection x() {
        HttpURLConnection httpURLConnection;
        Throwable e4;
        try {
            httpURLConnection = (HttpURLConnection) ((URL) this.f11196a).openConnection();
            try {
                httpURLConnection.setConnectTimeout(2000);
                httpURLConnection.setReadTimeout(1000);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                return httpURLConnection;
            } catch (IOException e10) {
                e4 = e10;
                ch.n.e("DownloadProviderHttp", e4);
                return httpURLConnection;
            } catch (IllegalStateException e11) {
                e4 = e11;
                ch.n.e("DownloadProviderHttp", e4);
                return httpURLConnection;
            } catch (NullPointerException e12) {
                e4 = e12;
                ch.n.e("DownloadProviderHttp", e4);
                return httpURLConnection;
            }
        } catch (IOException | IllegalStateException | NullPointerException e13) {
            httpURLConnection = null;
            e4 = e13;
        }
    }

    @Override // j8.f
    public void z(int i10) {
        int i11;
        if (i10 >= 40) {
            ((j8.d) this.f11197d).p(-1);
            return;
        }
        if (10 > i10 || i10 >= 20) {
            return;
        }
        j8.d dVar = (j8.d) this.f11197d;
        synchronized (((cg.e) dVar.f10234g)) {
            i11 = dVar.f10230c;
        }
        dVar.p(i11 / 2);
    }

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f11196a = obj;
        this.f11197d = obj2;
    }

    public b(Writer writer, int i10) {
        this.f11196a = new io.sentry.vendor.gson.stream.c(writer);
        this.f11197d = new r1(i10);
    }

    public b(n7.b bVar) {
        this.f11196a = bVar;
        this.f11197d = new t(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(k kVar) {
        this.f11196a = (br.n) kVar;
        this.f11197d = new ConcurrentHashMap();
    }

    public b(x5 x5Var) {
        this.f11197d = x5Var;
        this.f11196a = new g0(6);
    }

    public b(dh.b bVar) {
        this.f11197d = bVar;
        try {
            this.f11196a = new URL(bVar.f7344b);
        } catch (MalformedURLException e4) {
            ch.n.e("DownloadProviderHttp", e4);
        }
        ch.n.b("DownloadProviderHttp", "HTTP download from: " + bVar.f7343a);
    }

    public b(m4 m4Var, List list) {
        f0.T(m4Var, "SentryEnvelopeHeader is required.");
        this.f11196a = m4Var;
        f0.T(list, "SentryEnvelope items are required.");
        this.f11197d = list;
    }

    public b(s6 s6Var, Double d6) {
        this.f11196a = s6Var;
        this.f11197d = d6;
        Map map = Collections.EMPTY_MAP;
    }

    public b(io.sentry.protocol.t tVar, io.sentry.protocol.r rVar, r4 r4Var) {
        this.f11196a = new m4(tVar, rVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r4Var);
        this.f11197d = arrayList;
    }

    public b(View view, List list) {
        l.e(view, "contentWrapper");
        this.f11196a = view;
        this.f11197d = list;
    }

    public b(int i10, boolean z10) {
        switch (i10) {
            case 23:
                this.f11196a = new u.a0();
                this.f11197d = new u.a0();
                break;
            default:
                this.f11196a = Choreographer.getInstance();
                this.f11197d = Looper.myLooper();
                break;
        }
    }

    @Override // ma.a0
    public void d(qb.u uVar, ca.m mVar, ma.g0 g0Var) {
    }
}
