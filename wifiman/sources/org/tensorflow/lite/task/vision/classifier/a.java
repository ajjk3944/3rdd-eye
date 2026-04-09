package org.tensorflow.lite.task.vision.classifier;

import java.util.List;

/* loaded from: classes2.dex */
final class a extends Classifications {

    /* renamed from: a, reason: collision with root package name */
    private final List f57168a;

    /* renamed from: b, reason: collision with root package name */
    private final int f57169b;

    a(List list, int i10) {
        if (list == null) {
            throw new NullPointerException("Null categories");
        }
        this.f57168a = list;
        this.f57169b = i10;
    }

    @Override // org.tensorflow.lite.task.vision.classifier.Classifications
    public List a() {
        return this.f57168a;
    }

    @Override // org.tensorflow.lite.task.vision.classifier.Classifications
    public int b() {
        return this.f57169b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Classifications)) {
            return false;
        }
        Classifications classifications = (Classifications) obj;
        return this.f57168a.equals(classifications.a()) && this.f57169b == classifications.b();
    }

    public int hashCode() {
        return ((this.f57168a.hashCode() ^ 1000003) * 1000003) ^ this.f57169b;
    }

    public String toString() {
        return "Classifications{categories=" + this.f57168a + ", headIndex=" + this.f57169b + "}";
    }
}
