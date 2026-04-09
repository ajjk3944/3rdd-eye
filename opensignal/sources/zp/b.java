package zp;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import br.l;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import com.survicate.surveys.presentation.widget.MicroDotsProgressBar;
import h7.n1;
import java.util.Iterator;
import on.r;

/* loaded from: classes.dex */
public final class b extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final MicroDotsProgressBar f27496u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, MicroColorScheme microColorScheme) {
        super(view);
        l.e(microColorScheme, "colorScheme");
        View viewFindViewById = view.findViewById(r.item_micro_dots_progress_bar);
        l.d(viewFindViewById, "findViewById(...)");
        MicroDotsProgressBar microDotsProgressBar = (MicroDotsProgressBar) viewFindViewById;
        this.f27496u = microDotsProgressBar;
        Iterator it = microDotsProgressBar.f6548a.iterator();
        while (it.hasNext()) {
            ((ImageView) it.next()).setColorFilter(microColorScheme.getProgressBar(), PorterDuff.Mode.SRC_IN);
        }
    }
}
