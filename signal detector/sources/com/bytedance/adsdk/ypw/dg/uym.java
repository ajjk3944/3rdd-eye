package com.bytedance.adsdk.ypw.dg;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class uym {
    private final bw emc;

    public uym(bw bwVar) {
        this.emc = bwVar;
    }

    private File ypw(String str) {
        File file = new File(emc(), emc(str, xq.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(emc(), emc(str, xq.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public Pair<xq, InputStream> emc(String str) {
        try {
            File fileYpw = ypw(str);
            if (fileYpw == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileYpw);
            xq xqVar = fileYpw.getAbsolutePath().endsWith(".zip") ? xq.ZIP : xq.JSON;
            fileYpw.getAbsolutePath();
            return new Pair<>(xqVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File emc(String str, InputStream inputStream, xq xqVar) throws IOException {
        File file = new File(emc(), emc(str, xqVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public void emc(String str, xq xqVar) {
        File file = new File(emc(), emc(str, xqVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File emc() {
        File fileEmc = this.emc.emc();
        if (fileEmc.isFile()) {
            fileEmc.delete();
        }
        if (!fileEmc.exists()) {
            fileEmc.mkdirs();
        }
        return fileEmc;
    }

    private static String emc(String str, xq xqVar, boolean z6) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z6 ? xqVar.emc() : xqVar.xq);
        return sb.toString();
    }
}
