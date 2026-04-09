package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;
import p2.C2771a;
import u.C2936e;

/* renamed from: com.google.android.gms.internal.ads.Gb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517Gb implements InterfaceC0466Db {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f8388d;

    /* renamed from: a, reason: collision with root package name */
    public final C2771a f8389a;

    /* renamed from: b, reason: collision with root package name */
    public final C0468Dd f8390b;

    /* renamed from: c, reason: collision with root package name */
    public final Rx f8391c;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        C2936e c2936e = new C2936e(7);
        for (int i = 0; i < 7; i++) {
            c2936e.put(strArr[i], numArr[i]);
        }
        f8388d = Collections.unmodifiableMap(c2936e);
    }

    public C0517Gb(C2771a c2771a, C0468Dd c0468Dd, Rx rx) {
        this.f8389a = c2771a;
        this.f8390b = c0468Dd;
        this.f8391c = rx;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x043b A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:91:0x01bb, B:93:0x01bf, B:94:0x01c4, B:98:0x01c9, B:100:0x01d1, B:101:0x01d6, B:103:0x01d8, B:105:0x01e2, B:106:0x01e7, B:108:0x01e9, B:110:0x01ef, B:111:0x01f4, B:113:0x01f6, B:115:0x0204, B:116:0x0216, B:118:0x0224, B:119:0x0236, B:121:0x0244, B:122:0x0256, B:124:0x0264, B:125:0x0276, B:127:0x0284, B:128:0x0292, B:130:0x02a0, B:131:0x02a2, B:133:0x02a6, B:135:0x02aa, B:137:0x02b0, B:140:0x02b8, B:144:0x02ed, B:150:0x02fb, B:221:0x043b, B:222:0x0440, B:224:0x0442, B:226:0x046b, B:228:0x0477, B:230:0x04ad, B:261:0x0566, B:268:0x0599, B:269:0x05b1, B:270:0x05d9, B:272:0x05e1, B:273:0x05ec, B:274:0x0611, B:277:0x0614, B:279:0x0642, B:280:0x0654, B:262:0x056d, B:263:0x0574, B:264:0x057d, B:265:0x0584, B:266:0x058a, B:267:0x0593, B:229:0x04aa, B:282:0x0656, B:283:0x065b, B:152:0x0305, B:154:0x0309, B:186:0x0362, B:187:0x036c, B:196:0x03bf, B:198:0x03c3, B:200:0x03c7, B:203:0x03cf, B:188:0x0370, B:189:0x037a, B:190:0x0381, B:191:0x038d, B:192:0x0395, B:193:0x03a9, B:194:0x03b5, B:204:0x03de, B:211:0x0416, B:217:0x0426, B:214:0x041c, B:216:0x0424, B:207:0x040d, B:209:0x0413, B:218:0x042b, B:219:0x0432, B:285:0x065d, B:286:0x0662, B:288:0x0664, B:289:0x0669), top: B:314:0x01bb, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0442 A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:91:0x01bb, B:93:0x01bf, B:94:0x01c4, B:98:0x01c9, B:100:0x01d1, B:101:0x01d6, B:103:0x01d8, B:105:0x01e2, B:106:0x01e7, B:108:0x01e9, B:110:0x01ef, B:111:0x01f4, B:113:0x01f6, B:115:0x0204, B:116:0x0216, B:118:0x0224, B:119:0x0236, B:121:0x0244, B:122:0x0256, B:124:0x0264, B:125:0x0276, B:127:0x0284, B:128:0x0292, B:130:0x02a0, B:131:0x02a2, B:133:0x02a6, B:135:0x02aa, B:137:0x02b0, B:140:0x02b8, B:144:0x02ed, B:150:0x02fb, B:221:0x043b, B:222:0x0440, B:224:0x0442, B:226:0x046b, B:228:0x0477, B:230:0x04ad, B:261:0x0566, B:268:0x0599, B:269:0x05b1, B:270:0x05d9, B:272:0x05e1, B:273:0x05ec, B:274:0x0611, B:277:0x0614, B:279:0x0642, B:280:0x0654, B:262:0x056d, B:263:0x0574, B:264:0x057d, B:265:0x0584, B:266:0x058a, B:267:0x0593, B:229:0x04aa, B:282:0x0656, B:283:0x065b, B:152:0x0305, B:154:0x0309, B:186:0x0362, B:187:0x036c, B:196:0x03bf, B:198:0x03c3, B:200:0x03c7, B:203:0x03cf, B:188:0x0370, B:189:0x037a, B:190:0x0381, B:191:0x038d, B:192:0x0395, B:193:0x03a9, B:194:0x03b5, B:204:0x03de, B:211:0x0416, B:217:0x0426, B:214:0x041c, B:216:0x0424, B:207:0x040d, B:209:0x0413, B:218:0x042b, B:219:0x0432, B:285:0x065d, B:286:0x0662, B:288:0x0664, B:289:0x0669), top: B:314:0x01bb, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r19, java.util.Map r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0517Gb.e(java.lang.Object, java.util.Map):void");
    }
}
