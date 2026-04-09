package com.bykv.vk.openvk.preload.a;

/* loaded from: classes.dex */
public interface e {

    public static class a implements e {
        @Override // com.bykv.vk.openvk.preload.a.e
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    <T> T a(Class<T> cls);
}
