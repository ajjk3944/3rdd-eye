package I1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final b f8449a;

    private static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f8450a;

        a(Object obj) {
            this.f8450a = (InputContentInfo) obj;
        }

        @Override // I1.d.b
        public ClipDescription a() {
            return this.f8450a.getDescription();
        }

        @Override // I1.d.b
        public Uri b() {
            return this.f8450a.getContentUri();
        }

        @Override // I1.d.b
        public void c() {
            this.f8450a.requestPermission();
        }

        @Override // I1.d.b
        public Uri d() {
            return this.f8450a.getLinkUri();
        }

        @Override // I1.d.b
        public Object e() {
            return this.f8450a;
        }
    }

    private interface b {
        ClipDescription a();

        Uri b();

        void c();

        Uri d();

        Object e();
    }

    private d(b bVar) {
        this.f8449a = bVar;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f8449a.b();
    }

    public ClipDescription b() {
        return this.f8449a.a();
    }

    public Uri c() {
        return this.f8449a.d();
    }

    public void d() {
        this.f8449a.c();
    }

    public Object e() {
        return this.f8449a.e();
    }
}
