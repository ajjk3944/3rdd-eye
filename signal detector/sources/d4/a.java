package D4;

import N4.p;
import Q4.m;
import U4.t;
import U4.y;
import a2.AbstractC0271g;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.bumptech.glide.l;
import com.bumptech.glide.n;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.lefan.signal.db.CellInfoBean;
import com.lefan.signal.db.SquatterBean;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import java.util.Arrays;
import java.util.Locale;
import q5.i;

/* loaded from: classes.dex */
public final class a extends AbstractC0271g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1282l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, byte b5) {
        super(R.layout.item_bluetooth_pair);
        this.f1282l = i;
    }

    @Override // a2.AbstractC0271g
    public final void c(BaseViewHolder baseViewHolder, Object obj) {
        String string;
        String str;
        String str2;
        int i;
        int i3 = 0;
        switch (this.f1282l) {
            case 0:
                i.e(baseViewHolder, "holder");
                baseViewHolder.setImageBitmap(R.id.iv_pdf_page, (Bitmap) obj);
                break;
            case 1:
                J4.b bVar = (J4.b) obj;
                i.e(baseViewHolder, "holder");
                i.e(bVar, "item");
                baseViewHolder.setText(R.id.wifi_info_name, bVar.f2140a);
                baseViewHolder.setText(R.id.wifi_info_info, bVar.f2141b);
                break;
            case 2:
                N4.e eVar = (N4.e) obj;
                i.e(baseViewHolder, "holder");
                i.e(eVar, "item");
                baseViewHolder.setImageResource(R.id.device_image, eVar.f2994a);
                baseViewHolder.setText(R.id.device_name, eVar.f2995b);
                baseViewHolder.setVisible(R.id.device_select, eVar.f2996c);
                break;
            case 3:
                p pVar = (p) obj;
                i.e(baseViewHolder, "holder");
                i.e(pVar, "item");
                baseViewHolder.setText(R.id.wifi_info_name, pVar.f3028a);
                baseViewHolder.setText(R.id.wifi_info_info, pVar.f3029b);
                break;
            case 4:
                WebSpeedBean webSpeedBean = (WebSpeedBean) obj;
                i.e(baseViewHolder, "holder");
                i.e(webSpeedBean, "item");
                Context contextF = f();
                n nVarB = com.bumptech.glide.b.a(contextF).f6488e.b(contextF);
                String logo = webSpeedBean.getLogo();
                nVarB.getClass();
                ((l) new l(nVarB.f6568a, nVarB, Drawable.class, nVarB.f6569b).x(logo).e()).w((ImageView) baseViewHolder.getView(R.id.web_logo));
                ProgressBar progressBar = (ProgressBar) baseViewHolder.getView(R.id.web_load);
                baseViewHolder.setText(R.id.web_name, webSpeedBean.getName());
                baseViewHolder.setText(R.id.web_url, webSpeedBean.getUrl());
                TextView textView = (TextView) baseViewHolder.getView(R.id.web_speed);
                if (webSpeedBean.getSpeed() < 0.0d) {
                    string = f().getString(R.string.test_web_error);
                } else {
                    Double dValueOf = Double.valueOf(webSpeedBean.getSpeed());
                    if (R2.a.f3390d) {
                        Locale locale = F4.e.f1457a;
                        string = String.format(F4.e.b(), "%.2fms", Arrays.copyOf(new Object[]{dValueOf}, 1));
                    } else {
                        string = String.format(Locale.ENGLISH, "%.2fms", Arrays.copyOf(new Object[]{dValueOf}, 1));
                    }
                }
                textView.setText(string);
                double speed = webSpeedBean.getSpeed();
                int color = -65536;
                if (speed >= 0.0d) {
                    if (speed < 2.0d) {
                        color = -16711936;
                    } else if (speed < 3.0d) {
                        color = Color.parseColor("#66bb6a");
                    } else if (speed < 4.0d) {
                        color = -256;
                    } else if (speed < 6.0d) {
                        color = Color.parseColor("#FF6600");
                    }
                }
                textView.setTextColor(color);
                if (!webSpeedBean.isLoading()) {
                    progressBar.setVisibility(8);
                    if (!webSpeedBean.isLoad()) {
                        textView.setVisibility(8);
                        break;
                    } else {
                        textView.setVisibility(0);
                        break;
                    }
                } else {
                    progressBar.setVisibility(0);
                    textView.setVisibility(8);
                    break;
                }
            case 5:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                i.e(baseViewHolder, "holder");
                i.e(bluetoothDevice, "item");
                baseViewHolder.setImageResource(R.id.acronym, com.bumptech.glide.d.t(bluetoothDevice));
                baseViewHolder.setText(R.id.pair_name, bluetoothDevice.getName());
                baseViewHolder.setText(R.id.pair_mac, bluetoothDevice.getAddress());
                break;
            case 6:
                m mVar = (m) obj;
                i.e(baseViewHolder, "holder");
                i.e(mVar, "item");
                baseViewHolder.setImageResource(R.id.acronym, com.bumptech.glide.d.t(mVar.f3214a));
                String string2 = mVar.f3215b;
                if (string2 == null && (string2 = mVar.f3218e) == null) {
                    string2 = f().getString(R.string.device_unknown);
                    i.d(string2, "getString(...)");
                }
                baseViewHolder.setText(R.id.pair_name, string2);
                baseViewHolder.setText(R.id.pair_mac, mVar.f3217d);
                Integer numValueOf = Integer.valueOf(mVar.f3216c);
                if (R2.a.f3390d) {
                    Locale locale2 = F4.e.f1457a;
                    str = String.format(F4.e.b(), "%d dBm", Arrays.copyOf(new Object[]{numValueOf}, 1));
                } else {
                    str = String.format(Locale.ENGLISH, "%d dBm", Arrays.copyOf(new Object[]{numValueOf}, 1));
                }
                baseViewHolder.setText(R.id.pair_rssi, str);
                break;
            case 7:
                T4.d dVar = (T4.d) obj;
                i.e(baseViewHolder, "holder");
                i.e(dVar, "item");
                baseViewHolder.setText(R.id.copy_hor_liner_name, dVar.f3595b);
                baseViewHolder.setText(R.id.copy_hor_liner_info, dVar.f3596c);
                break;
            case 8:
                T4.d dVar2 = (T4.d) obj;
                i.e(baseViewHolder, "holder");
                i.e(dVar2, "item");
                baseViewHolder.setText(R.id.copy_hor_liner_name, dVar2.f3595b);
                baseViewHolder.setText(R.id.copy_hor_liner_info, dVar2.f3596c);
                break;
            case 9:
                U4.b bVar2 = (U4.b) obj;
                i.e(baseViewHolder, "holder");
                i.e(bVar2, "item");
                baseViewHolder.setText(R.id.info_title, bVar2.f3707a);
                baseViewHolder.setText(R.id.info_value, bVar2.f3709c);
                break;
            case 10:
                CellInfoBean cellInfoBean = (CellInfoBean) obj;
                i.e(baseViewHolder, "holder");
                i.e(cellInfoBean, "item");
                String cell_id = cellInfoBean.getCell_id();
                if (cell_id == null) {
                    cell_id = f().getString(R.string.unknow_cell);
                    i.d(cell_id, "getString(...)");
                }
                baseViewHolder.setText(R.id.cell_id, cell_id);
                RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.cell_info_recycler);
                recyclerView.g(new G4.a(f()));
                a aVar = new a(R.layout.item_cell_info_info, 9);
                aVar.f4672f = new U4.a(cellInfoBean, i3, this);
                recyclerView.setAdapter(aVar);
                aVar.o(cellInfoBean.getCellInfoItems());
                break;
            case 11:
                t tVar = (t) obj;
                i.e(baseViewHolder, "holder");
                i.e(tVar, "item");
                baseViewHolder.setText(R.id.wifi_info_name, tVar.f3765a);
                baseViewHolder.setText(R.id.wifi_info_info, tVar.f3766b);
                break;
            case 12:
                y yVar = (y) obj;
                i.e(baseViewHolder, "holder");
                i.e(yVar, "item");
                baseViewHolder.setText(R.id.wifi_info_name, yVar.f3776a);
                baseViewHolder.setText(R.id.wifi_info_info, yVar.f3777b);
                break;
            case 13:
                V4.l lVar = (V4.l) obj;
                i.e(baseViewHolder, "holder");
                i.e(lVar, "item");
                ImageView imageView = (ImageView) baseViewHolder.getView(R.id.satellite_country);
                switch (lVar.f3909e) {
                    case 0:
                        imageView.setImageResource(R.drawable.flag_unknown);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.flag_us);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.flag_unknown);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.flag_russia);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.flag_japan);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.flag_china);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.flag_eu);
                        break;
                    case 7:
                        imageView.setImageResource(R.drawable.flag_india);
                        break;
                    default:
                        imageView.setImageResource(R.drawable.flag_unknown);
                        break;
                }
                baseViewHolder.setText(R.id.satellite_svid, R2.a.k(lVar.f3910f, "%d"));
                baseViewHolder.setText(R.id.satellite_azimuth, R2.a.k(Float.valueOf(lVar.f3906b), "%.2f"));
                baseViewHolder.setText(R.id.satellite_elevation, R2.a.k(Float.valueOf(lVar.f3907c), "%.2f"));
                Float f2 = lVar.i;
                baseViewHolder.setText(R.id.satellite_carrierFrequencyHz, f2 == null ? "--" : R2.a.k(f2, "%.0f"));
                baseViewHolder.setImageResource(R.id.satellite_usedInFix, lVar.f3905a ? R.drawable.ic_satellite_used : R.drawable.ic_satellite_un);
                ((LinearProgressIndicator) baseViewHolder.getView(R.id.satellite_cn0DbHz)).setProgress((int) lVar.f3908d);
                break;
            case 14:
                V4.m mVar2 = (V4.m) obj;
                i.e(baseViewHolder, "holder");
                i.e(mVar2, "item");
                baseViewHolder.setImageResource(R.id.satellite_country_flag, mVar2.f3913a);
                baseViewHolder.setText(R.id.satellite_country_name, mVar2.f3914b);
                Integer numValueOf2 = Integer.valueOf(mVar2.f3915c);
                if (R2.a.f3390d) {
                    Locale locale3 = F4.e.f1457a;
                    str2 = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                }
                baseViewHolder.setText(R.id.satellite_country_val, str2);
                break;
            case 15:
                V4.n nVar = (V4.n) obj;
                i.e(baseViewHolder, "holder");
                i.e(nVar, "item");
                baseViewHolder.setText(R.id.wifi_info_name, nVar.f3916a);
                baseViewHolder.setText(R.id.wifi_info_info, nVar.f3917b);
                break;
            default:
                SquatterBean squatterBean = (SquatterBean) obj;
                i.e(baseViewHolder, "holder");
                i.e(squatterBean, "item");
                String brand = squatterBean.getBrand();
                if (brand == null) {
                    brand = squatterBean.getIp();
                }
                baseViewHolder.setText(R.id.ap_name, brand);
                baseViewHolder.setText(R.id.ap_ip, squatterBean.getIp());
                baseViewHolder.setText(R.id.ap_mac, squatterBean.getMac());
                switch (squatterBean.getType()) {
                    case 1:
                        i = R.drawable.ic_phone_device;
                        break;
                    case 2:
                        i = R.drawable.ic_tablet;
                        break;
                    case 3:
                        i = R.drawable.ic_watch;
                        break;
                    case 4:
                        i = R.drawable.ic_computer;
                        break;
                    case 5:
                        i = R.drawable.ic_camera;
                        break;
                    case 6:
                        i = R.drawable.ic_tv_device;
                        break;
                    case 7:
                        i = R.drawable.ic_router_device;
                        break;
                    case 8:
                        i = R.drawable.ic_sound_device;
                        break;
                    case 9:
                        i = R.drawable.ic_device_printer;
                        break;
                    case 10:
                        i = R.drawable.ic_device_game;
                        break;
                    case 11:
                        i = R.drawable.ic_car;
                        break;
                    default:
                        i = R.drawable.ic_unknown_device;
                        break;
                }
                baseViewHolder.setImageResource(R.id.ap_image, i);
                if (!squatterBean.isMy()) {
                    if (!squatterBean.isKnown()) {
                        baseViewHolder.setText(R.id.known_device, R.string.device_unknown);
                        baseViewHolder.setTextColor(R.id.known_device, f().getColor(R.color.text_color));
                        break;
                    } else {
                        baseViewHolder.setText(R.id.known_device, R.string.device_known);
                        baseViewHolder.setTextColor(R.id.known_device, Color.parseColor("#0a75ff"));
                        break;
                    }
                } else {
                    baseViewHolder.setText(R.id.known_device, R.string.device_mine);
                    baseViewHolder.setTextColor(R.id.known_device, Color.parseColor("#0a75ff"));
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i3) {
        super(i);
        this.f1282l = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, boolean z6) {
        super(R.layout.item_wifi_info);
        this.f1282l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i) {
        super(R.layout.item_cell_info);
        this.f1282l = i;
        switch (i) {
            case 13:
                super(R.layout.satellite_gps_ingo);
                break;
            default:
                break;
        }
    }
}
