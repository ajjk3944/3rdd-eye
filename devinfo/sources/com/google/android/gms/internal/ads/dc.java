package com.google.android.gms.internal.ads;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public int f10424a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10425b;

    public dc(int i4) {
        switch (i4) {
            case 3:
                this.f10425b = new ArrayList();
                this.f10424a = 128;
                break;
            default:
                this.f10425b = new ArrayList();
                this.f10424a = 0;
                break;
        }
    }

    public synchronized List a() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.f10425b));
    }

    public synchronized boolean b(List list) {
        this.f10425b.clear();
        if (list.size() <= this.f10424a) {
            return this.f10425b.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f10424a, null);
        return this.f10425b.addAll(list.subList(0, this.f10424a));
    }

    public int c(long j) throws bc {
        long j8;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        int i17 = i16 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j9 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        long j17 = (((((~j9) & j10) | j11) + ((j9 & j12) | j13)) - j14) + j15;
        long j18 = j16 % 438792350;
        if (j >= 0) {
            j8 = (this.f10424a + (iM ^ i17)) - j;
        } else {
            j8 = (j17 ^ j18) + (-j);
        }
        if (j8 < 0 || j8 >= this.f10424a) {
            throw new bc();
        }
        return (int) j8;
    }

    public void d(lc lcVar) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        int i17 = this.f10424a;
        if (i17 >= ((i16 % 937558955) ^ iM)) {
            throw new cc();
        }
        ArrayList arrayList = this.f10425b;
        if (i17 == arrayList.size()) {
            arrayList.add(lcVar);
        } else {
            arrayList.set(this.f10424a, lcVar);
        }
        this.f10424a++;
    }

    public lc e() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i4 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iM = d7.m((i10 & (~i4)) | i11, (i4 & i12) | i13, i14, i15);
        int i17 = i16 % 459541652;
        int i18 = this.f10424a;
        if (i18 <= 0) {
            throw new bc();
        }
        int i19 = i17 ^ iM;
        ArrayList arrayList = this.f10425b;
        lc lcVar = (lc) arrayList.get(i18 + i19);
        arrayList.set(this.f10424a + i19, null);
        this.f10424a += i19;
        return lcVar;
    }

    public lc f(long j) {
        return (lc) this.f10425b.get(c(j));
    }
}
