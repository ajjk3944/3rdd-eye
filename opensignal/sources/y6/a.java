package y6;

import dalvik.system.BaseDexClassLoader;
import io.sentry.android.core.e0;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f25870a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f25871b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z10 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i10 = Integer.parseInt(strNextToken);
                    int i11 = Integer.parseInt(strNextToken2);
                    if (i10 > 2 || (i10 == 2 && i11 >= 1)) {
                        z10 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        f25871b = z10;
    }

    public static void a(b bVar) {
        File file = new File(bVar.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                e0.p("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    e0.p("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                file.getPath();
                return;
            }
            e0.p("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[Catch: all -> 0x0011, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0011, blocks: (B:4:0x0009, B:6:0x000f, B:10:0x0014, B:12:0x003e, B:13:0x0042, B:21:0x0057, B:27:0x0065, B:28:0x006c, B:31:0x007c, B:38:0x00a7, B:42:0x00ae, B:44:0x00b0, B:46:0x00b2, B:47:0x00b5, B:30:0x0070, B:26:0x005e, B:16:0x0047, B:19:0x004f, B:33:0x008a, B:34:0x008e, B:37:0x0096, B:23:0x0059), top: B:52:0x0009, inners: #0, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(y6.b r7, java.io.File r8, java.io.File r9) {
        /*
            java.lang.String r0 = "secondary-dexes"
            java.lang.String r1 = ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\""
            java.lang.String r2 = "MultiDex is not guaranteed to work in SDK version "
            java.util.HashSet r3 = y6.a.f25870a
            monitor-enter(r3)
            boolean r4 = r3.contains(r8)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L14
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r7 = move-exception
            goto Lb6
        L14:
            r3.add(r8)     // Catch: java.lang.Throwable -> L11
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "MultiDex"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L11
            r6.append(r4)     // Catch: java.lang.Throwable -> L11
            r6.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L11
            r6.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "\""
            r6.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L11
            io.sentry.android.core.e0.p(r5, r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "MultiDex"
            r2 = 0
            java.lang.ClassLoader r4 = r7.getClassLoader()     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L4e
            boolean r5 = r4 instanceof dalvik.system.BaseDexClassLoader     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto L47
            goto L55
        L47:
            java.lang.String r4 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            io.sentry.android.core.e0.d(r1, r4)     // Catch: java.lang.Throwable -> L11
        L4c:
            r4 = r2
            goto L55
        L4e:
            r4 = move-exception
            java.lang.String r5 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            io.sentry.android.core.e0.q(r1, r5, r4)     // Catch: java.lang.Throwable -> L11
            goto L4c
        L55:
            if (r4 != 0) goto L59
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            goto Laf
        L59:
            a(r7)     // Catch: java.lang.Throwable -> L5d
            goto L65
        L5d:
            r1 = move-exception
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            io.sentry.android.core.e0.q(r5, r6, r1)     // Catch: java.lang.Throwable -> L11
        L65:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L11
            java.lang.String r5 = "code_cache"
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> L11
            e(r1)     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L70
            goto L7c
        L70:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L11
            java.io.File r9 = r7.getFilesDir()     // Catch: java.lang.Throwable -> L11
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> L11
            e(r1)     // Catch: java.lang.Throwable -> L11
        L7c:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L11
            r9.<init>(r1, r0)     // Catch: java.lang.Throwable -> L11
            e(r9)     // Catch: java.lang.Throwable -> L11
            y6.e r0 = new y6.e     // Catch: java.lang.Throwable -> L11
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L11
            r8 = 0
            java.util.ArrayList r8 = r0.i(r7, r8)     // Catch: java.lang.Throwable -> Lb1
            r1 = r4
            dalvik.system.BaseDexClassLoader r1 = (dalvik.system.BaseDexClassLoader) r1     // Catch: java.io.IOException -> L95 java.lang.Throwable -> Lb1
            d(r1, r9, r8)     // Catch: java.io.IOException -> L95 java.lang.Throwable -> Lb1
            goto La7
        L95:
            r8 = move-exception
            java.lang.String r1 = "MultiDex"
            java.lang.String r5 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            io.sentry.android.core.e0.q(r1, r5, r8)     // Catch: java.lang.Throwable -> Lb1
            r8 = 1
            java.util.ArrayList r7 = r0.i(r7, r8)     // Catch: java.lang.Throwable -> Lb1
            dalvik.system.BaseDexClassLoader r4 = (dalvik.system.BaseDexClassLoader) r4     // Catch: java.lang.Throwable -> Lb1
            d(r4, r9, r7)     // Catch: java.lang.Throwable -> Lb1
        La7:
            r0.close()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> Lab
            goto Lac
        Lab:
            r2 = move-exception
        Lac:
            if (r2 != 0) goto Lb0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
        Laf:
            return
        Lb0:
            throw r2     // Catch: java.lang.Throwable -> L11
        Lb1:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> Lb5
        Lb5:
            throw r7     // Catch: java.lang.Throwable -> L11
        Lb6:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L11
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.b(y6.b, java.io.File, java.io.File):void");
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
        StringBuilder sbU = c7.a.u("Field ", str, " not found in ");
        sbU.append(obj.getClass());
        throw new NoSuchFieldException(sbU.toString());
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
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        e0.q("MultiDex", "Exception in makeDexElement", (IOException) it.next());
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
            e0.d("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            e0.d("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
