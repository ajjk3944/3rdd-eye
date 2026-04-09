package J8;

import A9.C0583j;
import android.app.Application;
import android.content.SharedPreferences;
import b9.C1992A;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import f9.InterfaceC4347e;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import va.a;

/* compiled from: AppInstanceId.kt */
@h9.e(c = "com.zipoapps.premiumhelper.util.AppInstanceId$get$2", f = "AppInstanceId.kt", l = {43}, m = "invokeSuspend")
/* renamed from: J8.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0695j extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super String>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f2867l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B0.f f2868m;

    /* compiled from: AppInstanceId.kt */
    /* renamed from: J8.j$a */
    public static final class a<TResult> implements OnCompleteListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ B0.f f2869b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C0583j f2870c;

        public a(B0.f fVar, C0583j c0583j) {
            this.f2869b = fVar;
            this.f2870c = c0583j;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<String> it) {
            String string;
            kotlin.jvm.internal.l.f(it, "it");
            if (it.isSuccessful()) {
                string = it.getResult();
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    kotlin.jvm.internal.l.e(string, "toString(...)");
                }
            } else {
                string = UUID.randomUUID().toString();
                kotlin.jvm.internal.l.c(string);
            }
            a.b bVar = va.a.f47104a;
            bVar.o("PremiumHelper");
            bVar.g("APPLICATION_INSTANCE_ID = ".concat(string), new Object[0]);
            com.zipoapps.premiumhelper.c cVar = (com.zipoapps.premiumhelper.c) this.f2869b.f358d;
            cVar.getClass();
            SharedPreferences.Editor editorEdit = cVar.f37004a.edit();
            editorEdit.putString("app_instance_id", string);
            editorEdit.apply();
            C0583j c0583j = this.f2870c;
            if (c0583j.isActive()) {
                c0583j.resumeWith(string);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0695j(B0.f fVar, InterfaceC4347e<? super C0695j> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f2868m = fVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C0695j(this.f2868m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super String> interfaceC4347e) {
        return ((C0695j) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        Task taskForException;
        E4.a aVar;
        g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
        int i = this.f2867l;
        if (i == 0) {
            b9.n.b(obj);
            String string = ((com.zipoapps.premiumhelper.c) this.f2868m.f358d).f37004a.getString("app_instance_id", null);
            if (string != null && string.length() != 0) {
                return string;
            }
            B0.f fVar = this.f2868m;
            this.f2867l = 1;
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
            c0583j.s();
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance((Application) fVar.f357c);
            firebaseAnalytics.getClass();
            try {
                synchronized (FirebaseAnalytics.class) {
                    try {
                        if (firebaseAnalytics.f23244b == null) {
                            firebaseAnalytics.f23244b = new E4.a(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                        }
                        aVar = firebaseAnalytics.f23244b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                taskForException = Tasks.call(aVar, new E4.b(firebaseAnalytics));
            } catch (RuntimeException e4) {
                firebaseAnalytics.f23243a.zzA(5, "Failed to schedule task for getAppInstanceId", null, null, null);
                taskForException = Tasks.forException(e4);
            }
            taskForException.addOnCompleteListener(new a(fVar, c0583j));
            obj = c0583j.r();
            g9.a aVar3 = g9.a.COROUTINE_SUSPENDED;
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return (String) obj;
    }
}
