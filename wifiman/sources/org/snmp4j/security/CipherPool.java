package org.snmp4j.security;

import java.util.LinkedList;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public class CipherPool {
    private LinkedList<Cipher> availableCiphers;
    private int currentPoolSize;
    private int maxPoolSize;

    public CipherPool() {
        this(Runtime.getRuntime().availableProcessors());
    }

    public int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public synchronized void offerCipher(Cipher cipher) {
        int i10 = this.currentPoolSize;
        if (i10 < this.maxPoolSize) {
            this.currentPoolSize = i10 + 1;
            this.availableCiphers.offer(cipher);
        }
    }

    public synchronized Cipher reuseCipher() {
        Cipher cipherPoll;
        try {
            cipherPoll = this.availableCiphers.poll();
            if (cipherPoll == null) {
                this.currentPoolSize = 0;
            } else {
                this.currentPoolSize--;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cipherPoll;
    }

    public CipherPool(int i10) {
        this.currentPoolSize = 0;
        if (i10 < 0) {
            throw new IllegalArgumentException("Pool size must be >= 0");
        }
        this.maxPoolSize = i10;
        this.availableCiphers = new LinkedList<>();
    }
}
