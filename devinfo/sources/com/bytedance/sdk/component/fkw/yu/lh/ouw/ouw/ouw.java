package com.bytedance.sdk.component.fkw.yu.lh.ouw.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.component.utils.tlj;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private int ouw;
    private File vt;

    private ouw(int i4, File file) {
        this.ouw = i4;
        this.vt = file;
    }

    public static ouw ouw(int i4, File file) {
        try {
            ouw ouwVar = new ouw(i4, file);
            if (file != null) {
                file.mkdirs();
            }
            return ouwVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private File vt(String str) {
        return new File(this.vt, str);
    }

    public final synchronized InputStream ouw(String str) {
        if (this.ouw <= 0) {
            return null;
        }
        File fileVt = vt(str);
        try {
            FileInputStream fileInputStream = new FileInputStream(fileVt);
            try {
                ra.vt(fileVt);
            } catch (Throwable unused) {
            }
            return fileInputStream;
        } catch (FileNotFoundException unused2) {
            tlj.ouw(null);
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public final synchronized boolean ouw(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        if (this.ouw > 0 && str != null && bArr != null) {
            File file = new File(this.vt, str.concat(".temp"));
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
            } catch (Throwable unused2) {
            }
            try {
                fileOutputStream.write(bArr);
                if (file.exists()) {
                    File fileVt = vt(str);
                    if (fileVt.exists() && !fileVt.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(fileVt)) {
                        throw new IOException();
                    }
                }
                tlj.ouw(fileOutputStream);
                List<File> listOuw = ouw(this.vt);
                if (listOuw != null) {
                    int size = listOuw.size();
                    int i4 = this.ouw;
                    if (size > i4) {
                        ouw((int) (i4 * 0.7d));
                    }
                }
                return true;
            } catch (FileNotFoundException unused3) {
                fileOutputStream2 = fileOutputStream;
                try {
                    File file2 = this.vt;
                    if (file2 != null) {
                        file2.mkdirs();
                    }
                    tlj.ouw(fileOutputStream2);
                    List<File> listOuw2 = ouw(this.vt);
                    if (listOuw2 != null) {
                        int size2 = listOuw2.size();
                        int i10 = this.ouw;
                        if (size2 > i10) {
                            ouw((int) (i10 * 0.7d));
                        }
                    }
                    return false;
                } finally {
                    tlj.ouw(fileOutputStream2);
                    List<File> listOuw3 = ouw(this.vt);
                    if (listOuw3 != null) {
                        int size3 = listOuw3.size();
                        int i11 = this.ouw;
                        if (size3 > i11) {
                            ouw((int) (i11 * 0.7d));
                        }
                    }
                }
            } catch (Throwable unused4) {
                fileOutputStream2 = fileOutputStream;
                return false;
            }
        }
        return false;
    }

    private static List<File> ouw(File file) {
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

    private synchronized void ouw(int i4) {
        try {
            if (i4 > this.ouw) {
                return;
            }
            List<File> listOuw = ouw(this.vt);
            if (listOuw == null || listOuw.isEmpty()) {
                listOuw = null;
            } else {
                final HashMap map = new HashMap();
                for (File file : listOuw) {
                    map.put(file, Long.valueOf(file.lastModified()));
                }
                Collections.sort(listOuw, new Comparator<File>() { // from class: com.bytedance.sdk.component.fkw.yu.lh.ouw.ouw.ouw.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(File file2, File file3) {
                        File file4 = file2;
                        File file5 = file3;
                        if (file4 == null && file5 == null) {
                            return 0;
                        }
                        if (file4 == null) {
                            return 1;
                        }
                        if (file5 == null) {
                            return -1;
                        }
                        return Long.compare(((Long) map.get(file5)).longValue(), ((Long) map.get(file4)).longValue());
                    }
                });
            }
            if (listOuw != null && listOuw.size() > i4) {
                while (i4 < listOuw.size()) {
                    File file2 = listOuw.get(i4);
                    if (file2 != null && file2.exists()) {
                        file2.delete();
                    }
                    i4++;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
