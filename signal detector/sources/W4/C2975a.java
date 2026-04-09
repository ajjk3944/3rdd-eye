package w4;

import a2.AbstractC0268d;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.apm.insight.R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Locale;
import q5.i;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2975a extends AbstractC0268d {

    /* renamed from: m, reason: collision with root package name */
    public Locale f23970m;

    @Override // a2.AbstractC0271g
    public final void c(BaseViewHolder baseViewHolder, Object obj) {
        C2976b c2976b = (C2976b) obj;
        i.e(baseViewHolder, "holder");
        i.e(c2976b, "item");
        Locale locale = c2976b.f23971a;
        if (c2976b.f23973c == 1) {
            baseViewHolder.setText(R.id.language_text, c2976b.f23974d);
            return;
        }
        baseViewHolder.setText(R.id.language_name, locale.getDisplayName(locale));
        String displayVariant = locale.getDisplayVariant();
        baseViewHolder.setText(R.id.language_name2, (displayVariant == null || displayVariant.length() == 0) ? locale.getDisplayName(this.f23970m) : locale.getDisplayVariant());
        int i = c2976b.f23972b;
        if (i == 0) {
            ((ProgressBar) baseViewHolder.getView(R.id.language_progress)).setVisibility(8);
            ((ImageView) baseViewHolder.getView(R.id.language_check)).setVisibility(8);
            return;
        }
        if (i == 1) {
            ((ProgressBar) baseViewHolder.getView(R.id.language_progress)).setVisibility(8);
            ((ImageView) baseViewHolder.getView(R.id.language_check)).setVisibility(0);
            ((ImageView) baseViewHolder.getView(R.id.language_check)).setImageResource(R.drawable.ic_language_select);
        } else if (i != 3) {
            ((ProgressBar) baseViewHolder.getView(R.id.language_progress)).setVisibility(0);
            ((ImageView) baseViewHolder.getView(R.id.language_check)).setVisibility(8);
        } else {
            ((ProgressBar) baseViewHolder.getView(R.id.language_progress)).setVisibility(8);
            ((ImageView) baseViewHolder.getView(R.id.language_check)).setVisibility(0);
            ((ImageView) baseViewHolder.getView(R.id.language_check)).setImageResource(R.drawable.ic_failed);
        }
    }
}
