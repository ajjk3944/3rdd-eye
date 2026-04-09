package org.snmp4j.util;

import java.text.ParseException;
import java.util.StringTokenizer;
import org.snmp4j.smi.Counter32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class SimpleOIDTextFormat implements OIDTextFormat {
    public static String formatOID(int[] iArr) {
        StringBuilder sb2 = new StringBuilder(iArr.length * 3);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 != 0) {
                sb2.append('.');
            }
            sb2.append(iArr[i10] & Counter32.MAX_COUNTER32_VALUE);
        }
        return sb2.toString();
    }

    public static int[] parseOID(String str) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".", true);
        int[] iArr = new int[stringTokenizer.countTokens()];
        int size = 0;
        StringBuffer stringBuffer = null;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (stringBuffer == null && strNextToken.startsWith("'")) {
                stringBuffer = new StringBuffer();
                strNextToken = strNextToken.substring(1);
            }
            if (stringBuffer != null && strNextToken.endsWith("'")) {
                stringBuffer.append(strNextToken.substring(0, strNextToken.length() - 1));
                OID subIndex = new OctetString(stringBuffer.toString()).toSubIndex(true);
                int[] iArr2 = new int[stringTokenizer.countTokens() + iArr.length + subIndex.size()];
                System.arraycopy(iArr, 0, iArr2, 0, size);
                System.arraycopy(subIndex.getValue(), 0, iArr2, size, subIndex.size());
                size += subIndex.size();
                stringBuffer = null;
                iArr = iArr2;
            } else if (stringBuffer != null) {
                stringBuffer.append(strNextToken);
            } else if (!".".equals(strNextToken)) {
                iArr[size] = (int) Long.parseLong(strNextToken.trim());
                size++;
            }
        }
        if (size >= iArr.length) {
            return iArr;
        }
        int[] iArr3 = new int[size];
        System.arraycopy(iArr, 0, iArr3, 0, size);
        return iArr3;
    }

    @Override // org.snmp4j.util.OIDTextFormat
    public String format(int[] iArr) {
        return formatOID(iArr);
    }

    @Override // org.snmp4j.util.OIDTextFormat
    public String formatForRoundTrip(int[] iArr) {
        return format(iArr);
    }

    @Override // org.snmp4j.util.OIDTextFormat
    public int[] parse(String str) throws ParseException {
        return parseOID(str);
    }
}
