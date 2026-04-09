package com.survicate.surveys.infrastructure.serialization;

import br.x;
import gu.a;
import h0.b;
import iu.d;
import iu.e;
import kotlin.Metadata;
import ku.a0;
import lu.l;
import lu.m;
import lu.n;
import lu.p;
import mu.k;
import mu.y;
import on.h;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/IntegrationPayloadSerializer;", "Lgu/a;", "Lon/h;", "<init>", "()V", "Lju/d;", "encoder", "value", "Llq/b0;", "serialize", "(Lju/d;Lon/h;)V", "Lju/c;", "decoder", "deserialize", "(Lju/c;)Lon/h;", "Liu/e;", "descriptor", "Liu/e;", "getDescriptor", "()Liu/e;", "getDescriptor$annotations", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntegrationPayloadSerializer implements a {
    public static final IntegrationPayloadSerializer INSTANCE = new IntegrationPayloadSerializer();
    private static final e descriptor;

    static {
        e descriptor2 = l.Companion.serializer().getDescriptor();
        br.l.e(descriptor2, "original");
        if (tt.l.D0("com.survicate.surveys.IntegrationPayload")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (descriptor2.f() instanceof d) {
            throw new IllegalArgumentException("For primitive descriptors please use 'PrimitiveSerialDescriptor' instead");
        }
        if (!"com.survicate.surveys.IntegrationPayload".equals(descriptor2.h())) {
            descriptor = new iu.l(descriptor2);
            return;
        }
        throw new IllegalArgumentException(("The name of the wrapped descriptor (com.survicate.surveys.IntegrationPayload) cannot be the same as the name of the original descriptor (" + descriptor2.h() + ')').toString());
    }

    private IntegrationPayloadSerializer() {
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // gu.a
    public e getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    @Override // gu.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public on.h deserialize(ju.c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "decoder"
            br.l.e(r6, r0)
            boolean r0 = r6 instanceof lu.j
            if (r0 == 0) goto Lbb
            lu.j r6 = (lu.j) r6
            lu.l r6 = r6.j()
            boolean r0 = r6 instanceof lu.a0
            if (r0 == 0) goto La7
            lu.a0 r6 = (lu.a0) r6
            java.lang.Boolean r0 = lu.m.a(r6)
            if (r0 == 0) goto L25
            boolean r6 = r0.booleanValue()
            on.h r0 = new on.h
            r0.<init>(r6)
            return r0
        L25:
            r0 = 0
            bj.c r1 = new bj.c     // Catch: mu.h -> L38
            java.lang.String r2 = r6.a()     // Catch: mu.h -> L38
            r1.<init>(r2)     // Catch: mu.h -> L38
            long r1 = r1.o()     // Catch: mu.h -> L38
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: mu.h -> L38
            goto L39
        L38:
            r1 = r0
        L39:
            if (r1 == 0) goto L53
            long r1 = r1.longValue()
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L53
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L53
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L54
        L53:
            r1 = r0
        L54:
            if (r1 == 0) goto L64
            int r6 = r1.intValue()
            on.h r0 = new on.h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.<init>(r6)
            return r0
        L64:
            bj.c r1 = new bj.c     // Catch: mu.h -> L75
            java.lang.String r2 = r6.a()     // Catch: mu.h -> L75
            r1.<init>(r2)     // Catch: mu.h -> L75
            long r1 = r1.o()     // Catch: mu.h -> L75
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch: mu.h -> L75
        L75:
            if (r0 == 0) goto L85
            long r0 = r0.longValue()
            on.h r6 = new on.h
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.<init>(r0)
            return r6
        L85:
            java.lang.String r0 = r6.a()
            java.lang.Double r0 = tt.r.d0(r0)
            if (r0 == 0) goto L9d
            double r0 = r0.doubleValue()
            on.h r6 = new on.h
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r6.<init>(r0)
            return r6
        L9d:
            on.h r0 = new on.h
            java.lang.String r6 = r6.a()
            r0.<init>(r6)
            return r0
        La7:
            gu.e r0 = new gu.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected JsonPrimitive but got: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        Lbb:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "IntegrationPayloadSerializer only works with JSON"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.survicate.surveys.infrastructure.serialization.IntegrationPayloadSerializer.deserialize(ju.c):on.h");
    }

    @Override // gu.a
    public void serialize(ju.d encoder, h value) {
        p pVar;
        br.l.e(encoder, "encoder");
        br.l.e(value, "value");
        if (!(encoder instanceof y)) {
            throw new IllegalArgumentException("IntegrationPayloadSerializer only works with JSON");
        }
        Object objA = value.getValue();
        if (objA instanceof String) {
            a0 a0Var = m.f15950a;
            pVar = new p((String) objA, true);
        } else if (objA instanceof Boolean) {
            a0 a0Var2 = m.f15950a;
            pVar = new p((Boolean) objA, false);
        } else {
            if (!(objA instanceof Number)) {
                StringBuilder sb2 = new StringBuilder("Unsupported type: ");
                throw new gu.e(b.k(x.f2918a, objA.getClass(), sb2));
            }
            a0 a0Var3 = m.f15950a;
            pVar = new p((Number) objA, false);
        }
        y yVar = (y) encoder;
        if (yVar.f17055h == null) {
            yVar.l(n.f15951a, pVar);
            return;
        }
        StringBuilder sbU = c7.a.u("Class with serial name ", yVar.f17056i, " cannot be serialized polymorphically because it is represented as ");
        sbU.append(x.f2918a.b(pVar.getClass()).p());
        sbU.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new k(sbU.toString());
    }
}
