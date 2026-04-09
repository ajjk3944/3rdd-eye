package ya;

import java.io.IOException;

/* loaded from: classes.dex */
public interface b0 {
    void onDownstreamFormatChanged(int i10, v vVar, r rVar);

    void onLoadCanceled(int i10, v vVar, m mVar, r rVar);

    void onLoadCompleted(int i10, v vVar, m mVar, r rVar);

    void onLoadError(int i10, v vVar, m mVar, r rVar, IOException iOException, boolean z10);

    void onLoadStarted(int i10, v vVar, m mVar, r rVar);

    void onUpstreamDiscarded(int i10, v vVar, r rVar);
}
