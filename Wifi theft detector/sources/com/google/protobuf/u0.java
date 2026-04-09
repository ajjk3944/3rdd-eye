package com.google.protobuf;

/* loaded from: classes3.dex */
public final class u0 {

    public class a implements c {
        final /* synthetic */ ByteString val$input;

        public a(ByteString byteString) {
            this.val$input = byteString;
        }

        @Override // com.google.protobuf.u0.c
        public byte byteAt(int i10) {
            return this.val$input.byteAt(i10);
        }

        @Override // com.google.protobuf.u0.c
        public int size() {
            return this.val$input.size();
        }
    }

    public class b implements c {
        final /* synthetic */ byte[] val$input;

        public b(byte[] bArr) {
            this.val$input = bArr;
        }

        @Override // com.google.protobuf.u0.c
        public byte byteAt(int i10) {
            return this.val$input[i10];
        }

        @Override // com.google.protobuf.u0.c
        public int size() {
            return this.val$input.length;
        }
    }

    public interface c {
        byte byteAt(int i10);

        int size();
    }

    private u0() {
    }

    public static String escapeBytes(c cVar) {
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte bByteAt = cVar.byteAt(i10);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bByteAt);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static String escapeBytes(ByteString byteString) {
        return escapeBytes(new a(byteString));
    }

    public static String escapeBytes(byte[] bArr) {
        return escapeBytes(new b(bArr));
    }
}
