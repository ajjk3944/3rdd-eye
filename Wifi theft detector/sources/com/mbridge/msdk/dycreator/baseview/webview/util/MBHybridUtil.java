package com.mbridge.msdk.dycreator.baseview.webview.util;

import android.net.Uri;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class MBHybridUtil {
    public static String convert2Unicode(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuilder sb = new StringBuilder(1000);
        sb.setLength(0);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 255) {
                int i11 = 0;
                while (true) {
                    if (i11 >= 2) {
                        sb.append(cCharAt);
                        break;
                    }
                    if (cArr[i11] == cCharAt) {
                        sb.append("\\" + cCharAt);
                        break;
                    }
                    i11++;
                }
            } else {
                sb.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    sb.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                sb.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    sb.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                sb.append(upperCase2);
            }
        }
        return new String(sb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getImageMimeType(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r4 = r4.getPath()
            r0 = 1
            r2 = -1
            if (r4 == 0) goto L23
            java.lang.String r3 = "."
            int r3 = r4.lastIndexOf(r3)
            if (r3 == r2) goto L23
            int r3 = r3 + r0
            java.lang.String r4 = r4.substring(r3)
            goto L24
        L23:
            r4 = r1
        L24:
            r4.getClass()
            int r3 = r4.hashCode()
            switch(r3) {
                case 102340: goto L5a;
                case 105441: goto L51;
                case 111145: goto L46;
                case 3268712: goto L3b;
                case 3645340: goto L30;
                default: goto L2e;
            }
        L2e:
            r0 = r2
            goto L64
        L30:
            java.lang.String r0 = "webp"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L39
            goto L2e
        L39:
            r0 = 4
            goto L64
        L3b:
            java.lang.String r0 = "jpeg"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L44
            goto L2e
        L44:
            r0 = 3
            goto L64
        L46:
            java.lang.String r0 = "png"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4f
            goto L2e
        L4f:
            r0 = 2
            goto L64
        L51:
            java.lang.String r3 = "jpg"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L64
            goto L2e
        L5a:
            java.lang.String r0 = "gif"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L63
            goto L2e
        L63:
            r0 = 0
        L64:
            switch(r0) {
                case 0: goto L71;
                case 1: goto L6e;
                case 2: goto L6b;
                case 3: goto L6e;
                case 4: goto L68;
                default: goto L67;
            }
        L67:
            return r1
        L68:
            java.lang.String r4 = "image/webp"
            return r4
        L6b:
            java.lang.String r4 = "image/png"
            return r4
        L6e:
            java.lang.String r4 = "image/jpeg"
            return r4
        L71:
            java.lang.String r4 = "image/gif"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.webview.util.MBHybridUtil.getImageMimeType(java.lang.String):java.lang.String");
    }

    public static Set<String> getQueryParameterNames(Uri uri) {
        if (uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i10);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i10, iIndexOf2)));
            i10 = iIndexOf + 1;
        } while (i10 < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("MBHybridUtil", r7.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getQueryParameters(android.net.Uri r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r7.getEncodedQuery()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r3 = 0
        L11:
            r4 = 38
            int r4 = r1.indexOf(r4, r3)
            r5 = -1
            if (r4 != r5) goto L1e
            int r4 = r1.length()
        L1e:
            r6 = 61
            int r6 = r1.indexOf(r6, r3)
            if (r6 > r4) goto L28
            if (r6 != r5) goto L29
        L28:
            r6 = r4
        L29:
            java.lang.String r3 = r1.substring(r3, r6)
            java.lang.String r3 = android.net.Uri.decode(r3)
            r2.add(r3)
            int r3 = r4 + 1
            int r4 = r1.length()
            if (r3 < r4) goto L11
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L59
            r1.<init>()     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L59
        L45:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = r7.getQueryParameter(r3)     // Catch: java.lang.Throwable -> L59
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L59
            goto L45
        L59:
            r7 = move-exception
            goto L60
        L5b:
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L59
            return r7
        L60:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r1 = "MBHybridUtil"
            com.mbridge.msdk.foundation.tools.q0.b(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.webview.util.MBHybridUtil.getQueryParameters(android.net.Uri):java.lang.String");
    }
}
