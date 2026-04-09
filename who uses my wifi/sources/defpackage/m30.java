package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m30 implements t9, u9 {
    public boolean f;
    public boolean g;
    public final Object h;
    public final Object i;
    public Object j;

    public m30() {
        this.f = false;
        this.i = new WeakHashMap();
        this.h = new d6(4, this);
    }

    @Override // defpackage.t9
    public void Y() {
        synchronized (this.j) {
            try {
                if (this.g) {
                    return;
                }
                this.g = true;
                try {
                    yd3 yd3Var = (yd3) ((vd3) this.h).t();
                    ud3 ud3Var = new ud3(1, ((rd3) this.i).b());
                    Parcel parcelU = yd3Var.U();
                    iv1.c(parcelU, ud3Var);
                    yd3Var.M0(parcelU, 2);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    c();
                    throw th;
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int[] a() {
        synchronized (this) {
            try {
                if (this.f && !this.g) {
                    int length = ((long[]) this.h).length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.g = true;
                            this.f = false;
                            return (int[]) this.j;
                        }
                        boolean z = ((long[]) this.h)[i] > 0;
                        boolean[] zArr = (boolean[]) this.i;
                        if (z != zArr[i]) {
                            int[] iArr = (int[]) this.j;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            ((int[]) this.j)[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public synchronized void b(Context context) {
        try {
            if (this.f) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.j = applicationContext;
            if (applicationContext == null) {
                this.j = context;
            }
            mz1.a((Context) this.j);
            iz1 iz1Var = mz1.i4;
            tw1 tw1Var = tw1.e;
            this.g = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) tw1Var.c.a(mz1.Nb)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                ((Context) this.j).registerReceiver((d6) this.h, intentFilter);
            } else {
                ((Context) this.j).registerReceiver((d6) this.h, intentFilter, 4);
            }
            this.f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c() {
        synchronized (this.j) {
            try {
                vd3 vd3Var = (vd3) this.h;
                if (vd3Var.a() || vd3Var.f()) {
                    vd3Var.k();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d(Context context, d6 d6Var) {
        if (this.g) {
            ((WeakHashMap) this.i).remove(d6Var);
        } else {
            context.unregisterReceiver(d6Var);
        }
    }

    public m30(Context context, Looper looper, rd3 rd3Var) {
        this.j = new Object();
        this.f = false;
        this.g = false;
        this.i = rd3Var;
        this.h = new vd3(context, looper, this, this, 12800000);
    }

    public m30(int i) {
        long[] jArr = new long[i];
        this.h = jArr;
        boolean[] zArr = new boolean[i];
        this.i = zArr;
        this.j = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    @Override // defpackage.t9
    public void T(int i) {
    }

    @Override // defpackage.u9
    public void U(rh rhVar) {
    }
}
