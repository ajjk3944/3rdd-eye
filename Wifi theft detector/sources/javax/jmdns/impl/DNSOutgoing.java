package javax.jmdns.impl;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.jmdns.impl.constants.DNSConstants;

/* loaded from: classes4.dex */
public final class DNSOutgoing extends DNSMessage {
    private static final int HEADER_SIZE = 12;
    public static boolean USE_DOMAIN_NAME_COMPRESSION = true;
    private final MessageOutputStream _additionalsAnswersBytes;
    private final MessageOutputStream _answersBytes;
    private final MessageOutputStream _authoritativeAnswersBytes;
    private InetSocketAddress _destination;
    private int _maxUDPPayload;
    Map<String, Integer> _names;
    private final MessageOutputStream _questionsBytes;

    public static class MessageOutputStream extends ByteArrayOutputStream {
        private final int _offset;
        private final DNSOutgoing _out;

        public MessageOutputStream(int i10, DNSOutgoing dNSOutgoing) {
            this(i10, dNSOutgoing, 0);
        }

        public void writeByte(int i10) {
            write(i10 & 255);
        }

        public void writeBytes(String str, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                writeByte(str.charAt(i10 + i12));
            }
        }

        public void writeInt(int i10) {
            writeShort(i10 >> 16);
            writeShort(i10);
        }

        public void writeName(String str) {
            writeName(str, true);
        }

        public void writeQuestion(DNSQuestion dNSQuestion) {
            writeName(dNSQuestion.getName());
            writeShort(dNSQuestion.getRecordType().indexValue());
            writeShort(dNSQuestion.getRecordClass().indexValue());
        }

        public void writeRecord(DNSRecord dNSRecord, long j10) throws IOException {
            writeName(dNSRecord.getName());
            writeShort(dNSRecord.getRecordType().indexValue());
            writeShort(dNSRecord.getRecordClass().indexValue() | ((dNSRecord.isUnique() && this._out.isMulticast()) ? 32768 : 0));
            writeInt(j10 == 0 ? dNSRecord.getTTL() : dNSRecord.getRemainingTTL(j10));
            MessageOutputStream messageOutputStream = new MessageOutputStream(512, this._out, this._offset + size() + 2);
            dNSRecord.write(messageOutputStream);
            byte[] byteArray = messageOutputStream.toByteArray();
            writeShort(byteArray.length);
            write(byteArray, 0, byteArray.length);
        }

        public void writeShort(int i10) {
            writeByte(i10 >> 8);
            writeByte(i10);
        }

