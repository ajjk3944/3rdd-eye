package c6;

import G5.f;
import G5.h;
import G5.j;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: OMTracker.kt */
/* renamed from: c6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2070c implements InterfaceC2072e {
    public static final a Companion = new a(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private G5.b adSession;
    private final boolean enabled;
    private boolean started;

    /* compiled from: OMTracker.kt */
    /* renamed from: c6.c$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final long getDESTROY_DELAY_MS() {
            return C2070c.DESTROY_DELAY_MS;
        }

        private a() {
        }

        public static /* synthetic */ void getDESTROY_DELAY_MS$annotations() {
        }
    }

    /* compiled from: OMTracker.kt */
    /* renamed from: c6.c$b */
    public static final class b {
        public final C2070c make(boolean z10) {
            return new C2070c(z10, null);
        }
    }

    public /* synthetic */ C2070c(boolean z10, g gVar) {
        this(z10);
    }

    @Override // c6.InterfaceC2072e
    public void onPageFinished(WebView webView) {
        l.f(webView, "webView");
        if (this.started && this.adSession == null) {
            f fVar = f.DEFINED_BY_JAVASCRIPT;
            h hVar = h.DEFINED_BY_JAVASCRIPT;
            j jVar = j.JAVASCRIPT;
            G5.c cVarA = G5.c.a(fVar, hVar, jVar, jVar);
            if (TextUtils.isEmpty("Vungle")) {
                throw new IllegalArgumentException("Name is null or empty");
            }
            if (TextUtils.isEmpty("7.4.1")) {
                throw new IllegalArgumentException("Version is null or empty");
            }
            G5.l lVarA = G5.b.a(cVarA, new G5.d(new B7.d(5), webView, null, null, G5.e.HTML));
            this.adSession = lVarA;
            lVarA.c(webView);
            G5.b bVar = this.adSession;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public final void start() {
        if (this.enabled && F5.a.f1654a.f1655a) {
            this.started = true;
        }
    }

    public final long stop() {
        long j4;
        G5.b bVar;
        if (!this.started || (bVar = this.adSession) == null) {
            j4 = 0;
        } else {
            if (bVar != null) {
                bVar.b();
            }
            j4 = DESTROY_DELAY_MS;
        }
        this.started = false;
        this.adSession = null;
        return j4;
    }

    private C2070c(boolean z10) {
        this.enabled = z10;
    }
}
