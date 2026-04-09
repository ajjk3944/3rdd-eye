package i7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends e {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f25899i;
    public final PointF j;

    /* renamed from: k, reason: collision with root package name */
    public final i f25900k;

    /* renamed from: l, reason: collision with root package name */
    public final i f25901l;

    /* renamed from: m, reason: collision with root package name */
    public km.o f25902m;

    /* renamed from: n, reason: collision with root package name */
    public km.o f25903n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.f25899i = new PointF();
        this.j = new PointF();
        this.f25900k = iVar;
        this.f25901l = iVar2;
        i(this.f25875d);
    }

    @Override // i7.e
    public final Object e() {
        return l();
    }

    @Override // i7.e
    public final /* bridge */ /* synthetic */ Object f(s7.a aVar, float f10) {
        return l();
    }

    @Override // i7.e
    public final void i(float f10) {
        i iVar = this.f25900k;
        iVar.i(f10);
        i iVar2 = this.f25901l;
        iVar2.i(f10);
        this.f25899i.set(((Float) iVar.e()).floatValue(), ((Float) iVar2.e()).floatValue());
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f25872a;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i4)).a();
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF l() {
        /*
            r12 = this;
            km.o r0 = r12.f25902m
            r1 = 0
            if (r0 == 0) goto L39
            i7.i r0 = r12.f25900k
            i7.c r2 = r0.f25874c
            s7.a r2 = r2.k()
            if (r2 == 0) goto L39
            java.lang.Float r3 = r2.f33489h
            km.o r4 = r12.f25902m
            float r5 = r2.g
            if (r3 != 0) goto L19
            r6 = r5
            goto L1e
        L19:
            float r3 = r3.floatValue()
            r6 = r3
        L1e:
            java.lang.Object r3 = r2.f33484b
            r7 = r3
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r2 = r2.f33485c
            r8 = r2
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r0.c()
            float r10 = r0.d()
            float r11 = r0.f25875d
            java.lang.Object r0 = r4.l(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L3a
        L39:
            r0 = r1
        L3a:
            km.o r2 = r12.f25903n
            if (r2 == 0) goto L71
            i7.i r2 = r12.f25901l
            i7.c r3 = r2.f25874c
            s7.a r3 = r3.k()
            if (r3 == 0) goto L71
            java.lang.Float r1 = r3.f33489h
            km.o r4 = r12.f25903n
            float r5 = r3.g
            if (r1 != 0) goto L52
            r6 = r5
            goto L57
        L52:
            float r1 = r1.floatValue()
            r6 = r1
        L57:
            java.lang.Object r1 = r3.f33484b
            r7 = r1
            java.lang.Float r7 = (java.lang.Float) r7
            java.lang.Object r1 = r3.f33485c
            r8 = r1
            java.lang.Float r8 = (java.lang.Float) r8
            float r9 = r2.c()
            float r10 = r2.d()
            float r11 = r2.f25875d
            java.lang.Object r1 = r4.l(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Float r1 = (java.lang.Float) r1
        L71:
            r2 = 0
            android.graphics.PointF r3 = r12.f25899i
            android.graphics.PointF r4 = r12.j
            if (r0 != 0) goto L7e
            float r0 = r3.x
            r4.set(r0, r2)
            goto L85
        L7e:
            float r0 = r0.floatValue()
            r4.set(r0, r2)
        L85:
            if (r1 != 0) goto L8f
            float r0 = r4.x
            float r1 = r3.y
            r4.set(r0, r1)
            return r4
        L8f:
            float r0 = r4.x
            float r1 = r1.floatValue()
            r4.set(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.o.l():android.graphics.PointF");
    }
}
