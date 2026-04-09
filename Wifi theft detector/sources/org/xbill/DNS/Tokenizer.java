package org.xbill.DNS;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.xbill.DNS.utils.base16;
import org.xbill.DNS.utils.base32;
import org.xbill.DNS.utils.base64;

/* loaded from: classes4.dex */
public class Tokenizer {
    public static final int COMMENT = 5;
    public static final int EOF = 0;
    public static final int EOL = 1;
    public static final int IDENTIFIER = 3;
    public static final int QUOTED_STRING = 4;
    public static final int WHITESPACE = 2;
    private static String delim = " \t\n;()\"";
    private static String quotes = "\"";
    private Token current;
    private String delimiters;
    private String filename;
    private PushbackInputStream is;
    private int line;
    private int multiline;
    private boolean quoting;
    private StringBuffer sb;
    private boolean ungottenToken;
    private boolean wantClose;

    public static class Token {
        public int type;
        public String value;

        /* JADX INFO: Access modifiers changed from: private */
        public Token set(int i10, StringBuffer stringBuffer) {
            if (i10 < 0) {
                throw new IllegalArgumentException();
            }
            this.type = i10;
            this.value = stringBuffer == null ? null : stringBuffer.toString();
            return this;
        }

        public boolean isEOL() {
            int i10 = this.type;
            return i10 == 1 || i10 == 0;
        }

        public boolean isString() {
            int i10 = this.type;
            return i10 == 3 || i10 == 4;
        }

        public String toString() {
            int i10 = this.type;
            if (i10 == 0) {
                return "<eof>";
            }
            if (i10 == 1) {
                return "<eol>";
            }
            if (i10 == 2) {
                return "<whitespace>";
            }
            if (i10 == 3) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("<identifier: ");
                stringBuffer.append(this.value);
                stringBuffer.append(">");
                return stringBuffer.toString();
            }
            if (i10 == 4) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("<quoted_string: ");
                stringBuffer2.append(this.value);
                stringBuffer2.append(">");
                return stringBuffer2.toString();
            }
            if (i10 != 5) {
                return "<unknown>";
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("<comment: ");
            stringBuffer3.append(this.value);
            stringBuffer3.append(">");
            return stringBuffer3.toString();
        }

