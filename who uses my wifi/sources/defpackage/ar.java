package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ar {
    public static Boolean c = null;
    public static String d = null;
    public static boolean e = false;
    public static int f = -1;
    public static Boolean g;
    public static he4 k;
    public static af4 l;
    public final Context a;
    public static final ThreadLocal h = new ThreadLocal();
    public static final du i = new du(6);
    public static final su2 j = new su2(2);
    public static final tv2 b = new tv2(5, 0);

    public ar(Context context) {
        this.a = context;
    }

    public static int a(Context context) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (a30.c(declaredField.get(null), ModuleDescriptor.MODULE_ID)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id 'com.google.android.gms.ads.dynamite'");
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x0184, TRY_LEAVE, TryCatch #3 {all -> 0x0184, blocks: (B:7:0x0041, B:17:0x0052, B:122:0x01d9, B:123:0x01ea, B:97:0x0179, B:98:0x0183, B:106:0x0192, B:108:0x0199, B:110:0x01a9, B:120:0x01d1, B:121:0x01d8, B:103:0x0189, B:104:0x018a, B:105:0x0191, B:124:0x01eb, B:125:0x020d, B:21:0x0064, B:27:0x0070, B:30:0x0079, B:34:0x007f, B:36:0x0087, B:38:0x008b, B:39:0x0099, B:46:0x00a4, B:54:0x00ca, B:56:0x00d2, B:58:0x00da, B:59:0x00e1, B:53:0x00bc, B:62:0x00e4, B:63:0x00e5, B:64:0x00ec, B:65:0x00ed, B:66:0x00f4, B:69:0x00f7, B:70:0x00f8, B:72:0x00fe, B:74:0x0111, B:76:0x0119, B:82:0x0147, B:84:0x014d, B:85:0x0155, B:86:0x015c, B:77:0x012a, B:78:0x0131, B:80:0x0134, B:81:0x013e, B:87:0x015d, B:88:0x0164, B:89:0x0165, B:90:0x016c, B:96:0x0178), top: B:142:0x0041, inners: #0, #9, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ar c(android.content.Context r18, defpackage.tv2 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar.c(android.content.Context, tv2):ar");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b6 A[Catch: all -> 0x00d6, TryCatch #10 {all -> 0x00d6, blocks: (B:4:0x0004, B:64:0x00cb, B:66:0x00d1, B:73:0x00de, B:105:0x0153, B:114:0x0162, B:130:0x01b6, B:131:0x01b9, B:126:0x01af, B:71:0x00da, B:133:0x01bb, B:5:0x0005, B:8:0x000c, B:9:0x0028, B:62:0x00c8, B:22:0x004c, B:45:0x00a2, B:48:0x00a5, B:55:0x00bd, B:63:0x00ca, B:61:0x00c3), top: B:146:0x0004, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1 A[Catch: all -> 0x0039, TryCatch #12 {, blocks: (B:10:0x0029, B:12:0x0035, B:52:0x00ba, B:17:0x003e, B:19:0x0045, B:21:0x004b, B:26:0x0051, B:28:0x0055, B:31:0x005e, B:33:0x0066, B:36:0x006d, B:43:0x0099, B:44:0x00a1, B:39:0x0074, B:41:0x007a, B:42:0x008b, B:47:0x00a4, B:50:0x00a7, B:51:0x00b1, B:18:0x0041), top: B:147:0x0029, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar.d(android.content.Context, boolean):int");
    }

    public static int e(Context context, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception exc;
        boolean z3;
        try {
            try {
                boolean z4 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(ModuleDescriptor.MODULE_ID).appendQueryParameter("requestStartTime", String.valueOf(((Long) i.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z5 = false;
                            int i2 = cursorQuery.getInt(0);
                            if (i2 > 0) {
                                synchronized (ar.class) {
                                    try {
                                        d = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = cursorQuery.getInt(columnIndex2) != 0;
                                            e = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                fd4 fd4Var = (fd4) h.get();
                                if (fd4Var == null || fd4Var.a != null) {
                                    z4 = false;
                                } else {
                                    fd4Var.a = cursorQuery;
                                }
                                cursor = z4 ? null : cursorQuery;
                                z5 = z3;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z2 && z5) {
                                throw new xq("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i2;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof xq) {
                            throw exc;
                        }
                        throw new xq("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th3) {
                        cursor = cursorQuery;
                        th = th3;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new xq("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void f(ClassLoader classLoader) throws xq {
        try {
            af4 af4Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                af4Var = iInterfaceQueryLocalInterface instanceof af4 ? (af4) iInterfaceQueryLocalInterface : new af4(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            l = af4Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new xq("Failed to instantiate dynamite loader", e2);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(g)) {
            return true;
        }
        boolean z = false;
        if (g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (gz.b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            g = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                e = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static he4 h(Context context) {
        he4 he4Var;
        synchronized (ar.class) {
            he4 he4Var2 = k;
            if (he4Var2 != null) {
                return he4Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    he4Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    he4Var = iInterfaceQueryLocalInterface instanceof he4 ? (he4) iInterfaceQueryLocalInterface : new he4(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (he4Var != null) {
                    k = he4Var;
                    return he4Var;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new xq("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
