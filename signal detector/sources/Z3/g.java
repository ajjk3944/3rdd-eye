package Z3;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f4535b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a, reason: collision with root package name */
    public final c f4536a;

    public g(c cVar) {
        this.f4536a = cVar;
    }

    public static void b(b bVar, d dVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(bVar.f4528a);
            try {
                String str = bVar.f4529b;
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = f4535b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Log.d("SplitCompat", "NativeLibraryExtractor: split '" + str + "' has native library '" + strGroup2 + "' for ABI '" + strGroup + "'");
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new f(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str2 : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str2)) {
                        Log.d("SplitCompat", "NativeLibraryExtractor: there are native libraries for supported ABI " + str2 + "; will use this ABI");
                        for (f fVar : (Set) map.get(str2)) {
                            String str3 = fVar.f4533a;
                            if (map2.containsKey(str3)) {
                                Log.d("SplitCompat", "NativeLibraryExtractor: skipping library " + str3 + " for ABI " + str2 + "; already present for a better ABI");
                            } else {
                                map2.put(str3, fVar);
                                Log.d("SplitCompat", "NativeLibraryExtractor: using library " + str3 + " for ABI " + str2);
                            }
                        }
                    } else {
                        Log.d("SplitCompat", "NativeLibraryExtractor: there are no native libraries for supported ABI " + str2);
                    }
                }
                dVar.c(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e6) {
                e = e6;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e7) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e7);
                    }
                }
                throw e;
            }
        } catch (IOException e8) {
            e = e8;
            zipFile = null;
        }
    }

    public final HashSet a() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        c cVar = this.f4536a;
        HashSet hashSetC = cVar.c();
        ArrayList arrayList = new ArrayList();
        File file = new File(cVar.i(), "native-libraries");
        c.g(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Iterator it = hashSetC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Log.i("SplitCompat", "NativeLibraryExtractor: extracted split '" + str + "' has no corresponding split; deleting");
                    File file3 = new File(cVar.i(), "native-libraries");
                    c.g(file3);
                    File fileF = c.f(file3, str);
                    c.g(fileF);
                    c.e(fileF);
                    break;
                }
                if (((b) it.next()).f4529b.equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashSetC.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            HashSet hashSet2 = new HashSet();
            b(bVar, new V2.e(this, hashSet2, bVar, 17, false));
            String str2 = bVar.f4529b;
            HashSet hashSet3 = new HashSet();
            File file4 = new File(cVar.i(), "native-libraries");
            c.g(file4);
            File fileF2 = c.f(file4, str2);
            c.g(fileF2);
            File[] fileArrListFiles2 = fileF2.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file5 : fileArrListFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it3 = hashSet3.iterator();
            while (it3.hasNext()) {
                File file6 = (File) it3.next();
                if (!hashSet2.contains(file6)) {
                    Log.i("SplitCompat", "NativeLibraryExtractor: file '" + file6.getAbsolutePath() + "' found in split '" + str2 + "' that is not in the split file '" + bVar.f4528a.getAbsolutePath() + "'; removing");
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(cVar.i(), "native-libraries");
                    c.g(file7);
                    if (!parentFile.equals(file7)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    c.e(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(b bVar, HashSet hashSet, e eVar) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            String str = bVar.f4529b;
            String str2 = fVar.f4533a;
            c cVar = this.f4536a;
            cVar.getClass();
            File file = new File(cVar.i(), "native-libraries");
            c.g(file);
            File fileF = c.f(file, str);
            c.g(fileF);
            File fileF2 = c.f(fileF, str2);
            boolean z6 = false;
            if (fileF2.exists() && fileF2.length() == fVar.f4534b.getSize() && !fileF2.canWrite()) {
                z6 = true;
            }
            eVar.r(fVar, fileF2, z6);
        }
    }
}
