package qp;

import android.view.View;
import android.widget.TextView;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import on.r;

/* loaded from: classes.dex */
public final class c extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f20952u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f20953v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, View view, MicroColorScheme microColorScheme) {
        super(view);
        l.e(microColorScheme, "colorScheme");
        this.f20953v = bVar;
        View viewFindViewById = view.findViewById(r.item_micro_numerical_vertical_label);
        l.d(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f20952u = textView;
        textView.setTextColor(microColorScheme.getAnswer());
    }
}
