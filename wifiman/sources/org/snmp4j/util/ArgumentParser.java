package org.snmp4j.util;

import java.io.PrintStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class ArgumentParser {
    public static final String[] TYPES = {"i", "l", "s", SnmpConfigurator.O_OPERATION};
    public static final int TYPE_INTEGER = 0;
    public static final int TYPE_LONG = 1;
    public static final int TYPE_OCTET_STRING = 3;
    public static final int TYPE_STRING = 2;
    private Map<String, ArgumentFormat> optionFormat;
    private Map<? extends String, ? extends ArgumentFormat> parameterFormat;

    public static class ArgumentFormat {
        private boolean mandatory;
        private String option;
        private boolean parameter;
        private ArgumentParameter[] params;
        private boolean vararg;

        public String getOption() {
            return this.option;
        }

        public ArgumentParameter[] getParameters() {
            return this.params;
        }

        public boolean isMandatory() {
            return this.mandatory;
        }

        public boolean isParameter() {
            return this.parameter;
        }

        public boolean isVariableLength() {
            return this.vararg;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ArgumentFormat[option=");
            sb2.append(this.option);
            sb2.append(",parameter=");
            sb2.append(this.parameter);
            sb2.append(",vararg=");
            sb2.append(this.vararg);
            sb2.append(",mandatatory=");
            sb2.append(this.mandatory);
            sb2.append(",parameters=");
            ArgumentParameter[] argumentParameterArr = this.params;
            sb2.append(argumentParameterArr == null ? "<null>" : Arrays.asList(argumentParameterArr).toString());
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class ArgumentParameter {
        private String defaultValue;
        private String name;
        private Pattern pattern;
        private int type;

        public String getDefaultValue() {
            return this.defaultValue;
        }

        public String getName() {
            return this.name;
        }

        public int getType() {
            return this.type;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ArgumentParameter[name=");
            sb2.append(this.name);
            sb2.append(",type=");
            sb2.append(this.type);
            sb2.append(",patttern=");
            Pattern pattern = this.pattern;
            sb2.append(pattern == null ? null : pattern.pattern());
            sb2.append(",defaultValue=");
            sb2.append(this.defaultValue);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public ArgumentParser(String str, String str2) {
        this.optionFormat = parseFormat(str, false);
        this.parameterFormat = parseFormat(str2, true);
    }

    public static Object getFirstValue(List<? extends Object> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    private static int getType(String str) {
        return Arrays.binarySearch(TYPES, str);
    }

    public static Object getValue(Map map, String str, int i10) {
        List list = (List) map.get(str);
        if (list == null || list.size() <= i10) {
            return null;
        }
        return list.get(i10);
    }

    public static void main(String[] strArr) {
        ArgumentParser argumentParser = new ArgumentParser(System.getProperty("org.snmp4j.OptionFormat", "-o1[i{parameter1}] -o2[s,l]"), System.getProperty("org.snmp4j.ParameterFormat", "-param1[i] -param2[s<(udp|tcp):.*[/[0-9]+]?>{=udp:127.0.0.1/161}] +optParam1[l{=-100}] .."));
        PrintStream printStream = System.out;
        printStream.println("Option format is: " + argumentParser.getOptionFormat());
        printStream.println("Parameter format is: " + argumentParser.getParameterFormat());
        try {
            printStream.println(argumentParser.parse(strArr));
        } catch (ParseException e10) {
            System.err.println("Failed to parse args: " + e10.getMessage());
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0162, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static java.util.Map<java.lang.String, org.snmp4j.util.ArgumentParser.ArgumentFormat> parseFormat(java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.util.ArgumentParser.parseFormat(java.lang.String, boolean):java.util.Map");
    }

    private static String parseParameterFormat(String str, ArgumentParameter argumentParameter) {
        int iIndexOf = str.indexOf(60);
        if (iIndexOf <= 0) {
            iIndexOf = str.indexOf("{");
        }
        argumentParameter.type = getType(str.substring(0, iIndexOf));
        String strSubstring = str.substring(str.indexOf(123) + 1, str.length() - 1);
        int iIndexOf2 = strSubstring.indexOf(61);
        if (iIndexOf2 >= 0) {
            argumentParameter.defaultValue = strSubstring.substring(iIndexOf2 + 1);
            argumentParameter.name = strSubstring.substring(0, iIndexOf2);
        } else {
            argumentParameter.name = strSubstring;
        }
        int iIndexOf3 = str.indexOf(62);
        if (iIndexOf3 > 0) {
            iIndexOf = iIndexOf3 + 1;
        }
        return str.substring(0, iIndexOf);
    }

    public static String[] selectCommand(String[] strArr, String str, String[][] strArr2) throws ParseException {
        String str2 = (String) getValue(new ArgumentParser(str, "#command[s] +following[s] ..").parse(strArr), "command", 0);
        for (String[] strArr3 : strArr2) {
            if (strArr3[0].equals(str2)) {
                return strArr3;
            }
        }
        throw new ParseException("Command '" + str2 + "' not found", 0);
    }

    protected void addValues2Option(String str, List list, Map<String, List<?>> map) {
        List<?> list2 = map.get(str);
        if (list2 == null || list == null) {
            map.put(str, list);
        } else {
            list2.addAll(list);
        }
    }

    public Map<String, ArgumentFormat> getOptionFormat() {
        return this.optionFormat;
    }

    public Map<? extends String, ? extends ArgumentFormat> getParameterFormat() {
        return this.parameterFormat;
    }

    public Map<String, List<?>> parse(String[] strArr) throws ParseException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends ArgumentFormat> it = this.parameterFormat.values().iterator();
        ArgumentFormat next = null;
        int iMax = 0;
        while (iMax < strArr.length) {
            if (strArr[iMax].length() != 0) {
                if (strArr[iMax].charAt(0) == '-') {
                    String strSubstring = strArr[iMax].substring(1);
                    ArgumentFormat argumentFormat = this.optionFormat.get(strSubstring);
                    if (argumentFormat == null) {
                        throw new ParseException("Unknown option '" + strSubstring + "' at position " + iMax, iMax);
                    }
                    next = argumentFormat;
                } else {
                    if (it.hasNext()) {
                        next = it.next();
                    } else if (next == null || !next.isVariableLength()) {
                        next = null;
                    }
                    if (next == null) {
                        throw new ParseException("Unrecognized parameter at position " + iMax, iMax);
                    }
                }
                if (next.getParameters() == null || next.getParameters().length <= 0) {
                    addValues2Option(next.getOption(), null, linkedHashMap);
                } else {
                    boolean zIsParameter = next.isParameter();
                    List<?> values = parseValues(strArr, (1 - (zIsParameter ? 1 : 0)) + iMax, next);
                    iMax += Math.max(values.size() - (zIsParameter ? 1 : 0), 0);
                    if (next.isVariableLength() && linkedHashMap.containsKey(next.getOption())) {
                        ((List) linkedHashMap.get(next.getOption())).addAll(values);
                    } else {
                        addValues2Option(next.getOption(), values, linkedHashMap);
                    }
                }
            }
            iMax++;
        }
        while (it.hasNext()) {
            ArgumentFormat next2 = it.next();
            if (!next2.isMandatory()) {
                throw new ArgumentParseException(-1, null, next2, null);
            }
            if (next2.getParameters() != null && next2.getParameters().length > 0) {
                ArrayList arrayList = new ArrayList();
                for (ArgumentParameter argumentParameter : next2.getParameters()) {
                    if (argumentParameter.getDefaultValue() == null) {
                        throw new ArgumentParseException(-1, null, next2, argumentParameter);
                    }
                    arrayList.add(parseParameterValue(argumentParameter, argumentParameter.getDefaultValue(), next2, arrayList.size()));
                }
                addValues2Option(next2.getOption(), arrayList, linkedHashMap);
            }
        }
        for (ArgumentFormat argumentFormat2 : this.optionFormat.values()) {
            if (argumentFormat2.isMandatory() && !linkedHashMap.containsKey(argumentFormat2.getOption())) {
                ArrayList arrayList2 = new ArrayList();
                if (argumentFormat2.getParameters() != null) {
                    for (int i10 = 0; i10 < argumentFormat2.getParameters().length; i10++) {
                        if (argumentFormat2.getParameters()[i10] != null && argumentFormat2.getParameters()[i10].getDefaultValue() != null) {
                            arrayList2.add(parseParameterValue(argumentFormat2.getParameters()[i10], argumentFormat2.getParameters()[i10].getDefaultValue(), argumentFormat2, i10));
                        }
                    }
                }
                if (arrayList2.size() == 0) {
                    throw new ArgumentParseException(-1, null, argumentFormat2, (argumentFormat2.getParameters() == null || argumentFormat2.getParameters().length <= 0) ? null : argumentFormat2.getParameters()[0]);
                }
                addValues2Option(argumentFormat2.getOption(), arrayList2, linkedHashMap);
            }
        }
        return linkedHashMap;
    }

    protected Object parseParameterValue(ArgumentParameter argumentParameter, String str, ArgumentFormat argumentFormat, int i10) throws ArgumentParseException {
        String str2;
        if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 2);
        }
        String str3 = str;
        if (argumentParameter.pattern == null || argumentParameter.pattern.matcher(str3).matches()) {
            int type = argumentParameter.getType();
            return type != 0 ? type != 1 ? type != 3 ? str3 : OctetString.fromHexString(str3, ':') : new Long(str3) : new Integer(str3);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Value '");
        sb2.append(str3);
        sb2.append("' for ");
        sb2.append(argumentFormat.isParameter() ? "parameter " : "option ");
        sb2.append(argumentFormat.getOption());
        if (argumentFormat.getParameters().length > 1) {
            str2 = " part " + argumentParameter.getName();
        } else {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(" does not match pattern '");
        sb2.append(argumentParameter.pattern.pattern());
        sb2.append("'");
        throw new ArgumentParseException(sb2.toString(), i10, str3, argumentFormat, argumentParameter);
    }

    protected List<?> parseValues(String[] strArr, int i10, ArgumentFormat argumentFormat) throws ParseException {
        int length = argumentFormat.getParameters().length;
        ArrayList arrayList = new ArrayList(length);
        int i11 = 0;
        while (true) {
            int i12 = i11 + i10;
            if (i12 >= strArr.length || i11 >= length) {
                break;
            }
            try {
                arrayList.add(parseParameterValue(argumentFormat.getParameters()[i11], strArr[i12], argumentFormat, i12));
                i11++;
            } catch (ArgumentParseException e10) {
                throw e10;
            } catch (Exception e11) {
                e11.printStackTrace();
                throw new ArgumentParseException(i12, strArr[i12], argumentFormat, argumentFormat.getParameters()[i11]);
            }
        }
        return arrayList;
    }

    public static class ArgumentParseException extends ParseException {
        private ArgumentFormat parameterFormat;
        private ArgumentParameter parameterFormatDetail;
        private String value;

        public ArgumentParseException(int i10, String str, ArgumentFormat argumentFormat, ArgumentParameter argumentParameter) {
            StringBuilder sb2;
            String string;
            if (str != null) {
                sb2 = new StringBuilder();
                sb2.append("Invalid value '");
                sb2.append(str);
                sb2.append("' at position ");
                sb2.append(i10);
                string = sb2.toString();
            } else {
                sb2 = new StringBuilder();
                sb2.append("Mandatory parameter ");
                sb2.append(argumentFormat == null ? "<unknown>" : argumentFormat.getOption());
                sb2.append("(");
                sb2.append(argumentParameter != null ? argumentParameter.getName() : "<unknown>");
                sb2.append(") not specified");
                string = sb2.toString();
            }
            super(string, i10);
            this.parameterFormat = argumentFormat;
            this.parameterFormatDetail = argumentParameter;
            this.value = str;
        }

        public ArgumentFormat getParameterFormat() {
            return this.parameterFormat;
        }

        public ArgumentParameter getParameterFormatDetail() {
            return this.parameterFormatDetail;
        }

        public String getValue() {
            return this.value;
        }

        public ArgumentParseException(String str, int i10, String str2, ArgumentFormat argumentFormat, ArgumentParameter argumentParameter) {
            super(str, i10);
            this.parameterFormat = argumentFormat;
            this.parameterFormatDetail = argumentParameter;
            this.value = str2;
        }
    }
}
