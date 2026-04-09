package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class dg {

    /* renamed from: a, reason: collision with root package name */
    private final h71 f26160a;

    /* renamed from: b, reason: collision with root package name */
    private final cg f26161b;

    /* renamed from: c, reason: collision with root package name */
    private final List<ag<?>> f26162c;

    /* JADX WARN: Multi-variable type inference failed */
    public dg(h71 nativeAdWeakViewProvider, cg assetAdapterCreator, List<? extends ag<?>> assets) {
        kotlin.jvm.internal.l.f(nativeAdWeakViewProvider, "nativeAdWeakViewProvider");
        kotlin.jvm.internal.l.f(assetAdapterCreator, "assetAdapterCreator");
        kotlin.jvm.internal.l.f(assets, "assets");
        this.f26160a = nativeAdWeakViewProvider;
        this.f26161b = assetAdapterCreator;
        this.f26162c = assets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HashMap a() {
        HashMap map = new HashMap();
        cg cgVar = this.f26161b;
        View viewA = this.f26160a.a("close_button");
        TextView textView = viewA instanceof TextView ? (TextView) viewA : null;
        cgVar.getClass();
        pp ppVar = textView != null ? new pp(textView) : null;
        map.put("close_button", ppVar != null ? new az(ppVar) : null);
        cg cgVar2 = this.f26161b;
        View viewA2 = this.f26160a.a("feedback");
        map.put("feedback", cgVar2.a(viewA2 instanceof ImageView ? (ImageView) viewA2 : null));
        cg cgVar3 = this.f26161b;
        ImageView imageViewC = this.f26160a.c();
        View viewA3 = this.f26160a.a("media");
        map.put("media", cgVar3.a(imageViewC, viewA3 instanceof CustomizableMediaView ? (CustomizableMediaView) viewA3 : null));
        map.put("rating", this.f26161b.a(this.f26160a.a("rating")));
        cg cgVar4 = this.f26161b;
        View viewE = this.f26160a.e();
        cgVar4.getClass();
        ns1 ns1Var = viewE != null ? new ns1(viewE) : null;
        map.put("root_container", ns1Var != null ? new az(ns1Var) : null);
        List<b9.l<String, gv>> listB = this.f26160a.b();
        if (listB != null) {
            Iterator<T> it = listB.iterator();
            if (it.hasNext()) {
                b9.l lVar = (b9.l) it.next();
                gv customAsset = (gv) lVar.f18084c;
                this.f26161b.getClass();
                kotlin.jvm.internal.l.f(customAsset, "customAsset");
                gv.a();
                throw null;
            }
        }
        for (ag<?> agVar : this.f26162c) {
            View viewA4 = this.f26160a.a(agVar.b());
            if (viewA4 != null && !map.containsKey(agVar.b())) {
                bg<?> bgVarA = this.f26161b.a(viewA4, agVar.c());
                if (bgVarA == null) {
                    this.f26161b.getClass();
                    bgVarA = new az(new r00(viewA4));
                }
                map.put(agVar.b(), bgVarA);
            }
        }
        for (Map.Entry entry : this.f26160a.a().entrySet()) {
            String str = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null && !map.containsKey(str)) {
                this.f26161b.getClass();
                map.put(str, new az(new r00(view)));
            }
        }
        return map;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dg(h71 nativeAdWeakViewProvider, ej0 imageProvider, ww0 mediaViewAdapterCreator, c91 nativeMediaContent, j81 nativeForcePauseObserver, a8<?> adResponse, vb1 nativeVisualBlock, mp1 reporter, fv customAssetTracker) {
        this(nativeAdWeakViewProvider, new cg(adResponse, imageProvider, mediaViewAdapterCreator, nativeMediaContent, nativeForcePauseObserver, reporter, customAssetTracker), nativeVisualBlock.b());
        kotlin.jvm.internal.l.f(nativeAdWeakViewProvider, "nativeAdWeakViewProvider");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(mediaViewAdapterCreator, "mediaViewAdapterCreator");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeVisualBlock, "nativeVisualBlock");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(customAssetTracker, "customAssetTracker");
    }
}
