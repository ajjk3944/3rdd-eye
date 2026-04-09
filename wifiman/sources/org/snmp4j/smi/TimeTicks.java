package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class TimeTicks extends UnsignedInteger32 {
    private static final int[] FORMAT_FACTORS = {8640000, 360000, 6000, 100, 1};
    private static final String FORMAT_PATTERN = "{0,choice,0#|1#1 day, |1<{0,number,integer} days, }{1,number,integer}:{2,number,00}:{3,number,00}.{4,number,00}";
    private static final long serialVersionUID = 8663761323061572311L;

    public TimeTicks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setValue$0(String str) {
        return !str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$setValue$1(int i10) {
        return new String[i10];
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new TimeTicks(this.value);
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        long jDecodeUnsignedInteger = BER.decodeUnsignedInteger(bERInputStream, mutableByte);
        if (mutableByte.getValue() == 67) {
            setValue(jDecodeUnsignedInteger);
            return;
        }
        throw new IOException("Wrong type encountered when decoding TimeTicks: " + ((int) mutableByte.getValue()));
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeUnsignedInteger(outputStream, BER.TIMETICKS, super.getValue());
    }

    public void fromMilliseconds(long j10) {
        setValue(j10 / 10);
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return 67;
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AssignableFromString
    public final void setValue(String str) {
        try {
            setValue(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            String[] strArr = (String[]) Arrays.stream(str.split("[days :,.]")).filter(new Predicate() { // from class: org.snmp4j.smi.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return TimeTicks.lambda$setValue$0((String) obj);
                }
            }).toArray(new IntFunction() { // from class: org.snmp4j.smi.b
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return TimeTicks.lambda$setValue$1(i10);
                }
            });
            int[] iArr = FORMAT_FACTORS;
            long j10 = 0;
            for (int length = (iArr.length - (iArr.length - strArr.length)) - 1; length >= 0; length--) {
                if (strArr[length].length() > 0) {
                    j10 += Long.parseLong(strArr[length]) * FORMAT_FACTORS[length + r1];
                }
            }
            setValue(j10);
        }
    }

    public long toMilliseconds() {
        return this.value * 10;
    }

    @Override // org.snmp4j.smi.UnsignedInteger32, org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        return toString(FORMAT_PATTERN);
    }

    public TimeTicks(TimeTicks timeTicks) {
        this.value = timeTicks.value;
    }

    public String toString(String str) {
        long value = getValue();
        long j10 = value / 8640000;
        long j11 = value % 8640000;
        long j12 = j11 / 360000;
        long j13 = j11 % 360000;
        long j14 = j13 / 6000;
        long j15 = j13 % 6000;
        return MessageFormat.format(str, Long.valueOf(j10), Long.valueOf(j12), Long.valueOf(j14), Long.valueOf(j15 / 100), Long.valueOf(j15 % 100));
    }

    public TimeTicks(long j10) {
        super(j10);
    }
}
