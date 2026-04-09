package v0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f24675a;

    public interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f24675a = new a(uri, clipDescription, uri2);
        } else {
            this.f24675a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f24675a.b();
    }

    public ClipDescription b() {
        return this.f24675a.getDescription();
    }

    public Uri c() {
        return this.f24675a.d();
    }

    public void d() {
        this.f24675a.c();
    }

    public Object e() {
        return this.f24675a.a();
    }

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f24676a;

        public a(Object obj) {
            this.f24676a = (InputContentInfo) obj;
        }

        @Override // v0.f.c
        public Object a() {
            return this.f24676a;
        }

        @Override // v0.f.c
        public Uri b() {
            return this.f24676a.getContentUri();
        }

        @Override // v0.f.c
        public void c() {
            this.f24676a.requestPermission();
        }

        @Override // v0.f.c
        public Uri d() {
            return this.f24676a.getLinkUri();
        }

        @Override // v0.f.c
        public ClipDescription getDescription() {
            return this.f24676a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f24676a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public f(c cVar) {
        this.f24675a = cVar;
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f24677a;

        /* renamed from: b, reason: collision with root package name */
        public final ClipDescription f24678b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f24679c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f24677a = uri;
            this.f24678b = clipDescription;
            this.f24679c = uri2;
        }

        @Override // v0.f.c
        public Object a() {
            return null;
        }

        @Override // v0.f.c
        public Uri b() {
            return this.f24677a;
        }

        @Override // v0.f.c
        public Uri d() {
            return this.f24679c;
        }

        @Override // v0.f.c
        public ClipDescription getDescription() {
            return this.f24678b;
        }

        @Override // v0.f.c
        public void c() {
        }
    }
}
