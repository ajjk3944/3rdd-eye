package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: EncoderProfilesProxy.java */
/* renamed from: androidx.camera.core.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1680b0 {

    /* compiled from: EncoderProfilesProxy.java */
    /* renamed from: androidx.camera.core.impl.b0$a */
    public static abstract class a {
        public abstract int a();

        public abstract int b();

        public abstract int c();

        public abstract String d();

        public abstract int e();

        public abstract int f();
    }

    /* compiled from: EncoderProfilesProxy.java */
    /* renamed from: androidx.camera.core.impl.b0$b */
    public static abstract class b implements InterfaceC1680b0 {
        public static C1687f e(int i, int i10, List list, List list2) {
            return new C1687f(i, i10, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    /* compiled from: EncoderProfilesProxy.java */
    /* renamed from: androidx.camera.core.impl.b0$c */
    public static abstract class c {
        public abstract int a();

        public abstract int b();

        public abstract int c();

        public abstract int d();

        public abstract int e();

        public abstract int f();

        public abstract int g();

        public abstract String h();

        public abstract int i();

        public abstract int j();
    }

    int a();

    int b();

    List<a> c();

    List<c> d();
}
