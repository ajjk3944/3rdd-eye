package np;

import android.view.View;
import android.widget.TextView;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import on.r;

/* loaded from: classes.dex */
public final class j extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f18485u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f18486v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, View view, MicroColorScheme microColorScheme) {
        super(view);
        l.e(microColorScheme, "colorScheme");
        this.f18486v = gVar;
        View viewFindViewById = view.findViewById(r.item_micro_nps_vertical_label);
        l.d(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f18485u = textView;
        textView.setTextColor(microColorScheme.getAnswer());
    }
}
