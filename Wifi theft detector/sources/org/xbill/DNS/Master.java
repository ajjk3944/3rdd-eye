package org.xbill.DNS;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
public class Master {
    private int currentDClass;
    private long currentTTL;
    private int currentType;
    private long defaultTTL;
    private File file;
    private Generator generator;
    private List generators;
    private Master included;
    private Record last;
    private boolean needSOATTL;
    private boolean noExpandGenerate;
    private Name origin;
    private Tokenizer st;

    public Master(File file, Name name, long j10) throws IOException {
        this.last = null;
        this.included = null;
        if (name != null && !name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        this.file = file;
        this.st = new Tokenizer(file);
        this.origin = name;
        this.defaultTTL = j10;
    }

    private void endGenerate() throws IOException {
        this.st.getEOL();
        this.generator = null;
    }

    private Record nextGenerated() throws IOException {
        try {
            return this.generator.nextRecord();
        } catch (Tokenizer.TokenizerException e10) {
            Tokenizer tokenizer = this.st;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Parsing $GENERATE: ");
            stringBuffer.append(e10.getBaseMessage());
            throw tokenizer.exception(stringBuffer.toString());
        } catch (TextParseException e11) {
            Tokenizer tokenizer2 = this.st;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Parsing $GENERATE: ");
            stringBuffer2.append(e11.getMessage());
            throw tokenizer2.exception(stringBuffer2.toString());
        }
    }

    private Name parseName(String str, Name name) throws TextParseException {
        try {
            return Name.fromString(str, name);
        } catch (TextParseException e10) {
            throw this.st.exception(e10.getMessage());
        }
    }

    private void parseTTLClassAndType() throws IOException {
        boolean z10;
        String string = this.st.getString();
        int iValue = DClass.value(string);
        this.currentDClass = iValue;
        if (iValue >= 0) {
            string = this.st.getString();
            z10 = true;
        } else {
            z10 = false;
        }
        this.currentTTL = -1L;
        try {
            this.currentTTL = TTL.parseTTL(string);
            string = this.st.getString();
        } catch (NumberFormatException unused) {
            long j10 = this.defaultTTL;
            if (j10 >= 0) {
                this.currentTTL = j10;
            } else {
                Record record = this.last;
                if (record != null) {
                    this.currentTTL = record.getTTL();
                }
            }
        }
        if (!z10) {
            int iValue2 = DClass.value(string);
            this.currentDClass = iValue2;
            if (iValue2 >= 0) {
                string = this.st.getString();
            } else {
                this.currentDClass = 1;
            }
        }
        int iValue3 = Type.value(string);
        this.currentType = iValue3;
        if (iValue3 < 0) {
            Tokenizer tokenizer = this.st;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid type '");
            stringBuffer.append(string);
            stringBuffer.append("'");
            throw tokenizer.exception(stringBuffer.toString());
        }
        if (this.currentTTL < 0) {
            if (iValue3 != 6) {
                throw this.st.exception("missing TTL");
            }
            this.needSOATTL = true;
            this.currentTTL = 0L;
        }
    }

    private long parseUInt32(String str) throws NumberFormatException {
        long j10;
        if (!Character.isDigit(str.charAt(0))) {
            return -1L;
        }
        try {
            j10 = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        if (j10 < 0 || j10 > 4294967295L) {
            return -1L;
        }
        return j10;
    }

    private void startGenerate() throws IOException, NumberFormatException {
        String strSubstring;
        String identifier = this.st.getIdentifier();
        int iIndexOf = identifier.indexOf("-");
        if (iIndexOf < 0) {
            Tokenizer tokenizer = this.st;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid $GENERATE range specifier: ");
            stringBuffer.append(identifier);
            throw tokenizer.exception(stringBuffer.toString());
        }
        String strSubstring2 = identifier.substring(0, iIndexOf);
        String strSubstring3 = identifier.substring(iIndexOf + 1);
        int iIndexOf2 = strSubstring3.indexOf("/");
        if (iIndexOf2 >= 0) {
            strSubstring = strSubstring3.substring(iIndexOf2 + 1);
            strSubstring3 = strSubstring3.substring(0, iIndexOf2);
        } else {
            strSubstring = null;
        }
        long uInt32 = parseUInt32(strSubstring2);
        long uInt322 = parseUInt32(strSubstring3);
        long uInt323 = strSubstring != null ? parseUInt32(strSubstring) : 1L;
        if (uInt32 < 0 || uInt322 < 0 || uInt32 > uInt322 || uInt323 <= 0) {
            Tokenizer tokenizer2 = this.st;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Invalid $GENERATE range specifier: ");
            stringBuffer2.append(identifier);
            throw tokenizer2.exception(stringBuffer2.toString());
        }
        String identifier2 = this.st.getIdentifier();
        parseTTLClassAndType();
        if (!Generator.supportedType(this.currentType)) {
            Tokenizer tokenizer3 = this.st;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("$GENERATE does not support ");
            stringBuffer3.append(Type.string(this.currentType));
            stringBuffer3.append(" records");
            throw tokenizer3.exception(stringBuffer3.toString());
        }
        String identifier3 = this.st.getIdentifier();
        this.st.getEOL();
        this.st.unget();
        this.generator = new Generator(uInt32, uInt322, uInt323, identifier2, this.currentType, this.currentDClass, this.currentTTL, identifier3, this.origin);
        if (this.generators == null) {
            this.generators = new ArrayList(1);
        }
        this.generators.add(this.generator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0135, code lost:
    
        parseTTLClassAndType();
        r0 = org.xbill.DNS.Record.fromString(r4, r11.currentType, r11.currentDClass, r11.currentTTL, r11.st, r11.origin);
        r11.last = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014a, code lost:
    
        if (r11.needSOATTL == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014c, code lost:
    
        r0 = ((org.xbill.DNS.SOARecord) r0).getMinimum();
        r11.last.setTTL(r0);
        r11.defaultTTL = r0;
        r11.needSOATTL = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015d, code lost:
    
        return r11.last;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.xbill.DNS.Record _nextRecord() throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.Master._nextRecord():org.xbill.DNS.Record");
    }

    public void expandGenerate(boolean z10) {
        this.noExpandGenerate = !z10;
    }

    public void finalize() throws IOException {
        Tokenizer tokenizer = this.st;
        if (tokenizer != null) {
            tokenizer.close();
        }
    }

    public Iterator generators() {
        List list = this.generators;
        return list != null ? Collections.unmodifiableList(list).iterator() : Collections.EMPTY_LIST.iterator();
    }

    public Record nextRecord() throws IOException {
        try {
            Record record_nextRecord = _nextRecord();
            if (record_nextRecord == null) {
            }
            return record_nextRecord;
        } finally {
            this.st.close();
        }
    }

    public Master(String str, Name name, long j10) throws IOException {
        this(new File(str), name, j10);
    }

    public Master(String str, Name name) throws IOException {
        this(new File(str), name, -1L);
    }

    public Master(String str) throws IOException {
        this(new File(str), (Name) null, -1L);
    }

    public Master(InputStream inputStream, Name name, long j10) {
        this.last = null;
        this.included = null;
        if (name != null && !name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        this.st = new Tokenizer(inputStream);
        this.origin = name;
        this.defaultTTL = j10;
    }

    public Master(InputStream inputStream, Name name) {
        this(inputStream, name, -1L);
    }

    public Master(InputStream inputStream) {
        this(inputStream, (Name) null, -1L);
    }
}
