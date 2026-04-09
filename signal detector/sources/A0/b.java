package A0;

import android.content.Intent;
import android.content.IntentSender;
import c.C0387l;
import e.C2288e;
import e.InterfaceC2285b;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55d;

    public /* synthetic */ b(int i, int i3, Object obj, Object obj2) {
        this.f52a = i3;
        this.f54c = obj;
        this.f53b = i;
        this.f55d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52a) {
            case 0:
                ((c) this.f54c).f57b.d(this.f53b, this.f55d);
                break;
            case 1:
                C0387l c0387l = (C0387l) this.f54c;
                Serializable serializable = (Serializable) ((d4.h) this.f55d).f19807b;
                String str = (String) c0387l.f5839a.get(Integer.valueOf(this.f53b));
                if (str != null) {
                    C2288e c2288e = (C2288e) c0387l.f5843e.get(str);
                    if ((c2288e != null ? c2288e.f19844a : null) != null) {
                        InterfaceC2285b interfaceC2285b = c2288e.f19844a;
                        if (c0387l.f5842d.remove(str)) {
                            interfaceC2285b.b(serializable);
                            break;
                        }
                    } else {
                        c0387l.f5845g.remove(str);
                        c0387l.f5844f.put(str, serializable);
                        break;
                    }
                }
                break;
            default:
                C0387l c0387l2 = (C0387l) this.f54c;
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f55d;
                q5.i.e(c0387l2, "this$0");
                q5.i.e(sendIntentException, "$e");
                c0387l2.a(this.f53b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
        }
    }
}
