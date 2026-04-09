package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.applovin.impl.d5;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.s4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.CpuCard;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4803c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4806f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, String str2, Activity activity, ViewGroup viewGroup, androidx.lifecycle.t tVar) {
        this.f4801a = 1;
        this.f4803c = maxFullscreenAdImpl;
        this.f4804d = str;
        this.f4805e = str2;
        this.f4802b = activity;
        this.f4806f = viewGroup;
        this.g = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4801a) {
            case 0:
                ((MediationServiceImpl) this.f4803c).a((s4) this.f4804d, (h) this.f4805e, (MaxAdapterParametersImpl) this.f4806f, (d5) this.g, (Activity) this.f4802b);
                return;
            case 1:
                ((MaxFullscreenAdImpl) this.f4803c).a((String) this.f4804d, (String) this.f4805e, (Activity) this.f4802b, (ViewGroup) this.f4806f, (androidx.lifecycle.t) this.g);
                return;
            case 2:
                com.applovin.impl.mediation.ads.a.a((String) this.f4803c, (String) this.f4804d, (MaxAdFormat) this.f4805e, (String) this.f4806f, (com.applovin.impl.sdk.k) this.g, (String) this.f4802b);
                return;
            case 3:
                ((h) this.f4805e).a((MaxSignalProvider) this.f4803c, (MaxAdapterSignalCollectionParameters) this.f4806f, (Activity) this.f4802b, (d5) this.g, (s4) this.f4804d);
                return;
            case 4:
                CpuCard cpuCard = (CpuCard) this.f4803c;
                String str = (String) this.f4804d;
                String str2 = (String) this.f4805e;
                String str3 = (String) this.f4806f;
                String str4 = (String) this.g;
                StringBuilder sb2 = (StringBuilder) this.f4802b;
                int i4 = CpuCard.f21169b;
                TextView textView = (TextView) cpuCard.findViewById(R.id.processor);
                int i10 = cpuCard.f21170a;
                textView.setTextColor(i10);
                textView.setText(str);
                TextView textView2 = (TextView) cpuCard.findViewById(R.id.supported_abis);
                textView2.setTextColor(i10);
                textView2.setText(str2);
                TextView textView3 = (TextView) cpuCard.findViewById(R.id.cpu_hardware);
                textView3.setTextColor(i10);
                textView3.setText(str3);
                TextView textView4 = (TextView) cpuCard.findViewById(R.id.cpu_governor);
                textView4.setTextColor(i10);
                textView4.setText(str4);
                TextView textView5 = (TextView) cpuCard.findViewById(R.id.cpu_freq);
                textView5.setTextColor(i10);
                textView5.setText(sb2);
                return;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.f4803c;
                List list = (List) this.f4804d;
                lg.a aVar = (lg.a) this.f4805e;
                CountDownLatch countDownLatch = (CountDownLatch) this.f4806f;
                PackageManager packageManager = (PackageManager) this.g;
                ArrayList arrayList = (ArrayList) this.f4802b;
                while (true) {
                    int andDecrement = atomicInteger.getAndDecrement();
                    if (andDecrement < 0) {
                        return;
                    }
                    yi.d dVar = (yi.d) list.get(andDecrement);
                    String name = dVar.getName();
                    if (!dVar.c() && !TextUtils.isEmpty(name)) {
                        nk.k.b(name);
                        if (!vk.p.w0(name, ".", false) && vk.i.y0(name, ".", false) && !"com.liuzh.deviceinfo".equals(name)) {
                            try {
                                try {
                                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(name, 0);
                                    nk.k.d(applicationInfo, "getApplicationInfo(...)");
                                    String str5 = com.liuzh.deviceinfo.utilities.h.b(dVar.b()) + "/cache";
                                    yi.d dVarH = yi.g.f37630a.h(str5);
                                    long jA = wi.c.a(dVarH);
                                    if (jA > 0) {
                                        aVar.c(null, jA);
                                        synchronized (arrayList) {
                                            CharSequence charSequenceLoadLabel = applicationInfo.loadLabel(packageManager);
                                            nk.k.d(charSequenceLoadLabel, "loadLabel(...)");
                                            arrayList.add(new kg.b(str5, applicationInfo, charSequenceLoadLabel, jA, dVarH));
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                } catch (Exception e2) {
                                    wd.b.B(e2);
                                }
                            } finally {
                                countDownLatch.countDown();
                            }
                        }
                    }
                    countDownLatch.countDown();
                }
                break;
        }
    }

    public /* synthetic */ j(h hVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, d5 d5Var, s4 s4Var) {
        this.f4801a = 3;
        this.f4805e = hVar;
        this.f4803c = maxSignalProvider;
        this.f4806f = maxAdapterSignalCollectionParameters;
        this.f4802b = activity;
        this.g = d5Var;
        this.f4804d = s4Var;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i4) {
        this.f4801a = i4;
        this.f4803c = obj;
        this.f4804d = obj2;
        this.f4805e = obj3;
        this.f4806f = obj4;
        this.g = obj5;
        this.f4802b = obj6;
    }
}
