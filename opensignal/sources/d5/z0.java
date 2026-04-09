package d5;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7141a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7142b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7143c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7144d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7145e;

    public /* synthetic */ z0(boolean z10) {
        this.f7141a = 2;
    }

    public ou.m a() {
        return new ou.m(this.f7142b, this.f7143c, (String[]) this.f7144d, (String[]) this.f7145e);
    }

    public void b(String... strArr) {
        br.l.e(strArr, "cipherSuites");
        if (!this.f7142b) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f7144d = (String[]) strArr.clone();
    }

    public void c(ou.l... lVarArr) {
        br.l.e(lVarArr, "cipherSuites");
        if (!this.f7142b) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (ou.l lVar : lVarArr) {
            arrayList.add(lVar.f19941a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void d(boolean z10) {
        switch (this.f7141a) {
            case 0:
                if (z10 && ((PowerManager.WakeLock) this.f7145e) == null) {
                    PowerManager powerManager = (PowerManager) this.f7144d;
                    if (powerManager == null) {
                        a5.a.B("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        break;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f7145e = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
                this.f7142b = z10;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f7145e;
                if (wakeLock != null) {
                    if (!z10 || !this.f7143c) {
                        wakeLock.release();
                        break;
                    } else {
                        wakeLock.acquire();
                        break;
                    }
                }
                break;
            default:
                if (z10 && ((WifiManager.WifiLock) this.f7145e) == null) {
                    WifiManager wifiManager = (WifiManager) this.f7144d;
                    if (wifiManager == null) {
                        a5.a.B("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                        break;
                    } else {
                        WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                        this.f7145e = wifiLockCreateWifiLock;
                        wifiLockCreateWifiLock.setReferenceCounted(false);
                    }
                }
                this.f7142b = z10;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f7145e;
                if (wifiLock != null) {
                    if (!z10 || !this.f7143c) {
                        wifiLock.release();
                        break;
                    } else {
                        wifiLock.acquire();
                        break;
                    }
                }
                break;
        }
    }

    public void e(String... strArr) {
        br.l.e(strArr, "tlsVersions");
        if (!this.f7142b) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f7145e = (String[]) strArr.clone();
    }

    public void f(ou.h0... h0VarArr) {
        if (!this.f7142b) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(h0VarArr.length);
        for (ou.h0 h0Var : h0VarArr) {
            arrayList.add(h0Var.javaName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public z0(Context context, int i10) {
        this.f7141a = i10;
        switch (i10) {
            case 1:
                this.f7144d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                break;
            default:
                this.f7144d = (PowerManager) context.getApplicationContext().getSystemService("power");
                break;
        }
    }

    public z0(int i10) {
        this.f7141a = i10;
        switch (i10) {
            case 3:
                break;
            default:
                this.f7142b = true;
                break;
        }
    }
}
