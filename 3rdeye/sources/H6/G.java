package H6;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import p7.InterfaceC5474f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class G implements InterfaceC5474f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2044b;

    public /* synthetic */ G(Object obj, int i) {
        this.f2043a = i;
        this.f2044b = obj;
    }

    @Override // p7.InterfaceC5474f
    public final View a() {
        switch (this.f2043a) {
            case 0:
                H this$0 = (H) this.f2044b;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                return new O6.E(this$0.f2045a);
            case 1:
                H this$02 = (H) this.f2044b;
                kotlin.jvm.internal.l.f(this$02, "this$0");
                return new O6.A(this$02.f2045a);
            case 2:
                H this$03 = (H) this.f2044b;
                kotlin.jvm.internal.l.f(this$03, "this$0");
                return new O6.w(this$03.f2045a);
            default:
                N6.d this$04 = (N6.d) this.f2044b;
                kotlin.jvm.internal.l.f(this$04, "this$0");
                Context context = this$04.f4708m;
                kotlin.jvm.internal.l.f(context, "context");
                y7.p pVar = new y7.p(context, null);
                pVar.setId(R.id.div_tabbed_tab_title_item);
                pVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                pVar.setOrientation(1);
                pVar.setGravity(0);
                return pVar;
        }
    }
}
