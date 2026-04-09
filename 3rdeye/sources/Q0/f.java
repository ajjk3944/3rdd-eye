package Q0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f10858a;

    /* compiled from: InputContentInfoCompat.java */
    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f10858a = new a(uri, clipDescription, uri2);
        } else {
            this.f10858a = new b(uri, clipDescription, uri2);
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f10859a;

        public a(Object obj) {
            this.f10859a = (InputContentInfo) obj;
        }

        @Override // Q0.f.c
        public final Uri a() {
            return this.f10859a.getContentUri();
        }

        @Override // Q0.f.c
        public final void b() {
            this.f10859a.requestPermission();
        }

        @Override // Q0.f.c
        public final Uri c() {
            return this.f10859a.getLinkUri();
        }

        @Override // Q0.f.c
        public final Object d() {
            return this.f10859a;
        }

        @Override // Q0.f.c
        public final ClipDescription getDescription() {
            return this.f10859a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10859a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public f(a aVar) {
        this.f10858a = aVar;
    }

    /* compiled from: InputContentInfoCompat.java */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f10860a;

        /* renamed from: b, reason: collision with root package name */
        public final ClipDescription f10861b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f10862c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10860a = uri;
            this.f10861b = clipDescription;
            this.f10862c = uri2;
        }

        @Override // Q0.f.c
        public final Uri a() {
            return this.f10860a;
        }

        @Override // Q0.f.c
        public final Uri c() {
            return this.f10862c;
        }

        @Override // Q0.f.c
        public final Object d() {
            return null;
        }

        @Override // Q0.f.c
        public final ClipDescription getDescription() {
            return this.f10861b;
        }

        @Override // Q0.f.c
        public final void b() {
        }
    }
}
