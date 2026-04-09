package defpackage;

import android.util.Log;
import com.phuongpn.whousemywifi.networkscanner.global.BaseApplication;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class cf0 {
    public static final HashSet a = new HashSet();
    public static final boolean b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i = Integer.parseInt(strNextToken);
                    int i2 = Integer.parseInt(strNextToken2);
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        b = z;
    }

    public static void a(BaseApplication baseApplication) {
        File file = new File(baseApplication.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b A[Catch: all -> 0x000d, DONT_GENERATE, TRY_LEAVE, TryCatch #6 {all -> 0x000d, blocks: (B:4:0x0005, B:6:0x000b, B:10:0x000f, B:12:0x0018, B:13:0x001c, B:19:0x002b, B:22:0x0030, B:23:0x0037, B:26:0x0047, B:33:0x006a, B:37:0x0071, B:39:0x0073, B:41:0x0075, B:42:0x0078, B:25:0x003b, B:16:0x0021, B:28:0x0055, B:29:0x0059, B:32:0x0061), top: B:59:0x0005, inners: #3, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.phuongpn.whousemywifi.networkscanner.global.BaseApplication r6, java.io.File r7, java.io.File r8) {
        /*
            java.lang.String r0 = "secondary-dexes"
            java.util.HashSet r1 = defpackage.cf0.a
            monitor-enter(r1)
            boolean r2 = r1.contains(r7)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Lf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r6 = move-exception
            goto L79
        Lf:
            r1.add(r7)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r2 = "java.vm.version"
            java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch: java.lang.Throwable -> Ld java.lang.RuntimeException -> L28
            boolean r4 = r3 instanceof dalvik.system.BaseDexClassLoader     // Catch: java.lang.Throwable -> Ld
            if (r4 == 0) goto L21
            goto L29
        L21:
            java.lang.String r3 = "MultiDex"
            java.lang.String r4 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r3, r4)     // Catch: java.lang.Throwable -> Ld
        L28:
            r3 = r2
        L29:
            if (r3 != 0) goto L2d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            goto L72
        L2d:
            a(r6)     // Catch: java.lang.Throwable -> L30
        L30:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Ld
            java.lang.String r5 = "code_cache"
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> Ld
            e(r4)     // Catch: java.lang.Throwable -> Ld java.io.IOException -> L3b
            goto L47
        L3b:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Ld
            java.io.File r8 = r6.getFilesDir()     // Catch: java.lang.Throwable -> Ld
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> Ld
            e(r4)     // Catch: java.lang.Throwable -> Ld
        L47:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> Ld
            r8.<init>(r4, r0)     // Catch: java.lang.Throwable -> Ld
            e(r8)     // Catch: java.lang.Throwable -> Ld
            ff0 r0 = new ff0     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r7, r8)     // Catch: java.lang.Throwable -> Ld
            r7 = 0
            java.util.ArrayList r7 = r0.f(r6, r7)     // Catch: java.lang.Throwable -> L74
            r4 = r3
            dalvik.system.BaseDexClassLoader r4 = (dalvik.system.BaseDexClassLoader) r4     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L74
            d(r4, r8, r7)     // Catch: java.io.IOException -> L60 java.lang.Throwable -> L74
            goto L6a
        L60:
            r7 = 1
            java.util.ArrayList r6 = r0.f(r6, r7)     // Catch: java.lang.Throwable -> L74
            dalvik.system.BaseDexClassLoader r3 = (dalvik.system.BaseDexClassLoader) r3     // Catch: java.lang.Throwable -> L74
            d(r3, r8, r6)     // Catch: java.lang.Throwable -> L74
        L6a:
            r0.close()     // Catch: java.lang.Throwable -> Ld java.io.IOException -> L6e
            goto L6f
        L6e:
            r2 = move-exception
        L6f:
            if (r2 != 0) goto L73
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
        L72:
            return
        L73:
            throw r2     // Catch: java.lang.Throwable -> Ld
        L74:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Ld java.io.IOException -> L78
        L78:
            throw r6     // Catch: java.lang.Throwable -> Ld
        L79:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf0.b(com.phuongpn.whousemywifi.networkscanner.global.BaseApplication, java.io.File, java.io.File):void");
    }

    public static Field c(Object obj, String str) throws NoSuchFieldException, SecurityException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static void d(BaseDexClassLoader baseDexClassLoader, File file, ArrayList arrayList) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IOException, IllegalArgumentException {
        IOException[] iOExceptionArr;
        if (arrayList.isEmpty()) {
            return;
        }
        Object obj = c(baseDexClassLoader, "pathList").get(baseDexClassLoader);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
                Field fieldC = c(obj, "dexElements");
                Object[] objArr2 = (Object[]) fieldC.get(obj);
                Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                fieldC.set(obj, objArr3);
                if (arrayList2.size() > 0) {
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                    }
                    Field fieldC2 = c(obj, "dexElementsSuppressedExceptions");
                    IOException[] iOExceptionArr2 = (IOException[]) fieldC2.get(obj);
                    if (iOExceptionArr2 == null) {
                        iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                    } else {
                        IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                        arrayList2.toArray(iOExceptionArr3);
                        System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                        iOExceptionArr = iOExceptionArr3;
                    }
                    fieldC2.set(obj, iOExceptionArr);
                    IOException iOException = new IOException("I/O exception during makeDexElement");
                    iOException.initCause((Throwable) arrayList2.get(0));
                    throw iOException;
                }
                return;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static void e(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
