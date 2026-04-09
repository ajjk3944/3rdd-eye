package b5;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f4597a;

    /* renamed from: b, reason: collision with root package name */
    public final b5.b f4598b;

    /* renamed from: c, reason: collision with root package name */
    public final View f4599c;

    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f4600a;

        public b() {
        }

        @Override // b5.c.d
        @DoNotInline
        public void a(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f4600a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f4600a);
            this.f4600a = null;
        }

        @Override // b5.c.d
        @DoNotInline
        public void b(@NonNull b5.b bVar, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f4600a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(bVar);
                this.f4600a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        public OnBackInvokedCallback c(final b5.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: b5.e
                public final void onBackInvoked() {
                    bVar.d();
                }
            };
        }

        public boolean d() {
            return this.f4600a != null;
        }
    }

    /* renamed from: b5.c$c, reason: collision with other inner class name */
    public static class C0058c extends b {

        /* renamed from: b5.c$c$a */
        public class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b5.b f4601a;

            public a(b5.b bVar) {
                this.f4601a = bVar;
            }

            public void onBackCancelled() {
                if (C0058c.this.d()) {
                    this.f4601a.a();
                }
            }

            public void onBackInvoked() {
                this.f4601a.d();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C0058c.this.d()) {
                    this.f4601a.c(new BackEventCompat(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C0058c.this.d()) {
                    this.f4601a.b(new BackEventCompat(backEvent));
                }
            }
        }

        public C0058c() {
            super();
        }

        @Override // b5.c.b
        public OnBackInvokedCallback c(b5.b bVar) {
            return new a(bVar);
        }
    }

    public interface d {
        void a(View view);

        void b(b5.b bVar, View view, boolean z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(View view) {
        this((b5.b) view, view);
    }

    public static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0058c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    public boolean b() {
        return this.f4597a != null;
    }

    public void c() {
        d(false);
    }

    public final void d(boolean z10) {
        d dVar = this.f4597a;
        if (dVar != null) {
            dVar.b(this.f4598b, this.f4599c, z10);
        }
    }

    public void e() {
        d(true);
    }

    public void f() {
        d dVar = this.f4597a;
        if (dVar != null) {
            dVar.a(this.f4599c);
        }
    }

    public c(b5.b bVar, View view) {
        this.f4597a = a();
        this.f4598b = bVar;
        this.f4599c = view;
    }
}
