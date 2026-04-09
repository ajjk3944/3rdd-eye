package bq;

import com.survicate.surveys.entities.survey.questions.ImagePosition;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2861a;

    static {
        int[] iArr = new int[ImagePosition.values().length];
        try {
            iArr[ImagePosition.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImagePosition.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2861a = iArr;
    }
}
