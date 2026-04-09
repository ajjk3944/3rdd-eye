package sh;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.x1;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.sensors.SensorDetailActivity;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l0 extends x1 implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f33727c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f33728d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f33729e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f33730f;
    public final TextView g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f33731h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m0 f33732i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, View view) {
        super(view);
        this.f33732i = m0Var;
        TextView textView = (TextView) view.findViewById(R.id.sensor_name);
        this.f33727c = textView;
        this.f33728d = (TextView) view.findViewById(R.id.vendor_name);
        this.f33729e = (TextView) view.findViewById(R.id.sensor_ori_name);
        this.f33730f = (TextView) view.findViewById(R.id.wake_up_type);
        this.g = (TextView) view.findViewById(R.id.sensor_power);
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        this.f33731h = imageView;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iD = com.liuzh.deviceinfo.utilities.f.d();
        imageView.setColorFilter(iD);
        textView.setTextColor(iD);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        m0 m0Var = this.f33732i;
        vg.d dVar = (vg.d) ((List) m0Var.j).get(bindingAdapterPosition);
        Intent intent = new Intent(view.getContext(), (Class<?>) SensorDetailActivity.class);
        intent.putExtra("name", dVar.f36227a);
        intent.putExtra("type", dVar.f36232f);
        intent.putExtra("icon", dVar.g);
        ((n0) m0Var.f33736l).b0(intent);
    }
}
