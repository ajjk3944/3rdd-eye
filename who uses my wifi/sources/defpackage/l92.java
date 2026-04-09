package defpackage;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class l92 implements ti0, an1, u9, lo1, rd2, hh3, px2, ug2 {
    public static wc2 h;
    public static final int[] i = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Object f;
    public Object g;

    public /* synthetic */ l92(Object obj) {
        this.g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x007b, TryCatch #1 {IOException -> 0x007b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0046, B:19:0x003a, B:20:0x003d, B:23:0x004b, B:24:0x004e, B:25:0x0056, B:26:0x005c, B:28:0x0065, B:29:0x006a, B:30:0x006b), top: B:37:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.l92 D(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L7b
            jc[] r0 = new defpackage.jc[r0]     // Catch: java.io.IOException -> L7b
            ac r1 = new ac     // Catch: java.io.IOException -> L7b
            r1.<init>()     // Catch: java.io.IOException -> L7b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L7b
            if (r3 >= r4) goto L6b
            r4 = r12[r3]     // Catch: java.io.IOException -> L7b
            java.lang.String[] r5 = defpackage.i40.j     // Catch: java.io.IOException -> L7b
            r6 = 34
            r1.l(r6)     // Catch: java.io.IOException -> L7b
            int r7 = r4.length()     // Catch: java.io.IOException -> L7b
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L49
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L7b
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L7b
            if (r10 != 0) goto L38
            goto L46
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L46
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.n(r4, r9, r8)     // Catch: java.io.IOException -> L7b
        L3d:
            int r9 = r10.length()     // Catch: java.io.IOException -> L7b
            r1.n(r10, r2, r9)     // Catch: java.io.IOException -> L7b
            int r9 = r8 + 1
        L46:
            int r8 = r8 + 1
            goto L1c
        L49:
            if (r9 >= r7) goto L4e
            r1.n(r4, r9, r7)     // Catch: java.io.IOException -> L7b
        L4e:
            r1.l(r6)     // Catch: java.io.IOException -> L7b
            r1.c()     // Catch: java.io.IOException -> L7b
            jc r4 = new jc     // Catch: java.io.IOException -> L7b
            long r5 = r1.g     // Catch: java.io.EOFException -> L64 java.io.IOException -> L7b
            byte[] r5 = r1.f(r5)     // Catch: java.io.EOFException -> L64 java.io.IOException -> L7b
            r4.<init>(r5)     // Catch: java.io.IOException -> L7b
            r0[r3] = r4     // Catch: java.io.IOException -> L7b
            int r3 = r3 + 1
            goto La
        L64:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.io.IOException -> L7b
            r0.<init>(r12)     // Catch: java.io.IOException -> L7b
            throw r0     // Catch: java.io.IOException -> L7b
        L6b:
            l92 r1 = new l92     // Catch: java.io.IOException -> L7b
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L7b
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L7b
            uj0 r0 = defpackage.uj0.b(r0)     // Catch: java.io.IOException -> L7b
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L7b
            return r1
        L7b:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l92.D(java.lang.String[]):l92");
    }

    public static void f(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public void A(xl0 xl0Var) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((io) this.g).e(xl0Var);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // defpackage.ti0
    public o91 B(View view, o91 o91Var) {
        d71 d71Var = (d71) this.f;
        e71 e71Var = (e71) this.g;
        e71 e71Var2 = new e71();
        e71Var2.a = e71Var.a;
        e71Var2.b = e71Var.b;
        e71Var2.c = e71Var.c;
        e71Var2.d = e71Var.d;
        return d71Var.i(view, o91Var, e71Var2);
    }

    public void C(AttributeSet attributeSet, int i2) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.f;
        xb4 xb4VarR = xb4.r(absSeekBar.getContext(), attributeSet, i, i2);
        Drawable drawableN = xb4VarR.n(0);
        if (drawableN != null) {
            if (drawableN instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableN;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable drawableI = I(animationDrawable.getFrame(i3), true);
                    drawableI.setLevel(10000);
                    animationDrawable2.addFrame(drawableI, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(10000);
                drawableN = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableN);
        }
        Drawable drawableN2 = xb4VarR.n(1);
        if (drawableN2 != null) {
            absSeekBar.setProgressDrawable(I(drawableN2, false));
        }
        xb4VarR.z();
    }

    public void E(int i2, int i3) {
        int[] iArr = (int[]) this.f;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        w(i4);
        int[] iArr2 = (int[]) this.f;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.f, i2, i4, -1);
        ArrayList arrayList = (ArrayList) this.g;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sx0 sx0Var = (sx0) ((ArrayList) this.g).get(size);
            int i5 = sx0Var.f;
            if (i5 >= i2) {
                sx0Var.f = i5 + i3;
            }
        }
    }

    public void F(int i2, int i3) {
        int[] iArr = (int[]) this.f;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        w(i4);
        int[] iArr2 = (int[]) this.f;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.f;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.g;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sx0 sx0Var = (sx0) ((ArrayList) this.g).get(size);
            int i5 = sx0Var.f;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((ArrayList) this.g).remove(size);
                } else {
                    sx0Var.f = i5 - i3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0071 A[EDGE_INSN: B:93:0x0071->B:34:0x0071 BREAK  A[LOOP:3: B:11:0x0024->B:96:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(defpackage.lx r12, int r13, int r14) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l92.G(lx, int, int):void");
    }

    public void H(int i2, int i3, int i4, int i5) {
        od odVar = (od) this.g;
        odVar.i.set(i2, i3, i4, i5);
        Rect rect = odVar.h;
        super/*android.view.View*/.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable I(Drawable drawable, boolean z) {
        if (drawable instanceof xa1) {
            ((ya1) ((xa1) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = I(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
                    layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
                    layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
                    layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
                    layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
                    layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
                    layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
                    layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
                    layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.g) == null) {
                    this.g = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public void J(lx lxVar) throws SQLException {
        lxVar.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        lxVar.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public lf1 K(Object... objArr) {
        Constructor constructorMo18a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.g;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    constructorMo18a = ((ef1) this.f).mo18a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.g).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorMo18a = null;
        }
        if (constructorMo18a == null) {
            return null;
        }
        try {
            return (lf1) constructorMo18a.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public void L(wm0 wm0Var) {
        wc2 wc2Var;
        oi0 oi0Var;
        wc2 wc2Var2;
        pc4 pc4VarO;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.f;
        synchronized (l92.class) {
            try {
                if (h == null) {
                    bu1 bu1Var = sv1.f.b;
                    s62 s62Var = new s62();
                    bu1Var.getClass();
                    h = (wc2) new lh1(bu1Var, context, s62Var).d(context, false);
                }
                wc2Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wc2Var == null) {
            wm0Var.a("Internal Error, query info generator is null.");
            return;
        }
        oi0 oi0Var2 = new oi0(context);
        e13 e13Var = (e13) this.g;
        if (e13Var == null) {
            oi0Var = oi0Var2;
            wc2Var2 = wc2Var;
            pc4VarO = new pc4(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, jCurrentTimeMillis, 0L);
        } else {
            oi0Var = oi0Var2;
            wc2Var2 = wc2Var;
            e13Var.m = jCurrentTimeMillis;
            pc4VarO = fr.o(context, e13Var);
        }
        try {
            wc2Var2.e2(oi0Var, new ad2(null, "BANNER", null, pc4VarO, 0, null), new k92(this, wm0Var));
        } catch (RemoteException unused) {
            wm0Var.a("Internal Error.");
        }
    }

    public Set M(fm2 fm2Var) {
        return Collections.singleton(new up2(fm2Var, md2.g));
    }

    public Set N(fm2 fm2Var) {
        return Collections.singleton(new up2(fm2Var, md2.g));
    }

    @Override // defpackage.u9
    public void U(rh rhVar) {
        synchronized (((wy0) this.g).h) {
            ((yw1) this.f).b(new RuntimeException("Connection failed."));
        }
    }

    @Override // defpackage.hh3
    /* renamed from: a */
    public /* synthetic */ th3 mo10a() {
        AtomicInteger atomicInteger = sf2.z;
        th3 th3VarMo10a = ((hh3) this.f).mo10a();
        byte[] bArr = (byte[]) this.g;
        return new of2(new cf3(bArr), bArr.length, th3VarMo10a);
    }

    public void c() {
        int[] iArr = (int[]) this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.g = null;
    }

    @Override // defpackage.lo1
    public void d(oo1 oo1Var) {
        String str = (String) this.f;
        String string = oo1Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        gi2.i0(sb.toString());
        ((t12) this.g).a(null);
    }

    @Override // defpackage.an1
    public void e(kz2 kz2Var) {
        gn1 gn1Var = (gn1) this.g;
        if (kz2Var.K() == 0 && (kz2Var.K() & 128) != 0) {
            kz2Var.G(6);
            int iB = kz2Var.B() / 4;
            for (int i2 = 0; i2 < iB; i2++) {
                lg1 lg1Var = (lg1) this.f;
                kz2Var.H(lg1Var.a, 0, 4);
                lg1Var.l(0);
                int iR = lg1Var.r(16);
                lg1Var.o(3);
                if (iR == 0) {
                    lg1Var.o(13);
                } else {
                    int iR2 = lg1Var.r(13);
                    if (gn1Var.f.get(iR2) == null) {
                        gn1Var.f.put(iR2, new bn1(new pj4(gn1Var, iR2)));
                    }
                }
            }
            gn1Var.f.remove(0);
        }
    }

    public void g(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void h(boolean z) {
        xw xwVar = (xw) this.g;
        i5 i5Var = xwVar.t.x;
        iw iwVar = xwVar.v;
        if (iwVar != null) {
            iwVar.k().l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void i(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void j(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void k(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.px2
    public /* synthetic */ eg4 l(String str) {
        new hc2((j63) this.g, (Context) this.f, str).start();
        return eg4.f;
    }

    public void m(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void n(boolean z) {
        xw xwVar = (xw) this.g;
        i5 i5Var = xwVar.t.x;
        iw iwVar = xwVar.v;
        if (iwVar != null) {
            iwVar.k().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void p(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void q(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void r(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void s(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void t(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void u(boolean z) {
        iw iwVar = ((xw) this.g).v;
        if (iwVar != null) {
            iwVar.k().l.u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.ug2
    public /* synthetic */ void v(String str, int i2, String str2, boolean z) {
        ns2 ns2Var = (ns2) this.f;
        Map map = (Map) this.g;
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        ns2Var.b.d(map2);
    }

    public void w(int i2) {
        int[] iArr = (int[]) this.f;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.f = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public ArrayList x(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f;
        rq0 rq0VarF = rq0.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            rq0VarF.h(1);
        } else {
            rq0VarF.i(str, 1);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rq0VarF.k();
        }
    }

    public Long y(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f;
        rq0 rq0VarF = rq0.f("SELECT long_value FROM Preference where `key`=?", 1);
        rq0VarF.i(str, 1);
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            Long lValueOf = null;
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            rq0VarF.k();
        }
    }

    public ArrayList z(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f;
        rq0 rq0VarF = rq0.f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            rq0VarF.h(1);
        } else {
            rq0VarF.i(str, 1);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(rq0VarF);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            rq0VarF.k();
        }
    }

    public /* synthetic */ l92(Object obj, Object obj2) {
        this.f = obj;
        this.g = obj2;
    }

    public /* synthetic */ l92(Object obj, Object obj2, Object obj3) {
        this.f = obj2;
        this.g = obj3;
    }

    @Override // defpackage.rd2, defpackage.y23
    /* renamed from: a */
    public void mo8a() {
        gi2.G("callJs > getEngine: Promise rejected");
        ((pd2) this.f).b(new e62("Unable to obtain a JavascriptEngine."));
        ((x52) this.g).w();
    }

    public /* synthetic */ l92(Object obj, Object obj2, boolean z) {
        this.g = obj;
        this.f = obj2;
    }

    public l92(ef1 ef1Var) {
        this.f = ef1Var;
        this.g = new AtomicBoolean(false);
    }

    public l92(b22 b22Var) {
        this.f = b22Var;
        Drawable drawable = null;
        try {
            u10 u10VarD = b22Var.d();
            if (u10VarD != null) {
                drawable = (Drawable) oi0.l1(u10VarD);
            }
        } catch (RemoteException e) {
            gi2.c0("", e);
        }
        this.g = drawable;
        try {
            ((b22) this.f).h();
        } catch (RemoteException e2) {
            gi2.c0("", e2);
        }
        try {
            ((b22) this.f).l();
        } catch (RemoteException e3) {
            gi2.c0("", e3);
        }
        try {
            ((b22) this.f).b();
        } catch (RemoteException e4) {
            gi2.c0("", e4);
        }
        try {
            ((b22) this.f).c();
        } catch (RemoteException e5) {
            gi2.c0("", e5);
        }
        if (((Boolean) tw1.e.c.a(mz1.o4)).booleanValue()) {
            try {
                ((b22) this.f).e();
            } catch (RemoteException unused) {
            }
        }
    }

    public l92(WorkDatabase_Impl workDatabase_Impl, int i2) {
        switch (i2) {
            case 11:
                this.f = workDatabase_Impl;
                this.g = new io(workDatabase_Impl, 1);
                break;
            case 15:
                this.f = workDatabase_Impl;
                this.g = new io(workDatabase_Impl, 6);
                break;
            default:
                this.f = workDatabase_Impl;
                this.g = new io(workDatabase_Impl, 0);
                break;
        }
    }

    public l92(AbsSeekBar absSeekBar) {
        this.f = absSeekBar;
    }

    @Override // defpackage.an1
    public void b(x13 x13Var, nf1 nf1Var, in1 in1Var) {
    }
}
