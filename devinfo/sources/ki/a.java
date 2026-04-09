package ki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends ni.a {

    /* renamed from: d, reason: collision with root package name */
    public final TextView f28296d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f28297e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f28298f;
    public final View g;

    /* renamed from: h, reason: collision with root package name */
    public String f28299h;

    public a(Context context) {
        super(context);
        setClickable(true);
        LayoutInflater.from(context).inflate(R.layout.item_camera_button, (ViewGroup) this, true);
        ((ViewGroup) getChildAt(0)).setBackgroundTintList(dj.b.c(zh.i.b(getContext())));
        this.f28296d = (TextView) findViewById(R.id.mp);
        this.f28297e = (TextView) findViewById(R.id.resolution);
        this.f28298f = (TextView) findViewById(R.id.focus_length);
        View viewFindViewById = findViewById(R.id.checked);
        this.g = viewFindViewById;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        viewFindViewById.setBackgroundColor(com.liuzh.deviceinfo.utilities.f.a());
    }

    public String getCameraId() {
        return this.f28299h;
    }

    public void setCameraId(String str) {
        this.f28299h = str;
    }

    @Override // ni.a, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        View view = this.g;
        if (z3) {
            view.animate().alpha(1.0f).start();
        } else {
            view.animate().alpha(0.0f).start();
        }
    }

    public void setFlength(String str) {
        this.f28298f.setText(str);
    }

    public void setMp(String str) {
        this.f28296d.setText(str);
    }

    public void setResolution(String str) {
        this.f28297e.setText(str);
    }
}
