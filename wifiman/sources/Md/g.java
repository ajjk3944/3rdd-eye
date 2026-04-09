package Md;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13109a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(a aVar, String str, int i10, Integer num, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                num = null;
            }
            return aVar.a(str, i10, num);
        }

        public final String a(String imageId, int i10, Integer num) {
            AbstractC6492s.i(imageId, "imageId");
            b bVar = b.f13110b;
            if (i10 == bVar.b()) {
                return bVar.c(imageId, num);
            }
            c cVar = c.f13113b;
            if (i10 == cVar.b()) {
                return cVar.c(imageId, num);
            }
            Z7.b.e("Unsupported image engine " + i10, null, null, 6, null);
            return null;
        }

        private a() {
        }
    }

    public static final class b extends g {

        /* renamed from: c, reason: collision with root package name */
        private static final int f13111c = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final b f13110b = new b();

        /* renamed from: d, reason: collision with root package name */
        private static final int f13112d = 257;

        private b() {
            super(null);
        }

        protected int a() {
            return f13112d;
        }

        public int b() {
            return f13111c;
        }

        public String c(String iconId, Integer num) {
            AbstractC6492s.i(iconId, "iconId");
            return "https://static.ubnt.com/fingerprint/" + b() + MqttTopic.TOPIC_LEVEL_SEPARATOR + iconId + "_" + (num != null ? num.intValue() : a()) + "x" + (num != null ? num.intValue() : a()) + ".png";
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -27652334;
        }

        public String toString() {
            return "Legacy";
        }
    }

    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final c f13113b = new c();

        /* renamed from: c, reason: collision with root package name */
        private static final int f13114c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f13115d = 257;

        private c() {
            super(null);
        }

        protected int a() {
            return f13115d;
        }

        public int b() {
            return f13114c;
        }

        public String c(String iconId, Integer num) {
            AbstractC6492s.i(iconId, "iconId");
            return "https://static.ui.com/fingerprint/ui/icons/" + iconId + "_" + (num != null ? num.intValue() : a()) + "x" + (num != null ? num.intValue() : a()) + ".png";
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -218752101;
        }

        public String toString() {
            return "UiDB";
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private g() {
    }
}
