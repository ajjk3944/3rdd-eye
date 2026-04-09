package p5;

import Ti.a;
import Ti.g;
import android.util.Log;
import dh.InterfaceC5380e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.PduHandle;
import p5.b;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7229a {

    /* renamed from: a, reason: collision with root package name */
    public static final C7229a f57670a = new C7229a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f57671b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: p5.a$a, reason: collision with other inner class name */
    private static final class C2028a {

        /* renamed from: a, reason: collision with root package name */
        private final Ti.a f57672a;

        /* renamed from: b, reason: collision with root package name */
        private p5.b f57673b;

        public C2028a(Ti.a mutex, p5.b bVar) {
            AbstractC6492s.i(mutex, "mutex");
            this.f57672a = mutex;
            this.f57673b = bVar;
        }

        public final Ti.a a() {
            return this.f57672a;
        }

        public final p5.b b() {
            return this.f57673b;
        }

        public final void c(p5.b bVar) {
            this.f57673b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2028a)) {
                return false;
            }
            C2028a c2028a = (C2028a) obj;
            return AbstractC6492s.d(this.f57672a, c2028a.f57672a) && AbstractC6492s.d(this.f57673b, c2028a.f57673b);
        }

        public int hashCode() {
            int iHashCode = this.f57672a.hashCode() * 31;
            p5.b bVar = this.f57673b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f57672a + ", subscriber=" + this.f57673b + ')';
        }

        public /* synthetic */ C2028a(Ti.a aVar, p5.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i10 & 2) != 0 ? null : bVar);
        }
    }

    /* renamed from: p5.a$b */
    static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f57674a;

        /* renamed from: b, reason: collision with root package name */
        Object f57675b;

        /* renamed from: c, reason: collision with root package name */
        Object f57676c;

        /* renamed from: d, reason: collision with root package name */
        Object f57677d;

        /* renamed from: e, reason: collision with root package name */
        Object f57678e;

        /* renamed from: f, reason: collision with root package name */
        Object f57679f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f57680g;

        /* renamed from: i, reason: collision with root package name */
        int f57682i;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57680g = obj;
            this.f57682i |= PduHandle.NONE;
            return C7229a.this.c(this);
        }
    }

    private C7229a() {
    }

    public static final void a(b.a subscriberName) {
        AbstractC6492s.i(subscriberName, "subscriberName");
        if (subscriberName == b.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map dependencies = f57671b;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
            return;
        }
        AbstractC6492s.h(dependencies, "dependencies");
        dependencies.put(subscriberName, new C2028a(g.a(true), null, 2, 0 == true ? 1 : 0));
        Log.d("SessionsDependencies", "Dependency to " + subscriberName + " added.");
    }

    private final C2028a b(b.a aVar) {
        Map dependencies = f57671b;
        AbstractC6492s.h(dependencies, "dependencies");
        Object obj = dependencies.get(aVar);
        if (obj != null) {
            AbstractC6492s.h(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C2028a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(p5.b subscriber) {
        AbstractC6492s.i(subscriber, "subscriber");
        b.a aVarC = subscriber.c();
        C2028a c2028aB = f57670a.b(aVarC);
        if (c2028aB.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + aVarC + " already registered.");
            return;
        }
        c2028aB.c(subscriber);
        Log.d("SessionsDependencies", "Subscriber " + aVarC + " registered.");
        a.C0811a.c(c2028aB.a(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a3 -> B:27:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(dh.InterfaceC5380e r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof p5.C7229a.b
            if (r0 == 0) goto L13
            r0 = r11
            p5.a$b r0 = (p5.C7229a.b) r0
            int r1 = r0.f57682i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57682i = r1
            goto L18
        L13:
            p5.a$b r0 = new p5.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f57680g
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f57682i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L49
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f57679f
            java.lang.Object r5 = r0.f57678e
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f57677d
            Ti.a r6 = (Ti.a) r6
            java.lang.Object r7 = r0.f57676c
            p5.b$a r7 = (p5.b.a) r7
            java.lang.Object r8 = r0.f57675b
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f57674a
            java.util.Map r9 = (java.util.Map) r9
            Yg.v.b(r11)
            goto La4
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L49:
            Yg.v.b(r11)
            java.util.Map r11 = p5.C7229a.f57671b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.AbstractC6492s.h(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = Zg.U.d(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6d:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb7
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            p5.b$a r7 = (p5.b.a) r7
            java.lang.Object r11 = r11.getValue()
            p5.a$a r11 = (p5.C7229a.C2028a) r11
            Ti.a r6 = r11.a()
            r0.f57674a = r5
            r0.f57675b = r8
            r0.f57676c = r7
            r0.f57677d = r6
            r0.f57678e = r5
            r0.f57679f = r2
            r0.f57682i = r3
            java.lang.Object r11 = r6.a(r4, r0)
            if (r11 != r1) goto La3
            return r1
        La3:
            r9 = r5
        La4:
            p5.a r11 = p5.C7229a.f57670a     // Catch: java.lang.Throwable -> Lb2
            p5.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb2
            r6.d(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6d
        Lb2:
            r11 = move-exception
            r6.d(r4)
            throw r11
        Lb7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.C7229a.c(dh.e):java.lang.Object");
    }

    public final p5.b d(b.a subscriberName) {
        AbstractC6492s.i(subscriberName, "subscriberName");
        p5.b bVarB = b(subscriberName).b();
        if (bVarB != null) {
            return bVarB;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
