package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.infer.annotation.Nullsafe;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    public class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22335a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HashMap f22336b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22337c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22338d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ HashMap f22339e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22340f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22341g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Method f22342h;
        public final /* synthetic */ Method i;

        public a(ArrayList arrayList, HashMap map, ArrayList arrayList2, ArrayList arrayList3, HashMap map2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
            this.f22335a = arrayList;
            this.f22336b = map;
            this.f22337c = arrayList2;
            this.f22338d = arrayList3;
            this.f22339e = map2;
            this.f22340f = arrayList4;
            this.f22341g = arrayList5;
            this.f22342h = method;
            this.i = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            HashMap map;
            boolean zIsPrimitive = method.getReturnType().isPrimitive();
            HashMap map2 = this.f22336b;
            if (zIsPrimitive) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
                }
                Iterator it = this.f22335a.iterator();
                while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, map2))) {
                }
                Iterator it2 = this.f22337c.iterator();
                while (it2.hasNext()) {
                    if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) && DynamicLoaderFallback.reportError(obj, map2)) {
                        return null;
                    }
                }
                return null;
            }
            if (method.getReturnType().equals(String.class)) {
                return "";
            }
            Object objNewProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
            Iterator it3 = this.f22338d.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                map = this.f22339e;
                if (!zHasNext) {
                    break;
                }
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it3.next())) {
                    DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map.get(obj), (AdListener) objArr[0]);
                    break;
                }
            }
            Iterator it4 = this.f22340f.iterator();
            while (it4.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it4.next())) {
                    map.put(objNewProxyInstance, obj);
                }
            }
            Iterator it5 = this.f22341g.iterator();
            while (it5.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it5.next())) {
                    for (Object obj2 : objArr) {
                        if (obj2 instanceof Ad) {
                            map2.put(objNewProxyInstance, (Ad) obj2);
                        }
                    }
                }
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.f22342h)) {
                map2.put(objArr[1], (Ad) objArr[0]);
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.i)) {
                map2.put(objArr[1], (Ad) objArr[0]);
            }
            return objNewProxyInstance;
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdListener f22343b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ad f22344c;

        public b(AdListener adListener, Ad ad) {
            this.f22343b = adListener;
            this.f22344c = ad;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22343b.onError(this.f22344c, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public Method f22345a;

        /* renamed from: b, reason: collision with root package name */
        public final a f22346b = new a();

        public class a implements InvocationHandler {
            public a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                c.this.f22345a = method;
                return null;
            }
        }

        public final <T> T a(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f22346b));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        c cVar = new c();
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(cVar.f22345a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(cVar.f22345a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.f22345a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.f22345a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = cVar.f22345a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = cVar.f22345a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.f22345a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(cVar.f22345a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(cVar.f22345a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.f22345a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(cVar.f22345a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.f22345a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.f22345a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(cVar.f22345a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.f22345a);
        AdViewApi adViewApi = (AdViewApi) cVar.a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.f22345a);
        adViewApi.loadAd(null);
        arrayList2.add(cVar.f22345a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.f22345a);
        ((AdView.AdViewLoadConfigBuilder) cVar.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.f22345a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.f22345a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.f22345a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.f22345a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, map, arrayList2, arrayList3, map2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad), 500L);
        return true;
    }
}
