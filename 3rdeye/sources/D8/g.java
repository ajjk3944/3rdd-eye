package D8;

import J8.C0694i;
import J8.E;
import J8.F;
import android.animation.Animator;
import android.widget.Toast;
import androidx.lifecycle.InterfaceC1790x;
import b9.C1992A;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;
import w1.C5716b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1101c;

    public /* synthetic */ g(Object obj, int i) {
        this.f1100b = i;
        this.f1101c = obj;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        String localizedMessage;
        switch (this.f1100b) {
            case 0:
                E e4 = (E) obj;
                kotlin.jvm.internal.l.c(e4);
                boolean z10 = e4 instanceof E.c;
                PhSecretSettingsActivity phSecretSettingsActivity = (PhSecretSettingsActivity) this.f1101c;
                if (z10) {
                    Toast.makeText(phSecretSettingsActivity, "Result=" + F.b(e4), 0).show();
                } else {
                    Exception excA = F.a(e4);
                    if (excA == null || (localizedMessage = excA.getLocalizedMessage()) == null) {
                        localizedMessage = "Error";
                    }
                    Toast.makeText(phSecretSettingsActivity, "Result=".concat(localizedMessage), 0).show();
                }
                return C1992A.f18074a;
            case 1:
                InterfaceC1790x it = (InterfaceC1790x) obj;
                kotlin.jvm.internal.l.f(it, "it");
                C0694i.c((Animator) this.f1101c);
                return C1992A.f18074a;
            default:
                C5716b config = (C5716b) obj;
                kotlin.jvm.internal.l.f(config, "config");
                return ((w1.k) this.f1101c).f(config);
        }
    }
}
