package zc;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l0 implements Runnable {
    public final /* synthetic */ androidx.lifecycle.o B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26987a = 1;

    /* renamed from: d, reason: collision with root package name */
    public final URL f26988d;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f26989g;

    /* renamed from: r, reason: collision with root package name */
    public final String f26990r;

    /* renamed from: x, reason: collision with root package name */
    public final Map f26991x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f26992y;

    public l0(m0 m0Var, String str, URL url, byte[] bArr, Map map, k0 k0Var) {
        Objects.requireNonNull(m0Var);
        this.B = m0Var;
        cc.s.e(str);
        cc.s.h(url);
        this.f26988d = url;
        this.f26989g = bArr;
        this.f26992y = k0Var;
        this.f26990r = str;
        this.f26991x = map;
    }

    public void a(int i10, IOException iOException, byte[] bArr, Map map) {
        a1 a1Var = ((c1) ((h2) this.B).f1504d).B;
        c1.g(a1Var);
        a1Var.B1(new g2(this, i10, iOException, bArr, map));
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
        throw new UnsupportedOperationException("Method not decompiled: zc.l0.run():void");
    }

    public l0(h2 h2Var, String str, URL url, byte[] bArr, HashMap map, f2 f2Var) {
        Objects.requireNonNull(h2Var);
        this.B = h2Var;
        cc.s.e(str);
        this.f26988d = url;
        this.f26989g = bArr;
        this.f26992y = f2Var;
        this.f26990r = str;
        this.f26991x = map;
    }
}
