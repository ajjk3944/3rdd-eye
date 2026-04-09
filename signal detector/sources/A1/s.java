package A1;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.AbstractC0709Rg;
import com.google.android.gms.internal.ads.C0884aR;
import com.google.android.gms.internal.ads.C0911b;
import com.google.android.gms.internal.ads.C0939bR;
import com.google.android.gms.internal.ads.C1197gC;
import com.google.android.gms.internal.ads.C1476lN;
import com.google.android.gms.internal.ads.C1834s4;
import com.google.android.gms.internal.ads.C1838s8;
import com.google.android.gms.internal.ads.C2108x8;
import com.google.android.gms.internal.ads.ExecutorC1996v4;
import com.google.android.gms.internal.ads.F4;
import com.google.android.gms.internal.ads.GB;
import com.google.android.gms.internal.ads.InterfaceC1048dR;
import com.google.android.gms.internal.ads.InterfaceC2100x0;
import com.google.android.gms.internal.ads.JB;
import com.google.android.gms.internal.ads.L0;
import com.google.android.gms.internal.ads.LB;
import com.google.android.gms.internal.ads.R2;
import com.google.android.gms.internal.ads.T0;
import com.google.android.gms.internal.ads.U2;
import com.google.android.gms.internal.ads.VQ;
import com.google.android.gms.internal.ads.WQ;
import j1.C2543b;
import j1.C2544c;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s implements p, InterfaceC2100x0, InterfaceC1048dR {

    /* renamed from: a, reason: collision with root package name */
    public boolean f122a;

    /* renamed from: b, reason: collision with root package name */
    public Object f123b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f124c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f125d;

    public s(Context context) {
        this.f125d = new Object();
        this.f124c = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public void A(L0 l02) {
        ((InterfaceC2100x0) this.f123b).A(l02);
    }

    @Override // A1.p
    public boolean a() {
        H1.h hVar = (H1.h) this.f124c;
        this.f122a = ((ConnectivityManager) hVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) hVar.get()).registerDefaultNetworkCallback((r) this.f125d);
            return true;
        } catch (RuntimeException e6) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e6);
            }
            return false;
        }
    }

    @Override // A1.p
    public void b() {
        ((ConnectivityManager) ((H1.h) this.f124c).get()).unregisterNetworkCallback((r) this.f125d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1048dR
    public C1197gC c(int i, C2108x8 c2108x8, int[] iArr) {
        C0911b c0911b = (C0911b) this.f123b;
        C0884aR c0884aR = (C0884aR) this.f124c;
        WQ wq = new WQ(c0911b, c0884aR);
        int i3 = ((int[]) this.f125d)[i];
        JB jb = LB.f9635b;
        C1476lN.v(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i6 = 0;
        int i7 = 0;
        while (i6 < c2108x8.f17546a) {
            int i8 = i;
            C2108x8 c2108x82 = c2108x8;
            VQ vq = new VQ(i8, c2108x82, i6, c0884aR, iArr[i6], this.f122a, wq);
            int length = objArrCopyOf.length;
            int i9 = i7 + 1;
            int iD = GB.d(length, i9);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i7] = vq;
            i6++;
            i7 = i9;
            i = i8;
            c2108x8 = c2108x82;
        }
        return LB.o(i7, objArrCopyOf);
    }

    public void d() {
        C2544c.a((C2544c) this.f125d, this, false);
    }

    public File e() {
        File file;
        synchronized (((C2544c) this.f125d)) {
            try {
                C2543b c2543b = (C2543b) this.f123b;
                if (c2543b.f21299f != this) {
                    throw new IllegalStateException();
                }
                if (!c2543b.f21298e) {
                    ((boolean[]) this.f124c)[0] = true;
                }
                file = c2543b.f21297d[0];
                ((C2544c) this.f125d).f21301a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public int[] f() {
        synchronized (this) {
            try {
                if (!this.f122a) {
                    return null;
                }
                long[] jArr = (long[]) this.f123b;
                int length = jArr.length;
                int i = 0;
                int i3 = 0;
                while (i < length) {
                    int i6 = i3 + 1;
                    int i7 = 1;
                    boolean z6 = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.f124c;
                    if (z6 != zArr[i3]) {
                        int[] iArr = (int[]) this.f125d;
                        if (!z6) {
                            i7 = 2;
                        }
                        iArr[i3] = i7;
                    } else {
                        ((int[]) this.f125d)[i3] = 0;
                    }
                    zArr[i3] = z6;
                    i++;
                    i3 = i6;
                }
                this.f122a = false;
                return (int[]) ((int[]) this.f125d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean g(int... iArr) {
        boolean z6;
        q5.i.e(iArr, "tableIds");
        synchronized (this) {
            z6 = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.f123b;
                long j6 = jArr[i];
                jArr[i] = 1 + j6;
                if (j6 == 0) {
                    z6 = true;
                    this.f122a = true;
                }
            }
        }
        return z6;
    }

    public boolean h(int... iArr) {
        boolean z6;
        q5.i.e(iArr, "tableIds");
        synchronized (this) {
            z6 = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.f123b;
                long j6 = jArr[i];
                jArr[i] = j6 - 1;
                if (j6 == 1) {
                    z6 = true;
                    this.f122a = true;
                }
            }
        }
        return z6;
    }

    public /* synthetic */ void i() {
        synchronized (this.f125d) {
            try {
                C1838s8 c1838s8 = (C1838s8) this.f123b;
                if (c1838s8 == null) {
                    return;
                }
                c1838s8.h();
                this.f123b = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public void u() {
        ((InterfaceC2100x0) this.f123b).u();
        if (!this.f122a) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.f125d;
            if (i >= sparseArray.size()) {
                return;
            }
            ((U2) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public T0 x(int i, int i3) {
        InterfaceC2100x0 interfaceC2100x0 = (InterfaceC2100x0) this.f123b;
        if (i3 != 3) {
            this.f122a = true;
            return interfaceC2100x0.x(i, i3);
        }
        SparseArray sparseArray = (SparseArray) this.f125d;
        U2 u22 = (U2) sparseArray.get(i);
        if (u22 != null) {
            return u22;
        }
        U2 u23 = new U2(interfaceC2100x0.x(i, 3), (R2) this.f124c);
        sparseArray.put(i, u23);
        return u23;
    }

    public /* synthetic */ s(C0911b c0911b, C0884aR c0884aR, boolean z6, int[] iArr) {
        this.f123b = c0911b;
        this.f124c = c0884aR;
        this.f122a = z6;
        this.f125d = iArr;
    }

    public s(F4 f42) {
        this.f122a = false;
        this.f123b = null;
        this.f124c = null;
        this.f125d = f42;
    }

    public s(Object obj, C1834s4 c1834s4) {
        this.f122a = false;
        this.f123b = obj;
        this.f124c = c1834s4;
        this.f125d = null;
    }

    public s(InterfaceC2100x0 interfaceC2100x0, R2 r22) {
        this.f123b = interfaceC2100x0;
        this.f124c = r22;
        this.f125d = new SparseArray();
    }

    public s(Context context, C0911b c0911b, Boolean bool) {
        AudioManager audioManagerB = context == null ? null : AbstractC0709Rg.b(context);
        if (audioManagerB == null || (bool != null && bool.booleanValue())) {
            this.f123b = null;
            this.f122a = false;
            this.f124c = null;
            this.f125d = null;
            return;
        }
        Spatializer spatializer = audioManagerB.getSpatializer();
        this.f123b = spatializer;
        this.f122a = spatializer.getImmersiveAudioLevel() != 0;
        C0939bR c0939bR = new C0939bR(this, c0911b);
        this.f125d = c0939bR;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.f124c = handler;
        spatializer.addOnSpatializerStateChangedListener(new ExecutorC1996v4(handler, 2), c0939bR);
    }

    public s(H1.h hVar, o oVar) {
        this.f125d = new r(0, this);
        this.f124c = hVar;
        this.f123b = oVar;
    }

    public s(Context context, String str, C0.s sVar, boolean z6) {
        q5.i.e(context, "context");
        q5.i.e(sVar, "callback");
        this.f123b = context;
        this.f124c = str;
        this.f125d = sVar;
        this.f122a = z6;
    }

    public s(int i) {
        this.f123b = new long[i];
        this.f124c = new boolean[i];
        this.f125d = new int[i];
    }

    public s(C2544c c2544c, C2543b c2543b) {
        this.f125d = c2544c;
        this.f123b = c2543b;
        this.f124c = c2543b.f21298e ? null : new boolean[c2544c.f21307g];
    }
}
