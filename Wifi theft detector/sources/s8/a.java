package s8;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.wifi.netdiscovery.consts.OS_TYPE;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifi.netdiscovery.utils.DeviceTypeUtil;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends RecyclerView.Adapter {

    /* renamed from: i, reason: collision with root package name */
    public Activity f24306i;

    /* renamed from: j, reason: collision with root package name */
    public Fragment f24307j;

    /* renamed from: k, reason: collision with root package name */
    public List f24308k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public List f24309l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f24310m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24311n;

    /* renamed from: s8.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0480a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HostInfo f24312a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f24313b;

        public ViewOnClickListenerC0480a(HostInfo hostInfo, c cVar) {
            this.f24312a = hostInfo;
            this.f24313b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean zA = o.c().a(a.this.f24306i, "device_marked", this.f24312a.hardwareAddress, false);
            o.c().k(a.this.f24306i, "device_marked", this.f24312a.hardwareAddress, !zA);
            if (zA) {
                this.f24313b.f24319e.setText(R.string.stranger);
                this.f24313b.f24319e.setBackgroundResource(R.drawable.btn_gray_bg_rectangle);
            } else {
                this.f24313b.f24319e.setText(R.string.known);
                this.f24313b.f24319e.setBackgroundResource(R.drawable.btn_theme_rectangle);
            }
        }
    }

    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HostInfo f24315a;

        public b(HostInfo hostInfo) {
            this.f24315a = hostInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f24307j == null) {
                h.b(a.this.f24306i, this.f24315a, true, true);
            } else {
                h.c(a.this.f24307j, this.f24315a, true);
            }
        }
    }

    public class c extends RecyclerView.c0 {

        /* renamed from: c, reason: collision with root package name */
        public LinearLayout f24317c;

        /* renamed from: d, reason: collision with root package name */
        public ImageView f24318d;

        /* renamed from: e, reason: collision with root package name */
        public AppCompatButton f24319e;

        /* renamed from: f, reason: collision with root package name */
        public TextView f24320f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f24321g;

        /* renamed from: h, reason: collision with root package name */
        public TextView f24322h;

        public c(View view, int i10) {
            super(view);
            if (i10 == 1) {
                ((TextView) view.findViewById(R.id.tv_item_device_tittle)).setText(view.getContext().getString(R.string.online_devices));
                return;
            }
            if (i10 == 2) {
                ((TextView) view.findViewById(R.id.tv_item_device_tittle)).setText(view.getContext().getString(R.string.offline_devices));
                return;
            }
            this.f24317c = (LinearLayout) view.findViewById(R.id.ll_listview_item);
            this.f24318d = (ImageView) view.findViewById(R.id.iv_device_icon);
            this.f24319e = (AppCompatButton) view.findViewById(R.id.btn_sign);
            this.f24320f = (TextView) view.findViewById(R.id.tv_device_brand);
            this.f24321g = (TextView) view.findViewById(R.id.tv_item_ip);
            this.f24322h = (TextView) view.findViewById(R.id.tv_item_device_name);
        }
    }

    public a(Activity activity, List list, List list2) {
        this.f24306i = activity;
        this.f24311n = Build.VERSION.SDK_INT >= 30;
        if (list != null) {
            this.f24308k.addAll(list);
        }
        if (list2 != null) {
            this.f24309l.addAll(list2);
        }
        g();
    }

    public void c(HostInfo hostInfo) {
        if (this.f24308k == null) {
            this.f24308k = new ArrayList();
        }
        this.f24308k.add(hostInfo);
        notifyDataSetChanged();
    }

    public final void d(c cVar, int i10) {
        HostInfo hostInfo = this.f24308k.size() != 0 ? i10 <= this.f24308k.size() ? (HostInfo) this.f24308k.get(i10 - 1) : (HostInfo) this.f24309l.get((i10 - this.f24308k.size()) - 2) : (HostInfo) this.f24309l.get(i10 - 1);
        if (hostInfo == null) {
            return;
        }
        String str = hostInfo.ipAddress;
        if (str != null) {
            cVar.f24321g.setText(str);
        }
        String str2 = hostInfo.hostName;
        String str3 = hostInfo.vendor;
        h(cVar, hostInfo, str2, str3, str3 != null ? str3.split(" ")[0].replace(",", "") : str3);
        l(cVar, hostInfo);
    }

    public int e() {
        return this.f24308k.size();
    }

    public List f() {
        return this.f24308k;
    }

    public final void g() {
        if (this.f24309l.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f24308k.iterator();
        while (it.hasNext()) {
            arrayList.add(((HostInfo) it.next()).hardwareAddress);
        }
        if (arrayList.size() > 0) {
            Iterator it2 = this.f24309l.iterator();
            while (it2.hasNext()) {
                if (arrayList.contains(((HostInfo) it2.next()).hardwareAddress)) {
                    it2.remove();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f24308k.size() != 0) {
            return this.f24309l.size() == 0 ? this.f24308k.size() + 1 : this.f24308k.size() + this.f24309l.size() + 2;
        }
        if (this.f24309l.size() == 0) {
            return 0;
        }
        return this.f24309l.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        List list = this.f24308k;
        if (list == null || list.size() == 0) {
            return i10 == 0 ? 2 : 0;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 == this.f24308k.size() + 1 ? 2 : 0;
    }

    public final void h(c cVar, HostInfo hostInfo, String str, String str2, String str3) {
        if (this.f24311n) {
            cVar.f24319e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str)) {
            DeviceTypeUtil.DeviceType deviceTypeE = DeviceTypeUtil.e(str);
            DeviceTypeUtil.DeviceType deviceType = DeviceTypeUtil.DeviceType.Android;
            if (deviceTypeE.equals(deviceType) || DeviceTypeUtil.e(str2).equals(deviceType)) {
                cVar.f24318d.setImageResource(R.drawable.ic_android);
                if (this.f24311n) {
                    str3 = this.f24306i.getString(R.string.device_android);
                }
            } else {
                DeviceTypeUtil.DeviceType deviceTypeE2 = DeviceTypeUtil.e(str);
                DeviceTypeUtil.DeviceType deviceType2 = DeviceTypeUtil.DeviceType.MacBook;
                if (deviceTypeE2.equals(deviceType2) || DeviceTypeUtil.e(str2).equals(deviceType2)) {
                    cVar.f24318d.setImageResource(R.drawable.ic_apple);
                    if (this.f24311n) {
                        str3 = this.f24306i.getString(R.string.device_apple);
                    }
                } else {
                    DeviceTypeUtil.DeviceType deviceTypeE3 = DeviceTypeUtil.e(str);
                    DeviceTypeUtil.DeviceType deviceType3 = DeviceTypeUtil.DeviceType.Iphone;
                    if (deviceTypeE3.equals(deviceType3) || DeviceTypeUtil.e(str2).equals(deviceType3)) {
                        cVar.f24318d.setImageResource(R.drawable.ic_apple);
                        if (this.f24311n) {
                            str3 = this.f24306i.getString(R.string.device_apple);
                        }
                    } else {
                        DeviceTypeUtil.DeviceType deviceTypeE4 = DeviceTypeUtil.e(str);
                        DeviceTypeUtil.DeviceType deviceType4 = DeviceTypeUtil.DeviceType.Windows;
                        if (deviceTypeE4.equals(deviceType4) || DeviceTypeUtil.e(str2).equals(deviceType4) || OS_TYPE.WINDOWS.equals(hostInfo.os)) {
                            cVar.f24318d.setImageResource(R.drawable.ic_pc);
                            if (this.f24311n) {
                                str3 = this.f24306i.getString(R.string.device_windows);
                            }
                        } else {
                            cVar.f24318d.setImageResource(R.drawable.ic_unknow);
                            if (this.f24311n) {
                                str3 = this.f24306i.getString(R.string.device_windows);
                            }
                        }
                    }
                }
            }
            if (str3 == null) {
                str3 = this.f24306i.getString(R.string.unknow);
            }
            cVar.f24320f.setText(str3);
            if (hostInfo.isMine) {
                cVar.f24320f.setText(str3 + "(" + this.f24306i.getString(R.string.my_device) + ")");
            } else if (hostInfo.isGateWay) {
                cVar.f24318d.setImageResource(R.drawable.router);
                cVar.f24320f.setText(str3 + "(" + this.f24306i.getString(R.string.router) + ")");
                if (this.f24311n) {
                    cVar.f24320f.setText(this.f24306i.getString(R.string.router));
                }
            }
        }
        cVar.f24322h.setText(hostInfo.hostName);
        if (o.c().a(this.f24306i, "device_marked", hostInfo.hardwareAddress, false)) {
            cVar.f24319e.setText(R.string.known);
            cVar.f24319e.setBackgroundResource(R.drawable.btn_theme_rectangle);
        } else {
            cVar.f24319e.setText(R.string.stranger);
            cVar.f24319e.setBackgroundResource(R.drawable.btn_gray_bg_rectangle);
        }
        String strG = o.c().g(this.f24306i, "edit_device_name", hostInfo.hardwareAddress, "");
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        cVar.f24320f.setText(strG);
    }

    public void i(List list, List list2, boolean z10) {
        this.f24308k.clear();
        this.f24309l.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HostInfo hostInfo = (HostInfo) it.next();
                if (hostInfo.isMine) {
                    this.f24308k.add(0, hostInfo);
                } else if (hostInfo.isGateWay) {
                    this.f24308k.add(0, hostInfo);
                } else {
                    this.f24308k.add(hostInfo);
                }
            }
        }
        if (list2 != null) {
            this.f24309l.addAll(list2);
        }
        if (z10) {
            g();
        }
        notifyDataSetChanged();
    }

    public void j(Fragment fragment) {
        this.f24307j = fragment;
    }

    public void k(boolean z10) {
        this.f24310m = z10;
    }

    public final void l(c cVar, HostInfo hostInfo) {
        if (this.f24310m) {
            cVar.f24319e.setClickable(false);
        } else {
            cVar.f24319e.setOnClickListener(new ViewOnClickListenerC0480a(hostInfo, cVar));
        }
        cVar.f24317c.setOnClickListener(new b(hostInfo));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        c cVar = (c) c0Var;
        if (getItemViewType(i10) == 0) {
            d(cVar, i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = i10 == 0 ? LayoutInflater.from(this.f24306i).inflate(R.layout.adapter_device, viewGroup, false) : (i10 == 1 || i10 == 2) ? LayoutInflater.from(this.f24306i).inflate(R.layout.adapter_device_list_tittle, viewGroup, false) : null;
        return new c(viewInflate, i10);
    }
}
