package com.ui.wifiman.ui.teleport;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.ui.wifiman.ui.teleport.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5250c {

    /* renamed from: com.ui.wifiman.ui.teleport.c$a */
    public static final class a extends AbstractC5250c {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f45009a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f45010b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f45011c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s9.d title, boolean z10, boolean z11) {
            super(null);
            AbstractC6492s.i(title, "title");
            this.f45009a = title;
            this.f45010b = z10;
            this.f45011c = z11;
        }

        public final boolean a() {
            return this.f45011c;
        }

        public s9.d b() {
            return this.f45009a;
        }

        public final boolean c() {
            return this.f45010b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f45009a, aVar.f45009a) && this.f45010b == aVar.f45010b && this.f45011c == aVar.f45011c;
        }

        public int hashCode() {
            return (((this.f45009a.hashCode() * 31) + Boolean.hashCode(this.f45010b)) * 31) + Boolean.hashCode(this.f45011c);
        }

        public String toString() {
            return "Dropdown(title=" + this.f45009a + ", isEditable=" + this.f45010b + ", inEditMode=" + this.f45011c + ")";
        }
    }

    /* renamed from: com.ui.wifiman.ui.teleport.c$b */
    public static final class b extends AbstractC5250c {

        /* renamed from: a, reason: collision with root package name */
        private final s9.d f45012a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s9.d title) {
            super(null);
            AbstractC6492s.i(title, "title");
            this.f45012a = title;
        }

        public s9.d a() {
            return this.f45012a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f45012a, ((b) obj).f45012a);
        }

        public int hashCode() {
            return this.f45012a.hashCode();
        }

        public String toString() {
            return "Text(title=" + this.f45012a + ")";
        }
    }

    public /* synthetic */ AbstractC5250c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5250c() {
    }
}
