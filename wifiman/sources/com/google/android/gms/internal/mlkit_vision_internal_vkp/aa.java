package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
abstract class aa extends O9 {

    /* renamed from: c, reason: collision with root package name */
    final CharSequence f35666c;

    /* renamed from: d, reason: collision with root package name */
    int f35667d = 0;

    /* renamed from: e, reason: collision with root package name */
    int f35668e = MPv3.MAX_MESSAGE_ID;

    protected aa(ba baVar, CharSequence charSequence) {
        this.f35666c = charSequence;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.O9
    protected final /* bridge */ /* synthetic */ Object a() {
        int iD;
        int i10 = this.f35667d;
        while (true) {
            int i11 = this.f35667d;
            if (i11 == -1) {
                c();
                return null;
            }
            int iE = e(i11);
            if (iE == -1) {
                iE = this.f35666c.length();
                this.f35667d = -1;
                iD = -1;
            } else {
                iD = d(iE);
                this.f35667d = iD;
            }
            if (iD != i10) {
                if (i10 < iE) {
                    this.f35666c.charAt(i10);
                }
                if (i10 < iE) {
                    this.f35666c.charAt(iE - 1);
                }
                int i12 = this.f35668e;
                if (i12 == 1) {
                    iE = this.f35666c.length();
                    this.f35667d = -1;
                    if (iE > i10) {
                        this.f35666c.charAt(iE - 1);
                    }
                } else {
                    this.f35668e = i12 - 1;
                }
                return this.f35666c.subSequence(i10, iE).toString();
            }
            int i13 = iD + 1;
            this.f35667d = i13;
            if (i13 > this.f35666c.length()) {
                this.f35667d = -1;
            }
        }
    }

    abstract int d(int i10);

    abstract int e(int i10);
}
