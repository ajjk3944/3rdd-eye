package B1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f1077a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1078b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1079c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1080d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1081e;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f1077a = (Uri) E1.h.g(uri);
            this.f1078b = i10;
            this.f1079c = i11;
            this.f1080d = z10;
            this.f1081e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f1081e;
        }

        public int c() {
            return this.f1078b;
        }

        public Uri d() {
            return this.f1077a;
        }

        public int e() {
            return this.f1079c;
        }

        public boolean f() {
            return this.f1080d;
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return w1.l.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, w1.k.a(new Object[]{eVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        B1.a aVar = new B1.a(cVar, l.b(handler));
        if (!z10) {
            return i.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return i.e(context, (e) list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f1075a;

        /* renamed from: b, reason: collision with root package name */
        private final List f1076b;

        public a(int i10, b[] bVarArr) {
            this.f1075a = i10;
            this.f1076b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f1076b.get(0);
        }

        public List d() {
            return this.f1076b;
        }

        public int e() {
            return this.f1075a;
        }

        boolean f() {
            return this.f1076b.size() > 1;
        }

        a(int i10, List list) {
            this.f1075a = i10;
            this.f1076b = list;
        }
    }
}
