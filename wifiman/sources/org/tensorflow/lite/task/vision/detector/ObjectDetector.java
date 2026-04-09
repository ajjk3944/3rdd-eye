package org.tensorflow.lite.task.vision.detector;

import Kj.b;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.support.image.e;
import org.tensorflow.lite.task.vision.core.BaseVisionTaskApi;

/* loaded from: classes2.dex */
public final class ObjectDetector extends BaseVisionTaskApi {

    @UsedByReflection
    public static class ObjectDetectorOptions {

        /* renamed from: a, reason: collision with root package name */
        private final String f57174a;

        /* renamed from: b, reason: collision with root package name */
        private final int f57175b;

        /* renamed from: c, reason: collision with root package name */
        private final float f57176c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f57177d;

        /* renamed from: e, reason: collision with root package name */
        private final List f57178e;

        /* renamed from: f, reason: collision with root package name */
        private final List f57179f;

        /* renamed from: g, reason: collision with root package name */
        private final int f57180g;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f57181a;

            /* renamed from: b, reason: collision with root package name */
            private int f57182b;

            /* renamed from: c, reason: collision with root package name */
            private float f57183c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f57184d;

            /* renamed from: e, reason: collision with root package name */
            private List f57185e;

            /* renamed from: f, reason: collision with root package name */
            private List f57186f;

            /* renamed from: g, reason: collision with root package name */
            private int f57187g;

            /* synthetic */ a(a aVar) {
                this();
            }

            public ObjectDetectorOptions h() {
                return new ObjectDetectorOptions(this, null);
            }

            public a i(float f10) {
                this.f57183c = f10;
                this.f57184d = true;
                return this;
            }

            private a() {
                this.f57181a = "en";
                this.f57182b = -1;
                this.f57184d = false;
                this.f57185e = new ArrayList();
                this.f57186f = new ArrayList();
                this.f57187g = -1;
            }
        }

        /* synthetic */ ObjectDetectorOptions(a aVar, a aVar2) {
            this(aVar);
        }

        public static a a() {
            return new a(null);
        }

        @UsedByReflection
        public String getDisplayNamesLocale() {
            return this.f57174a;
        }

        @UsedByReflection
        public boolean getIsScoreThresholdSet() {
            return this.f57177d;
        }

        @UsedByReflection
        public List<String> getLabelAllowList() {
            return new ArrayList(this.f57178e);
        }

        @UsedByReflection
        public List<String> getLabelDenyList() {
            return new ArrayList(this.f57179f);
        }

        @UsedByReflection
        public int getMaxResults() {
            return this.f57175b;
        }

        @UsedByReflection
        public int getNumThreads() {
            return this.f57180g;
        }

        @UsedByReflection
        public float getScoreThreshold() {
            return this.f57176c;
        }

        private ObjectDetectorOptions(a aVar) {
            this.f57174a = aVar.f57181a;
            this.f57175b = aVar.f57182b;
            this.f57176c = aVar.f57183c;
            this.f57177d = aVar.f57184d;
            this.f57178e = aVar.f57185e;
            this.f57179f = aVar.f57186f;
            this.f57180g = aVar.f57187g;
        }
    }

    class a implements b.c {
        a() {
        }

        @Override // Kj.b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public long a(int i10, long j10, long j11, ObjectDetectorOptions objectDetectorOptions) {
            return ObjectDetector.initJniWithModelFdAndOptions(i10, j10, j11, objectDetectorOptions);
        }
    }

    class b implements BaseVisionTaskApi.c {
        b() {
        }

        @Override // org.tensorflow.lite.task.vision.core.BaseVisionTaskApi.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a(long j10, int i10, int i11, Lj.b bVar) {
            return ObjectDetector.this.S(j10, bVar);
        }
    }

    private ObjectDetector(long j10) {
        super(j10);
    }

    public static ObjectDetector P(Context context, String str, ObjectDetectorOptions objectDetectorOptions) {
        return new ObjectDetector(Kj.b.a(context, new a(), "task_vision_jni", str, objectDetectorOptions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List S(long j10, Lj.b bVar) {
        a();
        return detectNative(h(), j10);
    }

    private native void deinitJni(long j10);

    private static native List<Detection> detectNative(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long initJniWithModelFdAndOptions(int i10, long j10, long j11, ObjectDetectorOptions objectDetectorOptions);

    public List T(e eVar) {
        return Y(eVar, Lj.b.a().b());
    }

    public List Y(e eVar, Lj.b bVar) {
        return (List) y(new b(), eVar, bVar);
    }

    @Override // Kj.a
    protected void g(long j10) {
        deinitJni(j10);
    }
}
