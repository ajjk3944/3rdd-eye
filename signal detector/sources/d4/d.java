package D4;

import B4.q;
import N4.k;
import U4.t;
import U4.y;
import c5.C0412i;
import com.lefan.base.pdf.PdfReadActivity;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;
import com.lefan.signal.ui.noise.NoiseActivity;
import p5.l;
import q5.i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1287a;

    public /* synthetic */ d(int i) {
        this.f1287a = i;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        int i = this.f1287a;
        C0412i c0412i = C0412i.f5929a;
        switch (i) {
            case 0:
                q qVar = (q) obj;
                int i3 = PdfReadActivity.f18779T;
                i.e(qVar, "dialog");
                qVar.dismiss();
                return c0412i;
            case 1:
                k kVar = (k) obj;
                i.e(kVar, "it");
                String str = kVar.f3008b;
                return Boolean.valueOf(str == null || str.length() == 0);
            case 2:
                k kVar2 = (k) obj;
                i.e(kVar2, "it");
                String str2 = kVar2.f3008b;
                return Boolean.valueOf(str2 == null || str2.length() == 0);
            case 3:
                q qVar2 = (q) obj;
                int i6 = BluetoothActivity.f18879D0;
                i.e(qVar2, "dialog");
                qVar2.dismiss();
                return c0412i;
            case 4:
                J4.b bVar = (J4.b) obj;
                i.e(bVar, "it");
                String str3 = bVar.f2141b;
                return Boolean.valueOf(str3 == null || str3.length() == 0);
            case 5:
                q qVar3 = (q) obj;
                int i7 = NoiseActivity.f18966r0;
                i.e(qVar3, "dialog");
                qVar3.dismiss();
                return c0412i;
            case 6:
                String str4 = (String) obj;
                i.b(str4);
                return str4;
            case 7:
                t tVar = (t) obj;
                i.e(tVar, "bean");
                String str5 = tVar.f3766b;
                return Boolean.valueOf(str5 == null || str5.length() == 0);
            case 8:
                y yVar = (y) obj;
                i.e(yVar, "it");
                String str6 = yVar.f3777b;
                return Boolean.valueOf(str6 == null || str6.length() == 0);
            case 9:
                U4.b bVar2 = (U4.b) obj;
                i.e(bVar2, "it");
                String str7 = bVar2.f3709c;
                return Boolean.valueOf(str7 == null || str7.length() == 0);
            case 10:
                String str8 = (String) obj;
                i.e(str8, "line");
                return y5.l.j0(str8).toString();
            case 11:
                i.e(obj, "it");
                return Integer.valueOf(t5.d.f23679a.a(2147418112) + 65536);
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
