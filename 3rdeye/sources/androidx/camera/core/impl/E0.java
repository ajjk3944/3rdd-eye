package androidx.camera.core.impl;

import java.util.List;

/* compiled from: RequestProcessor.java */
/* loaded from: classes.dex */
public interface E0 {

    /* compiled from: RequestProcessor.java */
    public interface a {
        void onCaptureBufferLost(b bVar, long j4, int i);

        void onCaptureCompleted(b bVar, A a10);

        void onCaptureFailed(b bVar, C1712s c1712s);

        void onCaptureProgressed(b bVar, A a10);

        void onCaptureSequenceAborted(int i);

        void onCaptureSequenceCompleted(int i, long j4);

        void onCaptureStarted(b bVar, long j4, long j10);
    }

    /* compiled from: RequestProcessor.java */
    public interface b {
        U getParameters();

        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }
}
