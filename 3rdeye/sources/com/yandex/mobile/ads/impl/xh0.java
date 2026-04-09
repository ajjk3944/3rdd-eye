package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xh0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35306a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f35307a;

        public final a a(String str) {
            return this;
        }

        public final a b(String str) {
            pd2.a(str);
            return this;
        }

        public final a c(String str) {
            pd2.b(str);
            return this;
        }

        public final a d(String str) {
            b bVar;
            b[] bVarArrValues = b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i];
                if (kotlin.jvm.internal.l.b(bVar.a(), str)) {
                    break;
                }
                i++;
            }
            if (bVar == null) {
                bVar = b.f35308c;
            }
            if (bVar == b.f35308c) {
                pd2.b(str);
            }
            return this;
        }

        public final a e(String str) {
            pd2.a(str);
            return this;
        }

        public final a f(String str) {
            this.f35307a = str;
            return this;
        }

        public final a g(String str) {
            c[] cVarArrValues = c.values();
            int length = cVarArrValues.length;
            for (int i = 0; i < length && !kotlin.jvm.internal.l.b(cVarArrValues[i].a(), str); i++) {
            }
            return this;
        }

        public final a i(String str) {
            d dVar;
            d[] dVarArrValues = d.values();
            int length = dVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrValues[i];
                if (kotlin.jvm.internal.l.b(dVar.a(), str)) {
                    break;
                }
                i++;
            }
            if (dVar == null) {
                dVar = d.f35314c;
            }
            if (dVar == d.f35314c) {
                pd2.b(str);
            }
            return this;
        }

        public final a j(String str) {
            pd2.b(str);
            return this;
        }

        public final xh0 a() {
            return new xh0(this.f35307a, 0);
        }

        public final void h(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f35308c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f35309d;

        /* renamed from: b, reason: collision with root package name */
        private final String f35310b;

        static {
            b bVar = new b(0, "ICON_HORIZONTAL_POSITION_LEFT", "left");
            b bVar2 = new b(1, "ICON_HORIZONTAL_POSITION_RIGHT", "right");
            b bVar3 = new b(2, "ICON_HORIZONTAL_POSITION_LEFT_OFFSET", "leftOffset");
            f35308c = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f35309d = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
        }

        private b(int i, String str, String str2) {
            this.f35310b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f35309d.clone();
        }

        public final String a() {
            return this.f35310b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f35311c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f35312d;

        /* renamed from: b, reason: collision with root package name */
        private final String f35313b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(int i) {
                this();
            }
        }

        static {
            c[] cVarArr = {new c(0, "STATIC_RESOURCE", "StaticResource"), new c(1, "IFRAME_RESOURCE", "IFrameResource"), new c(2, "HTML_RESOURCE", "HTMLResource")};
            f35312d = cVarArr;
            com.google.gson.internal.c.l(cVarArr);
            f35311c = new a(0);
        }

        private c(int i, String str, String str2) {
            this.f35313b = str2;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f35312d.clone();
        }

        public final String a() {
            return this.f35313b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        public static final d f35314c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ d[] f35315d;

        /* renamed from: b, reason: collision with root package name */
        private final String f35316b;

        static {
            d dVar = new d(0, "ICON_VERTICAL_POSITION_TOP", "top");
            d dVar2 = new d(1, "ICON_VERTICAL_POSITION_BOTTOM", "bottom");
            d dVar3 = new d(2, "ICON_VERTICAL_POSITION_TOP_OFFSET", "topOffset");
            f35314c = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
            f35315d = dVarArr;
            com.google.gson.internal.c.l(dVarArr);
        }

        private d(int i, String str, String str2) {
            this.f35316b = str2;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f35315d.clone();
        }

        public final String a() {
            return this.f35316b;
        }
    }

    private xh0(String str) {
        this.f35306a = str;
    }

    public final String a() {
        return this.f35306a;
    }

    public /* synthetic */ xh0(String str, int i) {
        this(str);
    }
}
