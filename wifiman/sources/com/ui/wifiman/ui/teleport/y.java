package com.ui.wifiman.ui.teleport;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class y {

    public static final class a extends y {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45163a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 195011506;
        }

        public String toString() {
            return "Connected";
        }
    }

    public static final class b extends y {

        /* renamed from: a, reason: collision with root package name */
        private final float f45164a;

        public b(float f10) {
            super(null);
            this.f45164a = f10;
        }

        public final float a() {
            return this.f45164a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f45164a, ((b) obj).f45164a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f45164a);
        }

        public String toString() {
            return "Connecting(progress=" + this.f45164a + ")";
        }
    }

    public static final class c extends y {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45165a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -508374798;
        }

        public String toString() {
            return "Disconnected";
        }
    }

    public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private y() {
    }
}
