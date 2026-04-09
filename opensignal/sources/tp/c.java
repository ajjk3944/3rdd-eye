package tp;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import h7.n1;
import on.r;
import vc.e;

/* loaded from: classes.dex */
public final class c extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f22948u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f22949v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f22950w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, View view, MicroColorScheme microColorScheme) {
        super(view);
        l.e(microColorScheme, "colorScheme");
        this.f22950w = bVar;
        View viewFindViewById = view.findViewById(r.item_micro_shape_vertical_image);
        l.d(viewFindViewById, "findViewById(...)");
        this.f22948u = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(r.item_micro_shape_vertical_label);
        l.d(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f22949v = textView;
        Context context = view.getContext();
        l.d(context, "getContext(...)");
        view.setBackground(e.n(context, microColorScheme, false));
        textView.setTextColor(microColorScheme.getAnswer());
    }
}
