package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum j {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* renamed from: c, reason: collision with root package name */
    public static final a0 f20153c;

    /* renamed from: a, reason: collision with root package name */
    public final int f20155a;

    static {
        char c9 = 0;
        com.google.android.gms.common.api.internal.a0 a0Var = new com.google.android.gms.common.api.internal.a0(c9, 2);
        a0Var.f9070c = new Object[8];
        a0Var.f9069b = 0;
        j[] jVarArrValues = values();
        int length = jVarArrValues.length;
        for (int i4 = c9; i4 < length; i4++) {
            j jVar = jVarArrValues[i4];
            Integer numValueOf = Integer.valueOf(jVar.f20155a);
            int i10 = a0Var.f9069b + 1;
            Object[] objArr = (Object[]) a0Var.f9070c;
            int length2 = objArr.length;
            int i11 = i10 + i10;
            if (i11 > length2) {
                if (i11 > length2) {
                    length2 = length2 + (length2 >> 1) + 1;
                    if (length2 < i11) {
                        int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                        length2 = iHighestOneBit + iHighestOneBit;
                    }
                    if (length2 < 0) {
                        length2 = Integer.MAX_VALUE;
                    }
                }
                a0Var.f9070c = Arrays.copyOf(objArr, length2);
            }
            Object[] objArr2 = (Object[]) a0Var.f9070c;
            int i12 = a0Var.f9069b;
            int i13 = i12 + i12;
            objArr2[i13] = numValueOf;
            objArr2[i13 + 1] = jVar;
            a0Var.f9069b = i12 + 1;
        }
        r rVar = (r) a0Var.f9071d;
        if (rVar != null) {
            throw rVar.a();
        }
        a0 a0VarA = a0.a(a0Var.f9069b, (Object[]) a0Var.f9070c, a0Var);
        r rVar2 = (r) a0Var.f9071d;
        if (rVar2 != null) {
            throw rVar2.a();
        }
        f20153c = a0VarA;
    }

    j(int i4) {
        this.f20155a = i4;
    }
}
