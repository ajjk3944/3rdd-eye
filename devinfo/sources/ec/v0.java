package ec;

import j$.util.Objects;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23093a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final URL f23094b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f23095c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23096d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f23097e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23098f;
    public final /* synthetic */ a8.a g;

    public v0(w0 w0Var, String str, URL url, byte[] bArr, Map map, u0 u0Var) {
        Objects.requireNonNull(w0Var);
        this.g = w0Var;
        pb.y.e(str);
        pb.y.h(url);
        this.f23094b = url;
        this.f23095c = bArr;
        this.f23098f = u0Var;
        this.f23096d = str;
        this.f23097e = map;
    }

    public void a(final int i4, final IOException iOException, final byte[] bArr, final Map map) {
        l1 l1Var = ((o1) ((u2) this.g).f218b).g;
        o1.m(l1Var);
        l1Var.K(new Runnable() { // from class: ec.t2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                v0 v0Var = this.f23077a;
                ((s2) v0Var.f23098f).b(v0Var.f23096d, i4, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.v0.run():void");
    }

    public v0(u2 u2Var, String str, URL url, byte[] bArr, HashMap map, s2 s2Var) {
        Objects.requireNonNull(u2Var);
        this.g = u2Var;
        pb.y.e(str);
        this.f23094b = url;
        this.f23095c = bArr;
        this.f23098f = s2Var;
        this.f23096d = str;
        this.f23097e = map;
    }
}
