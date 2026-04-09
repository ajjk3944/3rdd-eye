package Q4;

import android.widget.TextView;
import c5.C0412i;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;
import com.lefan.signal.ui.satellite.SatelliteActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements p5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3203b;

    public /* synthetic */ f(TextView textView, int i) {
        this.f3202a = i;
        this.f3203b = textView;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        String str;
        int i = this.f3202a;
        C0412i c0412i = C0412i.f5929a;
        TextView textView = this.f3203b;
        switch (i) {
            case 0:
                int i3 = BluetoothActivity.f18879D0;
                textView.setText((String) obj);
                break;
            case 1:
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = "--";
                }
                textView.setText(str2);
                break;
            case 2:
                List list = (List) obj;
                q5.i.b(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((V4.l) obj2).f3905a) {
                        arrayList.add(obj2);
                    }
                }
                Integer numValueOf = Integer.valueOf(arrayList.size());
                Integer numValueOf2 = Integer.valueOf(list.size());
                if (R2.a.f3390d) {
                    Locale locale = F4.e.f1457a;
                    str = String.format(F4.e.b(), "%d/%d", Arrays.copyOf(new Object[]{numValueOf, numValueOf2}, 2));
                } else {
                    str = String.format(Locale.ENGLISH, "%d/%d", Arrays.copyOf(new Object[]{numValueOf, numValueOf2}, 2));
                }
                textView.setText(str);
                break;
            default:
                int i6 = SatelliteActivity.f19187g0;
                textView.setText((String) obj);
                break;
        }
        return c0412i;
    }
}
