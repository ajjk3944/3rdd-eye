package M0;

import Zg.AbstractC3682n;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import org.snmp4j.smi.Counter32;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static final e0 f12408a = new e0();

    /* renamed from: b, reason: collision with root package name */
    private static final long f12409b = a(0, 0);

    public static final long a(int i10, int i11) {
        return i0.a((i11 & Counter32.MAX_COUNTER32_VALUE) | (i10 << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt h(f0 f0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, O0.h[] hVarArr) {
        int iM = f0Var.m() - 1;
        if (f0Var.i().getLineStart(iM) != f0Var.i().getLineEnd(iM) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        O0.h hVar = (O0.h) AbstractC3682n.Z(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iM == 0 || !hVar.e()) ? hVar.e() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutA = a0.f12360a.a(spannableString, textPaint, MPv3.MAX_MESSAGE_ID, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? E.f12336a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? E.f12336a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : null, (2072512 & 512) != 0 ? MPv3.MAX_MESSAGE_ID : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : f0Var.h(), (2072512 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? true : f0Var.e(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & ImageMetadata.SHADING_MODE) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(O0.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (O0.h hVar : hVarArr) {
            if (hVar.c() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.d()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f12409b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O0.h[] j(f0 f0Var) {
        if (!(f0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = f0Var.G();
        AbstractC6492s.g(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!N.a((Spanned) charSequenceG, O0.h.class) && f0Var.G().length() > 0) {
            return null;
        }
        CharSequence charSequenceG2 = f0Var.G();
        AbstractC6492s.g(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (O0.h[]) ((Spanned) charSequenceG2).getSpans(0, f0Var.G().length(), O0.h.class);
    }

    public static final TextDirectionHeuristic k(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(f0 f0Var) {
        if (f0Var.h() || f0Var.J()) {
            return f12409b;
        }
        TextPaint paint = f0Var.i().getPaint();
        CharSequence text = f0Var.i().getText();
        Rect rectC = M.c(paint, text, f0Var.i().getLineStart(0), f0Var.i().getLineEnd(0));
        int lineAscent = f0Var.i().getLineAscent(0);
        int i10 = rectC.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : f0Var.i().getTopPadding();
        if (f0Var.m() != 1) {
            int iM = f0Var.m() - 1;
            rectC = M.c(paint, text, f0Var.i().getLineStart(iM), f0Var.i().getLineEnd(iM));
        }
        int lineDescent = f0Var.i().getLineDescent(f0Var.m() - 1);
        int i11 = rectC.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : f0Var.i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f12409b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i10) {
        return layout.getEllipsisCount(i10) > 0;
    }
}
