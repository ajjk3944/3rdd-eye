package com.bytedance.sdk.component.bw.dg.xq.emc.emc;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ru;
import com.bytedance.sdk.component.utils.uym;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class emc {
    private int emc;
    private File ypw;

    private emc(int i10, File file) {
        this.emc = i10;
        this.ypw = file;
    }

    private static void dg(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static emc emc(int i10, File file) {
        try {
            emc emcVar = new emc(i10, file);
            if (file != null) {
                file.mkdirs();
            }
            return emcVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void xq(File file) {
        if (file == null) {
            return;
        }
        try {
            uym.ypw(file);
        } catch (Throwable unused) {
        }
    }

    private List<File> ypw(File file) {
        List<File> listEmc = emc(file);
        if (listEmc == null || listEmc.isEmpty()) {
            return null;
        }
        final HashMap map = new HashMap();
        for (File file2 : listEmc) {
            map.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(listEmc, new Comparator<File>() { // from class: com.bytedance.sdk.component.bw.dg.xq.emc.emc.emc.1
            @Override // java.util.Comparator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) map.get(file4)).longValue(), ((Long) map.get(file3)).longValue());
            }
        });
        return listEmc;
    }

    private File xq(String str) {
        return new File(this.ypw, str + ".temp");
    }

    public synchronized InputStream emc(String str) {
        FileInputStream fileInputStream;
        if (this.emc <= 0) {
            return null;
        }
        File fileYpw = ypw(str);
        try {
            try {
                fileInputStream = new FileInputStream(fileYpw);
                try {
                    xq(fileYpw);
                    return fileInputStream;
                } catch (FileNotFoundException unused) {
                    ru.emc(fileInputStream);
                    return null;
                }
            } catch (FileNotFoundException unused2) {
                fileInputStream = null;
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    private File ypw(String str) {
        return new File(this.ypw, str);
    }

    public synchronized boolean emc(String str, byte[] bArr) {
        if (this.emc > 0 && str != null && bArr != null) {
            File fileXq = xq(str);
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileXq);
                try {
                    fileOutputStream2.write(bArr);
                    if (fileXq.exists()) {
                        emc(fileXq, ypw(str), true);
                    }
                    ru.emc(fileOutputStream2);
                    List<File> listEmc = emc(this.ypw);
                    if (listEmc != null) {
                        int size = listEmc.size();
                        int i10 = this.emc;
                        if (size > i10) {
                            emc((int) (i10 * 0.7d));
                        }
                    }
                    return true;
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        File file = this.ypw;
                        if (file != null) {
                            file.mkdirs();
                        }
                        ru.emc(fileOutputStream);
                        List<File> listEmc2 = emc(this.ypw);
                        if (listEmc2 != null) {
                            int size2 = listEmc2.size();
                            int i11 = this.emc;
                            if (size2 > i11) {
                                emc((int) (i11 * 0.7d));
                            }
                        }
                        return false;
                    } finally {
                        ru.emc(fileOutputStream);
                        List<File> listEmc3 = emc(this.ypw);
                        if (listEmc3 != null) {
                            int size3 = listEmc3.size();
                            int i12 = this.emc;
                            if (size3 > i12) {
                                emc((int) (i12 * 0.7d));
                            }
                        }
                    }
                } catch (Throwable unused2) {
                    fileOutputStream = fileOutputStream2;
                    return false;
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable unused4) {
            }
        }
        return false;
    }

    private List<File> emc(File file) {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                    List<File> listAsList = Arrays.asList(fileArrListFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listAsList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void emc(int i10) {
        try {
            if (i10 > this.emc) {
                return;
            }
            List<File> listYpw = ypw(this.ypw);
            if (listYpw != null && listYpw.size() > i10) {
                while (i10 < listYpw.size()) {
                    File file = listYpw.get(i10);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i10++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void emc(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            dg(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
