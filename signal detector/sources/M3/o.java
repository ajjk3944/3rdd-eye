package M3;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC0582Jp;
import com.google.android.gms.internal.ads.C0963bx;
import com.google.android.gms.internal.ads.InterfaceC1071dx;
import com.google.android.gms.internal.ads.O4;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f2870a;

    /* renamed from: b, reason: collision with root package name */
    public int f2871b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2872c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2873d;

    public o() {
        this.f2872c = new long[10];
        this.f2873d = new Object[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C.g a() throws Y2.Q {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.o.a():C.g");
    }

    public synchronized void b() {
        try {
            C0963bx c0963bx = (C0963bx) this.f2873d;
            if (c0963bx.f13503b) {
                InterfaceC1071dx interfaceC1071dx = c0963bx.f13502a;
                interfaceC1071dx.d2((byte[]) this.f2872c);
                interfaceC1071dx.B(this.f2870a);
                interfaceC1071dx.e0(this.f2871b);
                interfaceC1071dx.a3();
                interfaceC1071dx.b();
            }
        } catch (RemoteException e6) {
            Log.d("GASS", "Clearcut log failed", e6);
        }
    }

    public synchronized void c(long j6, Object obj) {
        try {
            if (this.f2871b > 0) {
                if (j6 <= ((long[]) this.f2872c)[((this.f2870a + r0) - 1) % ((Object[]) this.f2873d).length]) {
                    d();
                }
            }
            int length = ((Object[]) this.f2873d).length;
            if (this.f2871b >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i3 = this.f2870a;
                int i6 = length - i3;
                System.arraycopy((long[]) this.f2872c, i3, jArr, 0, i6);
                System.arraycopy((Object[]) this.f2873d, this.f2870a, objArr, 0, i6);
                int i7 = this.f2870a;
                if (i7 > 0) {
                    System.arraycopy((long[]) this.f2872c, 0, jArr, i6, i7);
                    System.arraycopy((Object[]) this.f2873d, 0, objArr, i6, this.f2870a);
                }
                this.f2872c = jArr;
                this.f2873d = objArr;
                this.f2870a = 0;
            }
            int i8 = this.f2870a;
            int i9 = this.f2871b;
            Object[] objArr2 = (Object[]) this.f2873d;
            int length2 = (i8 + i9) % objArr2.length;
            ((long[]) this.f2872c)[length2] = j6;
            objArr2[length2] = obj;
            this.f2871b = i9 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d() {
        this.f2870a = 0;
        this.f2871b = 0;
        Arrays.fill((Object[]) this.f2873d, (Object) null);
    }

    public synchronized int e() {
        return this.f2871b;
    }

    public synchronized Object f() {
        if (this.f2871b == 0) {
            return null;
        }
        return h();
    }

    public synchronized Object g(long j6) {
        Object objH;
        objH = null;
        while (this.f2871b > 0 && j6 - ((long[]) this.f2872c)[this.f2870a] >= 0) {
            objH = h();
        }
        return objH;
    }

    public Object h() {
        AbstractC0582Jp.h0(this.f2871b > 0);
        Object[] objArr = (Object[]) this.f2873d;
        int i = this.f2870a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f2870a = (i + 1) % objArr.length;
        this.f2871b--;
        return obj;
    }

    public o(int i, ArrayList arrayList, int i3, O4 o42) {
        this.f2870a = i;
        this.f2872c = arrayList;
        this.f2871b = i3;
        this.f2873d = o42;
    }

    public /* synthetic */ o(C0963bx c0963bx, byte[] bArr) {
        this.f2873d = c0963bx;
        this.f2872c = bArr;
    }
}
