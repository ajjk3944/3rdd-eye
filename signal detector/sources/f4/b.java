package F4;

import L0.j;
import L0.k;
import L0.l;
import M3.C;
import R.InterfaceC0188o;
import R.o0;
import R.r0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.lefan.signal.MainActivity;
import com.lefan.signal.network.webSpeed.WebSpeedActivity;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;
import com.lefan.signal.ui.satellite.SatelliteActivity;
import com.lefan.signal.ui.speed.SpeedActivity;
import e.C2284a;
import e.InterfaceC2285b;
import i4.p;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import q5.i;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0188o, k, C, InterfaceC2285b, p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1453a;

    public /* synthetic */ b(int i) {
        this.f1453a = i;
    }

    @Override // L0.k
    public void a(j jVar, l lVar) {
        switch (this.f1453a) {
            case 5:
                jVar.d(lVar);
                break;
            case 6:
                jVar.f(lVar);
                break;
            case 7:
                jVar.a(lVar);
                break;
            case 8:
                jVar.b();
                break;
            default:
                jVar.e();
                break;
        }
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        C2284a c2284a = (C2284a) obj;
        switch (this.f1453a) {
            case 13:
                int i = BluetoothActivity.f18879D0;
                i.e(c2284a, "it");
                break;
            case 14:
                int i3 = BluetoothActivity.f18879D0;
                i.e(c2284a, "it");
                break;
            case 15:
                int i6 = BluetoothActivity.f18879D0;
                i.e(c2284a, "it");
                break;
            case 16:
            case 17:
            default:
                i.e(c2284a, "it");
                break;
            case 18:
                i.e(c2284a, "it");
                break;
            case 19:
                i.e(c2284a, "it");
                break;
            case 20:
                i.e(c2284a, "it");
                break;
            case 21:
                int i7 = SatelliteActivity.f19187g0;
                i.e(c2284a, "it");
                break;
            case 22:
                int i8 = SpeedActivity.f19295f0;
                i.e(c2284a, "it");
                break;
        }
    }

    @Override // i4.p
    public Object d() {
        switch (this.f1453a) {
            case 24:
                return new LinkedHashMap();
            case 25:
                return new TreeMap();
            case 26:
                return new ConcurrentHashMap();
            case 27:
                return new ConcurrentSkipListMap();
            case 28:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // R.InterfaceC0188o
    public r0 p(View view, r0 r0Var) {
        switch (this.f1453a) {
            case 0:
                i.e(view, "v");
                J.c cVarF = r0Var.f3359a.f(647);
                i.d(cVarF, "getInsets(...)");
                view.setPadding(cVarF.f2007a, cVarF.f2008b, cVarF.f2009c, cVarF.f2010d);
                break;
            case 1:
                i.e(view, "v");
                o0 o0Var = r0Var.f3359a;
                RecyclerView recyclerView = (RecyclerView) view;
                recyclerView.setClipToPadding(false);
                J.c cVarF2 = o0Var.f(647);
                i.b(cVarF2);
                view.setPadding(cVarF2.f2007a, recyclerView.getPaddingTop(), cVarF2.f2009c, cVarF2.f2010d);
                break;
            case 2:
                i.e(view, "v");
                J.c cVarF3 = r0Var.f3359a.f(647);
                i.d(cVarF3, "getInsets(...)");
                view.setPadding(cVarF3.f2007a, cVarF3.f2008b, cVarF3.f2009c, view.getPaddingBottom());
                break;
            case 3:
                int i = MainActivity.f18804V;
                i.e(view, "v");
                J.c cVarF4 = r0Var.f3359a.f(647);
                i.d(cVarF4, "getInsets(...)");
                view.setPadding(cVarF4.f2007a, view.getPaddingTop(), cVarF4.f2009c, view.getPaddingBottom());
                break;
            case 4:
                int i3 = MainActivity.f18804V;
                i.e(view, "v");
                J.c cVarF5 = r0Var.f3359a.f(647);
                i.d(cVarF5, "getInsets(...)");
                view.setPaddingRelative(cVarF5.f2007a, cVarF5.f2008b, view.getPaddingRight(), cVarF5.f2010d);
                break;
            default:
                int i6 = WebSpeedActivity.f18847S;
                i.e(view, "v");
                J.c cVarF6 = r0Var.f3359a.f(647);
                i.d(cVarF6, "getInsets(...)");
                view.setPadding(cVarF6.f2007a, cVarF6.f2008b, cVarF6.f2009c, view.getPaddingBottom());
                break;
        }
        return r0Var;
    }
}
