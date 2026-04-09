package jf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: jf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6321d {

    /* renamed from: jf.d$a */
    public static final class a extends AbstractC6321d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f50822a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -54294081;
        }

        public String toString() {
            return "Content";
        }
    }

    /* renamed from: jf.d$b */
    public static final class b extends AbstractC6321d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f50823a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -669174142;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC6321d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6321d() {
    }
}
