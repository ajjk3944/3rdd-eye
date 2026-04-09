package org.xbill.DNS;

import java.io.IOException;
import java.util.BitSet;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
public class NXTRecord extends Record {
    private static final long serialVersionUID = -8851454400765507520L;
    private BitSet bitmap;
    private Name next;

    public NXTRecord() {
    }

    public BitSet getBitmap() {
        return this.bitmap;
    }

    public Name getNext() {
        return this.next;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NXTRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        Tokenizer.Token token;
        this.next = tokenizer.getName(name);
        this.bitmap = new BitSet();
        while (true) {
            token = tokenizer.get();
            if (!token.isString()) {
                tokenizer.unget();
                return;
            }
            int iValue = Type.value(token.value, true);
            if (iValue <= 0 || iValue > 128) {
                break;
            } else {
                this.bitmap.set(iValue);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid type: ");
        stringBuffer.append(token.value);
        throw tokenizer.exception(stringBuffer.toString());
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.next = new Name(dNSInput);
        this.bitmap = new BitSet();
        int iRemaining = dNSInput.remaining();
        for (int i10 = 0; i10 < iRemaining; i10++) {
            int u82 = dNSInput.readU8();
            for (int i11 = 0; i11 < 8; i11++) {
                if (((1 << (7 - i11)) & u82) != 0) {
                    this.bitmap.set((i10 * 8) + i11);
                }
            }
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.next);
        int length = this.bitmap.length();
        for (short s10 = 0; s10 < length; s10 = (short) (s10 + 1)) {
            if (this.bitmap.get(s10)) {
                stringBuffer.append(" ");
                stringBuffer.append(Type.string(s10));
            }
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z10) {
        this.next.toWire(dNSOutput, null, z10);
        int length = this.bitmap.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i10 |= this.bitmap.get(i11) ? 1 << (7 - (i11 % 8)) : 0;
            if (i11 % 8 == 7 || i11 == length - 1) {
                dNSOutput.writeU8(i10);
                i10 = 0;
            }
        }
    }

    public NXTRecord(Name name, int i10, long j10, Name name2, BitSet bitSet) {
        super(name, 30, i10, j10);
        this.next = Record.checkName("next", name2);
        this.bitmap = bitSet;
    }
}
