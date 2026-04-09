package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ro implements oo {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f15717d;

    /* renamed from: a, reason: collision with root package name */
    public final ua.a f15718a;

    /* renamed from: b, reason: collision with root package name */
    public final ts f15719b;

    /* renamed from: c, reason: collision with root package name */
    public final dz1 f15720c;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        x.e eVar = new x.e(7);
        for (int i4 = 0; i4 < 7; i4++) {
            eVar.put(strArr[i4], numArr[i4]);
        }
        f15717d = DesugarCollections.unmodifiableMap(eVar);
    }

    public ro(ua.a aVar, ts tsVar, dz1 dz1Var) {
        this.f15718a = aVar;
        this.f15719b = tsVar;
        this.f15720c = dz1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x044e A[Catch: all -> 0x01c8, TryCatch #1 {all -> 0x01c8, blocks: (B:92:0x01bd, B:94:0x01c1, B:95:0x01c6, B:99:0x01cb, B:101:0x01d3, B:102:0x01d8, B:104:0x01da, B:106:0x01e4, B:107:0x01e9, B:109:0x01eb, B:111:0x01f1, B:112:0x01f6, B:114:0x01f8, B:116:0x0206, B:117:0x0218, B:119:0x0226, B:120:0x0238, B:122:0x0246, B:123:0x0258, B:125:0x0266, B:126:0x0278, B:128:0x0286, B:129:0x0294, B:131:0x02a2, B:132:0x02a4, B:134:0x02a8, B:136:0x02ac, B:138:0x02b2, B:141:0x02ba, B:145:0x02f0, B:151:0x0302, B:211:0x044e, B:212:0x0453, B:214:0x0455, B:216:0x047e, B:218:0x048a, B:220:0x04c2, B:226:0x053a, B:249:0x0595, B:250:0x05ad, B:251:0x05d7, B:253:0x05e1, B:254:0x05ec, B:255:0x0612, B:258:0x0615, B:260:0x0643, B:261:0x0655, B:230:0x054b, B:234:0x055c, B:238:0x056b, B:242:0x057a, B:247:0x058b, B:248:0x058f, B:219:0x04bf, B:263:0x0657, B:264:0x065c, B:153:0x0310, B:155:0x0314, B:184:0x03c1, B:179:0x039e, B:186:0x03ce, B:188:0x03d2, B:190:0x03d6, B:193:0x03de, B:161:0x0331, B:165:0x034e, B:166:0x035a, B:170:0x0370, B:174:0x0385, B:178:0x0397, B:183:0x03ac, B:194:0x03ed, B:201:0x0429, B:207:0x0439, B:204:0x042f, B:206:0x0437, B:197:0x0420, B:199:0x0426, B:208:0x043e, B:209:0x0445, B:266:0x065e, B:267:0x0663, B:269:0x0665, B:270:0x066a), top: B:297:0x01bd, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0455 A[Catch: all -> 0x01c8, TryCatch #1 {all -> 0x01c8, blocks: (B:92:0x01bd, B:94:0x01c1, B:95:0x01c6, B:99:0x01cb, B:101:0x01d3, B:102:0x01d8, B:104:0x01da, B:106:0x01e4, B:107:0x01e9, B:109:0x01eb, B:111:0x01f1, B:112:0x01f6, B:114:0x01f8, B:116:0x0206, B:117:0x0218, B:119:0x0226, B:120:0x0238, B:122:0x0246, B:123:0x0258, B:125:0x0266, B:126:0x0278, B:128:0x0286, B:129:0x0294, B:131:0x02a2, B:132:0x02a4, B:134:0x02a8, B:136:0x02ac, B:138:0x02b2, B:141:0x02ba, B:145:0x02f0, B:151:0x0302, B:211:0x044e, B:212:0x0453, B:214:0x0455, B:216:0x047e, B:218:0x048a, B:220:0x04c2, B:226:0x053a, B:249:0x0595, B:250:0x05ad, B:251:0x05d7, B:253:0x05e1, B:254:0x05ec, B:255:0x0612, B:258:0x0615, B:260:0x0643, B:261:0x0655, B:230:0x054b, B:234:0x055c, B:238:0x056b, B:242:0x057a, B:247:0x058b, B:248:0x058f, B:219:0x04bf, B:263:0x0657, B:264:0x065c, B:153:0x0310, B:155:0x0314, B:184:0x03c1, B:179:0x039e, B:186:0x03ce, B:188:0x03d2, B:190:0x03d6, B:193:0x03de, B:161:0x0331, B:165:0x034e, B:166:0x035a, B:170:0x0370, B:174:0x0385, B:178:0x0397, B:183:0x03ac, B:194:0x03ed, B:201:0x0429, B:207:0x0439, B:204:0x042f, B:206:0x0437, B:197:0x0420, B:199:0x0426, B:208:0x043e, B:209:0x0445, B:266:0x065e, B:267:0x0663, B:269:0x0665, B:270:0x066a), top: B:297:0x01bd, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x058f A[Catch: all -> 0x01c8, TryCatch #1 {all -> 0x01c8, blocks: (B:92:0x01bd, B:94:0x01c1, B:95:0x01c6, B:99:0x01cb, B:101:0x01d3, B:102:0x01d8, B:104:0x01da, B:106:0x01e4, B:107:0x01e9, B:109:0x01eb, B:111:0x01f1, B:112:0x01f6, B:114:0x01f8, B:116:0x0206, B:117:0x0218, B:119:0x0226, B:120:0x0238, B:122:0x0246, B:123:0x0258, B:125:0x0266, B:126:0x0278, B:128:0x0286, B:129:0x0294, B:131:0x02a2, B:132:0x02a4, B:134:0x02a8, B:136:0x02ac, B:138:0x02b2, B:141:0x02ba, B:145:0x02f0, B:151:0x0302, B:211:0x044e, B:212:0x0453, B:214:0x0455, B:216:0x047e, B:218:0x048a, B:220:0x04c2, B:226:0x053a, B:249:0x0595, B:250:0x05ad, B:251:0x05d7, B:253:0x05e1, B:254:0x05ec, B:255:0x0612, B:258:0x0615, B:260:0x0643, B:261:0x0655, B:230:0x054b, B:234:0x055c, B:238:0x056b, B:242:0x057a, B:247:0x058b, B:248:0x058f, B:219:0x04bf, B:263:0x0657, B:264:0x065c, B:153:0x0310, B:155:0x0314, B:184:0x03c1, B:179:0x039e, B:186:0x03ce, B:188:0x03d2, B:190:0x03d6, B:193:0x03de, B:161:0x0331, B:165:0x034e, B:166:0x035a, B:170:0x0370, B:174:0x0385, B:178:0x0397, B:183:0x03ac, B:194:0x03ed, B:201:0x0429, B:207:0x0439, B:204:0x042f, B:206:0x0437, B:197:0x0420, B:199:0x0426, B:208:0x043e, B:209:0x0445, B:266:0x065e, B:267:0x0663, B:269:0x0665, B:270:0x066a), top: B:297:0x01bd, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.Object r20, java.util.Map r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ro.k(java.lang.Object, java.util.Map):void");
    }
}
