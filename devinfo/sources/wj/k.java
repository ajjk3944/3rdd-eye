package wj;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.mikephil.charting.charts.PieChart;
import com.liuzh.deviceinfo.R;
import java.text.DecimalFormat;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    public final PieChart f36799a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f36800b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f36801c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f36802d;

    /* renamed from: e, reason: collision with root package name */
    public final DecimalFormat f36803e;

    public k(Context context) throws NoSuchFieldException, SecurityException {
        super(context);
        this.f36803e = new DecimalFormat("###,###,##0.0");
        View.inflate(getContext(), R.layout.appa_app_analyze_result_detail, this);
        this.f36802d = (LinearLayout) findViewById(R.id.content_container);
        this.f36799a = (PieChart) findViewById(R.id.pie_chart);
        this.f36800b = (TextView) findViewById(R.id.tv_title);
        this.f36801c = (TextView) findViewById(R.id.tv_summary);
        setBackgroundColor(cm.g.l(android.R.attr.windowBackground, getContext()));
        setClipChildren(false);
        setClipToPadding(false);
        o7.d dVar = ii.a.f26002b;
        nk.k.b(dVar);
        dj.b.n(this, (z2.k) dVar.f30421b);
        if (i0.k()) {
            findViewById(R.id.details_header).setFocusable(true);
            findViewById(R.id.pie_chart_container).setFocusable(true);
        }
    }
}
