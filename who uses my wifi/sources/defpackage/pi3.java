package defpackage;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pi3 extends ti3 {
    public final /* synthetic */ int f = 1;
    public final Object g;

    public pi3(fr1 fr1Var, gi3 gi3Var, Map map, gk3 gk3Var) {
        super("xLMBD0ZYDeFbDZVCzCownSP8NNmORP0EKF5jeEnOGlb2W22XICiCfQYSI28gi51p", "CL6HTaJ4+bHVCQXLR1XCftwOp39gWYfgPib+AnvHUWA=", fr1Var, gi3Var, gk3Var.a(118));
        this.g = map;
    }

    @Override // defpackage.ti3
    public final void a(Method method, fr1 fr1Var) {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", ((vf3) this.g).E());
                objArr.getClass();
                synchronized (fr1Var) {
                    String str = (String) objArr[0];
                    fr1Var.b();
                    ((qr1) fr1Var.g).F0(str);
                    String str2 = (String) objArr[1];
                    fr1Var.b();
                    ((qr1) fr1Var.g).l0(str2);
                }
                return;
            default:
                Map map = (Map) this.g;
                Object[] objArr2 = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr2.getClass();
                synchronized (fr1Var) {
                    long jLongValue = ((Long) objArr2[0]).longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).J0(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    if (jLongValue2 >= 0) {
                        fr1Var.b();
                        ((qr1) fr1Var.g).h0(jLongValue2);
                    }
                    long jLongValue3 = ((Long) objArr2[2]).longValue();
                    if (jLongValue3 >= 0) {
                        fr1Var.b();
                        ((qr1) fr1Var.g).i0(jLongValue3);
                    }
                }
                return;
        }
    }

    public pi3(fr1 fr1Var, gi3 gi3Var, vf3 vf3Var, gk3 gk3Var) {
        super("By5K9EmVfikEcCFMOZQd1jxZLLuKkdFWcNBLbmtQ/cGwaIFZzYRhON9QKnCD3h+X", "jO4sZLvDsqH0XT1pMychedS7fP8lDaqZlRwqYI2S90Y=", fr1Var, gi3Var, gk3Var.a(116));
        this.g = vf3Var;
    }
}
