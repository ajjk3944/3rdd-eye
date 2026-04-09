package org.xbill.DNS;

import java.util.HashMap;

/* loaded from: classes4.dex */
class Mnemonic {
    static final int CASE_LOWER = 3;
    static final int CASE_SENSITIVE = 1;
    static final int CASE_UPPER = 2;
    private static Integer[] cachedInts = new Integer[64];
    private String description;
    private boolean numericok;
    private String prefix;
    private int wordcase;
    private HashMap strings = new HashMap();
    private HashMap values = new HashMap();
    private int max = Integer.MAX_VALUE;

    static {
        int i10 = 0;
        while (true) {
            Integer[] numArr = cachedInts;
            if (i10 >= numArr.length) {
                return;
            }
            numArr[i10] = new Integer(i10);
            i10++;
        }
    }

    public Mnemonic(String str, int i10) {
        this.description = str;
        this.wordcase = i10;
    }

    private int parseNumeric(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            if (i10 < 0) {
                return -1;
            }
            if (i10 <= this.max) {
                return i10;
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private String sanitize(String str) {
        int i10 = this.wordcase;
        return i10 == 2 ? str.toUpperCase() : i10 == 3 ? str.toLowerCase() : str;
    }

    public static Integer toInteger(int i10) {
        if (i10 >= 0) {
            Integer[] numArr = cachedInts;
            if (i10 < numArr.length) {
                return numArr[i10];
            }
        }
        return new Integer(i10);
    }

    public void add(int i10, String str) {
        check(i10);
        Integer integer = toInteger(i10);
        String strSanitize = sanitize(str);
        this.strings.put(strSanitize, integer);
        this.values.put(integer, strSanitize);
    }

    public void addAlias(int i10, String str) {
        check(i10);
        Integer integer = toInteger(i10);
        this.strings.put(sanitize(str), integer);
    }

    public void addAll(Mnemonic mnemonic) {
        if (this.wordcase == mnemonic.wordcase) {
            this.strings.putAll(mnemonic.strings);
            this.values.putAll(mnemonic.values);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(mnemonic.description);
            stringBuffer.append(": wordcases do not match");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public void check(int i10) {
        if (i10 < 0 || i10 > this.max) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.description);
            stringBuffer.append(" ");
            stringBuffer.append(i10);
            stringBuffer.append("is out of range");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public String getText(int i10) {
        check(i10);
        String str = (String) this.values.get(toInteger(i10));
        if (str != null) {
            return str;
        }
        String string = Integer.toString(i10);
        if (this.prefix == null) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.prefix);
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    public int getValue(String str) {
        int numeric;
        String strSanitize = sanitize(str);
        Integer num = (Integer) this.strings.get(strSanitize);
        if (num != null) {
            return num.intValue();
        }
        String str2 = this.prefix;
        if (str2 != null && strSanitize.startsWith(str2) && (numeric = parseNumeric(strSanitize.substring(this.prefix.length()))) >= 0) {
            return numeric;
        }
        if (this.numericok) {
            return parseNumeric(strSanitize);
        }
        return -1;
    }

    public void setMaximum(int i10) {
        this.max = i10;
    }

    public void setNumericAllowed(boolean z10) {
        this.numericok = z10;
    }

    public void setPrefix(String str) {
        this.prefix = sanitize(str);
    }
}
