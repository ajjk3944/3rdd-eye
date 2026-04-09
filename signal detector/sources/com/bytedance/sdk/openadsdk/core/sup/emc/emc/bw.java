package com.bytedance.sdk.openadsdk.core.sup.emc.emc;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup.emc.ypw;
import com.bytedance.sdk.openadsdk.core.sup.xq.emc;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class bw extends com.bytedance.sdk.openadsdk.core.sup.emc.ypw {
    public static final String uym = null;

    public bw(Context context, int i, int i3) {
        super(context, i, i3);
    }

    private void xq(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc((rie) null, (List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq>) Collections.singletonList(new xq.emc(str).emc()), this.emc > 0 ? com.bytedance.sdk.openadsdk.core.sup.emc.emc.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.sup.emc.emc.UNDEFINED_ERROR, -1L, (String) null, (String) null), (xq.ypw) null);
    }

    public static int ypw(String str) {
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
    @Override // com.bytedance.sdk.openadsdk.core.sup.emc.ypw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.core.sup.emc emc(java.lang.String r5, java.io.File r6, java.util.List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            r4.bw = r0
            android.content.Context r1 = r4.ypw
            r2 = 0
            if (r1 != 0) goto Lc
            r5 = -1
            r4.bw = r5
            return r2
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L18
            if (r6 != 0) goto L18
            r5 = -2
            r4.bw = r5
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
            com.bytedance.sdk.openadsdk.core.sup.emc r5 = r4.emc(r5, r7)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r4.emc(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
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
            r4.bw = r5     // Catch: java.lang.Throwable -> L4c
            r4.emc(r2)     // Catch: java.lang.Throwable -> L4c
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw.emc(java.lang.String, java.io.File, java.util.List):com.bytedance.sdk.openadsdk.core.sup.emc");
    }

    public static class emc {
        String dg;
        String emc;
        emc.ypw xq;
        emc.EnumC0072emc ypw;
        final List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> bw = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> ycc = new ArrayList();
        float uym = Float.MIN_VALUE;

        public emc() {
        }

        public void emc(String str, emc.EnumC0072emc enumC0072emc, emc.ypw ypwVar) {
            this.emc = str;
            this.ypw = enumC0072emc;
            this.xq = ypwVar;
        }

        public void ypw(String str) {
            this.ycc.add(new xq.emc(str).emc());
        }

        public void emc(String str) {
            this.bw.add(new xq.emc(str).emc());
        }

        public emc(String str, emc.EnumC0072emc enumC0072emc, emc.ypw ypwVar) {
            emc(str, enumC0072emc, ypwVar);
        }
    }

    public static String ypw(XmlPullParser xmlPullParser, String str) {
        String strTrim;
        String str2 = uym;
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

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d2, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.sup.emc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.sup.emc ypw(org.xmlpull.v1.XmlPullParser r19, java.util.List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw.ypw(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.sup.emc");
    }

    private void emc(com.bytedance.sdk.openadsdk.core.sup.emc emcVar) {
        if (this.ycc == null) {
            this.ycc = new ypw.emc();
        }
        ypw.emc emcVar2 = this.ycc;
        emcVar2.emc = this.bw;
        emcVar2.ypw = this.emc;
        if (emcVar != null) {
            emcVar2.xq = emcVar.emc().ypw.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.sup.emc emc(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list3;
        xmlPullParser.require(2, uym, "VAST");
        boolean z6 = false;
        String strYpw = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strYpw = ypw(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (emc(xmlPullParser.getAttributeValue(uym, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z6 = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.sup.emc emcVarEmc = ypw.emc(this.ypw, xmlPullParser3, list3, this.xq, this.dg);
                                        if (emcVarEmc != null) {
                                            if (!TextUtils.isEmpty(emcVarEmc.uym())) {
                                                return emcVarEmc;
                                            }
                                            this.bw = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.sup.emc emcVarYpw = ypw(xmlPullParser3, list3);
                                            if (emcVarYpw != null) {
                                                return emcVarYpw;
                                            }
                                        } else {
                                            emc(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            emc(xmlPullParser);
                            z6 = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        emc(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z6) {
            this.bw = -4;
            xq(strYpw);
        }
        if (this.bw == 0) {
            this.bw = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> emc(XmlPullParser xmlPullParser, String str) {
        return emc(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> emc(XmlPullParser xmlPullParser, String str, boolean z6) {
        return emc(ypw(xmlPullParser, str), z6);
    }

    public static void emc(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void emc(XmlPullParser xmlPullParser, String str, int i) {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> emc(String str, boolean z6) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new xq.emc(str).emc(z6).emc());
    }
}
