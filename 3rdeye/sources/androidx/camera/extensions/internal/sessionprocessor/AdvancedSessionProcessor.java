package androidx.camera.extensions.internal.sessionprocessor;

import A2.l;
import C.C;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1712s;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.v0;
import androidx.camera.core.impl.w0;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import androidx.lifecycle.E;
import androidx.work.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import v.I;
import v.I.a;
import v.Y;

/* loaded from: classes.dex */
public final class AdvancedSessionProcessor extends e {

    public static class CallbackAdapter implements E0.a {
        private final RequestProcessorImpl.Callback mCallback;

        public CallbackAdapter(RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private RequestProcessorImpl.Request getImplRequest(E0.b bVar) {
            l.l(bVar instanceof RequestAdapter);
            return ((RequestAdapter) bVar).getImplRequest();
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onCaptureBufferLost(E0.b bVar, long j4, int i) {
            this.mCallback.onCaptureBufferLost(getImplRequest(bVar), j4, i);
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onCaptureCompleted(E0.b bVar, A a10) {
            CaptureResult captureResultF = a10.f();
            l.k("CaptureResult in cameraCaptureResult is not a TotalCaptureResult", captureResultF instanceof TotalCaptureResult);
            this.mCallback.onCaptureCompleted(getImplRequest(bVar), (TotalCaptureResult) captureResultF);
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onCaptureFailed(E0.b bVar, C1712s c1712s) {
            Object objA = c1712s.a();
            l.k("CameraCaptureFailure does not contain CaptureFailure.", s.n(objA));
            this.mCallback.onCaptureFailed(getImplRequest(bVar), (CaptureFailure) objA);
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onCaptureProgressed(E0.b bVar, A a10) {
            CaptureResult captureResultF = a10.f();
            l.k("Cannot get CaptureResult from the cameraCaptureResult ", captureResultF != null);
            this.mCallback.onCaptureProgressed(getImplRequest(bVar), captureResultF);
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onCaptureSequenceAborted(int i) {
            this.mCallback.onCaptureSequenceAborted(i);
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onCaptureSequenceCompleted(int i, long j4) {
            this.mCallback.onCaptureSequenceCompleted(i, j4);
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onCaptureStarted(E0.b bVar, long j4, long j10) {
            this.mCallback.onCaptureStarted(getImplRequest(bVar), j4, j10);
        }
    }

    public static class ExtensionMetadataMonitor {
        private final E<Integer> mCurrentExtensionTypeLiveData;
        private final E<Integer> mExtensionStrengthLiveData;

        public ExtensionMetadataMonitor(E<Integer> e4, E<Integer> e10) {
            this.mCurrentExtensionTypeLiveData = e4;
            this.mExtensionStrengthLiveData = e10;
        }

        private int convertExtensionMode(int i) {
            if (i == 0) {
                return 5;
            }
            if (i == 1) {
                return 4;
            }
            if (i == 2) {
                return 1;
            }
            if (i != 3) {
                return i != 4 ? 0 : 3;
            }
            return 2;
        }

        public void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
            Object obj;
            Object obj2;
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.mCurrentExtensionTypeLiveData != null && (obj2 = map.get(CaptureResult.EXTENSION_CURRENT_TYPE)) != null) {
                    Integer num = (Integer) obj2;
                    if (!Objects.equals(this.mCurrentExtensionTypeLiveData.d(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                        this.mCurrentExtensionTypeLiveData.k(Integer.valueOf(convertExtensionMode(num.intValue())));
                    }
                }
                if (this.mExtensionStrengthLiveData == null || (obj = map.get(CaptureResult.EXTENSION_STRENGTH)) == null || Objects.equals(this.mExtensionStrengthLiveData.d(), obj)) {
                    return;
                }
                this.mExtensionStrengthLiveData.k((Integer) obj);
            }
        }
    }

    public static class ImageProcessorAdapter {
        private final ImageProcessorImpl mImpl;

        public ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        public void onNextImageAvailable(int i, long j4, b bVar, String str) {
            this.mImpl.onNextImageAvailable(i, j4, new ImageReferenceImplAdapter(bVar), str);
        }
    }

    public static class ImageReferenceImplAdapter implements ImageReferenceImpl {
        private final b mImageReference;

        public ImageReferenceImplAdapter(b bVar) {
            this.mImageReference = bVar;
        }

        public boolean decrement() {
            return this.mImageReference.a();
        }

        public Image get() {
            return this.mImageReference.get();
        }

        public boolean increment() {
            return this.mImageReference.b();
        }
    }

    public static class OutputSurfaceConfigurationImplAdapter implements OutputSurfaceConfigurationImpl {
        private final OutputSurfaceImpl mAnalysisOutputSurface;
        private final OutputSurfaceImpl mCaptureOutputSurface;
        private final OutputSurfaceImpl mPostviewOutputSurface;
        private final OutputSurfaceImpl mPreviewOutputSurface;

        public OutputSurfaceConfigurationImplAdapter(w0 w0Var) {
            this.mPreviewOutputSurface = new OutputSurfaceImplAdapter(w0Var.d());
            this.mCaptureOutputSurface = new OutputSurfaceImplAdapter(w0Var.b());
            this.mAnalysisOutputSurface = w0Var.a() != null ? new OutputSurfaceImplAdapter(w0Var.a()) : null;
            this.mPostviewOutputSurface = w0Var.c() != null ? new OutputSurfaceImplAdapter(w0Var.c()) : null;
        }

        public OutputSurfaceImpl getImageAnalysisOutputSurface() {
            return this.mAnalysisOutputSurface;
        }

        public OutputSurfaceImpl getImageCaptureOutputSurface() {
            return this.mCaptureOutputSurface;
        }

        public OutputSurfaceImpl getPostviewOutputSurface() {
            return this.mPostviewOutputSurface;
        }

        public OutputSurfaceImpl getPreviewOutputSurface() {
            return this.mPreviewOutputSurface;
        }
    }

    public static class OutputSurfaceImplAdapter implements OutputSurfaceImpl {
        private final v0 mOutputSurface;

        public OutputSurfaceImplAdapter(v0 v0Var) {
            this.mOutputSurface = v0Var;
        }

        public int getImageFormat() {
            return this.mOutputSurface.a();
        }

        public Size getSize() {
            return this.mOutputSurface.b();
        }

        public Surface getSurface() {
            return this.mOutputSurface.c();
        }
    }

    public static class RequestAdapter implements E0.b {
        private final RequestProcessorImpl.Request mImplRequest;
        private final U mParameters;
        private final List<Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        public RequestAdapter(RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            ArrayList arrayList = new ArrayList();
            Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((Integer) it.next());
            }
            this.mTargetOutputConfigIds = arrayList;
            C1710q0 c1710q0K = C1710q0.K();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                c1710q0K.N(new C1683d("camera2.captureRequest.option." + key.getName(), Object.class, key), request.getParameters().get(key));
            }
            C1717u0 c1717u0J = C1717u0.J(c1710q0K);
            S.d dVar = new S.d();
            dVar.f11837G = c1717u0J;
            this.mParameters = dVar;
            this.mTemplateId = request.getTemplateId().intValue();
        }

        public RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        @Override // androidx.camera.core.impl.E0.b
        public U getParameters() {
            return this.mParameters;
        }

        @Override // androidx.camera.core.impl.E0.b
        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // androidx.camera.core.impl.E0.b
        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    public static class SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
        private final I0.a mCaptureCallback;
        private final ExtensionMetadataMonitor mExtensionMetadataMonitor;
        private long mOnCaptureStartedTimestamp;
        private final P0 mTagBundle;
        private boolean mWillReceiveOnCaptureCompleted;

        public SessionProcessorImplCaptureCallbackAdapter(I0.a aVar, P0 p02, boolean z10) {
            this(aVar, p02, null, z10);
        }

        public void onCaptureCompleted(long j4, int i, Map<CaptureResult.Key, Object> map) {
            ExtensionMetadataMonitor extensionMetadataMonitor = this.mExtensionMetadataMonitor;
            if (extensionMetadataMonitor != null) {
                extensionMetadataMonitor.checkExtensionMetadata(map);
            }
            if (this.mWillReceiveOnCaptureCompleted) {
                this.mCaptureCallback.b(new c(j4, this.mTagBundle, map));
                this.mCaptureCallback.d();
            }
        }

        public void onCaptureFailed(int i) {
            this.mCaptureCallback.c();
        }

        public void onCaptureProcessProgressed(int i) {
            this.mCaptureCallback.onCaptureProcessProgressed(i);
        }

        public void onCaptureProcessStarted(int i) {
            this.mCaptureCallback.getClass();
        }

        public void onCaptureSequenceAborted(int i) {
            this.mCaptureCallback.getClass();
        }

        public void onCaptureSequenceCompleted(int i) {
            if (this.mWillReceiveOnCaptureCompleted) {
                return;
            }
            this.mCaptureCallback.b(new c(this.mOnCaptureStartedTimestamp, this.mTagBundle, Collections.EMPTY_MAP));
            this.mCaptureCallback.d();
        }

        public void onCaptureStarted(int i, long j4) {
            this.mOnCaptureStartedTimestamp = j4;
            this.mCaptureCallback.a();
        }

        public SessionProcessorImplCaptureCallbackAdapter(I0.a aVar, P0 p02, ExtensionMetadataMonitor extensionMetadataMonitor, boolean z10) {
            this.mOnCaptureStartedTimestamp = -1L;
            this.mCaptureCallback = aVar;
            this.mTagBundle = p02;
            this.mExtensionMetadataMonitor = extensionMetadataMonitor;
            this.mWillReceiveOnCaptureCompleted = z10;
        }
    }

    public class RequestProcessorImplAdapter implements RequestProcessorImpl {
        private final E0 mRequestProcessor;
        final /* synthetic */ AdvancedSessionProcessor this$0;

        public RequestProcessorImplAdapter(AdvancedSessionProcessor advancedSessionProcessor, E0 e02) {
            this.mRequestProcessor = e02;
        }

        public void abortCaptures() {
            Y y10;
            I i = (I) this.mRequestProcessor;
            synchronized (i.f46620a) {
                try {
                    if (!i.f46623d && (y10 = i.f46621b) != null) {
                        y10.i();
                    }
                } finally {
                }
            }
        }

        public void setImageProcessor(int i, ImageProcessorImpl imageProcessorImpl) {
            new ImageProcessorAdapter(imageProcessorImpl);
            throw null;
        }

        public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            E0 e02 = this.mRequestProcessor;
            RequestAdapter requestAdapter = new RequestAdapter(request);
            CallbackAdapter callbackAdapter = new CallbackAdapter(callback);
            I i = (I) e02;
            synchronized (i.f46620a) {
                try {
                    if (!i.f46623d && i.b(requestAdapter) && i.f46621b != null) {
                        H0.b bVar = new H0.b();
                        bVar.f14887b.f14950c = requestAdapter.getTemplateId();
                        U parameters = requestAdapter.getParameters();
                        S.a aVar = bVar.f14887b;
                        aVar.getClass();
                        aVar.f14949b = C1710q0.L(parameters);
                        bVar.a(new v.U(i.new a(requestAdapter, callbackAdapter, true)));
                        if (i.f46624e != null) {
                            Iterator<AbstractC1707p> it = i.f46624e.f14884g.f14944e.iterator();
                            while (it.hasNext()) {
                                bVar.a(it.next());
                            }
                            P0 p02 = i.f46624e.f14884g.f14946g;
                            for (String str : p02.f14935a.keySet()) {
                                bVar.f14887b.f14954g.f14935a.put(str, p02.f14935a.get(str));
                            }
                        }
                        Iterator<Integer> it2 = requestAdapter.getTargetOutputConfigIds().iterator();
                        while (it2.hasNext()) {
                            bVar.c(i.a(it2.next().intValue()), C.f616d, -1);
                        }
                        return i.f46621b.q(bVar.d());
                    }
                    return -1;
                } finally {
                }
            }
        }

        public void stopRepeating() {
            Y y10;
            I i = (I) this.mRequestProcessor;
            synchronized (i.f46620a) {
                try {
                    if (!i.f46623d && (y10 = i.f46621b) != null) {
                        y10.r();
                    }
                } finally {
                }
            }
        }

        public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            E0 e02 = this.mRequestProcessor;
            RequestAdapter requestAdapter = new RequestAdapter(request);
            CallbackAdapter callbackAdapter = new CallbackAdapter(callback);
            I i = (I) e02;
            i.getClass();
            return i.c(Arrays.asList(requestAdapter), callbackAdapter);
        }

        public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            Iterator<RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RequestAdapter(it.next()));
            }
            return ((I) this.mRequestProcessor).c(arrayList, new CallbackAdapter(callback));
        }
    }
}
