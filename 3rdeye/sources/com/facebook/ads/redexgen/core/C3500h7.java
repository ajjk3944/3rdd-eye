package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007J\"\u0010\u000e\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007J2\u0010\u0012\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J&\u0010\u0015\u001a\u00020\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J&\u0010\u0017\u001a\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0016\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J\u001c\u0010\u001d\u001a\u00020\u00162\n\u0010\u001e\u001a\u00060\u001fj\u0002` 2\u0006\u0010!\u001a\u00020\u0018H\u0002J \u0010\"\u001a\u00020\t2\u0016\u0010#\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010$H\u0002J\u0010\u0010%\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/video/framebasedlogging/FrameBasedLogger$Companion;", "", "<init>", "()V", "FRAME_DATA_ENCODING_VERSION", "", "FRAME_DATA_MAX_LENGTH_CAP", "FRAME_DATA_MAX_NUM_OF_FRAMES_IN_ONE_JSON_STRING", "FRAME_DATA_JSON_STRING_DELIMITER", "", "encodeVideoFrameData", "frames", "", "Lcom/facebook/video/framebasedlogging/VideoFrameInfo;", "encodeVideoFrameDataWithViewability", "isViewabilityEnabled", "", "encodeVideoFrameDataWithinMaxNumOfFrames", "encodeVideoFrameDataInternal", "startIndex", "length", "transformFrameDelta", "", "transformBaseDelta", "", "toVarintZigZagBase64", "framesTimestampList", "encodeZigZag", "val", "putVarint64", "s", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "v", "toJsonStr", "frameDataMap", "", "encode", "fbandroid.java.com.facebook.video.framebasedlogging.framebasedlogging_an"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.h7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3500h7 {
    public static byte[] A00;
    public static String[] A01 = {"adqjJWKIDwjAAy", "cw9Vnez3nJ8pqsnuDUkgXOpF8rslrf", "Havhpk4Y1gg0WgtXW", "mNHAa5sEdSRckmXK", "QxVW3xmlxKst1GqVF", "5PefWRHd6Gh2UjYCRwne9THrqV7gX4zU", "GTMqvhsWxrHsLf4wXFdmS1hSOthAR4ub", "KzrQwwA6xfmA0AB"};

    public /* synthetic */ C3500h7(AbstractC3964p7 abstractC3964p7) {
        this();
    }

    public static String A02(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{77, 78, 79, 72, 73, 74, 75, 68, 69, 70, 71, 64, 65, 66, 67, 92, 93, 94, 95, 88, 89, 90, 91, 84, 85, 86, 109, 110, 111, 104, 105, 106, 107, 100, 101, 102, 103, 96, 97, 98, 99, 124, 125, 126, 127, 120, 121, 122, 123, 116, 117, 118, 60, 61, 62, 63, 56, 57, 58, 59, 52, 53, 39, 35, 66, 65, 83, 69, 100, 69, 76, 84, 65, 114, 36, 40, 15, 59, 42, 39, 33, 16, 32, 31, 19, 1, 23, 20, 26, 19, 67, 70, 9, 1, 15, 21, 53, 9, 19, 8, 2, 41, 8, 75, 81, 116, 75, 71, 85, 67, 64, 78, 71, 23, 18, 83, 72, 116, 83, 85, 78, 73, 64, 15, 9, 9, 9, 14, 6, 21, 2, 3, 25, 31, 30, 18, 75, 12, 27, 27, 75, 83, 75, 58, 32, 51, 44, 54, 44, 49, 42, 44, 44, 45, 54, 36, 40, 49, 54, 42, 40, 57, 75, 20};
    }

    static {
        A07();
    }

    public C3500h7() {
    }

    private final long A00(long j4) {
        return (j4 << 1) ^ (j4 >> 63);
    }

    private final long A01(List<C3502h9> list, int i, int i10) {
        HashMap map = new HashMap();
        int i11 = i + i10;
        for (int i12 = i + 1; i12 < i11; i12++) {
            long a03 = list.get(i12).getA03();
            long a01 = list.get(i12).getA01();
            Long lValueOf = Long.valueOf(a03);
            Long lValueOf2 = Long.valueOf(a03);
            Object obj = map.get(lValueOf2);
            if (obj == null) {
                obj = 0;
                map.put(lValueOf2, obj);
            }
            map.put(lValueOf, Integer.valueOf(((Number) obj).intValue() + 1));
            Long lValueOf3 = Long.valueOf(a01);
            Long lValueOf4 = Long.valueOf(a01);
            Object obj2 = map.get(lValueOf4);
            if (obj2 == null) {
                obj2 = 0;
                map.put(lValueOf4, obj2);
            }
            map.put(lValueOf3, Integer.valueOf(((Number) obj2).intValue() + 1));
        }
        long j4 = 3333;
        int baseCountCurr = 0;
        for (Map.Entry entry : map.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (baseCountCurr < iIntValue) {
                baseCountCurr = iIntValue;
                j4 = jLongValue;
            }
        }
        int i13 = i + i10;
        for (int i14 = i + 1; i14 < i13; i14++) {
            list.get(i14).A09(list.get(i14).getA03() - j4);
            list.get(i14).A07(list.get(i14).getA01() - j4);
        }
        return j4;
    }

    private final String A03(String str) {
        String strA02 = A02(0, 64, 97);
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder p10 = new StringBuilder();
        int length = sb.length() % 3;
        if (length > 0) {
            while (length < 3) {
                p10.append('=');
                sb.append((char) 0);
                length++;
            }
        }
        int n22 = 0;
        while (true) {
            int length2 = sb.length();
            String[] strArr = A01;
            if (strArr[6].charAt(29) != strArr[5].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "c8I6WkBk38UBs7py2rcGfWrh0qBcN4cV";
            strArr2[5] = "diMQGy0StG563mex3KV2JMPYAWT514yw";
            if (n22 < length2) {
                int iCharAt = (sb.charAt(n22) << 16) + (sb.charAt(n22 + 1) << '\b') + sb.charAt(n22 + 2);
                int n42 = (iCharAt >> 12) & 63;
                int n32 = (iCharAt >> 6) & 63;
                StringBuilder sb3 = sb2.append(strA02.charAt((iCharAt >> 18) & 63));
                sb3.append(strA02.charAt(n42)).append(strA02.charAt(n32)).append(strA02.charAt(iCharAt & 63));
                n22 += 3;
            } else {
                StringBuilder r9 = new StringBuilder();
                String base64chars = sb2.substring(0, sb2.length() - p10.length());
                return r9.append(base64chars).append((Object) p10).toString();
            }
        }
    }

    private final String A04(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            A08(sb, A00(it.next().longValue()));
        }
        String string = sb.toString();
        C3963p6.A08(string, A02(115, 13, 74));
        return A03(string);
    }

    private final String A05(List<C3502h9> list, int i, int i10, boolean z10) {
        if (list == null || list.isEmpty() || i < 0 || i >= list.size() || i10 <= 0 || i + i10 > list.size()) {
            return null;
        }
        Map frameDataMap = new HashMap();
        frameDataMap.put(A02(73, 2, 121), list.get(i).A05());
        frameDataMap.put(A02(128, 7, 29), 1);
        boolean z11 = false;
        boolean z12 = false;
        if (i10 > 1) {
            A09(list, i, i10);
            frameDataMap.put(A02(64, 9, 77), Long.valueOf(A01(list, i, i10)));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List framesTimestampList = new ArrayList();
            int i11 = i + i10;
            for (int i12 = i + 1; i12 < i11; i12++) {
                arrayList.add(Long.valueOf(list.get(i12).getA03()));
                arrayList.add(Long.valueOf(list.get(i12).getA01()));
                arrayList.add(Long.valueOf(list.get(i12).getA02()));
                arrayList2.add(Long.valueOf(list.get(i12).getA00()));
                if (list.get(i12).getA00() != 0) {
                    z11 = true;
                }
                if (z10) {
                    framesTimestampList.add(Long.valueOf(list.get(i12).getA04()));
                    if (list.get(i12).getA04() != 0) {
                        z12 = true;
                    }
                }
            }
            frameDataMap.put(A02(92, 2, 2), A04(arrayList));
            frameDataMap.put(A02(75, 6, 35), A04(arrayList2));
            frameDataMap.put(A02(94, 9, 11), Boolean.valueOf(z11));
            if (z10) {
                frameDataMap.put(A02(81, 11, 27), A04(framesTimestampList));
                frameDataMap.put(A02(103, 12, 79), Boolean.valueOf(z12));
            }
        }
        String strA06 = A06(frameDataMap);
        if (strA06.length() > 900000) {
            return A02(135, 29, 4);
        }
        return strA06;
    }

    private final String A06(Map<String, ? extends Object> map) {
        JSONObject json = new JSONObject(map);
        String string = json.toString();
        C3963p6.A08(string, A02(115, 13, 74));
        return string;
    }

    private final void A08(StringBuilder sb, long j4) {
        while (j4 >= 128) {
            long j10 = (128 - 1) & j4;
            long v10 = 128;
            j4 >>= 7;
            sb.append((char) (AbstractC3973pM.A00((short) (j10 | v10)) & 65535));
        }
        int iA00 = AbstractC3973pM.A00((short) j4) & 65535;
        String[] strArr = A01;
        if (strArr[0].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "T60Ooc0cJ5Sp1Pqo";
        strArr2[1] = "uvRZm299xuhvmD13tPTGCghGF8GWUX";
        sb.append((char) iA00);
    }

    private final void A09(List<C3502h9> list, int i, int i10) {
        long a00;
        int i11 = (i + i10) - 1;
        int i12 = i + 1;
        if (i12 > i11) {
            return;
        }
        while (true) {
            int i13 = i11 - 1;
            list.get(i11).A09(list.get(i11).getA03() - list.get(i13).getA03());
            int i14 = i11 - 1;
            list.get(i11).A07(list.get(i11).getA01() - list.get(i14).getA01());
            int i15 = i11 - 1;
            list.get(i11).A08(list.get(i11).getA02() - list.get(i15).getA02());
            C3502h9 c3502h9 = list.get(i11);
            int i16 = i11 - 1;
            long a04 = 0;
            if (list.get(i16).getA00() == -1) {
                a00 = 0;
            } else {
                int i17 = i11 - 1;
                a00 = list.get(i11).getA00() - list.get(i17).getA00();
            }
            c3502h9.A06(a00);
            C3502h9 c3502h92 = list.get(i11);
            int i18 = i11 - 1;
            if (list.get(i18).getA04() != -1) {
                int i19 = i11 - 1;
                a04 = list.get(i11).getA04() - list.get(i19).getA04();
            }
            c3502h92.A0A(a04);
            list.get(i11).A08(list.get(i11).getA02() - list.get(i11).getA01());
            String[] strArr = A01;
            String str = strArr[6];
            String str2 = strArr[5];
            int iCharAt = str.charAt(29);
            int i20 = str2.charAt(29);
            if (iCharAt != i20) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "n61ygDvjmVqwwcyNa";
            strArr2[4] = "CJKArLC5kHvee0bz5";
            if (i11 == i12) {
                return;
            } else {
                i11--;
            }
        }
    }

    @JvmStatic
    public final String A0A(List<C3502h9> list) {
        if (list != null) {
            return A05(list, 0, list.size(), false);
        }
        String[] strArr = A01;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "x2TjSmR3QrlPzJhh";
        strArr2[1] = "SlNC4q47AflZsduXtHukt2Kcji3T7v";
        return null;
    }
}
