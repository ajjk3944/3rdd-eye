package sh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.impl.sa;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f33794a;

    /* renamed from: b, reason: collision with root package name */
    public final View f33795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f33796c;

    public z(a0 a0Var, int i4, View view) {
        String string;
        String string2;
        Drawable drawable;
        String string3;
        String str;
        Drawable drawable2;
        this.f33796c = a0Var;
        this.f33795b = view;
        TextView textView = (TextView) view.findViewById(R.id.tv_flag_name);
        this.f33794a = (TextView) view.findViewById(R.id.tv_count);
        ImageView imageView = (ImageView) view.findViewById(R.id.ic_flag);
        switch (i4) {
            case 0:
                string = DeviceInfoApp.f21145f.getString(R.string.satellite_gps);
                string2 = DeviceInfoApp.f21145f.getString(R.string.satellite_navstar_desc);
                drawable = DeviceInfoApp.f21145f.getDrawable(R.drawable.ic_flag_usa);
                string3 = string;
                str = string2;
                drawable2 = drawable;
                break;
            case 1:
                string = DeviceInfoApp.f21145f.getString(R.string.satellite_glonass);
                string2 = DeviceInfoApp.f21145f.getString(R.string.satellite_glonass_desc);
                drawable = DeviceInfoApp.f21145f.getDrawable(R.drawable.ic_flag_russia);
                string3 = string;
                str = string2;
                drawable2 = drawable;
                break;
            case 2:
                string = DeviceInfoApp.f21145f.getString(R.string.satellite_beidou);
                string2 = DeviceInfoApp.f21145f.getString(R.string.satellite_beidou_desc);
                drawable = DeviceInfoApp.f21145f.getDrawable(R.drawable.ic_flag_china);
                string3 = string;
                str = string2;
                drawable2 = drawable;
                break;
            case 3:
                string = DeviceInfoApp.f21145f.getString(R.string.satellite_qzss);
                string2 = DeviceInfoApp.f21145f.getString(R.string.satellite_qzss_desc);
                drawable = DeviceInfoApp.f21145f.getDrawable(R.drawable.ic_flag_japan);
                string3 = string;
                str = string2;
                drawable2 = drawable;
                break;
            case 4:
                string = DeviceInfoApp.f21145f.getString(R.string.satellite_galileo);
                string2 = DeviceInfoApp.f21145f.getString(R.string.satellite_falileo_desc);
                drawable = DeviceInfoApp.f21145f.getDrawable(R.drawable.ic_flag_european_union);
                string3 = string;
                str = string2;
                drawable2 = drawable;
                break;
            case 5:
                string = DeviceInfoApp.f21145f.getString(R.string.satellite_irnss);
                string2 = DeviceInfoApp.f21145f.getString(R.string.satellite_irnss_desc);
                drawable = DeviceInfoApp.f21145f.getDrawable(R.drawable.ic_flag_india);
                string3 = string;
                str = string2;
                drawable2 = drawable;
                break;
            case 6:
                string = DeviceInfoApp.f21145f.getString(R.string.satellite_sbas_short);
                string2 = DeviceInfoApp.f21145f.getString(R.string.satellite_sbas_desc);
                drawable = DeviceInfoApp.f21145f.getDrawable(R.drawable.ic_flag_sbas);
                string3 = string;
                str = string2;
                drawable2 = drawable;
                break;
            default:
                string3 = DeviceInfoApp.f21145f.getString(R.string.unknown);
                str = null;
                drawable2 = null;
                break;
        }
        textView.setText(string3);
        imageView.setImageDrawable(drawable2);
        if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(str)) {
            return;
        }
        view.setOnClickListener(new sa(this, string3, str, drawable2, 2));
    }
}
