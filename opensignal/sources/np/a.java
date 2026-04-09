package np;

import com.survicate.surveys.entities.survey.questions.nps.AnswerLayout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18472a;

    static {
        int[] iArr = new int[AnswerLayout.values().length];
        try {
            iArr[AnswerLayout.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnswerLayout.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18472a = iArr;
    }
}
