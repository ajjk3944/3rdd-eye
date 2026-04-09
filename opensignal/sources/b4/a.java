package b4;

import android.os.Bundle;
import o2.g;
import y1.x;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2379g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u3.b f2380r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(u3.b bVar, int i10) {
        super(21);
        this.f2379g = i10;
        this.f2380r = bVar;
    }

    @Override // o2.g
    public void U(int i10, v3.c cVar, String str, Bundle bundle) {
        switch (this.f2379g) {
            case 1:
                ((x) this.f2380r).j(i10, cVar, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r13 == false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08bd A[LOOP:9: B:396:0x08a0->B:407:0x08bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x08c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0218  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r2v92, types: [mq.w] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v94, types: [java.util.ArrayList] */
    @Override // o2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v3.c V(int r48) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 3264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.a.V(int):v3.c");
    }

    @Override // o2.g
    public final v3.c a0(int i10) {
        switch (this.f2379g) {
            case 0:
                b bVar = (b) this.f2380r;
                int i11 = i10 == 2 ? bVar.k : bVar.f2390l;
                if (i11 == Integer.MIN_VALUE) {
                    return null;
                }
                return V(i11);
            default:
                x xVar = (x) this.f2380r;
                if (i10 != 1) {
                    if (i10 == 2) {
                        return V(xVar.f25800n);
                    }
                    throw new IllegalArgumentException(h0.b.h(i10, "Unknown focus type: "));
                }
                int i12 = xVar.f25801o;
                if (i12 == Integer.MIN_VALUE) {
                    return null;
                }
                return V(i12);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x05e0, code lost:
    
        if (r1 != 16) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x01b0, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x069b  */
    @Override // o2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e0(int r26, int r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 2118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.a.e0(int, int, android.os.Bundle):boolean");
    }
}
