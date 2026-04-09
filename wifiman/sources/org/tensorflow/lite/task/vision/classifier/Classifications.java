package org.tensorflow.lite.task.vision.classifier;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.support.label.Category;

@UsedByReflection
@AutoValue
/* loaded from: classes2.dex */
public abstract class Classifications {
    @UsedByReflection
    static Classifications create(List<Category> list, int i10) {
        return new a(Collections.unmodifiableList(new ArrayList(list)), i10);
    }

    public abstract List a();

    public abstract int b();
}
