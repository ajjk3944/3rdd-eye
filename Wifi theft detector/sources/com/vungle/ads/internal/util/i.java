package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.AssetFailedToDeleteError;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.JvmStatic;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i {

    @NotNull
    private static final String TAG = "FileUtility";

    @NotNull
    public static final i INSTANCE = new i();

    @NotNull
    private static a objectInputStreamProvider = new a() { // from class: com.vungle.ads.internal.util.h
        @Override // com.vungle.ads.internal.util.i.a
        public final ObjectInputStream provideObjectInputStream(InputStream inputStream) {
            return i.m384objectInputStreamProvider$lambda0(inputStream);
        }
    };

    @NotNull
    private static final List<Class<?>> allowedClasses = z8.r.l(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    public interface a {
        @NotNull
        ObjectInputStream provideObjectInputStream(@Nullable InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private i() {
    }

    @JvmStatic
    public static final void delete(@Nullable File file, @Nullable Set<String> set) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        if (set != null && set.contains(file.getName())) {
                            p.Companion.d(TAG, "Skipping deletion of directory: " + file.getName());
                            return;
                        }
                        deleteContents(file, set);
                    }
                    if (set != null && set.contains(file.getName())) {
                        p.Companion.d(TAG, "Skipping deletion of file: " + file.getName());
                        return;
                    }
                    if (file.delete()) {
                        return;
                    }
                    p.Companion.d(TAG, "Failed to delete file: " + file);
                }
            } catch (Exception e10) {
                p.Companion.e(TAG, "Failed to delete file: " + e10.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void delete$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        delete(file, set);
    }

    @JvmStatic
    public static final void deleteAndLogIfFailed(@NotNull File file) throws IOException {
        kotlin.jvm.internal.p.e(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else {
                if (file.delete()) {
                    return;
                }
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e10) {
            new AssetFailedToDeleteError("Failed to delete " + file.getName() + " with error :" + e10.getMessage()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @JvmStatic
    public static final void deleteContents(@NotNull File folder, @Nullable Set<String> set) {
        kotlin.jvm.internal.p.e(folder, "folder");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            delete(file, set);
        }
    }

    public static /* synthetic */ void deleteContents$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        deleteContents(file, set);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int i10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("|  ");
        }
        String string = sb.toString();
        kotlin.jvm.internal.p.d(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(i iVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return iVar.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m384objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new s(inputStream, allowedClasses);
    }

    @JvmStatic
    public static final void printDirectoryTree(@Nullable File file) {
    }

    private final void printFile(File file, int i10, StringBuilder sb) {
        sb.append(getIndentString(i10));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0028: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:41), block:B:11:0x0028 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.i] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vungle.ads.internal.util.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vungle.ads.internal.util.i$a] */
    @JvmStatic
    @Nullable
    public static final <T> T readSerializable(@NotNull File file) throws Throwable {
        Closeable closeable;
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        Closeable closeable2;
        kotlin.jvm.internal.p.e(file, "file");
        ?? Exists = file.exists();
        Closeable closeable3 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream(Exists);
                } catch (IOException e10) {
                    e = e10;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e11) {
                    e = e11;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e12) {
                    e = e12;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    ?? r02 = INSTANCE;
                    r02.closeQuietly(closeable3);
                    r02.closeQuietly(Exists);
                    throw th;
                }
            } catch (IOException e13) {
                e = e13;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (ClassNotFoundException e14) {
                e = e14;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Exception e15) {
                e = e15;
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
            } catch (IOException e16) {
                e = e16;
                p.Companion.e(TAG, "IOException: " + e.getMessage());
                closeable2 = Exists;
                i iVar = INSTANCE;
                iVar.closeQuietly(objectInputStreamProvideObjectInputStream);
                iVar.closeQuietly(closeable2);
                try {
                    delete$default(file, null, 2, null);
                } catch (IOException unused) {
                }
                return null;
            } catch (ClassNotFoundException e17) {
                e = e17;
                p.Companion.e(TAG, "ClassNotFoundException: " + e.getMessage());
                closeable2 = Exists;
                i iVar2 = INSTANCE;
                iVar2.closeQuietly(objectInputStreamProvideObjectInputStream);
                iVar2.closeQuietly(closeable2);
                delete$default(file, null, 2, null);
                return null;
            } catch (Exception e18) {
                e = e18;
                p.Companion.e(TAG, "cannot read serializable " + e.getMessage());
                closeable2 = Exists;
                i iVar22 = INSTANCE;
                iVar22.closeQuietly(objectInputStreamProvideObjectInputStream);
                iVar22.closeQuietly(closeable2);
                delete$default(file, null, 2, null);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable3 = closeable;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable, java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.vungle.ads.internal.util.i] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.vungle.ads.internal.util.i] */
    @JvmStatic
    public static final void writeSerializable(@NotNull File file, @Nullable Serializable serializable) throws Throwable {
        FileOutputStream fileOutputStream;
        ?? objectOutputStream;
        kotlin.jvm.internal.p.e(file, "file");
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
                    ?? r42 = INSTANCE;
                    r42.closeQuietly(objectOutputStream);
                    r42.closeQuietly(fileOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream2 = fileOutputStream;
                    objectOutputStream = objectOutputStream;
                    try {
                        p.Companion.e(TAG, String.valueOf(e.getMessage()));
                        ?? r43 = INSTANCE;
                        r43.closeQuietly(objectOutputStream);
                        r43.closeQuietly(fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        fileOutputStream2 = objectOutputStream;
                        i iVar = INSTANCE;
                        iVar.closeQuietly(fileOutputStream2);
                        iVar.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = objectOutputStream;
                    i iVar2 = INSTANCE;
                    iVar2.closeQuietly(fileOutputStream2);
                    iVar2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                objectOutputStream = 0;
            } catch (Throwable th3) {
                th = th3;
                i iVar22 = INSTANCE;
                iVar22.closeQuietly(fileOutputStream2);
                iVar22.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            objectOutputStream = 0;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final void closeQuietly(@Nullable Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @NotNull
    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    @VisibleForTesting
    @NotNull
    public final a getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    @NotNull
    public final String guessFileName(@NotNull String url, @Nullable String str) {
        kotlin.jvm.internal.p.e(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, str);
        kotlin.jvm.internal.p.d(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }

    public final boolean isValidUrl(@Nullable String str) {
        if (str != null) {
            try {
                if (!s9.u.d0(str)) {
                    if (HttpUrl.INSTANCE.parse(str) != null) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Nullable
    public final String readString(@NotNull File file) {
        kotlin.jvm.internal.p.e(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return i9.g.k(file, null, 1, null);
        } catch (IOException e10) {
            p.Companion.e(TAG, "IOException: " + e10.getMessage());
            return null;
        } catch (Exception e11) {
            p.Companion.e(TAG, "cannot read string " + e11.getMessage());
            return null;
        }
    }

    @VisibleForTesting
    public final void setObjectInputStreamProvider(@NotNull a aVar) {
        kotlin.jvm.internal.p.e(aVar, "<set-?>");
        objectInputStreamProvider = aVar;
    }

    public final long size(@Nullable File file) {
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

    public final void writeString(@NotNull File file, @Nullable String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.p.e(file, "file");
        if (str == null) {
            return;
        }
        try {
            i9.g.m(file, str, s9.c.f24341b);
        } catch (IOException e10) {
            p.Companion.e(TAG, String.valueOf(e10.getMessage()));
        }
    }

    private final void printDirectoryTree(File file, int i10, StringBuilder sb) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory");
        }
        sb.append(getIndentString(i10));
        sb.append("+--");
        sb.append(file.getName());
        sb.append("/\n");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                printDirectoryTree(file2, i10 + 1, sb);
            } else {
                kotlin.jvm.internal.p.d(file2, "file");
                printFile(file2, i10 + 1, sb);
            }
        }
    }
}
