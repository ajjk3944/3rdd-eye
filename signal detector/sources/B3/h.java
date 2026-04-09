package B3;

import L0.C0159d;
import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import m0.C2650a;

/* loaded from: classes.dex */
public final class h extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Class cls, String str) {
        super(cls, str);
        this.f585a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f585a) {
            case 0:
                return Float.valueOf(((i) obj).f596h);
            case 1:
                return Float.valueOf(((i) obj).i);
            case 2:
                return Float.valueOf(((k) obj).f610h);
            case 3:
                return Float.valueOf(((k) obj).i);
            case 4:
                return Float.valueOf(((q) obj).b());
            case 5:
                return Float.valueOf(((y) obj).f684h);
            case 6:
                return Float.valueOf(((A) obj).i);
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return Float.valueOf(L0.v.f2491a.k((View) obj));
            case 13:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f4955N);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f585a) {
            case 0:
                i iVar = (i) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                iVar.f596h = fFloatValue;
                int i = (int) (fFloatValue * 5400.0f);
                C2650a c2650a = iVar.f593e;
                ArrayList arrayList = (ArrayList) iVar.f663b;
                r rVar = (r) arrayList.get(0);
                float f2 = iVar.f596h * 1520.0f;
                rVar.f646a = (-20.0f) + f2;
                rVar.f647b = f2;
                for (int i3 = 0; i3 < 4; i3++) {
                    rVar.f647b = (c2650a.getInterpolation(u.i(i, i.f587k[i3], 667)) * 250.0f) + rVar.f647b;
                    rVar.f646a = (c2650a.getInterpolation(u.i(i, i.f588l[i3], 667)) * 250.0f) + rVar.f646a;
                }
                float f5 = rVar.f646a;
                float f6 = rVar.f647b;
                rVar.f646a = (((f6 - f5) * iVar.i) + f5) / 360.0f;
                rVar.f647b = f6 / 360.0f;
                int i6 = 0;
                while (true) {
                    if (i6 < 4) {
                        float fI = u.i(i, i.f589m[i6], 333);
                        if (fI <= 0.0f || fI >= 1.0f) {
                            i6++;
                        } else {
                            int i7 = i6 + iVar.f595g;
                            int[] iArr = iVar.f594f.f563e;
                            int length = i7 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            ((r) arrayList.get(0)).f648c = e3.b.a(c2650a.getInterpolation(fI), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        }
                    }
                }
                ((v) iVar.f662a).invalidateSelf();
                break;
            case 1:
                ((i) obj).i = ((Float) obj2).floatValue();
                break;
            case 2:
                k kVar = (k) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                kVar.f610h = fFloatValue2;
                int i8 = (int) (fFloatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = kVar.f607e;
                ArrayList arrayList2 = (ArrayList) kVar.f663b;
                r rVar2 = (r) arrayList2.get(0);
                float f7 = kVar.f610h * 1080.0f;
                int[] iArr2 = k.f602l;
                float interpolation = 0.0f;
                for (int i9 : iArr2) {
                    interpolation += timeInterpolator.getInterpolation(u.i(i8, i9, 500)) * 90.0f;
                }
                rVar2.f652g = f7 + interpolation;
                float interpolation2 = timeInterpolator.getInterpolation(u.i(i8, 0, 3000)) - timeInterpolator.getInterpolation(u.i(i8, 3000, 3000));
                rVar2.f646a = 0.0f;
                float[] fArr = k.f603m;
                float fM = a4.t.m(fArr[0], fArr[1], interpolation2);
                rVar2.f647b = fM;
                float f8 = kVar.i;
                if (f8 > 0.0f) {
                    rVar2.f647b = (1.0f - f8) * fM;
                }
                int i10 = 0;
                while (true) {
                    if (i10 < iArr2.length) {
                        float fI2 = u.i(i8, iArr2[i10], 100);
                        if (fI2 < 0.0f || fI2 > 1.0f) {
                            i10++;
                        } else {
                            int i11 = i10 + kVar.f609g;
                            int[] iArr3 = kVar.f608f.f563e;
                            int length3 = i11 % iArr3.length;
                            int length4 = (length3 + 1) % iArr3.length;
                            ((r) arrayList2.get(0)).f648c = e3.b.a(timeInterpolator.getInterpolation(fI2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        }
                    }
                }
                ((v) kVar.f662a).invalidateSelf();
                break;
            case 3:
                ((k) obj).i = ((Float) obj2).floatValue();
                break;
            case 4:
                q qVar = (q) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                if (qVar.i != fFloatValue3) {
                    qVar.i = fFloatValue3;
                    qVar.invalidateSelf();
                    break;
                }
                break;
            case 5:
                y yVar = (y) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                yVar.f684h = fFloatValue4;
                ArrayList arrayList3 = (ArrayList) yVar.f663b;
                ((r) arrayList3.get(0)).f646a = 0.0f;
                float fI3 = u.i((int) (fFloatValue4 * 333.0f), 0, 667);
                r rVar3 = (r) arrayList3.get(0);
                r rVar4 = (r) arrayList3.get(1);
                C2650a c2650a2 = yVar.f680d;
                float interpolation3 = c2650a2.getInterpolation(fI3);
                rVar4.f646a = interpolation3;
                rVar3.f647b = interpolation3;
                r rVar5 = (r) arrayList3.get(1);
                r rVar6 = (r) arrayList3.get(2);
                float interpolation4 = c2650a2.getInterpolation(fI3 + 0.49925038f);
                rVar6.f646a = interpolation4;
                rVar5.f647b = interpolation4;
                ((r) arrayList3.get(2)).f647b = 1.0f;
                if (yVar.f683g && ((r) arrayList3.get(1)).f647b < 1.0f) {
                    ((r) arrayList3.get(2)).f648c = ((r) arrayList3.get(1)).f648c;
                    ((r) arrayList3.get(1)).f648c = ((r) arrayList3.get(0)).f648c;
                    ((r) arrayList3.get(0)).f648c = yVar.f681e.f563e[yVar.f682f];
                    yVar.f683g = false;
                }
                ((v) yVar.f662a).invalidateSelf();
                break;
            case 6:
                A a6 = (A) obj;
                float fFloatValue5 = ((Float) obj2).floatValue();
                a6.i = fFloatValue5;
                int i12 = (int) (fFloatValue5 * 1800.0f);
                Interpolator[] interpolatorArr = a6.f527e;
                ArrayList arrayList4 = (ArrayList) a6.f663b;
                for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                    r rVar7 = (r) arrayList4.get(i13);
                    int[] iArr4 = A.f523l;
                    int i14 = i13 * 2;
                    int i15 = iArr4[i14];
                    int[] iArr5 = A.f522k;
                    rVar7.f646a = d5.y.e(interpolatorArr[i14].getInterpolation(u.i(i12, i15, iArr5[i14])), 0.0f, 1.0f);
                    int i16 = i14 + 1;
                    rVar7.f647b = d5.y.e(interpolatorArr[i16].getInterpolation(u.i(i12, iArr4[i16], iArr5[i16])), 0.0f, 1.0f);
                }
                if (a6.f530h) {
                    int size = arrayList4.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList4.get(i17);
                        i17++;
                        ((r) obj3).f648c = a6.f528f.f563e[a6.f529g];
                    }
                    a6.f530h = false;
                }
                ((v) a6.f662a).invalidateSelf();
                break;
            case 7:
                C0159d c0159d = (C0159d) obj;
                PointF pointF = (PointF) obj2;
                c0159d.getClass();
                c0159d.f2425a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0159d.f2426b = iRound;
                int i18 = c0159d.f2430f + 1;
                c0159d.f2430f = i18;
                if (i18 == c0159d.f2431g) {
                    L0.v.a(c0159d.f2429e, c0159d.f2425a, iRound, c0159d.f2427c, c0159d.f2428d);
                    c0159d.f2430f = 0;
                    c0159d.f2431g = 0;
                    break;
                }
                break;
            case 8:
                C0159d c0159d2 = (C0159d) obj;
                PointF pointF2 = (PointF) obj2;
                c0159d2.getClass();
                c0159d2.f2427c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0159d2.f2428d = iRound2;
                int i19 = c0159d2.f2431g + 1;
                c0159d2.f2431g = i19;
                if (c0159d2.f2430f == i19) {
                    L0.v.a(c0159d2.f2429e, c0159d2.f2425a, c0159d2.f2426b, c0159d2.f2427c, iRound2);
                    c0159d2.f2430f = 0;
                    c0159d2.f2431g = 0;
                    break;
                }
                break;
            case 9:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                L0.v.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 10:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                L0.v.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 11:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                L0.v.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 12:
                L0.v.f2491a.r((View) obj, ((Float) obj2).floatValue());
                break;
            case 13:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
