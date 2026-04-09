package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes3.dex */
public final class Km extends Om {
    @Override // io.appmetrica.analytics.impl.Om
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        A2 a22 = new A2();
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
        return new Xf("auto_inapp_collecting_info_data", iBinaryDataHelper, new Q8(a22, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), new C5063x2(new C4628g3()));
    }

    @Override // io.appmetrica.analytics.impl.Om
    public final IBinaryDataHelper c(Context context) {
        C4861p3 c4861p3;
        C4916r7 c4916r7A = C4916r7.a(context);
        synchronized (c4916r7A) {
            try {
                if (c4916r7A.f41545k == null) {
                    c4916r7A.f41545k = new C4861p3(c4916r7A.e());
                }
                c4861p3 = c4916r7A.f41545k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4861p3;
    }

    @Override // io.appmetrica.analytics.impl.Om
    public final IBinaryDataHelper d(Context context) {
        IBinaryDataHelper iBinaryDataHelperE;
        C4916r7 c4916r7A = C4916r7.a(context);
        synchronized (c4916r7A) {
            iBinaryDataHelperE = c4916r7A.e();
        }
        return iBinaryDataHelperE;
    }
}
