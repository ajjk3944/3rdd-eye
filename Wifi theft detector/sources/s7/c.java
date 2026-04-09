package s7;

import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import i6.e;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c implements d {

    @NotNull
    public static final a Companion = new a(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);

    @Nullable
    private i6.b adSession;
    private final boolean enabled;
    private boolean started;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long getDESTROY_DELAY_MS() {
            return c.DESTROY_DELAY_MS;
        }

        private a() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getDESTROY_DELAY_MS$annotations() {
        }
    }

    public static final class b {
        @NotNull
        public final c make(boolean z10) {
            return new c(z10, null);
        }
    }

    public /* synthetic */ c(boolean z10, i iVar) {
        this(z10);
    }

    @Override // s7.d
    public void onPageFinished(@NotNull WebView webView) {
        p.e(webView, "webView");
        if (this.started && this.adSession == null) {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            i6.b bVarA = i6.b.a(i6.c.a(creativeType, impressionType, owner, owner, false), i6.d.a(e.a("Vungle", "7.6.3"), webView, null, null));
            this.adSession = bVarA;
            if (bVarA != null) {
                bVarA.c(webView);
            }
            i6.b bVar = this.adSession;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public final void start() {
        if (this.enabled && h6.a.b()) {
            this.started = true;
        }
    }

    public final long stop() {
        long j10;
        i6.b bVar;
        if (!this.started || (bVar = this.adSession) == null) {
            j10 = 0;
        } else {
            if (bVar != null) {
                bVar.b();
            }
            j10 = DESTROY_DELAY_MS;
        }
        this.started = false;
        this.adSession = null;
        return j10;
    }

    private c(boolean z10) {
        this.enabled = z10;
    }
}
