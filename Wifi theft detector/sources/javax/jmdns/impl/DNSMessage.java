package javax.jmdns.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.jmdns.impl.constants.DNSConstants;

/* loaded from: classes4.dex */
public abstract class DNSMessage {
    public static final boolean MULTICAST = true;
    public static final boolean UNICAST = false;
    private int _flags;
    private int _id;
    boolean _multicast;
    protected final List<DNSQuestion> _questions = Collections.synchronizedList(new LinkedList());
    protected final List<DNSRecord> _answers = Collections.synchronizedList(new LinkedList());
    protected final List<DNSRecord> _authoritativeAnswers = Collections.synchronizedList(new LinkedList());
    protected final List<DNSRecord> _additionals = Collections.synchronizedList(new LinkedList());

    public DNSMessage(int i10, int i11, boolean z10) {
        this._flags = i10;
        this._id = i11;
        this._multicast = z10;
    }

    public Collection<? extends DNSRecord> getAdditionals() {
        return this._additionals;
    }

    public List<DNSRecord> getAllAnswers() {
        ArrayList arrayList = new ArrayList(this._answers.size() + this._authoritativeAnswers.size() + this._additionals.size());
        arrayList.addAll(this._answers);
        arrayList.addAll(this._authoritativeAnswers);
        arrayList.addAll(this._additionals);
        return arrayList;
    }

    public Collection<? extends DNSRecord> getAnswers() {
        return this._answers;
    }

    public Collection<? extends DNSRecord> getAuthorities() {
        return this._authoritativeAnswers;
    }

    public int getFlags() {
        return this._flags;
    }

    public int getId() {
        if (this._multicast) {
            return 0;
        }
        return this._id;
    }

    public int getNumberOfAdditionals() {
        return getAdditionals().size();
    }

    public int getNumberOfAnswers() {
        return getAnswers().size();
    }

    public int getNumberOfAuthorities() {
        return getAuthorities().size();
    }

    public int getNumberOfQuestions() {
        return getQuestions().size();
    }

    public int getOperationCode() {
        return (this._flags & DNSConstants.FLAGS_OPCODE) >> 11;
    }

    public Collection<? extends DNSQuestion> getQuestions() {
        return this._questions;
    }

    public boolean isAuthoritativeAnswer() {
        return (this._flags & 1024) != 0;
    }

    public boolean isEmpty() {
        return ((getNumberOfQuestions() + getNumberOfAnswers()) + getNumberOfAuthorities()) + getNumberOfAdditionals() == 0;
    }

    public boolean isMulticast() {
        return this._multicast;
    }

    public boolean isQuery() {
        return (this._flags & 32768) == 0;
    }

    public boolean isResponse() {
        return (this._flags & 32768) == 32768;
    }

    public boolean isTruncated() {
        return (this._flags & 512) != 0;
    }

    public boolean isValidResponseCode() {
        return (this._flags & 15) == 0;
    }

    public String print() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append(toString());
        stringBuffer.append("\n");
        for (DNSQuestion dNSQuestion : this._questions) {
            stringBuffer.append("\tquestion:      ");
            stringBuffer.append(dNSQuestion);
            stringBuffer.append("\n");
        }
        for (DNSRecord dNSRecord : this._answers) {
            stringBuffer.append("\tanswer:        ");
            stringBuffer.append(dNSRecord);
            stringBuffer.append("\n");
        }
        for (DNSRecord dNSRecord2 : this._authoritativeAnswers) {
            stringBuffer.append("\tauthoritative: ");
            stringBuffer.append(dNSRecord2);
            stringBuffer.append("\n");
        }
        for (DNSRecord dNSRecord3 : this._additionals) {
            stringBuffer.append("\tadditional:    ");
            stringBuffer.append(dNSRecord3);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public void setFlags(int i10) {
        this._flags = i10;
    }

    public void setId(int i10) {
        this._id = i10;
    }

    public String print(byte[] bArr) {
        StringBuilder sb = new StringBuilder(4000);
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            int iMin = Math.min(32, length - i10);
            if (i10 < 16) {
                sb.append(' ');
            }
            if (i10 < 256) {
                sb.append(' ');
            }
            if (i10 < 4096) {
                sb.append(' ');
            }
            sb.append(Integer.toHexString(i10));
            sb.append(':');
            int i11 = 0;
            while (i11 < iMin) {
                if (i11 % 8 == 0) {
                    sb.append(' ');
                }
                int i12 = i10 + i11;
                sb.append(Integer.toHexString((bArr[i12] & 240) >> 4));
                sb.append(Integer.toHexString(bArr[i12] & 15));
                i11++;
            }
            if (i11 < 32) {
                while (i11 < 32) {
                    if (i11 % 8 == 0) {
                        sb.append(' ');
                    }
                    sb.append("  ");
                    i11++;
                }
            }
            sb.append("    ");
            for (int i13 = 0; i13 < iMin; i13++) {
                if (i13 % 8 == 0) {
                    sb.append(' ');
                }
                int i14 = bArr[i10 + i13] & 255;
                sb.append((i14 <= 32 || i14 >= 127) ? '.' : (char) i14);
            }
            sb.append("\n");
            i10 += 32;
            if (i10 >= 2048) {
                sb.append("....\n");
                break;
            }
        }
        return sb.toString();
    }
}
