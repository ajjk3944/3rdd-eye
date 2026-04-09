package O6;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: DivPagerView.kt */
/* loaded from: classes.dex */
public final class u extends androidx.recyclerview.widget.D {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f10463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(RecyclerView recyclerView, t tVar) {
        super(recyclerView);
        this.f10462f = recyclerView;
        this.f10463g = tVar;
    }

    @Override // L0.C0770a
    public final boolean f(ViewGroup host, View child, AccessibilityEvent event) {
        Integer numValueOf;
        int iIntValue;
        kotlin.jvm.internal.l.f(host, "host");
        kotlin.jvm.internal.l.f(child, "child");
        kotlin.jvm.internal.l.f(event, "event");
        if (event.getEventType() == 32768) {
            int i = t.f10453m;
            t tVar = this.f10463g;
            tVar.getClass();
            View view = child;
            while (!kotlin.jvm.internal.l.b(view, tVar)) {
                Object tag = view.getTag(R.id.div_pager_item_clip_id);
                Integer num = tag instanceof Integer ? (Integer) tag : null;
                if (num != null) {
                    numValueOf = Integer.valueOf(num.intValue());
                    break;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
                if (view == null) {
                    break;
                }
            }
            numValueOf = null;
            if (numValueOf != null && tVar.getCurrentItem$div_release() != (iIntValue = numValueOf.intValue())) {
                this.f10462f.performAccessibilityAction(iIntValue > tVar.getCurrentItem$div_release() ? 4096 : 8192, null);
            }
        }
        return this.f3883a.onRequestSendAccessibilityEvent(host, child, event);
    }
}
