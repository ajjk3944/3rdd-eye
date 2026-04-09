package org.snmp4j.security;

import java.util.Hashtable;
import java.util.Map;
import org.snmp4j.smi.Integer32;

/* loaded from: classes2.dex */
public class SecurityModels {
    private static SecurityModels instance;
    private Map<Integer32, SecurityModel> securityModels = new Hashtable(3);

    public static SecurityModels getCollection(SecurityModel[] securityModelArr) {
        SecurityModels securityModels = new SecurityModels();
        for (SecurityModel securityModel : securityModelArr) {
            securityModels.addSecurityModel(securityModel);
        }
        return securityModels;
    }

    public static synchronized SecurityModels getInstance() {
        try {
            if (instance == null) {
                instance = new SecurityModels();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return instance;
    }

    public SecurityModels addSecurityModel(SecurityModel securityModel) {
        this.securityModels.put(new Integer32(securityModel.getID()), securityModel);
        return this;
    }

    public SecurityModel getSecurityModel(Integer32 integer32) {
        return this.securityModels.get(integer32);
    }

    public SecurityModel removeSecurityModel(Integer32 integer32) {
        return this.securityModels.remove(integer32);
    }
}
