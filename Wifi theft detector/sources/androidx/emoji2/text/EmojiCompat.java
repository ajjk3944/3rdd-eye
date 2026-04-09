package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class EmojiCompat {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f2972o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f2973p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static volatile EmojiCompat f2974q;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2976b;

    /* renamed from: e, reason: collision with root package name */
    public final b f2979e;

    /* renamed from: f, reason: collision with root package name */
    public final h f2980f;

    /* renamed from: g, reason: collision with root package name */
    public final j f2981g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2982h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2983i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2984j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2985k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2986l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2987m;

    /* renamed from: n, reason: collision with root package name */
    public final e f2988n;

    /* renamed from: a, reason: collision with root package name */
    public final ReadWriteLock f2975a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2977c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2978d = new Handler(Looper.getMainLooper());

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface CodepointSequenceMatchResult {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface LoadStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ReplaceStrategy {
    }

    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.h f2989b;

        /* renamed from: c, reason: collision with root package name */
        public volatile m f2990c;

        /* renamed from: androidx.emoji2.text.EmojiCompat$a$a, reason: collision with other inner class name */
        public class C0027a extends i {
            public C0027a() {
            }

            @Override // androidx.emoji2.text.EmojiCompat.i
            public void a(Throwable th) {
                a.this.f2992a.n(th);
            }

            @Override // androidx.emoji2.text.EmojiCompat.i
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        public a(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.b
        public void a() {
            try {
                this.f2992a.f2980f.a(new C0027a());
            } catch (Throwable th) {
                this.f2992a.n(th);
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.b
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f2989b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.EmojiCompat.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2990c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2992a.f2982h);
        }

        public void d(m mVar) {
            if (mVar == null) {
                this.f2992a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2990c = mVar;
            m mVar2 = this.f2990c;
            j jVar = this.f2992a.f2981g;
            e eVar = this.f2992a.f2988n;
            EmojiCompat emojiCompat = this.f2992a;
            this.f2989b = new androidx.emoji2.text.h(mVar2, jVar, eVar, emojiCompat.f2983i, emojiCompat.f2984j, androidx.emoji2.text.g.a());
            this.f2992a.o();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final EmojiCompat f2992a;

        public b(EmojiCompat emojiCompat) {
            this.f2992a = emojiCompat;
        }

        public abstract void a();

        public abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        public abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final h f2993a;

        /* renamed from: b, reason: collision with root package name */
        public j f2994b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2995c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2996d;

        /* renamed from: e, reason: collision with root package name */
        public int[] f2997e;

        /* renamed from: f, reason: collision with root package name */
        public Set f2998f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f2999g;

        /* renamed from: h, reason: collision with root package name */
        public int f3000h = -16711936;

        /* renamed from: i, reason: collision with root package name */
        public int f3001i = 0;

        /* renamed from: j, reason: collision with root package name */
        public e f3002j = new androidx.emoji2.text.e();

        public c(h hVar) {
            r0.i.h(hVar, "metadataLoader cannot be null.");
            this.f2993a = hVar;
        }

        public final h a() {
            return this.f2993a;
        }

        public c b(int i10) {
            this.f3001i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.EmojiCompat.j
        public androidx.emoji2.text.i a(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new o(typefaceEmojiRasterizer);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    public static abstract class f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    public static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final List f3003a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f3004b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3005c;

        public g(f fVar, int i10) {
            this(Arrays.asList((f) r0.i.h(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3003a.size();
            int i10 = 0;
            if (this.f3005c != 1) {
                while (i10 < size) {
                    ((f) this.f3003a.get(i10)).a(this.f3004b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) this.f3003a.get(i10)).b();
                    i10++;
                }
            }
        }

        public g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        public g(Collection collection, int i10, Throwable th) {
            r0.i.h(collection, "initCallbacks cannot be null");
            this.f3003a = new ArrayList(collection);
            this.f3005c = i10;
            this.f3004b = th;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    public interface j {
        androidx.emoji2.text.i a(TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    public EmojiCompat(c cVar) {
        this.f2982h = cVar.f2995c;
        this.f2983i = cVar.f2996d;
        this.f2984j = cVar.f2997e;
        this.f2985k = cVar.f2999g;
        this.f2986l = cVar.f3000h;
        this.f2980f = cVar.f2993a;
        this.f2987m = cVar.f3001i;
        this.f2988n = cVar.f3002j;
        r.b bVar = new r.b();
        this.f2976b = bVar;
        j jVar = cVar.f2994b;
        this.f2981g = jVar == null ? new d() : jVar;
        Set set = cVar.f2998f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2998f);
        }
        this.f2979e = new a(this);
        m();
    }

    public static EmojiCompat c() {
        EmojiCompat emojiCompat;
        synchronized (f2972o) {
            emojiCompat = f2974q;
            r0.i.i(emojiCompat != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return emojiCompat;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.h.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.c(editable, i10, keyEvent);
    }

    public static EmojiCompat h(c cVar) {
        EmojiCompat emojiCompat;
        EmojiCompat emojiCompat2 = f2974q;
        if (emojiCompat2 != null) {
            return emojiCompat2;
        }
        synchronized (f2972o) {
            try {
                emojiCompat = f2974q;
                if (emojiCompat == null) {
                    emojiCompat = new EmojiCompat(cVar);
                    f2974q = emojiCompat;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return emojiCompat;
    }

    public static boolean i() {
        return f2974q != null;
    }

    public int d() {
        return this.f2986l;
    }

    public int e() {
        this.f2975a.readLock().lock();
        try {
            return this.f2977c;
        } finally {
            this.f2975a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f2985k;
    }

    public final boolean k() {
        return e() == 1;
    }

    public void l() {
        r0.i.i(this.f2987m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f2975a.writeLock().lock();
        try {
            if (this.f2977c == 0) {
                return;
            }
            this.f2977c = 0;
            this.f2975a.writeLock().unlock();
            this.f2979e.a();
        } finally {
            this.f2975a.writeLock().unlock();
        }
    }

    public final void m() {
        this.f2975a.writeLock().lock();
        try {
            if (this.f2987m == 0) {
                this.f2977c = 0;
            }
            this.f2975a.writeLock().unlock();
            if (e() == 0) {
                this.f2979e.a();
            }
        } catch (Throwable th) {
            this.f2975a.writeLock().unlock();
            throw th;
        }
    }

    public void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2975a.writeLock().lock();
        try {
            this.f2977c = 2;
            arrayList.addAll(this.f2976b);
            this.f2976b.clear();
            this.f2975a.writeLock().unlock();
            this.f2978d.post(new g(arrayList, this.f2977c, th));
        } catch (Throwable th2) {
            this.f2975a.writeLock().unlock();
            throw th2;
        }
    }

    public void o() {
        ArrayList arrayList = new ArrayList();
        this.f2975a.writeLock().lock();
        try {
            this.f2977c = 1;
            arrayList.addAll(this.f2976b);
            this.f2976b.clear();
            this.f2975a.writeLock().unlock();
            this.f2978d.post(new g(arrayList, this.f2977c));
        } catch (Throwable th) {
            this.f2975a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        r0.i.i(k(), "Not initialized yet");
        r0.i.e(i10, "start cannot be negative");
        r0.i.e(i11, "end cannot be negative");
        r0.i.e(i12, "maxEmojiCount cannot be negative");
        r0.i.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        r0.i.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        r0.i.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f2982h : false;
        } else {
            z10 = true;
        }
        return this.f2979e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(f fVar) {
        r0.i.h(fVar, "initCallback cannot be null");
        this.f2975a.writeLock().lock();
        try {
            if (this.f2977c == 1 || this.f2977c == 2) {
                this.f2978d.post(new g(fVar, this.f2977c));
            } else {
                this.f2976b.add(fVar);
            }
            this.f2975a.writeLock().unlock();
        } catch (Throwable th) {
            this.f2975a.writeLock().unlock();
            throw th;
        }
    }

    public void u(f fVar) {
        r0.i.h(fVar, "initCallback cannot be null");
        this.f2975a.writeLock().lock();
        try {
            this.f2976b.remove(fVar);
        } finally {
            this.f2975a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f2979e.c(editorInfo);
    }
}