        public void writeUTF(String str, int i10, int i11) {
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                char cCharAt = str.charAt(i10 + i13);
                i12 = (cCharAt < 1 || cCharAt > 127) ? cCharAt > 2047 ? i12 + 3 : i12 + 2 : i12 + 1;
            }
            writeByte(i12);
            for (int i14 = 0; i14 < i11; i14++) {
                char cCharAt2 = str.charAt(i10 + i14);
                if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                    writeByte(cCharAt2);
                } else if (cCharAt2 > 2047) {
                    writeByte(((cCharAt2 >> '\f') & 15) | 224);
                    writeByte(((cCharAt2 >> 6) & 63) | 128);
                    writeByte((cCharAt2 & '?') | 128);
                } else {
                    writeByte(((cCharAt2 >> 6) & 31) | PsExtractor.AUDIO_STREAM);
                    writeByte((cCharAt2 & '?') | 128);
                }
            }
        }

        public MessageOutputStream(int i10, DNSOutgoing dNSOutgoing, int i11) {
            super(i10);
            this._out = dNSOutgoing;
            this._offset = i11;
        }

        @Override // java.io.ByteArrayOutputStream
        public void writeBytes(byte[] bArr) {
            if (bArr != null) {
                writeBytes(bArr, 0, bArr.length);
            }
        }

        public void writeName(String str, boolean z10) {
            while (true) {
                int iIndexOf = str.indexOf(46);
                if (iIndexOf < 0) {
                    iIndexOf = str.length();
                }
                if (iIndexOf <= 0) {
                    writeByte(0);
                    return;
                }
                String strSubstring = str.substring(0, iIndexOf);
                if (z10 && DNSOutgoing.USE_DOMAIN_NAME_COMPRESSION) {
                    Integer num = this._out._names.get(str);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        writeByte((iIntValue >> 8) | PsExtractor.AUDIO_STREAM);
                        writeByte(iIntValue & 255);
                        return;
                    }
                    this._out._names.put(str, Integer.valueOf(size() + this._offset));
                    writeUTF(strSubstring, 0, strSubstring.length());
                } else {
                    writeUTF(strSubstring, 0, strSubstring.length());
                }
                str = str.substring(iIndexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }

        public void writeBytes(byte[] bArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                writeByte(bArr[i10 + i12]);
            }
        }
    }

    public DNSOutgoing(int i10) {
        this(i10, true, DNSConstants.MAX_MSG_TYPICAL);
    }

    public void addAdditionalAnswer(DNSIncoming dNSIncoming, DNSRecord dNSRecord) throws IOException {
        MessageOutputStream messageOutputStream = new MessageOutputStream(512, this);
        messageOutputStream.writeRecord(dNSRecord, 0L);
        byte[] byteArray = messageOutputStream.toByteArray();
        messageOutputStream.close();
        if (byteArray.length >= availableSpace()) {
            throw new IOException("message full");
        }
        this._additionals.add(dNSRecord);
        this._additionalsAnswersBytes.write(byteArray, 0, byteArray.length);
    }

    public void addAnswer(DNSIncoming dNSIncoming, DNSRecord dNSRecord) throws IOException {
        if (dNSIncoming == null || !dNSRecord.suppressedBy(dNSIncoming)) {
            addAnswer(dNSRecord, 0L);
        }
    }

    public void addAuthorativeAnswer(DNSRecord dNSRecord) throws IOException {
        MessageOutputStream messageOutputStream = new MessageOutputStream(512, this);
        messageOutputStream.writeRecord(dNSRecord, 0L);
        byte[] byteArray = messageOutputStream.toByteArray();
        messageOutputStream.close();
        if (byteArray.length >= availableSpace()) {
            throw new IOException("message full");
        }
        this._authoritativeAnswers.add(dNSRecord);
        this._authoritativeAnswersBytes.write(byteArray, 0, byteArray.length);
    }

    public void addQuestion(DNSQuestion dNSQuestion) throws IOException {
        MessageOutputStream messageOutputStream = new MessageOutputStream(512, this);
        messageOutputStream.writeQuestion(dNSQuestion);
        byte[] byteArray = messageOutputStream.toByteArray();
        messageOutputStream.close();
        if (byteArray.length >= availableSpace()) {
            throw new IOException("message full");
        }
        this._questions.add(dNSQuestion);
        this._questionsBytes.write(byteArray, 0, byteArray.length);
    }

    public int availableSpace() {
        return ((((this._maxUDPPayload - 12) - this._questionsBytes.size()) - this._answersBytes.size()) - this._authoritativeAnswersBytes.size()) - this._additionalsAnswersBytes.size();
    }

    public byte[] data() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this._names.clear();
        MessageOutputStream messageOutputStream = new MessageOutputStream(this._maxUDPPayload, this);
        messageOutputStream.writeShort(this._multicast ? 0 : getId());
        messageOutputStream.writeShort(getFlags());
        messageOutputStream.writeShort(getNumberOfQuestions());
        messageOutputStream.writeShort(getNumberOfAnswers());
        messageOutputStream.writeShort(getNumberOfAuthorities());
        messageOutputStream.writeShort(getNumberOfAdditionals());
        Iterator<DNSQuestion> it = this._questions.iterator();
        while (it.hasNext()) {
            messageOutputStream.writeQuestion(it.next());
        }
        Iterator<DNSRecord> it2 = this._answers.iterator();
        while (it2.hasNext()) {
            messageOutputStream.writeRecord(it2.next(), jCurrentTimeMillis);
        }
        Iterator<DNSRecord> it3 = this._authoritativeAnswers.iterator();
        while (it3.hasNext()) {
            messageOutputStream.writeRecord(it3.next(), jCurrentTimeMillis);
        }
        Iterator<DNSRecord> it4 = this._additionals.iterator();
        while (it4.hasNext()) {
            messageOutputStream.writeRecord(it4.next(), jCurrentTimeMillis);
        }
        byte[] byteArray = messageOutputStream.toByteArray();
        try {
            messageOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public InetSocketAddress getDestination() {
        return this._destination;
    }

    public int getMaxUDPPayload() {
        return this._maxUDPPayload;
    }

    public String print(boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append(print());
        if (z10) {
            sb.append(print(data()));
        }
        return sb.toString();
    }

    public void setDestination(InetSocketAddress inetSocketAddress) {
        this._destination = inetSocketAddress;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(isQuery() ? "dns[query:" : "dns[response:");
        stringBuffer.append(" id=0x");
        stringBuffer.append(Integer.toHexString(getId()));
        if (getFlags() != 0) {
            stringBuffer.append(", flags=0x");
            stringBuffer.append(Integer.toHexString(getFlags()));
            if (isResponse()) {
                stringBuffer.append(":r");
            }
            if (isAuthoritativeAnswer()) {
                stringBuffer.append(":aa");
            }
            if (isTruncated()) {
                stringBuffer.append(":tc");
            }
        }
        if (getNumberOfQuestions() > 0) {
            stringBuffer.append(", questions=");
            stringBuffer.append(getNumberOfQuestions());
        }
        if (getNumberOfAnswers() > 0) {
            stringBuffer.append(", answers=");
            stringBuffer.append(getNumberOfAnswers());
        }
        if (getNumberOfAuthorities() > 0) {
            stringBuffer.append(", authorities=");
            stringBuffer.append(getNumberOfAuthorities());
        }
        if (getNumberOfAdditionals() > 0) {
            stringBuffer.append(", additionals=");
            stringBuffer.append(getNumberOfAdditionals());
        }
        if (getNumberOfQuestions() > 0) {
            stringBuffer.append("\nquestions:");
            for (DNSQuestion dNSQuestion : this._questions) {
                stringBuffer.append("\n\t");
                stringBuffer.append(dNSQuestion);
            }
        }
        if (getNumberOfAnswers() > 0) {
            stringBuffer.append("\nanswers:");
            for (DNSRecord dNSRecord : this._answers) {
                stringBuffer.append("\n\t");
                stringBuffer.append(dNSRecord);
            }
        }
        if (getNumberOfAuthorities() > 0) {
            stringBuffer.append("\nauthorities:");
            for (DNSRecord dNSRecord2 : this._authoritativeAnswers) {
                stringBuffer.append("\n\t");
                stringBuffer.append(dNSRecord2);
            }
        }
        if (getNumberOfAdditionals() > 0) {
            stringBuffer.append("\nadditionals:");
            for (DNSRecord dNSRecord3 : this._additionals) {
                stringBuffer.append("\n\t");
                stringBuffer.append(dNSRecord3);
            }
        }
        stringBuffer.append("\nnames=");
        stringBuffer.append(this._names);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public DNSOutgoing(int i10, boolean z10) {
        this(i10, z10, DNSConstants.MAX_MSG_TYPICAL);
    }

    public DNSOutgoing(int i10, boolean z10, int i11) {
        super(i10, 0, z10);
        this._names = new HashMap();
        this._maxUDPPayload = i11 > 0 ? i11 : DNSConstants.MAX_MSG_TYPICAL;
        this._questionsBytes = new MessageOutputStream(i11, this);
        this._answersBytes = new MessageOutputStream(i11, this);
        this._authoritativeAnswersBytes = new MessageOutputStream(i11, this);
        this._additionalsAnswersBytes = new MessageOutputStream(i11, this);
    }

    public void addAnswer(DNSRecord dNSRecord, long j10) throws IOException {
        if (dNSRecord != null) {
            if (j10 == 0 || !dNSRecord.isExpired(j10)) {
                MessageOutputStream messageOutputStream = new MessageOutputStream(512, this);
                messageOutputStream.writeRecord(dNSRecord, j10);
                byte[] byteArray = messageOutputStream.toByteArray();
                messageOutputStream.close();
                if (byteArray.length < availableSpace()) {
                    this._answers.add(dNSRecord);
                    this._answersBytes.write(byteArray, 0, byteArray.length);
                    return;
                }
                throw new IOException("message full");
            }
        }
    }
}
