package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public abstract class w {
    public static final void a(z9.a aVar, d0 writer, kotlinx.serialization.e serializer, Object obj) {
        kotlin.jvm.internal.p.e(aVar, "<this>");
        kotlin.jvm.internal.p.e(writer, "writer");
        kotlin.jvm.internal.p.e(serializer, "serializer");
        new h0(writer, aVar, WriteMode.OBJ, new z9.i[WriteMode.values().length]).e(serializer, obj);
    }
}
