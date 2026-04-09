package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public class FH extends QT {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public InterfaceC3160bW A02;
    public C3345eX A04;
    public List<C3239cn> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C3452gI A0C;
    public final AbstractC2814Qb A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC3164ba A0F = new FK(this);
    public InterfaceC3162bY A03 = new FJ(this);
    public final InterfaceC3163bZ A0E = new FI(this);

    public static String A05(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, -111, -122, -98, -92, -118, -109, -122, -121, -111, -118, -119, -92, -107, -122, -105, -122, -110, 81, 91, 103, 78, 81, 90, 91, 92, 103, 94, 81, 76, 77, 87, 103, 88, 73, 90, 73, 85, -51, -58, -61, -52, -60, -68, -42, -61, -68, -51, -68, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public FH(C21660h c21660h, int i, List<C3239cn> list, C3345eX c3345eX, Bundle bundle) {
        this.A0C = c21660h.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = c3345eX;
        this.A0D = new C3451gH(c21660h.getContext());
        this.A0B = c21660h.getContext();
        c21660h.A1h(this);
        A0D(bundle);
    }

    private AbstractC2625Ir A03(int i, int i10) {
        return A04(i, i10, true);
    }

    private AbstractC2625Ir A04(int i, int i10, boolean z10) {
        AbstractC2625Ir abstractC2625Ir = null;
        while (i <= i10) {
            AbstractC2625Ir abstractC2625Ir2 = (AbstractC2625Ir) this.A0C.A1o(i);
            if (abstractC2625Ir2 == null || abstractC2625Ir2.A1S()) {
                return null;
            }
            boolean zA0a = A0a(abstractC2625Ir2);
            if (abstractC2625Ir == null && abstractC2625Ir2.A1T() && zA0a && !this.A0G.contains(Integer.valueOf(i)) && (!z10 || A0I(abstractC2625Ir2, this.A0A))) {
                abstractC2625Ir = abstractC2625Ir2;
            }
            if (abstractC2625Ir2.A1T() && !zA0a) {
                A0C(i, false);
            }
            i++;
        }
        return abstractC2625Ir;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        AbstractC2625Ir abstractC2625IrA03 = A03(lastVisibleItem, firstVisibleItem);
        if (abstractC2625IrA03 != null) {
            abstractC2625IrA03.A1Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int iA25 = this.A0C.A25();
        if (iA25 != -1) {
            int curPos = this.A05.size();
            if (iA25 < curPos - 1) {
                int curPos2 = iA25 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i) {
        AbstractC2625Ir abstractC2625IrA04 = A04(i + 1, this.A0C.A27(), false);
        if (abstractC2625IrA04 != null) {
            abstractC2625IrA04.A1Q();
            A0U(((Integer) abstractC2625IrA04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i10) {
        while (i <= i10) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i10) {
        A0S(i);
        A0S(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i, boolean z10) {
        if (z10) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC3106ae abstractC3106ae, int i) {
        int allowedAreaMaxX;
        int furthestX;
        if (i == 2) {
            allowedAreaMaxX = AbstractC2975Wl.A04.widthPixels - 1;
        } else {
            int width = abstractC3106ae.getWidth();
            int allowedAreaMinX = AbstractC2975Wl.A04.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i == 2) {
            furthestX = 1;
        } else {
            int i10 = AbstractC2975Wl.A04.widthPixels;
            int allowedAreaMinX2 = abstractC3106ae.getWidth();
            furthestX = (int) (((i10 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x10 = abstractC3106ae.getX();
        int allowedAreaMinX3 = abstractC3106ae.getWidth();
        return ((int) (x10 + ((float) allowedAreaMinX3))) <= allowedAreaMaxX && abstractC3106ae.getX() >= ((float) furthestX);
    }

    private boolean A0J(AbstractC2625Ir abstractC2625Ir) {
        if (!this.A08 || !abstractC2625Ir.A1T()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public void A0L(C23196g c23196g, int i) {
        super.A0L(c23196g, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public void A0M(C23196g c23196g, int i, int i10) {
        super.A0M(c23196g, i, i10);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i);
    }

    public final InterfaceC3162bY A0N() {
        return this.A03;
    }

    public final InterfaceC3163bZ A0O() {
        return this.A0E;
    }

    public final InterfaceC3164ba A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int iA27 = this.A0C.A27();
        for (int iA26 = this.A0C.A26(); iA26 <= iA27 && iA26 >= 0; iA26++) {
            AbstractC2625Ir card = (AbstractC2625Ir) this.A0C.A1o(iA26);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A1S()) {
                this.A01 = iA26;
                card.A1P();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC2625Ir abstractC2625Ir = (AbstractC2625Ir) this.A0C.A1o(this.A01);
        if (abstractC2625Ir != null && this.A01 >= 0) {
            abstractC2625Ir.A1Q();
        }
    }

    public final void A0S(int i) {
        AbstractC2625Ir abstractC2625Ir = (AbstractC2625Ir) this.A0C.A1o(i);
        if (abstractC2625Ir != null && !A0a(abstractC2625Ir)) {
            A0Z(abstractC2625Ir, false);
        }
    }

    public final void A0T(int i) {
        AbstractC2625Ir abstractC2625Ir = (AbstractC2625Ir) this.A0C.A1o(i);
        if (abstractC2625Ir == null) {
            return;
        }
        if (A0a(abstractC2625Ir)) {
            A0Z(abstractC2625Ir, true);
        }
        if (A0J(abstractC2625Ir) && this.A05 != null) {
            this.A0F.setVolume(this.A05.get(((Integer) abstractC2625Ir.getTag(-1593835536)).intValue()).A03().A0H().A0A() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i) {
        this.A0D.A0A(i);
        this.A0C.A1N(this.A0D);
    }

    public final void A0V(int i, int i10, int i11) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A25();
        if (recomputeFrom == -1) {
            recomputeFrom = i11 < 0 ? i : i10;
        }
        this.A02.AJp(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z10) {
        view.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC3160bW interfaceC3160bW) {
        this.A02 = interfaceC3160bW;
    }

    public void A0Z(AbstractC2625Ir abstractC2625Ir, boolean z10) {
        if (A0H()) {
            A0X(abstractC2625Ir, z10);
        }
        if (!z10 && abstractC2625Ir.A1S()) {
            abstractC2625Ir.A1P();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
