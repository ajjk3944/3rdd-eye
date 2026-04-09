package zj;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.msgpack.core.MessageStringCodingException;
import yj.n;
import yj.o;
import yj.s;

/* loaded from: classes2.dex */
public abstract class a extends b implements s, o {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f67383d = "0123456789ABCDEF".toCharArray();

    /* renamed from: a, reason: collision with root package name */
    protected final byte[] f67384a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f67385b;

    /* renamed from: c, reason: collision with root package name */
    private volatile CharacterCodingException f67386c;

    public a(byte[] bArr) {
        this.f67384a = bArr;
    }

    static void X(StringBuilder sb2, String str) {
        sb2.append("\"");
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ') {
                switch (cCharAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    case 11:
                    default:
                        a0(sb2, cCharAt);
                        break;
                    case '\f':
                        sb2.append("\\f");
                        break;
                    case '\r':
                        sb2.append("\\r");
                        break;
                }
            } else if (cCharAt <= 127) {
                if (cCharAt == '\"') {
                    sb2.append("\\\"");
                } else if (cCharAt != '\\') {
                    sb2.append(cCharAt);
                } else {
                    sb2.append("\\\\");
                }
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                sb2.append(cCharAt);
            } else {
                a0(sb2, cCharAt);
            }
        }
        sb2.append("\"");
    }

    private void Z() {
        synchronized (this.f67384a) {
            if (this.f67385b != null) {
                return;
            }
            try {
                CharsetDecoder charsetDecoderNewDecoder = org.msgpack.core.d.f56993a.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                this.f67385b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(Y()).toString();
            } catch (CharacterCodingException e10) {
                try {
                    CharsetDecoder charsetDecoderNewDecoder2 = org.msgpack.core.d.f56993a.newDecoder();
                    CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
                    this.f67385b = charsetDecoderNewDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(Y()).toString();
                    this.f67386c = e10;
                } catch (CharacterCodingException e11) {
                    throw new MessageStringCodingException(e11);
                }
            }
        }
    }

    private static void a0(StringBuilder sb2, int i10) {
        sb2.append("\\u");
        char[] cArr = f67383d;
        sb2.append(cArr[(i10 >> 12) & 15]);
        sb2.append(cArr[(i10 >> 8) & 15]);
        sb2.append(cArr[(i10 >> 4) & 15]);
        sb2.append(cArr[i10 & 15]);
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean C() {
        return super.C();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean G() {
        return super.G();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean I() {
        return super.I();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean N() {
        return super.N();
    }

    @Override // zj.b
    /* renamed from: O */
    public /* bridge */ /* synthetic */ yj.f i() {
        return super.i();
    }

    @Override // zj.b
    /* renamed from: Q */
    public /* bridge */ /* synthetic */ yj.g F() {
        return super.F();
    }

    @Override // zj.b
    /* renamed from: R */
    public /* bridge */ /* synthetic */ yj.h M() {
        return super.M();
    }

    @Override // zj.b
    /* renamed from: S */
    public /* bridge */ /* synthetic */ yj.i D() {
        return super.D();
    }

    @Override // zj.b
    /* renamed from: T */
    public /* bridge */ /* synthetic */ yj.j A() {
        return super.A();
    }

    @Override // zj.b
    /* renamed from: U */
    public /* bridge */ /* synthetic */ yj.k x() {
        return super.x();
    }

    @Override // zj.b
    /* renamed from: V */
    public /* bridge */ /* synthetic */ yj.l o() {
        return super.o();
    }

    @Override // zj.b
    /* renamed from: W */
    public /* bridge */ /* synthetic */ n L() {
        return super.L();
    }

    public ByteBuffer Y() {
        return ByteBuffer.wrap(this.f67384a).asReadOnlyBuffer();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // yj.u
    public String g() {
        StringBuilder sb2 = new StringBuilder();
        X(sb2, toString());
        return sb2.toString();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    public String toString() {
        if (this.f67385b == null) {
            Z();
        }
        return this.f67385b;
    }

    @Override // yj.s
    public byte[] u() {
        byte[] bArr = this.f67384a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean v() {
        return super.v();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean y() {
        return super.y();
    }

    @Override // zj.b, yj.u
    public /* bridge */ /* synthetic */ boolean z() {
        return super.z();
    }

    public a(String str) {
        this.f67385b = str;
        this.f67384a = str.getBytes(org.msgpack.core.d.f56993a);
    }
}
