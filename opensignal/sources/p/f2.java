package p;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public final class f2 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20058a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(Class cls, String str, int i10) {
        super(cls, str);
        this.f20058a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f20058a) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).V);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return null;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return Float.valueOf(t7.a0.f22457a.s((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f20058a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 1:
                t7.d dVar = (t7.d) obj;
                PointF pointF = (PointF) obj2;
                dVar.getClass();
                dVar.f22461a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                dVar.f22462b = iRound;
                int i10 = dVar.f22466f + 1;
                dVar.f22466f = i10;
                if (i10 == dVar.f22467g) {
                    t7.a0.a(dVar.f22465e, dVar.f22461a, iRound, dVar.f22463c, dVar.f22464d);
                    dVar.f22466f = 0;
                    dVar.f22467g = 0;
                    break;
                }
                break;
            case 2:
                t7.d dVar2 = (t7.d) obj;
                PointF pointF2 = (PointF) obj2;
                dVar2.getClass();
                dVar2.f22463c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                dVar2.f22464d = iRound2;
                int i11 = dVar2.f22467g + 1;
                dVar2.f22467g = i11;
                if (dVar2.f22466f == i11) {
                    t7.a0.a(dVar2.f22465e, dVar2.f22461a, dVar2.f22462b, dVar2.f22463c, iRound2);
                    dVar2.f22466f = 0;
                    dVar2.f22467g = 0;
                    break;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                t7.a0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 4:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                t7.a0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                t7.a0.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                float fFloatValue = ((Float) obj2).floatValue();
                t7.a0.f22457a.B((View) obj, fFloatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
