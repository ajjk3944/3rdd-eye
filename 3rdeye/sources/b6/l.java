package B6;

import K6.C0713c;
import N7.C1134d4;
import N7.C1325q8;
import N7.C1439yb;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.List;

/* compiled from: DivTooltipController.kt */
/* loaded from: classes.dex */
public final class l {

    /* compiled from: DivTooltipController.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f558a;

        static {
            int[] iArr = new int[C1439yb.a.values().length];
            try {
                iArr[C1439yb.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1439yb.a.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1439yb.a.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1439yb.a.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C1439yb.a.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C1439yb.a.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C1439yb.a.TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C1439yb.a.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C1439yb.a.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f558a = iArr;
        }
    }

    public static final Point a(View view, View anchor, C1439yb divTooltip, A7.d resolver) {
        int width;
        int height;
        int iG0;
        kotlin.jvm.internal.l.f(anchor, "anchor");
        kotlin.jvm.internal.l.f(divTooltip, "divTooltip");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        int iG02 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        C1439yb.a aVarA = divTooltip.f9983j.a(resolver);
        int i = point.x;
        int[] iArr2 = a.f558a;
        switch (iArr2[aVarA.ordinal()]) {
            case 1:
            case 2:
            case 3:
                width = -view.getWidth();
                break;
            case 4:
            case 5:
            case 6:
                width = anchor.getWidth();
                break;
            case 7:
            case 8:
            case 9:
                width = (anchor.getWidth() - view.getWidth()) / 2;
                break;
            default:
                throw new b9.j();
        }
        point.x = i + width;
        int i10 = point.y;
        switch (iArr2[aVarA.ordinal()]) {
            case 1:
            case 5:
            case 9:
                height = (anchor.getHeight() - view.getHeight()) / 2;
                break;
            case 2:
            case 4:
            case 7:
                height = -view.getHeight();
                break;
            case 3:
            case 6:
            case 8:
                height = anchor.getHeight();
                break;
            default:
                throw new b9.j();
        }
        point.y = i10 + height;
        DisplayMetrics displayMetrics = anchor.getResources().getDisplayMetrics();
        int i11 = point.x;
        C1325q8 c1325q8 = divTooltip.i;
        if (c1325q8 != null) {
            C1134d4 c1134d4 = c1325q8.f8992a;
            kotlin.jvm.internal.l.e(displayMetrics, "displayMetrics");
            iG0 = C0713c.g0(c1134d4, displayMetrics, resolver);
        } else {
            iG0 = 0;
        }
        point.x = i11 + iG0;
        int i12 = point.y;
        if (c1325q8 != null) {
            C1134d4 c1134d42 = c1325q8.f8993b;
            kotlin.jvm.internal.l.e(displayMetrics, "displayMetrics");
            iG02 = C0713c.g0(c1134d42, displayMetrics, resolver);
        }
        point.y = i12 + iG02;
        return point;
    }

    public static final b9.l b(View view, String str) {
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List<C1439yb> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (C1439yb c1439yb : list) {
                if (kotlin.jvm.internal.l.b(c1439yb.f9981g, str)) {
                    return new b9.l(c1439yb, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            C6.o oVar = new C6.o((ViewGroup) view, 1);
            while (oVar.hasNext()) {
                b9.l lVarB = b((View) oVar.next(), str);
                if (lVarB != null) {
                    return lVarB;
                }
            }
        }
        return null;
    }
}
