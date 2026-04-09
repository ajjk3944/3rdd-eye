package androidx.camera.core.impl;

import android.content.Context;

/* compiled from: UseCaseConfigFactory.java */
/* loaded from: classes.dex */
public interface U0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14976a = new a();

    /* compiled from: UseCaseConfigFactory.java */
    public class a implements U0 {
        @Override // androidx.camera.core.impl.U0
        public final U a(b bVar, int i) {
            return null;
        }
    }

    /* compiled from: UseCaseConfigFactory.java */
    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* compiled from: UseCaseConfigFactory.java */
    public interface c {
        v.K newInstance(Context context) throws C.P;
    }

    U a(b bVar, int i);
}
