package L0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* compiled from: ContentInfoCompat.java */
/* renamed from: L0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773d {

    /* renamed from: a, reason: collision with root package name */
    public final e f3889a;

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: L0.d$a */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f3890a;

        public a(ClipData clipData, int i) {
            this.f3890a = I0.e.j(clipData, i);
        }

        @Override // L0.C0773d.b
        public final void a(Uri uri) {
            this.f3890a.setLinkUri(uri);
        }

        @Override // L0.C0773d.b
        public final void b(int i) {
            this.f3890a.setFlags(i);
        }

        @Override // L0.C0773d.b
        public final C0773d build() {
            return new C0773d(new C0069d(this.f3890a.build()));
        }

        @Override // L0.C0773d.b
        public final void setExtras(Bundle bundle) {
            this.f3890a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: L0.d$b */
    public interface b {
        void a(Uri uri);

        void b(int i);

        C0773d build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: L0.d$c */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f3891a;

        /* renamed from: b, reason: collision with root package name */
        public int f3892b;

        /* renamed from: c, reason: collision with root package name */
        public int f3893c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f3894d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f3895e;

        @Override // L0.C0773d.b
        public final void a(Uri uri) {
            this.f3894d = uri;
        }

        @Override // L0.C0773d.b
        public final void b(int i) {
            this.f3893c = i;
        }

        @Override // L0.C0773d.b
        public final C0773d build() {
            return new C0773d(new f(this));
        }

        @Override // L0.C0773d.b
        public final void setExtras(Bundle bundle) {
            this.f3895e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: L0.d$d, reason: collision with other inner class name */
    public static final class C0069d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f3896a;

        public C0069d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f3896a = I0.f.j(contentInfo);
        }

        @Override // L0.C0773d.e
        public final int a() {
            return this.f3896a.getSource();
        }

        @Override // L0.C0773d.e
        public final ClipData b() {
            return this.f3896a.getClip();
        }

        @Override // L0.C0773d.e
        public final int c() {
            return this.f3896a.getFlags();
        }

        @Override // L0.C0773d.e
        public final ContentInfo d() {
            return this.f3896a;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f3896a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: L0.d$e */
    public interface e {
        int a();

        ClipData b();

        int c();

        ContentInfo d();
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: L0.d$f */
    public static final class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f3897a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3898b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3899c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f3900d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f3901e;

        public f(c cVar) {
            ClipData clipData = cVar.f3891a;
            clipData.getClass();
            this.f3897a = clipData;
            int i = cVar.f3892b;
            A2.l.m(i, 0, 5, AdRevenueConstants.SOURCE_KEY);
            this.f3898b = i;
            int i10 = cVar.f3893c;
            if ((i10 & 1) == i10) {
                this.f3899c = i10;
                this.f3900d = cVar.f3894d;
                this.f3901e = cVar.f3895e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // L0.C0773d.e
        public final int a() {
            return this.f3898b;
        }

        @Override // L0.C0773d.e
        public final ClipData b() {
            return this.f3897a;
        }

        @Override // L0.C0773d.e
        public final int c() {
            return this.f3899c;
        }

        @Override // L0.C0773d.e
        public final ContentInfo d() {
            return null;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f3897a.getDescription());
            sb.append(", source=");
            int i = this.f3898b;
            sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i10 = this.f3899c;
            sb.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
            Uri uri = this.f3900d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return B4.f.c(sb, this.f3901e != null ? ", hasExtras" : "", "}");
        }
    }

    public C0773d(e eVar) {
        this.f3889a = eVar;
    }

    public final String toString() {
        return this.f3889a.toString();
    }
}
