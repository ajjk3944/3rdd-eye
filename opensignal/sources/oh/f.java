package oh;

import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;
import u.a0;
import x1.f0;
import y1.i1;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19461a;

    public /* synthetic */ f(int i10) {
        this.f19461a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f19461a) {
            case 0:
                return ((g) obj).f19462a - ((g) obj2).f19462a;
            case 1:
                return Float.compare(((g) obj).f19464c, ((g) obj2).f19464c);
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b2 = bArr[i10];
                    byte b10 = bArr2[i10];
                    if (b2 != b10) {
                        return b2 - b10;
                    }
                }
                return 0;
            case 3:
                return ((qb.q) obj).f20809a - ((qb.q) obj2).f20809a;
            case 4:
                return Float.compare(((qb.q) obj).f20811c, ((qb.q) obj2).f20811c);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return ((r5.r) obj).f21259a - ((r5.r) obj2).f21259a;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return Float.compare(((r5.r) obj).f21261c, ((r5.r) obj2).f21261c);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.compare(((v6.d) obj).f23883a.f23886b, ((v6.d) obj2).f23883a.f23886b);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return Long.compare(((v6.c) obj).f23880b, ((v6.c) obj2).f23880b);
            case 9:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                return f0Var.G() == f0Var2.G() ? br.l.g(f0Var.D(), f0Var2.D()) : Float.compare(f0Var.G(), f0Var2.G());
            case 10:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                a0 a0Var = i1.f25711d;
                Object objG = a0Var.g(view);
                br.l.b(objG);
                Rect rect = (Rect) objG;
                Object objG2 = a0Var.g(view2);
                br.l.b(objG2);
                Rect rect2 = (Rect) objG2;
                int i11 = rect.top - rect2.top;
                return i11 == 0 ? rect.bottom - rect2.bottom : i11;
            default:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                a0 a0Var2 = i1.f25711d;
                Object objG3 = a0Var2.g(view3);
                br.l.b(objG3);
                Rect rect3 = (Rect) objG3;
                Object objG4 = a0Var2.g(view4);
                br.l.b(objG4);
                Rect rect4 = (Rect) objG4;
                int i12 = rect3.left - rect4.left;
                return i12 == 0 ? (rect3.right - rect4.right) * i1.f25710c : i1.f25710c * i12;
        }
    }
}
