package org.xbill.DNS.utils;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* loaded from: classes4.dex */
public class hexdump {
    private static final char[] hex = "0123456789ABCDEF".toCharArray();

    public static String dump(String str, byte[] bArr, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(i11);
        stringBuffer2.append(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        stringBuffer.append(stringBuffer2.toString());
        if (str != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" (");
            stringBuffer3.append(str);
            stringBuffer3.append(")");
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append(':');
        int length = (stringBuffer.toString().length() + 8) & (-8);
        stringBuffer.append('\t');
        int i12 = (80 - length) / 3;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 != 0 && i13 % i12 == 0) {
                stringBuffer.append('\n');
                for (int i14 = 0; i14 < length / 8; i14++) {
                    stringBuffer.append('\t');
                }
            }
            byte b10 = bArr[i13 + i10];
            char[] cArr = hex;
            stringBuffer.append(cArr[(b10 & 255) >> 4]);
            stringBuffer.append(cArr[b10 & 15]);
            stringBuffer.append(' ');
        }
        stringBuffer.append('\n');
        return stringBuffer.toString();
    }

    public static String dump(String str, byte[] bArr) {
        return dump(str, bArr, 0, bArr.length);
    }
}
