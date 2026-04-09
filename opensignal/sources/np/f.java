package np;

import android.view.View;
import android.widget.TextView;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import on.r;

/* loaded from: classes.dex */
public final class f extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f18479u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f18480v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, View view, MicroColorScheme microColorScheme) {
        super(view);
        l.e(microColorScheme, "colorScheme");
        this.f18480v = gVar;
        View viewFindViewById = view.findViewById(r.item_micro_nps_horizontal_label);
        l.d(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f18479u = textView;
        textView.setTextColor(microColorScheme.getAnswer());
    }
}
