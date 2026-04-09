package org.tensorflow.lite.task.vision.segmenter;

/* loaded from: classes2.dex */
final class a extends ColoredLabel {

    /* renamed from: a, reason: collision with root package name */
    private final String f57191a;

    /* renamed from: b, reason: collision with root package name */
    private final String f57192b;

    /* renamed from: c, reason: collision with root package name */
    private final int f57193c;

    a(String str, String str2, int i10) {
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.f57191a = str;
        if (str2 == null) {
            throw new NullPointerException("Null displayName");
        }
        this.f57192b = str2;
        this.f57193c = i10;
    }

    @Override // org.tensorflow.lite.task.vision.segmenter.ColoredLabel
    public int a() {
        return this.f57193c;
    }

    @Override // org.tensorflow.lite.task.vision.segmenter.ColoredLabel
    public String b() {
        return this.f57192b;
    }

    @Override // org.tensorflow.lite.task.vision.segmenter.ColoredLabel
    public String c() {
        return this.f57191a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ColoredLabel)) {
            return false;
        }
        ColoredLabel coloredLabel = (ColoredLabel) obj;
        return this.f57191a.equals(coloredLabel.c()) && this.f57192b.equals(coloredLabel.b()) && this.f57193c == coloredLabel.a();
    }

    public int hashCode() {
        return ((((this.f57191a.hashCode() ^ 1000003) * 1000003) ^ this.f57192b.hashCode()) * 1000003) ^ this.f57193c;
    }

    public String toString() {
        return "ColoredLabel{label=" + this.f57191a + ", displayName=" + this.f57192b + ", argb=" + this.f57193c + "}";
    }
}
