package om;

import a5.b0;
import a5.d0;
import a5.v;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.protobuf.i1;
import androidx.viewpager.widget.ViewPager;
import b5.m;
import bc.i;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.libs.identity.zzee;
import com.google.android.gms.libs.identity.zzeg;
import com.google.android.gms.libs.identity.zzei;
import com.google.android.gms.location.LocationRequest;
import com.staircase3.opensignal.activities.TowersActivity;
import dd.h;
import io.sentry.android.core.e0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import ma.g0;
import mq.t;
import oh.p;
import on.k;
import on.x;
import org.json.JSONObject;
import p.l2;
import pb.p0;
import pc.r;
import rs.j0;
import t9.j;
import tt.l;
import u3.h1;
import u3.i0;
import u3.n;
import u3.v0;
import u3.w0;
import u3.x0;
import u3.y0;
import u5.a0;
import w6.q;
import w6.u;
import x1.f0;
import xi.o;

/* loaded from: classes.dex */
public final class f implements i, dd.g, rf.a, com.staircase3.opensignal.utils.d, n6.b, o9.b, q, n, p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19553a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19554d;

    /* renamed from: g, reason: collision with root package name */
    public Object f19555g;

    public /* synthetic */ f(int i10, Object obj, Object obj2, boolean z10) {
        this.f19553a = i10;
        this.f19555g = obj;
        this.f19554d = obj2;
    }

    public static void i(f0 f0Var) {
        if (f0Var.J > 0) {
            f0Var.i();
            f0Var.I = false;
            p0.e eVarI = f0Var.I();
            Object[] objArr = eVarI.f20230a;
            int i10 = eVarI.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                i((f0) objArr[i11]);
            }
        }
    }

    @Override // com.staircase3.opensignal.utils.d
    public void D() {
        TowersActivity towersActivity = (TowersActivity) this.f19555g;
        wc.c cVar = (wc.c) this.f19554d;
        int i10 = TowersActivity.Y0;
        towersActivity.N(cVar);
    }

    @Override // n6.b
    public int a(long j) {
        long[] jArr = (long[]) this.f19555g;
        int iB = d0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // bc.i
    public void accept(Object obj, Object obj2) {
        pc.g gVar;
        h hVar = (h) obj2;
        pc.h hVar2 = (pc.h) obj;
        h4 h4Var = (h4) this.f19554d;
        LocationRequest locationRequest = (LocationRequest) this.f19555g;
        hVar2.getClass();
        zb.g gVarN = h4Var.n();
        bc.g gVar2 = (bc.g) gVarN.f26826b;
        Objects.requireNonNull(gVar2);
        boolean zV = hVar2.v(tc.e.f22701b);
        synchronized (hVar2.B) {
            try {
                pc.g gVar3 = (pc.g) hVar2.B.get(gVar2);
                if (gVar3 == null || zV) {
                    pc.g gVar4 = new pc.g(h4Var);
                    hVar2.B.put(gVar2, gVar4);
                    gVar = gVar4;
                } else {
                    h4 h4Var2 = gVar3.f20447e;
                    synchronized (h4Var2) {
                        zb.g gVar5 = (zb.g) h4Var2.f5056d;
                        if (gVar5 != gVarN) {
                            gVar5.f26826b = null;
                            h4Var2.f5056d = gVarN;
                        }
                    }
                    gVar = gVar3;
                    gVar3 = null;
                }
                if (zV) {
                    r rVar = (r) hVar2.m();
                    zzee zzeeVar = new zzee(2, gVar3 == null ? null : gVar3, gVar, null, gVar2.a());
                    pc.e eVar = new pc.e(null, hVar);
                    Parcel parcelR = rVar.R();
                    pc.b.b(parcelR, zzeeVar);
                    pc.b.b(parcelR, locationRequest);
                    parcelR.writeStrongBinder(eVar);
                    rVar.S(parcelR, 88);
                } else {
                    pc.g gVar6 = gVar;
                    r rVar2 = (r) hVar2.m();
                    zzei zzeiVar = new zzei(1, new zzeg(locationRequest, null, false, false, false, false, Long.MAX_VALUE), null, gVar6, null, new pc.c(hVar, gVar6), gVar2.a());
                    Parcel parcelR2 = rVar2.R();
                    pc.b.b(parcelR2, zzeiVar);
                    rVar2.S(parcelR2, 59);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w6.q
    public void b(v vVar) {
        u uVar = (u) this.f19555g;
        SparseArray sparseArray = uVar.f24368f;
        a5.u uVar2 = (a5.u) this.f19554d;
        if (vVar.t() == 0 && (vVar.t() & 128) != 0) {
            vVar.F(6);
            int iA = vVar.a() / 4;
            for (int i10 = 0; i10 < iA; i10++) {
                vVar.e(uVar2.f158b, 0, 4);
                uVar2.p(0);
                int i11 = uVar2.i(16);
                uVar2.s(3);
                if (i11 == 0) {
                    uVar2.s(13);
                } else {
                    int i12 = uVar2.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new w6.r(new bj.c(uVar, i12)));
                        uVar.f24372l++;
                    }
                }
            }
            if (uVar.f24363a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void c(hk.h hVar) {
        synchronized (((ArrayList) this.f19555g)) {
            ch.n.b("MemoryCompletedTasksRepository", hVar.c() + " Adding to completed tasks");
            ((ArrayList) this.f19555g).add(new o(hVar.f10805b, hVar.f10804a, System.currentTimeMillis()));
            synchronized (((ArrayList) this.f19555g)) {
                t.e0((ArrayList) this.f19555g, new j1.a(20, this));
            }
            w();
            x();
        }
    }

    @Override // u3.n
    public h1 c0(View view, h1 h1Var) {
        ViewPager viewPager = (ViewPager) this.f19555g;
        h1 h1VarI = i0.i(view, h1Var);
        if (h1VarI.f23176a.n()) {
            return h1VarI;
        }
        Rect rect = (Rect) this.f19554d;
        rect.left = h1VarI.b();
        rect.top = h1VarI.d();
        rect.right = h1VarI.c();
        rect.bottom = h1VarI.a();
        int childCount = viewPager.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            h1 h1VarB = i0.b(viewPager.getChildAt(i10), h1VarI);
            rect.left = Math.min(h1VarB.b(), rect.left);
            rect.top = Math.min(h1VarB.d(), rect.top);
            rect.right = Math.min(h1VarB.c(), rect.right);
            rect.bottom = Math.min(h1VarB.a(), rect.bottom);
        }
        int i11 = Build.VERSION.SDK_INT;
        y0 x0Var = i11 >= 30 ? new x0(h1VarI) : i11 >= 29 ? new w0(h1VarI) : new v0(h1VarI);
        x0Var.g(k3.d.b(rect.left, rect.top, rect.right, rect.bottom));
        return x0Var.b();
    }

    public void d(String str) {
        synchronized (((qj.a) this.f19554d)) {
            synchronized (((qj.a) this.f19554d)) {
                ((qj.a) this.f19554d).o((hi.a) this.f19555g, "id", e5.H(str));
            }
        }
    }

    @Override // n6.b
    public long e(int i10) {
        long[] jArr = (long[]) this.f19555g;
        a5.a.e(i10 >= 0);
        a5.a.e(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // n6.b
    public List f(long j) {
        z4.b bVar;
        int iE = d0.e((long[]) this.f19555g, j, false);
        return (iE == -1 || (bVar = ((z4.b[]) this.f19554d)[iE]) == z4.b.N) ? Collections.EMPTY_LIST : Collections.singletonList(bVar);
    }

    @Override // kq.a
    public Object get() {
        et.d dVar = new et.d();
        ee.f fVar = new ee.f(27);
        Object obj = ((kq.a) this.f19554d).get();
        kq.a aVar = (kq.a) this.f19555g;
        return new t9.h(dVar, fVar, t9.a.f22665f, (j) obj, aVar);
    }

    @Override // n6.b
    public int h() {
        return ((long[]) this.f19555g).length;
    }

    public byte[] j(EventMessage eventMessage) throws IOException {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f19555g;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f19554d;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(eventMessage.f4244a);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f4245d;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(eventMessage.f4246g);
            dataOutputStream.writeLong(eventMessage.f4247r);
            dataOutputStream.write(eventMessage.f4248x);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public boolean k(String str) {
        synchronized (((qj.a) this.f19554d)) {
            rj.c cVarL = l(str);
            if (cVarL == null) {
                return false;
            }
            return Boolean.parseBoolean(cVarL.f21556b);
        }
    }

    public rj.c l(String str) {
        rj.c cVar;
        synchronized (((qj.a) this.f19554d)) {
            cVar = (rj.c) mq.o.t0(((qj.a) this.f19554d).j((hi.a) this.f19555g, e5.e("id"), e5.e(str)));
        }
        return cVar;
    }

    public Long m(String str, Long l10) {
        synchronized (((qj.a) this.f19554d)) {
            rj.c cVarL = l(str);
            if (cVarL == null) {
                return l10;
            }
            return Long.valueOf(Long.parseLong(cVarL.f21556b));
        }
    }

    public String n(String str, String str2) {
        synchronized (((qj.a) this.f19554d)) {
            rj.c cVarL = l(str);
            if (cVarL == null) {
                return str2;
            }
            return cVarL.f21556b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o2.g] */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // dd.g
    public dd.r o(Object obj) throws Throwable {
        io.sentry.instrumentation.file.h hVar;
        al.b bVar = (al.b) this.f19555g;
        ?? r02 = (JSONObject) ((jf.d) this.f19554d).f13709c.f13703a.submit(new hf.n(4, this)).get();
        Closeable closeable = null;
        if (r02 != 0) {
            qf.b bVarD0 = ((o2.g) bVar.f812d).d0(r02);
            l2 l2Var = (l2) bVar.f814f;
            ?? r42 = bVarD0.f20889c;
            l2Var.getClass();
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                try {
                    r02.put("expires_at", r42);
                    hVar = new io.sentry.instrumentation.file.h(new io.sentry.instrumentation.file.f(io.sentry.instrumentation.file.f.b((File) l2Var.f20100d, null, false)));
                } catch (Exception e4) {
                    e = e4;
                    hVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    hf.f.b(closeable, "Failed to close settings writer.");
                    throw th;
                }
                try {
                    hVar.write(r02.toString());
                    hVar.flush();
                    r42 = hVar;
                } catch (Exception e10) {
                    e = e10;
                    e0.c("FirebaseCrashlytics", "Failed to cache settings", e);
                    r42 = hVar;
                    hf.f.b(r42, "Failed to close settings writer.");
                    r02.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    String str = ((qf.e) bVar.f811c).f20898f;
                    SharedPreferences.Editor editorEdit = ((Context) bVar.f810b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit.putString("existing_instance_identifier", str);
                    editorEdit.apply();
                    ((AtomicReference) bVar.f809a).set(bVarD0);
                    ((h) ((AtomicReference) bVar.f817i).get()).c(bVarD0);
                    return e5.u(null);
                }
                hf.f.b(r42, "Failed to close settings writer.");
                r02.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                String str2 = ((qf.e) bVar.f811c).f20898f;
                SharedPreferences.Editor editorEdit2 = ((Context) bVar.f810b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit2.putString("existing_instance_identifier", str2);
                editorEdit2.apply();
                ((AtomicReference) bVar.f809a).set(bVarD0);
                ((h) ((AtomicReference) bVar.f817i).get()).c(bVarD0);
            } catch (Throwable th3) {
                th = th3;
                closeable = r42;
                hf.f.b(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return e5.u(null);
    }

    public String p(String str, String str2) throws PackageManager.NameNotFoundException {
        String strC = vc.e.C((Context) this.f19554d, str);
        if (strC == null) {
            return str2;
        }
        ((sm.f) ((no.b) this.f19555g)).M("Url overridden: " + strC + " / " + str);
        return strC;
    }

    @Override // pb.p0
    public Object parse(Uri uri, InputStream inputStream) {
        xa.a aVar = (xa.a) ((p0) this.f19554d).parse(uri, inputStream);
        List list = (List) this.f19555g;
        return list.isEmpty() ? aVar : (xa.a) aVar.a(list);
    }

    @Override // rf.a
    public StackTraceElement[] q(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        rf.a[] aVarArr = (rf.a[]) this.f19554d;
        StackTraceElement[] stackTraceElementArrQ = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            rf.a aVar = aVarArr[i10];
            if (stackTraceElementArrQ.length <= 1024) {
                break;
            }
            stackTraceElementArrQ = aVar.q(stackTraceElementArr);
        }
        return stackTraceElementArrQ.length > 1024 ? ((io.sentry.hints.i) this.f19555g).q(stackTraceElementArrQ) : stackTraceElementArrQ;
    }

    public void r(dr.a aVar) {
        br.t tVar = (br.t) this.f19554d;
        if (((aVar instanceof bk.i) && l.q0(new String(((bk.i) aVar).f2816a, tt.a.f22975a), "FBWasLive", false)) || (aVar instanceof bk.j)) {
            tVar.f2914a = false;
        }
        ((CountDownLatch) this.f19555g).countDown();
    }

    public String s(String str) {
        if (str != null && !l.D0(str)) {
            for (x xVar : x.values()) {
                str = xVar.getRegex().b(str, new c7.b(this, 20, xVar));
            }
        }
        return str;
    }

    public void t(long j, String str) {
        synchronized (((qj.a) this.f19554d)) {
            u(str, String.valueOf(j));
        }
    }

    public String toString() {
        switch (this.f19553a) {
            case 19:
                return "Bounds{lower=" + ((k3.d) this.f19554d) + " upper=" + ((k3.d) this.f19555g) + "}";
            default:
                return super.toString();
        }
    }

    public void u(String str, String str2) {
        br.l.e(str2, "value");
        synchronized (((qj.a) this.f19554d)) {
            ((qj.a) this.f19554d).k((hi.a) this.f19555g, ((hi.a) this.f19555g).k(new rj.c(str, str2)));
        }
    }

    public a0 v(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f19554d;
            if (i11 >= iArr.length) {
                a5.a.m("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new u5.j();
            }
            if (i10 == iArr[i11]) {
                return ((o5.w0[]) this.f19555g)[i11];
            }
            i11++;
        }
    }

    public void w() {
        synchronized (((ArrayList) this.f19555g)) {
            try {
                ArrayList arrayList = (ArrayList) this.f19555g;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!br.l.a(((o) next).f25356b, "core")) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = (ArrayList) this.f19555g;
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (br.l.a(((o) next2).f25356b, "core")) {
                        arrayList4.add(next2);
                    }
                }
                if (arrayList4.size() > 10) {
                    List listM0 = mq.o.m0(arrayList4.size() - 10, arrayList4);
                    ((ArrayList) this.f19555g).clear();
                    ((ArrayList) this.f19555g).addAll(listM0);
                    ((ArrayList) this.f19555g).addAll(arrayList2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x() {
        synchronized (((ArrayList) this.f19555g)) {
            if (((ArrayList) this.f19555g).size() > 15) {
                List listM0 = mq.o.m0(((ArrayList) this.f19555g).size() - 15, (ArrayList) this.f19555g);
                ((ArrayList) this.f19555g).clear();
                ((ArrayList) this.f19555g).addAll(listM0);
            }
        }
    }

    public void y(int i10, m mVar) throws IOException {
        Iterator it = (Iterator) this.f19554d;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f19555g;
            if (entry == null || ((rs.n) entry.getKey()).f21767a >= i10) {
                return;
            }
            rs.n nVar = (rs.n) ((Map.Entry) this.f19555g).getKey();
            Object value = ((Map.Entry) this.f19555g).getValue();
            rs.i iVar = rs.i.f21759c;
            j0 j0Var = nVar.f21768d;
            int i11 = nVar.f21767a;
            if (nVar.f21769g) {
                for (Object obj : (List) value) {
                    if (j0Var == j0.GROUP) {
                        mVar.X(i11, 3);
                        ((rs.b) obj).f(mVar);
                        mVar.X(i11, 4);
                    } else {
                        mVar.X(i11, j0Var.getWireType());
                        rs.i.k(mVar, j0Var, obj);
                    }
                }
            } else if (j0Var == j0.GROUP) {
                mVar.X(i11, 3);
                ((rs.b) value).f(mVar);
                mVar.X(i11, 4);
            } else {
                mVar.X(i11, j0Var.getWireType());
                rs.i.k(mVar, j0Var, value);
            }
            if (it.hasNext()) {
                this.f19555g = (Map.Entry) it.next();
            } else {
                this.f19555g = null;
            }
        }
    }

    public /* synthetic */ f(Object obj, int i10, Object obj2) {
        this.f19553a = i10;
        this.f19554d = obj;
        this.f19555g = obj2;
    }

    public f(y9.u uVar, io.sentry.internal.debugmeta.c cVar) {
        this.f19553a = 27;
        this.f19555g = cVar;
        uVar.e(new xe.b(0, this));
        this.f19554d = new HashSet();
    }

    public f(k kVar, i5.c cVar) {
        this.f19553a = 1;
        br.l.e(kVar, "persistenceManager");
        br.l.e(cVar, "answersStore");
        this.f19554d = kVar;
        this.f19555g = cVar;
    }

    public f(q3.a aVar, p pVar) {
        this.f19553a = 16;
        br.l.e(pVar, "connectionDetailsFetcher");
        this.f19554d = aVar;
        this.f19555g = pVar;
    }

    public f(LayoutInflater layoutInflater) {
        this.f19553a = 0;
        View viewInflate = layoutInflater.inflate(qk.i.try_different_test_widget, (ViewGroup) null, false);
        int i10 = qk.h.testButton;
        Button button = (Button) b4.A(viewInflate, i10);
        if (button != null) {
            i10 = qk.h.tryDifferentTest;
            TextView textView = (TextView) b4.A(viewInflate, i10);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f19554d = new bm.e(constraintLayout, button, textView);
                Resources resources = constraintLayout.getResources();
                textView.setText(resources != null ? resources.getString(qk.l.try_a_different_test) : null);
                button.setOnClickListener(new am.b(20, this));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public f(WeakReference weakReference, no.b bVar) {
        this.f19553a = 23;
        br.l.e(weakReference, "applicationContext");
        br.l.e(bVar, "logger");
        this.f19554d = weakReference;
        this.f19555g = bVar;
    }

    public f(Context context, no.b bVar) {
        this.f19553a = 5;
        br.l.e(context, "context");
        br.l.e(bVar, "logger");
        this.f19554d = context;
        this.f19555g = bVar;
    }

    public f(df.c cVar) {
        this.f19553a = 29;
        this.f19554d = cVar;
        this.f19555g = new ArrayList();
    }

    public f(String str) {
        this.f19553a = 20;
        this.f19554d = Pattern.compile(str);
    }

    public f(i.j jVar, com.staircase3.opensignal.utils.a aVar) {
        this.f19553a = 18;
        br.l.e(aVar, "analytics");
        this.f19554d = jVar;
        this.f19555g = aVar;
    }

    public f(rf.a[] aVarArr) {
        this.f19553a = 10;
        this.f19554d = aVarArr;
        this.f19555g = new io.sentry.hints.i(23);
    }

    public f(int i10) {
        this.f19553a = i10;
        switch (i10) {
            case 24:
                this.f19554d = new p0.e(new f0[16]);
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f19554d = byteArrayOutputStream;
                this.f19555g = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public f(q3.a aVar, br.t tVar, CountDownLatch countDownLatch) {
        this.f19553a = 15;
        this.f19554d = tVar;
        this.f19555g = countDownLatch;
    }

    public f(eg.b bVar) {
        this.f19553a = 4;
        this.f19555g = Collections.synchronizedMap(new HashMap());
        this.f19554d = bVar;
    }

    public f(WindowInsetsAnimation.Bounds bounds) {
        this.f19553a = 19;
        this.f19554d = k3.d.c(bounds.getLowerBound());
        this.f19555g = k3.d.c(bounds.getUpperBound());
    }

    public f(rs.m mVar) {
        this.f19553a = 12;
        Iterator it = ((i1) mVar.f21766a.f21760a.entrySet()).iterator();
        this.f19554d = it;
        if (it.hasNext()) {
            this.f19555g = (Map.Entry) it.next();
        }
    }

    public f(ViewPager viewPager) {
        this.f19553a = 25;
        this.f19555g = viewPager;
        this.f19554d = new Rect();
    }

    public f(u uVar) {
        this.f19553a = 22;
        this.f19555g = uVar;
        this.f19554d = new a5.u(new byte[4], 4, 0, (byte) 0);
    }

    @Override // w6.q
    public void g(b0 b0Var, u5.m mVar, g0 g0Var) {
    }
}
