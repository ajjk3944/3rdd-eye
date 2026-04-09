package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.RestrictTo;
import j0.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o0.g;
import r0.i;

/* loaded from: classes.dex */
public abstract class FontsContractCompat {

    public static class FontRequestCallback {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface FontRequestFailReason {
        }

        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2555a;

        /* renamed from: b, reason: collision with root package name */
        public final b[] f2556b;

        public a(int i10, b[] bVarArr) {
            this.f2555a = i10;
            this.f2556b = bVarArr;
        }

        public static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f2556b;
        }

        public int c() {
            return this.f2555a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f2557a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2558b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2559c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2560d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2561e;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f2557a = (Uri) i.g(uri);
            this.f2558b = i10;
            this.f2559c = i11;
            this.f2560d = z10;
            this.f2561e = i12;
        }

        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f2561e;
        }

        public int c() {
            return this.f2558b;
        }

        public Uri d() {
            return this.f2557a;
        }

        public int e() {
            return this.f2559c;
        }

        public boolean f() {
            return this.f2560d;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, g gVar) {
        return androidx.core.provider.b.e(context, gVar, cancellationSignal);
    }

    public static Typeface c(Context context, g gVar, int i10, boolean z10, int i11, Handler handler, FontRequestCallback fontRequestCallback) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(fontRequestCallback, handler);
        return z10 ? c.e(context, gVar, aVar, i10, i11) : c.d(context, gVar, i10, null, aVar);
    }
}
