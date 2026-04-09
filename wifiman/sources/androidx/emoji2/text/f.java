package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C7011b;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public class f {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f30980o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f30981p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static volatile f f30982q;

    /* renamed from: b, reason: collision with root package name */
    private final Set f30984b;

    /* renamed from: e, reason: collision with root package name */
    private final b f30987e;

    /* renamed from: f, reason: collision with root package name */
    final h f30988f;

    /* renamed from: g, reason: collision with root package name */
    private final j f30989g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f30990h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f30991i;

    /* renamed from: j, reason: collision with root package name */
    final int[] f30992j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f30993k;

    /* renamed from: l, reason: collision with root package name */
    private final int f30994l;

    /* renamed from: m, reason: collision with root package name */
    private final int f30995m;

    /* renamed from: n, reason: collision with root package name */
    private final e f30996n;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f30983a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f30985c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f30986d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f30997b;

        /* renamed from: c, reason: collision with root package name */
        private volatile n f30998c;

        /* renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C1099a extends i {
            C1099a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th2) {
                a.this.f31000a.p(th2);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.f(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        int a(CharSequence charSequence, int i10) {
            return this.f30997b.b(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.b
        int b(CharSequence charSequence, int i10) {
            return this.f30997b.c(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.b
        void c() {
            try {
                this.f31000a.f30988f.a(new C1099a());
            } catch (Throwable th2) {
                this.f31000a.p(th2);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f30997b.j(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.b
        void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f30998c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f31000a.f30990h);
        }

        void f(n nVar) {
            if (nVar == null) {
                this.f31000a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f30998c = nVar;
            n nVar2 = this.f30998c;
            j jVar = this.f31000a.f30989g;
            e eVar = this.f31000a.f30996n;
            f fVar = this.f31000a;
            this.f30997b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f30991i, fVar.f30992j, androidx.emoji2.text.h.a());
            this.f31000a.q();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final f f31000a;

        b(f fVar) {
            this.f31000a = fVar;
        }

        abstract int a(CharSequence charSequence, int i10);

        abstract int b(CharSequence charSequence, int i10);

        abstract void c();

        abstract CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        abstract void e(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final h f31001a;

        /* renamed from: b, reason: collision with root package name */
        j f31002b;

        /* renamed from: c, reason: collision with root package name */
        boolean f31003c;

        /* renamed from: d, reason: collision with root package name */
        boolean f31004d;

        /* renamed from: e, reason: collision with root package name */
        int[] f31005e;

        /* renamed from: f, reason: collision with root package name */
        Set f31006f;

        /* renamed from: g, reason: collision with root package name */
        boolean f31007g;

        /* renamed from: h, reason: collision with root package name */
        int f31008h = -16711936;

        /* renamed from: i, reason: collision with root package name */
        int f31009i = 0;

        /* renamed from: j, reason: collision with root package name */
        e f31010j = new androidx.emoji2.text.e();

        protected c(h hVar) {
            E1.h.h(hVar, "metadataLoader cannot be null.");
            this.f31001a = hVar;
        }

        protected final h a() {
            return this.f31001a;
        }

        public c b(int i10) {
            this.f31009i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC1100f {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List f31011a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f31012b;

        /* renamed from: c, reason: collision with root package name */
        private final int f31013c;

        g(AbstractC1100f abstractC1100f, int i10) {
            this(Arrays.asList((AbstractC1100f) E1.h.h(abstractC1100f, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f31011a.size();
            int i10 = 0;
            if (this.f31013c != 1) {
                while (i10 < size) {
                    ((AbstractC1100f) this.f31011a.get(i10)).a(this.f31012b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((AbstractC1100f) this.f31011a.get(i10)).b();
                    i10++;
                }
            }
        }

        g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection collection, int i10, Throwable th2) {
            E1.h.h(collection, "initCallbacks cannot be null");
            this.f31011a = new ArrayList(collection);
            this.f31013c = i10;
            this.f31012b = th2;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(n nVar);
    }

    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    private f(c cVar) {
        this.f30990h = cVar.f31003c;
        this.f30991i = cVar.f31004d;
        this.f30992j = cVar.f31005e;
        this.f30993k = cVar.f31007g;
        this.f30994l = cVar.f31008h;
        this.f30988f = cVar.f31001a;
        this.f30995m = cVar.f31009i;
        this.f30996n = cVar.f31010j;
        C7011b c7011b = new C7011b();
        this.f30984b = c7011b;
        j jVar = cVar.f31002b;
        this.f30989g = jVar == null ? new d() : jVar;
        Set set = cVar.f31006f;
        if (set != null && !set.isEmpty()) {
            c7011b.addAll(cVar.f31006f);
        }
        this.f30987e = new a(this);
        o();
    }

    public static f c() {
        f fVar;
        synchronized (f30980o) {
            fVar = f30982q;
            E1.h.i(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.i.d(inputConnection, editable, i10, i11, z10);
    }

    public static boolean i(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.e(editable, i10, keyEvent);
    }

    public static f j(c cVar) {
        f fVar = f30982q;
        if (fVar == null) {
            synchronized (f30980o) {
                try {
                    fVar = f30982q;
                    if (fVar == null) {
                        fVar = new f(cVar);
                        f30982q = fVar;
                    }
                } finally {
                }
            }
        }
        return fVar;
    }

    public static boolean k() {
        return f30982q != null;
    }

    private boolean m() {
        return g() == 1;
    }

    private void o() {
        this.f30983a.writeLock().lock();
        try {
            if (this.f30995m == 0) {
                this.f30985c = 0;
            }
            this.f30983a.writeLock().unlock();
            if (g() == 0) {
                this.f30987e.c();
            }
        } catch (Throwable th2) {
            this.f30983a.writeLock().unlock();
            throw th2;
        }
    }

    public int d(CharSequence charSequence, int i10) {
        return this.f30987e.a(charSequence, i10);
    }

    public int e() {
        return this.f30994l;
    }

    public int f(CharSequence charSequence, int i10) {
        return this.f30987e.b(charSequence, i10);
    }

    public int g() {
        this.f30983a.readLock().lock();
        try {
            return this.f30985c;
        } finally {
            this.f30983a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f30993k;
    }

    public void n() {
        E1.h.i(this.f30995m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.f30983a.writeLock().lock();
        try {
            if (this.f30985c == 0) {
                return;
            }
            this.f30985c = 0;
            this.f30983a.writeLock().unlock();
            this.f30987e.c();
        } finally {
            this.f30983a.writeLock().unlock();
        }
    }

    void p(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f30983a.writeLock().lock();
        try {
            this.f30985c = 2;
            arrayList.addAll(this.f30984b);
            this.f30984b.clear();
            this.f30983a.writeLock().unlock();
            this.f30986d.post(new g(arrayList, this.f30985c, th2));
        } catch (Throwable th3) {
            this.f30983a.writeLock().unlock();
            throw th3;
        }
    }

    void q() {
        ArrayList arrayList = new ArrayList();
        this.f30983a.writeLock().lock();
        try {
            this.f30985c = 1;
            arrayList.addAll(this.f30984b);
            this.f30984b.clear();
            this.f30983a.writeLock().unlock();
            this.f30986d.post(new g(arrayList, this.f30985c));
        } catch (Throwable th2) {
            this.f30983a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11) {
        return t(charSequence, i10, i11, MPv3.MAX_MESSAGE_ID);
    }

    public CharSequence t(CharSequence charSequence, int i10, int i11, int i12) {
        return u(charSequence, i10, i11, i12, 0);
    }

    public CharSequence u(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        E1.h.i(m(), "Not initialized yet");
        E1.h.e(i10, "start cannot be negative");
        E1.h.e(i11, "end cannot be negative");
        E1.h.e(i12, "maxEmojiCount cannot be negative");
        E1.h.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        E1.h.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        E1.h.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f30990h : false;
        } else {
            z10 = true;
        }
        return this.f30987e.d(charSequence, i10, i11, i12, z10);
    }

    public void v(AbstractC1100f abstractC1100f) {
        E1.h.h(abstractC1100f, "initCallback cannot be null");
        this.f30983a.writeLock().lock();
        try {
            if (this.f30985c == 1 || this.f30985c == 2) {
                this.f30986d.post(new g(abstractC1100f, this.f30985c));
            } else {
                this.f30984b.add(abstractC1100f);
            }
            this.f30983a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f30983a.writeLock().unlock();
            throw th2;
        }
    }

    public void w(AbstractC1100f abstractC1100f) {
        E1.h.h(abstractC1100f, "initCallback cannot be null");
        this.f30983a.writeLock().lock();
        try {
            this.f30984b.remove(abstractC1100f);
        } finally {
            this.f30983a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (!m() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f30987e.e(editorInfo);
    }
}
