package org.tensorflow.lite.task.vision.segmenter;

import com.google.auto.value.AutoValue;
import org.tensorflow.lite.annotations.UsedByReflection;

@UsedByReflection
@AutoValue
/* loaded from: classes2.dex */
public abstract class ColoredLabel {
    @UsedByReflection
    public static ColoredLabel create(String str, String str2, int i10) {
        return new a(str, str2, i10);
    }

    public abstract int a();

    public abstract String b();

    public abstract String c();
}
