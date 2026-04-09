package B2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import java.util.ArrayList;
import java.util.List;
import y2.C5800b;

/* compiled from: HistoryFragment.java */
/* loaded from: classes.dex */
public class f extends ComponentCallbacksC1759l {

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f400b;

    /* renamed from: c, reason: collision with root package name */
    public C5800b f401c;

    /* renamed from: d, reason: collision with root package name */
    public List<Model> f402d;

    /* renamed from: e, reason: collision with root package name */
    public Context f403e;

    /* renamed from: f, reason: collision with root package name */
    public ConstraintLayout f404f;

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_history, viewGroup, false);
        this.f402d = new ArrayList();
        Context context = getContext();
        this.f403e = context;
        A2.p pVar = A2.p.INSTANCE;
        pVar.init(context);
        this.f402d = pVar.findAll();
        this.f400b = (RecyclerView) viewInflate.findViewById(R.id.recycler_view);
        this.f404f = (ConstraintLayout) viewInflate.findViewById(R.id.empty_layout);
        if (this.f402d.isEmpty()) {
            this.f404f.setVisibility(0);
        } else {
            this.f404f.setVisibility(8);
        }
        this.f401c = new C5800b(this.f403e, this.f402d);
        this.f400b.setLayoutManager(new LinearLayoutManager(1));
        this.f400b.setAdapter(this.f401c);
        return viewInflate;
    }
}
