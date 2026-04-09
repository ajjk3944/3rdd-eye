package xu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.Trace;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import br.b0;
import br.x;
import bu.q;
import cc.s;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.survicate.surveys.entities.attributes.MicroSurvicateSelectionType;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h9.t;
import ht.p0;
import io.sentry.android.core.e0;
import io.sentry.c4;
import io.sentry.i1;
import ir.v;
import ir.w;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kg.r;
import ku.n0;
import lr.m1;
import lr.o1;
import lr.r1;
import mq.o;
import mq.p;
import mu.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.l2;
import rr.f0;
import ur.c0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f25536b = false;

    /* renamed from: c, reason: collision with root package name */
    public static String f25537c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f25538d = "";

    /* renamed from: e, reason: collision with root package name */
    public static int f25539e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static int f25540f;

    /* renamed from: g, reason: collision with root package name */
    public static long f25541g;

    /* renamed from: h, reason: collision with root package name */
    public static Method f25542h;

    /* renamed from: i, reason: collision with root package name */
    public static vc.b f25543i;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25544a;

    public /* synthetic */ d(int i10) {
        this.f25544a = i10;
    }

    public static final ir.d A(br.m mVar) {
        ir.e eVarF = ((m1) mVar).f();
        if (eVarF != null) {
            return B(eVarF);
        }
        throw new lq.k("Cannot calculate JVM erasure for type: " + mVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ir.d B(ir.e eVar) {
        rr.f fVar;
        if (eVar instanceof ir.d) {
            return (ir.d) eVar;
        }
        if (!(eVar instanceof w)) {
            throw new lq.k("Cannot calculate JVM erasure for type: " + eVar, 1);
        }
        r1 r1Var = ((o1) ((w) eVar)).f15660d;
        v vVar = o1.f15658r[0];
        Object objC = r1Var.c();
        br.l.d(objC, "<get-upperBounds>(...)");
        List list = (List) objC;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            br.m mVar = (br.m) next;
            br.l.c(mVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            rr.i iVarP = ((m1) mVar).f15644a.Z().p();
            fVar = iVarP instanceof rr.f ? (rr.f) iVarP : null;
            if (fVar != null && fVar.f() != rr.g.INTERFACE && fVar.f() != rr.g.ANNOTATION_CLASS) {
                fVar = next;
                break;
            }
        }
        br.m mVar2 = (br.m) fVar;
        if (mVar2 == null) {
            mVar2 = (br.m) o.t0(list);
        }
        return mVar2 != null ? A(mVar2) : x.f2918a.b(Object.class);
    }

    public static final Long C(String str, JSONObject jSONObject) {
        br.l.e(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.optLong(str));
        }
        return null;
    }

    public static final gu.a F(gu.a aVar) {
        br.l.e(aVar, "<this>");
        return aVar.getDescriptor().i() ? aVar : new n0(aVar);
    }

    public static final ht.x I(ht.x xVar) {
        br.l.e(xVar, "<this>");
        M(xVar);
        if (xVar.getAnnotations().w(or.n.f19702p) == null) {
            return null;
        }
        return ((p0) xVar.L().get(i(xVar))).b();
    }

    public static final String K(String str, JSONObject jSONObject) {
        br.l.e(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static final List L(ht.x xVar) {
        br.l.e(xVar, "<this>");
        M(xVar);
        List listL = xVar.L();
        return listL.subList(((!M(xVar) || xVar.getAnnotations().w(or.n.f19702p) == null) ? 0 : 1) + i(xVar), listL.size() - 1);
    }

    public static final boolean M(ht.x xVar) {
        br.l.e(xVar, "<this>");
        rr.i iVarP = xVar.Z().p();
        if (iVarP == null) {
            return false;
        }
        pr.g gVarW = w(iVarP);
        return gVarW == pr.g.Function || gVarW == pr.g.SuspendFunction;
    }

    public static boolean N() {
        if (Build.VERSION.SDK_INT >= 29) {
            return s7.a.a();
        }
        try {
            if (f25542h == null) {
                f25541g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f25542h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f25542h.invoke(null, Long.valueOf(f25541g))).booleanValue();
        } catch (Exception e4) {
            if (!(e4 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final boolean Q(ht.x xVar) {
        br.l.e(xVar, "<this>");
        rr.i iVarP = xVar.Z().p();
        return (iVarP != null ? w(iVarP) : null) == pr.g.SuspendFunction;
    }

    public static final boolean S(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager == null) {
            return false;
        }
        return accessibilityManager.isTouchExplorationEnabled();
    }

    public static final Bundle T(Bundle bundle, Bundle bundle2) {
        br.l.e(bundle, "<this>");
        br.l.e(bundle2, "other");
        Bundle bundle3 = new Bundle(bundle);
        bundle3.putAll(bundle2);
        return bundle3;
    }

    public static l2 U(CameraPosition cameraPosition) {
        try {
            vc.b bVar = f25543i;
            s.i(bVar, "CameraUpdateFactory is not initialized");
            Parcel parcelR = bVar.R();
            qc.l.c(parcelR, cameraPosition);
            Parcel parcelE = bVar.e(parcelR, 7);
            jc.b bVarU = jc.d.U(parcelE.readStrongBinder());
            parcelE.recycle();
            return new l2(bVarU);
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    public static l2 V(LatLng latLng, float f10) {
        s.i(latLng, "latLng must not be null");
        try {
            vc.b bVar = f25543i;
            s.i(bVar, "CameraUpdateFactory is not initialized");
            Parcel parcelR = bVar.R();
            qc.l.c(parcelR, latLng);
            parcelR.writeFloat(f10);
            Parcel parcelE = bVar.e(parcelR, 9);
            jc.b bVarU = jc.d.U(parcelE.readStrongBinder());
            parcelE.recycle();
            return new l2(bVarU);
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:62:0x0198
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final l1.a W(int r63, n0.p r64, int r65) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.d.W(int, n0.p, int):l1.a");
    }

    public static na.e X(ca.l lVar) {
        long j;
        byte[] bArr;
        lVar.getClass();
        fb.f fVar = new fb.f(16);
        if (t.b(lVar, fVar).f10477a != 1380533830) {
            return null;
        }
        lVar.p(fVar.f8800a, 0, 4);
        fVar.y(0);
        int iD = fVar.d();
        if (iD != 1463899717) {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("Unsupported RIFF format: ");
            sb2.append(iD);
            e0.d("WavHeaderReader", sb2.toString());
            return null;
        }
        t tVarB = t.b(lVar, fVar);
        while (true) {
            j = tVarB.f10478b;
            if (tVarB.f10477a == 1718449184) {
                break;
            }
            lVar.g((int) j);
            tVarB = t.b(lVar, fVar);
        }
        qb.b.j(j >= 16);
        lVar.p(fVar.f8800a, 0, 16);
        fVar.y(0);
        int i10 = fVar.i();
        int i11 = fVar.i();
        int iH = fVar.h();
        fVar.h();
        int i12 = fVar.i();
        int i13 = fVar.i();
        int i14 = ((int) j) - 16;
        if (i14 > 0) {
            bArr = new byte[i14];
            lVar.p(bArr, 0, i14);
        } else {
            bArr = qb.v.f20833f;
        }
        return new na.e(i10, i11, iH, i12, i13, bArr);
    }

    public static final void Y(JSONObject jSONObject, String str, Object obj) {
        br.l.e(jSONObject, "<this>");
        if (obj != null) {
            jSONObject.put(str, obj);
        }
    }

    public static final void Z(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (str2 == null || tt.l.D0(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    public static final void a(ju.d dVar) {
        br.l.e(dVar, "<this>");
        if ((dVar instanceof y ? (y) dVar : null) != null) {
            return;
        }
        throw new IllegalStateException(h0.b.k(x.f2918a, dVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final void a0(zr.c cVar, zr.b bVar, rr.f fVar, qs.g gVar) {
        br.l.e(cVar, "<this>");
        br.l.e(bVar, "from");
        br.l.e(fVar, "scopeOwner");
        br.l.e(gVar, "name");
        if (cVar == zr.c.f27520a) {
            return;
        }
        bVar.getLocation();
    }

    public static final void b(CardView cardView, boolean z10) {
        br.l.e(cardView, "<this>");
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = z10 ? -2 : -1;
        cardView.setLayoutParams(marginLayoutParams);
    }

    public static final void b0(zr.c cVar, zr.b bVar, f0 f0Var, qs.g gVar) {
        br.l.e(cVar, "<this>");
        br.l.e(bVar, "from");
        br.l.e(f0Var, "scopeOwner");
        br.l.e(gVar, "name");
        ((c0) f0Var).f23629y.b();
        br.l.d(gVar.b(), "name.asString()");
        if (cVar == zr.c.f27520a) {
            return;
        }
        bVar.getLocation();
    }

    public static final lu.j c(ju.c cVar) {
        br.l.e(cVar, "<this>");
        lu.j jVar = cVar instanceof lu.j ? (lu.j) cVar : null;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException(h0.b.k(x.f2918a, cVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static TypedValue c0(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean d0(Context context, int i10, boolean z10) {
        TypedValue typedValueC0 = c0(context, i10);
        return (typedValueC0 == null || typedValueC0.type != 18) ? z10 : typedValueC0.data != 0;
    }

    public static void e(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static TypedValue e0(int i10, Context context, String str) {
        TypedValue typedValueC0 = c0(context, i10);
        if (typedValueC0 != null) {
            return typedValueC0;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static final Object g0(q qVar, q qVar2, ar.n nVar) {
        Object oVar;
        Object objJ;
        try {
            b0.c(2, nVar);
            oVar = nVar.w(qVar2, qVar);
        } catch (Throwable th2) {
            oVar = new wt.o(th2, false);
        }
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        if (oVar == aVar || (objJ = qVar.J(oVar)) == wt.w.f24666e) {
            return aVar;
        }
        if (objJ instanceof wt.o) {
            throw ((wt.o) objJ).f24644a;
        }
        return wt.w.z(objJ);
    }

    public static final void h(int i10, String str) {
        if (str.charAt(i10) == '-') {
            return;
        }
        StringBuilder sbU = h0.b.u("Expected '-' (hyphen) at index ", i10, ", but was '");
        sbU.append(str.charAt(i10));
        sbU.append('\'');
        throw new IllegalArgumentException(sbU.toString().toString());
    }

    public static final JSONArray h0(List list) {
        br.l.e(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    public static final int i(ht.x xVar) {
        br.l.e(xVar, "<this>");
        sr.b bVarW = xVar.getAnnotations().w(or.n.f19703q);
        if (bVarW == null) {
            return 0;
        }
        vs.g gVar = (vs.g) mq.b0.O(bVarW.b(), or.o.f19716d);
        br.l.c(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((vs.k) gVar).f23957a).intValue();
    }

    public static final ArrayList i0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        Iterator it = vc.e.T(0, jSONArray.length()).iterator();
        while (true) {
            hr.c cVar = (hr.c) it;
            if (!cVar.f10868g) {
                return arrayList;
            }
            arrayList.add(jSONArray.getString(cVar.nextInt()));
        }
    }

    public static FileInputStream j(File file, FileInputStream fileInputStream) {
        return c4.c().k().isTracingEnabled() ? new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.b(file, fileInputStream)) : fileInputStream;
    }

    public static FileInputStream k(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
        if (!c4.c().k().isTracingEnabled()) {
            return fileInputStream;
        }
        i1 i1VarL = io.sentry.util.g.f12810a ? c4.c().l() : c4.c().h();
        return new io.sentry.instrumentation.file.e(new r(null, i1VarL != null ? i1VarL.q("file.read") : null, fileInputStream, c4.c().k()), fileDescriptor);
    }

    public static com.google.android.gms.internal.measurement.n k0(com.google.android.gms.internal.measurement.d dVar, r rVar, ArrayList arrayList, boolean z10) {
        com.google.android.gms.internal.measurement.n nVarF;
        a.a.J("reduce", 1, arrayList);
        a.a.K("reduce", 2, arrayList);
        com.google.android.gms.internal.measurement.n nVarC = ((com.google.android.gms.internal.measurement.t) rVar.f14396d).c(rVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
        if (!(nVarC instanceof com.google.android.gms.internal.measurement.h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            nVarF = ((com.google.android.gms.internal.measurement.t) rVar.f14396d).c(rVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
            if (nVarF instanceof com.google.android.gms.internal.measurement.f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (dVar.p() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            nVarF = null;
        }
        com.google.android.gms.internal.measurement.h hVar = (com.google.android.gms.internal.measurement.h) nVarC;
        int iP = dVar.p();
        int i10 = z10 ? 0 : iP - 1;
        int i11 = z10 ? iP - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (nVarF == null) {
            nVarF = dVar.r(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (dVar.t(i10)) {
                nVarF = hVar.f(rVar, Arrays.asList(nVarF, dVar.r(i10), new com.google.android.gms.internal.measurement.g(Double.valueOf(i10)), dVar));
                if (nVarF instanceof com.google.android.gms.internal.measurement.f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return nVarF;
    }

    public static Drawable l(Context context, MicroColorScheme microColorScheme, MicroSurvicateSelectionType microSurvicateSelectionType) {
        br.l.e(microColorScheme, "colorScheme");
        br.l.e(microSurvicateSelectionType, "selectionType");
        Drawable drawable = context.getDrawable(microSurvicateSelectionType.getDrawableRes());
        if (drawable == null) {
            return null;
        }
        drawable.setColorFilter(l.l(microColorScheme.getAnswer(), k3.a.SRC_ATOP));
        return drawable;
    }

    public static com.google.android.gms.internal.measurement.d l0(com.google.android.gms.internal.measurement.d dVar, r rVar, com.google.android.gms.internal.measurement.m mVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.d dVar2 = new com.google.android.gms.internal.measurement.d();
        Iterator itO = dVar.o();
        while (itO.hasNext()) {
            int iIntValue = ((Integer) itO.next()).intValue();
            if (dVar.t(iIntValue)) {
                com.google.android.gms.internal.measurement.n nVarF = mVar.f(rVar, Arrays.asList(dVar.r(iIntValue), new com.google.android.gms.internal.measurement.g(Double.valueOf(iIntValue)), dVar));
                if (nVarF.a().equals(bool)) {
                    break;
                }
                if (bool2 == null || nVarF.a().equals(bool2)) {
                    dVar2.s(iIntValue, nVarF);
                }
            }
        }
        return dVar2;
    }

    public static final ht.b0 m(or.h hVar, sr.h hVar2, ht.x xVar, List list, ArrayList arrayList, ht.x xVar2, boolean z10) {
        rr.f fVarJ;
        int i10 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (xVar != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(se.b.i((ht.x) it.next()));
        }
        arrayList2.addAll(arrayList3);
        rt.k.a(arrayList2, xVar != null ? se.b.i(xVar) : null);
        Iterator it2 = arrayList.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                e5.Q();
                throw null;
            }
            arrayList2.add(se.b.i((ht.x) next));
            i11 = i12;
        }
        arrayList2.add(se.b.i(xVar2));
        int size = list.size() + arrayList.size() + (xVar == null ? 0 : 1);
        if (z10) {
            fVarJ = hVar.v(size);
        } else {
            qs.g gVar = or.o.f19713a;
            fVarJ = hVar.j("Function" + size);
        }
        br.l.d(fVarJ, "if (isSuspendFunction) b…tFunction(parameterCount)");
        sr.h iVar = sr.g.f22217a;
        if (xVar != null) {
            qs.c cVar = or.n.f19702p;
            if (!hVar2.G(cVar)) {
                ArrayList arrayListD0 = o.D0(hVar2, new sr.j(hVar, cVar, mq.x.f16946a));
                hVar2 = arrayListD0.isEmpty() ? iVar : new sr.i(i10, arrayListD0);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            qs.c cVar2 = or.n.f19703q;
            if (!hVar2.G(cVar2)) {
                ArrayList arrayListD02 = o.D0(hVar2, new sr.j(hVar, cVar2, mq.b0.Q(new lq.l(or.o.f19716d, new vs.k(size2)))));
                if (!arrayListD02.isEmpty()) {
                    iVar = new sr.i(i10, arrayListD02);
                }
                hVar2 = iVar;
            }
        }
        return ht.e.q(ht.c.w(hVar2), fVarJ, arrayList2);
    }

    public static RippleDrawable n(MicroColorScheme microColorScheme) {
        br.l.e(microColorScheme, "colorScheme");
        int iZ = se.b.z(microColorScheme.getAnswer(), MicroColorControlOpacity.Pressed.getOpacityValue());
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iZ);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColorFilter(l.l(iZ, k3.a.SRC_ATOP));
        return new RippleDrawable(colorStateListValueOf, null, gradientDrawable);
    }

    public static final qs.g o(ht.x xVar) {
        String str;
        sr.b bVarW = xVar.getAnnotations().w(or.n.f19704r);
        if (bVarW != null) {
            Object objJ0 = o.J0(bVarW.b().values());
            vs.y yVar = objJ0 instanceof vs.y ? (vs.y) objJ0 : null;
            if (yVar != null && (str = (String) yVar.f23957a) != null) {
                if (!qs.g.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return qs.g.e(str);
                }
            }
        }
        return null;
    }

    public static final hq.c p(List list) {
        Object next;
        br.l.e(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (br.l.a(((hq.c) next).key, hq.c.USER_ID)) {
                break;
            }
        }
        return (hq.c) next;
    }

    public static final void q(long j, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = tt.d.f22988a[(int) ((j >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            bArr[i10] = (byte) (i15 >> 8);
            i10 += 2;
            bArr[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static final Boolean r(String str, JSONObject jSONObject) {
        br.l.e(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.optBoolean(str));
        }
        return null;
    }

    public static final List s(ht.x xVar) {
        br.l.e(xVar, "<this>");
        M(xVar);
        int i10 = i(xVar);
        if (i10 == 0) {
            return mq.w.f16945a;
        }
        List listSubList = xVar.L().subList(0, i10);
        ArrayList arrayList = new ArrayList(p.a0(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            ht.x xVarB = ((p0) it.next()).b();
            br.l.d(xVarB, "it.type");
            arrayList.add(xVarB);
        }
        return arrayList;
    }

    public static final Double t(String str, JSONObject jSONObject) {
        br.l.e(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return Double.valueOf(jSONObject.optDouble(str));
        }
        return null;
    }

    public static final Float v(String str, JSONObject jSONObject) throws JSONException {
        br.l.e(jSONObject, "<this>");
        if (!jSONObject.has(str)) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Double) {
            return Float.valueOf((float) ((Number) obj).doubleValue());
        }
        if (obj instanceof Integer) {
            return Float.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof BigDecimal) {
            return Float.valueOf(((BigDecimal) obj).floatValue());
        }
        return null;
    }

    public static final pr.g w(rr.i iVar) {
        if (!(iVar instanceof rr.f) || !or.h.I(iVar)) {
            return null;
        }
        qs.e eVarH = xs.d.h(iVar);
        if (!eVarH.d() || eVarH.f21030a.isEmpty()) {
            return null;
        }
        pr.f fVar = pr.g.Companion;
        String strB = eVarH.f().b();
        br.l.d(strB, "shortName().asString()");
        qs.c cVarE = eVarH.g().e();
        fVar.getClass();
        pr.e eVarA = pr.f.a(strB, cVarE);
        if (eVarA != null) {
            return eVarA.f20628a;
        }
        return null;
    }

    public static final Integer y(String str, JSONObject jSONObject) {
        br.l.e(jSONObject, "<this>");
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.optInt(str));
        }
        return null;
    }

    public static final List z(JSONObject jSONObject) {
        br.l.e(jSONObject, "<this>");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("solutions");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = vc.e.T(0, jSONArrayOptJSONArray.length()).iterator();
            while (((hr.c) it).f10868g) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(((hr.c) it).nextInt())));
            }
            return arrayList;
        } catch (JSONException unused) {
            return mq.w.f16945a;
        }
    }

    public abstract int D();

    public abstract int E();

    public abstract int G(View view);

    public abstract int H(CoordinatorLayout coordinatorLayout);

    public abstract int J();

    public abstract boolean O(float f10);

    public abstract boolean P(View view);

    public abstract boolean R(float f10, float f11);

    public abstract String d();

    public abstract int f(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract boolean f0(View view, float f10);

    public abstract float g(int i10);

    public abstract void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11);

    public String toString() {
        switch (this.f25544a) {
            case 18:
                return d();
            default:
                return super.toString();
        }
    }

    public abstract int u();

    public abstract int x();
}
