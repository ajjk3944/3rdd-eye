package qp;

import android.view.View;
import android.widget.TextView;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import on.r;

/* loaded from: classes.dex */
public final class a extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f20949u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f20950v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, View view, MicroColorScheme microColorScheme) {
        super(view);
        l.e(microColorScheme, "colorScheme");
        this.f20950v = bVar;
        View viewFindViewById = view.findViewById(r.item_micro_numerical_horizontal_label);
        l.d(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f20949u = textView;
        textView.setTextColor(microColorScheme.getAnswer());
    }
}
