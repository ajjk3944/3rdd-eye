package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* loaded from: classes3.dex */
public class PSSParameters extends AlgorithmParametersSpi {
    private PSSParameterSpec spec = PSSParameterSpec.DEFAULT;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() throws Throwable {
        long j10;
        Throwable th2;
        long jAsn1_write_init;
        IOException e10;
        long jAsn1_write_sequence;
        long jAsn1_write_tag = 0;
        try {
            try {
                jAsn1_write_init = NativeCrypto.asn1_write_init();
            } catch (IOException e11) {
                e10 = e11;
                jAsn1_write_init = 0;
            } catch (Throwable th3) {
                j10 = 0;
                th2 = th3;
                jAsn1_write_init = 0;
            }
            try {
                jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(jAsn1_write_init);
            } catch (IOException e12) {
                e10 = e12;
            } catch (Throwable th4) {
                th2 = th4;
                j10 = 0;
                NativeCrypto.asn1_write_free(j10);
                NativeCrypto.asn1_write_free(jAsn1_write_init);
                throw th2;
            }
            try {
                OAEPParameters.writeHashAndMgfHash(jAsn1_write_sequence, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                if (this.spec.getSaltLength() != 20) {
                    try {
                        jAsn1_write_tag = NativeCrypto.asn1_write_tag(jAsn1_write_sequence, 2);
                        NativeCrypto.asn1_write_uint64(jAsn1_write_tag, this.spec.getSaltLength());
                        NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                        NativeCrypto.asn1_write_free(jAsn1_write_tag);
                    } catch (Throwable th5) {
                        NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                        NativeCrypto.asn1_write_free(jAsn1_write_tag);
                        throw th5;
                    }
                }
                byte[] bArrAsn1_write_finish = NativeCrypto.asn1_write_finish(jAsn1_write_init);
                NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                NativeCrypto.asn1_write_free(jAsn1_write_init);
                return bArrAsn1_write_finish;
            } catch (IOException e13) {
                e10 = e13;
                NativeCrypto.asn1_write_cleanup(jAsn1_write_init);
                throw e10;
            }
        } catch (Throwable th6) {
            th2 = th6;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls != null && cls == PSSParameterSpec.class) {
            return this.spec;
        }
        throw new InvalidParameterSpecException("Unsupported class: " + cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidParameterSpecException("Only PSSParameterSpec is supported");
        }
        this.spec = (PSSParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt PSS AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws Throwable {
        long jAsn1_read_init;
        long jAsn1_read_sequence;
        long jAsn1_read_tagged;
        int iAsn1_read_uint64;
        long jAsn1_read_tagged2 = 0;
        try {
            jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_init);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            jAsn1_read_init = 0;
        }
        try {
            String hash = OAEPParameters.readHash(jAsn1_read_sequence);
            String mgfHash = OAEPParameters.readMgfHash(jAsn1_read_sequence);
            if (NativeCrypto.asn1_read_next_tag_is(jAsn1_read_sequence, 2)) {
                try {
                    jAsn1_read_tagged = NativeCrypto.asn1_read_tagged(jAsn1_read_sequence);
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    iAsn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(jAsn1_read_tagged);
                    NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                } catch (Throwable th5) {
                    th = th5;
                    jAsn1_read_tagged2 = jAsn1_read_tagged;
                    throw th;
                }
            } else {
                iAsn1_read_uint64 = 20;
            }
            int i10 = iAsn1_read_uint64;
            if (NativeCrypto.asn1_read_next_tag_is(jAsn1_read_sequence, 3)) {
                try {
                    jAsn1_read_tagged2 = NativeCrypto.asn1_read_tagged(jAsn1_read_sequence);
                    long jAsn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(jAsn1_read_tagged2);
                    NativeCrypto.asn1_read_free(jAsn1_read_tagged2);
                    if (jAsn1_read_uint64 != 1) {
                        throw new IOException("Error reading ASN.1 encoding");
                    }
                } finally {
                    NativeCrypto.asn1_read_free(jAsn1_read_tagged2);
                }
            }
            if (NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence) && NativeCrypto.asn1_read_is_empty(jAsn1_read_init)) {
                this.spec = new PSSParameterSpec(hash, "MGF1", new MGF1ParameterSpec(mgfHash), i10, 1);
                NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                NativeCrypto.asn1_read_free(jAsn1_read_init);
                return;
            }
            throw new IOException("Error reading ASN.1 encoding");
        } catch (Throwable th6) {
            th = th6;
            jAsn1_read_tagged2 = jAsn1_read_sequence;
            NativeCrypto.asn1_read_free(jAsn1_read_tagged2);
            NativeCrypto.asn1_read_free(jAsn1_read_init);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) throws IOException {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            throw new IOException("Unsupported format: " + str);
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws Throwable {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            throw new IOException("Unsupported format: " + str);
        }
        engineInit(bArr);
    }
}
