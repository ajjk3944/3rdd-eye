package org.xbill.DNS;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
public class LOCRecord extends Record {
    private static final long serialVersionUID = 9058224788126750409L;

    /* renamed from: w2, reason: collision with root package name */
    private static NumberFormat f23840w2;

    /* renamed from: w3, reason: collision with root package name */
    private static NumberFormat f23841w3;
    private long altitude;
    private long hPrecision;
    private long latitude;
    private long longitude;
    private long size;
    private long vPrecision;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        f23840w2 = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormat2 = new DecimalFormat();
        f23841w3 = decimalFormat2;
        decimalFormat2.setMinimumIntegerDigits(3);
    }

    public LOCRecord() {
    }

    private long parseDouble(Tokenizer tokenizer, String str, boolean z10, long j10, long j11, long j12) throws IOException {
        Tokenizer.Token token = tokenizer.get();
        if (token.isEOL()) {
            if (!z10) {
                tokenizer.unget();
                return j12;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid LOC ");
            stringBuffer.append(str);
            throw tokenizer.exception(stringBuffer.toString());
        }
        String strSubstring = token.value;
        if (strSubstring.length() > 1 && strSubstring.charAt(strSubstring.length() - 1) == 'm') {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        try {
            long fixedPoint = (long) (parseFixedPoint(strSubstring) * 100.0d);
            if (fixedPoint >= j10 && fixedPoint <= j11) {
                return fixedPoint;
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Invalid LOC ");
            stringBuffer2.append(str);
            throw tokenizer.exception(stringBuffer2.toString());
        } catch (NumberFormatException unused) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Invalid LOC ");
            stringBuffer3.append(str);
            throw tokenizer.exception(stringBuffer3.toString());
        }
    }

    private double parseFixedPoint(String str) {
        if (str.matches("^-?\\d+$")) {
            return Integer.parseInt(str);
        }
        if (!str.matches("^-?\\d+\\.\\d*$")) {
            throw new NumberFormatException();
        }
        String[] strArrSplit = str.split("\\.");
        double d10 = Integer.parseInt(strArrSplit[0]);
        double d11 = Integer.parseInt(strArrSplit[1]);
        if (d10 < 0.0d) {
            d11 *= -1.0d;
        }
        return d10 + (d11 / Math.pow(10.0d, strArrSplit[1].length()));
    }

    private static long parseLOCformat(int i10) throws WireParseException {
        long j10 = i10 >> 4;
        int i11 = i10 & 15;
        if (j10 > 9 || i11 > 9) {
            throw new WireParseException("Invalid LOC Encoding");
        }
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                return j10;
            }
            j10 *= 10;
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long parsePosition(org.xbill.DNS.Tokenizer r18, java.lang.String r19) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.LOCRecord.parsePosition(org.xbill.DNS.Tokenizer, java.lang.String):long");
    }

    private String positionToString(long j10, char c10, char c11) {
        StringBuffer stringBuffer = new StringBuffer();
        long j11 = j10 - 2147483648L;
        if (j11 < 0) {
            j11 = -j11;
            c10 = c11;
        }
        stringBuffer.append(j11 / 3600000);
        long j12 = j11 % 3600000;
        stringBuffer.append(" ");
        stringBuffer.append(j12 / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        long j13 = j12 % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        stringBuffer.append(" ");
        renderFixedPoint(stringBuffer, f23841w3, j13, 1000L);
        stringBuffer.append(" ");
        stringBuffer.append(c10);
        return stringBuffer.toString();
    }

    private void renderFixedPoint(StringBuffer stringBuffer, NumberFormat numberFormat, long j10, long j11) {
        stringBuffer.append(j10 / j11);
        long j12 = j10 % j11;
        if (j12 != 0) {
            stringBuffer.append(".");
            stringBuffer.append(numberFormat.format(j12));
        }
    }

    private int toLOCformat(long j10) {
        byte b10 = 0;
        while (j10 > 9) {
            b10 = (byte) (b10 + 1);
            j10 /= 10;
        }
        return (int) ((j10 << 4) + b10);
    }

    public double getAltitude() {
        return (this.altitude - 10000000) / 100.0d;
    }

    public double getHPrecision() {
        return this.hPrecision / 100.0d;
    }

    public double getLatitude() {
        return (this.latitude - 2147483648L) / 3600000.0d;
    }

    public double getLongitude() {
        return (this.longitude - 2147483648L) / 3600000.0d;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new LOCRecord();
    }

    public double getSize() {
        return this.size / 100.0d;
    }

    public double getVPrecision() {
        return this.vPrecision / 100.0d;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.latitude = parsePosition(tokenizer, "latitude");
        this.longitude = parsePosition(tokenizer, "longitude");
        this.altitude = parseDouble(tokenizer, "altitude", true, -10000000L, 4284967295L, 0L) + 10000000;
        this.size = parseDouble(tokenizer, "size", false, 0L, 9000000000L, 100L);
        this.hPrecision = parseDouble(tokenizer, "horizontal precision", false, 0L, 9000000000L, 1000000L);
        this.vPrecision = parseDouble(tokenizer, "vertical precision", false, 0L, 9000000000L, 1000L);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        if (dNSInput.readU8() != 0) {
            throw new WireParseException("Invalid LOC version");
        }
        this.size = parseLOCformat(dNSInput.readU8());
        this.hPrecision = parseLOCformat(dNSInput.readU8());
        this.vPrecision = parseLOCformat(dNSInput.readU8());
        this.latitude = dNSInput.readU32();
        this.longitude = dNSInput.readU32();
        this.altitude = dNSInput.readU32();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(positionToString(this.latitude, 'N', 'S'));
        stringBuffer.append(" ");
        stringBuffer.append(positionToString(this.longitude, 'E', 'W'));
        stringBuffer.append(" ");
        renderFixedPoint(stringBuffer, f23840w2, this.altitude - 10000000, 100L);
        stringBuffer.append("m ");
        renderFixedPoint(stringBuffer, f23840w2, this.size, 100L);
        stringBuffer.append("m ");
        renderFixedPoint(stringBuffer, f23840w2, this.hPrecision, 100L);
        stringBuffer.append("m ");
        renderFixedPoint(stringBuffer, f23840w2, this.vPrecision, 100L);
        stringBuffer.append("m");
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z10) {
        dNSOutput.writeU8(0);
        dNSOutput.writeU8(toLOCformat(this.size));
        dNSOutput.writeU8(toLOCformat(this.hPrecision));
        dNSOutput.writeU8(toLOCformat(this.vPrecision));
        dNSOutput.writeU32(this.latitude);
        dNSOutput.writeU32(this.longitude);
        dNSOutput.writeU32(this.altitude);
    }

    public LOCRecord(Name name, int i10, long j10, double d10, double d11, double d12, double d13, double d14, double d15) {
        super(name, 29, i10, j10);
        this.latitude = (long) ((d10 * 3600.0d * 1000.0d) + 2.147483648E9d);
        this.longitude = (long) ((3600.0d * d11 * 1000.0d) + 2.147483648E9d);
        this.altitude = (long) ((100000.0d + d12) * 100.0d);
        this.size = (long) (d13 * 100.0d);
        this.hPrecision = (long) (d14 * 100.0d);
        this.vPrecision = (long) (d15 * 100.0d);
    }
}
