package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ContentInfoCompat {

    /* renamed from: a, reason: collision with root package name */
    public final f f2597a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Source {
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c f2598a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f2598a = new b(clipData, i10);
            } else {
                this.f2598a = new d(clipData, i10);
            }
        }

        public ContentInfoCompat a() {
            return this.f2598a.build();
        }

        public a b(Bundle bundle) {
            this.f2598a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f2598a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f2598a.a(uri);
            return this;
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f2599a;

        public b(ClipData clipData, int i10) {
            this.f2599a = androidx.core.view.f.a(clipData, i10);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void a(Uri uri) {
            this.f2599a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void b(int i10) {
            this.f2599a.setFlags(i10);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new e(this.f2599a.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setExtras(Bundle bundle) {
            this.f2599a.setExtras(bundle);
        }
    }

    public interface c {
        void a(Uri uri);

        void b(int i10);

        ContentInfoCompat build();

        void setExtras(Bundle bundle);
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f2600a;

        /* renamed from: b, reason: collision with root package name */
        public int f2601b;

        /* renamed from: c, reason: collision with root package name */
        public int f2602c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f2603d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f2604e;

        public d(ClipData clipData, int i10) {
            this.f2600a = clipData;
            this.f2601b = i10;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void a(Uri uri) {
            this.f2603d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void b(int i10) {
            this.f2602c = i10;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new g(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setExtras(Bundle bundle) {
            this.f2604e = bundle;
        }
    }

    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f2605a;

        public e(ContentInfo contentInfo) {
            this.f2605a = androidx.core.view.c.a(r0.i.g(contentInfo));
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public ContentInfo a() {
            return this.f2605a;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int b() {
            return this.f2605a.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public ClipData c() {
            return this.f2605a.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int d() {
            return this.f2605a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2605a + "}";
        }
    }

    public interface f {
        ContentInfo a();

        int b();

        ClipData c();

        int d();
    }

    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f2606a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2607b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2608c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f2609d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f2610e;

        public g(d dVar) {
            this.f2606a = (ClipData) r0.i.g(dVar.f2600a);
            this.f2607b = r0.i.c(dVar.f2601b, 0, 5, "source");
            this.f2608c = r0.i.f(dVar.f2602c, 1);
            this.f2609d = dVar.f2603d;
            this.f2610e = dVar.f2604e;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int b() {
            return this.f2607b;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public ClipData c() {
            return this.f2606a;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int d() {
            return this.f2608c;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f2606a.getDescription());
            sb.append(", source=");
            sb.append(ContentInfoCompat.e(this.f2607b));
            sb.append(", flags=");
            sb.append(ContentInfoCompat.a(this.f2608c));
            if (this.f2609d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f2609d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f2610e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public ContentInfoCompat(f fVar) {
        this.f2597a = fVar;
    }

    public static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    public static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static ContentInfoCompat g(ContentInfo contentInfo) {
        return new ContentInfoCompat(new e(contentInfo));
    }

    public ClipData b() {
        return this.f2597a.c();
    }

    public int c() {
        return this.f2597a.d();
    }

    public int d() {
        return this.f2597a.b();
    }

    public ContentInfo f() {
        ContentInfo contentInfoA = this.f2597a.a();
        Objects.requireNonNull(contentInfoA);
        return androidx.core.view.c.a(contentInfoA);
    }

    public String toString() {
        return this.f2597a.toString();
    }
}
