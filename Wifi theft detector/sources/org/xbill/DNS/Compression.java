package org.xbill.DNS;

import java.io.PrintStream;

/* loaded from: classes4.dex */
public class Compression {
    private static final int MAX_POINTER = 16383;
    private static final int TABLE_SIZE = 17;
    private boolean verbose = Options.check("verbosecompression");
    private Entry[] table = new Entry[17];

    public static class Entry {
        Name name;
        Entry next;
        int pos;

        private Entry() {
        }
    }

    public void add(int i10, Name name) {
        if (i10 > MAX_POINTER) {
            return;
        }
        int iHashCode = (name.hashCode() & Integer.MAX_VALUE) % 17;
        Entry entry = new Entry();
        entry.name = name;
        entry.pos = i10;
        Entry[] entryArr = this.table;
        entry.next = entryArr[iHashCode];
        entryArr[iHashCode] = entry;
        if (this.verbose) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Adding ");
            stringBuffer.append(name);
            stringBuffer.append(" at ");
            stringBuffer.append(i10);
            printStream.println(stringBuffer.toString());
        }
    }

    public int get(Name name) {
        int i10 = -1;
        for (Entry entry = this.table[(name.hashCode() & Integer.MAX_VALUE) % 17]; entry != null; entry = entry.next) {
            if (entry.name.equals(name)) {
                i10 = entry.pos;
            }
        }
        if (this.verbose) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Looking for ");
            stringBuffer.append(name);
            stringBuffer.append(", found ");
            stringBuffer.append(i10);
            printStream.println(stringBuffer.toString());
        }
        return i10;
    }
}
