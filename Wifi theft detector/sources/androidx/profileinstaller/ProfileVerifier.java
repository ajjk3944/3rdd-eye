package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RestrictTo;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ProfileVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final t.b f3596a = t.b.q();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3597b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static CompilationStatus f3598c = null;

    public static class CompilationStatus {

        /* renamed from: a, reason: collision with root package name */
        public final int f3599a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3600b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f3601c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface ResultCode {
        }

        public CompilationStatus(int i10, boolean z10, boolean z11) {
            this.f3599a = i10;
            this.f3601c = z11;
            this.f3600b = z10;
        }
    }

    public static class a {
        @DoNotInline
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3602a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3603b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3604c;

        /* renamed from: d, reason: collision with root package name */
        public final long f3605d;

        public b(int i10, int i11, long j10, long j11) {
            this.f3602a = i10;
            this.f3603b = i11;
            this.f3604c = j10;
            this.f3605d = j11;
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

        public void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3602a);
                dataOutputStream.writeInt(this.f3603b);
                dataOutputStream.writeLong(this.f3604c);
                dataOutputStream.writeLong(this.f3605d);
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f3603b == bVar.f3603b && this.f3604c == bVar.f3604c && this.f3602a == bVar.f3602a && this.f3605d == bVar.f3605d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3603b), Long.valueOf(this.f3604c), Integer.valueOf(this.f3602a), Long.valueOf(this.f3605d));
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static CompilationStatus b(int i10, boolean z10, boolean z11) {
        CompilationStatus compilationStatus = new CompilationStatus(i10, z10, z11);
        f3598c = compilationStatus;
        f3596a.n(compilationStatus);
        return f3598c;
    }

    public static CompilationStatus c(Context context, boolean z10) {
        b bVarA;
        int i10;
        CompilationStatus compilationStatus;
        if (!z10 && (compilationStatus = f3598c) != null) {
            return compilationStatus;
        }
        synchronized (f3597b) {
            if (!z10) {
                try {
                    CompilationStatus compilationStatus2 = f3598c;
                    if (compilationStatus2 != null) {
                        return compilationStatus2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            int i12 = 0;
            if (i11 >= 28 && i11 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
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
                            return b(131072, z11, z12);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA != null && bVarA.f3604c == jA && (i10 = bVarA.f3603b) != 2) {
                        i12 = i10;
                    } else if (z11) {
                        i12 = 1;
                    } else if (z12) {
                        i12 = 2;
                    }
                    if (z10 && z12 && i12 != 1) {
                        i12 = 2;
                    }
                    if (bVarA != null && bVarA.f3603b == 2 && i12 == 1 && length < bVarA.f3605d) {
                        i12 = 3;
                    }
                    int i13 = i12;
                    b bVar = new b(1, i13, jA, length2);
                    if (bVarA == null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i13 = 196608;
                        }
                    }
                    return b(i13, z11, z12);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return b(C.DEFAULT_BUFFER_SEGMENT_SIZE, z11, z12);
                }
            }
            return b(262144, false, false);
        }
    }
}
