package A9;

import H6.C0673j;
import H6.C0675l;
import K6.C0713c;
import N7.C1154e9;
import N7.C1175g0;
import Q9.AbstractC1520b;
import a7.C1666c;
import a7.EnumC1667d;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.TransactionTooLargeException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.cardview.widget.CardView;
import b7.C1902i;
import b7.C1933o0;
import b9.C1992A;
import c9.C2097r;
import c9.C2099t;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import f9.InterfaceC4347e;
import g0.C4356c;
import h3.C4412a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k6.C5246y;
import k7.C5248a;
import kotlin.KotlinVersion;
import l0.C5264b;
import l0.C5265c;
import l0.InterfaceC5263a;
import org.json.JSONArray;
import org.json.JSONObject;
import t4.C5606d;
import w9.InterfaceC5748c;

/* compiled from: DebugStrings.kt */
/* loaded from: classes3.dex */
public final class I implements L2.d, W4.a {

    /* renamed from: b, reason: collision with root package name */
    public static UiModeManager f190b;

    public static final void A(View view, D1.e eVar) {
        kotlin.jvm.internal.l.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, eVar);
    }

    public static final void C(String functionName, String str, List list) {
        kotlin.jvm.internal.l.f(functionName, "functionName");
        C1902i.i("dict", functionName, list, str, false);
        throw null;
    }

    public static final void D(List list, boolean z10, String functionName, String message) {
        kotlin.jvm.internal.l.f(functionName, "functionName");
        kotlin.jvm.internal.l.f(message, "message");
        String str = z10 ? "" : "<dict>, ";
        C1666c.c(C2097r.u0(list.subList(1, list.size()), null, functionName + '(' + str, ")", C1933o0.f17913g, 25), message, null);
        throw null;
    }

    public static final void E(String functionName, List list, EnumC1667d expected, Object obj, boolean z10) {
        kotlin.jvm.internal.l.f(functionName, "functionName");
        kotlin.jvm.internal.l.f(expected, "expected");
        D(list, z10, functionName, "Incorrect value type: expected " + expected.getTypeName$div_evaluable() + ", got " + (!obj.equals(JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.');
        throw null;
    }

    public static final String F(InterfaceC4347e interfaceC4347e) {
        Object objA;
        if (interfaceC4347e instanceof F9.i) {
            return interfaceC4347e.toString();
        }
        try {
            objA = interfaceC4347e + '@' + x(interfaceC4347e);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) != null) {
            objA = interfaceC4347e.getClass().getName() + '@' + x(interfaceC4347e);
        }
        return (String) objA;
    }

    public static final String G(byte b10) {
        char[] cArr = ja.b.f43144a;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }

    public static final String H(int i) {
        int i10 = 0;
        if (i == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        char[] cArr = ja.b.f43144a;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i10 < 8 && cArr2[i10] == '0') {
            i10++;
        }
        return y9.n.S(cArr2, i10, 8);
    }

    public static final void a(View view, A7.b bVar, T6.b bVar2, A7.d dVar) {
        if (((Boolean) bVar.a(dVar)).booleanValue()) {
            C0713c.y(view, bVar2);
            view.requestFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(View view, List list, A7.d dVar, p9.l lVar) {
        if ((view instanceof i7.k) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((i7.k) view).b(((C1175g0) it.next()).f8254b.d(dVar, lVar));
            }
        }
    }

    public static final List e(List list, A7.d dVar) {
        if (list == null) {
            return C2099t.f18581b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C1175g0) obj).f8254b.a(dVar).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean g(byte[] a10, int i, byte[] b10, int i10, int i11) {
        kotlin.jvm.internal.l.f(a10, "a");
        kotlin.jvm.internal.l.f(b10, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a10[i12 + i] != b10[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final Object h(Collection collection, h9.i iVar) {
        return collection.isEmpty() ? C2099t.f18581b : new C0569c((L[]) collection.toArray(new L[0])).a(iVar);
    }

    public static final Object i(L[] lArr, h9.i iVar) {
        return lArr.length == 0 ? C2099t.f18581b : new C0569c(lArr).a(iVar);
    }

    public static final boolean j(Throwable th) {
        Throwable cause;
        return (th instanceof TransactionTooLargeException) || ((cause = th.getCause()) != null && j(cause));
    }

    public static final void k(C5248a c5248a, C0675l divView) {
        kotlin.jvm.internal.l.f(c5248a, "<this>");
        kotlin.jvm.internal.l.f(divView, "divView");
        if (c5248a.equals(C5248a.f43427c)) {
            C5246y.d(divView, new IllegalStateException("Colors for linear gradient are not provided. Please check if 'colors' or 'color_map' properties are defined"));
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void m(long j4, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j4 || j4 - j10 < j11) {
            StringBuilder sbJ = androidx.work.s.j("size=", " offset=", j4);
            sbJ.append(j10);
            sbJ.append(" byteCount=");
            sbJ.append(j11);
            throw new ArrayIndexOutOfBoundsException(sbJ.toString());
        }
    }

    public static final void n(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C4356c.h(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final void o(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                b9.x.a(th, th2);
            }
        }
    }

    public static final C0673j p(C0675l scope, String actionLogId) {
        kotlin.jvm.internal.l.f(scope, "scope");
        kotlin.jvm.internal.l.f(actionLogId, "actionLogId");
        return new C0673j(scope.getDataTag().f38455a, scope.getLogId(), actionLogId);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Bundle q(com.applovin.mediation.MaxAd r13) {
        /*
            r0 = 1
            r1 = 0
            r2 = 3
            r3 = 2
            double r4 = r13.getRevenue()
            java.lang.String r6 = r13.getNetworkName()
            java.lang.String r7 = r13.getAdUnitId()
            r8 = 1000000(0xf4240, float:1.401298E-39)
            double r8 = (double) r8
            double r8 = r8 * r4
            long r8 = (long) r8
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            b9.l r9 = new b9.l
            java.lang.String r10 = "valuemicros"
            r9.<init>(r10, r8)
            float r4 = (float) r4
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            b9.l r5 = new b9.l
            java.lang.String r8 = "value"
            r5.<init>(r8, r4)
            b9.l r4 = new b9.l
            java.lang.String r8 = "currency"
            java.lang.String r10 = "USD"
            r4.<init>(r8, r10)
            java.lang.String r8 = r13.getRevenuePrecision()
            java.lang.String r10 = "getRevenuePrecision(...)"
            kotlin.jvm.internal.l.e(r8, r10)
            int r10 = r8.hashCode()
            r11 = -623607748(0xffffffffdad4803c, float:-2.9906845E16)
            if (r10 == r11) goto L69
            r11 = 96946943(0x5c74aff, float:1.8741419E-35)
            if (r10 == r11) goto L5e
            r11 = 655944390(0x2718eac6, float:2.1221508E-15)
            if (r10 == r11) goto L53
            goto L71
        L53:
            java.lang.String r10 = "publisher_defined"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L5c
            goto L71
        L5c:
            r8 = r3
            goto L74
        L5e:
            java.lang.String r10 = "exact"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L67
            goto L71
        L67:
            r8 = r2
            goto L74
        L69:
            java.lang.String r10 = "estimated"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L73
        L71:
            r8 = r1
            goto L74
        L73:
            r8 = r0
        L74:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            b9.l r10 = new b9.l
            java.lang.String r11 = "precision"
            r10.<init>(r11, r8)
            b9.l r8 = new b9.l
            java.lang.String r11 = "adunitid"
            r8.<init>(r11, r7)
            b9.l r7 = new b9.l
            java.lang.String r11 = "mediation"
            java.lang.String r12 = "applovin"
            r7.<init>(r11, r12)
            com.applovin.mediation.MaxAdFormat r13 = r13.getFormat()
            java.lang.String r13 = r13.getLabel()
            b9.l r11 = new b9.l
            java.lang.String r12 = "ad_format"
            r11.<init>(r12, r13)
            if (r6 != 0) goto La2
            java.lang.String r6 = "unknown"
        La2:
            b9.l r13 = new b9.l
            java.lang.String r12 = "network"
            r13.<init>(r12, r6)
            r6 = 8
            b9.l[] r6 = new b9.l[r6]
            r6[r1] = r9
            r6[r0] = r5
            r6[r3] = r4
            r6[r2] = r10
            r0 = 4
            r6[r0] = r8
            r0 = 5
            r6[r0] = r7
            r0 = 6
            r6[r0] = r11
            r0 = 7
            r6[r0] = r13
            android.os.Bundle r13 = G0.d.a(r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.I.q(com.applovin.mediation.MaxAd):android.os.Bundle");
    }

    public static final Object r(String functionName, List list, boolean z10) {
        Object objA;
        Object objA2;
        kotlin.jvm.internal.l.f(functionName, "functionName");
        JSONObject jSONObject = (JSONObject) C2097r.p0(list);
        int size = list.size() - 1;
        for (int i = 1; i < size; i++) {
            Object obj = list.get(i);
            kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            try {
                kotlin.jvm.internal.l.c(jSONObject);
                Object objOpt = jSONObject.opt(str);
                jSONObject = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                objA2 = C1992A.f18074a;
            } catch (Throwable th) {
                objA2 = b9.n.a(th);
            }
            if (b9.m.a(objA2) != null) {
                D(list, z10, functionName, C1154e9.i("Missing property \"", str, "\" in the dict."));
                throw null;
            }
        }
        Object objV0 = C2097r.v0(list);
        kotlin.jvm.internal.l.d(objV0, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) objV0;
        try {
            kotlin.jvm.internal.l.c(jSONObject);
            objA = jSONObject.get(str2);
        } catch (Throwable th2) {
            objA = b9.n.a(th2);
        }
        if (b9.m.a(objA) == null) {
            kotlin.jvm.internal.l.e(objA, "runCatching { dict!!.get…propName, isMethod)\n    }");
            return objA;
        }
        D(list, z10, functionName, C1154e9.i("Missing property \"", str2, "\" in the dict."));
        throw null;
    }

    public static final Object s(List list, Object obj, boolean z10) {
        int i = !z10 ? 1 : 0;
        Object obj2 = list.get(i);
        JSONObject jSONObjectOptJSONObject = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
        if (jSONObjectOptJSONObject != null) {
            int size = list.size() - 1;
            for (int i10 = i + 1; i10 < size; i10++) {
                Object obj3 = list.get(i10);
                kotlin.jvm.internal.l.d(obj3, "null cannot be cast to non-null type kotlin.String");
                jSONObjectOptJSONObject = jSONObjectOptJSONObject.optJSONObject((String) obj3);
                if (jSONObjectOptJSONObject != null) {
                }
            }
            Object objV0 = C2097r.v0(list);
            kotlin.jvm.internal.l.d(objV0, "null cannot be cast to non-null type kotlin.String");
            return jSONObjectOptJSONObject.opt((String) objV0);
        }
        return obj;
    }

    public static final M9.b t(AbstractC1520b abstractC1520b, P9.e eVar, Object value) {
        kotlin.jvm.internal.l.f(abstractC1520b, "<this>");
        kotlin.jvm.internal.l.f(value, "value");
        M9.b bVarU = eVar.a().U(abstractC1520b.a(), value);
        if (bVarU != null) {
            return bVarU;
        }
        kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.x.a(value.getClass());
        InterfaceC5748c baseClass = abstractC1520b.a();
        kotlin.jvm.internal.l.f(baseClass, "baseClass");
        String strD = eVarA.d();
        if (strD == null) {
            strD = String.valueOf(eVarA);
        }
        C5606d.F(strD, baseClass);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:285:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0558  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.camera.core.impl.C0 u(w.C5698l r14) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.I.u(w.l):androidx.camera.core.impl.C0");
    }

    public static C5264b v(InterfaceC5263a interfaceC5263a) {
        return (C5264b) ((CardView.a) interfaceC5263a).f15193a;
    }

    public static Drawable w(Context context, int i) {
        return o.N.d().g(context, i);
    }

    public static final String x(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final boolean y(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Object tag = viewGroup.getTag(R.id.div_penetrating_longtap_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        return (bool != null ? bool.booleanValue() : false) || y(viewGroup);
    }

    public static final int z(int i) {
        return ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public void B(InterfaceC5263a interfaceC5263a, float f10) {
        C5264b c5264bV = v(interfaceC5263a);
        CardView.a aVar = (CardView.a) interfaceC5263a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        CardView cardView = CardView.this;
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f10 != c5264bV.f43668e || c5264bV.f43669f != useCompatPadding || c5264bV.f43670g != preventCornerOverlap) {
            c5264bV.f43668e = f10;
            c5264bV.f43669f = useCompatPadding;
            c5264bV.f43670g = preventCornerOverlap;
            c5264bV.b(null);
            c5264bV.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        float f11 = v(interfaceC5263a).f43668e;
        float f12 = v(interfaceC5263a).f43664a;
        int iCeil = (int) Math.ceil(C5265c.a(f11, f12, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(C5265c.b(f11, f12, cardView.getPreventCornerOverlap()));
        aVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // W4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] c(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r3
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r2
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r3, r0, r3, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.I.c(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // L2.d
    public boolean f(Object obj, File file, L2.h hVar) throws Throwable {
        try {
            C4412a.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e4) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e4);
            return false;
        }
    }
}
