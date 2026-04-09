package oh;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final f f19465h = new f(0);

    /* renamed from: i, reason: collision with root package name */
    public static final f f19466i = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f19467a;

    /* renamed from: e, reason: collision with root package name */
    public int f19471e;

    /* renamed from: f, reason: collision with root package name */
    public int f19472f;

    /* renamed from: g, reason: collision with root package name */
    public int f19473g;

    /* renamed from: c, reason: collision with root package name */
    public final g[] f19469c = new g[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19468b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f19470d = -1;

    public h(int i10) {
        this.f19467a = i10;
    }

    public final void a(int i10, float f10) {
        g gVar;
        int i11 = this.f19470d;
        ArrayList arrayList = this.f19468b;
        if (i11 != 1) {
            Collections.sort(arrayList, f19465h);
            this.f19470d = 1;
        }
        int i12 = this.f19473g;
        g[] gVarArr = this.f19469c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f19473g = i13;
            gVar = gVarArr[i13];
        } else {
            gVar = new g();
        }
        int i14 = this.f19471e;
        this.f19471e = i14 + 1;
        gVar.f19462a = i14;
        gVar.f19463b = i10;
        gVar.f19464c = f10;
        arrayList.add(gVar);
        this.f19472f += i10;
        while (true) {
            int i15 = this.f19472f;
            int i16 = this.f19467a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            g gVar2 = (g) arrayList.get(0);
            int i18 = gVar2.f19463b;
            if (i18 <= i17) {
                this.f19472f -= i18;
                arrayList.remove(0);
                int i19 = this.f19473g;
                if (i19 < 5) {
                    this.f19473g = i19 + 1;
                    gVarArr[i19] = gVar2;
                }
            } else {
                gVar2.f19463b = i18 - i17;
                this.f19472f -= i17;
            }
        }
    }

    public final float b() {
        int i10 = this.f19470d;
        ArrayList arrayList = this.f19468b;
        if (i10 != 0) {
            Collections.sort(arrayList, f19466i);
            this.f19470d = 0;
        }
        float f10 = 0.5f * this.f19472f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            g gVar = (g) arrayList.get(i12);
            i11 += gVar.f19463b;
            if (i11 >= f10) {
                return gVar.f19464c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((g) h0.b.f(1, arrayList)).f19464c;
    }
}
