package org.snmp4j.security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
class Salt {
    private static Salt instance;
    private static final LogAdapter logger = LogFactory.getLogger(Salt.class);
    private long salt;

    protected Salt() {
        byte[] bArr = new byte[8];
        try {
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        } catch (NoSuchAlgorithmException unused) {
            logger.warn("Could not use SecureRandom. Using Random instead.");
            new Random().nextBytes(bArr);
        }
        this.salt = bArr[0];
        for (int i10 = 0; i10 < 7; i10++) {
            this.salt = (this.salt * 256) + bArr[i10] + 128;
        }
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Initialized Salt to " + Long.toHexString(this.salt) + ".");
        }
    }

    public static Salt getInstance() {
        if (instance == null) {
            instance = new Salt();
        }
        return instance;
    }

    public synchronized long getNext() {
        long j10;
        j10 = this.salt;
        this.salt = 1 + j10;
        return j10;
    }
}
