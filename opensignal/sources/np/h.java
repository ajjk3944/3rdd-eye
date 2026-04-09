package np;

import android.view.View;
import android.widget.TextView;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import on.r;

/* loaded from: classes.dex */
public final class h extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f18482u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f18483v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, View view, MicroColorScheme microColorScheme) {
        super(view);
        l.e(microColorScheme, "colorScheme");
        this.f18483v = iVar;
        View viewFindViewById = view.findViewById(r.item_micro_nps_portrait_horizontal_label);
        l.d(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f18482u = textView;
        textView.setTextColor(microColorScheme.getAnswer());
    }
}
