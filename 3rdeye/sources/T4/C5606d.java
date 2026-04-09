package t4;

import C.C0616c;
import C.S;
import E.u;
import F9.C0658a;
import H6.I;
import L0.O;
import N7.C1094a9;
import O6.A;
import O6.B;
import O6.C;
import O6.C1482h;
import O6.C1483i;
import O6.D;
import O6.E;
import O6.q;
import O6.r;
import O6.t;
import O6.v;
import O6.w;
import O6.x;
import O6.y;
import O9.k;
import Q9.AbstractC1520b;
import Q9.M;
import R9.AbstractC1564a;
import R9.z;
import S9.C1582n;
import android.content.Context;
import android.graphics.Point;
import android.media.ImageReader;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.work.s;
import b9.C1992A;
import b9.n;
import c.InterfaceC2018p;
import c9.C2092m;
import c9.C2097r;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import d7.C4279b;
import f9.InterfaceC4347e;
import g0.C4356c;
import io.appmetrica.analytics.impl.Oo;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import p9.InterfaceC5480a;
import p9.p;
import w9.InterfaceC5748c;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: t4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5606d implements H3.a, Z2.b, InterfaceC2018p, com.google.gson.internal.g {

    /* renamed from: c, reason: collision with root package name */
    public static I f46403c;

    /* renamed from: d, reason: collision with root package name */
    public static C5606d f46404d;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46405b;

    public /* synthetic */ C5606d(int i) {
        this.f46405b = i;
    }

    public static final void A(HashMap map, Object obj, String value) {
        l.f(value, "value");
        if (value.length() > 0) {
            map.put(obj, value);
        }
    }

    public static final void B(Context context, e8.d permissionRequester, InterfaceC5480a interfaceC5480a) {
        l.f(permissionRequester, "permissionRequester");
        permissionRequester.f37771e = new I2.g(0, interfaceC5480a);
        permissionRequester.f37772f = new A2.f(1);
        permissionRequester.f37773g = new A8.i(1, context, permissionRequester);
        permissionRequester.f37774h = new I2.h(context);
        permissionRequester.b();
    }

    public static long C(int i, long j4) {
        long j10 = i;
        A2.l.k("bytesPerFrame must be greater than 0.", j10 > 0);
        return j4 / j10;
    }

    public static void D(p pVar, Object obj, InterfaceC4347e interfaceC4347e) {
        try {
            C0658a.a(com.google.gson.internal.c.r(com.google.gson.internal.c.k(pVar, obj, interfaceC4347e)), C1992A.f18074a);
        } catch (Throwable th) {
            interfaceC4347e.resumeWith(n.a(th));
            throw th;
        }
    }

    public static int E(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(C4356c.h(i, "Unsupported surface rotation: "));
    }

    public static final void F(String str, InterfaceC5748c baseClass) {
        String strC;
        l.f(baseClass, "baseClass");
        String str2 = "in the scope of '" + baseClass.d() + '\'';
        if (str == null) {
            strC = s.d("Class discriminator was missing and no default polymorphic serializers were registered ", str2);
        } else {
            StringBuilder sbD = j6.l.d("Class '", str, "' is not registered for polymorphic serialization ", str2, ".\nTo be registered automatically, class '");
            sbD.append(str);
            sbD.append("' has to be '@Serializable', and the base class '");
            sbD.append(baseClass.d());
            sbD.append("' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '");
            strC = B4.f.c(sbD, str, "' explicitly in a corresponding SerializersModule.");
        }
        throw new M9.i(strC);
    }

    public static final Calendar G(C4279b c4279b) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(c4279b.f37529c);
        calendar.setTimeInMillis(c4279b.f37528b);
        return calendar;
    }

    public static final Date H(C4279b c4279b) {
        return new Date(c4279b.f37528b - c4279b.f37529c.getRawOffset());
    }

    public static final void I(I9.g gVar, View view) {
        l.f(gVar, "<this>");
        l.f(view, "view");
        if (view instanceof E) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    gVar.N((E) view);
                    return;
                }
                int i10 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                I(gVar, childAt);
                i = i10;
            }
        } else if (view instanceof C1483i) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            int i11 = 0;
            while (true) {
                if (!(i11 < viewGroup2.getChildCount())) {
                    gVar.N((C1483i) view);
                    return;
                }
                int i12 = i11 + 1;
                View childAt2 = viewGroup2.getChildAt(i11);
                if (childAt2 == null) {
                    throw new IndexOutOfBoundsException();
                }
                I(gVar, childAt2);
                i11 = i12;
            }
        } else if (view instanceof O6.k) {
            ViewGroup viewGroup3 = (ViewGroup) view;
            int i13 = 0;
            while (true) {
                if (!(i13 < viewGroup3.getChildCount())) {
                    gVar.N((O6.k) view);
                    return;
                }
                int i14 = i13 + 1;
                View childAt3 = viewGroup3.getChildAt(i13);
                if (childAt3 == null) {
                    throw new IndexOutOfBoundsException();
                }
                I(gVar, childAt3);
                i13 = i14;
            }
        } else if (view instanceof r) {
            ViewGroup viewGroup4 = (ViewGroup) view;
            int i15 = 0;
            while (true) {
                if (!(i15 < viewGroup4.getChildCount())) {
                    gVar.N((r) view);
                    return;
                }
                int i16 = i15 + 1;
                View childAt4 = viewGroup4.getChildAt(i15);
                if (childAt4 == null) {
                    throw new IndexOutOfBoundsException();
                }
                I(gVar, childAt4);
                i15 = i16;
            }
        } else if (view instanceof t) {
            ViewGroup viewGroup5 = (ViewGroup) view;
            int i17 = 0;
            while (true) {
                if (!(i17 < viewGroup5.getChildCount())) {
                    gVar.e0((t) view);
                    return;
                }
                int i18 = i17 + 1;
                View childAt5 = viewGroup5.getChildAt(i17);
                if (childAt5 == null) {
                    throw new IndexOutOfBoundsException();
                }
                I(gVar, childAt5);
                i17 = i18;
            }
        } else if (view instanceof v) {
            ViewGroup viewGroup6 = (ViewGroup) view;
            int i19 = 0;
            while (true) {
                if (!(i19 < viewGroup6.getChildCount())) {
                    gVar.f0((v) view);
                    return;
                }
                int i20 = i19 + 1;
                View childAt6 = viewGroup6.getChildAt(i19);
                if (childAt6 == null) {
                    throw new IndexOutOfBoundsException();
                }
                I(gVar, childAt6);
                i19 = i20;
            }
        } else if (view instanceof A) {
            ViewGroup viewGroup7 = (ViewGroup) view;
            int i21 = 0;
            while (true) {
                if (!(i21 < viewGroup7.getChildCount())) {
                    gVar.N((A) view);
                    return;
                }
                int i22 = i21 + 1;
                View childAt7 = viewGroup7.getChildAt(i21);
                if (childAt7 == null) {
                    throw new IndexOutOfBoundsException();
                }
                I(gVar, childAt7);
                i21 = i22;
            }
        } else if (view instanceof C) {
            ViewGroup viewGroup8 = (ViewGroup) view;
            int i23 = 0;
            while (true) {
                if (!(i23 < viewGroup8.getChildCount())) {
                    gVar.N((C) view);
                    return;
                }
                int i24 = i23 + 1;
                View childAt8 = viewGroup8.getChildAt(i23);
                if (childAt8 == null) {
                    throw new IndexOutOfBoundsException();
                }
                I(gVar, childAt8);
                i23 = i24;
            }
        } else {
            if (!(view instanceof C1482h)) {
                if (view instanceof x) {
                    gVar.N((x) view);
                    return;
                }
                if (view instanceof O6.j) {
                    gVar.N((O6.j) view);
                    return;
                }
                if (view instanceof O6.n) {
                    gVar.N((O6.n) view);
                    return;
                }
                if (view instanceof q) {
                    gVar.N((q) view);
                    return;
                }
                if (view instanceof O6.s) {
                    gVar.N((O6.s) view);
                    return;
                }
                if (view instanceof y) {
                    gVar.N((y) view);
                    return;
                }
                if (view instanceof w) {
                    gVar.N((w) view);
                    return;
                }
                if (view instanceof D) {
                    gVar.g0((D) view);
                    return;
                }
                if (view instanceof B) {
                    gVar.N((B) view);
                    return;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup9 = (ViewGroup) view;
                    int i25 = 0;
                    while (true) {
                        if (!(i25 < viewGroup9.getChildCount())) {
                            break;
                        }
                        int i26 = i25 + 1;
                        View childAt9 = viewGroup9.getChildAt(i25);
                        if (childAt9 == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        I(gVar, childAt9);
                        i25 = i26;
                    }
                }
                gVar.h0(view);
                return;
            }
            ViewGroup viewGroup10 = (ViewGroup) view;
            int i27 = 0;
            while (true) {
                if (!(i27 < viewGroup10.getChildCount())) {
                    gVar.d0((C1482h) view);
                    return;
                }
                int i28 = i27 + 1;
                View childAt10 = viewGroup10.getChildAt(i27);
                if (childAt10 == null) {
                    throw new IndexOutOfBoundsException();
                }
                I(gVar, childAt10);
                i27 = i28;
            }
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final void f(X9.a aVar, X9.c cVar, String str) {
        X9.d.i.fine(cVar.f13674b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f13668a);
    }

    public static final void g(View view) {
        l.f(view, "<this>");
        O o10 = new O(view, null);
        x9.h hVar = new x9.h();
        hVar.f47845e = com.google.gson.internal.c.k(o10, hVar, hVar);
        while (hVar.hasNext()) {
            View view2 = (View) hVar.next();
            T0.b bVar = (T0.b) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (bVar == null) {
                bVar = new T0.b();
                view2.setTag(R.id.pooling_container_listener_holder_tag, bVar);
            }
            ArrayList<T0.a> arrayList = bVar.f12117a;
            for (int iV = C2092m.V(arrayList); -1 < iV; iV--) {
                arrayList.get(iV).a();
            }
        }
    }

    public static final byte h(char c10) {
        if (c10 < '~') {
            return C1582n.f12095b[c10];
        }
        return (byte) 0;
    }

    public static void i(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final void j(O9.k kind) {
        l.f(kind, "kind");
        if (kind instanceof k.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof O9.d) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof O9.c) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static void k(Object obj) {
        l(obj, "Argument must not be null");
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final String m(O9.e eVar, AbstractC1564a json) {
        l.f(eVar, "<this>");
        l.f(json, "json");
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof R9.f) {
                return ((R9.f) annotation).discriminator();
            }
        }
        return json.f11781a.f11804f;
    }

    public static final int o(E1.c cVar, String str) {
        l.f(cVar, "<this>");
        int iP = p(cVar, str);
        if (iP >= 0) {
            return iP;
        }
        int iP2 = p(cVar, "`" + str + '`');
        if (iP2 >= 0) {
            return iP2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = cVar.getColumnCount();
        String strConcat = ".".concat(str);
        String strE = s.e(".", str, '`');
        for (int i = 0; i < columnCount; i++) {
            String columnName = cVar.getColumnName(i);
            if (columnName.length() >= str.length() + 2 && (y9.n.T(columnName, strConcat) || (columnName.charAt(0) == '`' && y9.n.T(columnName, strE)))) {
                return i;
            }
        }
        return -1;
    }

    public static final int p(E1.c cVar, String name) {
        l.f(cVar, "<this>");
        l.f(name, "name");
        if (cVar instanceof C1.d) {
            throw null;
        }
        int columnCount = cVar.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (name.equals(cVar.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static C0616c q(int i, int i10, int i11, int i12) {
        return new C0616c(ImageReader.newInstance(i, i10, i11, i12));
    }

    public static final Object r(R9.h hVar, M9.b deserializer) {
        l.f(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC1520b)) {
            return deserializer.deserialize(hVar);
        }
        R9.g gVar = hVar.c().f11781a;
        String discriminator = m(deserializer.getDescriptor(), hVar.c());
        R9.i iVarJ = hVar.j();
        O9.e descriptor = deserializer.getDescriptor();
        if (!(iVarJ instanceof z)) {
            throw u.h(-1, "Expected " + kotlin.jvm.internal.x.a(z.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.x.a(iVarJ.getClass()));
        }
        z zVar = (z) iVarJ;
        R9.i iVar = (R9.i) zVar.get(discriminator);
        String strC = null;
        if (iVar != null) {
            M m10 = R9.j.f11806a;
            R9.C c10 = iVar instanceof R9.C ? (R9.C) iVar : null;
            if (c10 == null) {
                R9.j.c(iVar, "JsonPrimitive");
                throw null;
            }
            strC = c10.c();
        }
        M9.b bVarT = hVar.a().T(strC, ((AbstractC1520b) deserializer).a());
        if (bVarT == null) {
            throw u.i(-1, s.d("Polymorphic serializer was not found for ", strC == null ? "missing class discriminator ('null')" : s.e("class discriminator '", strC, '\'')), zVar.toString());
        }
        AbstractC1564a abstractC1564aC = hVar.c();
        l.f(abstractC1564aC, "<this>");
        l.f(discriminator, "discriminator");
        return r(new S9.E(abstractC1564aC, zVar, discriminator, bVarT.getDescriptor()), bVarT);
    }

    public static float s(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public static final String t(long j4) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j4 <= -999500000 ? C1094a9.f(new StringBuilder(), (j4 - 500000000) / 1000000000, " s ") : j4 <= -999500 ? C1094a9.f(new StringBuilder(), (j4 - 500000) / 1000000, " ms") : j4 <= 0 ? C1094a9.f(new StringBuilder(), (j4 - 500) / 1000, " µs") : j4 < 999500 ? C1094a9.f(new StringBuilder(), (j4 + 500) / 1000, " µs") : j4 < 999500000 ? C1094a9.f(new StringBuilder(), (j4 + 500000) / 1000000, " ms") : C1094a9.f(new StringBuilder(), (j4 + 500000000) / 1000000000, " s ")}, 1));
    }

    public static long u(int i, long j4) {
        long j10 = i;
        A2.l.k("sampleRate must be greater than 0.", j10 > 0);
        return (TimeUnit.SECONDS.toNanos(1L) * j4) / j10;
    }

    public static final int v(E1.c stmt, String str) {
        l.f(stmt, "stmt");
        int iO = o(stmt, str);
        if (iO >= 0) {
            return iO;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(stmt.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + C2097r.u0(arrayList, null, null, null, null, 63) + ']');
    }

    public static int w(int i, int i10, boolean z10) {
        int i11 = z10 ? ((i10 - i) + 360) % 360 : (i10 + i) % 360;
        if (S.e(2, S.f("CameraOrientationUtil"))) {
            StringBuilder sbI = s.i("getRelativeImageRotation: destRotationDegrees=", i, ", sourceRotationDegrees=", i10, ", isOppositeFacing=");
            sbI.append(z10);
            sbI.append(", result=");
            sbI.append(i11);
            S.a("CameraOrientationUtil", sbI.toString());
        }
        return i11;
    }

    public static final /* synthetic */ Point x(View view) {
        l.f(view, "<this>");
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static final int y(O9.e eVar, O9.e[] typeParams) {
        l.f(eVar, "<this>");
        l.f(typeParams, "typeParams");
        int iHashCode = (eVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iF = eVar.f();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i10 = iF - 1;
            int i11 = i * 31;
            String strA = eVar.i(eVar.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i11 + iHashCode2;
            iF = i10;
        }
        int iF2 = eVar.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i12 = iF2 - 1;
            int i13 = iHashCode3 * 31;
            O9.k kVarE = eVar.i(eVar.f() - iF2).e();
            iHashCode3 = i13 + (kVarE != null ? kVarE.hashCode() : 0);
            iF2 = i12;
        }
    }

    public static F7.c z(I i, Context context, g7.b bVar, e7.f parsingHistogramReporter) {
        l.f(context, "context");
        l.f(parsingHistogramReporter, "parsingHistogramReporter");
        T t10 = ((O7.b) i.f2053c).f10479a;
        if (t10 != 0) {
            return (F7.c) t10;
        }
        M8.a aVar = new M8.a(parsingHistogramReporter, 12);
        com.google.android.gms.measurement.internal.a aVar2 = z7.c.f48475r8;
        F7.g gVar = new F7.g(context, new Oo(11), "");
        H7.e eVar = new H7.e((InterfaceC5480a) new A6.h(aVar, 2));
        I7.a aVar3 = new I7.a();
        new CopyOnWriteArraySet();
        new E7.b(new K7.a(gVar, aVar2, aVar3, eVar), (z7.c) aVar2);
        F7.b bVar2 = new F7.b();
        new LinkedHashMap();
        return new F7.n(bVar2, new F7.q(gVar), gVar);
    }

    @Override // H3.a
    public long b() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // Z2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N2.u c(N2.u r5, L2.h r6) {
        /*
            r4 = this;
            java.lang.Object r5 = r5.get()
            Y2.c r5 = (Y2.c) r5
            Y2.c$a r5 = r5.f13728b
            Y2.f r5 = r5.f13737a
            K2.e r5 = r5.f13739a
            java.nio.ByteBuffer r5 = r5.f3094d
            java.nio.ByteBuffer r5 = r5.asReadOnlyBuffer()
            V2.b r6 = new V2.b
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = h3.C4412a.f38190a
            boolean r0 = r5.isReadOnly()
            if (r0 != 0) goto L34
            boolean r0 = r5.hasArray()
            if (r0 == 0) goto L34
            h3.a$b r0 = new h3.a$b
            byte[] r1 = r5.array()
            int r2 = r5.arrayOffset()
            int r3 = r5.limit()
            r0.<init>(r1, r2, r3)
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 == 0) goto L47
            int r1 = r0.f38193a
            if (r1 != 0) goto L47
            byte[] r1 = r0.f38195c
            int r1 = r1.length
            int r0 = r0.f38194b
            if (r0 != r1) goto L47
            byte[] r5 = r5.array()
            goto L5c
        L47:
            java.nio.ByteBuffer r5 = r5.asReadOnlyBuffer()
            int r0 = r5.limit()
            byte[] r0 = new byte[r0]
            r1 = 0
            java.nio.Buffer r1 = r5.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r5.get(r0)
            r5 = r0
        L5c:
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C5606d.c(N2.u, L2.h):N2.u");
    }

    @Override // com.google.gson.internal.g
    public Object n() {
        switch (this.f46405b) {
            case 25:
                return new ConcurrentHashMap();
            default:
                return new ArrayList();
        }
    }

    public String toString() {
        switch (this.f46405b) {
            case 3:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public void d(Window window) {
    }
}
