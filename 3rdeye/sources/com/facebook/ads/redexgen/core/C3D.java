package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.3D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3D extends AbstractC2479Da {
    public static byte[] A04;
    public static String[] A05 = {"QMyl0EdrMkBz74Ff", "RsTLWDF6GNKozTWYWcUQtNpRSKZ3a8yy", "3BM6qDUn0450lnygNbifIZpDeGnVa2ha", "F", "qC4SUzvBtsB95zH", "T9xPYhzLnjJILIo2UZ88O5HWOSlCgw65", "9Z5hXOcvGEJoZZ2dBR43Uw9AYXT3hwwE", "j5Icya"};

    @Nullable
    public WeakReference<AudioManager.OnAudioFocusChangeListener> A00;
    public final DX A01;
    public final DR A02;
    public final DP A03;

    public static String A02(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{-108, -88, -105, -100, -94};
    }

    static {
        A05();
    }

    public C3D(C3272dL c3272dL) {
        super(c3272dL);
        this.A00 = null;
        this.A01 = new DX() { // from class: com.facebook.ads.redexgen.X.3G
            public static byte[] A01;
            public static String[] A02 = {"QO", "Z8VzzUk48H2MjHputsbFKGrTuA", "oizJfYv64JjjPWcjk8h6rnHMPSWYW3KU", "f0BEY4eTEaDQ97bHAlskleks6ilDfv7w", "kzTTWWoLyKzhVsFKHFAAxGaFMysI7iP7", "O5", "DqVK5n8IQlswAJl59jQWGsTS7h", "g8gXhMPhSk6l7LNUsVLjaHR4ALnMtBc"};

            public static String A00(int i, int i10, int i11) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
                int i12 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].length() != strArr[0].length()) {
                        throw new RuntimeException();
                    }
                    A02[3] = "zGtxq0LnznDpkAI9fIogelgluQXN9rJC";
                    if (i12 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 108);
                    i12++;
                }
            }

            public static void A01() {
                A01 = new byte[]{7, 19, 2, 15, 9};
            }

            static {
                A01();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(C22383d c22383d) {
                ((AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 10))).abandonAudioFocus(this.A00.A00 == null ? null : (AudioManager.OnAudioFocusChangeListener) this.A00.A00.get());
            }
        };
        this.A02 = new DR() { // from class: com.facebook.ads.redexgen.X.3F
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i10, int i11) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
                for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
                    bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 103);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{90, 78, 95, 82, 84};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2895Tf
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                ((AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 92))).abandonAudioFocus(this.A00.A00 == null ? null : (AudioManager.OnAudioFocusChangeListener) this.A00.A00.get());
            }
        };
        this.A03 = new C3E(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2479Da
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2479Da
    public final void A08() {
        if (getVideoView() != null) {
            C2894Te<AbstractC2895Tf, C2893Td> eventBus = getVideoView().getEventBus();
            AbstractC2895Tf[] abstractC2895TfArr = new AbstractC2895Tf[3];
            String[] strArr = A05;
            if (strArr[5].charAt(16) == strArr[6].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "N8PlN6ko7rCmWrjSgXmwzpcc7zXrNMwO";
            strArr2[6] = "3Ei0HdJvkUvOcHctndwpn9MtMWHZ1TMz";
            abstractC2895TfArr[0] = this.A02;
            abstractC2895TfArr[1] = this.A01;
            abstractC2895TfArr[2] = this.A03;
            eventBus.A04(abstractC2895TfArr);
        }
        super.A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((AudioManager) getContext().getApplicationContext().getSystemService(A02(0, 5, 9))).abandonAudioFocus(this.A00 == null ? null : this.A00.get());
        super.onDetachedFromWindow();
    }
}
