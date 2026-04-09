package dn;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import br.l;
import h7.n1;

/* loaded from: classes.dex */
public final class k extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public final bf.a f7418u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f7419v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f7420w;

    /* renamed from: x, reason: collision with root package name */
    public final Button f7421x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(View view, bf.a aVar) {
        super(view);
        l.e(aVar, "onItemButtonClickedListener");
        this.f7418u = aVar;
        View viewFindViewById = view.findViewById(qk.h.card_title);
        l.d(viewFindViewById, "findViewById(...)");
        this.f7419v = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(qk.h.card_content);
        l.d(viewFindViewById2, "findViewById(...)");
        this.f7420w = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(qk.h.settings_button);
        l.d(viewFindViewById3, "findViewById(...)");
        this.f7421x = (Button) viewFindViewById3;
    }
}
