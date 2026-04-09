package wj;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends x1 {
    public static final /* synthetic */ int g = 0;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f36804c;

    /* renamed from: d, reason: collision with root package name */
    public final f1 f36805d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f36806e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f36807f;

    public l(View view) {
        super(view);
        this.f36806e = (TextView) view.findViewById(R.id.tv_title);
        this.f36807f = (TextView) view.findViewById(R.id.tv_summary);
        this.f36805d = new f1(view.findViewById(R.id.line_item1));
        this.f36804c = new f1(view.findViewById(R.id.line_item2));
    }

    public final void a(g gVar) {
        ArrayList arrayList = gVar.f36780c;
        boolean zIsEmpty = arrayList.isEmpty();
        f1 f1Var = this.f36804c;
        f1 f1Var2 = this.f36805d;
        if (zIsEmpty) {
            f1Var2.u(null);
            f1Var.u(null);
        } else if (arrayList.size() == 1) {
            f1Var2.u((n) arrayList.get(0));
            f1Var.u(null);
        } else {
            f1Var2.u((n) arrayList.get(0));
            f1Var.u((n) arrayList.get(1));
        }
    }
}
