package androidx.camera.extensions.internal.sessionprocessor;

import A2.l;
import C.S;
import E.u;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.v0;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.sessionprocessor.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class StillCaptureProcessor {
    private static final String TAG = "StillCaptureProcessor";
    private static final long UNSPECIFIED_TIMESTAMP = -1;
    U.a mCaptureOutputSurface;
    final CaptureProcessorImpl mCaptureProcessorImpl;
    private boolean mIsPostviewConfigured;
    final a mCaptureResultImageMatcher = new a();
    final Object mLock = new Object();
    HashMap<Integer, Pair<b, TotalCaptureResult>> mCaptureResults = new HashMap<>();
    OnCaptureResultCallback mOnCaptureResultCallback = null;
    TotalCaptureResult mSourceCaptureResult = null;
    boolean mIsClosed = false;
    long mTimeStampForOutputImage = -1;

    public interface OnCaptureResultCallback {
        void onCaptureCompleted(long j4, List<Pair<CaptureResult.Key, Object>> list);

        void onCaptureProcessProgressed(int i);

        void onError(Exception exc);

        void onProcessCompleted();
    }

    public StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, v0 v0Var, boolean z10) {
        this.mCaptureProcessorImpl = captureProcessorImpl;
        U.a aVar = new U.a(surface, size, z10);
        this.mCaptureOutputSurface = aVar;
        captureProcessorImpl.onOutputSurface(aVar.f12343e, 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        this.mIsPostviewConfigured = v0Var != null;
        if (v0Var != null) {
            S.a aVar2 = S.e.f11839c;
            if (S.b.a(aVar2) && S.c.b(aVar2)) {
                l.l(v0Var.a() == 35);
                captureProcessorImpl.onResolutionUpdate(size, v0Var.b());
                captureProcessorImpl.onPostviewOutputSurface(v0Var.c());
                return;
            }
        }
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public /* synthetic */ void lambda$process$1(boolean z10, HashMap map, final OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mLock) {
            try {
                try {
                    try {
                    } catch (Exception e4) {
                        S.c(TAG, "mCaptureProcessorImpl.process exception ", e4);
                        this.mOnCaptureResultCallback = null;
                        if (onCaptureResultCallback != null) {
                            onCaptureResultCallback.onError(e4);
                        }
                        S.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback2 != null) {
                            onCaptureResultCallback2.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                    }
                    if (this.mIsClosed) {
                        S.a(TAG, "Ignore process() in closed state.");
                        S.a(TAG, "CaptureProcessorImpl.process() finish");
                        OnCaptureResultCallback onCaptureResultCallback3 = this.mOnCaptureResultCallback;
                        if (onCaptureResultCallback3 != null) {
                            onCaptureResultCallback3.onProcessCompleted();
                            this.mOnCaptureResultCallback = null;
                        }
                        clearCaptureResults();
                        return;
                    }
                    S.a(TAG, "CaptureProcessorImpl.process() begin");
                    S.a aVar = S.e.f11839c;
                    if (S.c.b(aVar) && S.b.a(aVar) && z10 && this.mIsPostviewConfigured) {
                        this.mCaptureProcessorImpl.processWithPostview(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                            public void onCaptureCompleted(long j4, List<Pair<CaptureResult.Key, Object>> list) {
                                onCaptureResultCallback.onCaptureCompleted(j4, list);
                            }

                            public void onCaptureProcessProgressed(int i) {
                                onCaptureResultCallback.onCaptureProcessProgressed(i);
                            }
                        }, u.y());
                    } else {
                        S.a aVar2 = S.e.f11838b;
                        if (S.c.b(aVar2) && S.b.a(aVar2)) {
                            this.mCaptureProcessorImpl.process(map, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.2
                                public void onCaptureCompleted(long j4, List<Pair<CaptureResult.Key, Object>> list) {
                                    onCaptureResultCallback.onCaptureCompleted(j4, list);
                                }

                                public void onCaptureProcessProgressed(int i) {
                                    onCaptureResultCallback.onCaptureProcessProgressed(i);
                                }
                            }, u.y());
                        } else {
                            this.mCaptureProcessorImpl.process(map);
                        }
                    }
                    S.a(TAG, "CaptureProcessorImpl.process() finish");
                    OnCaptureResultCallback onCaptureResultCallback4 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback4 != null) {
                        onCaptureResultCallback4.onProcessCompleted();
                        this.mOnCaptureResultCallback = null;
                    }
                    clearCaptureResults();
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                S.a(TAG, "CaptureProcessorImpl.process() finish");
                OnCaptureResultCallback onCaptureResultCallback5 = this.mOnCaptureResultCallback;
                if (onCaptureResultCallback5 != null) {
                    onCaptureResultCallback5.onProcessCompleted();
                    this.mOnCaptureResultCallback = null;
                }
                clearCaptureResults();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCapture$0(List list, OnCaptureResultCallback onCaptureResultCallback, boolean z10, b bVar, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    bVar.a();
                    S.a(TAG, "Ignore image in closed state");
                    return;
                }
                S.a(TAG, "onImageReferenceIncoming  captureStageId=" + i);
                this.mCaptureResults.put(Integer.valueOf(i), new Pair<>(bVar, totalCaptureResult));
                S.a(TAG, "mCaptureResult has capture stage Id: " + this.mCaptureResults.keySet());
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    process(this.mCaptureResults, onCaptureResultCallback, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<b, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next().first).a();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            S.a(TAG, "Close the StillCaptureProcessor");
            this.mIsClosed = true;
            clearCaptureResults();
            this.mCaptureResultImageMatcher.c();
            this.mCaptureResultImageMatcher.b();
            this.mCaptureOutputSurface.a();
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i) {
        Long l5;
        this.mCaptureResultImageMatcher.a(totalCaptureResult, i);
        if (this.mTimeStampForOutputImage == -1 && (l5 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
            long jLongValue = l5.longValue();
            this.mTimeStampForOutputImage = jLongValue;
            U.a aVar = this.mCaptureOutputSurface;
            if (aVar.f12345g) {
                aVar.f12346h = jLongValue;
            }
        }
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyImage(b bVar) {
        this.mCaptureResultImageMatcher.d(bVar);
    }

    public void process(Map<Integer, Pair<b, TotalCaptureResult>> map, final OnCaptureResultCallback onCaptureResultCallback, final boolean z10) {
        final HashMap map2 = new HashMap();
        synchronized (this.mLock) {
            try {
                for (Integer num : map.keySet()) {
                    Pair<b, TotalCaptureResult> pair = map.get(num);
                    map2.put(num, new Pair(((b) pair.first).get(), (TotalCaptureResult) pair.second));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u.F().execute(new Runnable() { // from class: androidx.camera.extensions.internal.sessionprocessor.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f15143b.lambda$process$1(z10, map2, onCaptureResultCallback);
            }
        });
    }

    public void startCapture(final boolean z10, final List<Integer> list, final OnCaptureResultCallback onCaptureResultCallback) {
        S.a(TAG, "Start the capture: enablePostview=" + z10);
        this.mTimeStampForOutputImage = -1L;
        synchronized (this.mLock) {
            l.q("StillCaptureProcessor is closed. Can't invoke startCapture()", !this.mIsClosed);
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.b();
        this.mCaptureResultImageMatcher.h(new a.InterfaceC0231a() { // from class: androidx.camera.extensions.internal.sessionprocessor.g
            @Override // androidx.camera.extensions.internal.sessionprocessor.a.InterfaceC0231a
            public final void a(b bVar, TotalCaptureResult totalCaptureResult, int i) {
                this.f15147a.lambda$startCapture$0(list, onCaptureResultCallback, z10, bVar, totalCaptureResult, i);
            }
        });
    }
}
