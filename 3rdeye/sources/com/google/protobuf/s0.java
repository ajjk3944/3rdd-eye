package com.google.protobuf;

/* compiled from: TextFormatEscaper.java */
/* loaded from: classes2.dex */
public final class s0 {

    /* compiled from: TextFormatEscaper.java */
    public class a implements c {
        final /* synthetic */ AbstractC4026i val$input;

        public a(AbstractC4026i abstractC4026i) {
            this.val$input = abstractC4026i;
        }

        @Override // com.google.protobuf.s0.c
        public byte byteAt(int i) {
            return this.val$input.byteAt(i);
        }

        @Override // com.google.protobuf.s0.c
        public int size() {
            return this.val$input.size();
        }
    }

    /* compiled from: TextFormatEscaper.java */
    public class b implements c {
        final /* synthetic */ byte[] val$input;

        public b(byte[] bArr) {
            this.val$input = bArr;
        }

        @Override // com.google.protobuf.s0.c
        public byte byteAt(int i) {
            return this.val$input[i];
        }

        @Override // com.google.protobuf.s0.c
        public int size() {
            return this.val$input.length;
        }
    }

    /* compiled from: TextFormatEscaper.java */
    public interface c {
        byte byteAt(int i);

        int size();
    }

    private s0() {
    }

    public static String escapeBytes(c cVar) {
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i = 0; i < cVar.size(); i++) {
            byte bByteAt = cVar.byteAt(i);
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
        return escapeBytes(AbstractC4026i.copyFromUtf8(str));
    }

    public static String escapeBytes(AbstractC4026i abstractC4026i) {
        return escapeBytes(new a(abstractC4026i));
    }

    public static String escapeBytes(byte[] bArr) {
        return escapeBytes(new b(bArr));
    }
}
