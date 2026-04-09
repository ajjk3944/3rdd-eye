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

/* compiled from: ProfileVerifier.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final o0.c<c> f16357a = new o0.c<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f16358b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f16359c = null;

    /* compiled from: ProfileVerifier.java */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: ProfileVerifier.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16360a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16361b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16362c;

        /* renamed from: d, reason: collision with root package name */
        public final long f16363d;

        public b(int i, int i10, long j4, long j10) {
            this.f16360a = i;
            this.f16361b = i10;
            this.f16362c = j4;
            this.f16363d = j10;
        }

        public static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public final void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f16360a);
                dataOutputStream.writeInt(this.f16361b);
                dataOutputStream.writeLong(this.f16362c);
                dataOutputStream.writeLong(this.f16363d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f16361b == bVar.f16361b && this.f16362c == bVar.f16362c && this.f16360a == bVar.f16360a && this.f16363d == bVar.f16363d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f16361b), Long.valueOf(this.f16362c), Integer.valueOf(this.f16360a), Long.valueOf(this.f16363d));
        }
    }

    /* compiled from: ProfileVerifier.java */
    public static class c {
    }

    public static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b() {
        c cVar = new c();
        f16359c = cVar;
        f16357a.i(cVar);
        return f16359c;
    }

    public static void c(Context context, boolean z10) {
        b bVarA;
        int i;
        if (z10 || f16359c == null) {
            synchronized (f16358b) {
                if (!z10) {
                    try {
                        if (f16359c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i11 = 0;
                    boolean z11 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z12 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                bVarA = b.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            bVarA = null;
                        }
                        if (bVarA != null && bVarA.f16362c == jA && (i = bVarA.f16361b) != 2) {
                            i11 = i;
                        } else if (z11) {
                            i11 = 1;
                        } else if (z12) {
                            i11 = 2;
                        }
                        if (z10 && z12 && i11 != 1) {
                            i11 = 2;
                        }
                        if (bVarA != null && bVarA.f16361b == 2 && i11 == 1 && length < bVarA.f16363d) {
                            i11 = 3;
                        }
                        b bVar = new b(1, i11, jA, length2);
                        if (bVarA == null || !bVarA.equals(bVar)) {
                            try {
                                bVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
