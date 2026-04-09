package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes4.dex */
class c extends m {

    /* renamed from: d, reason: collision with root package name */
    private final int f51940d;

    /* renamed from: e, reason: collision with root package name */
    private final int f51941e;

    private class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        private int f51942a;

        /* renamed from: b, reason: collision with root package name */
        private final int f51943b;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte b() {
            int i10 = this.f51942a;
            if (i10 >= this.f51943b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f52000b;
            this.f51942a = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51942a < this.f51943b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int iG = c.this.G();
            this.f51942a = iG;
            this.f51943b = iG + c.this.size();
        }
    }

    c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (i10 + i11 <= bArr.length) {
            this.f51940d = i10;
            this.f51941e = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append(MqttTopic.SINGLE_LEVEL_WILDCARD);
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    protected int G() {
        return this.f51940d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, java.lang.Iterable
    /* renamed from: I */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void m(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f52000b, G() + i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f51941e;
    }
}
