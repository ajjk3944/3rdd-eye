package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public abstract class vw0 extends ig2<CustomizableMediaView, sw0> {

    /* renamed from: c, reason: collision with root package name */
    private final cx0 f34718c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f34719c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f34720d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f34721e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f34722f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f34723g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ a[] f34724h;

        /* renamed from: b, reason: collision with root package name */
        private final String f34725b;

        static {
            a aVar = new a(0, "WEB_VIEW", "webview");
            f34719c = aVar;
            a aVar2 = new a(1, "VIDEO", "video");
            f34720d = aVar2;
            a aVar3 = new a(2, "MULTIBANNER", "multibanner");
            f34721e = aVar3;
            a aVar4 = new a(3, "IMAGE", "image");
            f34722f = aVar4;
            a aVar5 = new a(4, "MEDIATION", "mediation");
            f34723g = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            f34724h = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str, String str2) {
            this.f34725b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f34724h.clone();
        }

        public final String a() {
            return this.f34725b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(CustomizableMediaView mediaView, cx0 mediaViewRenderController) {
        super(mediaView);
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        this.f34718c = mediaViewRenderController;
    }

    public abstract void a(CustomizableMediaView customizableMediaView);

    @Override // com.yandex.mobile.ads.impl.ig2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(CustomizableMediaView mediaView, sw0 value) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(value, "value");
        this.f34718c.a(mediaView, d());
    }

    public abstract void a(sw0 sw0Var);

    public abstract a d();
}
