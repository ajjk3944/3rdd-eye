package rk;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import h7.n1;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public final class m extends n1 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    /* renamed from: u, reason: collision with root package name */
    public final al.b f21642u;

    /* renamed from: v, reason: collision with root package name */
    public final SimpleDateFormat f21643v;

    /* renamed from: w, reason: collision with root package name */
    public final com.staircase3.opensignal.utils.o f21644w;

    /* renamed from: x, reason: collision with root package name */
    public final String f21645x;

    /* renamed from: y, reason: collision with root package name */
    public final String f21646y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f21647z;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(al.b bVar, SimpleDateFormat simpleDateFormat, com.staircase3.opensignal.utils.o oVar) {
        br.l.e(simpleDateFormat, "dateFormatter");
        br.l.e(oVar, "networkTypeUtils");
        ConstraintLayout constraintLayout = (ConstraintLayout) bVar.f810b;
        super(constraintLayout);
        this.f21642u = bVar;
        this.f21643v = simpleDateFormat;
        this.f21644w = oVar;
        String string = constraintLayout.getContext().getString(qk.l.indoor);
        br.l.d(string, "getString(...)");
        this.f21645x = string;
        String string2 = constraintLayout.getContext().getString(qk.l.outdoor);
        br.l.d(string2, "getString(...)");
        this.f21646y = string2;
        this.f21647z = (TextView) bVar.f815g;
        this.A = (TextView) bVar.f813e;
        this.B = (TextView) bVar.f812d;
        this.C = (TextView) bVar.f811c;
        this.D = (TextView) bVar.f809a;
        this.E = (TextView) bVar.f817i;
        this.F = (TextView) bVar.f816h;
        this.G = (TextView) bVar.f814f;
    }
}
