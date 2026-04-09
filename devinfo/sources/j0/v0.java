package j0;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import java.util.Map;
import u0.m1;
import u0.o2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v0 implements f1.g, f1.c {

    /* renamed from: a, reason: collision with root package name */
    public final f1.h f26990a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.e f26991b;

    /* renamed from: c, reason: collision with root package name */
    public final x.f0 f26992c;

    public v0(f1.g gVar, Map map, f1.e eVar) {
        b7.u uVar = new b7.u(12, gVar);
        o2 o2Var = f1.i.f23623a;
        this.f26990a = new f1.h(map, uVar);
        this.f26991b = eVar;
        x.f0 f0Var = x.m0.f36916a;
        this.f26992c = new x.f0();
    }

    @Override // f1.g
    public final boolean a(Object obj) {
        return this.f26990a.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // f1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            r14 = this;
            x.f0 r0 = r14.f26992c
            java.lang.Object[] r1 = r0.f36883b
            long[] r0 = r0.f36882a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L51
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L4a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L46
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            f1.e r11 = r14.f26991b
            x.e0 r12 = r11.f23617b
            java.lang.Object r12 = r12.k(r10)
            if (r12 != 0) goto L46
            java.util.Map r11 = r11.f23616a
            r11.remove(r10)
        L46:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L4a:
            if (r7 != r8) goto L51
        L4c:
            if (r4 == r2) goto L51
            int r4 = r4 + 1
            goto Ld
        L51:
            f1.h r0 = r14.f26990a
            java.util.Map r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.v0.b():java.util.Map");
    }

    @Override // f1.g
    public final Object c(String str) {
        return this.f26990a.c(str);
    }

    @Override // f1.g
    public final f1.f d(String str, mk.a aVar) {
        return this.f26990a.d(str, aVar);
    }

    @Override // f1.c
    public final void e(Object obj, c1.h hVar, u0.p pVar, int i4) {
        int i10;
        pVar.X(-858296452);
        if ((i4 & 6) == 0) {
            i10 = (pVar.h(obj) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= pVar.h(hVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= pVar.h(this) ? 256 : 128;
        }
        if (pVar.O(i10 & 1, (i10 & 147) != 146)) {
            this.f26991b.e(obj, hVar, pVar, i10 & WebSocketProtocol.PAYLOAD_SHORT);
            boolean zH = pVar.h(this) | pVar.h(obj);
            Object objL = pVar.L();
            if (zH || objL == u0.l.f34851a) {
                objL = new b7.b(17, this, obj);
                pVar.g0(objL);
            }
            u0.q.c(obj, (mk.c) objL, pVar);
        } else {
            pVar.R();
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new c1.e(this, obj, hVar, i4, 3);
        }
    }
}
