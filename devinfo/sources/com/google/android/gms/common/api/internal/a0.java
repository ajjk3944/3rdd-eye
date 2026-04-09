package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.measurement.d5;
import e4.v0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import nm.d0;
import p.i1;
import x.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a0 implements u9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9068a;

    /* renamed from: b, reason: collision with root package name */
    public int f9069b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9070c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9071d;

    public /* synthetic */ a0(char c9, int i4) {
        this.f9068a = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f7, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fc, code lost:
    
        r1 = r0.f27319a;
        r0 = r0.f27320b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0202, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0204, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0206, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0217, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021a, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021d, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0221, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.f27319a, r0.f27320b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022f, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0231, code lost:
    
        r1 = r0.f27319a;
        r0 = r0.f27320b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0238, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023b, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023d, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024c, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024f, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0252, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025e, code lost:
    
        return new com.google.android.gms.common.api.internal.a0(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0266, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01dc, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01de, code lost:
    
        r0 = new j2.t0(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e4, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e5, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01eb, code lost:
    
        r0 = new j2.t0(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f1, code lost:
    
        r0 = new j2.t0(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.api.internal.a0 c(int r30, android.content.res.Resources.Theme r31, android.content.res.Resources r32) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.a0.c(int, android.content.res.Resources$Theme, android.content.res.Resources):com.google.android.gms.common.api.internal.a0");
    }

    public void a() {
        ah.f fVar;
        ImageView imageView = (ImageView) this.f9070c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            i1.a(drawable);
        }
        if (drawable == null || (fVar = (ah.f) this.f9071d) == null) {
            return;
        }
        p.s.e(drawable, fVar, imageView.getDrawableState());
    }

    public ud.m b() {
        ud.e eVar = (ud.e) this.f9071d;
        if (eVar != null) {
            throw eVar.a();
        }
        ud.m mVarA = ud.m.a(this.f9069b, (Object[]) this.f9070c, this);
        ud.e eVar2 = (ud.e) this.f9071d;
        if (eVar2 == null) {
            return mVarA;
        }
        throw eVar2.a();
    }

    public j0.h d(int i4) {
        if (i4 < 0 || i4 >= this.f9069b) {
            StringBuilder sbW = je.u.w(i4, "Index ", ", size ");
            sbW.append(this.f9069b);
            f0.a.d(sbW.toString());
        }
        j0.h hVar = (j0.h) this.f9071d;
        if (hVar != null) {
            int i10 = hVar.f26899a;
            if (i4 < hVar.f26900b + i10 && i10 <= i4) {
                return hVar;
            }
        }
        w0.e eVar = (w0.e) this.f9070c;
        j0.h hVar2 = (j0.h) eVar.f36397a[j0.m.e(i4, eVar)];
        this.f9071d = hVar2;
        return hVar2;
    }

    public int e(Object obj) {
        x.z zVar = (x.z) this.f9070c;
        int iD = zVar.d(obj);
        if (iD >= 0) {
            return zVar.f36967c[iD];
        }
        return -1;
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder("$");
        int i4 = this.f9069b + 1;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = ((Object[]) this.f9070c)[i10];
            if (obj instanceof kl.d) {
                kl.d dVar = (kl.d) obj;
                if (!nk.k.a(dVar.e(), kl.f.f28379d)) {
                    int i11 = ((int[]) this.f9071d)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(dVar.g(i11));
                    }
                } else if (((int[]) this.f9071d)[i10] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f9071d)[i10]);
                    sb2.append("]");
                }
            } else if (obj != ol.h.f30589a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }

    public void g(int i4, int i10, int i11, int i12, int i13, int i14, boolean z3, boolean z10, boolean z11, int i15) {
        long[] jArr = (long[]) this.f9070c;
        int i16 = this.f9069b;
        int i17 = i16 + 3;
        this.f9069b = i17;
        int length = jArr.length;
        if (length <= i17) {
            int iMax = Math.max(length * 2, i17);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            nk.k.d(jArrCopyOf, "copyOf(...)");
            this.f9070c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.f9071d, iMax);
            nk.k.d(jArrCopyOf2, "copyOf(...)");
            this.f9071d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.f9070c;
        jArr2[i16] = (i10 << 32) | (i11 & 4294967295L);
        jArr2[i16 + 1] = (i12 << 32) | (i13 & 4294967295L);
        int i18 = i14 & 33554431;
        jArr2[i16 + 2] = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | ((z3 ? 1L : 0L) << 61) | (1 << 60) | (Math.min(0, 1023) << 50) | (i18 << 25) | (i4 & 33554431);
        if (i14 < 0) {
            return;
        }
        for (int i19 = i15 != -1 ? i15 : i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j = jArr2[i20];
            if ((((int) j) & 33554431) == i18) {
                jArr2[i20] = (j & q2.a.f32144a) | (Math.min((i16 - i19) / 3, 1023) << 50);
                return;
            }
        }
    }

    public boolean i() {
        ColorStateList colorStateList;
        return ((Shader) this.f9070c) == null && (colorStateList = (ColorStateList) this.f9071d) != null && colorStateList.isStateful();
    }

    public void j(AttributeSet attributeSet, int i4) {
        int resourceId;
        ImageView imageView = (ImageView) this.f9070c;
        Context context = imageView.getContext();
        int[] iArr = h.a.f24781f;
        i0.f fVarJ = i0.f.J(context, attributeSet, iArr, i4);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        v0.n(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) fVarJ.f25417c, i4);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = jm.a.l(resourceId, imageView.getContext())) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                i1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(fVarJ.y(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(i1.c(typedArray.getInt(3, -1), null));
            }
            fVarJ.M();
        } catch (Throwable th2) {
            fVarJ.M();
            throw th2;
        }
    }

    public void k(Object obj, Object obj2) {
        int i4 = (this.f9069b + 1) * 2;
        Object[] objArr = (Object[]) this.f9070c;
        if (i4 > objArr.length) {
            this.f9070c = Arrays.copyOf(objArr, d5.e(objArr.length, i4));
        }
        com.bumptech.glide.f.f(obj, obj2);
        Object[] objArr2 = (Object[]) this.f9070c;
        int i10 = this.f9069b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f9069b = i10 + 1;
    }

    public void l(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.f9069b) * 2;
            Object[] objArr = (Object[]) this.f9070c;
            if (size > objArr.length) {
                this.f9070c = Arrays.copyOf(objArr, d5.e(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            k(entry.getKey(), entry.getValue());
        }
    }

    public void m(int i4) {
        ImageView imageView = (ImageView) this.f9070c;
        if (i4 != 0) {
            Drawable drawableL = jm.a.l(i4, imageView.getContext());
            if (drawableL != null) {
                i1.a(drawableL);
            }
            imageView.setImageDrawable(drawableL);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public void n(int i4, boolean z3) {
        int i10 = i4 & 33554431;
        long[] jArr = (long[]) this.f9070c;
        int i11 = this.f9069b;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            int i13 = i12 + 2;
            long j = jArr[i13];
            if ((((int) j) & 33554431) == i10) {
                long j8 = z3 ? 1L : 0L;
                jArr[i13] = (j8 * Long.MIN_VALUE) | (8070450532247928831L & j) | (1152921504606846976L * j8);
                return;
            }
        }
    }

    public void o(int i4, int i10, long j) {
        int i11;
        char c9;
        char c10;
        long[] jArr = (long[]) this.f9070c;
        long[] jArr2 = (long[]) this.f9071d;
        jArr2[0] = j;
        int i12 = 1;
        while (i12 > 0) {
            i12--;
            long j8 = jArr2[i12];
            int i13 = 33554431;
            int i14 = ((int) j8) & 33554431;
            char c11 = 25;
            int i15 = ((int) (j8 >> 25)) & 33554431;
            char c12 = '2';
            int i16 = ((int) (j8 >> 50)) & 1023;
            int i17 = i16 == 1023 ? this.f9069b : (i16 * 3) + i15;
            if (i15 < 0) {
                return;
            }
            while (i15 < jArr.length - 2 && i15 < i17) {
                int i18 = i15 + 2;
                long j9 = jArr[i18];
                if ((((int) (j9 >> c11)) & i13) == i14) {
                    long j10 = jArr[i15];
                    int i19 = i15 + 1;
                    i11 = i13;
                    c9 = c11;
                    long j11 = jArr[i19];
                    c10 = c12;
                    jArr[i15] = ((((int) j10) + i10) & 4294967295L) | ((((int) (j10 >> 32)) + i4) << 32);
                    jArr[i19] = ((((int) j11) + i10) & 4294967295L) | ((((int) (j11 >> 32)) + i4) << 32);
                    jArr[i18] = (((j9 >> 63) & 1) << 60) | j9;
                    if ((((int) (j9 >> c10)) & 1023) > 0) {
                        jArr2[i12] = (q2.a.f32145b & j9) | (((i15 + 3) & i11) << c9);
                        i12++;
                    }
                } else {
                    i11 = i13;
                    c9 = c11;
                    c10 = c12;
                }
                i15 += 3;
                i13 = i11;
                c11 = c9;
                c12 = c10;
            }
        }
    }

    public void p(int i4, mk.g gVar) {
        int i10 = i4 & 33554431;
        long[] jArr = (long[]) this.f9070c;
        int i11 = this.f9069b;
        for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
            if ((((int) jArr[i12 + 2]) & 33554431) == i10) {
                long j = jArr[i12];
                long j8 = jArr[i12 + 1];
                gVar.b(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j8 >> 32)), Integer.valueOf((int) j8));
                return;
            }
        }
    }

    public void q(String str, f fVar) {
        Map map = (Map) this.f9070c;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(r5.c.m(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, fVar);
        if (this.f9069b > 0) {
            new ac.k(Looper.getMainLooper(), 0).post(new b4.o(this, fVar, str, 1));
        }
    }

    public void r(Bundle bundle) {
        this.f9069b = 1;
        this.f9071d = bundle;
        for (Map.Entry entry : ((Map) this.f9070c).entrySet()) {
            ((f) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void s(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f9070c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((f) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public String toString() {
        switch (this.f9068a) {
            case 6:
                return f();
            case 13:
                StringBuilder sb2 = new StringBuilder();
                if (((rl.u) this.f9070c) == rl.u.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f9069b);
                sb2.append(' ');
                sb2.append((String) this.f9071d);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public a0(int i4, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f9068a = 9;
        this.f9069b = i4;
        this.f9071d = str;
        this.f9070c = arrayList;
    }

    public a0(byte b10, int i4) {
        this.f9068a = i4;
        switch (i4) {
            case 4:
                this.f9070c = new w0.e(new j0.h[16]);
                break;
            default:
                this.f9070c = DesugarCollections.synchronizedMap(new x.e(0));
                this.f9069b = 0;
                break;
        }
    }

    public a0(rl.u uVar, int i4, String str) {
        this.f9068a = 13;
        this.f9070c = uVar;
        this.f9069b = i4;
        this.f9071d = str;
    }

    public a0(ArrayList arrayList, int i4, MotionEvent motionEvent) {
        this.f9068a = 14;
        this.f9070c = arrayList;
        this.f9069b = i4;
        this.f9071d = motionEvent;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }

    public a0(ImageView imageView) {
        this.f9068a = 7;
        this.f9069b = 0;
        this.f9070c = imageView;
    }

    public a0(sk.d dVar, i0.g gVar) {
        this.f9068a = 5;
        a0 a0Var = gVar.f25419a;
        int i4 = dVar.f33817a;
        if (i4 < 0) {
            f0.a.c("negative nearestRange.first");
        }
        int iMin = Math.min(dVar.f33818b, a0Var.f9069b - 1);
        if (iMin < i4) {
            x.z zVar = i0.f36903a;
            nk.k.c(zVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f9070c = zVar;
            this.f9071d = new Object[0];
            this.f9069b = 0;
            return;
        }
        int i10 = (iMin - i4) + 1;
        this.f9071d = new Object[i10];
        this.f9069b = i4;
        x.z zVar2 = new x.z(i10);
        w0.e eVar = (w0.e) a0Var.f9070c;
        if (i4 < 0 || i4 >= a0Var.f9069b) {
            StringBuilder sbW = je.u.w(i4, "Index ", ", size ");
            sbW.append(a0Var.f9069b);
            f0.a.d(sbW.toString());
        }
        if (iMin < 0 || iMin >= a0Var.f9069b) {
            StringBuilder sbW2 = je.u.w(iMin, "Index ", ", size ");
            sbW2.append(a0Var.f9069b);
            f0.a.d(sbW2.toString());
        }
        if (iMin < i4) {
            f0.a.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i4 + ')');
        }
        int iE = j0.m.e(i4, eVar);
        int i11 = ((j0.h) eVar.f36397a[iE]).f26899a;
        while (i11 <= iMin) {
            j0.h hVar = (j0.h) eVar.f36397a[iE];
            g1.a aVar = (g1.a) hVar.f26901c.f25416b;
            int i12 = hVar.f26899a;
            int iMax = Math.max(i4, i12);
            int iMin2 = Math.min(iMin, (hVar.f26900b + i12) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    Object objInvoke = aVar.invoke(Integer.valueOf(iMax - i12));
                    objInvoke = objInvoke == null ? new j0.f(iMax) : objInvoke;
                    zVar2.g(iMax, objInvoke);
                    ((Object[]) this.f9071d)[iMax - this.f9069b] = objInvoke;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i11 += hVar.f26900b;
            iE++;
        }
        this.f9070c = zVar2;
    }

    public a0(Shader shader, ColorStateList colorStateList, int i4) {
        this.f9068a = 10;
        this.f9070c = shader;
        this.f9071d = colorStateList;
        this.f9069b = i4;
    }

    public a0(wj.k kVar, int i4, String str) {
        this.f9068a = 12;
        this.f9071d = kVar;
        this.f9069b = i4;
        this.f9070c = str;
    }

    public a0(int i4) {
        this.f9068a = 11;
        this.f9070c = new Object[i4 * 2];
        this.f9069b = 0;
    }

    public a0(hp hpVar) {
        this.f9068a = 15;
        this.f9071d = u8.d.a(150, new d0(23, this));
        this.f9070c = hpVar;
    }
}
