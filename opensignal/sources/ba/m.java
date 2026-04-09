package ba;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import bf.n;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.y3;
import com.survicate.surveys.entities.survey.EventTrigger;
import com.survicate.surveys.entities.survey.EventTriggerProperty;
import com.survicate.surveys.entities.survey.EventTriggerPropertyOperator;
import com.survicate.surveys.entities.survey.translations.Translatable;
import h7.h0;
import ht.d1;
import ht.i0;
import ht.p0;
import ht.r0;
import ht.s0;
import ht.u;
import ir.f0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import l5.t;
import ls.g0;
import ls.q0;
import ls.y;
import ls.y0;
import mq.b0;
import mq.o;
import mq.p;
import wt.z;

/* loaded from: classes.dex */
public abstract class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public static Field f2492a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2493b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f2494c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2495d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f2496e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2497f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f2498g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2499h;

    public static boolean A(sr.h hVar, qs.c cVar) {
        br.l.e(cVar, "fqName");
        return hVar.w(cVar) != null;
    }

    public static final boolean B(EventTriggerProperty eventTriggerProperty, cq.a aVar) {
        br.l.e(eventTriggerProperty, "<this>");
        String str = (String) aVar.f6607b.get(eventTriggerProperty.getName());
        if (str != null) {
            switch (fq.e.f9033b[eventTriggerProperty.getPropertyOperator().ordinal()]) {
                case 1:
                    return str.equals(eventTriggerProperty.getValue());
                case 2:
                    if (!str.equals(eventTriggerProperty.getValue())) {
                        return true;
                    }
                    break;
                case 3:
                    return tt.l.q0(str, eventTriggerProperty.getValue(), false);
                case 4:
                    if (!tt.l.q0(str, eventTriggerProperty.getValue(), false)) {
                        return true;
                    }
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (!tt.l.D0(str)) {
                        return true;
                    }
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    return tt.l.D0(str);
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    return true;
                default:
                    throw new n();
            }
        } else if (eventTriggerProperty.getPropertyOperator() == EventTriggerPropertyOperator.DOES_NOT_EXIST) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        if (xs.d.g(r0).equals(xs.d.g(r3)) == false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static js.m D(rr.u r8, ur.q0 r9) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.m.D(rr.u, ur.q0):js.m");
    }

    public static Typeface E(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, dr.a.g(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static cv.v F(cv.j... r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.m.F(cv.j[]):cv.v");
    }

    public static void G(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final q0 H(q0 q0Var, h0 h0Var) {
        br.l.e(q0Var, "<this>");
        int i10 = q0Var.f15859g;
        if ((i10 & 256) == 256) {
            return q0Var.I;
        }
        if ((i10 & 512) == 512) {
            return h0Var.x(q0Var.J);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d A[PHI: r20 r21 r22 r23 r24 r25 r26 r27 r28
  0x016d: PHI (r20v6 a1.d) = (r20v5 a1.d), (r20v7 a1.d) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r21v6 boolean) = (r21v5 boolean), (r21v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r22v13 g2.a) = (r22v12 g2.a), (r22v14 g2.a) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r23v6 a1.n) = (r23v5 a1.n), (r23v7 a1.n) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r24v6 java.lang.Boolean) = (r24v5 java.lang.Boolean), (r24v7 java.lang.Boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r25v11 e2.f) = (r25v10 e2.f), (r25v12 e2.f) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r27v6 java.lang.Integer) = (r27v5 java.lang.Integer), (r27v7 java.lang.Integer) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r28v12 h2.f) = (r28v11 h2.f), (r28v13 h2.f) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void I(android.view.ViewStructure r38, x1.f0 r39, android.view.autofill.AutofillId r40, java.lang.String r41, f2.a r42) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.m.I(android.view.ViewStructure, x1.f0, android.view.autofill.AutofillId, java.lang.String, f2.a):void");
    }

    public static long L(fb.f fVar, int i10, int i11) {
        fVar.y(i10);
        if (fVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iD = fVar.d();
        if ((8388608 & iD) != 0 || ((2096896 & iD) >> 8) != i11 || (iD & 32) == 0 || fVar.o() < 7 || fVar.a() < 7 || (fVar.o() & 16) != 16) {
            return -9223372036854775807L;
        }
        fVar.c(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static final q0 M(y yVar, h0 h0Var) {
        br.l.e(yVar, "<this>");
        br.l.e(h0Var, "typeTable");
        int i10 = yVar.f15916g;
        if ((i10 & 32) == 32) {
            return yVar.F;
        }
        if ((i10 & 64) == 64) {
            return h0Var.x(yVar.G);
        }
        return null;
    }

    public static final String N(Translatable translatable) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        String string;
        LinkedList linkedList = new LinkedList();
        for (Class<?> superclass = translatable.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            Field[] declaredFields = superclass.getDeclaredFields();
            br.l.d(declaredFields, "getDeclaredFields(...)");
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field field2 = (Field) it.next();
                field2.setAccessible(true);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(field2.getName());
                sb2.append('=');
                Object obj = field2.get(translatable);
                sb2.append((obj == null || (string = obj.toString()) == null) ? null : tt.l.a1(string).toString());
                linkedList.add(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(translatable.getClass().getSimpleName());
        sb3.append("=[");
        return h0.b.r(sb3, o.x0(linkedList, ", ", null, null, null, 62), ']');
    }

    public static final q0 O(y yVar, h0 h0Var) {
        br.l.e(yVar, "<this>");
        br.l.e(h0Var, "typeTable");
        int i10 = yVar.f15916g;
        if ((i10 & 8) == 8) {
            q0 q0Var = yVar.B;
            br.l.d(q0Var, "returnType");
            return q0Var;
        }
        if ((i10 & 16) == 16) {
            return h0Var.x(yVar.D);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final q0 P(g0 g0Var, h0 h0Var) {
        br.l.e(g0Var, "<this>");
        br.l.e(h0Var, "typeTable");
        int i10 = g0Var.f15782g;
        if ((i10 & 8) == 8) {
            q0 q0Var = g0Var.B;
            br.l.d(q0Var, "returnType");
            return q0Var;
        }
        if ((i10 & 16) == 16) {
            return h0Var.x(g0Var.D);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static void Q(Outline outline, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            td.b.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                td.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            td.a.a(outline, path);
        }
    }

    public static void R(Drawable drawable, int i10) {
        drawable.setTint(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final qs.c S(qs.c r3, qs.c r4) {
        /*
            java.lang.String r0 = "<this>"
            br.l.e(r3, r0)
            java.lang.String r0 = "prefix"
            br.l.e(r4, r0)
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L11
            goto L33
        L11:
            boolean r0 = r4.d()
            if (r0 == 0) goto L18
            goto L33
        L18:
            java.lang.String r0 = r3.b()
            java.lang.String r1 = r4.b()
            r2 = 0
            boolean r2 = tt.s.n0(r0, r1, r2)
            if (r2 == 0) goto L65
            int r1 = r1.length()
            char r0 = r0.charAt(r1)
            r1 = 46
            if (r0 != r1) goto L65
        L33:
            boolean r0 = r4.d()
            if (r0 == 0) goto L3a
            goto L65
        L3a:
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L48
            qs.c r3 = qs.c.f21024c
            java.lang.String r4 = "ROOT"
            br.l.d(r3, r4)
            return r3
        L48:
            qs.c r0 = new qs.c
            java.lang.String r3 = r3.b()
            java.lang.String r4 = r4.b()
            int r4 = r4.length()
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            br.l.d(r3, r4)
            r0.<init>(r3)
            return r0
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.m.S(qs.c, qs.c):qs.c");
    }

    public static final q0 T(y0 y0Var, h0 h0Var) {
        br.l.e(h0Var, "typeTable");
        int i10 = y0Var.f15921g;
        if ((i10 & 4) == 4) {
            q0 q0Var = y0Var.f15924y;
            br.l.d(q0Var, "type");
            return q0Var;
        }
        if ((i10 & 8) == 8) {
            return h0Var.x(y0Var.B);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static s0 U(s0 s0Var) {
        if (!(s0Var instanceof u)) {
            return new r0(s0Var, 1);
        }
        u uVar = (u) s0Var;
        rr.r0[] r0VarArr = uVar.f10945b;
        ArrayList arrayListC0 = mq.l.C0(uVar.f10946c, r0VarArr);
        ArrayList arrayList = new ArrayList(p.a0(arrayListC0, 10));
        Iterator it = arrayListC0.iterator();
        while (it.hasNext()) {
            lq.l lVar = (lq.l) it.next();
            arrayList.add(q((p0) lVar.f15571a, (rr.r0) lVar.f15572d));
        }
        return new u(r0VarArr, (p0[]) arrayList.toArray(new p0[0]), true);
    }

    public static com.google.android.gms.internal.measurement.n V(Object obj) {
        if (obj == null) {
            return com.google.android.gms.internal.measurement.n.f5130h;
        }
        if (obj instanceof String) {
            return new q((String) obj);
        }
        if (obj instanceof Double) {
            return new com.google.android.gms.internal.measurement.g((Double) obj);
        }
        if (obj instanceof Long) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new com.google.android.gms.internal.measurement.e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            com.google.android.gms.internal.measurement.d dVar = new com.google.android.gms.internal.measurement.d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dVar.s(dVar.p(), V(it.next()));
            }
            return dVar;
        }
        com.google.android.gms.internal.measurement.k kVar = new com.google.android.gms.internal.measurement.k();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            com.google.android.gms.internal.measurement.n nVarV = V(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                kVar.e((String) string, nVarV);
            }
        }
        return kVar;
    }

    public static com.google.android.gms.internal.measurement.n W(v3 v3Var) {
        if (v3Var == null) {
            return com.google.android.gms.internal.measurement.n.f5129f;
        }
        int iX = v3Var.x() - 1;
        if (iX == 1) {
            return v3Var.r() ? new q(v3Var.s()) : com.google.android.gms.internal.measurement.n.f5134n;
        }
        if (iX == 2) {
            return v3Var.v() ? new com.google.android.gms.internal.measurement.g(Double.valueOf(v3Var.w())) : new com.google.android.gms.internal.measurement.g(null);
        }
        if (iX == 3) {
            return v3Var.t() ? new com.google.android.gms.internal.measurement.e(Boolean.valueOf(v3Var.u())) : new com.google.android.gms.internal.measurement.e(null);
        }
        if (iX != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listP = v3Var.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(W((v3) it.next()));
        }
        return new com.google.android.gms.internal.measurement.o(v3Var.q(), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(z0.m r52, final fn.a r53, ar.n r54, n0.p r55, final int r56) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.m.a(z0.m, fn.a, ar.n, n0.p, int):void");
    }

    public static final boolean b(EventTrigger eventTrigger, cq.a aVar) {
        if (!eventTrigger.getProperties().isEmpty()) {
            int i10 = fq.e.f9032a[eventTrigger.getRelation().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new n();
                }
                List<EventTriggerProperty> properties = eventTrigger.getProperties();
                if (properties != null && properties.isEmpty()) {
                    return false;
                }
                Iterator<T> it = properties.iterator();
                while (it.hasNext()) {
                    if (B((EventTriggerProperty) it.next(), aVar)) {
                    }
                }
                return false;
            }
            List<EventTriggerProperty> properties2 = eventTrigger.getProperties();
            if (properties2 == null || !properties2.isEmpty()) {
                Iterator<T> it2 = properties2.iterator();
                while (it2.hasNext()) {
                    if (!B((EventTriggerProperty) it2.next(), aVar)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static w2.j c(z zVar) {
        w2.h hVar = new w2.h();
        hVar.f24186c = new w2.k();
        w2.j jVar = new w2.j(hVar);
        hVar.f24185b = jVar;
        hVar.f24184a = c7.a.class;
        try {
            zVar.R(new c7.b(hVar, 0, zVar));
            hVar.f24184a = "Deferred.asListenableFuture";
            return jVar;
        } catch (Exception e4) {
            jVar.f24189d.k(e4);
            return jVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(yt.p r4, as.x r5, rq.c r6) {
        /*
            boolean r0 = r6 instanceof yt.n
            if (r0 == 0) goto L13
            r0 = r6
            yt.n r0 = (yt.n) r0
            int r1 = r0.f26454y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26454y = r1
            goto L18
        L13:
            yt.n r0 = new yt.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26453x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.f26454y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            as.x r5 = r0.f26452r
            lf.t1.G(r6)     // Catch: java.lang.Throwable -> L29
            goto L65
        L29:
            r4 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            lf.t1.G(r6)
            pq.h r6 = r0.f21666d
            br.l.b(r6)
            wt.r r2 = wt.r.f24653d
            pq.f r6 = r6.Y(r2)
            if (r6 != r4) goto L6f
            r0.f26452r = r5     // Catch: java.lang.Throwable -> L29
            r0.f26454y = r3     // Catch: java.lang.Throwable -> L29
            wt.g r6 = new wt.g     // Catch: java.lang.Throwable -> L29
            pq.c r0 = xu.l.D(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.v()     // Catch: java.lang.Throwable -> L29
            bs.a r0 = new bs.a     // Catch: java.lang.Throwable -> L29
            r2 = 4
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L29
            yt.o r4 = (yt.o) r4     // Catch: java.lang.Throwable -> L29
            r4.b0(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.u()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L65
            return r1
        L65:
            r5.c()
            lq.b0 r4 = lq.b0.f15562a
            return r4
        L6b:
            r5.c()
            throw r4
        L6f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.m.d(yt.p, as.x, rq.c):java.lang.Object");
    }

    public static String e(String str, int i10, int i11) {
        if (i10 < 0) {
            return y3.D("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return y3.D("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(w.g.e("negative size: ", 26, i11));
    }

    public static void f(long j, cv.g gVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        ArrayList arrayList3;
        long j7;
        int i15;
        int i16 = i10;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i11 >= i12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i17 = i11; i17 < i12; i17++) {
            if (((cv.j) arrayList4.get(i17)).d() < i16) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        cv.j jVar = (cv.j) arrayList.get(i11);
        cv.j jVar2 = (cv.j) arrayList4.get(i12 - 1);
        if (i16 == jVar.d()) {
            int iIntValue = ((Number) arrayList5.get(i11)).intValue();
            int i18 = i11 + 1;
            cv.j jVar3 = (cv.j) arrayList4.get(i18);
            i13 = i18;
            i14 = iIntValue;
            jVar = jVar3;
        } else {
            i13 = i11;
            i14 = -1;
        }
        if (jVar.i(i16) == jVar2.i(i16)) {
            int iMin = Math.min(jVar.d(), jVar2.d());
            int i19 = 0;
            for (int i20 = i16; i20 < iMin && jVar.i(i20) == jVar2.i(i20); i20++) {
                i19++;
            }
            long j10 = 4;
            long j11 = (gVar.f6706d / j10) + j + 2 + i19 + 1;
            gVar.s0(-i19);
            gVar.s0(i14);
            int i21 = i16 + i19;
            while (i16 < i21) {
                gVar.s0(jVar.i(i16) & 255);
                i16++;
            }
            if (i13 + 1 == i12) {
                if (i21 != ((cv.j) arrayList4.get(i13)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                gVar.s0(((Number) arrayList5.get(i13)).intValue());
                return;
            } else {
                cv.g gVar2 = new cv.g();
                gVar.s0(((int) ((gVar2.f6706d / j10) + j11)) * (-1));
                f(j11, gVar2, i21, arrayList4, i13, i12, arrayList5);
                gVar.o0(gVar2);
                return;
            }
        }
        int i22 = 1;
        for (int i23 = i13 + 1; i23 < i12; i23++) {
            if (((cv.j) arrayList4.get(i23 - 1)).i(i16) != ((cv.j) arrayList4.get(i23)).i(i16)) {
                i22++;
            }
        }
        long j12 = 4;
        long j13 = (gVar.f6706d / j12) + j + 2 + (i22 * 2);
        gVar.s0(i22);
        gVar.s0(i14);
        for (int i24 = i13; i24 < i12; i24++) {
            int i25 = ((cv.j) arrayList4.get(i24)).i(i16);
            if (i24 == i13 || i25 != ((cv.j) arrayList4.get(i24 - 1)).i(i16)) {
                gVar.s0(i25 & 255);
            }
        }
        cv.g gVar3 = new cv.g();
        int i26 = i13;
        while (i26 < i12) {
            byte bI = ((cv.j) arrayList4.get(i26)).i(i16);
            int i27 = i26 + 1;
            int i28 = i27;
            while (true) {
                if (i28 >= i12) {
                    i28 = i12;
                    break;
                } else if (bI != ((cv.j) arrayList4.get(i28)).i(i16)) {
                    break;
                } else {
                    i28++;
                }
            }
            if (i27 == i28 && i16 + 1 == ((cv.j) arrayList4.get(i26)).d()) {
                gVar.s0(((Number) arrayList5.get(i26)).intValue());
                arrayList3 = arrayList5;
                j7 = j13;
                i15 = i28;
            } else {
                gVar.s0(((int) ((gVar3.f6706d / j12) + j13)) * (-1));
                arrayList3 = arrayList5;
                j7 = j13;
                i15 = i28;
                f(j7, gVar3, i16 + 1, arrayList, i26, i15, arrayList3);
                arrayList4 = arrayList;
            }
            j13 = j7;
            i26 = i15;
            arrayList5 = arrayList3;
        }
        gVar.o0(gVar3);
    }

    public static void j(int i10, int i11) {
        String strD;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strD = y3.D("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(w.g.e("negative size: ", 26, i11));
                }
                strD = y3.D("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void l(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(e("index", i10, i11));
        }
    }

    public static void m(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? e("start index", i10, i12) : (i11 < 0 || i11 > i12) ? e("end index", i11, i12) : y3.D("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void n(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static final void o(View view) {
        br.l.e(view, "<this>");
        view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        view.setClipToOutline(true);
    }

    public static float[] p(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static final p0 q(p0 p0Var, rr.r0 r0Var) {
        if (r0Var == null || p0Var.a() == d1.INVARIANT) {
            return p0Var;
        }
        if (r0Var.N() != p0Var.a()) {
            us.c cVar = new us.c(p0Var);
            i0.f10910d.getClass();
            return new ht.g0(new us.a(p0Var, cVar, false, i0.f10911g));
        }
        if (!p0Var.c()) {
            return new ht.g0(p0Var.b());
        }
        gt.b bVar = gt.l.f9657e;
        br.l.d(bVar, "NO_LOCKS");
        return new ht.g0(new ht.z(bVar, new pp.c(9, p0Var)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k3.f[] r(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.m.r(java.lang.String):k3.f[]");
    }

    public static k3.f[] s(k3.f[] fVarArr) {
        k3.f[] fVarArr2 = new k3.f[fVarArr.length];
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            fVarArr2[i10] = new k3.f(fVarArr[i10]);
        }
        return fVarArr2;
    }

    public static boolean t(rr.b bVar, rr.b bVar2) {
        br.l.e(bVar, "superDescriptor");
        br.l.e(bVar2, "subDescriptor");
        if (!(bVar2 instanceof cs.g) || !(bVar instanceof rr.u)) {
            return false;
        }
        cs.g gVar = (cs.g) bVar2;
        gVar.Y().size();
        rr.u uVar = (rr.u) bVar;
        uVar.Y().size();
        List listY = gVar.u1().Y();
        br.l.d(listY, "subDescriptor.original.valueParameters");
        List listY2 = uVar.u1().Y();
        br.l.d(listY2, "superDescriptor.original.valueParameters");
        Iterator it = o.W0(listY, listY2).iterator();
        while (it.hasNext()) {
            lq.l lVar = (lq.l) it.next();
            ur.q0 q0Var = (ur.q0) lVar.f15571a;
            ur.q0 q0Var2 = (ur.q0) lVar.f15572d;
            br.l.d(q0Var, "subParameter");
            boolean z10 = D((rr.u) bVar2, q0Var) instanceof js.l;
            br.l.d(q0Var2, "superParameter");
            if (z10 != (D(uVar, q0Var2) instanceof js.l)) {
                return true;
            }
        }
        return false;
    }

    public static final HashMap u(Map map) {
        br.l.e(map, "map");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            lq.l lVar = value != null ? new lq.l(str, value) : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        HashMap map2 = new HashMap();
        b0.X(arrayList, map2);
        return map2;
    }

    public static sr.b v(sr.h hVar, qs.c cVar) {
        Object next;
        br.l.e(cVar, "fqName");
        Iterator it = hVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (br.l.a(((sr.b) next).a(), cVar)) {
                break;
            }
        }
        return (sr.b) next;
    }

    public static final xr.e w(Annotation[] annotationArr, qs.c cVar) {
        Annotation annotation;
        br.l.e(annotationArr, "<this>");
        br.l.e(cVar, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (xr.d.a(f0.D(f0.z(annotation))).b().equals(cVar)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new xr.e(annotation);
        }
        return null;
    }

    public static final ArrayList x(Annotation[] annotationArr) {
        br.l.e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new xr.e(annotation));
        }
        return arrayList;
    }

    public static ColorStateList y(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !t.r(drawable)) {
            return null;
        }
        return t.g(drawable).getColorStateList();
    }

    public abstract boolean C();

    public abstract void J(w2.f fVar, w2.f fVar2);

    public abstract void K(w2.f fVar, Thread thread);

    public abstract boolean g(w2.g gVar, w2.c cVar, w2.c cVar2);

    public abstract boolean h(w2.g gVar, Object obj, Object obj2);

    public abstract boolean i(w2.g gVar, w2.f fVar, w2.f fVar2);

    public abstract int z();
}
