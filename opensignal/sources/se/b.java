package se;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.node.Owner;
import br.l;
import bu.t;
import cc.s;
import ch.n;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.ui.e0;
import h7.r1;
import h9.b2;
import ht.a1;
import ht.b0;
import ht.c1;
import ht.d1;
import ht.g0;
import ht.m0;
import ht.p0;
import ht.r;
import ht.x;
import i.j;
import io.sentry.android.replay.y;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.d6;
import io.sentry.i1;
import io.sentry.k;
import io.sentry.k6;
import io.sentry.m2;
import io.sentry.n6;
import io.sentry.x5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.q;
import lf.t1;
import mq.a0;
import mq.o;
import mq.p;
import mq.z;
import ni.q0;
import org.json.JSONException;
import org.json.JSONObject;
import qb.v;
import qk.m;
import rr.i;
import rr.r0;
import x1.f0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f22000a;

    /* renamed from: b, reason: collision with root package name */
    public static vc.f f22001b;

    public static final or.h A(x xVar) {
        l.e(xVar, "<this>");
        or.h hVarN = xVar.Z().n();
        l.d(hVarN, "constructor.builtIns");
        return hVarN;
    }

    public static final ViewParent B(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(x3.a.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static SharedPreferences C(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final x D(r0 r0Var) {
        Object obj;
        List upperBounds = r0Var.getUpperBounds();
        l.d(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List upperBounds2 = r0Var.getUpperBounds();
        l.d(upperBounds2, "upperBounds");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i iVarP = ((x) next).Z().p();
            rr.f fVar = iVarP instanceof rr.f ? (rr.f) iVarP : null;
            if (fVar != null && fVar.f() != rr.g.INTERFACE && fVar.f() != rr.g.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        x xVar = (x) obj;
        if (xVar != null) {
            return xVar;
        }
        List upperBounds3 = r0Var.getUpperBounds();
        l.d(upperBounds3, "upperBounds");
        Object objR0 = o.r0(upperBounds3);
        l.d(objR0, "upperBounds.first()");
        return (x) objR0;
    }

    public static final boolean E(r0 r0Var, m0 m0Var, Set set) {
        l.e(r0Var, "typeParameter");
        List<x> upperBounds = r0Var.getUpperBounds();
        l.d(upperBounds, "typeParameter.upperBounds");
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (x xVar : upperBounds) {
            l.d(xVar, "upperBound");
            if (o(xVar, r0Var.q().Z(), set) && (m0Var == null || l.a(xVar.Z(), m0Var))) {
                return true;
            }
        }
        return false;
    }

    public static int F(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int G(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(h0.b.h(i10, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final int H(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static boolean I(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() == 0) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e4) {
            n.d("TUConnectionInformation", "Error verify if on Mobile: " + e4.getMessage(), e4);
            return false;
        }
    }

    public static final c1 J(x xVar) {
        l.e(xVar, "<this>");
        c1 c1VarG = a1.g(xVar, true);
        l.d(c1VarG, "makeNullable(this)");
        return c1VarG;
    }

    public static long K(long... jArr) {
        if (jArr.length <= 0) {
            throw new IllegalArgumentException();
        }
        long j = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j7 = jArr[i10];
            if (j7 > j) {
                j = j7;
            }
        }
        return j;
    }

    public static pq.h L(pq.f fVar, pq.g gVar) {
        l.e(gVar, "key");
        return l.a(fVar.getKey(), gVar) ? pq.i.f20621a : fVar;
    }

    public static pq.h M(pq.f fVar, pq.h hVar) {
        l.e(hVar, "context");
        return hVar == pq.i.f20621a ? fVar : (pq.h) hVar.Z(new il.a(27), fVar);
    }

    public static k4.b O(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j7 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i13 = 0; i13 < j7; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j10 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j10 + j));
                    k4.b bVar = new k4.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f14040r = byteBufferDuplicate;
                    bVar.f14037a = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f14038d = i15;
                    bVar.f14039g = ((ByteBuffer) bVar.f14040r).getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void P(View view, y yVar) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(yVar);
        } catch (IllegalStateException unused) {
        }
    }

    public static final x Q(x xVar, sr.h hVar) {
        return (xVar.getAnnotations().isEmpty() && hVar.isEmpty()) ? xVar : xVar.k0().r0(ht.c.q(xVar.X(), hVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [ht.c1] */
    public static final c1 R(x xVar) {
        b0 b0VarP;
        l.e(xVar, "<this>");
        c1 c1VarK0 = xVar.k0();
        if (c1VarK0 instanceof r) {
            r rVar = (r) c1VarK0;
            b0 b0VarP2 = rVar.f10938d;
            if (!b0VarP2.Z().o().isEmpty() && b0VarP2.Z().p() != null) {
                List listO = b0VarP2.Z().o();
                l.d(listO, "constructor.parameters");
                ArrayList arrayList = new ArrayList(p.a0(listO, 10));
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    arrayList.add(new g0((r0) it.next()));
                }
                b0VarP2 = ht.c.p(b0VarP2, arrayList, null, 2);
            }
            b0 b0VarP3 = rVar.f10939g;
            if (!b0VarP3.Z().o().isEmpty() && b0VarP3.Z().p() != null) {
                List listO2 = b0VarP3.Z().o();
                l.d(listO2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(p.a0(listO2, 10));
                Iterator it2 = listO2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new g0((r0) it2.next()));
                }
                b0VarP3 = ht.c.p(b0VarP3, arrayList2, null, 2);
            }
            b0VarP = ht.e.j(b0VarP2, b0VarP3);
        } else {
            if (!(c1VarK0 instanceof b0)) {
                throw new bf.n();
            }
            b0 b0Var = (b0) c1VarK0;
            boolean zIsEmpty = b0Var.Z().o().isEmpty();
            b0VarP = b0Var;
            if (!zIsEmpty) {
                i iVarP = b0Var.Z().p();
                b0VarP = b0Var;
                if (iVarP != null) {
                    List listO3 = b0Var.Z().o();
                    l.d(listO3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(p.a0(listO3, 10));
                    Iterator it3 = listO3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new g0((r0) it3.next()));
                    }
                    b0VarP = ht.c.p(b0Var, arrayList3, null, 2);
                }
            }
        }
        return ht.c.g(b0VarP, c1VarK0);
    }

    public static void S(i.g gVar, j jVar, float f10) {
        int i10;
        if (jVar != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            jVar.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            if (gVar.getWindow() == null || (i10 = displayMetrics.heightPixels) <= 0) {
                return;
            }
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (f10 < 0.5f) {
                f10 = 0.5f;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(gVar.getWindow().getAttributes());
            layoutParams.height = (int) (i10 * f10);
            layoutParams.y = 0;
            layoutParams.gravity = 48;
            gVar.getWindow().setAttributes(layoutParams);
        }
    }

    public static void T(ViewGroup viewGroup, float f10) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof ee.i) {
            ((ee.i) background).p(f10);
        }
    }

    public static void U(View view, ee.i iVar) {
        ud.a aVar = iVar.f8117d.f8099c;
        if (aVar == null || !aVar.f23540a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        ee.g gVar = iVar.f8117d;
        if (gVar.f8107m != elevation) {
            gVar.f8107m = elevation;
            iVar.x();
        }
    }

    public static void V(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof ee.i) {
            U(viewGroup, (ee.i) background);
        }
    }

    public static void W(Activity activity, int i10) {
        try {
            int color = activity.getColor(i10);
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(color);
        } catch (Exception unused) {
        }
    }

    public static void X(Dialog dialog, int i10) {
        try {
            int color = dialog.getContext().getColor(i10);
            Window window = dialog.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(color);
        } catch (Exception unused) {
        }
    }

    public static void Y(Context context, int i10) {
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) null, false);
        i.g gVarCreate = new i.f(context, m.DialogTheme_Fullscreen).setView(viewInflate).create();
        gVarCreate.show();
        X(gVarCreate, qk.d.status_bar_background);
        Toolbar toolbar = (Toolbar) viewInflate.findViewById(qk.h.toolbar);
        if (toolbar != null) {
            int color = context.getColor(qk.d.neutral_1);
            Drawable drawable = context.getDrawable(qk.f.ic_arrow_back_white_36dp);
            drawable.setTint(color);
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationOnClickListener(new e0(2, gVarCreate));
        }
    }

    public static String Z(int i10) {
        Object[] objArr = {Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d)};
        int i11 = v.f20828a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static k2.x a(int i10, k2.r rVar) {
        return new k2.x(i10, rVar, new q(new k2.p[0]));
    }

    public static void a0(Context context, String str) {
        try {
            Toast.makeText(context, str, 0).show();
        } catch (Exception unused) {
        }
    }

    public static final int b(float[] fArr) {
        int i10 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i11 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i10 = 1;
        }
        return (i11 << 1) | i10;
    }

    public static k b0(b1 b1Var, String str, List list, i1 i1Var) {
        x5 x5VarK = b1Var.k();
        if (x5VarK.isTraceSampling() && kc.f.o(str, x5VarK.getTracePropagationTargets())) {
            x5 x5VarK2 = b1Var.k();
            if (i1Var != null && !i1Var.i()) {
                d6 d6VarC = i1Var.c();
                t tVarH = i1Var.h(list);
                if (x5VarK2.isPropagateTraceparent()) {
                    k6 k6VarT = i1Var.t();
                    kVar = new k(k6VarT.f12412a, k6VarT.f12413d, d6VarC.f12199c, 2);
                }
                return new k(d6VarC, tVarH, kVar, 4);
            }
            r1 r1Var = new r1((char) 0, 11);
            r1Var.f10199d = null;
            b1Var.r(new androidx.media3.exoplayer.trackselection.h(r1Var, 27, x5VarK2));
            k kVar = (k) r1Var.f10199d;
            if (kVar != null) {
                io.sentry.c cVar = (io.sentry.c) kVar.f12399r;
                n6 n6Var = (n6) kVar.f12398g;
                io.sentry.protocol.t tVar = (io.sentry.protocol.t) kVar.f12397d;
                return new k(new d6(tVar, n6Var, null), t.j(cVar, list), x5VarK2.isPropagateTraceparent() ? new k(tVar, n6Var, kVar, 2) : null, 4);
            }
        }
        return null;
    }

    public static final boolean c(c1.e eVar, long j) {
        if (!eVar.f26495b.f26506o) {
            return false;
        }
        x1.r rVar = (x1.r) x1.k.r(eVar).D.f822d;
        if (!rVar.N.f26506o) {
            return false;
        }
        long jF0 = rVar.F0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF0 & 4294967295L));
        long j7 = eVar.f3129r;
        float f10 = ((int) (j7 >> 32)) + fIntBitsToFloat;
        float f11 = ((int) (j7 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f10) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c0(View view, io.sentry.android.replay.viewhierarchy.f fVar, x5 x5Var) {
        f0 root;
        if (view instanceof ViewGroup) {
            lq.q qVar = io.sentry.android.replay.viewhierarchy.b.f12017a;
            if (tt.l.q0(view.getClass().getName(), "AndroidComposeView", false)) {
                try {
                    Owner owner = view instanceof Owner ? (Owner) view : null;
                    if (owner != null && (root = owner.getRoot()) != null) {
                        io.sentry.android.replay.viewhierarchy.b.c(root, fVar, true, x5Var);
                        return;
                    }
                } catch (Throwable th2) {
                    x5Var.getLogger().f(b5.ERROR, th2, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    io.sentry.android.replay.viewhierarchy.f fVarU = vc.e.u(childAt, fVar, x5Var);
                    arrayList.add(fVarU);
                    c0(childAt, fVarU, x5Var);
                }
            }
            fVar.f12028f = arrayList;
        }
    }

    public static final Object[] d(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        mq.l.f0(0, i10, 6, objArr, objArr2);
        mq.l.c0(i10 + 2, i10, objArr.length, objArr, objArr2);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final double d0(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final boolean e(long j) {
        return !i3.g.l(j, 9223372034707292159L);
    }

    public static vc.f e0(Context context) throws zb.e, ClassNotFoundException {
        s.h(context);
        "preferredRenderer: ".concat("null");
        vc.f fVar = f22001b;
        if (fVar != null) {
            return fVar;
        }
        AtomicBoolean atomicBoolean = zb.f.f26819a;
        int iB = zb.f.b(context, 13400000);
        if (iB != 0) {
            throw new zb.e(iB);
        }
        vc.f fVarG0 = g0(context, null);
        f22001b = fVarG0;
        try {
            Parcel parcelE = fVarG0.e(fVarG0.R(), 9);
            int i10 = parcelE.readInt();
            parcelE.recycle();
            String packageName = context.getPackageName();
            if (i10 == 2 && !packageName.equals("com.google.android.apps.photos")) {
                try {
                    vc.f fVar2 = f22001b;
                    jc.d dVar = new jc.d(f0(context, null));
                    Parcel parcelR = fVar2.R();
                    qc.l.d(parcelR, dVar);
                    fVar2.S(parcelR, 11);
                } catch (RemoteException e4) {
                    throw new bf.n(e4);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w("b", "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    f22000a = null;
                    f22001b = g0(context, uc.b.LEGACY);
                }
            }
            try {
                vc.f fVar3 = f22001b;
                jc.d dVar2 = new jc.d(f0(context, null).getResources());
                Parcel parcelR2 = fVar3.R();
                qc.l.d(parcelR2, dVar2);
                parcelR2.writeInt(19020000);
                fVar3.S(parcelR2, 6);
                return f22001b;
            } catch (RemoteException e10) {
                throw new bf.n(e10);
            }
        } catch (RemoteException e11) {
            throw new bf.n(e11);
        }
    }

    public static final Object[] f(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        mq.l.f0(0, i10, 6, objArr, objArr2);
        mq.l.c0(i10, i10 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static Context f0(Context context, uc.b bVar) throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        Context context2 = f22000a;
        if (context2 != null) {
            return context2;
        }
        String str = bVar == uc.b.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            contextCreatePackageContext = kc.e.c(context, kc.e.f14272b, str).f14284a;
        } catch (Exception unused) {
            try {
                if (str.equals("com.google.android.gms.maps_dynamite")) {
                    AtomicBoolean atomicBoolean = zb.f.f26819a;
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } else {
                    try {
                        contextCreatePackageContext = kc.e.c(context, kc.e.f14272b, "com.google.android.gms.maps_dynamite").f14284a;
                    } catch (Exception unused2) {
                        AtomicBoolean atomicBoolean2 = zb.f.f26819a;
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                contextCreatePackageContext = null;
            }
        }
        f22000a = contextCreatePackageContext;
        if (contextCreatePackageContext != null) {
            return contextCreatePackageContext;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    public static final Object[] g(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        mq.l.f0(0, i10, 6, objArr, objArr2);
        mq.l.c0(i10, i10 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static vc.f g0(Context context, uc.b bVar) throws ClassNotFoundException {
        ClassLoader classLoader = f0(context, bVar).getClassLoader();
        try {
            s.h(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                try {
                    IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                    if (iBinder == null) {
                        throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    return iInterfaceQueryLocalInterface instanceof vc.f ? (vc.f) iInterfaceQueryLocalInterface : new vc.f(iBinder, "com.google.android.gms.maps.internal.ICreator", 4);
                } catch (InstantiationException e4) {
                    throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()), e4);
                }
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()), e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e11);
        }
    }

    public static final void h(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        l.e(onDrawListener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(onDrawListener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final g0 i(x xVar) {
        l.e(xVar, "<this>");
        return new g0(xVar);
    }

    public static na.c j(Representation representation, String str, cb.i iVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri uriG = qb.b.G(str, iVar.f3570c);
        long j = iVar.f3568a;
        long j7 = iVar.f3569b;
        String cacheKey = representation.getCacheKey();
        if (cacheKey == null) {
            cacheKey = qb.b.G(((cb.b) representation.baseUrls.get(0)).f3530a, iVar.f3570c).toString();
        }
        String str2 = cacheKey;
        qb.b.l(uriG, "The uri must be set.");
        return new na.c(uriG, 1, null, map, j, j7, str2, i10);
    }

    public static void k(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void l(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int n(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final boolean o(x xVar, m0 m0Var, Set set) {
        boolean zO;
        if (l.a(xVar.Z(), m0Var)) {
            return true;
        }
        i iVarP = xVar.Z().p();
        rr.j jVar = iVarP instanceof rr.j ? (rr.j) iVarP : null;
        List listS = jVar != null ? jVar.s() : null;
        Iterable iterableV0 = o.V0(xVar.L());
        if (!(iterableV0 instanceof Collection) || !((Collection) iterableV0).isEmpty()) {
            Iterator it = iterableV0.iterator();
            do {
                a0 a0Var = (a0) it;
                if (a0Var.f16922d.hasNext()) {
                    z zVar = (z) a0Var.next();
                    int i10 = zVar.f16948a;
                    p0 p0Var = (p0) zVar.f16949b;
                    r0 r0Var = listS != null ? (r0) o.u0(i10, listS) : null;
                    if ((r0Var == null || set == null || !set.contains(r0Var)) && !p0Var.c()) {
                        x xVarB = p0Var.b();
                        l.d(xVarB, "argument.type");
                        zO = o(xVarB, m0Var, set);
                    } else {
                        zO = false;
                    }
                }
            } while (!zO);
            return true;
        }
        return false;
    }

    public static t1 p(int i10) {
        return i10 != 0 ? i10 != 1 ? new ee.k() : new ee.e() : new ee.k();
    }

    public static final g0 q(x xVar, d1 d1Var, r0 r0Var) {
        l.e(xVar, "type");
        l.e(d1Var, "projectionKind");
        if ((r0Var != null ? r0Var.N() : null) == d1Var) {
            d1Var = d1.INVARIANT;
        }
        return new g0(xVar, d1Var);
    }

    public static String r(String str) {
        StringBuilder sbS = c7.a.s(c7.a.d(c7.a.d(5, str), str), ".", str, ",.", str);
        sbS.append(" *");
        return sbS.toString();
    }

    public static int t(Context context, int i10) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return (int) ((i10 * displayMetrics.density) + 0.5f);
    }

    public static int u(Context context, int i10) {
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static io.sentry.c v(io.sentry.c cVar, Boolean bool, Double d6, Double d10) {
        if (cVar == null) {
            cVar = new io.sentry.c(m2.f12434a);
        }
        if (cVar.f12095d == null) {
            Double d11 = cVar.f12094c;
            if (d11 != null) {
                d6 = d11;
            }
            Double dC = t1.c(bool, d10, d6);
            if (cVar.f12097f) {
                cVar.f12095d = dC;
            }
        }
        if (cVar.f12097f && cVar.f12098g) {
            cVar.f12097f = false;
        }
        return cVar;
    }

    public static final void w(x xVar, b0 b0Var, LinkedHashSet linkedHashSet, Set set) {
        i iVarP = xVar.Z().p();
        if (iVarP instanceof r0) {
            if (!l.a(xVar.Z(), b0Var.Z())) {
                linkedHashSet.add(iVarP);
                return;
            }
            for (x xVar2 : ((r0) iVarP).getUpperBounds()) {
                l.d(xVar2, "upperBound");
                w(xVar2, b0Var, linkedHashSet, set);
            }
            return;
        }
        i iVarP2 = xVar.Z().p();
        rr.j jVar = iVarP2 instanceof rr.j ? (rr.j) iVarP2 : null;
        List listS = jVar != null ? jVar.s() : null;
        int i10 = 0;
        for (p0 p0Var : xVar.L()) {
            int i11 = i10 + 1;
            r0 r0Var = listS != null ? (r0) o.u0(i10, listS) : null;
            if ((r0Var == null || set == null || !set.contains(r0Var)) && !p0Var.c() && !o.k0(linkedHashSet, p0Var.b().Z().p()) && !l.a(p0Var.b().Z(), b0Var.Z())) {
                x xVarB = p0Var.b();
                l.d(xVarB, "argument.type");
                w(xVarB, b0Var, linkedHashSet, set);
            }
            i10 = i11;
        }
    }

    public static q0 x(String str) {
        if (str == null || str.length() == 0 || tt.l.D0(str)) {
            n.g("TelephonyDisplayInfoCoreResult", "Null or blank JSON");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new q0(xu.d.y("display_network_type_int", jSONObject), xu.d.y("display_override_network_type_int", jSONObject), xu.d.C("display_network_type_update_time", jSONObject));
        } catch (JSONException unused) {
            n.c("TelephonyDisplayInfoCoreResult", "Trying to parse invalid JSON: ".concat(str));
            return null;
        }
    }

    public static pq.f y(pq.f fVar, pq.g gVar) {
        l.e(gVar, "key");
        if (l.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final int z(int i10, float f10) {
        return Color.argb(dr.a.F(255 * f10), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public abstract void N(String str);

    public boolean s(b2 b2Var) {
        return true;
    }
}
