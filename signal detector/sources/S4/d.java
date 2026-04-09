package S4;

import android.widget.TextView;
import c.C0372L;
import c5.C0412i;
import com.lefan.signal.ui.noise.NoiseActivity;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements p5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NoiseActivity f3520b;

    public /* synthetic */ d(NoiseActivity noiseActivity, int i) {
        this.f3519a = i;
        this.f3520b = noiseActivity;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        String str;
        int i = this.f3519a;
        C0412i c0412i = C0412i.f5929a;
        NoiseActivity noiseActivity = this.f3520b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                K4.d dVar = noiseActivity.f18967O;
                if (dVar == null) {
                    q5.i.g("binding");
                    throw null;
                }
                TextView textView = dVar.f2219E;
                if (R2.a.f3390d) {
                    Locale locale = F4.e.f1457a;
                    str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{num}, 1));
                } else {
                    str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{num}, 1));
                }
                textView.setText(str);
                return c0412i;
            case 1:
                B4.q qVar = (B4.q) obj;
                int i3 = NoiseActivity.f18966r0;
                q5.i.e(qVar, "dialog");
                qVar.dismiss();
                noiseActivity.f18992o0 = System.currentTimeMillis();
                noiseActivity.f18989l0.a(noiseActivity.f18968P);
                return c0412i;
            default:
                int i6 = NoiseActivity.f18966r0;
                q5.i.e((C0372L) obj, "$this$addCallback");
                if (!noiseActivity.f18991n0) {
                    noiseActivity.finish();
                }
                noiseActivity.F();
                return c0412i;
        }
    }
}
