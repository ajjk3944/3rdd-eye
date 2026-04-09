package com.ubnt.usurvey.ui.teleport.deeplink;

import gg.AbstractC5912b;
import gg.i;
import i8.s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: com.ubnt.usurvey.ui.teleport.deeplink.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1276a {

        /* renamed from: com.ubnt.usurvey.ui.teleport.deeplink.a$a$a, reason: collision with other inner class name */
        public static final class C1277a extends AbstractC1276a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1277a f41031a = new C1277a();

            private C1277a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1277a);
            }

            public int hashCode() {
                return -1218280157;
            }

            public String toString() {
                return "Idle";
            }
        }

        /* renamed from: com.ubnt.usurvey.ui.teleport.deeplink.a$a$b */
        public static final class b extends AbstractC1276a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f41032a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1218444578;
            }

            public String toString() {
                return "Processing";
            }
        }

        public /* synthetic */ AbstractC1276a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1276a() {
        }
    }

    AbstractC5912b a();

    AbstractC5912b b(s.f fVar);

    i getState();
}
