package wg;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36653b;

    /* renamed from: c, reason: collision with root package name */
    public final DeviceInfoApp f36654c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f36655d;

    /* renamed from: e, reason: collision with root package name */
    public View f36656e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f36657f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f36658h;

    public c(int i4) {
        this.f36653b = i4;
        switch (i4) {
            case 1:
                this.f36654c = DeviceInfoApp.f21145f;
                this.f36655d = new Handler(Looper.getMainLooper());
                this.f36657f = new o1(16, this);
                break;
            default:
                this.f36654c = DeviceInfoApp.f21145f;
                this.f36655d = new Handler(Looper.getMainLooper());
                this.f36657f = new ArrayList();
                this.g = new ArrayList();
                this.f36658h = new o1(15, this);
                break;
        }
    }

    @Override // wg.a
    public final void a() throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        switch (this.f36653b) {
            case 0:
                ArrayList arrayList = (ArrayList) this.g;
                arrayList.clear();
                ArrayList arrayList2 = (ArrayList) this.f36657f;
                arrayList2.clear();
                DeviceInfoApp deviceInfoApp = this.f36654c;
                ConstraintLayout constraintLayout = new ConstraintLayout(deviceInfoApp);
                constraintLayout.f857a = new SparseArray();
                constraintLayout.f858b = new ArrayList(4);
                constraintLayout.f859c = new k3.e();
                constraintLayout.f860d = 0;
                constraintLayout.f861e = 0;
                constraintLayout.f862f = Integer.MAX_VALUE;
                constraintLayout.g = Integer.MAX_VALUE;
                constraintLayout.f863h = true;
                constraintLayout.f864i = 257;
                constraintLayout.j = null;
                constraintLayout.f865k = null;
                constraintLayout.f866l = -1;
                constraintLayout.f867m = new HashMap();
                constraintLayout.f868n = new SparseArray();
                constraintLayout.f869o = new n3.e(constraintLayout, constraintLayout);
                constraintLayout.i(null, 0);
                this.f36656e = constraintLayout;
                int dimensionPixelSize = deviceInfoApp.getResources().getDimensionPixelSize(R.dimen.monitor_padding);
                ((ConstraintLayout) this.f36656e).setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                Barrier barrier = new Barrier(deviceInfoApp);
                barrier.setType(6);
                barrier.setId(1);
                ((ConstraintLayout) this.f36656e).addView(barrier);
                n3.d dVar = (n3.d) barrier.getLayoutParams();
                dVar.f29594i = 0;
                dVar.f29599l = 0;
                int iB = a4.a.b(10.0f);
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                int[] iArr = new int[iAvailableProcessors];
                int i4 = 0;
                while (i4 < iAvailableProcessors) {
                    int i10 = 100 + i4;
                    TextView textView = new TextView(deviceInfoApp, null, 0, R.style.MonitorLabel);
                    textView.setId(i10);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(deviceInfoApp.getString(R.string.core));
                    sb2.append(" ");
                    int i11 = i4 + 1;
                    sb2.append(i11);
                    textView.setText(sb2.toString());
                    ((ConstraintLayout) this.f36656e).addView(textView);
                    n3.d dVar2 = (n3.d) textView.getLayoutParams();
                    dVar2.f29612t = 0;
                    if (i4 == 0) {
                        dVar2.f29594i = 0;
                    } else {
                        dVar2.j = i4 + 99;
                    }
                    arrayList.add(textView);
                    iArr[i4] = i10;
                    TextView textView2 = new TextView(deviceInfoApp, null, 0, R.style.MonitorValue);
                    textView2.setText(deviceInfoApp.getString(R.string.idle));
                    ((ConstraintLayout) this.f36656e).addView(textView2);
                    n3.d dVar3 = (n3.d) textView2.getLayoutParams();
                    dVar3.f29601m = i10;
                    dVar3.f29611s = barrier.getId();
                    dVar3.setMarginStart(iB);
                    arrayList2.add(textView2);
                    i4 = i11;
                }
                barrier.setReferencedIds(iArr);
                break;
            default:
                View viewInflate = LayoutInflater.from(this.f36654c).inflate(R.layout.monitor_gpu, (ViewGroup) null);
                this.f36656e = viewInflate;
                this.g = (TextView) viewInflate.findViewById(R.id.label);
                this.f36658h = (TextView) this.f36656e.findViewById(R.id.value);
                break;
        }
    }

    @Override // wg.a
    public final View b() {
        switch (this.f36653b) {
            case 0:
                return (ConstraintLayout) this.f36656e;
            default:
                return this.f36656e;
        }
    }

    @Override // wg.a
    public final void c() {
        switch (this.f36653b) {
            case 0:
                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                int iC = com.liuzh.deviceinfo.utilities.f.c();
                boolean zI = com.liuzh.deviceinfo.utilities.f.i();
                ArrayList arrayList = (ArrayList) this.g;
                int size = arrayList.size();
                int i4 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    TextView textView = (TextView) obj;
                    textView.setTextSize(iC);
                    textView.setTextColor(zI ? -1 : -16777216);
                }
                ArrayList arrayList2 = (ArrayList) this.f36657f;
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    TextView textView2 = (TextView) obj2;
                    textView2.setTextSize(iC);
                    textView2.setTextColor(zI ? -1 : -16777216);
                }
                break;
            default:
                com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                int iC2 = com.liuzh.deviceinfo.utilities.f.c();
                boolean zI2 = com.liuzh.deviceinfo.utilities.f.i();
                float f10 = iC2;
                ((TextView) this.g).setTextSize(f10);
                ((TextView) this.g).setTextColor(zI2 ? -1 : -16777216);
                ((TextView) this.f36658h).setTextSize(f10);
                ((TextView) this.f36658h).setTextColor(zI2 ? -1 : -16777216);
                break;
        }
    }

    @Override // wg.a
    public final void d() {
        switch (this.f36653b) {
            case 0:
                this.f36655d.post((o1) this.f36658h);
                break;
            default:
                this.f36655d.post((o1) this.f36657f);
                break;
        }
    }

    @Override // wg.a
    public final void e() {
        switch (this.f36653b) {
            case 0:
                this.f36655d.removeCallbacks((o1) this.f36658h);
                break;
            default:
                this.f36655d.removeCallbacks((o1) this.f36657f);
                break;
        }
    }
}
