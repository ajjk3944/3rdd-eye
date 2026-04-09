package ip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba.m;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixAnswerItem;
import h7.n1;
import java.util.Map;
import mq.x;
import on.r;
import u3.i0;

/* loaded from: classes.dex */
public final class i extends n1 {
    public final LinearLayout A;
    public Map B;

    /* renamed from: u, reason: collision with root package name */
    public final MicroColorScheme f12916u;

    /* renamed from: v, reason: collision with root package name */
    public MicroSurveyPointMatrixAnswerItem f12917v;

    /* renamed from: w, reason: collision with root package name */
    public final View f12918w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f12919x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f12920y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f12921z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view, MicroColorScheme microColorScheme) {
        super(view);
        l.e(microColorScheme, "colorScheme");
        this.f12916u = microColorScheme;
        View viewFindViewById = view.findViewById(r.item_micro_matrix_answer_header);
        l.d(viewFindViewById, "findViewById(...)");
        this.f12918w = viewFindViewById;
        View viewFindViewById2 = view.findViewById(r.item_micro_matrix_answer_header_title);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f12919x = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(r.item_micro_matrix_answer_header_subtitle);
        l.d(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f12920y = textView;
        View viewFindViewById4 = view.findViewById(r.item_micro_matrix_answer_header_toggle);
        l.d(viewFindViewById4, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f12921z = imageView;
        View viewFindViewById5 = view.findViewById(r.item_micro_matrix_answer_columns_container);
        l.d(viewFindViewById5, "findViewById(...)");
        this.A = (LinearLayout) viewFindViewById5;
        this.B = x.f16946a;
        i0.n(viewFindViewById, new com.google.android.material.datepicker.g(5));
        m.o(viewFindViewById);
        Context context = view.getContext();
        l.d(context, "getContext(...)");
        viewFindViewById.setBackground(vc.e.n(context, microColorScheme, false));
        textView.setTextColor(microColorScheme.getButton());
        imageView.setImageTintList(ColorStateList.valueOf(microColorScheme.getAnswer()));
    }
}
