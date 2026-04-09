package r5;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: h, reason: collision with root package name */
    public static final oh.f f21262h = new oh.f(5);

    /* renamed from: i, reason: collision with root package name */
    public static final oh.f f21263i = new oh.f(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f21264a;

    /* renamed from: e, reason: collision with root package name */
    public int f21268e;

    /* renamed from: f, reason: collision with root package name */
    public int f21269f;

    /* renamed from: g, reason: collision with root package name */
    public int f21270g;

    /* renamed from: c, reason: collision with root package name */
    public final r[] f21266c = new r[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21265b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f21267d = -1;

    public s(int i10) {
        this.f21264a = i10;
    }

    public final void a(int i10, float f10) {
        r rVar;
        int i11 = this.f21267d;
        ArrayList arrayList = this.f21265b;
        if (i11 != 1) {
            Collections.sort(arrayList, f21262h);
            this.f21267d = 1;
        }
        int i12 = this.f21270g;
        r[] rVarArr = this.f21266c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f21270g = i13;
            rVar = rVarArr[i13];
        } else {
            rVar = new r();
        }
        int i14 = this.f21268e;
        this.f21268e = i14 + 1;
        rVar.f21259a = i14;
        rVar.f21260b = i10;
        rVar.f21261c = f10;
        arrayList.add(rVar);
        this.f21269f += i10;
        while (true) {
            int i15 = this.f21269f;
            int i16 = this.f21264a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            r rVar2 = (r) arrayList.get(0);
            int i18 = rVar2.f21260b;
            if (i18 <= i17) {
                this.f21269f -= i18;
                arrayList.remove(0);
                int i19 = this.f21270g;
                if (i19 < 5) {
                    this.f21270g = i19 + 1;
                    rVarArr[i19] = rVar2;
                }
            } else {
                rVar2.f21260b = i18 - i17;
                this.f21269f -= i17;
            }
        }
    }

    public final float b() {
        int i10 = this.f21267d;
        ArrayList arrayList = this.f21265b;
        if (i10 != 0) {
            Collections.sort(arrayList, f21263i);
            this.f21267d = 0;
        }
        float f10 = 0.5f * this.f21269f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            r rVar = (r) arrayList.get(i12);
            i11 += rVar.f21260b;
            if (i11 >= f10) {
                return rVar.f21261c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) h0.b.f(1, arrayList)).f21261c;
    }
}
