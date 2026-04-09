package androidx.camera.extensions.internal.sessionprocessor;

import C.S;
import E.u;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.sessionprocessor.a;
import java.util.List;

/* loaded from: classes.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    private final PreviewImageProcessorImpl mPreviewImageProcessor;
    private final a mCaptureResultImageMatcher = new a();
    private final Object mLock = new Object();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;

    public interface OnCaptureResultCallback {
        void onCaptureResult(long j4, List<Pair<CaptureResult.Key, Object>> list);
    }

    public PreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl, Surface surface, Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, b bVar, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    bVar.a();
                    S.a(TAG, "Ignore image in closed or paused state");
                    return;
                }
                try {
                    S.a aVar = S.e.f11838b;
                    if (S.b.a(aVar) && S.c.b(aVar)) {
                        this.mPreviewImageProcessor.process(bVar.get(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                            public void onCaptureCompleted(long j4, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureResult(j4, list);
                            }

                            public void onCaptureProcessProgressed(int i10) {
                            }
                        }, u.F());
                    } else {
                        this.mPreviewImageProcessor.process(bVar.get(), totalCaptureResult);
                    }
                    bVar.a();
                } catch (Throwable th) {
                    bVar.a();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.b();
            this.mCaptureResultImageMatcher.c();
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.a(totalCaptureResult, 0);
    }

    public void notifyImage(b bVar) {
        this.mCaptureResultImageMatcher.d(bVar);
    }

    public void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    public void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    public void start(final OnCaptureResultCallback onCaptureResultCallback) {
        this.mCaptureResultImageMatcher.h(new a.InterfaceC0231a() { // from class: androidx.camera.extensions.internal.sessionprocessor.d
            @Override // androidx.camera.extensions.internal.sessionprocessor.a.InterfaceC0231a
            public final void a(b bVar, TotalCaptureResult totalCaptureResult, int i) {
                this.f15141a.lambda$start$0(onCaptureResultCallback, bVar, totalCaptureResult, i);
            }
        });
    }
}
