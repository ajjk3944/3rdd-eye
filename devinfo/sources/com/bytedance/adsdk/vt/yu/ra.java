package com.bytedance.adsdk.vt.yu;

import android.util.Pair;
import com.applovin.shadow.okio.Segment;
import d.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ra {
    private final fkw ouw;

    public ra(fkw fkwVar) {
        this.ouw = fkwVar;
    }

    public final File ouw(String str, InputStream inputStream, lh lhVar) throws IOException {
        File file = new File(ouw(), ouw(str, lhVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                while (true) {
                    int i4 = inputStream.read(bArr);
                    if (i4 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i4);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }

    public final File ouw() {
        File fileOuw = this.ouw.ouw();
        if (fileOuw.isFile()) {
            fileOuw.delete();
        }
        if (!fileOuw.exists()) {
            fileOuw.mkdirs();
        }
        return fileOuw;
    }

    public static String ouw(String str, lh lhVar, boolean z3) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z3 ? lhVar.ouw() : lhVar.f7220lh);
        return sb2.toString();
    }

    public final Pair<lh, InputStream> ouw(String str) {
        try {
            File fileOuw = ouw();
            lh lhVar = lh.JSON;
            File file = new File(fileOuw, ouw(str, lhVar, false));
            if (!file.exists()) {
                file = new File(ouw(), ouw(str, lh.ZIP, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (file.getAbsolutePath().endsWith(".zip")) {
                lhVar = lh.ZIP;
            }
            StringBuilder sbA = h.A("Cache hit for ", str, " at ");
            sbA.append(file.getAbsolutePath());
            com.bytedance.adsdk.vt.le.yu.ouw(sbA.toString());
            return new Pair<>(lhVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
