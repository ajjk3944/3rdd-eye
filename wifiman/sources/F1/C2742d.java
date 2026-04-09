package F1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: F1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2742d {

    /* renamed from: a, reason: collision with root package name */
    private final f f5706a;

    /* renamed from: F1.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f5707a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f5707a = new b(clipData, i10);
            } else {
                this.f5707a = new C0236d(clipData, i10);
            }
        }

        public C2742d a() {
            return this.f5707a.a();
        }

        public a b(Bundle bundle) {
            this.f5707a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f5707a.c(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f5707a.b(uri);
            return this;
        }
    }

    /* renamed from: F1.d$b */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f5708a;

        b(ClipData clipData, int i10) {
            this.f5708a = AbstractC2752i.a(clipData, i10);
        }

        @Override // F1.C2742d.c
        public C2742d a() {
            return new C2742d(new e(this.f5708a.build()));
        }

        @Override // F1.C2742d.c
        public void b(Uri uri) {
            this.f5708a.setLinkUri(uri);
        }

        @Override // F1.C2742d.c
        public void c(int i10) {
            this.f5708a.setFlags(i10);
        }

        @Override // F1.C2742d.c
        public void setExtras(Bundle bundle) {
            this.f5708a.setExtras(bundle);
        }
    }

    /* renamed from: F1.d$c */
    private interface c {
        C2742d a();

        void b(Uri uri);

        void c(int i10);

        void setExtras(Bundle bundle);
    }

    /* renamed from: F1.d$d, reason: collision with other inner class name */
    private static final class C0236d implements c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f5709a;

        /* renamed from: b, reason: collision with root package name */
        int f5710b;

        /* renamed from: c, reason: collision with root package name */
        int f5711c;

        /* renamed from: d, reason: collision with root package name */
        Uri f5712d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f5713e;

        C0236d(ClipData clipData, int i10) {
            this.f5709a = clipData;
            this.f5710b = i10;
        }

        @Override // F1.C2742d.c
        public C2742d a() {
            return new C2742d(new g(this));
        }

        @Override // F1.C2742d.c
        public void b(Uri uri) {
            this.f5712d = uri;
        }

        @Override // F1.C2742d.c
        public void c(int i10) {
            this.f5711c = i10;
        }

        @Override // F1.C2742d.c
        public void setExtras(Bundle bundle) {
            this.f5713e = bundle;
        }
    }

    /* renamed from: F1.d$e */
    private static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f5714a;

        e(ContentInfo contentInfo) {
            this.f5714a = AbstractC2740c.a(E1.h.g(contentInfo));
        }

        @Override // F1.C2742d.f
        public ClipData a() {
            return this.f5714a.getClip();
        }

        @Override // F1.C2742d.f
        public int b() {
            return this.f5714a.getFlags();
        }

        @Override // F1.C2742d.f
        public ContentInfo c() {
            return this.f5714a;
        }

        @Override // F1.C2742d.f
        public int j() {
            return this.f5714a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f5714a + "}";
        }
    }

    /* renamed from: F1.d$f */
    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int j();
    }

    /* renamed from: F1.d$g */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f5715a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5716b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5717c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f5718d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f5719e;

        g(C0236d c0236d) {
            this.f5715a = (ClipData) E1.h.g(c0236d.f5709a);
            this.f5716b = E1.h.c(c0236d.f5710b, 0, 5, "source");
            this.f5717c = E1.h.f(c0236d.f5711c, 1);
            this.f5718d = c0236d.f5712d;
            this.f5719e = c0236d.f5713e;
        }

        @Override // F1.C2742d.f
        public ClipData a() {
            return this.f5715a;
        }

        @Override // F1.C2742d.f
        public int b() {
            return this.f5717c;
        }

        @Override // F1.C2742d.f
        public ContentInfo c() {
            return null;
        }

        @Override // F1.C2742d.f
        public int j() {
            return this.f5716b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f5715a.getDescription());
            sb2.append(", source=");
            sb2.append(C2742d.e(this.f5716b));
            sb2.append(", flags=");
            sb2.append(C2742d.a(this.f5717c));
            if (this.f5718d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f5718d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f5719e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    C2742d(f fVar) {
        this.f5706a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C2742d g(ContentInfo contentInfo) {
        return new C2742d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f5706a.a();
    }

    public int c() {
        return this.f5706a.b();
    }

    public int d() {
        return this.f5706a.j();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.f5706a.c();
        Objects.requireNonNull(contentInfoC);
        return AbstractC2740c.a(contentInfoC);
    }

    public String toString() {
        return this.f5706a.toString();
    }
}
