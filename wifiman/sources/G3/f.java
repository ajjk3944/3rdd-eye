package G3;

import android.content.Context;
import android.content.res.Resources;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public abstract class f {
    public static String a(Context context, e eVar, int i10) throws IOException {
        long jA = eVar.a();
        int iZza = eVar.zza();
        String strD = eVar.d();
        if (strD.isEmpty()) {
            return d(context, "third_party_licenses", jA, iZza, i10);
        }
        try {
            String strC = c(new BufferedInputStream(new FileInputStream(strD)), jA, iZza);
            if (strC != null) {
                if (!strC.isEmpty()) {
                    return strC;
                }
            }
        } catch (FileNotFoundException unused) {
        }
        throw new RuntimeException(strD.concat(" does not contain res/raw/third_party_licenses"));
    }

    public static ArrayList b(Context context, int i10) throws NumberFormatException {
        String[] strArrSplit = d(context.getApplicationContext(), "third_party_license_metadata", 0L, -1, i10).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            if (strArrSplit2.length != 2 || iIndexOf <= 0) {
                throw new IllegalStateException("Invalid license meta-data line:\n".concat(str));
            }
            arrayList.add(e.b(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1]), ""));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static String c(InputStream inputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j10);
            if (i10 <= 0) {
                i10 = MPv3.MAX_MESSAGE_ID;
            }
            while (i10 > 0) {
                int i11 = inputStream.read(bArr, 0, Math.min(i10, 1024));
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
                i10 -= i11;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e10);
            }
        } catch (IOException e11) {
            throw new RuntimeException("Failed to read license or metadata text.", e11);
        }
    }

    private static String d(Context context, String str, long j10, int i10, int i11) {
        Resources resources = context.getApplicationContext().getResources();
        return c(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(i11))), j10, i10);
    }
}
