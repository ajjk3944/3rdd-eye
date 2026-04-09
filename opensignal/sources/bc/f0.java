package bc;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;
import com.google.android.exoplayer2.y0;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase_Impl;
import d5.z0;
import io.sentry.android.core.u0;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oe.j0;
import p.c1;
import u3.i0;
import y1.f1;

/* loaded from: classes.dex */
public final class f0 implements ca.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2601a;

    /* renamed from: d, reason: collision with root package name */
    public int f2602d;

    /* renamed from: g, reason: collision with root package name */
    public Object f2603g;

    /* renamed from: r, reason: collision with root package name */
    public Object f2604r;

    public /* synthetic */ f0(int i10, byte b2) {
        this.f2601a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022c, code lost:
    
        if (r19 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x022e, code lost:
    
        r0 = new i4.b();
        r0.f11196a = new int[]{r5, r11, r12};
        r0.f11197d = new float[]{0.0f, 0.5f, 1.0f};
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0242, code lost:
    
        r0 = new i4.b();
        r0.f11196a = new int[]{r5, r12};
        r15 = 2;
        r0.f11197d = new float[]{0.0f, 1.0f};
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0256, code lost:
    
        if (r9 == r8) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0258, code lost:
    
        if (r9 == r15) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025a, code lost:
    
        r17 = (int[]) r0.f11196a;
        r18 = (float[]) r0.f11197d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0268, code lost:
    
        if (r6 == r8) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026a, code lost:
    
        if (r6 == r15) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0277, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x027a, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027d, code lost:
    
        r12 = new android.graphics.LinearGradient(r21, r22, r26, r16, r17, r18, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0281, code lost:
    
        r12 = new android.graphics.SweepGradient(r7, r10, (int[]) r0.f11196a, (float[]) r0.f11197d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0293, code lost:
    
        if (r25 <= 0.0f) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0295, code lost:
    
        r21 = (int[]) r0.f11196a;
        r22 = (float[]) r0.f11197d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a5, code lost:
    
        if (r6 == 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a7, code lost:
    
        if (r6 == 2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a9, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b4, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b7, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ba, code lost:
    
        r12 = new android.graphics.RadialGradient(r7, r10, r25, r21, r22, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c6, code lost:
    
        return new bc.f0(r12, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ce, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ed, code lost:
    
        if (r2.size() <= 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ef, code lost:
    
        r0 = new i4.b();
        r1 = r2.size();
        r0.f11196a = new int[r1];
        r0.f11197d = new float[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0201, code lost:
    
        if (r3 >= r1) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0203, code lost:
    
        ((int[]) r0.f11196a)[r3] = ((java.lang.Integer) r2.get(r3)).intValue();
        ((float[]) r0.f11197d)[r3] = ((java.lang.Float) r13.get(r3)).floatValue();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0226, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0227, code lost:
    
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0229, code lost:
    
        r8 = 1;
        r15 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bc.f0 d(android.content.res.Resources r27, int r28, android.content.res.Resources.Theme r29) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.f0.d(android.content.res.Resources, int, android.content.res.Resources$Theme):bc.f0");
    }

    public static void e(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = br.l.g(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        if (str.subSequence(i10, length + 1).toString().length() == 0) {
            return;
        }
        io.sentry.android.core.e0.p("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e4) {
            io.sentry.android.core.e0.q("SupportSQLite", "delete failed: ", e4);
        }
    }

    public static f0 l(char c4) {
        return new f0(new i.g0(new ne.e(c4)));
    }

    public static f0 q(fb.f fVar) throws y0 {
        try {
            fVar.z(21);
            int iO = fVar.o() & 3;
            int iO2 = fVar.o();
            int i10 = fVar.f8801b;
            int i11 = 0;
            for (int i12 = 0; i12 < iO2; i12++) {
                fVar.z(1);
                int iT = fVar.t();
                for (int i13 = 0; i13 < iT; i13++) {
                    int iT2 = fVar.t();
                    i11 += iT2 + 4;
                    fVar.z(iT2);
                }
            }
            fVar.y(i10);
            byte[] bArr = new byte[i11];
            int i14 = 0;
            String strE = null;
            for (int i15 = 0; i15 < iO2; i15++) {
                int iO3 = fVar.o() & 127;
                int iT3 = fVar.t();
                for (int i16 = 0; i16 < iT3; i16++) {
                    int iT4 = fVar.t();
                    System.arraycopy(qb.b.f20760c, 0, bArr, i14, 4);
                    int i17 = i14 + 4;
                    System.arraycopy(fVar.f8800a, fVar.f8801b, bArr, i17, iT4);
                    if (iO3 == 33 && i16 == 0) {
                        strE = qb.b.e(new a5.u(i17, i17 + iT4, 4, bArr));
                    }
                    i14 = i17 + iT4;
                    fVar.z(iT4);
                }
            }
            return new f0(i11 == 0 ? null : Collections.singletonList(bArr), iO + 1, strE, 11);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw y0.a(e4, "Error parsing HEVC config");
        }
    }

    public void a() {
        z0 z0Var;
        ImageView imageView = (ImageView) this.f2603g;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            c1.a(drawable);
        }
        if (drawable == null || (z0Var = (z0) this.f2604r) == null) {
            return;
        }
        p.p.e(drawable, z0Var, imageView.getDrawableState());
    }

    @Override // ca.e
    public void b() {
        fb.f fVar = (fb.f) this.f2604r;
        byte[] bArr = qb.v.f20833f;
        fVar.getClass();
        fVar.w(bArr.length, bArr);
    }

    public oe.z0 c() {
        j0 j0Var = (j0) this.f2604r;
        if (j0Var != null) {
            throw j0Var.a();
        }
        oe.z0 z0VarB = oe.z0.b(this.f2602d, (Object[]) this.f2603g, this);
        j0 j0Var2 = (j0) this.f2604r;
        if (j0Var2 == null) {
            return z0VarB;
        }
        throw j0Var2.a();
    }

    public Object f(int i10) {
        switch (this.f2601a) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                SparseArray sparseArray = (SparseArray) this.f2603g;
                if (this.f2602d == -1) {
                    this.f2602d = 0;
                }
                while (true) {
                    int i11 = this.f2602d;
                    if (i11 > 0 && i10 < sparseArray.keyAt(i11)) {
                        this.f2602d--;
                    }
                }
                while (this.f2602d < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f2602d + 1)) {
                    this.f2602d++;
                }
                return sparseArray.valueAt(this.f2602d);
            default:
                SparseArray sparseArray2 = (SparseArray) this.f2603g;
                if (this.f2602d == -1) {
                    this.f2602d = 0;
                }
                while (true) {
                    int i12 = this.f2602d;
                    if (i12 > 0 && i10 < sparseArray2.keyAt(i12)) {
                        this.f2602d--;
                    }
                }
                while (this.f2602d < sparseArray2.size() - 1 && i10 >= sparseArray2.keyAt(this.f2602d + 1)) {
                    this.f2602d++;
                }
                return sparseArray2.valueAt(this.f2602d);
        }
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f2602d + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = ((Object[]) this.f2603g)[i11];
            if (obj instanceof iu.e) {
                iu.e eVar = (iu.e) obj;
                if (!br.l.a(eVar.f(), iu.j.f13012e)) {
                    int i12 = ((int[]) this.f2604r)[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(eVar.l(i12));
                    }
                } else if (((int[]) this.f2604r)[i11] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f2604r)[i11]);
                    sb2.append("]");
                }
            } else if (obj != mu.m.f17019a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public void h(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        long[] jArr = (long[]) this.f2603g;
        int i16 = this.f2602d;
        int i17 = i16 + 3;
        this.f2602d = i17;
        int length = jArr.length;
        if (length <= i17) {
            int iMax = Math.max(length * 2, i17);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            br.l.d(jArrCopyOf, "copyOf(...)");
            this.f2603g = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.f2604r, iMax);
            br.l.d(jArrCopyOf2, "copyOf(...)");
            this.f2604r = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.f2603g;
        jArr2[i16] = (i11 << 32) | (i12 & 4294967295L);
        jArr2[i16 + 1] = (i13 << 32) | (i14 & 4294967295L);
        int i18 = i15 & 67108863;
        jArr2[i16 + 2] = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | (1 << 61) | (Math.min(0, 511) << 52) | (i18 << 26) | (i10 & 67108863);
        if (i15 < 0) {
            return;
        }
        for (int i19 = i16 - 3; i19 >= 0; i19 -= 3) {
            int i20 = i19 + 2;
            long j = jArr2[i20];
            if ((((int) j) & 67108863) == i18) {
                jArr2[i20] = (j & (-2301339409586323457L)) | (Math.min(i16 - i19, 511) << 52);
                return;
            }
        }
    }

    public boolean i() {
        ColorStateList colorStateList;
        return ((Shader) this.f2603g) == null && (colorStateList = (ColorStateList) this.f2604r) != null && colorStateList.isStateful();
    }

    public void j(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f2603g;
        io.sentry.k kVarH0 = io.sentry.k.h0(imageView.getContext(), attributeSet, h.j.AppCompatImageView, i10);
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        i0.m(imageView, imageView.getContext(), h.j.AppCompatImageView, attributeSet, (TypedArray) kVarH0.f12398g, i10, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(h.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = ic.a.r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c1.a(drawable);
            }
            if (typedArray.hasValue(h.j.AppCompatImageView_tint)) {
                imageView.setImageTintList(kVarH0.T(h.j.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(h.j.AppCompatImageView_tintMode)) {
                imageView.setImageTintMode(c1.c(typedArray.getInt(h.j.AppCompatImageView_tintMode, -1), null));
            }
            kVarH0.l0();
        } catch (Throwable th2) {
            kVarH0.l0();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        return new ca.d(-2, r13, r5 + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        return ca.d.f3460d;
     */
    @Override // ca.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ca.d k(ca.l r19, long r20) {
        /*
            r18 = this;
            r0 = r18
            long r5 = r19.getPosition()
            r1 = 112800(0x1b8a0, float:1.58066E-40)
            long r1 = (long) r1
            long r3 = r19.getLength()
            long r3 = r3 - r5
            long r1 = java.lang.Math.min(r1, r3)
            int r1 = (int) r1
            java.lang.Object r2 = r0.f2604r
            fb.f r2 = (fb.f) r2
            r2.v(r1)
            byte[] r3 = r2.f8800a
            r4 = 0
            r7 = r19
            r7.p(r3, r4, r1)
            int r1 = r2.f8802c
            r3 = -1
            r9 = r3
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2d:
            int r11 = r2.a()
            r12 = 188(0xbc, float:2.63E-43)
            if (r11 < r12) goto La1
            byte[] r11 = r2.f8800a
            int r12 = r2.f8801b
        L39:
            if (r12 >= r1) goto L49
            r15 = r11[r12]
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 71
            if (r15 == r7) goto L4e
            int r12 = r12 + 1
            goto L39
        L49:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4e:
            int r7 = r12 + 188
            if (r7 <= r1) goto L53
            goto La6
        L53:
            int r3 = r0.f2602d
            long r3 = ba.m.L(r2, r12, r3)
            int r8 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r0.f2603g
            qb.u r8 = (qb.u) r8
            long r3 = r8.b(r3)
            int r8 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r8 <= 0) goto L82
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 != 0) goto L74
            ca.d r1 = new ca.d
            r2 = -1
            r1.<init>(r2, r3, r5)
            return r1
        L74:
            long r15 = r5 + r9
            ca.d r11 = new ca.d
            r12 = 0
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.<init>(r12, r13, r15)
            return r11
        L82:
            r8 = 100000(0x186a0, double:4.94066E-319)
            long r8 = r8 + r3
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 <= 0) goto L99
            long r1 = (long) r12
            long r11 = r5 + r1
            ca.d r7 = new ca.d
            r8 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r8, r9, r11)
            return r7
        L99:
            long r8 = (long) r12
            r13 = r3
            r9 = r8
        L9c:
            r2.y(r7)
            long r3 = (long) r7
            goto L2d
        La1:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        La6:
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 == 0) goto Lb3
            long r15 = r5 + r3
            ca.d r11 = new ca.d
            r12 = -2
            r11.<init>(r12, r13, r15)
            return r11
        Lb3:
            ca.d r1 = ca.d.f3460d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.f0.k(ca.l, long):ca.d");
    }

    public void n(p7.b bVar) throws IOException {
        b9.e eVar = (b9.e) this.f2604r;
        Cursor cursorB = bVar.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) == 0) {
                    z10 = true;
                }
            }
            cursorB.close();
            bVar.l("CREATE TABLE IF NOT EXISTS `video_test` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `bufferingTime` INTEGER NOT NULL, `loadingTime` INTEGER NOT NULL, `playbackTime` REAL NOT NULL, `videoResolution` TEXT, `videoLength` INTEGER NOT NULL, `testLength` INTEGER NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `networkType` TEXT, `networkProvider` TEXT, `networkSubtype` TEXT, `seen` INTEGER NOT NULL, `network_generation` TEXT NOT NULL)");
            bVar.l("CREATE TABLE IF NOT EXISTS `speed_test` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `dl_speed` INTEGER NOT NULL, `ul_speed` INTEGER NOT NULL, `latency` INTEGER NOT NULL, `network_type` TEXT, `connection_type` INTEGER NOT NULL, `network_name` TEXT, `ssid` TEXT, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `place_type` INTEGER NOT NULL, `seen` INTEGER NOT NULL, `network_provider` TEXT NOT NULL, `network_generation` TEXT NOT NULL)");
            bVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '65c21876625fc494b9070ff750886395')");
            if (!z10) {
                cc.f0 f0VarC = b9.e.C(bVar);
                if (!f0VarC.f3648b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + f0VarC.f3649c);
                }
            }
            bVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '65c21876625fc494b9070ff750886395')");
            List list = ((OpensignalDatabase_Impl) eVar.f2481d).f6079e;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw w.g.d(it);
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ic.a.g(cursorB, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(p7.b r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.f0.o(p7.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x008f A[EDGE_INSN: B:121:0x008f->B:36:0x008f BREAK  A[LOOP:3: B:11:0x002e->B:124:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(p7.b r17, int r18, int r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.f0.p(p7.b, int, int):void");
    }

    public void r(Object obj, Object obj2) {
        int i10 = (this.f2602d + 1) * 2;
        Object[] objArr = (Object[]) this.f2603g;
        if (i10 > objArr.length) {
            this.f2603g = Arrays.copyOf(objArr, oe.e0.e(objArr.length, i10));
        }
        oe.s.b(obj, obj2);
        Object[] objArr2 = (Object[]) this.f2603g;
        int i11 = this.f2602d;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f2602d = i11 + 1;
    }

    public void s(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f2602d) * 2;
            Object[] objArr = (Object[]) this.f2603g;
            if (size > objArr.length) {
                this.f2603g = Arrays.copyOf(objArr, oe.e0.e(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r(entry.getKey(), entry.getValue());
        }
    }

    public void t(int i10) {
        ImageView imageView = (ImageView) this.f2603g;
        if (i10 != 0) {
            Drawable drawableR = ic.a.r(imageView.getContext(), i10);
            if (drawableR != null) {
                c1.a(drawableR);
            }
            imageView.setImageDrawable(drawableR);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public String toString() {
        switch (this.f2601a) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return g();
            case 12:
                StringBuilder sb2 = new StringBuilder();
                if (((ou.z) this.f2603g) == ou.z.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f2602d);
                sb2.append(' ');
                sb2.append((String) this.f2604r);
                String string = sb2.toString();
                br.l.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public List u(CharSequence charSequence) {
        charSequence.getClass();
        i.g0 g0Var = (i.g0) this.f2604r;
        g0Var.getClass();
        ne.m mVar = new ne.m(g0Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mVar.hasNext()) {
            arrayList.add((String) mVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void v(int i10, ar.p pVar) {
        int i11 = i10 & 67108863;
        long[] jArr = (long[]) this.f2603g;
        int i12 = this.f2602d;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 67108863) == i11) {
                long j = jArr[i13];
                long j7 = jArr[i13 + 1];
                pVar.l(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) j7));
                return;
            }
        }
    }

    public void w(String str, e eVar) {
        Map map = (Map) this.f2603g;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(h0.b.s(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, eVar);
        if (this.f2602d > 0) {
            new yh.a(Looper.getMainLooper(), 6).post(new e0(this, eVar, str, 0));
        }
    }

    public void x(Bundle bundle) {
        this.f2602d = 1;
        this.f2604r = bundle;
        for (Map.Entry entry : ((Map) this.f2603g).entrySet()) {
            ((e) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f2603g).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((e) entry.getValue()).f(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public /* synthetic */ f0(Object obj, int i10, Serializable serializable, int i11) {
        this.f2601a = i11;
        this.f2603g = obj;
        this.f2602d = i10;
        this.f2604r = serializable;
    }

    public f0() {
        this.f2601a = 0;
        this.f2603g = Collections.synchronizedMap(new u.e(0));
        this.f2602d = 0;
    }

    public f0(ou.z zVar, int i10, String str) {
        this.f2601a = 12;
        br.l.e(zVar, "protocol");
        this.f2603g = zVar;
        this.f2602d = i10;
        this.f2604r = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(f7.a aVar, b9.e eVar) {
        this(38, 2);
        this.f2601a = 2;
        this.f2603g = aVar;
        this.f2604r = eVar;
    }

    public f0(ImageView imageView) {
        this.f2601a = 10;
        this.f2602d = 0;
        this.f2603g = imageView;
    }

    public f0(u0 u0Var) {
        this.f2601a = 7;
        this.f2603g = new SparseArray();
        this.f2604r = u0Var;
        this.f2602d = -1;
    }

    public f0(f1 f1Var) {
        this.f2601a = 14;
        this.f2603g = new SparseArray();
        this.f2604r = f1Var;
        this.f2602d = -1;
    }

    public f0(Shader shader, ColorStateList colorStateList, int i10) {
        this.f2601a = 3;
        this.f2603g = shader;
        this.f2604r = colorStateList;
        this.f2602d = i10;
    }

    public f0(int i10, qb.u uVar) {
        this.f2601a = 4;
        this.f2602d = i10;
        this.f2603g = uVar;
        this.f2604r = new fb.f();
    }

    public void m(p7.b bVar) {
    }

    public f0(int i10, int i11) {
        this.f2601a = i11;
        switch (i11) {
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                this.f2603g = new Object[i10 * 2];
                this.f2602d = 0;
                break;
            default:
                this.f2602d = i10;
                break;
        }
    }

    public f0(i.g0 g0Var) {
        this.f2601a = 6;
        this.f2604r = g0Var;
        this.f2603g = ne.f.f17521a;
        this.f2602d = Integer.MAX_VALUE;
    }
}
