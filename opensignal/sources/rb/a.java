package rb;

import androidx.media3.common.k0;
import com.google.android.exoplayer2.y0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21432b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21433c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21434d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21435e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21436f;

    public /* synthetic */ a(ArrayList arrayList, int i10, int i11, int i12, float f10, String str) {
        this.f21431a = arrayList;
        this.f21432b = i10;
        this.f21433c = i11;
        this.f21434d = i12;
        this.f21435e = f10;
        this.f21436f = str;
    }

    public static a a(a5.v vVar) throws k0 {
        float f10;
        String str;
        int i10;
        int i11;
        byte[] bArr = a5.a.f84a;
        try {
            vVar.F(4);
            int iT = (vVar.t() & 3) + 1;
            if (iT == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iT2 = vVar.t() & 31;
            for (int i12 = 0; i12 < iT2; i12++) {
                int iY = vVar.y();
                int i13 = vVar.f166b;
                vVar.F(iY);
                byte[] bArr2 = vVar.f165a;
                byte[] bArr3 = new byte[iY + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i13, bArr3, 4, iY);
                arrayList.add(bArr3);
            }
            int iT3 = vVar.t();
            for (int i14 = 0; i14 < iT3; i14++) {
                int iY2 = vVar.y();
                int i15 = vVar.f166b;
                vVar.F(iY2);
                byte[] bArr4 = vVar.f165a;
                byte[] bArr5 = new byte[iY2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i15, bArr5, 4, iY2);
                arrayList.add(bArr5);
            }
            if (iT2 > 0) {
                u5.v vVarQ = u5.b.q((byte[]) arrayList.get(0), iT, ((byte[]) arrayList.get(0)).length);
                int i16 = vVarQ.f23347e;
                int i17 = vVarQ.f23348f;
                f10 = vVarQ.f23349g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(vVarQ.f23343a), Integer.valueOf(vVarQ.f23344b), Integer.valueOf(vVarQ.f23345c));
                i10 = i16;
                i11 = i17;
            } else {
                f10 = 1.0f;
                str = null;
                i10 = -1;
                i11 = -1;
            }
            return new a(arrayList, iT, i10, i11, f10, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw k0.a(e4, "Error parsing AVC config");
        }
    }

    public static a b(fb.f fVar) throws y0 {
        float f10;
        String str;
        int i10;
        int i11;
        byte[] bArr = qb.b.f20758a;
        try {
            fVar.z(4);
            int iO = (fVar.o() & 3) + 1;
            if (iO == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iO2 = fVar.o() & 31;
            for (int i12 = 0; i12 < iO2; i12++) {
                int iT = fVar.t();
                int i13 = fVar.f8801b;
                fVar.z(iT);
                byte[] bArr2 = fVar.f8800a;
                byte[] bArr3 = new byte[iT + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i13, bArr3, 4, iT);
                arrayList.add(bArr3);
            }
            int iO3 = fVar.o();
            for (int i14 = 0; i14 < iO3; i14++) {
                int iT2 = fVar.t();
                int i15 = fVar.f8801b;
                fVar.z(iT2);
                byte[] bArr4 = fVar.f8800a;
                byte[] bArr5 = new byte[iT2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i15, bArr5, 4, iT2);
                arrayList.add(bArr5);
            }
            if (iO2 > 0) {
                qb.o oVarB = qb.b.B((byte[]) arrayList.get(0), iO, ((byte[]) arrayList.get(0)).length);
                int i16 = oVarB.f20797e;
                int i17 = oVarB.f20798f;
                f10 = oVarB.f20799g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(oVarB.f20793a), Integer.valueOf(oVarB.f20794b), Integer.valueOf(oVarB.f20795c));
                i10 = i16;
                i11 = i17;
            } else {
                f10 = 1.0f;
                str = null;
                i10 = -1;
                i11 = -1;
            }
            return new a(arrayList, iO, i10, i11, f10, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw y0.a(e4, "Error parsing AVC config");
        }
    }
}
