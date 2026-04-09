package javax.jmdns.impl.constants;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes4.dex */
public enum DNSRecordClass {
    CLASS_UNKNOWN("?", 0),
    CLASS_IN(ScarConstants.IN_SIGNAL_KEY, 1),
    CLASS_CS("cs", 2),
    CLASS_CH("ch", 3),
    CLASS_HS("hs", 4),
    CLASS_NONE("none", 254),
    CLASS_ANY("any", 255);

    public static final int CLASS_MASK = 32767;
    public static final int CLASS_UNIQUE = 32768;
    public static final boolean NOT_UNIQUE = false;
    public static final boolean UNIQUE = true;
    private static Logger logger = LoggerFactory.getLogger(DNSRecordClass.class.getName());
    private final String _externalName;
    private final int _index;

    DNSRecordClass(String str, int i10) {
        this._externalName = str;
        this._index = i10;
    }

    public static DNSRecordClass classForIndex(int i10) {
        int i11 = i10 & CLASS_MASK;
        for (DNSRecordClass dNSRecordClass : values()) {
            if (dNSRecordClass._index == i11) {
                return dNSRecordClass;
            }
        }
        logger.warn("Could not find record class for index: " + i10);
        return CLASS_UNKNOWN;
    }

    public static DNSRecordClass classForName(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            for (DNSRecordClass dNSRecordClass : values()) {
                if (dNSRecordClass._externalName.equals(lowerCase)) {
                    return dNSRecordClass;
                }
            }
        }
        logger.warn("Could not find record class for name: " + str);
        return CLASS_UNKNOWN;
    }

    public String externalName() {
        return this._externalName;
    }

    public int indexValue() {
        return this._index;
    }

    public boolean isUnique(int i10) {
        return (this == CLASS_UNKNOWN || (i10 & 32768) == 0) ? false : true;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + indexValue();
    }
}
