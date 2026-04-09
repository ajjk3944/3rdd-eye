package com.ui.btle.v2;

import Yg.H;
import com.ui.btle.v2.BTLEv2$Error;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class e {

    public static abstract class a extends e {

        /* renamed from: com.ui.btle.v2.e$a$a, reason: collision with other inner class name */
        public static final class C1287a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1287a f41130a = new C1287a();

            private C1287a() {
                super(null);
            }

            public int a() {
                return 2;
            }

            public short b(ByteBuffer frame) {
                AbstractC6492s.i(frame, "frame");
                try {
                    return H.b(frame.getShort());
                } catch (BufferUnderflowException e10) {
                    throw new BTLEv2$Error.Protocol.InvalidPacketFragmentLength("Failed to parse Frame length from packet fragment of length " + frame.array().length, e10);
                }
            }

            public void c(ByteBuffer frame, short s10) {
                AbstractC6492s.i(frame, "frame");
                try {
                    frame.putShort(s10);
                } catch (BufferOverflowException e10) {
                    throw new BTLEv2$Error.Protocol.InvalidPacketFragmentLength("Failed to write Frame length " + H.g(s10) + " to packet fragment of length " + frame.array().length, e10);
                }
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f41131a = new b();

            private b() {
                super(null);
            }

            public int a() {
                return 1;
            }

            public com.ui.btle.v2.c b(ByteBuffer frame) {
                AbstractC6492s.i(frame, "frame");
                try {
                    return com.ui.btle.v2.c.Companion.a(frame.get());
                } catch (BufferUnderflowException e10) {
                    throw new BTLEv2$Error.Protocol.InvalidPacketFragmentLength("Failed to parse Protocol from packet fragment of length " + frame.array().length, e10);
                }
            }

            public void c(ByteBuffer frame, com.ui.btle.v2.c value) {
                AbstractC6492s.i(frame, "frame");
                AbstractC6492s.i(value, "value");
                try {
                    frame.put(value.getId());
                } catch (BufferOverflowException e10) {
                    throw new BTLEv2$Error.Protocol.InvalidPacketFragmentLength("Failed to write Protocol " + value + " to packet fragment of length " + frame.array().length, e10);
                }
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f41132a = new c();

            private c() {
                super(null);
            }

            public int a() {
                return 2;
            }

            public short b(ByteBuffer frame) {
                AbstractC6492s.i(frame, "frame");
                try {
                    return H.b(frame.getShort());
                } catch (BufferUnderflowException e10) {
                    throw new BTLEv2$Error.Protocol.InvalidPacketFragmentLength("Failed to parse Sequence Number from packet fragment of length " + frame.array().length, e10);
                }
            }

            public void c(ByteBuffer frame, short s10) {
                AbstractC6492s.i(frame, "frame");
                try {
                    frame.putShort(s10);
                } catch (BufferOverflowException e10) {
                    throw new BTLEv2$Error.Protocol.InvalidPacketFragmentLength("Failed to write Sequence Number " + H.g(s10) + " to packet fragment of length " + frame.array().length, e10);
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f41133a = new b();

        private b() {
            super(null);
        }

        public byte[] a(ByteBuffer frame) {
            AbstractC6492s.i(frame, "frame");
            byte[] bArr = new byte[frame.remaining()];
            frame.get(bArr, 0, frame.remaining());
            return bArr;
        }

        public void b(ByteBuffer frame, byte[] value) {
            AbstractC6492s.i(frame, "frame");
            AbstractC6492s.i(value, "value");
            try {
                frame.put(value);
            } catch (BufferOverflowException e10) {
                throw new BTLEv2$Error.Protocol.InvalidPacketFragmentLength("Failed to write Payload (size:" + value.length + " to packet fragment of length " + frame.array().length, e10);
            }
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
