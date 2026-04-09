package T2;

import M2.u;
import S4.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f3573c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f3574d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3575e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f3576f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f3577g;

    /* renamed from: k, reason: collision with root package name */
    public static k f3580k;

    /* renamed from: l, reason: collision with root package name */
    public static l f3581l;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3582a;

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f3578h = new ThreadLocal();
    public static final i i = new i(0);

    /* renamed from: j, reason: collision with root package name */
    public static final r f3579j = new r(1);

    /* renamed from: b, reason: collision with root package name */
    public static final r f3572b = new r(2);

    public e(Context context) {
        this.f3582a = context;
    }

    public static int a(Context context) throws NoSuchFieldException, ClassNotFoundException {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(ModuleDescriptor.MODULE_ID.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (u.g(declaredField.get(null), ModuleDescriptor.MODULE_ID)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + ModuleDescriptor.MODULE_ID.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id 'com.google.android.gms.ads.dynamite'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(ModuleDescriptor.MODULE_ID.length() + 45);
            sb3.append("Local module descriptor class for com.google.android.gms.ads.dynamite not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e6) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e6.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e8 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f1 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #5 {all -> 0x00ac, blocks: (B:5:0x0042, B:9:0x00a5, B:16:0x00b1, B:19:0x00b7, B:31:0x00e2, B:119:0x027b, B:120:0x0285, B:128:0x0294, B:130:0x02bc, B:132:0x02cc, B:142:0x02fa, B:143:0x0301, B:123:0x0288, B:124:0x0289, B:125:0x0290, B:144:0x0302, B:145:0x0322, B:146:0x0323, B:147:0x0368), top: B:162:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static T2.e c(android.content.Context r29, S4.r r30) throws T2.b {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.c(android.content.Context, S4.r):T2.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5 A[Catch: all -> 0x003d, TryCatch #11 {, blocks: (B:10:0x002d, B:12:0x0039, B:52:0x00be, B:17:0x0042, B:19:0x0049, B:21:0x004f, B:26:0x0055, B:28:0x0059, B:31:0x0062, B:33:0x006a, B:36:0x0071, B:43:0x009d, B:44:0x00a5, B:39:0x0078, B:41:0x007e, B:42:0x008f, B:47:0x00a8, B:50:0x00ab, B:51:0x00b5, B:18:0x0045), top: B:145:0x002d, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.d(android.content.Context, boolean):int");
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f3577g)) {
            return true;
        }
        boolean z6 = false;
        if (f3577g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (J2.f.f2059b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z6 = true;
            }
            f3577g = Boolean.valueOf(z6);
            if (z6 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f3575e = true;
            }
        }
        if (!z6) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z6;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v7 boolean) = (r3v6 boolean), (r3v9 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r14, boolean r15, boolean r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.f(android.content.Context, boolean, boolean):int");
    }

    public static void g(ClassLoader classLoader) throws b {
        try {
            l lVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                lVar = iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            f3581l = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
            throw new b("Failed to instantiate dynamite loader", e6);
        }
    }

    public static k h(Context context) {
        k kVar;
        synchronized (e.class) {
            k kVar2 = f3580k;
            if (kVar2 != null) {
                return kVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    kVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (kVar != null) {
                    f3580k = kVar;
                    return kVar;
                }
            } catch (Exception e6) {
                String message = e6.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f3582a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e6) {
            throw new b("Failed to instantiate module class: ".concat(str), e6);
        }
    }
}
