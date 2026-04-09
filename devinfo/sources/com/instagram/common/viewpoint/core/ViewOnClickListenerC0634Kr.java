package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Kr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC0634Kr extends AbstractC1121bb implements View.OnClickListener {
    public static byte[] A0E;
    public static String[] A0F = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", "E", "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0G;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1436gi A05;
    public XO A06;
    public C0640Kx A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public final C1115bV A0C;
    public final Map<String, String> A0D;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 28, 38, 18, 41, -27, 18, 23, 24, 38, 28, 26, 33, 93, 91, 77, 90, 75, 84, 81, 75, 83};
    }

    static {
        A04();
        A0G = (int) (XX.A02 * 24.0f);
    }

    public ViewOnClickListenerC0634Kr(C1436gi c1436gi, AbstractC1601jd abstractC1601jd, C0694Na c0694Na, VA va2, InterfaceC0977Yh interfaceC0977Yh, C1381fp c1381fp, Y2 y22, InterfaceC0951Xh interfaceC0951Xh) {
        this(c1436gi, abstractC1601jd.A0w(), c0694Na, abstractC1601jd.A29().A0J().A06(), va2, interfaceC0977Yh, c1381fp, y22, abstractC1601jd.A2A(), interfaceC0951Xh);
        this.A0C.A08(abstractC1601jd);
    }

    public ViewOnClickListenerC0634Kr(C1436gi c1436gi, String str, C0694Na c0694Na, VA va2, InterfaceC0977Yh interfaceC0977Yh, C1381fp c1381fp, Y2 y22, C0700Ng c0700Ng) {
        this(c1436gi, str, c0694Na, false, va2, interfaceC0977Yh, c1381fp, y22, c0700Ng);
    }

    public ViewOnClickListenerC0634Kr(C1436gi c1436gi, String str, C0694Na c0694Na, boolean z3, VA va2, InterfaceC0977Yh interfaceC0977Yh, C1381fp c1381fp, Y2 y22, C0700Ng c0700Ng) {
        super(c1436gi, c0694Na);
        this.A0D = new HashMap();
        this.A0B = false;
        this.A05 = c1436gi;
        this.A0A = z3;
        this.A0C = new C1115bV(c1436gi, str, c1381fp, y22, va2, c0700Ng, interfaceC0977Yh);
        setOnClickListener(this);
        YB.A0G(1001, this);
    }

    public ViewOnClickListenerC0634Kr(C1436gi c1436gi, String str, C0694Na c0694Na, boolean z3, VA va2, InterfaceC0977Yh interfaceC0977Yh, C1381fp c1381fp, Y2 y22, C0700Ng c0700Ng, InterfaceC0951Xh interfaceC0951Xh) {
        super(c1436gi, c0694Na);
        this.A0D = new HashMap();
        this.A0B = false;
        this.A05 = c1436gi;
        this.A0A = z3;
        this.A0C = new C1115bV(c1436gi, str, c1381fp, y22, va2, c0700Ng, interfaceC0977Yh, interfaceC0951Xh);
        setOnClickListener(this);
        YB.A0G(1001, this);
    }

    public static Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A02() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A00(YN.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? YM.MESSENGER : YM.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0G, 0, A0G, 0);
        }
    }

    private void A03() {
        if (this.A06 != null) {
            XO xo = this.A06;
            if (A0F[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            xo.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A05(AbstractC1601jd abstractC1601jd) {
        return ((long) abstractC1601jd.A25()) > 0 && abstractC1601jd.A23() >= 0;
    }

    public final EnumC0685Mq A0E(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return EnumC0685Mq.A09;
        }
        A03();
        this.A0D.put(A01(0, 12, 6), str);
        this.A0D.put(A01(24, 12, 58), String.valueOf(this.A0B));
        return this.A0C.A05(this.A08, this.A09, this.A0D);
    }

    public final boolean A0F(AbstractC1601jd abstractC1601jd, AbstractC0971Yb abstractC0971Yb) {
        if (this.A06 != null || !A05(abstractC1601jd) || abstractC1601jd.A2D().A02() == null || abstractC1601jd.A2D().A01() == null) {
            return false;
        }
        this.A07 = new C0640Kx(abstractC1601jd.A23(), abstractC1601jd.A25(), abstractC1601jd.A24(), abstractC1601jd.A2D().A02(), abstractC1601jd.A2D().A01(), abstractC0971Yb, this);
        this.A06 = new XO(abstractC1601jd.A25(), this.A07);
        this.A06.A07();
        return true;
    }

    public C1115bV getCtaActionHelper() {
        return this.A0C;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            A0E(A01(36, 9, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION));
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f10 = width - textWidth;
            float textWidth2 = this.A00;
            int i4 = (int) (f10 - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i4, top, left + i4, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (i4 != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (!z3) {
            A03();
        }
    }

    public void setCreativeAsCtaLoggingHelper(XS xs) {
        this.A0C.A09(xs);
    }

    public void setCta(C0696Nc c0696Nc, String str, Map<String, String> extraData) {
        setCta(c0696Nc, str, extraData, null);
    }

    public void setCta(C0696Nc c0696Nc, String str, Map<String, String> extraData, InterfaceC0951Xh interfaceC0951Xh, InterfaceC1114bU interfaceC1114bU) {
        setCta(c0696Nc, str, extraData, interfaceC1114bU);
        this.A0C.A0A(interfaceC0951Xh);
    }

    public void setCta(C0696Nc c0696Nc, String str, Map<String, String> extraData, InterfaceC1114bU interfaceC1114bU) {
        this.A08 = str;
        this.A09 = c0696Nc.A05();
        this.A0D.putAll(extraData);
        this.A0C.A0B(interfaceC1114bU);
        String strA04 = c0696Nc.A04();
        if (!TextUtils.isEmpty(strA04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(strA04);
                A02();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z3) {
        this.A0C.A0C(z3);
    }

    public void setV2Design(boolean z3) {
        this.A0B = z3;
    }
}
