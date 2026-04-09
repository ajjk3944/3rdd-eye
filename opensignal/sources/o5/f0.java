package o5;

import java.io.IOException;

/* loaded from: classes.dex */
public interface f0 {
    void onDownstreamFormatChanged(int i10, z zVar, v vVar);

    void onLoadCanceled(int i10, z zVar, q qVar, v vVar);

    void onLoadCompleted(int i10, z zVar, q qVar, v vVar);

    void onLoadError(int i10, z zVar, q qVar, v vVar, IOException iOException, boolean z10);

    void onLoadStarted(int i10, z zVar, q qVar, v vVar);

    void onUpstreamDiscarded(int i10, z zVar, v vVar);
}
