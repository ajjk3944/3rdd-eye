package org.msgpack.core;

import org.conscrypt.PSKKeyManager;
import org.msgpack.core.d;
import yj.w;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'POSFIXINT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c ARRAY16;
    public static final c ARRAY32;
    public static final c BIN16;
    public static final c BIN32;
    public static final c BIN8;
    public static final c BOOLEAN;
    public static final c EXT16;
    public static final c EXT32;
    public static final c EXT8;
    public static final c FIXARRAY;
    public static final c FIXEXT1;
    public static final c FIXEXT16;
    public static final c FIXEXT2;
    public static final c FIXEXT4;
    public static final c FIXEXT8;
    public static final c FIXMAP;
    public static final c FIXSTR;
    public static final c FLOAT32;
    public static final c FLOAT64;
    public static final c INT16;
    public static final c INT32;
    public static final c INT64;
    public static final c INT8;
    public static final c MAP16;
    public static final c MAP32;
    public static final c NEGFIXINT;
    public static final c NEVER_USED;
    public static final c NIL;
    public static final c POSFIXINT;
    public static final c STR16;
    public static final c STR32;
    public static final c STR8;
    public static final c UINT16;
    public static final c UINT32;
    public static final c UINT64;
    public static final c UINT8;
    private static final c[] formatTable;
    private final w valueType;

    static {
        w wVar = w.INTEGER;
        c cVar = new c("POSFIXINT", 0, wVar);
        POSFIXINT = cVar;
        w wVar2 = w.MAP;
        c cVar2 = new c("FIXMAP", 1, wVar2);
        FIXMAP = cVar2;
        w wVar3 = w.ARRAY;
        c cVar3 = new c("FIXARRAY", 2, wVar3);
        FIXARRAY = cVar3;
        w wVar4 = w.STRING;
        c cVar4 = new c("FIXSTR", 3, wVar4);
        FIXSTR = cVar4;
        c cVar5 = new c("NIL", 4, w.NIL);
        NIL = cVar5;
        c cVar6 = new c("NEVER_USED", 5, null);
        NEVER_USED = cVar6;
        c cVar7 = new c("BOOLEAN", 6, w.BOOLEAN);
        BOOLEAN = cVar7;
        w wVar5 = w.BINARY;
        c cVar8 = new c("BIN8", 7, wVar5);
        BIN8 = cVar8;
        c cVar9 = new c("BIN16", 8, wVar5);
        BIN16 = cVar9;
        c cVar10 = new c("BIN32", 9, wVar5);
        BIN32 = cVar10;
        w wVar6 = w.EXTENSION;
        c cVar11 = new c("EXT8", 10, wVar6);
        EXT8 = cVar11;
        c cVar12 = new c("EXT16", 11, wVar6);
        EXT16 = cVar12;
        c cVar13 = new c("EXT32", 12, wVar6);
        EXT32 = cVar13;
        w wVar7 = w.FLOAT;
        c cVar14 = new c("FLOAT32", 13, wVar7);
        FLOAT32 = cVar14;
        c cVar15 = new c("FLOAT64", 14, wVar7);
        FLOAT64 = cVar15;
        c cVar16 = new c("UINT8", 15, wVar);
        UINT8 = cVar16;
        c cVar17 = new c("UINT16", 16, wVar);
        UINT16 = cVar17;
        c cVar18 = new c("UINT32", 17, wVar);
        UINT32 = cVar18;
        c cVar19 = new c("UINT64", 18, wVar);
        UINT64 = cVar19;
        c cVar20 = new c("INT8", 19, wVar);
        INT8 = cVar20;
        c cVar21 = new c("INT16", 20, wVar);
        INT16 = cVar21;
        c cVar22 = new c("INT32", 21, wVar);
        INT32 = cVar22;
        c cVar23 = new c("INT64", 22, wVar);
        INT64 = cVar23;
        c cVar24 = new c("FIXEXT1", 23, wVar6);
        FIXEXT1 = cVar24;
        c cVar25 = new c("FIXEXT2", 24, wVar6);
        FIXEXT2 = cVar25;
        c cVar26 = new c("FIXEXT4", 25, wVar6);
        FIXEXT4 = cVar26;
        c cVar27 = new c("FIXEXT8", 26, wVar6);
        FIXEXT8 = cVar27;
        c cVar28 = new c("FIXEXT16", 27, wVar6);
        FIXEXT16 = cVar28;
        c cVar29 = new c("STR8", 28, wVar4);
        STR8 = cVar29;
        c cVar30 = new c("STR16", 29, wVar4);
        STR16 = cVar30;
        c cVar31 = new c("STR32", 30, wVar4);
        STR32 = cVar31;
        c cVar32 = new c("ARRAY16", 31, wVar3);
        ARRAY16 = cVar32;
        c cVar33 = new c("ARRAY32", 32, wVar3);
        ARRAY32 = cVar33;
        c cVar34 = new c("MAP16", 33, wVar2);
        MAP16 = cVar34;
        c cVar35 = new c("MAP32", 34, wVar2);
        MAP32 = cVar35;
        c cVar36 = new c("NEGFIXINT", 35, wVar);
        NEGFIXINT = cVar36;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, cVar36};
        formatTable = new c[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i10 = 0; i10 <= 255; i10++) {
            formatTable[i10] = toMessageFormat((byte) i10);
        }
    }

    private c(String str, int i10, w wVar) {
        this.valueType = wVar;
    }

    static c toMessageFormat(byte b10) {
        if (d.a.g(b10)) {
            return POSFIXINT;
        }
        if (d.a.f(b10)) {
            return NEGFIXINT;
        }
        if (d.a.b(b10)) {
            return FIXSTR;
        }
        if (d.a.c(b10)) {
            return FIXARRAY;
        }
        if (d.a.d(b10)) {
            return FIXMAP;
        }
        switch (b10) {
            case -64:
                return NIL;
            case -63:
            default:
                return NEVER_USED;
            case -62:
            case -61:
                return BOOLEAN;
            case -60:
                return BIN8;
            case -59:
                return BIN16;
            case -58:
                return BIN32;
            case -57:
                return EXT8;
            case -56:
                return EXT16;
            case -55:
                return EXT32;
            case -54:
                return FLOAT32;
            case -53:
                return FLOAT64;
            case -52:
                return UINT8;
            case -51:
                return UINT16;
            case -50:
                return UINT32;
            case -49:
                return UINT64;
            case -48:
                return INT8;
            case -47:
                return INT16;
            case -46:
                return INT32;
            case -45:
                return INT64;
            case -44:
                return FIXEXT1;
            case -43:
                return FIXEXT2;
            case -42:
                return FIXEXT4;
            case -41:
                return FIXEXT8;
            case -40:
                return FIXEXT16;
            case -39:
                return STR8;
            case -38:
                return STR16;
            case -37:
                return STR32;
            case -36:
                return ARRAY16;
            case -35:
                return ARRAY32;
            case -34:
                return MAP16;
            case -33:
                return MAP32;
        }
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public w getValueType() throws MessageFormatException {
        if (this != NEVER_USED) {
            return this.valueType;
        }
        throw new MessageFormatException("Cannot convert NEVER_USED to ValueType");
    }

    public static c valueOf(byte b10) {
        return formatTable[b10 & 255];
    }
}
