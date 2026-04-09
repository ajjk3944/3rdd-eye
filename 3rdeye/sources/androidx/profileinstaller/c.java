package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import android.util.Log;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

/* compiled from: ProfileInstaller.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16356a = new a();

    /* compiled from: ProfileInstaller.java */
    public class b implements InterfaceC0258c {
        @Override // androidx.profileinstaller.c.InterfaceC0258c
        public final void a(int i, Serializable serializable) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) serializable);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.c.InterfaceC0258c
        public final void b() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }
    }

    /* compiled from: ProfileInstaller.java */
    /* renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0258c {
        void a(int i, Serializable serializable);

        void b();
    }

    public static void a(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0295 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r18, java.util.concurrent.Executor r19, androidx.profileinstaller.c.InterfaceC0258c r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.c$c, boolean):void");
    }

    /* compiled from: ProfileInstaller.java */
    public class a implements InterfaceC0258c {
        @Override // androidx.profileinstaller.c.InterfaceC0258c
        public final void b() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0258c
        public final void a(int i, Serializable serializable) {
        }
    }
}
