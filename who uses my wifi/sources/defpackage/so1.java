package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class so1 implements af1, mp1, ks2 {
    public static final bk i = new bk(10);
    public int f;
    public Object g;
    public Object h;

    public /* synthetic */ so1(int i2, Object obj, Object obj2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r16 = (int[]) r0.g;
        r17 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.g, (float[]) r0.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0237, code lost:
    
        r20 = (int[]) r0.g;
        r21 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0268, code lost:
    
        return new defpackage.so1(r11, (java.lang.Object) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new defpackage.vq2(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new defpackage.vq2(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new defpackage.vq2(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.so1 i(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.i(android.content.res.Resources, int, android.content.res.Resources$Theme):so1");
    }

    public static so1 o(String str, boolean z) {
        return new so1(str, Boolean.valueOf(z), 1);
    }

    public static so1 r(String str, long j) {
        return new so1(str, Long.valueOf(j), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.h
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "RCL"
            java.lang.String r2 = "/system/bin/ping -A -q -n -w 3 -W 2 -c 3 "
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 0
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r6.append(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.Process r2 = r5.exec(r2)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r2 = 512(0x200, float:7.17E-43)
            r5.<init>(r6, r2)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
        L2f:
            java.lang.String r2 = r5.readLine()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            if (r2 != 0) goto L44
            r5.close()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            r5.close()     // Catch: java.io.IOException -> Lb5
            goto Lb5
        L3d:
            r0 = move-exception
            r4 = r5
            goto Ld3
        L41:
            r2 = move-exception
            r4 = r5
            goto L6e
        L44:
            java.lang.Object r4 = r9.g     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            java.util.regex.Pattern r4 = (java.util.regex.Pattern) r4     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            java.lang.String r4 = "matcher(...)"
            defpackage.i30.l(r2, r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            boolean r4 = r2.matches()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            if (r4 == 0) goto L2f
            r5.close()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            r4 = 1
            java.lang.String r2 = r2.group(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            defpackage.i30.j(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            float r0 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            int r0 = (int) r0
            r5.close()     // Catch: java.io.IOException -> Lb7
            goto Lb7
        L6b:
            r0 = move-exception
            goto Ld3
        L6d:
            r2 = move-exception
        L6e:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r6 = "Can't use native ping: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6b
            r5.append(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L6b
            android.util.Log.e(r1, r2)     // Catch: java.lang.Throwable -> L6b
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> La4
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> La4
            boolean r0 = r0.isReachable(r3)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> La4
            if (r0 == 0) goto Lb0
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> La4
            long r7 = r7 - r5
            r0 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> La4
            long r7 = r7 / r5
            int r0 = (int) r7
            if (r4 == 0) goto Lb7
            r4.close()     // Catch: java.io.IOException -> Lb7
            goto Lb7
        La4:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L6b
            android.util.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L6b
        Lb0:
            if (r4 == 0) goto Lb5
            r4.close()     // Catch: java.io.IOException -> Lb5
        Lb5:
            int r0 = r9.f
        Lb7:
            if (r0 <= 0) goto Ld2
            r1 = 100
            if (r0 <= r1) goto Lc0
            int r0 = r0 * 50
            goto Lc2
        Lc0:
            int r0 = r0 * 30
        Lc2:
            r9.f = r0
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto Lcc
            int r0 = r0 * 2
            r9.f = r0
        Lcc:
            int r0 = r9.f
            if (r0 <= r3) goto Ld2
            r9.f = r3
        Ld2:
            return
        Ld3:
            if (r4 == 0) goto Ld8
            r4.close()     // Catch: java.io.IOException -> Ld8
        Ld8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.a():void");
    }

    public void b() {
        gc3 gc3Var;
        ImageView imageView = (ImageView) this.g;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            yp.a(drawable);
        }
        if (drawable == null || (gc3Var = (gc3) this.h) == null) {
            return;
        }
        l6.e(drawable, gc3Var, imageView.getDrawableState());
    }

    @Override // defpackage.ks2
    /* renamed from: c */
    public /* synthetic */ void mo12c(Object obj) {
        int i2 = ya4.g0;
        ((zt1) obj).I((xu1) this.g, (xu1) this.h, this.f);
    }

    @Override // defpackage.af1
    public void d() {
        byte[] bArr = v23.b;
        int length = bArr.length;
        ((kz2) this.h).z(0, bArr);
    }

    @Override // defpackage.mp1
    public byte e(vp1 vp1Var, int i2) {
        byte[] bArr = (byte[]) this.g;
        int i3 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i4 = 1761855727 % 1384724137;
        int i5 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i6 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i7 = 1694830070 % 1383960411;
        int i8 = i2 >>> i5;
        if (i8 != this.f) {
            ((t3) this.h).v(i8, bArr);
            this.f = i8;
        }
        int i9 = i6 ^ i7;
        return (byte) (((vp1Var.b(i2) ^ bArr[i2 % (i3 ^ i4)]) << i9) >> i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        return new defpackage.ze1(-2, r13, r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        return defpackage.ze1.d;
     */
    @Override // defpackage.af1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.ze1 f(defpackage.mf1 r25, long r26) {
        /*
            r24 = this;
            r0 = r24
            long r5 = r25.o()
            long r1 = r25.p()
            long r1 = r1 - r5
            r3 = 112800(0x1b8a0, double:5.57306E-319)
            long r1 = java.lang.Math.min(r3, r1)
            int r1 = (int) r1
            java.lang.Object r2 = r0.h
            kz2 r2 = (defpackage.kz2) r2
            r2.y(r1)
            byte[] r3 = r2.a
            r4 = 0
            r7 = r25
            r7.u(r3, r4, r1)
            int r1 = r2.c
            r7 = -1
            r9 = r7
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2c:
            int r11 = r2.B()
            r12 = 188(0xbc, float:2.63E-43)
            if (r11 < r12) goto La1
            byte[] r11 = r2.a
            int r12 = r2.b
        L38:
            if (r12 >= r1) goto L48
            r15 = r11[r12]
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 71
            if (r15 == r3) goto L4d
            int r12 = r12 + 1
            goto L38
        L48:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4d:
            int r3 = r12 + 188
            if (r3 <= r1) goto L52
            goto La6
        L52:
            int r4 = r0.f
            long r7 = defpackage.g82.z(r2, r12, r4)
            int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r4 == 0) goto L9c
            java.lang.Object r4 = r0.g
            x13 r4 = (defpackage.x13) r4
            long r7 = r4.c(r7)
            int r4 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r4 <= 0) goto L82
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 != 0) goto L74
            ze1 r1 = new ze1
            r2 = -1
            r3 = r7
            r1.<init>(r2, r3, r5)
            return r1
        L74:
            long r15 = r5 + r9
            ze1 r11 = new ze1
            r12 = 0
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.<init>(r12, r13, r15)
            return r11
        L82:
            r13 = r7
            long r7 = (long) r12
            r9 = 100000(0x186a0, double:4.94066E-319)
            long r9 = r9 + r13
            int r4 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r4 <= 0) goto L9b
            long r22 = r5 + r7
            ze1 r18 = new ze1
            r19 = 0
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18.<init>(r19, r20, r22)
            return r18
        L9b:
            r9 = r7
        L9c:
            r2.E(r3)
            long r7 = (long) r3
            goto L2c
        La1:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        La6:
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 == 0) goto Lb3
            long r15 = r5 + r7
            ze1 r11 = new ze1
            r12 = -2
            r11.<init>(r12, r13, r15)
            return r11
        Lb3:
            ze1 r1 = defpackage.ze1.d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.f(mf1, long):ze1");
    }

    @Override // defpackage.mp1
    public vp1 g(vp1 vp1Var, int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > vp1Var.a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i3 - i2];
        int i4 = 0;
        while (i2 < i3) {
            bArr[i4] = e(vp1Var, i2);
            i2++;
            i4++;
        }
        return vp1.e(bArr);
    }

    @Override // defpackage.mp1
    /* renamed from: h */
    public /* bridge */ /* synthetic */ mp1 mo16h() {
        return new so1((t3) this.h);
    }

    public boolean j() {
        ColorStateList colorStateList;
        return ((Shader) this.g) == null && (colorStateList = (ColorStateList) this.h) != null && colorStateList.isStateful();
    }

    public void k(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.g;
        Context context = imageView.getContext();
        int[] iArr = hn0.f;
        xb4 xb4VarR = xb4.r(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) xb4VarR.h;
        e61.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) xb4VarR.h, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = ob1.h(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                yp.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                j20.c(imageView, xb4VarR.k(2));
            }
            if (typedArray.hasValue(3)) {
                j20.d(imageView, yp.c(typedArray.getInt(3, -1), null));
            }
            xb4VarR.z();
        } catch (Throwable th) {
            xb4VarR.z();
            throw th;
        }
    }

    public void l(int i2) {
        ImageView imageView = (ImageView) this.g;
        if (i2 != 0) {
            Drawable drawableH = ob1.h(imageView.getContext(), i2);
            if (drawableH != null) {
                yp.a(drawableH);
            }
            imageView.setImageDrawable(drawableH);
        } else {
            imageView.setImageDrawable(null);
        }
        b();
    }

    public int m() {
        int i2 = this.f;
        if (i2 != 2) {
            return i2 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Object n(int i2) {
        SparseArray sparseArray = (SparseArray) this.g;
        if (this.f == -1) {
            this.f = 0;
        }
        while (true) {
            int i3 = this.f;
            if (i3 <= 0 || i2 >= sparseArray.keyAt(i3)) {
                break;
            }
            this.f--;
        }
        while (this.f < sparseArray.size() - 1 && i2 >= sparseArray.keyAt(this.f + 1)) {
            this.f++;
        }
        return sparseArray.valueAt(this.f);
    }

    public void p(Object obj, Object obj2) {
        int i2 = this.f + 1;
        Object[] objArr = (Object[]) this.g;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            this.g = Arrays.copyOf(objArr, rm3.d(length, i3));
        }
        ob1.v(obj, obj2);
        Object[] objArr2 = (Object[]) this.g;
        int i4 = this.f;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.f = i4 + 1;
    }

    public synchronized byte[] q(int i2) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.h;
            if (i3 >= arrayList.size()) {
                return new byte[i2];
            }
            byte[] bArr = (byte[]) arrayList.get(i3);
            int length = bArr.length;
            if (length >= i2) {
                this.f -= length;
                arrayList.remove(i3);
                ((ArrayList) this.g).remove(bArr);
                return bArr;
            }
            i3++;
        }
    }

    public void s(uv1 uv1Var) {
        synchronized (this.g) {
            try {
                Iterator it = ((LinkedList) this.h).iterator();
                while (it.hasNext()) {
                    uv1 uv1Var2 = (uv1) it.next();
                    hg4 hg4Var = hg4.C;
                    if (hg4Var.h.g().k()) {
                        if (!hg4Var.h.g().l() && !uv1Var.equals(uv1Var2) && uv1Var2.q.equals(uv1Var.q)) {
                            it.remove();
                            return;
                        }
                    } else if (!uv1Var.equals(uv1Var2) && uv1Var2.o.equals(uv1Var.o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void t(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.g).add(bArr);
                ArrayList arrayList = (ArrayList) this.h;
                int iBinarySearch = Collections.binarySearch(arrayList, bArr, i);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                arrayList.add(iBinarySearch, bArr);
                this.f += length;
                synchronized (this) {
                    while (this.f > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.g).remove(0);
                        ((ArrayList) this.h).remove(bArr2);
                        this.f -= bArr2.length;
                    }
                }
            }
        }
    }

    public xn3 u() {
        ym3 ym3Var = (ym3) this.h;
        if (ym3Var != null) {
            throw ym3Var.a();
        }
        xn3 xn3VarD = xn3.d(this.f, (Object[]) this.g, this);
        ym3 ym3Var2 = (ym3) this.h;
        if (ym3Var2 == null) {
            return xn3VarD;
        }
        throw ym3Var2.a();
    }

    public void v(uv1 uv1Var) {
        synchronized (this.g) {
            try {
                LinkedList linkedList = (LinkedList) this.h;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    gi2.U(sb.toString());
                    linkedList.remove(0);
                }
                int i2 = this.f;
                this.f = i2 + 1;
                uv1Var.l = i2;
                synchronized (uv1Var.g) {
                    try {
                        int i3 = uv1Var.k;
                        int i4 = uv1Var.l;
                        int i5 = uv1Var.b;
                        if (!uv1Var.d) {
                            i5 = (i4 * i5) + (i3 * uv1Var.a);
                        }
                        if (i5 > uv1Var.n) {
                            uv1Var.n = i5;
                        }
                    } finally {
                    }
                }
                linkedList.add(uv1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object w() {
        String str = (String) this.g;
        Object obj = this.h;
        jz1 jz1Var = (jz1) l12.a.get();
        if (jz1Var == null) {
            if (l12.b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        SharedPreferences sharedPreferences = jz1Var.a;
        int i2 = this.f - 1;
        if (i2 == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, zBooleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(zBooleanValue)));
            }
        }
        if (i2 == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r3));
            }
        }
        if (i2 != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) r3));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
        }
    }

    public so1(t3 t3Var) {
        this.f = -1;
        this.g = new byte[8];
        this.h = t3Var;
    }

    public /* synthetic */ so1(Object obj, Object obj2, int i2) {
        this.g = obj;
        this.h = obj2;
        this.f = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public so1(int i2, boolean z) {
        this(4);
        switch (i2) {
            case 5:
                Pattern patternCompile = Pattern.compile("^rtt min\\/avg\\/max\\/mdev = [0-9\\.]+\\/[0-9\\.]+\\/([0-9\\.]+)\\/[0-9\\.]+ ms.*");
                i30.l(patternCompile, "compile(...)");
                this.g = patternCompile;
                this.f = 2000;
                break;
            case 9:
                this.g = new Object();
                this.h = new LinkedList();
                break;
            case 13:
                break;
            case 15:
                hd4 hd4Var = hd4.h;
                this.g = new SparseArray();
                this.h = hd4Var;
                this.f = -1;
                break;
            default:
                this.g = new ArrayList();
                this.h = new ArrayList(64);
                this.f = 0;
                break;
        }
    }

    public so1(int i2) {
        this.g = new Object[i2 + i2];
        this.f = 0;
    }

    public so1(ImageView imageView) {
        this.f = 0;
        this.g = imageView;
    }
}
