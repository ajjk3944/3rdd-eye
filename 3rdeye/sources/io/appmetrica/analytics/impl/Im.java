package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes3.dex */
public final class Im extends Om {
    @Override // io.appmetrica.analytics.impl.Om
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        C4575e2 c4575e2 = new C4575e2();
        try {
            bArrA = AbstractC4903qj.a(context.getPackageName());
        } catch (Throwable unused) {
            bArrA = new byte[16];
        }
        try {
            bArrA2 = AbstractC4903qj.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrA2 = new byte[16];
        }
        return new Xf("app_permissions_state", iBinaryDataHelper, new Q8(c4575e2, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), new C4472a2(new H2()));
    }

    @Override // io.appmetrica.analytics.impl.Om
    public final IBinaryDataHelper c(Context context) {
        C4861p3 c4861p3;
        C4916r7 c4916r7A = C4916r7.a(context);
        synchronized (c4916r7A) {
            try {
                if (c4916r7A.i == null) {
                    c4916r7A.i = new C4861p3(c4916r7A.g());
                }
                c4861p3 = c4916r7A.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4861p3;
    }

    @Override // io.appmetrica.analytics.impl.Om
    public final IBinaryDataHelper d(Context context) {
        IBinaryDataHelper iBinaryDataHelperG;
        C4916r7 c4916r7A = C4916r7.a(context);
        synchronized (c4916r7A) {
            iBinaryDataHelperG = c4916r7A.g();
        }
        return iBinaryDataHelperG;
    }
}
