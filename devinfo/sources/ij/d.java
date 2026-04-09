package ij;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.github.mikephil.charting.charts.PieChart;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends x1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26010f = 0;

    /* renamed from: c, reason: collision with root package name */
    public final PieChart f26011c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f26012d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26013e;

    public d(View view) {
        super(view);
        this.f26013e = false;
        this.f26011c = (PieChart) view.findViewById(R.id.chart);
        this.f26012d = (TextView) view.findViewById(R.id.tv_path);
    }
}
