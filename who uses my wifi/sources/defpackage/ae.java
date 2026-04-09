package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ae extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae(int i, Class cls, String str) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((aq) obj).b());
            case 6:
                return Float.valueOf(((n60) obj).h);
            case 7:
                return Float.valueOf(((p60) obj).i);
            case 8:
                return Float.valueOf(((SwitchCompat) obj).E);
            case 9:
                return Float.valueOf(f71.a.l((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                de deVar = (de) obj;
                PointF pointF = (PointF) obj2;
                deVar.getClass();
                deVar.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                deVar.b = iRound;
                int i = deVar.f + 1;
                deVar.f = i;
                if (i == deVar.g) {
                    f71.a(deVar.e, deVar.a, iRound, deVar.c, deVar.d);
                    deVar.f = 0;
                    deVar.g = 0;
                    break;
                }
                break;
            case 1:
                de deVar2 = (de) obj;
                PointF pointF2 = (PointF) obj2;
                deVar2.getClass();
                deVar2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                deVar2.d = iRound2;
                int i2 = deVar2.g + 1;
                deVar2.g = i2;
                if (deVar2.f == i2) {
                    f71.a(deVar2.e, deVar2.a, deVar2.b, deVar2.c, iRound2);
                    deVar2.f = 0;
                    deVar2.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                f71.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                f71.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                f71.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                aq aqVar = (aq) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                if (aqVar.n != fFloatValue) {
                    aqVar.n = fFloatValue;
                    aqVar.invalidateSelf();
                    break;
                }
                break;
            case 6:
                n60 n60Var = (n60) obj;
                n60Var.h = ((Float) obj2).floatValue();
                ArrayList arrayList = (ArrayList) n60Var.b;
                ((cq) arrayList.get(0)).a = 0.0f;
                float fG = bd2.g(((int) (r14 * 333.0f)) / 667, 0.0f, 1.0f);
                cq cqVar = (cq) arrayList.get(0);
                cq cqVar2 = (cq) arrayList.get(1);
                fu fuVar = n60Var.d;
                float interpolation = fuVar.getInterpolation(fG);
                cqVar2.a = interpolation;
                cqVar.b = interpolation;
                cq cqVar3 = (cq) arrayList.get(1);
                cq cqVar4 = (cq) arrayList.get(2);
                float interpolation2 = fuVar.getInterpolation(fG + 0.49925038f);
                cqVar4.a = interpolation2;
                cqVar3.b = interpolation2;
                ((cq) arrayList.get(2)).b = 1.0f;
                if (n60Var.g && ((cq) arrayList.get(1)).b < 1.0f) {
                    ((cq) arrayList.get(2)).c = ((cq) arrayList.get(1)).c;
                    ((cq) arrayList.get(1)).c = ((cq) arrayList.get(0)).c;
                    ((cq) arrayList.get(0)).c = n60Var.e.e[n60Var.f];
                    n60Var.g = false;
                }
                ((n20) n60Var.a).invalidateSelf();
                break;
            case 7:
                p60 p60Var = (p60) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                p60Var.i = fFloatValue2;
                int i3 = (int) (fFloatValue2 * 1800.0f);
                Interpolator[] interpolatorArr = p60Var.e;
                ArrayList arrayList2 = (ArrayList) p60Var.b;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    cq cqVar5 = (cq) arrayList2.get(i4);
                    int i5 = i4 * 2;
                    int i6 = p60.l[i5];
                    int[] iArr = p60.k;
                    cqVar5.a = bd2.g(interpolatorArr[i5].getInterpolation(bd2.g((i3 - i6) / iArr[i5], 0.0f, 1.0f)), 0.0f, 1.0f);
                    cqVar5.b = bd2.g(interpolatorArr[i5 + 1].getInterpolation(bd2.g((i3 - r5[r6]) / iArr[r6], 0.0f, 1.0f)), 0.0f, 1.0f);
                }
                if (p60Var.h) {
                    int size = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = arrayList2.get(i7);
                        i7++;
                        ((cq) obj3).c = p60Var.f.e[p60Var.g];
                    }
                    p60Var.h = false;
                }
                ((n20) p60Var.a).invalidateSelf();
                break;
            case 8:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 9:
                f71.a.y((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
