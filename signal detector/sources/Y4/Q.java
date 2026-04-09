package Y4;

import android.widget.TextView;
import c5.C0412i;
import com.lefan.signal.ui.wifi.WifiFragment;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class Q extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public TextView f4430e;

    /* renamed from: f, reason: collision with root package name */
    public int f4431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WifiFragment f4432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(WifiFragment wifiFragment, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4432g = wifiFragment;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((Q) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new Q(this.f4432g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        TextView textView;
        int i = this.f4431f;
        if (i == 0) {
            R2.a.H(obj);
            WifiFragment wifiFragment = this.f4432g;
            textView = wifiFragment.f19445z0;
            if (textView == null) {
                q5.i.g("deviceRouterName");
                throw null;
            }
            String str = wifiFragment.f19437q0;
            this.f4430e = textView;
            this.f4431f = 1;
            obj = WifiFragment.X(wifiFragment, str, this);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (obj == enumC2380a) {
                return enumC2380a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            textView = this.f4430e;
            R2.a.H(obj);
        }
        textView.setText((CharSequence) obj);
        return C0412i.f5929a;
    }
}
