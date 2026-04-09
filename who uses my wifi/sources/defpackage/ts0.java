package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ts0 implements fl, ll3, ef1, nf1, ak1, jk1, mp1, gl, u54, rd2, td2, f62, r20, hl {
    public static final /* synthetic */ ts0 f = new ts0();
    public static final /* synthetic */ ts0 g = new ts0();
    public static final /* synthetic */ ts0 h = new ts0();
    public static final /* synthetic */ ts0 i = new ts0();

    public ts0() {
    }

    public static Path j(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    public static oq1 m(final long j) {
        return oq1.f(new gq1() { // from class: sp1
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((iq1) obj).a.y(oq1.b(j));
                    return Optional.empty();
                } catch (fq1 unused) {
                    return Optional.of(ip1.g);
                }
            }
        });
    }

    public static final void n(h2 h2Var, p21 p21Var) {
        File externalStorageDirectory;
        Context context = (Context) p21Var.h;
        String str = (String) p21Var.i;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        String str2 = (String) p21Var.f;
        LinkedHashMap linkedHashMap = (LinkedHashMap) p21Var.g;
        h2Var.e = context;
        h2Var.f = str;
        h2Var.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        h2Var.h = atomicBoolean;
        atomicBoolean.set(((Boolean) o02.c.w()).booleanValue());
        if (((AtomicBoolean) h2Var.h).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            h2Var.i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) h2Var.b).put((String) entry.getKey(), (String) entry.getValue());
        }
        md2.a.execute(new fu1(5, h2Var));
        HashMap map = (HashMap) h2Var.c;
        qz1 qz1Var = qz1.c;
        map.put("action", qz1Var);
        map.put("ad_format", qz1Var);
        map.put("e", qz1.d);
    }

    public static void o(long j, zs1 zs1Var, boolean z) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = (((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8;
        long j11 = j9 % 1629190168;
        long j12 = z ? (j + j) ^ (j >> 63) : j;
        int i2 = 1;
        while (true) {
            long j13 = j10 ^ j11;
            long j14 = j12 >>> 7;
            boolean z2 = j14 != 0 || i2 < 0;
            int i3 = (int) (j12 & j13);
            if (z2) {
                i3 = ((i3 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) zs1Var.g).write((byte) i3);
            if (!z2) {
                return;
            }
            i2++;
            j12 = j14;
        }
    }

    @Override // defpackage.rd2, defpackage.y23
    /* renamed from: a */
    public /* synthetic */ void mo8a() {
    }

    @Override // defpackage.ak1
    public long b(mf1 mf1Var) {
        return -1L;
    }

    @Override // defpackage.td2, defpackage.dp2
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo14c(Object obj) {
        md2.f.execute(new u52((q52) obj, 2));
    }

    @Override // defpackage.mp1
    public byte e(vp1 vp1Var, int i2) {
        return vp1Var.b(i2);
    }

    @Override // defpackage.jk1
    public boolean f(ph4 ph4Var) {
        return false;
    }

    @Override // defpackage.mp1
    public vp1 g(vp1 vp1Var, int i2, int i3) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i2 < 0 || i2 > i3 || i3 > (length = (bArr = vp1Var.a).length) || i2 > i3 || i3 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        if (i4 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, i2, bArr3, 0, i4);
            bArr2 = bArr3;
        }
        return new vp1(bArr2);
    }

    @Override // defpackage.mp1
    /* renamed from: h, reason: collision with other method in class */
    public mp1 mo16h() {
        return new ts0();
    }

    @Override // defpackage.jk1
    public int i(ph4 ph4Var) {
        return 1;
    }

    @Override // defpackage.jk1
    public kk1 k(ph4 ph4Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    public boolean l(CharSequence charSequence) {
        return charSequence instanceof sl0;
    }

    @Override // defpackage.nf1
    public void s() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nf1
    public void v(cg1 cg1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.f62
    public /* synthetic */ Object x(JSONObject jSONObject) {
        Charset charset = h62.a;
        return new ByteArrayInputStream(jSONObject.toString().getBytes(h62.a));
    }

    @Override // defpackage.nf1
    public jg1 z(int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    public ts0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            new cx0(9, view).p = view;
        } else {
            new z71(9, view);
        }
    }

    @Override // defpackage.ll3
    public /* synthetic */ Object a() {
        int i2 = xd1.a;
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.ak1
    public cg1 h() {
        return new qf1(-9223372036854775807L, 0L);
    }

    @Override // defpackage.ll3
    public /* synthetic */ Constructor a() {
        int[] iArr = ff1.h;
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(lf1.class).getConstructor(null);
    }

    @Override // defpackage.ak1
    public void d(long j) {
    }
}
