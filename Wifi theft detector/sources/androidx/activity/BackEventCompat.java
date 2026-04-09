package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* loaded from: classes.dex */
public final class BackEventCompat {

    /* renamed from: e, reason: collision with root package name */
    public static final a f208e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final float f209a;

    /* renamed from: b, reason: collision with root package name */
    public final float f210b;

    /* renamed from: c, reason: collision with root package name */
    public final float f211c;

    /* renamed from: d, reason: collision with root package name */
    public final int f212d;

    @Target({ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/BackEventCompat$SwipeEdge;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.f21936l})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.f21920a)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface SwipeEdge {
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    public BackEventCompat(float f10, float f11, float f12, int i10) {
        this.f209a = f10;
        this.f210b = f11;
        this.f211c = f12;
        this.f212d = i10;
    }

    public final float a() {
        return this.f211c;
    }

    public final int b() {
        return this.f212d;
    }

    public final float c() {
        return this.f210b;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f209a + ", touchY=" + this.f210b + ", progress=" + this.f211c + ", swipeEdge=" + this.f212d + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BackEventCompat(BackEvent backEvent) {
        kotlin.jvm.internal.p.e(backEvent, "backEvent");
        androidx.activity.a aVar = androidx.activity.a.f256a;
        this(aVar.d(backEvent), aVar.e(backEvent), aVar.b(backEvent), aVar.c(backEvent));
    }
}
