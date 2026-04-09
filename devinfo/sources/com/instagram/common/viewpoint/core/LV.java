package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network/classes2.dex */
public final class LV extends AbstractC1082ay {
    public static byte[] A0F;
    public static String[] A0G = {"X5ywJXgSTO8PHmyyLHkjy", "LJCQW", "068uN", "say", "rTIjgGKqeW39zjdqZS0Aqu4tLxC", "Qrp", "m8T4zYbfVU3hLt0iEDnj", "pXMACVxBUOAUm1D"};
    public static final String A0H;
    public float A00;
    public Y2 A01;
    public AbstractC1380fo A02;
    public C1381fp A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Path A07;
    public final RectF A08;
    public final C1436gi A09;
    public final WeakReference<InterfaceC1085b1> A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final AtomicInteger A0D;
    public final AtomicReference<String> A0E;

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0F = new byte[]{91, 126, 89, 117, 116, 110, 104, 117, 118};
    }

    static {
        A04();
        A0H = LV.class.getSimpleName();
    }

    public LV(C1436gi c1436gi, WeakReference<InterfaceC1085b1> weakReference, int i4, String str) {
        this(c1436gi, weakReference, i4, false);
        if (C0886Up.A1z(c1436gi)) {
            c1436gi.A02().A0B().AKo(this, str == null ? A02(0, 0, 91) : str, false, true);
            this.A06 = true;
        }
    }

    public LV(C1436gi c1436gi, WeakReference<InterfaceC1085b1> weakReference, int i4, boolean z3) {
        super(c1436gi);
        this.A0B = new AtomicBoolean();
        this.A0C = new AtomicBoolean(true);
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A0D = new AtomicInteger(PAGErrorCode.LOAD_FACTORY_NULL_CODE);
        this.A0E = new AtomicReference<>();
        this.A01 = new Y2();
        this.A05 = true;
        this.A06 = false;
        this.A09 = c1436gi;
        this.A04 = z3;
        this.A0A = weakReference;
        this.A02 = new C0659Lq(this);
        this.A03 = new C1381fp(this, i4, new WeakReference(this.A02), this.A09);
        setWebChromeClient(A0G());
        setWebViewClient(A0H());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        addJavascriptInterface(new C1084b0(this, weakReference.get(), this.A03, this.A0B, this.A0C, this.A09), A02(0, 9, 46));
    }

    private final boolean A05() {
        return this.A0B.get();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1082ay
    public final WebChromeClient A0G() {
        return new C1086b2();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1082ay
    public final WebViewClient A0H() {
        return new C1087b3(this.A09, this.A0A, new WeakReference(this.A03), new WeakReference(this.A01), new WeakReference(this.A0C), new WeakReference(this), this.A0D, this.A0E, this.A04);
    }

    public final void A0K() {
        this.A09.A0F().AKq();
        this.A0B.set(true);
        new Handler(Looper.getMainLooper()).post(new C0650Lh(this.A03));
    }

    public final void A0L(int i4, int i10) {
        if (this.A03 != null) {
            this.A03.A0W(i4);
            this.A03.A0X(i10);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1082ay, android.webkit.WebView
    public final void destroy() {
        if (this.A06) {
            this.A09.A02().A0B().AKU(this);
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        YB.A0J(this);
        this.A02 = null;
        this.A01 = null;
        AbstractC1088b4.A03(this);
        super.destroy();
    }

    public Y2 getTouchDataRecorder() {
        return this.A01;
    }

    public C1381fp getViewabilityChecker() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A00 > 0.0f) {
            this.A08.set(0.0f, 0.0f, getWidth(), getHeight());
            String[] strArr = A0G;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[1] = "xZYpx";
            strArr2[2] = "aqsn9";
            this.A07.reset();
            this.A07.addRoundRect(this.A08, this.A00, this.A00, Path.Direction.CW);
            canvas.clipPath(this.A07);
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.A01.A06(this.A09, motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (this.A0A.get() != null) {
            this.A0A.get();
        }
        if (this.A03 == null) {
            return;
        }
        C1436gi c1436gi = this.A09;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "5ON080OOKwQwIFP5OG7h";
        strArr2[0] = "JBDgk0gsadULglMDLs8S8";
        c1436gi.A0F().AL4(i4);
        if (i4 == 0 && A05()) {
            this.A03.A0U();
        } else {
            if (i4 != 8) {
                return;
            }
            this.A03.A0V();
        }
    }

    public void setBlockLocalFileAccessOutsideCache(boolean z3) {
        this.A04 = z3;
    }

    public void setCheckAssetsByJavascriptBridge(boolean z3) {
        this.A0C.set(z3);
    }

    public void setCornerRadius(float f10) {
        this.A00 = f10;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z3) {
        this.A05 = z3;
    }

    public void setRequestId(String str) {
        this.A0E.set(str);
    }

    public void setWebViewTimeoutInMillis(int i4) {
        if (i4 >= 0) {
            this.A0D.set(i4);
        }
    }
}
