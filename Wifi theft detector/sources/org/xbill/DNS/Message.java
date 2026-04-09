package org.xbill.DNS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class Message implements Cloneable {
    public static final int MAXLENGTH = 65535;
    static final int TSIG_FAILED = 4;
    static final int TSIG_INTERMEDIATE = 2;
    static final int TSIG_SIGNED = 3;
    static final int TSIG_UNSIGNED = 0;
    static final int TSIG_VERIFIED = 1;
    private Header header;
    private TSIGRecord querytsig;
    private List[] sections;
    int sig0start;
    private int size;
    int tsigState;
    private int tsigerror;
    private TSIG tsigkey;
    int tsigstart;
    private static Record[] emptyRecordArray = new Record[0];
    private static RRset[] emptyRRsetArray = new RRset[0];

    private Message(Header header) {
        this.sections = new List[4];
        this.header = header;
    }

    public static Message newQuery(Record record) {
        Message message = new Message();
        message.header.setOpcode(0);
        message.header.setFlag(7);
        message.addRecord(record, 0);
        return message;
    }

    public static Message newUpdate(Name name) {
        return new Update(name);
    }

    private static boolean sameSet(Record record, Record record2) {
        return record.getRRsetType() == record2.getRRsetType() && record.getDClass() == record2.getDClass() && record.getName().equals(record2.getName());
    }

    private int sectionToWire(DNSOutput dNSOutput, int i10, Compression compression, int i11) {
        int size = this.sections[i10].size();
        int iCurrent = dNSOutput.current();
        int i12 = 0;
        Record record = null;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Record record2 = (Record) this.sections[i10].get(i14);
            if (i10 == 3 && (record2 instanceof OPTRecord)) {
                i13++;
            } else {
                if (record != null && !sameSet(record2, record)) {
                    iCurrent = dNSOutput.current();
                    i12 = i14;
                }
                record2.toWire(dNSOutput, i10, compression);
                if (dNSOutput.current() > i11) {
                    dNSOutput.jump(iCurrent);
                    return (size - i12) + i13;
                }
                record = record2;
            }
        }
        return i13;
    }

    public void addRecord(Record record, int i10) {
        List[] listArr = this.sections;
        if (listArr[i10] == null) {
            listArr[i10] = new LinkedList();
        }
        this.header.incCount(i10);
        this.sections[i10].add(record);
    }

    public Object clone() {
        Message message = new Message();
        int i10 = 0;
        while (true) {
            List[] listArr = this.sections;
            if (i10 >= listArr.length) {
                message.header = (Header) this.header.clone();
                message.size = this.size;
                return message;
            }
            if (listArr[i10] != null) {
                message.sections[i10] = new LinkedList(this.sections[i10]);
            }
            i10++;
        }
    }

    public boolean findRRset(Name name, int i10, int i11) {
        if (this.sections[i11] == null) {
            return false;
        }
        for (int i12 = 0; i12 < this.sections[i11].size(); i12++) {
            Record record = (Record) this.sections[i11].get(i12);
            if (record.getType() == i10 && name.equals(record.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean findRecord(Record record, int i10) {
        List list = this.sections[i10];
        return list != null && list.contains(record);
    }

    public Header getHeader() {
        return this.header;
    }

    public OPTRecord getOPT() {
        for (Record record : getSectionArray(3)) {
            if (record instanceof OPTRecord) {
                return (OPTRecord) record;
            }
        }
        return null;
    }

    public Record getQuestion() {
        List list = this.sections[0];
        if (list == null || list.size() == 0) {
            return null;
        }
        return (Record) list.get(0);
    }

    public int getRcode() {
        int rcode = this.header.getRcode();
        OPTRecord opt = getOPT();
        return opt != null ? rcode + (opt.getExtendedRcode() << 4) : rcode;
    }

    public Record[] getSectionArray(int i10) {
        List list = this.sections[i10];
        return list == null ? emptyRecordArray : (Record[]) list.toArray(new Record[list.size()]);
    }

    public RRset[] getSectionRRsets(int i10) {
        if (this.sections[i10] == null) {
            return emptyRRsetArray;
        }
        LinkedList linkedList = new LinkedList();
        Record[] sectionArray = getSectionArray(i10);
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < sectionArray.length; i11++) {
            Name name = sectionArray[i11].getName();
            if (hashSet.contains(name)) {
                for (int size = linkedList.size() - 1; size >= 0; size--) {
                    RRset rRset = (RRset) linkedList.get(size);
                    if (rRset.getType() == sectionArray[i11].getRRsetType() && rRset.getDClass() == sectionArray[i11].getDClass() && rRset.getName().equals(name)) {
                        rRset.addRR(sectionArray[i11]);
                        break;
                    }
                }
                linkedList.add(new RRset(sectionArray[i11]));
                hashSet.add(name);
            } else {
                linkedList.add(new RRset(sectionArray[i11]));
                hashSet.add(name);
            }
        }
        return (RRset[]) linkedList.toArray(new RRset[linkedList.size()]);
    }

    public TSIGRecord getTSIG() {
        int count = this.header.getCount(3);
        if (count == 0) {
            return null;
        }
        Record record = (Record) this.sections[3].get(count - 1);
        if (record.type != 250) {
            return null;
        }
        return (TSIGRecord) record;
    }

    public boolean isSigned() {
        int i10 = this.tsigState;
        return i10 == 3 || i10 == 1 || i10 == 4;
    }

    public boolean isVerified() {
        return this.tsigState == 1;
    }

    public int numBytes() {
        return this.size;
    }

    public void removeAllRecords(int i10) {
        this.sections[i10] = null;
        this.header.setCount(i10, 0);
    }

    public boolean removeRecord(Record record, int i10) {
        List list = this.sections[i10];
        if (list == null || !list.remove(record)) {
            return false;
        }
        this.header.decCount(i10);
        return true;
    }

    public String sectionToString(int i10) {
        if (i10 > 3) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Record record : getSectionArray(i10)) {
            if (i10 == 0) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(";;\t");
                stringBuffer2.append(record.name);
                stringBuffer.append(stringBuffer2.toString());
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(", type = ");
                stringBuffer3.append(Type.string(record.type));
                stringBuffer.append(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(", class = ");
                stringBuffer4.append(DClass.string(record.dclass));
                stringBuffer.append(stringBuffer4.toString());
            } else {
                stringBuffer.append(record);
            }
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public void setTSIG(TSIG tsig, int i10, TSIGRecord tSIGRecord) {
        this.tsigkey = tsig;
        this.tsigerror = i10;
        this.querytsig = tSIGRecord;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (getOPT() != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.header.toStringWithRcode(getRcode()));
            stringBuffer2.append("\n");
            stringBuffer.append(stringBuffer2.toString());
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(this.header);
            stringBuffer3.append("\n");
            stringBuffer.append(stringBuffer3.toString());
        }
        if (isSigned()) {
            stringBuffer.append(";; TSIG ");
            if (isVerified()) {
                stringBuffer.append("ok");
            } else {
                stringBuffer.append("invalid");
            }
            stringBuffer.append('\n');
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (this.header.getOpcode() != 5) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(";; ");
                stringBuffer4.append(Section.longString(i10));
                stringBuffer4.append(":\n");
                stringBuffer.append(stringBuffer4.toString());
            } else {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(";; ");
                stringBuffer5.append(Section.updString(i10));
                stringBuffer5.append(":\n");
                stringBuffer.append(stringBuffer5.toString());
            }
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(sectionToString(i10));
            stringBuffer6.append("\n");
            stringBuffer.append(stringBuffer6.toString());
        }
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append(";; Message size: ");
        stringBuffer7.append(numBytes());
        stringBuffer7.append(" bytes");
        stringBuffer.append(stringBuffer7.toString());
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput) {
        this.header.toWire(dNSOutput);
        Compression compression = new Compression();
        for (int i10 = 0; i10 < 4; i10++) {
            if (this.sections[i10] != null) {
                for (int i11 = 0; i11 < this.sections[i10].size(); i11++) {
                    ((Record) this.sections[i10].get(i11)).toWire(dNSOutput, i10, compression);
                }
            }
        }
    }

    public boolean findRecord(Record record) {
        for (int i10 = 1; i10 <= 3; i10++) {
            List list = this.sections[i10];
            if (list != null && list.contains(record)) {
                return true;
            }
        }
        return false;
    }

    public Message(int i10) {
        this(new Header(i10));
    }

    public Message() {
        this(new Header());
    }

    public boolean findRRset(Name name, int i10) {
        return findRRset(name, i10, 1) || findRRset(name, i10, 2) || findRRset(name, i10, 3);
    }

    public Message(DNSInput dNSInput) throws IOException {
        this(new Header(dNSInput));
        boolean z10 = this.header.getOpcode() == 5;
        boolean flag = this.header.getFlag(6);
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                int count = this.header.getCount(i10);
                if (count > 0) {
                    this.sections[i10] = new ArrayList(count);
                }
                for (int i11 = 0; i11 < count; i11++) {
                    int iCurrent = dNSInput.current();
                    Record recordFromWire = Record.fromWire(dNSInput, i10, z10);
                    this.sections[i10].add(recordFromWire);
                    if (i10 == 3) {
                        if (recordFromWire.getType() == 250) {
                            this.tsigstart = iCurrent;
                        }
                        if (recordFromWire.getType() == 24 && ((SIGRecord) recordFromWire).getTypeCovered() == 0) {
                            this.sig0start = iCurrent;
                        }
                    }
                }
            } catch (WireParseException e10) {
                if (!flag) {
                    throw e10;
                }
            }
        }
        this.size = dNSInput.current();
    }

    private boolean toWire(DNSOutput dNSOutput, int i10) {
        byte[] wire;
        if (i10 < 12) {
            return false;
        }
        TSIG tsig = this.tsigkey;
        if (tsig != null) {
            i10 -= tsig.recordLength();
        }
        OPTRecord opt = getOPT();
        if (opt != null) {
            wire = opt.toWire(3);
            i10 -= wire.length;
        } else {
            wire = null;
        }
        int iCurrent = dNSOutput.current();
        this.header.toWire(dNSOutput);
        Compression compression = new Compression();
        int flagsByte = this.header.getFlagsByte();
        int i11 = 0;
        int count = 0;
        while (true) {
            if (i11 >= 4) {
                break;
            }
            if (this.sections[i11] != null) {
                int iSectionToWire = sectionToWire(dNSOutput, i11, compression, i10);
                if (iSectionToWire != 0 && i11 != 3) {
                    flagsByte = Header.setFlag(flagsByte, 6, true);
                    int count2 = this.header.getCount(i11) - iSectionToWire;
                    int i12 = iCurrent + 4;
                    dNSOutput.writeU16At(count2, (i11 * 2) + i12);
                    for (int i13 = i11 + 1; i13 < 3; i13++) {
                        dNSOutput.writeU16At(0, (i13 * 2) + i12);
                    }
                } else if (i11 == 3) {
                    count = this.header.getCount(i11) - iSectionToWire;
                }
            }
            i11++;
        }
        if (wire != null) {
            dNSOutput.writeByteArray(wire);
            count++;
        }
        if (flagsByte != this.header.getFlagsByte()) {
            dNSOutput.writeU16At(flagsByte, iCurrent + 2);
        }
        if (count != this.header.getCount(3)) {
            dNSOutput.writeU16At(count, iCurrent + 10);
        }
        TSIG tsig2 = this.tsigkey;
        if (tsig2 != null) {
            tsig2.generate(this, dNSOutput.toByteArray(), this.tsigerror, this.querytsig).toWire(dNSOutput, 3, compression);
            dNSOutput.writeU16At(count + 1, iCurrent + 10);
        }
        return true;
    }

    public Message(byte[] bArr) throws IOException {
        this(new DNSInput(bArr));
    }

    public byte[] toWire() {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput);
        this.size = dNSOutput.current();
        return dNSOutput.toByteArray();
    }

    public byte[] toWire(int i10) {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput, i10);
        this.size = dNSOutput.current();
        return dNSOutput.toByteArray();
    }
}
