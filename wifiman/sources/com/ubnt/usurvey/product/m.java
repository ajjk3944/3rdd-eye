package com.ubnt.usurvey.product;

import ab.C3781d;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.net.URI;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class m {

    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        private final int f40767a;

        public a(int i10) {
            super(null);
            this.f40767a = i10;
        }

        public final int a() {
            return this.f40767a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f40767a == ((a) obj).f40767a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f40767a);
        }

        public String toString() {
            return "Local(res=" + this.f40767a + ")";
        }
    }

    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        private final URI f40768a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(URI url) {
            super(null);
            AbstractC6492s.i(url, "url");
            this.f40768a = url;
        }

        public final URI a() {
            return this.f40768a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f40768a, ((b) obj).f40768a);
        }

        public int hashCode() {
            return this.f40768a.hashCode();
        }

        public String toString() {
            return "Remote(url=" + this.f40768a + ")";
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private m() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final int size;
        private final C3781d.a.b variant;
        public static final c SMALL = new c("SMALL", 0, 40, null, 2, null);
        public static final c NORMAL = new c("NORMAL", 1, 81, null, 2, null);

        private static final /* synthetic */ c[] $values() {
            return new c[]{SMALL, NORMAL};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10, int i11, C3781d.a.b bVar) {
            this.size = i11;
            this.variant = bVar;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final int getSize() {
            return this.size;
        }

        public final C3781d.a.b getVariant() {
            return this.variant;
        }

        /* synthetic */ c(String str, int i10, int i11, C3781d.a.b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, i11, (i12 & 2) != 0 ? C3781d.a.b.C0990b.f25870b : bVar);
        }
    }
}
