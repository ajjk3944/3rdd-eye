package f;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;

/* compiled from: ActivityResultContract.kt */
/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4328a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: f.a$a, reason: collision with other inner class name */
    public static final class C0451a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Serializable f37792a;

        public C0451a(Serializable serializable) {
            this.f37792a = serializable;
        }
    }

    public abstract Intent a(Context context, I i);

    public C0451a<O> b(Context context, I i) {
        return null;
    }

    public abstract O c(int i, Intent intent);
}
