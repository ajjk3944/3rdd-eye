package je;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TextView;
import i2.g0;
import java.util.ArrayList;
import java.util.Iterator;
import s2.h0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class u {
    public static void A(TextView textView, Context context) {
        nh.a.d(context, textView.getText().toString());
    }

    public static void B(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static /* synthetic */ String C(int i4) {
        switch (i4) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String D(int i4) {
        switch (i4) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static long a(long j, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static void b(p1.j jVar, p1.j jVar2) {
        jVar.f30986a.addPath(jVar2.f30986a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void c(p1.j jVar, o1.d dVar) {
        if (jVar.f30987b == null) {
            jVar.f30987b = new RectF();
        }
        RectF rectF = jVar.f30987b;
        nk.k.b(rectF);
        float f10 = dVar.f30370a;
        long j = dVar.f30376h;
        long j8 = dVar.g;
        long j9 = dVar.f30375f;
        long j10 = dVar.f30374e;
        rectF.set(f10, dVar.f30371b, dVar.f30372c, dVar.f30373d);
        if (jVar.f30988c == null) {
            jVar.f30988c = new float[8];
        }
        float[] fArr = jVar.f30988c;
        nk.k.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j9 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j9 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j8 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j8 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = jVar.f30986a;
        RectF rectF2 = jVar.f30987b;
        nk.k.b(rectF2);
        float[] fArr2 = jVar.f30988c;
        nk.k.b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static void d(g0 g0Var, long j, float f10) {
        long jE = g0Var.f25668a.e();
        r1.b bVar = g0Var.f25668a;
        bVar.f32717a.f32715c.f(f10, jE, r1.b.b(bVar, j, r1.f.f32723b, 3));
    }

    public static void e(r1.d dVar, p1.g gVar, long j, long j8, float f10, p1.m mVar, int i4, int i10) {
        dVar.A(gVar, 0L, j, (i10 & 16) != 0 ? j : j8, (i10 & 32) != 0 ? 1.0f : f10, mVar, (i10 & 512) != 0 ? 1 : i4);
    }

    public static /* synthetic */ void f(r1.d dVar, p1.j jVar, p1.z zVar, float f10, r1.g gVar, int i4) {
        if ((i4 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        r1.c cVar = gVar;
        if ((i4 & 8) != 0) {
            cVar = r1.f.f32723b;
        }
        dVar.s(jVar, zVar, f11, cVar, (i4 & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void g(r1.d dVar, long j, long j8, int i4) {
        if ((i4 & 4) != 0) {
            j8 = a(dVar.c(), 0L);
        }
        dVar.k(j, 0L, j8, r1.f.f32723b, (i4 & 64) != 0 ? 3 : 0);
    }

    public static void h(g0 g0Var, p1.z zVar, long j, long j8, long j9, r1.c cVar, int i4) {
        long j10 = (i4 & 2) != 0 ? 0L : j;
        long jA = (i4 & 4) != 0 ? a(g0Var.c(), j10) : j8;
        r1.c cVar2 = (i4 & 32) != 0 ? r1.f.f32723b : cVar;
        r1.b bVar = g0Var.f25668a;
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        bVar.f32717a.f32715c.l(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (jA >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (jA & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), bVar.d(zVar, cVar2, 1.0f, null, 3, 1));
    }

    public static /* synthetic */ int i(int i4) {
        int i10 = 1;
        if (i4 != 1) {
            i10 = 2;
            if (i4 != 2) {
                i10 = 3;
                if (i4 != 3) {
                    if (i4 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ boolean j(int i4) {
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return false;
        }
        if (i4 == 4 || i4 == 5) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0068 A[EDGE_INSN: B:53:0x0068->B:28:0x0068 BREAK  A[LOOP:0: B:3:0x0012->B:57:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[LOOP:0: B:3:0x0012->B:57:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(android.content.Context r17, cm.g r18, pi.a r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            pi.h r3 = pi.h.f32018b
            java.util.ArrayList r3 = r3.f32019a
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r7 = r5
            r8 = r6
        L12:
            r9 = 1
            if (r8 >= r4) goto L68
            java.lang.Object r7 = r3.get(r8)
            int r8 = r8 + 1
            pi.c r7 = (pi.c) r7
            int r10 = r2.f32004b
            r7.getClass()
            j6.i r7 = ci.b.j
            if (r7 == 0) goto L5d
            com.liuzh.deviceinfo.utilities.f r7 = com.liuzh.deviceinfo.utilities.f.f21256b
            boolean r7 = com.liuzh.deviceinfo.utilities.f.g()
            if (r7 == 0) goto L2f
            goto L57
        L2f:
            int r7 = com.liuzh.deviceinfo.utilities.f.r()
            long r11 = (long) r7
            ja.c r7 = kh.a.f28295b
            r13 = 5
            if (r7 != 0) goto L3c
            r15 = r13
            goto L42
        L3c:
            java.lang.String r7 = "ad_click_limited"
            long r15 = ja.c.v(r7)
        L42:
            int r7 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r7 >= 0) goto L47
            goto L48
        L47:
            r13 = r15
        L48:
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 < 0) goto L4d
            goto L57
        L4d:
            java.lang.String r7 = "risk_user"
            android.content.SharedPreferences r11 = com.liuzh.deviceinfo.utilities.f.f21257c
            boolean r7 = r11.getBoolean(r7, r6)
            if (r7 == 0) goto L5d
        L57:
            i7.b r7 = new i7.b
            r7.<init>()
            goto L66
        L5d:
            if (r10 != r9) goto L65
            qi.b r7 = new qi.b
            r7.<init>()
            goto L66
        L65:
            r7 = r5
        L66:
            if (r7 == 0) goto L12
        L68:
            if (r7 != 0) goto L6f
            i7.b r7 = new i7.b
            r7.<init>()
        L6f:
            int r3 = r2.f32005c
            if (r3 == r9) goto Lba
            r4 = 2
            if (r3 == r4) goto Lb1
            r4 = 3
            if (r3 == r4) goto La8
            r4 = 4
            if (r3 == r4) goto L9f
            r4 = 5
            if (r3 == r4) goto L96
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r2.f32005c
            r0.append(r2)
            java.lang.String r2 = " uspt "
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.B(r0)
            return
        L96:
            pi.g r3 = new pi.g
            r3.<init>(r0, r1, r2)
            r7.b(r0, r3, r2)
            return
        L9f:
            pi.g r3 = new pi.g
            r3.<init>(r0, r1, r2)
            r7.q(r0, r3, r2)
            return
        La8:
            pi.g r3 = new pi.g
            r3.<init>(r0, r1, r2)
            r7.w(r0, r3, r2)
            return
        Lb1:
            pi.g r3 = new pi.g
            r3.<init>(r0, r1, r2)
            r7.s(r0, r3, r2)
            return
        Lba:
            pi.g r3 = new pi.g
            r3.<init>(r0, r1, r2)
            r7.r(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.u.k(android.content.Context, cm.g, pi.a):void");
    }

    public static int l(int i4, int i10, int i11, int i12) {
        return i4 + i10 + i11 + i12;
    }

    public static int m(int i4, int i10, String str) {
        return (str.hashCode() + i4) * i10;
    }

    public static int n(h0 h0Var, int i4, int i10) {
        return (h0Var.hashCode() + i4) * i10;
    }

    public static ClassCastException o(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object p(int i4, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i4);
    }

    public static String q(int i4, int i10, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i4);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String r(int i4, String str) {
        return str + i4;
    }

    public static String s(long j, String str, StringBuilder sb2) {
        sb2.append(j);
        sb2.append(str);
        return sb2.toString();
    }

    public static String t(String str, String str2) {
        return str + str2;
    }

    public static String u(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String v(StringBuilder sb2, String str, int i4, String str2) {
        sb2.append(str);
        sb2.append(i4);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder w(int i4, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i4);
        sb2.append(str2);
        return sb2;
    }

    public static void x(int i4, int i10, String str, String str2, StringBuilder sb2) {
        sb2.append(i4);
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
    }

    public static /* synthetic */ void y(int i4, String str) {
        if (i4 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(nk.k.h(str));
        nk.k.j(nullPointerException, nk.k.class.getName());
        throw nullPointerException;
    }

    public static void z(SharedPreferences sharedPreferences, String str, int i4) {
        sharedPreferences.edit().putInt(str, i4).apply();
    }
}
