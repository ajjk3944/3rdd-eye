package h2;

import B4.E;
import B4.InterfaceC0140b;
import L2.m;
import R.InterfaceC0188o;
import R.r0;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.apm.insight.R;
import com.bumptech.glide.load.data.j;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C1283hr;
import com.google.android.gms.internal.ads.CA;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0703Ra;
import com.google.android.gms.internal.ads.InterfaceC1968ud;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lefan.base.activity.SuggestActivity;
import com.lefan.signal.MainActivity;
import e.InterfaceC2285b;
import j2.InterfaceC2557m;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.G;
import k0.K;
import o.Q0;
import o.V;
import q2.C2841s;
import q2.M0;
import r1.C2872b;
import r1.InterfaceC2871a;
import r1.o;
import r1.r;
import r1.s;
import r1.x;
import u1.k;
import u1.l;
import u2.g;
import u2.h;
import w2.n;
import y2.InterfaceC3012b;

/* loaded from: classes.dex */
public class d implements BiddingTokenCallback, PAGInterstitialAdInteractionListener, InterfaceC2285b, InterfaceC0188o, V, s, InterfaceC2871a, l, g, InterfaceC0140b, Q0, E {

    /* renamed from: a, reason: collision with root package name */
    public Object f20472a;

    public /* synthetic */ d(Object obj) {
        this.f20472a = obj;
    }

    @Override // u1.l
    public int a() {
        return (e() << 8) | e();
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        Map map = (Map) obj;
        K k6 = (K) this.f20472a;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        G g2 = (G) k6.f21493D.pollFirst();
        if (g2 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = g2.f21482a;
            if (k6.f21505c.o(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // r1.s
    public r d(x xVar) {
        return new C2872b((AssetManager) this.f20472a, 0, this);
    }

    @Override // u1.l
    public short e() throws IOException {
        int i = ((InputStream) this.f20472a).read();
        if (i != -1) {
            return (short) i;
        }
        throw new k();
    }

    @Override // u1.l
    public int f(int i, byte[] bArr) throws k {
        int i3 = 0;
        int i6 = 0;
        while (i3 < i && (i6 = ((InputStream) this.f20472a).read(bArr, i3, i - i3)) != -1) {
            i3 += i6;
        }
        if (i3 == 0 && i6 == -1) {
            throw new k();
        }
        return i3;
    }

    @Override // r1.InterfaceC2871a
    public com.bumptech.glide.load.data.d g(AssetManager assetManager, String str) {
        return new j(assetManager, str, 1);
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        MainActivity mainActivity = (MainActivity) this.f20472a;
        if (dialog != null) {
            dialog.dismiss();
        }
        try {
            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + mainActivity.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            F4.d.b(mainActivity, mainActivity.getString(R.string.no_market));
        }
    }

    @Override // u2.g
    public void j(JsonWriter jsonWriter) throws IOException {
        Object obj = h.f23803b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f20472a;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(strEncodeToString);
        } else {
            String strD = u2.f.d(strEncodeToString, "MD5");
            if (strD != null) {
                jsonWriter.name("bodydigest").value(strD);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    public p1.b l() {
        p1.b bVar;
        synchronized (((ArrayDeque) this.f20472a)) {
            bVar = (p1.b) ((ArrayDeque) this.f20472a).poll();
        }
        return bVar == null ? new p1.b() : bVar;
    }

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // B4.E
    public void n(int i) {
        SuggestActivity suggestActivity = (SuggestActivity) this.f20472a;
        HashMap map = suggestActivity.f18768P;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            suggestActivity.f18772T = 2;
            suggestActivity.f18774V.a("image/*");
            return;
        }
        map.remove(2);
        ImageView imageView = suggestActivity.f18771S;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.base_add_img);
        }
        Button button = suggestActivity.f18773U;
        if (button != null) {
            button.setEnabled(map.isEmpty());
        }
    }

    public void o(p1.b bVar) {
        synchronized (((ArrayDeque) this.f20472a)) {
            try {
                if (((ArrayDeque) this.f20472a).size() < 10) {
                    ((ArrayDeque) this.f20472a).offer(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        n nVar = ((i2.h) this.f20472a).f20569d;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        n nVar = ((i2.h) this.f20472a).f20569d;
        if (nVar != null) {
            nVar.c();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        i2.h hVar = (i2.h) this.f20472a;
        n nVar = hVar.f20569d;
        if (nVar != null) {
            nVar.b();
            hVar.f20569d.d();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
    public void onBiddingTokenCollected(String str) {
        C1283hr c1283hr = (C1283hr) ((InterfaceC3012b) this.f20472a);
        c1283hr.getClass();
        try {
            ((InterfaceC1968ud) c1283hr.f14592b).x(str);
        } catch (RemoteException e6) {
            u2.k.f("", e6);
        }
    }

    @Override // R.InterfaceC0188o
    public r0 p(View view, r0 r0Var) {
        k3.e eVar = (k3.e) this.f20472a;
        k3.d dVar = eVar.f21798m;
        if (dVar != null) {
            eVar.f21792f.f18160m0.remove(dVar);
        }
        k3.d dVar2 = new k3.d(eVar.i, r0Var);
        eVar.f21798m = dVar2;
        dVar2.e(eVar.getWindow());
        BottomSheetBehavior bottomSheetBehavior = eVar.f21792f;
        k3.d dVar3 = eVar.f21798m;
        ArrayList arrayList = bottomSheetBehavior.f18160m0;
        if (!arrayList.contains(dVar3)) {
            arrayList.add(dVar3);
        }
        return r0Var;
    }

    public void q(CA ca) {
        m mVar = (m) this.f20472a;
        mVar.getClass();
        String str = ca.f7547b;
        int i = ca.f7546a;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Jc)).booleanValue()) {
                mVar.f2537b = str;
            }
        }
        switch (i) {
            case 8152:
                mVar.h(new HashMap(), "onLMDOverlayOpened");
                break;
            case 8153:
                mVar.h(new HashMap(), "onLMDOverlayClicked");
                break;
            case 8155:
                mVar.h(new HashMap(), "onLMDOverlayClose");
                break;
            case 8157:
                mVar.f2537b = null;
                mVar.f2538c = null;
                mVar.f2536a = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(i));
                mVar.h(map, "onLMDOverlayFailedToOpen");
                break;
        }
    }

    public void r(InterfaceC2557m interfaceC2557m) {
        InterfaceC0703Ra interfaceC0703Ra = ((NativeAdView) this.f20472a).f6887b;
        if (interfaceC0703Ra == null) {
            return;
        }
        try {
            if (interfaceC2557m instanceof M0) {
                interfaceC0703Ra.w3(((M0) interfaceC2557m).f23132a);
            } else if (interfaceC2557m == null) {
                interfaceC0703Ra.w3(null);
            } else {
                u2.k.c("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e6) {
            u2.k.f("Unable to call setMediaContent on delegate", e6);
        }
    }

    @Override // u1.l
    public long skip(long j6) throws IOException {
        InputStream inputStream = (InputStream) this.f20472a;
        if (j6 < 0) {
            return 0L;
        }
        long j7 = j6;
        while (j7 > 0) {
            long jSkip = inputStream.skip(j7);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j7 -= jSkip;
        }
        return j6 - j7;
    }

    public d(int i) {
        switch (i) {
            case 10:
                this.f20472a = new o(0, 500L);
                break;
            case 15:
                this.f20472a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f20472a = new ArrayDeque();
                break;
        }
    }

    @Override // o.V
    public void c(int i) {
    }

    @Override // o.V
    public void h(int i) {
    }

    @Override // o.V
    public void k(int i, float f2) {
    }
}
