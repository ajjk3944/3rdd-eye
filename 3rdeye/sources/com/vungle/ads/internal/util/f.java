package com.vungle.ads.internal.util;

import N7.H7;
import U9.t;
import android.os.Build;
import android.webkit.URLUtil;
import c9.C2092m;
import com.vungle.ads.internal.util.k;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import m9.C5338c;
import y9.C5819a;

/* compiled from: FileUtility.kt */
/* loaded from: classes2.dex */
public final class f {
    public static final f INSTANCE = new f();
    private static a objectInputStreamProvider = new H7(27);
    private static final String TAG = f.class.getSimpleName();
    private static final List<Class<?>> allowedClasses = C2092m.W(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    /* compiled from: FileUtility.kt */
    public interface a {
        ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private f() {
    }

    public static final void delete(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        deleteContents(file);
                    }
                    if (file.delete()) {
                        return;
                    }
                    k.a aVar = k.Companion;
                    String TAG2 = TAG;
                    kotlin.jvm.internal.l.e(TAG2, "TAG");
                    aVar.d(TAG2, "Failed to delete file: " + file);
                }
            } catch (Exception e4) {
                k.a aVar2 = k.Companion;
                String TAG3 = TAG;
                kotlin.jvm.internal.l.e(TAG3, "TAG");
                aVar2.e(TAG3, "Failed to delete file: " + e4.getLocalizedMessage());
            }
        }
    }

    public static final void deleteAndLogIfFailed(File file) {
        kotlin.jvm.internal.l.f(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
                return;
            }
            if (file.delete()) {
                return;
            }
            k.a aVar = k.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.l.e(TAG2, "TAG");
            aVar.e(TAG2, "Cannot delete " + file.getName());
        } catch (Exception e4) {
            k.a aVar2 = k.Companion;
            String TAG3 = TAG;
            kotlin.jvm.internal.l.e(TAG3, "TAG");
            aVar2.e(TAG3, "Cannot delete " + file.getName(), e4);
        }
    }

    public static final void deleteContents(File folder) {
        kotlin.jvm.internal.l.f(folder, "folder");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            delete(file);
        }
    }

    private final String getIndentString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < i; i10++) {
            sb.append("|  ");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(f fVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fVar.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m112objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new o(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(File file) {
    }

    private final void printFile(File file, int i, StringBuilder sb) {
        sb.append(getIndentString(i));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002f: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:48), block:B:11:0x002f */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.f] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.vungle.ads.internal.util.f] */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.vungle.ads.internal.util.f$a] */
    public static final <T> T readSerializable(File file) throws Throwable {
        Closeable closeable;
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        Closeable closeable2;
        kotlin.jvm.internal.l.f(file, "file");
        ?? Exists = file.exists();
        Closeable closeable3 = null;
        try {
            if (Exists != 0) {
                try {
                    Exists = new FileInputStream(file);
                    try {
                        objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream(Exists);
                    } catch (IOException e4) {
                        e = e4;
                        objectInputStreamProvideObjectInputStream = null;
                    } catch (ClassNotFoundException e10) {
                        e = e10;
                        objectInputStreamProvideObjectInputStream = null;
                    } catch (Exception e11) {
                        e = e11;
                        objectInputStreamProvideObjectInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        ?? r02 = INSTANCE;
                        r02.closeQuietly(closeable3);
                        r02.closeQuietly(Exists);
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                    Exists = 0;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e13) {
                    e = e13;
                    Exists = 0;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e14) {
                    e = e14;
                    Exists = 0;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    Exists = 0;
                }
                try {
                    T t10 = (T) objectInputStreamProvideObjectInputStream.readObject();
                    ?? r03 = INSTANCE;
                    r03.closeQuietly(objectInputStreamProvideObjectInputStream);
                    r03.closeQuietly(Exists);
                    return t10;
                } catch (IOException e15) {
                    e = e15;
                    k.a aVar = k.Companion;
                    String TAG2 = TAG;
                    kotlin.jvm.internal.l.e(TAG2, "TAG");
                    aVar.e(TAG2, "IOException: " + e.getMessage());
                    closeable2 = Exists;
                    f fVar = INSTANCE;
                    fVar.closeQuietly(objectInputStreamProvideObjectInputStream);
                    fVar.closeQuietly(closeable2);
                    try {
                        delete(file);
                    } catch (IOException unused) {
                    }
                    return null;
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    k.a aVar2 = k.Companion;
                    String TAG3 = TAG;
                    kotlin.jvm.internal.l.e(TAG3, "TAG");
                    aVar2.e(TAG3, "ClassNotFoundException: " + e.getMessage());
                    closeable2 = Exists;
                    f fVar2 = INSTANCE;
                    fVar2.closeQuietly(objectInputStreamProvideObjectInputStream);
                    fVar2.closeQuietly(closeable2);
                    delete(file);
                    return null;
                } catch (Exception e17) {
                    e = e17;
                    k.a aVar3 = k.Companion;
                    String TAG4 = TAG;
                    kotlin.jvm.internal.l.e(TAG4, "TAG");
                    aVar3.e(TAG4, "cannot read serializable " + e.getMessage());
                    closeable2 = Exists;
                    f fVar22 = INSTANCE;
                    fVar22.closeQuietly(objectInputStreamProvideObjectInputStream);
                    fVar22.closeQuietly(closeable2);
                    delete(file);
                    return null;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            closeable3 = closeable;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable, java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.vungle.ads.internal.util.f] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.vungle.ads.internal.util.f] */
    public static final void writeSerializable(File file, Serializable serializable) throws Throwable {
        FileOutputStream fileOutputStream;
        ?? objectOutputStream;
        kotlin.jvm.internal.l.f(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeObject(serializable);
                    objectOutputStream.reset();
                    ?? r52 = INSTANCE;
                    r52.closeQuietly(objectOutputStream);
                    r52.closeQuietly(fileOutputStream);
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream2 = fileOutputStream;
                    objectOutputStream = objectOutputStream;
                    try {
                        k.a aVar = k.Companion;
                        String TAG2 = TAG;
                        kotlin.jvm.internal.l.e(TAG2, "TAG");
                        aVar.e(TAG2, String.valueOf(e.getMessage()));
                        ?? r53 = INSTANCE;
                        r53.closeQuietly(objectOutputStream);
                        r53.closeQuietly(fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        fileOutputStream2 = objectOutputStream;
                        f fVar = INSTANCE;
                        fVar.closeQuietly(fileOutputStream2);
                        fVar.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = objectOutputStream;
                    f fVar2 = INSTANCE;
                    fVar2.closeQuietly(fileOutputStream2);
                    fVar2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                objectOutputStream = 0;
            } catch (Throwable th3) {
                th = th3;
                f fVar22 = INSTANCE;
                fVar22.closeQuietly(fileOutputStream2);
                fVar22.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            objectOutputStream = 0;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    public final a getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final String guessFileName(String url, String str) {
        kotlin.jvm.internal.l.f(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, str);
        kotlin.jvm.internal.l.e(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }

    public final boolean isValidUrl(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        t tVarA = null;
        try {
            t.a aVar = new t.a();
            aVar.c(null, str);
            tVarA = aVar.a();
        } catch (IllegalArgumentException unused) {
        }
        return tVarA != null;
    }

    public final String readString(File file) {
        kotlin.jvm.internal.l.f(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return C5338c.L(file);
        } catch (IOException e4) {
            k.a aVar = k.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.l.e(TAG2, "TAG");
            aVar.e(TAG2, "IOException: " + e4.getMessage());
            return null;
        } catch (Exception e10) {
            k.a aVar2 = k.Companion;
            String TAG3 = TAG;
            kotlin.jvm.internal.l.e(TAG3, "TAG");
            aVar2.e(TAG3, "cannot read string " + e10.getMessage());
            return null;
        }
    }

    public final void setObjectInputStreamProvider(a aVar) {
        kotlin.jvm.internal.l.f(aVar, "<set-?>");
        objectInputStreamProvider = aVar;
    }

    public final long size(File file) {
        long size = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File file2 : fileArrListFiles) {
                    size += size(file2);
                }
            }
        }
        return size;
    }

    public final void writeString(File file, String str) {
        kotlin.jvm.internal.l.f(file, "file");
        if (str == null) {
            return;
        }
        try {
            C5338c.M(file, str, C5819a.f48359b);
        } catch (IOException e4) {
            k.a aVar = k.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.l.e(TAG2, "TAG");
            aVar.e(TAG2, String.valueOf(e4.getMessage()));
        }
    }

    private final void printDirectoryTree(File file, int i, StringBuilder sb) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        sb.append(getIndentString(i));
        sb.append("+--");
        sb.append(file.getName());
        sb.append("/\n");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                printDirectoryTree(file2, i + 1, sb);
            } else {
                printFile(file2, i + 1, sb);
            }
        }
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }
}
