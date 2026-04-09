package g1;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Path f9238a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f9239b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f9240c;

    public i(Path path) {
        this.f9238a = path;
    }

    public static void a(i iVar, f1.d dVar) {
        Path.Direction direction;
        c0 c0Var = c0.CounterClockwise;
        if (iVar.f9239b == null) {
            iVar.f9239b = new RectF();
        }
        RectF rectF = iVar.f9239b;
        br.l.b(rectF);
        float f10 = dVar.f8408a;
        long j = dVar.f8415h;
        long j7 = dVar.f8414g;
        long j10 = dVar.f8413f;
        long j11 = dVar.f8412e;
        rectF.set(f10, dVar.f8409b, dVar.f8410c, dVar.f8411d);
        if (iVar.f9240c == null) {
            iVar.f9240c = new float[8];
        }
        float[] fArr = iVar.f9240c;
        br.l.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j7 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j7 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = iVar.f9238a;
        RectF rectF2 = iVar.f9239b;
        br.l.b(rectF2);
        float[] fArr2 = iVar.f9240c;
        br.l.b(fArr2);
        int i10 = k.f9253a[c0Var.ordinal()];
        if (i10 == 1) {
            direction = Path.Direction.CCW;
        } else {
            if (i10 != 2) {
                throw new bf.n();
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }

    public final void b() {
        this.f9238a.reset();
    }
}
