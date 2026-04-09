package G6;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.snmp4j.mp.MPv3;
import z2.InterfaceC8708a;

/* renamed from: G6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2891a {

    /* renamed from: G6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0276a {
        InterfaceC2891a a();

        InterfaceC0276a b(Context context);
    }

    /* renamed from: G6.a$b */
    public interface b {
        void a();
    }

    /* renamed from: G6.a$c */
    public static abstract class c {

        /* renamed from: G6.a$c$a, reason: collision with other inner class name */
        class C0277a implements b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ExecutorService f7045a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ gg.y f7046b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ExecutorService f7047c;

            C0277a(ExecutorService executorService, gg.y yVar, ExecutorService executorService2) {
                this.f7045a = executorService;
                this.f7046b = yVar;
                this.f7047c = executorService2;
            }

            @Override // G6.InterfaceC2891a.b
            public void a() {
                this.f7045a.shutdown();
                this.f7046b.h();
                this.f7047c.shutdown();
            }
        }

        static BluetoothAdapter a() {
            return BluetoothAdapter.getDefaultAdapter();
        }

        static gg.y b() {
            return Eg.a.f(new O6.k());
        }

        static ExecutorService c() {
            return Executors.newSingleThreadExecutor();
        }

        static gg.y d(ExecutorService executorService) {
            return Gg.a.b(executorService);
        }

        static BluetoothManager e(Context context) {
            return (BluetoothManager) context.getSystemService("bluetooth");
        }

        static gg.y f() {
            return Gg.a.a();
        }

        static ExecutorService g() {
            return Executors.newCachedThreadPool();
        }

        static ContentResolver h(Context context) {
            return context.getContentResolver();
        }

        static int i() {
            return Build.VERSION.SDK_INT;
        }

        static byte[] j() {
            return BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
        }

        static byte[] k() {
            return BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        }

        static byte[] l() {
            return BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
        }

        static b m(ExecutorService executorService, gg.y yVar, ExecutorService executorService2) {
            return new C0277a(executorService, yVar, executorService2);
        }

        static boolean n(Context context, int i10) {
            return i10 >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
        }

        static N6.j o(int i10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
            return i10 < 26 ? (N6.j) interfaceC8708a.get() : (N6.j) interfaceC8708a2.get();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        
            if ((r4.requestedPermissionsFlags[r1] & com.google.ar.core.ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static boolean p(android.content.Context r4) throws android.content.pm.PackageManager.NameNotFoundException {
            /*
                r0 = 0
                android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                r2 = 4096(0x1000, float:5.74E-42)
                android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                r1 = r0
            L10:
                java.lang.String[] r2 = r4.requestedPermissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                int r3 = r2.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                if (r1 >= r3) goto L36
                java.lang.String r3 = "android.permission.BLUETOOTH_SCAN"
                r2 = r2[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                boolean r2 = r3.equals(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                if (r2 != 0) goto L23
                int r1 = r1 + 1
                goto L10
            L23:
                int[] r4 = r4.requestedPermissionsFlags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                r4 = r4[r1]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2e
                r1 = 65536(0x10000, float:9.1835E-41)
                r4 = r4 & r1
                if (r4 == 0) goto L2d
                r0 = 1
            L2d:
                return r0
            L2e:
                r4 = move-exception
                java.lang.String r1 = "Could not find application PackageInfo"
                java.lang.Object[] r2 = new java.lang.Object[r0]
                I6.q.e(r4, r1, r2)
            L36:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: G6.InterfaceC2891a.c.p(android.content.Context):boolean");
        }

        static LocationManager q(Context context) {
            return (LocationManager) context.getSystemService("location");
        }

        static gg.s r(int i10, P6.v vVar) {
            return i10 < 23 ? P6.E.b(Boolean.TRUE) : vVar.a();
        }

        static P6.x s(int i10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
            return i10 < 23 ? (P6.x) interfaceC8708a.get() : i10 < 31 ? (P6.x) interfaceC8708a2.get() : (P6.x) interfaceC8708a3.get();
        }

        static String[][] t(int i10, int i11) {
            return Math.min(i10, i11) < 31 ? new String[0][] : new String[][]{new String[]{"android.permission.BLUETOOTH_CONNECT"}};
        }

        static String[][] u(int i10, int i11, boolean z10) {
            int iMin = Math.min(i10, i11);
            return iMin < 23 ? new String[0][] : iMin < 29 ? new String[][]{new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}} : iMin < 31 ? new String[][]{new String[]{"android.permission.ACCESS_FINE_LOCATION"}} : z10 ? new String[][]{new String[]{"android.permission.BLUETOOTH_SCAN"}} : new String[][]{new String[]{"android.permission.BLUETOOTH_SCAN"}, new String[]{"android.permission.ACCESS_FINE_LOCATION"}};
        }

        static N6.q v(int i10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
            return i10 < 24 ? (N6.q) interfaceC8708a.get() : (N6.q) interfaceC8708a2.get();
        }

        static N6.B w(int i10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3) {
            return i10 < 21 ? (N6.B) interfaceC8708a.get() : i10 < 23 ? (N6.B) interfaceC8708a2.get() : (N6.B) interfaceC8708a3.get();
        }

        static int x(Context context) {
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
            } catch (Throwable unused) {
                return MPv3.MAX_MESSAGE_ID;
            }
        }
    }

    G a();
}
