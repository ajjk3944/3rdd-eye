package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ni3 extends ti3 {
    public final /* synthetic */ int f;
    public final Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni3(fr1 fr1Var, gi3 gi3Var, Context context, gk3 gk3Var, int i) {
        super("BhNDAdNbKVCXLou3UwS6SQycA6O/T9ZMbr2NWffNFtsRs3WScUuYHsaYRJ0jHvCA", "oaC5CLMjwUmi/i48MFPdrATPzdM8HcSPBi81Io4IqyU=", fr1Var, gi3Var, gk3Var.a(115));
        this.f = i;
        switch (i) {
            case 1:
                super("fPyGoeDuTUuDJV03GsNFpCGRO2J3Ui8HA6QvnuqOeQaxvLcgOY5Y2sf90BXpAioC", "znAIQ1vWTnsSA3nf0QmMCBs/bj4g6mmUyXonbfu9VUs=", fr1Var, gi3Var, gk3Var.a(119));
                this.g = context;
                break;
            default:
                this.g = context;
                break;
        }
    }

    @Override // defpackage.ti3
    public final void a(Method method, fr1 fr1Var) {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", this.g);
                objArr.getClass();
                synchronized (fr1Var) {
                    try {
                        long jIntValue = ((Integer) objArr[0]).intValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).Y(jIntValue);
                        int i = 1;
                        long jIntValue2 = ((Integer) objArr[1]).intValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).H0(jIntValue2);
                        long jIntValue3 = ((Integer) objArr[2]).intValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).I0(jIntValue3);
                        long jIntValue4 = ((Integer) objArr[3]).intValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).m0(jIntValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            fr1Var.b();
                            ((qr1) fr1Var.g).q0(3);
                        } else {
                            int i2 = true != bool.booleanValue() ? 1 : 2;
                            fr1Var.b();
                            ((qr1) fr1Var.g).q0(i2);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            fr1Var.g(3);
                        } else {
                            if (true == bool2.booleanValue()) {
                                i = 2;
                            }
                            fr1Var.g(i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", this.g);
                objArr2.getClass();
                synchronized (fr1Var) {
                    long jLongValue = ((Long) objArr2[0]).longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).G0(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).Z(jLongValue2);
                }
                return;
        }
    }
}
