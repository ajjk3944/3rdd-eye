package s8;

import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifihacker.detector.data.HistoryInfo;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends RecyclerView.Adapter {

    /* renamed from: i, reason: collision with root package name */
    public Context f24324i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f24325j;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HistoryInfo f24326a;

        public a(HistoryInfo historyInfo) {
            this.f24326a = historyInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.f(b.this.f24324i, this.f24326a);
        }
    }

    /* renamed from: s8.b$b, reason: collision with other inner class name */
    public class C0481b extends RecyclerView.c0 {

        /* renamed from: c, reason: collision with root package name */
        public ImageView f24328c;

        /* renamed from: d, reason: collision with root package name */
        public TextView f24329d;

        /* renamed from: e, reason: collision with root package name */
        public TextView f24330e;

        /* renamed from: f, reason: collision with root package name */
        public TextView f24331f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f24332g;

        public C0481b(View view) {
            super(view);
            this.f24328c = (ImageView) view.findViewById(R.id.iv_history_list_icon);
            this.f24329d = (TextView) view.findViewById(R.id.tv_history_wifi_name);
            this.f24330e = (TextView) view.findViewById(R.id.tv_history_time);
            this.f24331f = (TextView) view.findViewById(R.id.tv_history_online_count);
            this.f24332g = (TextView) view.findViewById(R.id.tv_history_offline_count);
        }
    }

    public b(Context context, ArrayList arrayList) {
        this.f24324i = context;
        this.f24325j = arrayList;
    }

    public final void b(C0481b c0481b, int i10, int i11, long j10) {
        c0481b.f24331f.setText(this.f24324i.getString(R.string.online_device_count) + " ");
        SpannableString spannableString = new SpannableString(i10 + "");
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.f24324i, R.color.origin)), 0, (i10 + "").length(), 33);
        c0481b.f24331f.append(spannableString);
        SpannableString spannableString2 = new SpannableString(i11 + "");
        spannableString2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.f24324i, R.color.origin)), 0, (i11 + "").length(), 33);
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(j10));
        if (Build.VERSION.SDK_INT >= 30) {
            c0481b.f24332g.setText(str);
            c0481b.f24330e.setVisibility(8);
            return;
        }
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.f24324i, R.color.colorPrimary)), 0, str.length(), 33);
        c0481b.f24332g.setText(this.f24324i.getString(R.string.offline_device_count) + " ");
        c0481b.f24332g.append(spannableString2);
        c0481b.f24330e.setText(spannableString3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f24325j;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        int size;
        C0481b c0481b = (C0481b) c0Var;
        HistoryInfo historyInfo = (HistoryInfo) this.f24325j.get(i10);
        String str = historyInfo.wifiName;
        long j10 = historyInfo.scanTime;
        if (historyInfo.hasWifiPassword) {
            c0481b.f24328c.setImageResource(R.drawable.wifi_lock_history);
        } else {
            c0481b.f24328c.setImageResource(R.drawable.wifi_unlock_history);
        }
        if (!TextUtils.isEmpty(str)) {
            c0481b.f24329d.setText(str);
        }
        List<HostInfo> list = historyInfo.onLineList;
        int size2 = 0;
        int size3 = list != null ? list.size() : 0;
        List<HostInfo> list2 = historyInfo.offLineList;
        if (list2 == null) {
            size = size2;
        } else if (historyInfo.onLineList == null) {
            size2 = list2.size();
            size = size2;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<HostInfo> it = historyInfo.onLineList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().hardwareAddress);
            }
            size = historyInfo.offLineList.size();
            Iterator<HostInfo> it2 = historyInfo.offLineList.iterator();
            while (it2.hasNext()) {
                if (arrayList.contains(it2.next().hardwareAddress)) {
                    size--;
                }
            }
        }
        b(c0481b, size3, size, j10);
        c0Var.itemView.setOnClickListener(new a(historyInfo));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new C0481b(LayoutInflater.from(this.f24324i).inflate(R.layout.adapter_history, viewGroup, false));
    }
}
