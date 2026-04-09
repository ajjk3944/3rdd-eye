package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f42 implements y32 {
    public static final Map i;
    public final su1 f;
    public final o82 g;
    public final of3 h;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        s8 s8Var = new s8(7);
        for (int i2 = 0; i2 < 7; i2++) {
            s8Var.put(strArr[i2], numArr[i2]);
        }
        i = Collections.unmodifiableMap(s8Var);
    }

    public f42(su1 su1Var, o82 o82Var, of3 of3Var) {
        this.f = su1Var;
        this.g = o82Var;
        this.h = of3Var;
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
    /* JADX WARN: Removed duplicated region for block: B:211:0x042c A[Catch: all -> 0x01c7, TryCatch #0 {all -> 0x01c7, blocks: (B:92:0x01bc, B:94:0x01c0, B:95:0x01c5, B:99:0x01ca, B:101:0x01d2, B:102:0x01d7, B:104:0x01d9, B:106:0x01e3, B:107:0x01e8, B:109:0x01ea, B:111:0x01f0, B:112:0x01f5, B:114:0x01f7, B:116:0x0205, B:117:0x0217, B:119:0x0225, B:120:0x0237, B:122:0x0245, B:123:0x0257, B:125:0x0265, B:126:0x0277, B:128:0x0285, B:129:0x0293, B:131:0x02a1, B:132:0x02a3, B:134:0x02a7, B:136:0x02ab, B:138:0x02b1, B:141:0x02b9, B:145:0x02eb, B:151:0x02f9, B:211:0x042c, B:212:0x0431, B:214:0x0433, B:216:0x045c, B:218:0x0468, B:220:0x049c, B:226:0x0515, B:249:0x0570, B:250:0x0588, B:251:0x05af, B:253:0x05b7, B:254:0x05c2, B:255:0x05e9, B:258:0x05ec, B:260:0x061a, B:261:0x062c, B:230:0x0526, B:234:0x0537, B:238:0x0546, B:242:0x0555, B:247:0x0566, B:248:0x056a, B:219:0x0499, B:263:0x062e, B:264:0x0633, B:153:0x0303, B:155:0x0307, B:184:0x03a3, B:185:0x03ad, B:187:0x03b2, B:189:0x03b6, B:191:0x03ba, B:194:0x03c2, B:160:0x031c, B:164:0x0338, B:165:0x0343, B:170:0x0355, B:174:0x036a, B:178:0x037c, B:183:0x0390, B:195:0x03d1, B:201:0x0407, B:207:0x0417, B:204:0x040d, B:206:0x0415, B:198:0x03ff, B:200:0x0405, B:208:0x041c, B:209:0x0423, B:266:0x0635, B:267:0x063a, B:269:0x063c, B:270:0x0641), top: B:296:0x01bc, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0433 A[Catch: all -> 0x01c7, TryCatch #0 {all -> 0x01c7, blocks: (B:92:0x01bc, B:94:0x01c0, B:95:0x01c5, B:99:0x01ca, B:101:0x01d2, B:102:0x01d7, B:104:0x01d9, B:106:0x01e3, B:107:0x01e8, B:109:0x01ea, B:111:0x01f0, B:112:0x01f5, B:114:0x01f7, B:116:0x0205, B:117:0x0217, B:119:0x0225, B:120:0x0237, B:122:0x0245, B:123:0x0257, B:125:0x0265, B:126:0x0277, B:128:0x0285, B:129:0x0293, B:131:0x02a1, B:132:0x02a3, B:134:0x02a7, B:136:0x02ab, B:138:0x02b1, B:141:0x02b9, B:145:0x02eb, B:151:0x02f9, B:211:0x042c, B:212:0x0431, B:214:0x0433, B:216:0x045c, B:218:0x0468, B:220:0x049c, B:226:0x0515, B:249:0x0570, B:250:0x0588, B:251:0x05af, B:253:0x05b7, B:254:0x05c2, B:255:0x05e9, B:258:0x05ec, B:260:0x061a, B:261:0x062c, B:230:0x0526, B:234:0x0537, B:238:0x0546, B:242:0x0555, B:247:0x0566, B:248:0x056a, B:219:0x0499, B:263:0x062e, B:264:0x0633, B:153:0x0303, B:155:0x0307, B:184:0x03a3, B:185:0x03ad, B:187:0x03b2, B:189:0x03b6, B:191:0x03ba, B:194:0x03c2, B:160:0x031c, B:164:0x0338, B:165:0x0343, B:170:0x0355, B:174:0x036a, B:178:0x037c, B:183:0x0390, B:195:0x03d1, B:201:0x0407, B:207:0x0417, B:204:0x040d, B:206:0x0415, B:198:0x03ff, B:200:0x0405, B:208:0x041c, B:209:0x0423, B:266:0x0635, B:267:0x063a, B:269:0x063c, B:270:0x0641), top: B:296:0x01bc, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x056a A[Catch: all -> 0x01c7, TryCatch #0 {all -> 0x01c7, blocks: (B:92:0x01bc, B:94:0x01c0, B:95:0x01c5, B:99:0x01ca, B:101:0x01d2, B:102:0x01d7, B:104:0x01d9, B:106:0x01e3, B:107:0x01e8, B:109:0x01ea, B:111:0x01f0, B:112:0x01f5, B:114:0x01f7, B:116:0x0205, B:117:0x0217, B:119:0x0225, B:120:0x0237, B:122:0x0245, B:123:0x0257, B:125:0x0265, B:126:0x0277, B:128:0x0285, B:129:0x0293, B:131:0x02a1, B:132:0x02a3, B:134:0x02a7, B:136:0x02ab, B:138:0x02b1, B:141:0x02b9, B:145:0x02eb, B:151:0x02f9, B:211:0x042c, B:212:0x0431, B:214:0x0433, B:216:0x045c, B:218:0x0468, B:220:0x049c, B:226:0x0515, B:249:0x0570, B:250:0x0588, B:251:0x05af, B:253:0x05b7, B:254:0x05c2, B:255:0x05e9, B:258:0x05ec, B:260:0x061a, B:261:0x062c, B:230:0x0526, B:234:0x0537, B:238:0x0546, B:242:0x0555, B:247:0x0566, B:248:0x056a, B:219:0x0499, B:263:0x062e, B:264:0x0633, B:153:0x0303, B:155:0x0307, B:184:0x03a3, B:185:0x03ad, B:187:0x03b2, B:189:0x03b6, B:191:0x03ba, B:194:0x03c2, B:160:0x031c, B:164:0x0338, B:165:0x0343, B:170:0x0355, B:174:0x036a, B:178:0x037c, B:183:0x0390, B:195:0x03d1, B:201:0x0407, B:207:0x0417, B:204:0x040d, B:206:0x0415, B:198:0x03ff, B:200:0x0405, B:208:0x041c, B:209:0x0423, B:266:0x0635, B:267:0x063a, B:269:0x063c, B:270:0x0641), top: B:296:0x01bc, inners: #1 }] */
    @Override // defpackage.y32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r19, java.util.Map r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f42.c(java.lang.Object, java.util.Map):void");
    }
}
