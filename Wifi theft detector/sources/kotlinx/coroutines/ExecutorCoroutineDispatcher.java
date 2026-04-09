package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.d;

/* loaded from: classes4.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final Key f22212b = new Key(null);

    public static final class Key extends kotlin.coroutines.b {
        public /* synthetic */ Key(kotlin.jvm.internal.i iVar) {
            this();
        }

        public Key() {
            super(CoroutineDispatcher.f22203a, new l9.l() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher.Key.1
                @Override // l9.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ExecutorCoroutineDispatcher invoke(d.b bVar) {
                    if (bVar instanceof ExecutorCoroutineDispatcher) {
                        return (ExecutorCoroutineDispatcher) bVar;
                    }
                    return null;
                }
            });
        }
    }

    public abstract Executor b0();
}
