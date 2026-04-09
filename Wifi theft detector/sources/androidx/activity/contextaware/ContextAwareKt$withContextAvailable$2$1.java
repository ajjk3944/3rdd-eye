package androidx.activity.contextaware;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l9.l;
import y8.s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Ly8/s;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$1\n*L\n1#1,94:1\n*E\n"})
/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$1 extends Lambda implements l {
    final /* synthetic */ c $listener;
    final /* synthetic */ a $this_withContextAvailable;

    @Override // l9.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return s.f25199a;
    }

    public final void invoke(Throwable th) {
        this.$this_withContextAvailable.removeOnContextAvailableListener(null);
    }
}
