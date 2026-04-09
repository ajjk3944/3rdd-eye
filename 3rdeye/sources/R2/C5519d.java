package r2;

import N7.C1154e9;
import T1.t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: NetworkCache.java */
/* renamed from: r2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5519d {

    /* renamed from: a, reason: collision with root package name */
    public final t f45673a;

    public C5519d(t tVar) {
        this.f45673a = tVar;
    }

    public static String a(String str, EnumC5518c enumC5518c, boolean z10) {
        String strTempExtension = z10 ? enumC5518c.tempExtension() : enumC5518c.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strTempExtension.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b10)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return C1154e9.i("lottie_cache_", strReplaceAll, strTempExtension);
    }

    public final File b(String str) throws FileNotFoundException {
        File file = new File(c(), a(str, EnumC5518c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(c(), a(str, EnumC5518c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(c(), a(str, EnumC5518c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public final File c() {
        t tVar = this.f45673a;
        tVar.getClass();
        File file = new File(tVar.f12220a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File d(String str, InputStream inputStream, EnumC5518c enumC5518c) throws IOException {
        File file = new File(c(), a(str, enumC5518c, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
