package org.tensorflow.lite.task.vision.classifier;

import java.util.ArrayList;
import java.util.List;
import org.tensorflow.lite.annotations.UsedByReflection;

@UsedByReflection
/* loaded from: classes2.dex */
public class ImageClassifier$ImageClassifierOptions {

    /* renamed from: a, reason: collision with root package name */
    private final String f57161a;

    /* renamed from: b, reason: collision with root package name */
    private final int f57162b;

    /* renamed from: c, reason: collision with root package name */
    private final float f57163c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f57164d;

    /* renamed from: e, reason: collision with root package name */
    private final List f57165e;

    /* renamed from: f, reason: collision with root package name */
    private final List f57166f;

    /* renamed from: g, reason: collision with root package name */
    private final int f57167g;

    @UsedByReflection
    public String getDisplayNamesLocale() {
        return this.f57161a;
    }

    @UsedByReflection
    public boolean getIsScoreThresholdSet() {
        return this.f57164d;
    }

    @UsedByReflection
    public List<String> getLabelAllowList() {
        return new ArrayList(this.f57165e);
    }

    @UsedByReflection
    public List<String> getLabelDenyList() {
        return new ArrayList(this.f57166f);
    }

    @UsedByReflection
    public int getMaxResults() {
        return this.f57162b;
    }

    @UsedByReflection
    public int getNumThreads() {
        return this.f57167g;
    }

    @UsedByReflection
    public float getScoreThreshold() {
        return this.f57163c;
    }
}
