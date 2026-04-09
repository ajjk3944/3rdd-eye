package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class km extends mz0 implements hy {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(hy hyVar, Object obj, oj ojVar) {
        super(2, ojVar);
        this.j = 5;
        this.m = hyVar;
        this.l = obj;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((km) h((oj) obj2, (rw0) obj)).m(z31.a);
            case 1:
                return ((km) h((oj) obj2, obj)).m(z31.a);
            case 2:
                return ((km) h((oj) obj2, (qk) obj)).m(z31.a);
            case 3:
                return ((km) h((oj) obj2, (qk) obj)).m(z31.a);
            case 4:
                return ((km) h((oj) obj2, (qk) obj)).m(z31.a);
            case 5:
                return ((km) h((oj) obj2, (qk) obj)).m(z31.a);
            case 6:
                return ((km) h((oj) obj2, (qk) obj)).m(z31.a);
            default:
                return ((km) h((oj) obj2, (qk) obj)).m(z31.a);
        }
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        switch (this.j) {
            case 0:
                km kmVar = new km((List) this.m, ojVar, 0);
                kmVar.l = obj;
                return kmVar;
            case 1:
                km kmVar2 = new km((ha0) this.m, ojVar, 1);
                kmVar2.l = obj;
                return kmVar2;
            case 2:
                return new km((ya0) this.l, (ha0) this.m, ojVar, 2);
            case 3:
                return new km((wc0) this.l, (Uri) this.m, ojVar, 3);
            case 4:
                return new km((mc2) this.m, ojVar, 4);
            case 5:
                return new km((hy) this.m, this.l, ojVar);
            case 6:
                return new km((l21) this.l, (zy) this.m, ojVar, 6);
            default:
                return new km((mu2) this.l, (String) this.m, ojVar, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0213, code lost:
    
        if (r4.f(r0, r20) != r6) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Type inference failed for: r10v1, types: [bc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [bc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [bc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0213 -> B:112:0x0217). Please report as a decompilation issue!!! */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km(Object obj, oj ojVar, int i) {
        super(2, ojVar);
        this.j = i;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km(Object obj, Object obj2, oj ojVar, int i) {
        super(2, ojVar);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }
}
