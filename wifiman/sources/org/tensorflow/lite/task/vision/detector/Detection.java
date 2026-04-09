package org.tensorflow.lite.task.vision.detector;

import android.graphics.RectF;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.support.label.Category;

@UsedByReflection
@AutoValue
/* loaded from: classes2.dex */
public abstract class Detection {
    @UsedByReflection
    public static Detection create(RectF rectF, List<Category> list) {
        return new a(new RectF(rectF), Collections.unmodifiableList(new ArrayList(list)));
    }

    public abstract RectF a();

    public abstract List b();
}
