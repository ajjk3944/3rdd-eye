package nh;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.media3.exoplayer.trackselection.d f17555h = new androidx.media3.exoplayer.trackselection.d(22);

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.media3.exoplayer.trackselection.d f17556i = new androidx.media3.exoplayer.trackselection.d(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f17557a;

    /* renamed from: e, reason: collision with root package name */
    public int f17561e;

    /* renamed from: f, reason: collision with root package name */
    public int f17562f;

    /* renamed from: g, reason: collision with root package name */
    public int f17563g;

    /* renamed from: c, reason: collision with root package name */
    public final e[] f17559c = new e[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17558b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f17560d = -1;

    public f(int i10) {
        this.f17557a = i10;
    }

    public final void a(int i10, float f10) {
        e eVar;
        int i11 = this.f17560d;
        ArrayList arrayList = this.f17558b;
        if (i11 != 1) {
            Collections.sort(arrayList, f17555h);
            this.f17560d = 1;
        }
        int i12 = this.f17563g;
        e[] eVarArr = this.f17559c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f17563g = i13;
            eVar = eVarArr[i13];
        } else {
            eVar = new e();
        }
        int i14 = this.f17561e;
        this.f17561e = i14 + 1;
        eVar.f17552a = i14;
        eVar.f17553b = i10;
        eVar.f17554c = f10;
        arrayList.add(eVar);
        this.f17562f += i10;
        while (true) {
            int i15 = this.f17562f;
            int i16 = this.f17557a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            e eVar2 = (e) arrayList.get(0);
            int i18 = eVar2.f17553b;
            if (i18 <= i17) {
                this.f17562f -= i18;
                arrayList.remove(0);
                int i19 = this.f17563g;
                if (i19 < 5) {
                    this.f17563g = i19 + 1;
                    eVarArr[i19] = eVar2;
                }
            } else {
                eVar2.f17553b = i18 - i17;
                this.f17562f -= i17;
            }
        }
    }

    public final float b() {
        int i10 = this.f17560d;
        ArrayList arrayList = this.f17558b;
        if (i10 != 0) {
            Collections.sort(arrayList, f17556i);
            this.f17560d = 0;
        }
        float f10 = 0.5f * this.f17562f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            e eVar = (e) arrayList.get(i12);
            i11 += eVar.f17553b;
            if (i11 >= f10) {
                return eVar.f17554c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((e) h0.b.f(1, arrayList)).f17554c;
    }
}