        private Token() {
            this.type = -1;
            this.value = null;
        }
    }

    public static class TokenizerException extends TextParseException {
        String message;

        public TokenizerException(String str, int i10, String str2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(":");
            stringBuffer.append(i10);
            stringBuffer.append(": ");
            stringBuffer.append(str2);
            super(stringBuffer.toString());
            this.message = str2;
        }

        public String getBaseMessage() {
            return this.message;
        }
    }

    public Tokenizer(InputStream inputStream) {
        this.is = new PushbackInputStream(inputStream instanceof BufferedInputStream ? inputStream : new BufferedInputStream(inputStream), 2);
        this.ungottenToken = false;
        this.multiline = 0;
        this.quoting = false;
        this.delimiters = delim;
        this.current = new Token();
        this.sb = new StringBuffer();
        this.filename = "<none>";
        this.line = 1;
    }

    private String _getIdentifier(String str) throws IOException {
        Token token = get();
        if (token.type == 3) {
            return token.value;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("expected ");
        stringBuffer.append(str);
        throw exception(stringBuffer.toString());
    }

    private void checkUnbalancedParens() throws TextParseException {
        if (this.multiline > 0) {
            throw exception("unbalanced parentheses");
        }
    }

    private int getChar() throws IOException {
        int i10 = this.is.read();
        if (i10 == 13) {
            int i11 = this.is.read();
            if (i11 != 10) {
                this.is.unread(i11);
            }
            i10 = 10;
        }
        if (i10 == 10) {
            this.line++;
        }
        return i10;
    }

    private String remainingStrings() throws IOException {
        StringBuffer stringBuffer = null;
        while (true) {
            Token token = get();
            if (!token.isString()) {
                break;
            }
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            stringBuffer.append(token.value);
        }
        unget();
        if (stringBuffer == null) {
            return null;
        }
        return stringBuffer.toString();
    }

    private int skipWhitespace() throws IOException {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = getChar();
            if (i10 != 32 && i10 != 9 && (i10 != 10 || this.multiline <= 0)) {
                break;
            }
            i11++;
        }
        ungetChar(i10);
        return i11;
    }

    private void ungetChar(int i10) throws IOException {
        if (i10 == -1) {
            return;
        }
        this.is.unread(i10);
        if (i10 == 10) {
            this.line--;
        }
    }

    public void close() throws IOException {
        if (this.wantClose) {
            try {
                this.is.close();
            } catch (IOException unused) {
            }
        }
    }

    public TextParseException exception(String str) {
        return new TokenizerException(this.filename, this.line, str);
    }

    public void finalize() throws IOException {
        close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r10 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0139, code lost:
    
        ungetChar(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0142, code lost:
    
        if (r9.sb.length() != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0144, code lost:
    
        if (r10 == 4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0146, code lost:
    
        checkUnbalancedParens();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x014f, code lost:
    
        return r9.current.set(0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0158, code lost:
    
        return r9.current.set(r10, r9.sb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r11 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.xbill.DNS.Tokenizer.Token get(boolean r10, boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.Tokenizer.get(boolean, boolean):org.xbill.DNS.Tokenizer$Token");
    }

    public InetAddress getAddress(int i10) throws IOException {
        try {
            return Address.getByAddress(_getIdentifier("an address"), i10);
        } catch (UnknownHostException e10) {
            throw exception(e10.getMessage());
        }
    }

    public byte[] getAddressBytes(int i10) throws IOException {
        String str_getIdentifier = _getIdentifier("an address");
        byte[] byteArray = Address.toByteArray(str_getIdentifier, i10);
        if (byteArray != null) {
            return byteArray;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid address: ");
        stringBuffer.append(str_getIdentifier);
        throw exception(stringBuffer.toString());
    }

    public byte[] getBase32String(base32 base32Var) throws IOException {
        byte[] bArrFromString = base32Var.fromString(_getIdentifier("a base32 string"));
        if (bArrFromString != null) {
            return bArrFromString;
        }
        throw exception("invalid base32 encoding");
    }

    public byte[] getBase64(boolean z10) throws IOException {
        String strRemainingStrings = remainingStrings();
        if (strRemainingStrings == null) {
            if (z10) {
                throw exception("expected base64 encoded string");
            }
            return null;
        }
        byte[] bArrFromString = base64.fromString(strRemainingStrings);
        if (bArrFromString != null) {
            return bArrFromString;
        }
        throw exception("invalid base64 encoding");
    }

    public void getEOL() throws IOException {
        int i10 = get().type;
        if (i10 != 1 && i10 != 0) {
            throw exception("expected EOL or EOF");
        }
    }

    public byte[] getHex(boolean z10) throws IOException {
        String strRemainingStrings = remainingStrings();
        if (strRemainingStrings == null) {
            if (z10) {
                throw exception("expected hex encoded string");
            }
            return null;
        }
        byte[] bArrFromString = base16.fromString(strRemainingStrings);
        if (bArrFromString != null) {
            return bArrFromString;
        }
        throw exception("invalid hex encoding");
    }

    public byte[] getHexString() throws IOException {
        byte[] bArrFromString = base16.fromString(_getIdentifier("a hex string"));
        if (bArrFromString != null) {
            return bArrFromString;
        }
        throw exception("invalid hex encoding");
    }

    public String getIdentifier() throws IOException {
        return _getIdentifier("an identifier");
    }

    public long getLong() throws IOException {
        String str_getIdentifier = _getIdentifier("an integer");
        if (!Character.isDigit(str_getIdentifier.charAt(0))) {
            throw exception("expected an integer");
        }
        try {
            return Long.parseLong(str_getIdentifier);
        } catch (NumberFormatException unused) {
            throw exception("expected an integer");
        }
    }

    public Name getName(Name name) throws IOException {
        try {
            Name nameFromString = Name.fromString(_getIdentifier("a name"), name);
            if (nameFromString.isAbsolute()) {
                return nameFromString;
            }
            throw new RelativeNameException(nameFromString);
        } catch (TextParseException e10) {
            throw exception(e10.getMessage());
        }
    }

    public String getString() throws IOException {
        Token token = get();
        if (token.isString()) {
            return token.value;
        }
        throw exception("expected a string");
    }

    public long getTTL() throws IOException {
        try {
            return TTL.parseTTL(_getIdentifier("a TTL value"));
        } catch (NumberFormatException unused) {
            throw exception("expected a TTL value");
        }
    }

    public long getTTLLike() throws IOException {
        try {
            return TTL.parse(_getIdentifier("a TTL-like value"), false);
        } catch (NumberFormatException unused) {
            throw exception("expected a TTL-like value");
        }
    }

    public int getUInt16() throws IOException {
        long j10 = getLong();
        if (j10 < 0 || j10 > 65535) {
            throw exception("expected an 16 bit unsigned integer");
        }
        return (int) j10;
    }

    public long getUInt32() throws IOException {
        long j10 = getLong();
        if (j10 < 0 || j10 > 4294967295L) {
            throw exception("expected an 32 bit unsigned integer");
        }
        return j10;
    }

    public int getUInt8() throws IOException {
        long j10 = getLong();
        if (j10 < 0 || j10 > 255) {
            throw exception("expected an 8 bit unsigned integer");
        }
        return (int) j10;
    }

    public void unget() {
        if (this.ungottenToken) {
            throw new IllegalStateException("Cannot unget multiple tokens");
        }
        if (this.current.type == 1) {
            this.line--;
        }
        this.ungottenToken = true;
    }

    public byte[] getBase64() throws IOException {
        return getBase64(false);
    }

    public byte[] getHex() throws IOException {
        return getHex(false);
    }

    public Tokenizer(String str) {
        this(new ByteArrayInputStream(str.getBytes()));
    }

    public Tokenizer(File file) throws FileNotFoundException {
        this(new FileInputStream(file));
        this.wantClose = true;
        this.filename = file.getName();
    }

    public Token get() throws IOException {
        return get(false, false);
    }
}
