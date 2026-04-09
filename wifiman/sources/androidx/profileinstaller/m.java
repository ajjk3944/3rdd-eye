package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d f31768a = androidx.concurrent.futures.d.D();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f31769b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f31770c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f31771a;

        /* renamed from: b, reason: collision with root package name */
        final int f31772b;

        /* renamed from: c, reason: collision with root package name */
        final long f31773c;

        /* renamed from: d, reason: collision with root package name */
        final long f31774d;

        b(int i10, int i11, long j10, long j11) {
            this.f31771a = i10;
            this.f31772b = i11;
            this.f31773c = j10;
            this.f31774d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f31771a);
                dataOutputStream.writeInt(this.f31772b);
                dataOutputStream.writeLong(this.f31773c);
                dataOutputStream.writeLong(this.f31774d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f31772b == bVar.f31772b && this.f31773c == bVar.f31773c && this.f31771a == bVar.f31771a && this.f31774d == bVar.f31774d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f31772b), Long.valueOf(this.f31773c), Integer.valueOf(this.f31771a), Long.valueOf(this.f31774d));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f31775a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f31776b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f31777c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f31778d;

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f31775a = i10;
            this.f31777c = z11;
            this.f31776b = z10;
            this.f31778d = z12;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f31770c = cVar;
        f31768a.y(cVar);
        return f31770c;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.profileinstaller.m.c c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.m.c(android.content.Context, boolean):androidx.profileinstaller.m$c");
    }
}
