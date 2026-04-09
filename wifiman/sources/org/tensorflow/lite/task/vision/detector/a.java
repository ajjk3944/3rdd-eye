package org.tensorflow.lite.task.vision.detector;

import android.graphics.RectF;
import java.util.List;

/* loaded from: classes2.dex */
final class a extends Detection {

    /* renamed from: a, reason: collision with root package name */
    private final RectF f57189a;

    /* renamed from: b, reason: collision with root package name */
    private final List f57190b;

    a(RectF rectF, List list) {
        if (rectF == null) {
            throw new NullPointerException("Null boundingBox");
        }
        this.f57189a = rectF;
        if (list == null) {
            throw new NullPointerException("Null categories");
        }
        this.f57190b = list;
    }

    @Override // org.tensorflow.lite.task.vision.detector.Detection
    public RectF a() {
        return this.f57189a;
    }

    @Override // org.tensorflow.lite.task.vision.detector.Detection
    public List b() {
        return this.f57190b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Detection)) {
            return false;
        }
        Detection detection = (Detection) obj;
        return this.f57189a.equals(detection.a()) && this.f57190b.equals(detection.b());
    }

    public int hashCode() {
        return ((this.f57189a.hashCode() ^ 1000003) * 1000003) ^ this.f57190b.hashCode();
    }

    public String toString() {
        return "Detection{boundingBox=" + this.f57189a + ", categories=" + this.f57190b + "}";
    }
}
