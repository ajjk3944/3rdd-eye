package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import y9.C5819a;

@SuppressLint({"InlinedApi"})
/* loaded from: classes3.dex */
public final class gv0 {

    /* renamed from: a, reason: collision with root package name */
    private static final hv0 f27989a;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f27990b;

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<a, List<yu0>> f27991c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f27992d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f27993e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f27994f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f27995g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f27996h;
    private static final String i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f27997j;

    /* renamed from: k, reason: collision with root package name */
    private static int f27998k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f27999a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28000b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f28001c;

        public a(String str, boolean z10, boolean z11) {
            this.f27999a = str;
            this.f28000b = z10;
            this.f28001c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f27999a, aVar.f27999a) && this.f28000b == aVar.f28000b && this.f28001c == aVar.f28001c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((C4121h3.a(this.f27999a, 31, 31) + (this.f28000b ? 1231 : 1237)) * 31) + (this.f28001c ? 1231 : 1237);
        }
    }

    public static class b extends Exception {
        public /* synthetic */ b(Exception exc, int i) {
            this(exc);
        }

        private b(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    public interface c {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    public static final class d implements c {
        public /* synthetic */ d(int i) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final boolean b() {
            return false;
        }

        private d() {
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }
    }

    public interface f<T> {
        int a(T t10);
    }

    static {
        hv0 hv0VarG = hm1.g();
        f27989a = hv0VarG;
        f27990b = Pattern.compile("^\\D?(\\d+)$");
        f27991c = new HashMap<>();
        f27992d = hv0VarG.b();
        f27993e = hv0VarG.c();
        f27994f = hv0VarG.O();
        f27995g = hv0VarG.q();
        f27996h = hv0VarG.r();
        i = hv0VarG.a();
        f27997j = hv0VarG.F();
        f27998k = -1;
    }

    public static String a(dc0 dc0Var) {
        Pair<Integer, Integer> pairB;
        if ("audio/eac3-joc".equals(dc0Var.f26083m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(dc0Var.f26083m) || (pairB = b(dc0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x041e A[Catch: NumberFormatException -> 0x042e, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x042e, blocks: (B:292:0x03c7, B:294:0x03db, B:305:0x03f7, B:320:0x041e), top: B:497:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> b(com.yandex.mobile.ads.impl.dc0 r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gv0.b(com.yandex.mobile.ads.impl.dc0):android.util.Pair");
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f28002a;

        /* renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f28003b;

        public e(boolean z10, boolean z11) {
            this.f28002a = (z10 || z11) ? 1 : 0;
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final int a() {
            if (this.f28003b == null) {
                this.f28003b = new MediaCodecList(this.f28002a).getCodecInfos();
            }
            return this.f28003b.length;
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final MediaCodecInfo a(int i) {
            if (this.f28003b == null) {
                this.f28003b = new MediaCodecList(this.f28002a).getCodecInfos();
            }
            return this.f28003b[i];
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.yandex.mobile.ads.impl.gv0.c
        public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }
    }

    private static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            hv0 hv0Var = f27989a;
            byte[] bArrA = ev0.a(hv0Var, "T01YLk1TLkhFVkNEVi5EZWNvZGVy", 0, "decode(...)");
            Charset charset = C5819a.f48359b;
            if (new String(bArrA, charset).equals(str)) {
                return new String(ev0.a(hv0Var, "dmlkZW8vaGV2Y2R2", 0, "decode(...)"), charset);
            }
            if (dv0.a(ev0.a(hv0Var, "T01YLlJUSy52aWRlby5kZWNvZGVy", 0, "decode(...)"), charset, str) || dv0.a(ev0.a(hv0Var, "T01YLnJlYWx0ZWsudmlkZW8uZGVjb2Rlci50dW5uZWxlZA==", 0, "decode(...)"), charset, str)) {
                return new String(ev0.a(hv0Var, "dmlkZW8vZHZfaGV2Yw==", 0, "decode(...)"), charset);
            }
            return null;
        }
        if (str2.equals("audio/alac") && new String(ev0.a(f27989a, "T01YLmxnZS5hbGFjLmRlY29kZXI=", 0, "decode(...)"), C5819a.f48359b).equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && new String(ev0.a(f27989a, "T01YLmxnZS5mbGFjLmRlY29kZXI=", 0, "decode(...)"), C5819a.f48359b).equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && new String(ev0.a(f27989a, "T01YLmxnZS5hYzMuZGVjb2Rlcg==", 0, "decode(...)"), C5819a.f48359b).equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x015d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0134 A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #5 {Exception -> 0x0031, blocks: (B:3:0x0008, B:5:0x001a, B:7:0x0024, B:84:0x0153, B:12:0x0034, B:15:0x003f, B:78:0x012c, B:81:0x0134, B:83:0x013a, B:85:0x015d, B:86:0x017e), top: B:100:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<com.yandex.mobile.ads.impl.yu0> a(com.yandex.mobile.ads.impl.gv0.a r20, com.yandex.mobile.ads.impl.gv0.c r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gv0.a(com.yandex.mobile.ads.impl.gv0$a, com.yandex.mobile.ads.impl.gv0$c):java.util.ArrayList");
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = s82.f32899a;
        if (i10 < 21) {
            hv0 hv0Var = f27989a;
            byte[] bArrA = ev0.a(hv0Var, "Q0lQQUFDRGVjb2Rlcg==", 0, "decode(...)");
            Charset charset = C5819a.f48359b;
            if (new String(bArrA, charset).equals(str) || dv0.a(ev0.a(hv0Var, "Q0lQTVAzRGVjb2Rlcg==", 0, "decode(...)"), charset, str) || dv0.a(ev0.a(hv0Var, "Q0lQVm9yYmlzRGVjb2Rlcg==", 0, "decode(...)"), charset, str) || dv0.a(ev0.a(hv0Var, "Q0lQQU1STkJEZWNvZGVy", 0, "decode(...)"), charset, str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str)) {
                return false;
            }
        }
        if (i10 < 18) {
            hv0 hv0Var2 = f27989a;
            byte[] bArrA2 = ev0.a(hv0Var2, "T01YLk1USy5BVURJTy5ERUNPREVSLkFBQw==", 0, "decode(...)");
            Charset charset2 = C5819a.f48359b;
            if (new String(bArrA2, charset2).equals(str)) {
                String str3 = new String(ev0.a(hv0Var2, "YTcw", 0, "decode(...)"), charset2);
                String str4 = s82.f32900b;
                if (str3.equals(str4) || (new String(ev0.a(hv0Var2, "WGlhb21p", 0, "decode(...)"), charset2).equals(s82.f32901c) && str4.startsWith(new String(ev0.a(hv0Var2, "SE0=", 0, "decode(...)"), charset2)))) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            hv0 hv0Var3 = f27989a;
            byte[] bArrA3 = ev0.a(hv0Var3, "T01YLnFjb20uYXVkaW8uZGVjb2Rlci5tcDM=", 0, "decode(...)");
            Charset charset3 = C5819a.f48359b;
            if (new String(bArrA3, charset3).equals(str)) {
                String str5 = new String(ev0.a(hv0Var3, "ZGx4dQ==", 0, "decode(...)"), charset3);
                String str6 = s82.f32900b;
                if (str5.equals(str6) || dv0.a(ev0.a(hv0Var3, "cHJvdG91", 0, "decode(...)"), charset3, str6) || dv0.a(ev0.a(hv0Var3, "dmlsbGU=", 0, "decode(...)"), charset3, str6) || dv0.a(ev0.a(hv0Var3, "dmlsbGVwbHVz", 0, "decode(...)"), charset3, str6) || dv0.a(ev0.a(hv0Var3, "dmlsbGVjMg==", 0, "decode(...)"), charset3, str6) || str6.startsWith(new String(ev0.a(hv0Var3, "Z2Vl", 0, "decode(...)"), charset3)) || dv0.a(ev0.a(hv0Var3, "QzY2MDI=", 0, "decode(...)"), charset3, str6) || dv0.a(ev0.a(hv0Var3, "QzY2MDM=", 0, "decode(...)"), charset3, str6) || dv0.a(ev0.a(hv0Var3, "QzY2MDY=", 0, "decode(...)"), charset3, str6) || dv0.a(ev0.a(hv0Var3, "QzY2MTY=", 0, "decode(...)"), charset3, str6) || dv0.a(ev0.a(hv0Var3, "TDM2aA==", 0, "decode(...)"), charset3, str6) || dv0.a(ev0.a(hv0Var3, "U08tMDJF", 0, "decode(...)"), charset3, str6)) {
                    return false;
                }
            }
        }
        if (i10 == 16) {
            hv0 hv0Var4 = f27989a;
            byte[] bArrA4 = ev0.a(hv0Var4, "T01YLnFjb20uYXVkaW8uZGVjb2Rlci5hYWM=", 0, "decode(...)");
            Charset charset4 = C5819a.f48359b;
            if (new String(bArrA4, charset4).equals(str)) {
                String str7 = new String(ev0.a(hv0Var4, "QzE1MDQ=", 0, "decode(...)"), charset4);
                String str8 = s82.f32900b;
                if (str7.equals(str8) || dv0.a(ev0.a(hv0Var4, "QzE1MDU=", 0, "decode(...)"), charset4, str8) || dv0.a(ev0.a(hv0Var4, "QzE2MDQ=", 0, "decode(...)"), charset4, str8) || dv0.a(ev0.a(hv0Var4, "QzE2MDU=", 0, "decode(...)"), charset4, str8)) {
                    return false;
                }
            }
        }
        if (i10 < 24) {
            hv0 hv0Var5 = f27989a;
            byte[] bArrA5 = ev0.a(hv0Var5, "T01YLlNFQy5hYWMuZGVj", 0, "decode(...)");
            Charset charset5 = C5819a.f48359b;
            if ((new String(bArrA5, charset5).equals(str) || dv0.a(ev0.a(hv0Var5, "T01YLkV4eW5vcy5BQUMuRGVjb2Rlcg==", 0, "decode(...)"), charset5, str)) && new String(ev0.a(hv0Var5, "c2Ftc3VuZw==", 0, "decode(...)"), charset5).equals(s82.f32901c)) {
                String str9 = s82.f32900b;
                if (str9.startsWith(new String(ev0.a(hv0Var5, "emVyb2ZsdGU=", 0, "decode(...)"), charset5)) || str9.startsWith(new String(ev0.a(hv0Var5, "emVyb2x0ZQ==", 0, "decode(...)"), charset5)) || str9.startsWith(new String(ev0.a(hv0Var5, "emVubHRl", 0, "decode(...)"), charset5)) || dv0.a(ev0.a(hv0Var5, "U0MtMDVH", 0, "decode(...)"), charset5, str9) || dv0.a(ev0.a(hv0Var5, "bWFyaW5lbHRlYXR0", 0, "decode(...)"), charset5, str9) || dv0.a(ev0.a(hv0Var5, "NDA0U0M=", 0, "decode(...)"), charset5, str9) || dv0.a(ev0.a(hv0Var5, "U0MtMDRH", 0, "decode(...)"), charset5, str9) || dv0.a(ev0.a(hv0Var5, "U0NWMzE=", 0, "decode(...)"), charset5, str9)) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            hv0 hv0Var6 = f27989a;
            byte[] bArrA6 = ev0.a(hv0Var6, "T01YLlNFQy52cDguZGVj", 0, "decode(...)");
            Charset charset6 = C5819a.f48359b;
            if (new String(bArrA6, charset6).equals(str) && new String(ev0.a(hv0Var6, "c2Ftc3VuZw==", 0, "decode(...)"), charset6).equals(s82.f32901c)) {
                String str10 = s82.f32900b;
                if (str10.startsWith("d2") || str10.startsWith(new String(ev0.a(hv0Var6, "c2VycmFubw==", 0, "decode(...)"), charset6)) || str10.startsWith(new String(ev0.a(hv0Var6, "amZsdGU=", 0, "decode(...)"), charset6)) || str10.startsWith(new String(ev0.a(hv0Var6, "c2FudG9z", 0, "decode(...)"), charset6)) || str10.startsWith(new String(ev0.a(hv0Var6, "dDA=", 0, "decode(...)"), charset6))) {
                    return false;
                }
            }
        }
        if (i10 <= 19) {
            String str11 = s82.f32900b;
            hv0 hv0Var7 = f27989a;
            byte[] bArrA7 = ev0.a(hv0Var7, "amZsdGU=", 0, "decode(...)");
            Charset charset7 = C5819a.f48359b;
            if (str11.startsWith(new String(bArrA7, charset7)) && dv0.a(ev0.a(hv0Var7, "T01YLnFjb20udmlkZW8uZGVjb2Rlci52cDg=", 0, "decode(...)"), charset7, str)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && new String(ev0.a(f27989a, "T01YLk1USy5BVURJTy5ERUNPREVSLkRTUEFDMw==", 0, "decode(...)"), C5819a.f48359b).equals(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(yu0 yu0Var) {
        return yu0Var.f35980a.startsWith(f27989a.K()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(yu0 yu0Var) {
        String str = yu0Var.f35980a;
        hv0 hv0Var = f27989a;
        if (str.startsWith(hv0Var.K()) || str.startsWith("c2.android")) {
            return 1;
        }
        return (s82.f32899a >= 26 || !str.equals(hv0Var.G())) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(dc0 dc0Var, yu0 yu0Var) {
        try {
            return yu0Var.a(dc0Var) ? 1 : 0;
        } catch (b unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    private static void a(ArrayList arrayList, final f fVar) {
        Collections.sort(arrayList, new Comparator() { // from class: com.yandex.mobile.ads.impl.L0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gv0.a(fVar, obj, obj2);
            }
        });
    }

    public static synchronized List<yu0> a(String str, boolean z10, boolean z11) throws b {
        c dVar;
        try {
            a aVar = new a(str, z10, z11);
            HashMap<a, List<yu0>> map = f27991c;
            List<yu0> list = map.get(aVar);
            if (list != null) {
                return list;
            }
            int i10 = s82.f32899a;
            int i11 = 0;
            if (i10 >= 21) {
                dVar = new e(z10, z11);
            } else {
                dVar = new d(i11);
            }
            ArrayList<yu0> arrayListA = a(aVar, dVar);
            if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListA = a(aVar, new d(i11));
                if (!arrayListA.isEmpty()) {
                    rs0.d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListA.get(0).f35980a);
                }
            }
            a(str, arrayListA);
            xj0 xj0VarA = xj0.a((Collection) arrayListA);
            map.put(aVar, xj0VarA);
            return xj0VarA;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static ArrayList a(xj0 xj0Var, dc0 dc0Var) {
        ArrayList arrayList = new ArrayList(xj0Var);
        a(arrayList, new K0(dc0Var, 0));
        return arrayList;
    }

    public static int a() throws b {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f27998k == -1) {
            int iMax = 0;
            List<yu0> listA = a("video/avc", false, false);
            yu0 yu0Var = listA.isEmpty() ? null : listA.get(0);
            if (yu0Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = yu0Var.f35983d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case Constants.QUEUE_ELEMENT_MAX_SIZE /* 32768 */:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, s82.f32899a >= 21 ? 345600 : 172800);
            }
            f27998k = iMax;
        }
        return f27998k;
    }

    private static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (s82.f32899a < 26) {
                String str2 = s82.f32900b;
                hv0 hv0Var = f27989a;
                if (str2.equals(hv0Var.N()) && arrayList.size() == 1 && ((yu0) arrayList.get(0)).f35980a.equals(hv0Var.G())) {
                    arrayList.add(yu0.a(hv0Var.L(), "audio/raw", "audio/raw", null, false, true, false, false));
                }
            }
            a(arrayList, new I0(0));
        }
        int i10 = s82.f32899a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str3 = ((yu0) arrayList.get(0)).f35980a;
            hv0 hv0Var2 = f27989a;
            if (hv0Var2.I().equals(str3) || hv0Var2.H().equals(str3) || hv0Var2.J().equals(str3)) {
                a(arrayList, new J0(0));
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (f27989a.M().equals(((yu0) arrayList.get(0)).f35980a)) {
            arrayList.add((yu0) arrayList.remove(0));
        }
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str) {
        if (s82.f32899a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (k01.d(str)) {
            return true;
        }
        String strB = xf.b(mediaCodecInfo.getName());
        if (!strB.startsWith("arc.")) {
            hv0 hv0Var = f27989a;
            byte[] bArrA = ev0.a(hv0Var, "b214Lmdvb2dsZS4=", 0, "decode(...)");
            Charset charset = C5819a.f48359b;
            if (strB.startsWith(new String(bArrA, charset)) || strB.startsWith(new String(ev0.a(hv0Var, "b214LmZmbXBlZy4=", 0, "decode(...)"), charset))) {
                return true;
            }
            if ((strB.startsWith(new String(ev0.a(hv0Var, "b214LnNlYy4=", 0, "decode(...)"), charset)) && strB.contains(".sw.")) || strB.equals(new String(ev0.a(hv0Var, "b214LnFjb20udmlkZW8uZGVjb2Rlci5oZXZjc3d2ZGVj", 0, "decode(...)"), charset)) || strB.startsWith("c2.android.") || strB.startsWith("c2.google.")) {
                return true;
            }
            if (!strB.startsWith(new String(ev0.a(hv0Var, "b214Lg==", 0, "decode(...)"), charset)) && !strB.startsWith("c2.")) {
                return true;
            }
        }
        return false;
    }
}
