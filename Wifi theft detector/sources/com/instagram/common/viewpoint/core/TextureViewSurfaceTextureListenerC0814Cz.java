package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Cz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class TextureViewSurfaceTextureListenerC0814Cz extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC1738fU, InterfaceC1754fk, InterfaceC1740fW {
    public static byte[] A0O;
    public static String[] A0P = {"HP", "vI", "IkPvJjq0d6kyiPKTTS2lCNhYTces79dt", "hRUerIi7AJ3jOkGNT2UiHpaxkSFge2bW", "Avvx3DFr2S27", "gmbQyyKnf6LsZqIL76N8lXPSt8AAYSbH", "tA8cc29oavr4xgkZce", "dMNAf6LzALyzJxRA4XpvvVCIX8V0s"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public C1814gi A0A;
    public EnumC1701et A0B;
    public C1741fX A0C;
    public EnumC1756fm A0D;
    public EnumC1756fm A0E;
    public InterfaceC1757fn A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{-56, -11, -11, -14, -11, -93, -20, -15, -93, -56, -5, -14, -45, -17, -28, -4, -24, -11, -93, -25, -8, -24, -93, -9, -14, -93, -14, -15, -42, -8, -11, -23, -28, -26, -24, -41, -24, -5, -9, -8, -11, -24, -57, -24, -10, -9, -11, -14, -4, -24, -25, -93, -25, -8, -11, -20, -15, -22, -93, -10, -24, -9, -39, -20, -25, -24, -14, -42, -8, -11, -23, -28, -26, -24, -93, -24, 27, 18, -13, 15, 4, 28, 8, 21, -61, 8, 21, 21, 18, 21, -61, 23, 21, 12, 10, 10, 8, 21, 8, 7, -61, 5, 28, -61, 18, 17, -10, 24, 21, 9, 4, 6, 8, -9, 8, 27, 23, 24, 21, 8, -25, 8, 22, 23, 21, 18, 28, 8, 7, -61, 7, 24, 21, 12, 17, 10, -61, 19, 4, 24, 22, 8, -61, -26, 14, 14, 6, Flags.CD, 4, -65, 0, Flags.CD, 22, 0, 24, 18, -65, 19, 7, 17, 14, 22, -65, 0, 13, -65, 4, 23, 2, 4, 15, 19, 8, 14, 13, -65, 22, 8, 19, 7, -65, 18, 4, 19, -31, 0, 2, 10, 6, 17, 14, 20, 13, 3, -29, 17, 0, 22, 0, 1, Flags.CD, 4, -65, 14, 13, -65, -19, 14, 20, 6, 0, 19, -65, 0, 1, 14, 21, 4, -51, -65, 18, 14, -65, 22, 4, -65, 18, 8, Flags.CD, 4, 13, 19, Flags.CD, 24, -65, 8, 6, 13, 14, 17, 4, -65, 8, 19, -51, -92, -52, -52, -60, -55, -62, 125, -66, -55, -44, -66, -42, -48, 125, -47, -59, -49, -52, -44, 125, -66, -53, 125, -62, -43, -64, -62, -51, -47, -58, -52, -53, 125, -44, -58, -47, -59, 125, -48, -62, -47, -93, -52, -49, -62, -60, -49, -52, -46, -53, -63, 125, -52, -53, 125, -85, -52, -46, -60, -66, -47, 125, -66, -65, -52, -45, -62, -117, 125, -48, -52, 125, -44, -62, 125, -48, -58, -55, -62, -53, -47, -55, -42, 125, -58, -60, -53, -52, -49, -62, 125, -58, -47, -117, -62, -43, -48, -47, -37, -116, -33, -32, -51, -32, -47, -116, -49, -44, -51, -38, -45, -47, -48, -116, -32, -37, -116, -25, -27, -18, -27, -14, -23, -29};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C1264Up.A20(this.A0A)) {
            EnumC1756fm enumC1756fm = this.A0D;
            if (A0P[6].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[0] = "Md";
            strArr[1] = "f0";
            if (enumC1756fm == EnumC1756fm.A08) {
                return;
            }
            if (!this.A0L) {
                this.A0L = true;
                this.A0A.A0F().AIz();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0F != null) {
                this.A0F.ADy(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0Q = TextureViewSurfaceTextureListenerC0814Cz.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC0814Cz(C1814gi c1814gi) {
        super(c1814gi);
        this.A0D = EnumC1756fm.A04;
        this.A0E = EnumC1756fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC1701et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1814gi;
    }

    public TextureViewSurfaceTextureListenerC0814Cz(C1814gi c1814gi, AttributeSet attributeSet) {
        super(c1814gi, attributeSet);
        this.A0D = EnumC1756fm.A04;
        this.A0E = EnumC1756fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC1701et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1814gi;
    }

    public TextureViewSurfaceTextureListenerC0814Cz(C1814gi c1814gi, AttributeSet attributeSet, int i10) {
        super(c1814gi, attributeSet, i10);
        this.A0D = EnumC1756fm.A04;
        this.A0E = EnumC1756fm.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC1701et.A03;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c1814gi;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.gi r1 = r5.A0A
            com.facebook.ads.redexgen.X.fX r0 = new com.facebook.ads.redexgen.X.fX
            r0.<init>(r1)
            r5.A0C = r0
            com.facebook.ads.redexgen.X.fX r0 = r5.A0C
            r0.A0H(r5)
            com.facebook.ads.redexgen.X.fX r0 = r5.A0C
            r0.A0G(r5)
            com.facebook.ads.redexgen.X.fX r0 = r5.A0C
            r3 = 0
            r0.A0I(r3)
            boolean r0 = r5.A0J
            if (r0 == 0) goto L4a
            boolean r0 = r5.A0I
            if (r0 != 0) goto L4a
            com.facebook.ads.redexgen.X.gi r0 = r5.A0A
            android.app.Activity r1 = r0.A0E()
            if (r1 == 0) goto L66
            android.widget.MediaController r0 = new android.widget.MediaController
            r0.<init>(r1)
            r5.A09 = r0
            android.widget.MediaController r1 = r5.A09
            android.view.View r0 = r5.A08
            if (r0 != 0) goto L63
            r0 = r5
        L37:
            r1.setAnchorView(r0)
            android.widget.MediaController r1 = r5.A09
            com.facebook.ads.redexgen.X.fd r0 = new com.facebook.ads.redexgen.X.fd
            r0.<init>(r5)
            r1.setMediaPlayer(r0)
            android.widget.MediaController r1 = r5.A09
            r0 = 1
            r1.setEnabled(r0)
        L4a:
            java.lang.String r0 = r5.A0G
            if (r0 == 0) goto La4
            java.lang.String r4 = r5.A0G
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.TextureViewSurfaceTextureListenerC0814Cz.A0P
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 18
            if (r1 == r0) goto L8e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L63:
            android.view.View r0 = r5.A08
            goto L37
        L66:
            r4 = 0
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.TextureViewSurfaceTextureListenerC0814Cz.A0P
            r0 = 5
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 121(0x79, float:1.7E-43)
            if (r1 == r0) goto L7f
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.TextureViewSurfaceTextureListenerC0814Cz.A0P
            java.lang.String r1 = "TO7k5EC8ZWp6tpojZW"
            r0 = 6
            r2[r0] = r1
            r5.A09 = r4
            goto L4a
        L7f:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.TextureViewSurfaceTextureListenerC0814Cz.A0P
            java.lang.String r1 = "fS"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "9d"
            r0 = 1
            r2[r0] = r1
            r5.A09 = r4
            goto L4a
        L8e:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.TextureViewSurfaceTextureListenerC0814Cz.A0P
            java.lang.String r1 = "Pg"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "vu"
            r0 = 1
            r2[r0] = r1
            int r0 = r4.length()
            if (r0 == 0) goto La4
            boolean r0 = r5.A0K
            if (r0 == 0) goto Lb1
        La4:
            com.facebook.ads.redexgen.X.fX r2 = r5.A0C
            com.facebook.ads.redexgen.X.gi r0 = r5.A0A
            com.facebook.ads.redexgen.X.ge r1 = r0.A02()
            android.net.Uri r0 = r5.A06
            r2.A0F(r1, r0)
        Lb1:
            com.facebook.ads.redexgen.X.fm r0 = com.instagram.common.viewpoint.core.EnumC1756fm.A08
            r5.setVideoState(r0)
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto Lc3
            android.graphics.SurfaceTexture r0 = r5.getSurfaceTexture()
            r5.onSurfaceTextureAvailable(r0, r3, r3)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.TextureViewSurfaceTextureListenerC0814Cz.A04():void");
    }

    private void A05() {
        C1739fV videoFormat;
        if (this.A0C != null && (videoFormat = this.A0C.A08()) != null) {
            A08(videoFormat.A01, videoFormat.A00);
        }
    }

    private void A06() {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
        }
        if (this.A0C != null) {
            this.A0C.A09();
            this.A0C = null;
        }
        this.A09 = null;
        this.A0N = false;
        setVideoState(EnumC1756fm.A04);
    }

    private void A08(int i10, int i11) {
        if (i10 != this.A03 || i11 != this.A02) {
            this.A03 = i10;
            this.A02 = i11;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return C1741fX.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A9d();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final void A9d() {
        if (!this.A0H) {
            AGr(false, 3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final boolean A9q() {
        return this.A0C != null && this.A0C.A0K();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final boolean A9r() {
        return this.A0N;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final boolean AAc() {
        return this.A0M;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1738fU
    public final void AFL(String str, Exception exc) {
        this.A0A.A0F().ACW(str);
        this.A0A.A0F().A3i(1);
        setVideoState(EnumC1756fm.A03);
        this.A0A.A08().ABC(A03(362, 7, 50), AbstractC1226Td.A1N, new C1227Te(exc));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r3 = com.instagram.common.viewpoint.core.EnumC1756fm.A05;
        r2 = com.instagram.common.viewpoint.core.TextureViewSurfaceTextureListenerC0814Cz.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r2[4].length() == r2[7].length()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        com.instagram.common.viewpoint.core.TextureViewSurfaceTextureListenerC0814Cz.A0P[6] = "dNFvbzP2EYglZVOCcO";
        setVideoState(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1738fU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFM(boolean r8, int r9) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.TextureViewSurfaceTextureListenerC0814Cz.AFM(boolean, int):void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1740fW
    public final void AGa(int i10, int i11, int i12, float f10) {
        A08(i10, i11);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final void AGr(boolean z10, int i10) {
        this.A0A.A0F().A3e(i10);
        this.A0E = EnumC1756fm.A05;
        this.A0M = z10;
        if (this.A0C != null) {
            this.A0C.A0I(false);
        } else {
            setVideoState(EnumC1756fm.A04);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final void AK1(int i10) {
        this.A0A.A0F().ACX(i10);
        setVideoState(EnumC1756fm.A09);
        AKF(5);
        this.A05 = 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final void AK6(EnumC1701et enumC1701et, int i10) {
        this.A0A.A0F().A3p(i10);
        this.A0M = false;
        this.A0E = EnumC1756fm.A0A;
        this.A0B = enumC1701et;
        if (this.A0C == null) {
            setup(this.A06);
            return;
        }
        if (this.A0D != EnumC1756fm.A07 && this.A0D != EnumC1756fm.A05 && this.A0D != EnumC1756fm.A06) {
            return;
        }
        this.A0C.A0I(true);
        EnumC1756fm enumC1756fm = EnumC1756fm.A0A;
        String[] strArr = A0P;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[0] = "Wi";
        strArr2[1] = "9L";
        setVideoState(enumC1756fm);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final void AKF(int i10) {
        this.A0A.A0F().A3r(i10);
        this.A0E = EnumC1756fm.A04;
        if (this.A0C != null) {
            this.A0C.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC1756fm.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final void destroy() {
        A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public int getCurrentPosition() {
        if (this.A0C != null) {
            return (int) this.A0C.A06();
        }
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public int getDuration() {
        if (this.A0C == null) {
            return 0;
        }
        return (int) this.A0C.A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public EnumC1701et getStartReason() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public EnumC1756fm getState() {
        return this.A0D;
    }

    public EnumC1756fm getTargetState() {
        return this.A0E;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public View getView() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C1264Up.A2l(getContext()) && !isHardwareAccelerated()) {
            setVideoState(EnumC1756fm.A03);
            AKF(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.A07 != null) {
            this.A07.release();
        }
        this.A07 = new Surface(surfaceTexture);
        if (this.A0C == null) {
            return;
        }
        this.A0C.A0E(this.A07);
        if (this.A0D == EnumC1756fm.A05 && !this.A0M) {
            AK6(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
            if (this.A0C != null) {
                try {
                    this.A0C.A0E(null);
                } catch (Exception e10) {
                    this.A0A.A0F().ACW(A03(0, 75, 53) + e10.getMessage());
                }
            }
        }
        if (this.A0D != EnumC1756fm.A05) {
            try {
                AGr(false, 5);
                return true;
            } catch (Exception e11) {
                this.A0A.A0F().ACW(A03(75, 68, 85) + e11.getMessage());
                return true;
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.A0C == null) {
            return;
        }
        if (this.A09 != null && this.A09.isShowing()) {
            return;
        }
        if (!z10) {
            if (this.A0D != EnumC1756fm.A05) {
                if ((this.A0A.A0H().A01() || C1264Up.A25(this.A0A)) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.fc
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0A();
                        }
                    }, 1000L);
                    return;
                } else {
                    A9d();
                    return;
                }
            }
            return;
        }
        if (this.A0D != EnumC1756fm.A05 || this.A0M) {
            return;
        }
        AK6(this.A0B, 9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public final void seekTo(int i10) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i10);
        } else {
            this.A05 = i10;
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(143, 102, 81));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public void setBackgroundPlaybackEnabled(boolean z10) {
        this.A0H = z10;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC1749ff(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0Q, A03(WKSRecord.Service.LINK, 94, 15));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public void setFullScreen(boolean z10) {
        this.A0J = z10;
        if (z10 && !this.A0I) {
            setOnTouchListener(new ViewOnTouchListenerC1748fe(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public void setRequestedVolume(float f10) {
        this.A00 = f10;
        if (this.A0C != null && this.A0D != EnumC1756fm.A08 && this.A0D != EnumC1756fm.A04) {
            this.A0C.A0C(f10);
        }
    }

    public void setTestMode(boolean z10) {
        this.A0K = z10;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC1756fm enumC1756fm) {
        if (enumC1756fm != this.A0D) {
            if (this.A0A.A05().AAO()) {
                String str = A03(339, 23, 30) + enumC1756fm;
            }
            this.A0D = enumC1756fm;
            if (this.A0D == EnumC1756fm.A0A) {
                this.A0N = true;
            }
            if (this.A0F != null) {
                this.A0F.AGd(enumC1756fm);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public void setVideoStateChangeListener(InterfaceC1757fn interfaceC1757fn) {
        this.A0F = interfaceC1757fn;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fk
    public void setup(Uri uri) {
        this.A0A.A0F().A3h();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
