package J8;

import N7.G8;
import android.animation.Animator;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1790x;
import androidx.work.p;
import b9.C1992A;
import com.zipoapps.premiumhelper.toto.TotoRegisterWorker;
import f8.AbstractActivityC4340c;
import g2.AbstractC4381e;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* renamed from: J8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0691f implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2861c;

    public /* synthetic */ C0691f(Object obj, int i) {
        this.f2860b = i;
        this.f2861c = obj;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        TextView textView;
        Object obj2 = this.f2861c;
        switch (this.f2860b) {
            case 0:
                kotlin.jvm.internal.l.f((InterfaceC1790x) obj, "it");
                C0694i.c((Animator) obj2);
                return C1992A.f18074a;
            case 1:
                AbstractC4381e workManager = (AbstractC4381e) obj;
                kotlin.jvm.internal.l.f(workManager, "workManager");
                workManager.c("CloseSessionWorker", androidx.work.g.REPLACE, Collections.singletonList(((p.a) obj2).a()));
                return C1992A.f18074a;
            case 2:
                return TotoRegisterWorker.Companion.schedule$lambda$0((androidx.work.p) obj2, (AbstractC4381e) obj);
            case 3:
                String str = (String) obj;
                int i = AbstractActivityC4340c.i;
                if (str != null && (textView = (TextView) ((AbstractActivityC4340c) obj2).f37826c.getValue()) != null) {
                    textView.setText(str);
                }
                return C1992A.f18074a;
            default:
                String it = (String) obj;
                kotlin.jvm.internal.l.f(it, "it");
                String str2 = (String) obj2;
                return y9.q.i0(it) ? it.length() < str2.length() ? str2 : it : G8.s(str2, it);
        }
    }
}
