package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f18696a;

    /* renamed from: b, reason: collision with root package name */
    private String f18697b;

    /* renamed from: c, reason: collision with root package name */
    private int f18698c;

    /* renamed from: d, reason: collision with root package name */
    private float f18699d;

    /* renamed from: e, reason: collision with root package name */
    private float f18700e;

    /* renamed from: f, reason: collision with root package name */
    private int f18701f;

    /* renamed from: g, reason: collision with root package name */
    private int f18702g;

    /* renamed from: h, reason: collision with root package name */
    private View f18703h;

    /* renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f18704i;

    /* renamed from: j, reason: collision with root package name */
    private int f18705j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18706k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f18707l;

    /* renamed from: m, reason: collision with root package name */
    private int f18708m;

    /* renamed from: n, reason: collision with root package name */
    private String f18709n;

    /* renamed from: o, reason: collision with root package name */
    private int f18710o;

    /* renamed from: p, reason: collision with root package name */
    private int f18711p;

    /* renamed from: q, reason: collision with root package name */
    private String f18712q;

    public static class b implements InterfaceC0331c {

        /* renamed from: a, reason: collision with root package name */
        private Context f18713a;

        /* renamed from: b, reason: collision with root package name */
        private String f18714b;

        /* renamed from: c, reason: collision with root package name */
        private int f18715c;

        /* renamed from: d, reason: collision with root package name */
        private float f18716d;

        /* renamed from: e, reason: collision with root package name */
        private float f18717e;

        /* renamed from: f, reason: collision with root package name */
        private int f18718f;

        /* renamed from: g, reason: collision with root package name */
        private int f18719g;

        /* renamed from: h, reason: collision with root package name */
        private View f18720h;

        /* renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f18721i;

        /* renamed from: j, reason: collision with root package name */
        private int f18722j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f18723k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f18724l;

        /* renamed from: m, reason: collision with root package name */
        private int f18725m;

        /* renamed from: n, reason: collision with root package name */
        private String f18726n;

        /* renamed from: o, reason: collision with root package name */
        private int f18727o;

        /* renamed from: p, reason: collision with root package name */
        private int f18728p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f18729q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c fileDirs(List<String> list) {
            this.f18724l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c orientation(int i10) {
            this.f18718f = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c a(Context context) {
            this.f18713a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c b(int i10) {
            this.f18715c = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c c(String str) {
            this.f18714b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c d(int i10) {
            this.f18725m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c e(int i10) {
            this.f18728p = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c f(int i10) {
            this.f18727o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c a(float f10) {
            this.f18717e = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c b(float f10) {
            this.f18716d = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c c(int i10) {
            this.f18719g = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c a(View view) {
            this.f18720h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c b(String str) {
            this.f18729q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c a(List<CampaignEx> list) {
            this.f18721i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c a(int i10) {
            this.f18722j = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c a(boolean z10) {
            this.f18723k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0331c
        public InterfaceC0331c a(String str) {
            this.f18726n = str;
            return this;
        }
    }

    /* renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    public interface InterfaceC0331c {
        InterfaceC0331c a(float f10);

        InterfaceC0331c a(int i10);

        InterfaceC0331c a(Context context);

        InterfaceC0331c a(View view);

        InterfaceC0331c a(String str);

        InterfaceC0331c a(List<CampaignEx> list);

        InterfaceC0331c a(boolean z10);

        InterfaceC0331c b(float f10);

        InterfaceC0331c b(int i10);

        InterfaceC0331c b(String str);

        c build();

        InterfaceC0331c c(int i10);

        InterfaceC0331c c(String str);

        InterfaceC0331c d(int i10);

        InterfaceC0331c e(int i10);

        InterfaceC0331c f(int i10);

        InterfaceC0331c fileDirs(List<String> list);

        InterfaceC0331c orientation(int i10);
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.f18704i;
    }

    public Context c() {
        return this.f18696a;
    }

    public List<String> d() {
        return this.f18707l;
    }

    public int e() {
        return this.f18710o;
    }

    public String f() {
        return this.f18697b;
    }

    public int g() {
        return this.f18698c;
    }

    public int h() {
        return this.f18701f;
    }

    public View i() {
        return this.f18703h;
    }

    public int j() {
        return this.f18702g;
    }

    public float k() {
        return this.f18699d;
    }

    public int l() {
        return this.f18705j;
    }

    public float m() {
        return this.f18700e;
    }

    public String n() {
        return this.f18712q;
    }

    public int o() {
        return this.f18711p;
    }

    public boolean p() {
        return this.f18706k;
    }

    private c(b bVar) {
        this.f18700e = bVar.f18717e;
        this.f18699d = bVar.f18716d;
        this.f18701f = bVar.f18718f;
        this.f18702g = bVar.f18719g;
        this.f18696a = bVar.f18713a;
        this.f18697b = bVar.f18714b;
        this.f18698c = bVar.f18715c;
        this.f18703h = bVar.f18720h;
        this.f18704i = bVar.f18721i;
        this.f18705j = bVar.f18722j;
        this.f18706k = bVar.f18723k;
        this.f18707l = bVar.f18724l;
        this.f18708m = bVar.f18725m;
        this.f18709n = bVar.f18726n;
        this.f18710o = bVar.f18727o;
        this.f18711p = bVar.f18728p;
        this.f18712q = bVar.f18729q;
    }
}
