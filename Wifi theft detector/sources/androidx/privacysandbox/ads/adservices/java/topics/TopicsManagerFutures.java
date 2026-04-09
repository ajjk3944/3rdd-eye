package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.b;
import androidx.privacysandbox.ads.adservices.topics.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.k;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.w0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class TopicsManagerFutures {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3575a = new a(null);

    public static final class Api33Ext4JavaImpl extends TopicsManagerFutures {

        /* renamed from: b, reason: collision with root package name */
        public final f f3576b;

        public Api33Ext4JavaImpl(f mTopicsManager) {
            p.e(mTopicsManager, "mTopicsManager");
            this.f3576b = mTopicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
        @DoNotInline
        @NotNull
        public com.google.common.util.concurrent.a b(@NotNull b request) {
            p.e(request, "request");
            return CoroutineAdapterKt.c(k.b(k0.a(w0.c()), null, null, new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, request, null), 3, null), null, 1, null);
        }
    }

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final TopicsManagerFutures a(Context context) {
            p.e(context, "context");
            f fVarA = f.f3586a.a(context);
            if (fVarA != null) {
                return new Api33Ext4JavaImpl(fVarA);
            }
            return null;
        }

        public a() {
        }
    }

    public static final TopicsManagerFutures a(Context context) {
        return f3575a.a(context);
    }

    public abstract com.google.common.util.concurrent.a b(b bVar);
}
