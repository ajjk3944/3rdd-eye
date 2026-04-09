package A0;

import A2.BinderC0126n;
import B4.InterfaceC0140b;
import G3.C0148b;
import G3.InterfaceC0150d;
import R.InterfaceC0178e;
import R.InterfaceC0188o;
import R.O;
import R.o0;
import R.r0;
import Y2.A;
import Y2.C0204f;
import Y2.C0209k;
import Y2.N;
import Y2.y;
import Y2.z;
import android.app.Application;
import android.app.Dialog;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.viewpager2.widget.ViewPager2;
import c3.InterfaceC0402a;
import c4.AbstractC0403a;
import com.google.android.gms.internal.ads.InterfaceC1682pD;
import com.google.android.material.appbar.AppBarLayout;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;
import com.lefan.signal.ui.noise.NoiseActivity;
import d4.C2268b;
import f4.InterfaceFutureC2326a;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import o.InterfaceC2710e0;
import o.f1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e implements f, InterfaceC1682pD, C5.b, InterfaceC0188o, L2.g, InterfaceC0140b, InterfaceC0178e, S.n, InterfaceC0402a, N, d4.i, InterfaceC2710e0, f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f73b;

    public /* synthetic */ e(int i, Object obj) {
        this.f72a = i;
        this.f73b = obj;
    }

    @Override // Y2.O
    public Object a() {
        switch (this.f72a) {
            case 18:
                return new C0204f((Application) ((e) this.f73b).f73b);
            case 19:
                y yVar = z.f4386b;
                A.c(yVar);
                return new C0209k((U0.j) this.f73b, yVar);
            default:
                return this.f73b;
        }
    }

    @Override // L2.g
    public void accept(Object obj, Object obj2) {
        M2.m mVar = (M2.m) this.f73b;
        c3.f fVar = (c3.f) obj2;
        O2.a aVar = (O2.a) ((O2.d) obj).t();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f4017c);
        int i = W2.b.f4018a;
        if (mVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            mVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.f4016b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            fVar.f5902a.g(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // R.InterfaceC0178e
    public ClipData b() {
        return ((ContentInfo) this.f73b).getClip();
    }

    @Override // A0.f
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // A0.f
    public void d(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f73b).setResultCode(i);
    }

    @Override // S.n
    public boolean e(View view) {
        c1.g gVar = (c1.g) this.f73b;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) gVar.f5899e;
        if (viewPager2.f5642F) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    @Override // R.InterfaceC0178e
    public int f() {
        return ((ContentInfo) this.f73b).getFlags();
    }

    public InterfaceC0150d g(InterfaceC0150d interfaceC0150d) {
        return interfaceC0150d instanceof G3.l ? interfaceC0150d : new C0148b(-((G3.j) this.f73b).j(), interfaceC0150d);
    }

    @Override // R.InterfaceC0178e
    public ContentInfo h() {
        return (ContentInfo) this.f73b;
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        switch (this.f72a) {
            case 10:
                if (dialog != null) {
                    dialog.dismiss();
                }
                BluetoothActivity bluetoothActivity = (BluetoothActivity) this.f73b;
                bluetoothActivity.startActivity(com.bumptech.glide.d.x(bluetoothActivity, "android.settings.LOCATION_SOURCE_SETTINGS"));
                MyApplication.f18812d = true;
                break;
            default:
                NoiseActivity noiseActivity = (NoiseActivity) this.f73b;
                if (dialog != null) {
                    dialog.dismiss();
                }
                noiseActivity.f18992o0 = System.currentTimeMillis();
                noiseActivity.f18990m0.a(noiseActivity.f18971S);
                break;
        }
    }

    @Override // R.InterfaceC0178e
    public int j() {
        return ((ContentInfo) this.f73b).getSource();
    }

    @Override // C5.b
    public Object k(C5.c cVar, InterfaceC2370d interfaceC2370d) {
        ((C5.o) this.f73b).k(cVar, interfaceC2370d);
        return EnumC2380a.f20635a;
    }

    @Override // c3.InterfaceC0402a
    public Object l(c3.j jVar) {
        V2.h hVar = (V2.h) this.f73b;
        if (jVar.e() || jVar.f5914d) {
            return jVar;
        }
        Exception excB = jVar.b();
        if (!(excB instanceof K2.d)) {
            return jVar;
        }
        int i = ((K2.d) excB).f2147a.f6904a;
        return (i == 43001 || i == 43002 || i == 43003 || i == 17) ? ((V2.e) hVar.f3876c).b() : i == 43000 ? com.bumptech.glide.d.r(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : i != 15 ? jVar : com.bumptech.glide.d.r(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        switch (this.f72a) {
            case 10:
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
            default:
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
        }
    }

    public S.d n(int i) {
        return null;
    }

    public S.d o(int i) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R.InterfaceC0188o
    public r0 p(View view, r0 r0Var) {
        int i = this.f72a;
        int i3 = 0;
        Object obj = this.f73b;
        switch (i) {
            case 4:
                o0 o0Var = r0Var.f3359a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.f5078n, r0Var)) {
                    coordinatorLayout.f5078n = r0Var;
                    boolean z6 = r0Var.d() > 0;
                    coordinatorLayout.f5061C = z6;
                    coordinatorLayout.setWillNotDraw(!z6 && coordinatorLayout.getBackground() == null);
                    if (!o0Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i3 < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i3);
                            WeakHashMap weakHashMap = O.f3270a;
                            if (!childAt.getFitsSystemWindows() || ((E.e) childAt.getLayoutParams()).f1311a == null || !o0Var.m()) {
                                i3++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    break;
                }
                break;
            default:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                r0 r0Var2 = appBarLayout.getFitsSystemWindows() ? r0Var : null;
                if (!Objects.equals(appBarLayout.f18023g, r0Var2)) {
                    appBarLayout.f18023g = r0Var2;
                    if (appBarLayout.f18014L != null && appBarLayout.getTopInset() > 0) {
                        i3 = 1;
                    }
                    appBarLayout.setWillNotDraw(i3 ^ 1);
                    appBarLayout.requestLayout();
                    break;
                }
                break;
        }
        return r0Var;
    }

    public void q(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((J3.i) this.f73b).a(0);
    }

    public boolean r(int i, int i3, Bundle bundle) {
        return false;
    }

    public String toString() {
        switch (this.f72a) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.f73b) + "}";
            default:
                return super.toString();
        }
    }

    public e(int i) {
        this.f72a = i;
        switch (i) {
            case 12:
                if (Build.VERSION.SDK_INT < 26) {
                    this.f73b = new S.e(this);
                    break;
                } else {
                    this.f73b = new S.f(this);
                    break;
                }
            default:
                this.f73b = new ArrayList();
                break;
        }
    }

    public e(ContentInfo contentInfo) {
        this.f72a = 11;
        contentInfo.getClass();
        this.f73b = D3.f.k(contentInfo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1682pD, Y2.O
    public InterfaceFutureC2326a a() {
        BinderC0126n binderC0126n = (BinderC0126n) this.f73b;
        return (InterfaceFutureC2326a) binderC0126n.P3(binderC0126n.f290c, null, "BANNER", null, null, 0, null, new Bundle(), null).f13794b.c();
    }

    @Override // d4.i
    /* renamed from: a, reason: collision with other method in class */
    public void mo0a() throws XmlPullParserException {
        XmlPullParser xmlPullParser;
        C2268b c2268b = (C2268b) this.f73b;
        int i = 0;
        String attributeValue = null;
        String attributeValue2 = null;
        while (true) {
            xmlPullParser = c2268b.f19788a;
            if (i >= xmlPullParser.getAttributeCount()) {
                break;
            }
            if ("module".equals(xmlPullParser.getAttributeName(i))) {
                attributeValue = xmlPullParser.getAttributeValue(i);
            }
            if ("errorCode".equals(xmlPullParser.getAttributeName(i))) {
                attributeValue2 = xmlPullParser.getAttributeValue(i);
            }
            i++;
        }
        if (attributeValue != null && attributeValue2 != null) {
            V2.h hVar = c2268b.f19789b;
            Integer num = (Integer) AbstractC0403a.f5919c.get(attributeValue2);
            if (num != null) {
                Map map = (Map) hVar.f3876c;
                if (map != null) {
                    map.put(attributeValue, num);
                    while (xmlPullParser.next() != 3) {
                    }
                    return;
                }
                throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
            }
            throw new IllegalArgumentException(attributeValue2.concat(" is unknown error."));
        }
        throw new XmlPullParserException("'split-install-error' element does not contain 'module'/'errorCode' attributes.", xmlPullParser, null);
    }
}
