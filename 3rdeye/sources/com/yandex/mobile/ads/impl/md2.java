package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class md2 {

    public static final class a extends md2 {

        /* renamed from: a, reason: collision with root package name */
        private final fb2 f30356a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fb2 error) {
            super(0);
            kotlin.jvm.internal.l.f(error, "error");
            this.f30356a = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f30356a, ((a) obj).f30356a);
        }

        public final int hashCode() {
            return this.f30356a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.f30356a + ")";
        }
    }

    public static final class b extends md2 {

        /* renamed from: a, reason: collision with root package name */
        private final List<za2> f30357a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<za2> result) {
            super(0);
            kotlin.jvm.internal.l.f(result, "result");
            this.f30357a = result;
        }

        public final List<za2> a() {
            return this.f30357a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.l.b(this.f30357a, ((b) obj).f30357a);
        }

        public final int hashCode() {
            return this.f30357a.hashCode();
        }

        public final String toString() {
            return "Success(result=" + this.f30357a + ")";
        }
    }

    private md2() {
    }

    public /* synthetic */ md2(int i) {
        this();
    }
}
