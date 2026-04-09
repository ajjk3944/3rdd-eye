package org.xbill.DNS;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
final class TypeBitmap implements Serializable {
    private static final long serialVersionUID = -125354057735389003L;
    private TreeSet types;

    private TypeBitmap() {
        this.types = new TreeSet();
    }

    private static void mapToWire(DNSOutput dNSOutput, TreeSet treeSet, int i10) {
        int iIntValue = ((((Integer) treeSet.last()).intValue() & 255) / 8) + 1;
        int[] iArr = new int[iIntValue];
        dNSOutput.writeU8(i10);
        dNSOutput.writeU8(iIntValue);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            int i11 = (iIntValue2 & 255) / 8;
            iArr[i11] = (1 << (7 - (iIntValue2 % 8))) | iArr[i11];
        }
        for (int i12 = 0; i12 < iIntValue; i12++) {
            dNSOutput.writeU8(iArr[i12]);
        }
    }

    public boolean contains(int i10) {
        return this.types.contains(Mnemonic.toInteger(i10));
    }

    public boolean empty() {
        return this.types.isEmpty();
    }

    public int[] toArray() {
        int[] iArr = new int[this.types.size()];
        Iterator it = this.types.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.types.iterator();
        while (it.hasNext()) {
            stringBuffer.append(Type.string(((Integer) it.next()).intValue()));
            if (it.hasNext()) {
                stringBuffer.append(' ');
            }
        }
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput) {
        if (this.types.size() == 0) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        Iterator it = this.types.iterator();
        int i10 = -1;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            int i11 = iIntValue >> 8;
            if (i11 != i10) {
                if (treeSet.size() > 0) {
                    mapToWire(dNSOutput, treeSet, i10);
                    treeSet.clear();
                }
                i10 = i11;
            }
            treeSet.add(new Integer(iIntValue));
        }
        mapToWire(dNSOutput, treeSet, i10);
    }

    public TypeBitmap(int[] iArr) {
        this();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            Type.check(iArr[i10]);
            this.types.add(new Integer(iArr[i10]));
        }
    }

    public TypeBitmap(DNSInput dNSInput) throws WireParseException {
        this();
        while (dNSInput.remaining() > 0) {
            if (dNSInput.remaining() >= 2) {
                int u82 = dNSInput.readU8();
                if (u82 >= -1) {
                    int u83 = dNSInput.readU8();
                    if (u83 > dNSInput.remaining()) {
                        throw new WireParseException("invalid bitmap");
                    }
                    for (int i10 = 0; i10 < u83; i10++) {
                        int u84 = dNSInput.readU8();
                        if (u84 != 0) {
                            for (int i11 = 0; i11 < 8; i11++) {
                                if (((1 << (7 - i11)) & u84) != 0) {
                                    this.types.add(Mnemonic.toInteger((u82 * 256) + (i10 * 8) + i11));
                                }
                            }
                        }
                    }
                } else {
                    throw new WireParseException("invalid ordering");
                }
            } else {
                throw new WireParseException("invalid bitmap descriptor");
            }
        }
    }

    public TypeBitmap(Tokenizer tokenizer) throws IOException {
        this();
        while (true) {
            Tokenizer.Token token = tokenizer.get();
            if (!token.isString()) {
                tokenizer.unget();
                return;
            }
            int iValue = Type.value(token.value);
            if (iValue >= 0) {
                this.types.add(Mnemonic.toInteger(iValue));
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Invalid type: ");
                stringBuffer.append(token.value);
                throw tokenizer.exception(stringBuffer.toString());
            }
        }
    }
}
