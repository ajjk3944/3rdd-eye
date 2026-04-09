package okio.internal;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.xbill.DNS.KEYRecord;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String str) {
        int i10;
        char cCharAt;
        p.e(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        if (length > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                char cCharAt2 = str.charAt(i11);
                if (p.f(cCharAt2, 128) >= 0) {
                    int length2 = str.length();
                    int i13 = i11;
                    while (i11 < length2) {
                        char cCharAt3 = str.charAt(i11);
                        if (p.f(cCharAt3, 128) < 0) {
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) cCharAt3;
                            i11++;
                            while (true) {
                                i13 = i14;
                                if (i11 >= length2 || p.f(str.charAt(i11), 128) >= 0) {
                                    break;
                                }
                                i14 = i13 + 1;
                                bArr[i13] = (byte) str.charAt(i11);
                                i11++;
                            }
                        } else {
                            if (p.f(cCharAt3, KEYRecord.Flags.FLAG4) < 0) {
                                bArr[i13] = (byte) ((cCharAt3 >> 6) | PsExtractor.AUDIO_STREAM);
                                i13 += 2;
                                bArr[i13 + 1] = (byte) ((cCharAt3 & '?') | 128);
                            } else if (55296 > cCharAt3 || cCharAt3 > 57343) {
                                bArr[i13] = (byte) ((cCharAt3 >> '\f') | 224);
                                bArr[i13 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                                i13 += 3;
                                bArr[i13 + 2] = (byte) ((cCharAt3 & '?') | 128);
                            } else if (p.f(cCharAt3, 56319) > 0 || length2 <= (i10 = i11 + 1) || 56320 > (cCharAt = str.charAt(i10)) || cCharAt > 57343) {
                                bArr[i13] = 63;
                                i11++;
                                i13++;
                            } else {
                                int iCharAt = ((cCharAt3 << '\n') + str.charAt(i10)) - 56613888;
                                bArr[i13] = (byte) ((iCharAt >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                bArr[i13 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                                bArr[i13 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                                i13 += 4;
                                bArr[i13 + 3] = (byte) ((iCharAt & 63) | 128);
                                i11 += 2;
                            }
                            i11++;
                        }
                    }
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
                    p.d(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                    return bArrCopyOf;
                }
                bArr[i11] = (byte) cCharAt2;
                if (i12 >= length) {
                    break;
                }
                i11 = i12;
            }
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        p.d(bArrCopyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        if ((r16[r5] & 192) == 128) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fc, code lost:
    
        if ((r16[r5] & 192) == 128) goto L73;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String commonToUtf8String(@org.jetbrains.annotations.NotNull byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._Utf8Kt.commonToUtf8String(byte[], int, int):java.lang.String");
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return commonToUtf8String(bArr, i10, i11);
    }
}
