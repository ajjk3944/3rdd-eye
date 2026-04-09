package com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.core.ryl.lh.ouw;
import com.bytedance.sdk.openadsdk.core.ryl.ouw.vt;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends com.bytedance.sdk.openadsdk.core.ryl.ouw.vt {
    public static final String ra = null;

    public yu(Context context, int i4, int i10) {
        super(context, i4, i10);
    }

    public static int vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.ryl.ouw.vt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.sdk.openadsdk.core.ryl.ouw ouw(java.lang.String r5, java.io.File r6, java.util.List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> r7) {
        /*
            r4 = this;
            r0 = 0
            r4.fkw = r0
            android.content.Context r1 = r4.vt
            r2 = 0
            if (r1 != 0) goto Lc
            r5 = -1
            r4.fkw = r5
            return r2
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L18
            if (r6 != 0) goto L18
            r5 = -2
            r4.fkw = r5
            return r2
        L18:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            java.lang.String r3 = "UTF-8"
            if (r1 != 0) goto L2c
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            byte[] r5 = r5.getBytes(r3)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            goto L32
        L2a:
            r5 = move-exception
            goto L5c
        L2c:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r6 = r5
        L32:
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r5.setFeature(r1, r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r5.setInput(r6, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r5.nextTag()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            com.bytedance.sdk.openadsdk.core.ryl.ouw r5 = r4.ouw(r5, r7)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r4.ouw(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r6.close()     // Catch: java.io.IOException -> L4b
        L4b:
            return r5
        L4c:
            r5 = move-exception
            r2 = r6
            goto L5c
        L4f:
            r6 = r2
        L50:
            r5 = -3
            r4.fkw = r5     // Catch: java.lang.Throwable -> L4c
            r4.ouw(r2)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L5b
            r6.close()     // Catch: java.io.IOException -> L5b
        L5b:
            return r2
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L61
        L61:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu.ouw(java.lang.String, java.io.File, java.util.List):com.bytedance.sdk.openadsdk.core.ryl.ouw");
    }

    public static void vt(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == 3) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        ouw.vt f8415lh;
        String ouw;
        ouw.EnumC0095ouw vt;
        String yu;
        final List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> fkw = new ArrayList();

        /* renamed from: le, reason: collision with root package name */
        final List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f8414le = new ArrayList();
        float ra = Float.MIN_VALUE;

        public ouw() {
        }

        public final void ouw(String str, ouw.EnumC0095ouw enumC0095ouw, ouw.vt vtVar) {
            this.ouw = str;
            this.vt = enumC0095ouw;
            this.f8415lh = vtVar;
        }

        public ouw(String str, ouw.EnumC0095ouw enumC0095ouw, ouw.vt vtVar) {
            ouw(str, enumC0095ouw, vtVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d1, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.ryl.ouw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.ryl.ouw vt(org.xmlpull.v1.XmlPullParser r19, java.util.List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> r20) throws org.xmlpull.v1.XmlPullParserException, org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu.vt(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.ryl.ouw");
    }

    private void ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar) {
        if (this.f8416le == null) {
            this.f8416le = new vt.ouw();
        }
        vt.ouw ouwVar2 = this.f8416le;
        ouwVar2.ouw = this.fkw;
        ouwVar2.vt = this.ouw;
        if (ouwVar != null) {
            ouwVar2.f8418lh = ouwVar.ouw.ouw.vt.size() <= 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x010a. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.ryl.ouw ouw(org.xmlpull.v1.XmlPullParser r40, java.util.List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> r41) throws org.xmlpull.v1.XmlPullParserException, org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu.ouw(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.ryl.ouw");
    }

    public static List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ouw(XmlPullParser xmlPullParser, String str, boolean z3) throws XmlPullParserException, IOException {
        return ouw(ouw(xmlPullParser, str), z3);
    }

    public static String ouw(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = ra;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    public static void ouw(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i4 = 1;
        while (i4 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ouw(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        lh.ouw ouwVar = new lh.ouw(str);
        ouwVar.ouw = z3;
        return Collections.singletonList(ouwVar.ouw());
    }
}
