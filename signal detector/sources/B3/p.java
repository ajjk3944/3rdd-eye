package B3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f633b;

    public /* synthetic */ p(q qVar, int i) {
        this.f632a = i;
        this.f633b = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f632a) {
            case 1:
                super.onAnimationEnd(animator);
                q qVar = this.f633b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = qVar.f641g;
                if (arrayList != null && !qVar.f642h) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((c) obj).a(qVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f632a) {
            case 0:
                super.onAnimationStart(animator);
                q qVar = this.f633b;
                ArrayList arrayList = qVar.f641g;
                if (arrayList != null && !qVar.f642h) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((c) obj).b(qVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
