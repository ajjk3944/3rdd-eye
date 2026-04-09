package bf;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import h7.r1;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements eg.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2712a;

    public /* synthetic */ g(int i10) {
        this.f2712a = i10;
    }

    @Override // eg.b
    public final Object get() {
        switch (this.f2712a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                q qVar = ExecutorsRegistrar.f5810a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i10 = Build.VERSION.SDK_INT;
                builderDetectNetwork.detectResourceMismatches();
                if (i10 >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                break;
            case 3:
                q qVar2 = ExecutorsRegistrar.f5810a;
                break;
            case 4:
                q qVar3 = ExecutorsRegistrar.f5810a;
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                q qVar4 = ExecutorsRegistrar.f5810a;
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                r1 r1Var = FirebaseMessaging.k;
                break;
            default:
                Random random = og.j.j;
                break;
        }
        return null;
    }
}
