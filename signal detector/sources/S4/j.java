package S4;

import android.location.Location;
import androidx.appcompat.widget.AppCompatTextView;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ui.noise.NoiseActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class j extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public NoiseActivity f3536e;

    /* renamed from: f, reason: collision with root package name */
    public int f3537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ NoiseActivity f3538g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Location f3539h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(NoiseActivity noiseActivity, Location location, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3538g = noiseActivity;
        this.f3539h = location;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((j) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new j(this.f3538g, this.f3539h, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        NoiseActivity noiseActivity;
        int i = this.f3537f;
        NoiseActivity noiseActivity2 = this.f3538g;
        if (i == 0) {
            R2.a.H(obj);
            Location location = this.f3539h;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            this.f3536e = noiseActivity2;
            this.f3537f = 1;
            obj = NoiseActivity.C(noiseActivity2, latitude, longitude, this);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (obj == enumC2380a) {
                return enumC2380a;
            }
            noiseActivity = noiseActivity2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noiseActivity = this.f3536e;
            R2.a.H(obj);
        }
        noiseActivity.f18974V = (String) obj;
        AppCompatTextView appCompatTextView = noiseActivity2.f18986i0;
        if (appCompatTextView == null) {
            q5.i.g("addressTextView");
            throw null;
        }
        String string = noiseActivity2.f18974V;
        if (string == null) {
            string = noiseActivity2.getString(R.string.string_unknown);
            q5.i.d(string, "getString(...)");
        }
        appCompatTextView.setText(string);
        MaterialButton materialButton = noiseActivity2.f18987j0;
        if (materialButton != null) {
            materialButton.setEnabled(true);
            return C0412i.f5929a;
        }
        q5.i.g("addressBtn");
        throw null;
    }
}
