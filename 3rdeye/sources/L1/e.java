package L1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import p4.C5452b;
import p4.C5457g;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3965b;

    public /* synthetic */ e(Object obj, int i) {
        this.f3964a = i;
        this.f3965b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        switch (this.f3964a) {
            case 0:
                d dVar = (d) this.f3965b;
                ArrayList arrayList = new ArrayList(dVar.f3956f);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((c) arrayList.get(i)).a(dVar);
                }
                break;
            case 1:
                l.f(animation, "animation");
                k3.e eVar = (k3.e) this.f3965b;
                if (!eVar.f43335r) {
                    eVar.n();
                    break;
                }
                break;
            case 2:
            default:
                super.onAnimationEnd(animation);
                break;
            case 3:
                C5457g c5457g = (C5457g) this.f3965b;
                c5457g.q();
                c5457g.f45147r.start();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3964a) {
            case 0:
                d dVar = (d) this.f3965b;
                ArrayList arrayList = new ArrayList(dVar.f3956f);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((c) arrayList.get(i)).b(dVar);
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                ((C5452b) this.f3965b).f45149b.h(true);
                break;
        }
    }
}
