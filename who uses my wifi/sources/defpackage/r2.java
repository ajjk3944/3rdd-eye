package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class r2 implements kx3, np2 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;
    public Object i;
    public Object j;

    public r2(int i) {
        this.f = i;
        switch (i) {
            case 6:
                this.h = new Object();
                this.i = null;
                this.j = null;
                this.g = 0;
                break;
            default:
                this.h = null;
                this.i = null;
                this.g = 0;
                this.j = new Object();
                break;
        }
    }

    public static final void m(long j) throws yp1 {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new yp1();
        }
    }

    public Looper a() {
        Looper looper;
        Object obj = this.j;
        synchronized (obj) {
            try {
                if (this.g != 0) {
                    ou1.k((HandlerThread) this.h, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.h) == null) {
                    gi2.G("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.h = handlerThread;
                    handlerThread.start();
                    this.i = new wc1(((HandlerThread) this.h).getLooper(), 2);
                    gi2.G("Looper thread started.");
                } else {
                    gi2.G("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.g++;
                looper = ((HandlerThread) this.h).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    @Override // defpackage.kx3
    public byte[] b(int i, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i > this.g) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        q34 q34Var = (q34) this.i;
        ((Mac) q34Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) q34Var.get()).doFinal(), i);
    }

    @Override // defpackage.np2
    /* renamed from: c */
    public /* synthetic */ void mo6c(Object obj) {
        ((rh4) obj).n(0, (kh4) ((wt2) this.h).g, (ch4) this.i, (hh4) this.j, this.g);
    }

    public nx2 d() {
        nx2 nx2Var;
        r2 r2Var = (r2) this.j;
        if (r2Var == null) {
            nx2Var = null;
        } else {
            nx2Var = new nx2(r2Var.g, (String) r2Var.h, (String) r2Var.i, null, null);
        }
        return new nx2(this.g, (String) this.h, (String) this.i, nx2Var, null);
    }

    public void e(long j) throws zp1, yp1 {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        m(j);
        long j10 = j / (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8) ^ (j9 % 899334107));
        if (j10 < 0 || j10 > ((vp1) this.h).a.length) {
            throw new zp1();
        }
        this.g = (int) j10;
    }

    public long f() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        return this.g * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.g);
        jSONObject.put("Message", (String) this.h);
        jSONObject.put("Domain", (String) this.i);
        r2 r2Var = (r2) this.j;
        if (r2Var == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", r2Var.g());
        return jSONObject;
    }

    public void h() {
        HandlerThread handlerThread;
        synchronized (this.h) {
            try {
                zt0.b0(this.g > 0);
                int i = this.g - 1;
                this.g = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.j) != null) {
                    handlerThread.quit();
                    this.j = null;
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long i() throws zp1 {
        try {
            mp1 mp1Var = (mp1) this.i;
            vp1 vp1Var = (vp1) this.h;
            this.g = this.g + 1;
            return mp1Var.e(vp1Var, r2);
        } catch (IndexOutOfBoundsException e) {
            throw new zp1(e);
        }
    }

    public int j() throws zp1 {
        try {
            mp1 mp1Var = (mp1) this.i;
            vp1 vp1Var = (vp1) this.h;
            int i = this.g;
            this.g = i + 1;
            int iE = mp1Var.e(vp1Var, i) & 255;
            mp1 mp1Var2 = (mp1) this.i;
            vp1 vp1Var2 = (vp1) this.h;
            int i2 = this.g;
            this.g = i2 + 1;
            int iE2 = iE | ((mp1Var2.e(vp1Var2, i2) & 255) << 8);
            mp1 mp1Var3 = (mp1) this.i;
            vp1 vp1Var3 = (vp1) this.h;
            int i3 = this.g;
            this.g = i3 + 1;
            int iE3 = iE2 | ((mp1Var3.e(vp1Var3, i3) & 255) << 16);
            mp1 mp1Var4 = (mp1) this.i;
            vp1 vp1Var4 = (vp1) this.h;
            int i4 = this.g;
            this.g = i4 + 1;
            return iE3 | (mp1Var4.e(vp1Var4, i4) << 24);
        } catch (IndexOutOfBoundsException e) {
            throw new zp1(e);
        }
    }

    public long k() throws xp1, zp1 {
        int i = 0;
        long j = 0;
        while (i < 64) {
            try {
                mp1 mp1Var = (mp1) this.i;
                vp1 vp1Var = (vp1) this.h;
                int i2 = this.g;
                this.g = i2 + 1;
                byte bE = mp1Var.e(vp1Var, i2);
                j |= (bE & 127) << i;
                if (i == 63) {
                    if (bE > 1) {
                        throw new xp1();
                    }
                    i = 63;
                }
                if ((bE & 128) == 0) {
                    return (-(j & 1)) ^ (j >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zp1(e);
            }
        }
        throw new xp1();
    }

    public vp1 l(long j) throws zp1, yp1 {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iH = ga1.h((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        m(f() + j);
        int i9 = this.g;
        long j2 = i9;
        vp1 vp1Var = (vp1) this.h;
        long j3 = (j >> ((i8 % 774318984) ^ iH)) + j2;
        if (j3 > vp1Var.a.length || j3 < j2) {
            throw new zp1();
        }
        try {
            int i10 = (int) j3;
            vp1 vp1VarG = ((mp1) this.i).g(vp1Var, i9, i10);
            this.g = i10;
            return vp1VarG;
        } catch (IndexOutOfBoundsException e) {
            throw new AssertionError(up1.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public String toString() {
        switch (this.f) {
            case 0:
                try {
                    return g().toString(2);
                } catch (JSONException unused) {
                    return "Error forming toString output.";
                }
            default:
                return super.toString();
        }
    }

    public r2(int i, String str, String str2, r2 r2Var) {
        this.f = 0;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = r2Var;
    }

    public /* synthetic */ r2(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.g = i;
    }

    public r2(vp1 vp1Var, int i, mp1 mp1Var) {
        this.f = 2;
        this.h = vp1Var;
        this.g = i;
        this.i = mp1Var;
    }

    public r2(hh3 hh3Var, of1 of1Var) {
        this.f = 8;
        yf3 yf3Var = new yf3(of1Var);
        hd4 hd4Var = new hd4(12);
        this.h = hh3Var;
        this.i = yf3Var;
        this.j = hd4Var;
        this.g = 1048576;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public r2(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        int i;
        this.f = 4;
        q34 q34Var = new q34(this);
        this.i = q34Var;
        if (yb.x(2)) {
            this.h = str;
            this.j = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            i = 20;
                            this.g = i;
                            q34Var.get();
                            return;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            i = 28;
                            this.g = i;
                            q34Var.get();
                            return;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            i = 32;
                            this.g = i;
                            q34Var.get();
                            return;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            i = 48;
                            this.g = i;
                            q34Var.get();
                            return;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            i = 64;
                            this.g = i;
                            q34Var.get();
                            return;
                        }
                        break;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public r2(ag2 ag2Var) throws ht3 {
        this.f = 5;
        this.h = ag2Var.getLayoutParams();
        ViewParent parent = ag2Var.getParent();
        this.j = ag2Var.a0();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.i = viewGroup;
            this.g = viewGroup.indexOfChild(ag2Var.p0());
            viewGroup.removeView(ag2Var.p0());
            ag2Var.P0(true);
            return;
        }
        throw new ht3("Could not get the parent of the WebView for an overlay.");
    }
}
