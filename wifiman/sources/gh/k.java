package Gh;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;

/* loaded from: classes4.dex */
public abstract class k {
    public static final C2915g a(Annotation[] annotationArr, Zh.c fqName) {
        Annotation annotation;
        AbstractC6492s.i(annotationArr, "<this>");
        AbstractC6492s.i(fqName, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (AbstractC6492s.d(AbstractC2914f.e(AbstractC6596a.b(AbstractC6596a.a(annotation))).a(), fqName)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new C2915g(annotation);
        }
        return null;
    }

    public static final List b(Annotation[] annotationArr) {
        AbstractC6492s.i(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C2915g(annotation));
        }
        return arrayList;
    }
}
