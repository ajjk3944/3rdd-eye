package R0;

import U4.m;
import android.media.MediaCodec;
import android.os.Build;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0292n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.ads.C1187g2;
import com.google.android.gms.internal.ads.C1238h;
import com.google.android.gms.internal.ads.C1879sw;
import com.google.android.gms.internal.ads.C2036vr;
import com.google.android.gms.internal.ads.FM;
import com.google.android.gms.internal.ads.InterfaceC1292i;
import com.google.android.gms.internal.ads.OL;
import com.google.android.gms.internal.ads.S0;
import com.google.android.gms.internal.ads.T2;
import com.google.android.gms.internal.ads.Vt;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k0.AbstractComponentCallbacksC2617v;
import k0.C2597a;
import k0.K;
import u.C2938g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f3379a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3380b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3381c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3382d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3383e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3384f;

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public static C1187g2 e(C1187g2 c1187g2, FM fm, T2 t22, C2036vr c2036vr) {
        if (fm.n(1073741824)) {
            long j6 = t22.f11326c;
            int iL = 1;
            c2036vr.y(1);
            C1187g2 c1187g2G = g(c1187g2, j6, c2036vr.f17354a, 1);
            long j7 = j6 + 1;
            byte b5 = c2036vr.f17354a[0];
            int i = b5 & 128;
            int i3 = b5 & 127;
            OL ol = fm.f8092d;
            byte[] bArr = ol.f10177a;
            if (bArr == null) {
                ol.f10177a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z6 = i != 0;
            c1187g2 = g(c1187g2G, j7, ol.f10177a, i3);
            long j8 = j7 + i3;
            if (z6) {
                c2036vr.y(2);
                c1187g2 = g(c1187g2, j8, c2036vr.f17354a, 2);
                j8 += 2;
                iL = c2036vr.L();
            }
            int[] iArr = ol.f10180d;
            if (iArr == null || iArr.length < iL) {
                iArr = new int[iL];
            }
            int[] iArr2 = ol.f10181e;
            if (iArr2 == null || iArr2.length < iL) {
                iArr2 = new int[iL];
            }
            if (z6) {
                int i6 = iL * 6;
                c2036vr.y(i6);
                c1187g2 = g(c1187g2, j8, c2036vr.f17354a, i6);
                j8 += i6;
                c2036vr.E(0);
                for (int i7 = 0; i7 < iL; i7++) {
                    iArr[i7] = c2036vr.L();
                    iArr2[i7] = c2036vr.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = t22.f11325b - ((int) (j8 - t22.f11326c));
            }
            S0 s02 = (S0) t22.f11327d;
            String str = Vt.f12096a;
            byte[] bArr2 = s02.f11102b;
            byte[] bArr3 = ol.f10177a;
            int i8 = s02.f11101a;
            int i9 = s02.f11103c;
            int i10 = s02.f11104d;
            ol.f10182f = iL;
            ol.f10180d = iArr;
            ol.f10181e = iArr2;
            ol.f10178b = bArr2;
            ol.f10177a = bArr3;
            ol.f10179c = i8;
            ol.f10183g = i9;
            ol.f10184h = i10;
            MediaCodec.CryptoInfo cryptoInfo = ol.i;
            cryptoInfo.numSubSamples = iL;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i8;
            if (Build.VERSION.SDK_INT >= 24) {
                C1879sw c1879sw = ol.f10185j;
                c1879sw.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) c1879sw.f16824c;
                pattern.set(i9, i10);
                ((MediaCodec.CryptoInfo) c1879sw.f16823b).setPattern(pattern);
            }
            long j9 = t22.f11326c;
            int i11 = (int) (j8 - j9);
            t22.f11326c = j9 + i11;
            t22.f11325b -= i11;
        }
        if (!fm.n(268435456)) {
            fm.p(t22.f11325b);
            return f(c1187g2, t22.f11326c, fm.f8093e, t22.f11325b);
        }
        c2036vr.y(4);
        C1187g2 c1187g2G2 = g(c1187g2, t22.f11326c, c2036vr.f17354a, 4);
        int iH = c2036vr.h();
        t22.f11326c += 4;
        t22.f11325b -= 4;
        fm.p(iH);
        C1187g2 c1187g2F = f(c1187g2G2, t22.f11326c, fm.f8093e, iH);
        t22.f11326c += iH;
        int i12 = t22.f11325b - iH;
        t22.f11325b = i12;
        ByteBuffer byteBuffer = fm.f8096h;
        if (byteBuffer == null || byteBuffer.capacity() < i12) {
            fm.f8096h = ByteBuffer.allocate(i12);
        } else {
            fm.f8096h.clear();
        }
        return f(c1187g2F, t22.f11326c, fm.f8096h, t22.f11325b);
    }

    public static C1187g2 f(C1187g2 c1187g2, long j6, ByteBuffer byteBuffer, int i) {
        while (j6 >= c1187g2.f14187b) {
            c1187g2 = (C1187g2) c1187g2.f14189d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c1187g2.f14187b - j6));
            C1238h c1238h = (C1238h) c1187g2.f14188c;
            byte[] bArr = c1238h.f14406a;
            long j7 = j6 - c1187g2.f14186a;
            c1238h.getClass();
            byteBuffer.put(bArr, (int) j7, iMin);
            i -= iMin;
            j6 += iMin;
            if (j6 == c1187g2.f14187b) {
                c1187g2 = (C1187g2) c1187g2.f14189d;
            }
        }
        return c1187g2;
    }

    public static C1187g2 g(C1187g2 c1187g2, long j6, byte[] bArr, int i) {
        while (j6 >= c1187g2.f14187b) {
            c1187g2 = (C1187g2) c1187g2.f14189d;
        }
        int i3 = i;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (c1187g2.f14187b - j6));
            C1238h c1238h = (C1238h) c1187g2.f14188c;
            byte[] bArr2 = c1238h.f14406a;
            long j7 = j6 - c1187g2.f14186a;
            c1238h.getClass();
            System.arraycopy(bArr2, (int) j7, bArr, i - i3, iMin);
            i3 -= iMin;
            j6 += iMin;
            if (j6 == c1187g2.f14187b) {
                c1187g2 = (C1187g2) c1187g2.f14189d;
            }
        }
        return c1187g2;
    }

    public void b(boolean z6) {
        int currentItem;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v;
        m mVar = (m) this.f3384f;
        C2938g c2938g = mVar.f3751c;
        K k6 = mVar.f3750b;
        if (k6.M() || ((ViewPager2) this.f3383e).getScrollState() != 0 || c2938g.j() == 0 || mVar.i.size() == 0 || (currentItem = ((ViewPager2) this.f3383e).getCurrentItem()) >= mVar.i.size()) {
            return;
        }
        long j6 = currentItem;
        if ((j6 != this.f3379a || z6) && (abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) c2938g.d(j6)) != null && abstractComponentCallbacksC2617v.v()) {
            this.f3379a = j6;
            k6.getClass();
            C2597a c2597a = new C2597a(k6);
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = null;
            for (int i = 0; i < c2938g.j(); i++) {
                long jG = c2938g.g(i);
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v3 = (AbstractComponentCallbacksC2617v) c2938g.k(i);
                if (abstractComponentCallbacksC2617v3.v()) {
                    if (jG != this.f3379a) {
                        c2597a.i(abstractComponentCallbacksC2617v3, EnumC0292n.f5246d);
                    } else {
                        abstractComponentCallbacksC2617v2 = abstractComponentCallbacksC2617v3;
                    }
                    boolean z7 = jG == this.f3379a;
                    if (abstractComponentCallbacksC2617v3.f21693Q != z7) {
                        abstractComponentCallbacksC2617v3.f21693Q = z7;
                    }
                }
            }
            if (abstractComponentCallbacksC2617v2 != null) {
                c2597a.i(abstractComponentCallbacksC2617v2, EnumC0292n.f5247e);
            }
            if (c2597a.f21586a.isEmpty()) {
                return;
            }
            c2597a.e();
        }
    }

    public void c(long j6) {
        C1187g2 c1187g2;
        if (j6 != -1) {
            while (true) {
                c1187g2 = (C1187g2) this.f3382d;
                if (j6 < c1187g2.f14187b) {
                    break;
                }
                ((InterfaceC1292i) this.f3380b).n((C1238h) c1187g2.f14188c);
                C1187g2 c1187g22 = (C1187g2) this.f3382d;
                c1187g22.f14188c = null;
                C1187g2 c1187g23 = (C1187g2) c1187g22.f14189d;
                c1187g22.f14189d = null;
                this.f3382d = c1187g23;
            }
            if (((C1187g2) this.f3383e).f14186a < c1187g2.f14186a) {
                this.f3383e = c1187g2;
            }
        }
    }

    public int d(int i) {
        C1187g2 c1187g2 = (C1187g2) this.f3384f;
        if (((C1238h) c1187g2.f14188c) == null) {
            C1238h c1238hA = ((InterfaceC1292i) this.f3380b).a();
            C1187g2 c1187g22 = new C1187g2(((C1187g2) this.f3384f).f14187b);
            c1187g2.f14188c = c1238hA;
            c1187g2.f14189d = c1187g22;
        }
        return Math.min(i, (int) (((C1187g2) this.f3384f).f14187b - this.f3379a));
    }
}
