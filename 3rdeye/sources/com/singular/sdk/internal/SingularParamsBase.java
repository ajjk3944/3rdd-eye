package com.singular.sdk.internal;

/* loaded from: classes2.dex */
public class SingularParamsBase extends SingularMap {

    public interface Constants {
        public static final String AIFA_KEYSPACE_KEY = "aifa";
        public static final String AIFA_KEYSPACE_VALUE = "AIFA";
        public static final String AMID_KEYSPACE_KEY = "amid";
        public static final String AMID_KEYSPACE_VALUE = "AMID";
        public static final String ANDI_KEYSPACE_KEY = "andi";
        public static final String ANDI_KEYSPACE_VALUE = "ANDI";
        public static final String ASID_KEYSPACE_KEY = "asid";
        public static final String ASID_KEYSPACE_VALUE = "ASID";
        public static final String IDENTIFIER_KEYSPACE_KEY = "k";
        public static final String IDENTIFIER_UNIQUE_ID_KEY = "u";
        public static final String IMEI_KEYSPACE_KEY = "imei";
        public static final String IMEI_KEYSPACE_VALUE = "IMEI";
        public static final String OAID_KEYSPACE_KEY = "oaid";
        public static final String OAID_KEYSPACE_VALUE = "OAID";
        public static final String PACKAGE_NAME_KEY = "i";
        public static final String PLATFORM_KEY = "p";
    }

    private void putAsidOrAifaIfNotNull(DeviceInfo deviceInfo) {
        if (!Utils.isEmptyOrNull(deviceInfo.aifa)) {
            put(Constants.AIFA_KEYSPACE_KEY, deviceInfo.aifa);
        } else {
            if (Utils.isEmptyOrNull(deviceInfo.asid)) {
                return;
            }
            put(Constants.ASID_KEYSPACE_KEY, deviceInfo.asid);
        }
    }

    public SingularParamsBase withDeviceInfo(DeviceInfo deviceInfo) {
        put(Constants.PACKAGE_NAME_KEY, deviceInfo.packageName);
        put(Constants.PLATFORM_KEY, deviceInfo.platform);
        SLSingularDeviceIdentifier sLSingularDeviceIdentifier = deviceInfo.sdid;
        if (sLSingularDeviceIdentifier != null && !Utils.isEmptyOrNull(sLSingularDeviceIdentifier.getValue())) {
            put(Constants.IDENTIFIER_KEYSPACE_KEY, com.singular.sdk.internal.Constants.SDID_KEY);
            put(Constants.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.sdid.getValue());
            putAsidOrAifaIfNotNull(deviceInfo);
            return this;
        }
        if (!Utils.isEmptyOrNull(deviceInfo.amid)) {
            put(Constants.AMID_KEYSPACE_KEY, deviceInfo.amid);
            put(Constants.IDENTIFIER_KEYSPACE_KEY, Constants.AMID_KEYSPACE_VALUE);
            put(Constants.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.amid);
            putAsidOrAifaIfNotNull(deviceInfo);
            return this;
        }
        if (!Utils.isEmptyOrNull(deviceInfo.aifa)) {
            put(Constants.AIFA_KEYSPACE_KEY, deviceInfo.aifa);
            put(Constants.IDENTIFIER_KEYSPACE_KEY, Constants.AIFA_KEYSPACE_VALUE);
            put(Constants.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.aifa);
            return this;
        }
        if (!Utils.isEmptyOrNull(deviceInfo.oaid)) {
            put(Constants.IDENTIFIER_KEYSPACE_KEY, Constants.OAID_KEYSPACE_VALUE);
            put(Constants.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.oaid);
            put("oaid", deviceInfo.oaid);
            if (!Utils.isEmptyOrNull(deviceInfo.asid)) {
                put(Constants.ASID_KEYSPACE_KEY, deviceInfo.asid);
                return this;
            }
        } else {
            if (!Utils.isEmptyOrNull(deviceInfo.imei)) {
                put(Constants.IMEI_KEYSPACE_KEY, deviceInfo.imei);
                put(Constants.IDENTIFIER_KEYSPACE_KEY, Constants.IMEI_KEYSPACE_VALUE);
                put(Constants.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.imei);
                return this;
            }
            if (!Utils.isEmptyOrNull(deviceInfo.asid)) {
                put(Constants.IDENTIFIER_KEYSPACE_KEY, Constants.ASID_KEYSPACE_VALUE);
                put(Constants.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.asid);
                put(Constants.ASID_KEYSPACE_KEY, deviceInfo.asid);
                return this;
            }
            if (!Utils.isEmptyOrNull(deviceInfo.andi)) {
                put(Constants.IDENTIFIER_KEYSPACE_KEY, Constants.ANDI_KEYSPACE_VALUE);
                put(Constants.IDENTIFIER_UNIQUE_ID_KEY, deviceInfo.andi);
                put(Constants.ANDI_KEYSPACE_KEY, deviceInfo.andi);
            }
        }
        return this;
    }
}
