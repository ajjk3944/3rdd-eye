package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdrl {
    public static final zzfyf zza;
    public static final zzfyf zzb;
    private final String zzc;
    private final zzdrk zzd;
    private final zzdrk zze;

    static {
        zzdrk zzdrkVar = zzdrk.PUBLIC_API_CALL;
        zzdrk zzdrkVar2 = zzdrk.PUBLIC_API_CALLBACK;
        zzdrl zzdrlVar = new zzdrl("tqgt", zzdrkVar, zzdrkVar2);
        zzdrk zzdrkVar3 = zzdrk.DYNAMITE_ENTER;
        zzdrl zzdrlVar2 = new zzdrl("l.dl", zzdrkVar, zzdrkVar3);
        zzdrk zzdrkVar4 = zzdrk.READ_FROM_DISK_START;
        zzdrl zzdrlVar3 = new zzdrl("l.rccde", zzdrkVar3, zzdrkVar4);
        zzdrl zzdrlVar4 = new zzdrl("l.rfd", zzdrkVar4, zzdrk.READ_FROM_DISK_END);
        zzdrk zzdrkVar5 = zzdrk.CLIENT_SIGNALS_START;
        zzdrl zzdrlVar5 = new zzdrl("l.rcc", zzdrkVar3, zzdrkVar5);
        zzdrk zzdrkVar6 = zzdrk.CLIENT_SIGNALS_END;
        zzdrl zzdrlVar6 = new zzdrl("l.cs", zzdrkVar5, zzdrkVar6);
        zzdrk zzdrkVar7 = zzdrk.SERVICE_CONNECTED;
        zzdrl zzdrlVar7 = new zzdrl("l.cts", zzdrkVar6, zzdrkVar7);
        zzdrk zzdrkVar8 = zzdrk.GMS_SIGNALS_START;
        zzdrk zzdrkVar9 = zzdrk.GMS_SIGNALS_END;
        zzdrl zzdrlVar8 = new zzdrl("l.gs", zzdrkVar8, zzdrkVar9);
        zzdrk zzdrkVar10 = zzdrk.GET_SIGNALS_SDKCORE_START;
        zzdrl zzdrlVar9 = new zzdrl("l.jse", zzdrkVar9, zzdrkVar10);
        zzdrk zzdrkVar11 = zzdrk.GET_SIGNALS_SDKCORE_END;
        zzdrl zzdrlVar10 = new zzdrl("l.gs-sdkcore", zzdrkVar10, zzdrkVar11);
        zzdrl zzdrlVar11 = new zzdrl("l.gs-pp", zzdrkVar11, zzdrkVar2);
        zzdrk zzdrkVar12 = zzdrk.RENDERING_START;
        zzdrl zzdrlVar12 = new zzdrl("l.render", zzdrkVar12, zzdrkVar2);
        zzdrk zzdrkVar13 = zzdrk.RENDERING_WEBVIEW_CREATION_START;
        zzdrl zzdrlVar13 = new zzdrl("l.render.pre", zzdrkVar12, zzdrkVar13);
        zzdrk zzdrkVar14 = zzdrk.RENDERING_WEBVIEW_CREATION_END;
        zzdrl zzdrlVar14 = new zzdrl("l.render.wvc", zzdrkVar13, zzdrkVar14);
        zzdrk zzdrkVar15 = zzdrk.RENDERING_AD_COMPONENT_CREATION_END;
        zzdrl zzdrlVar15 = new zzdrl("l.render.acc", zzdrkVar14, zzdrkVar15);
        zzdrk zzdrkVar16 = zzdrk.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdrk zzdrkVar17 = zzdrk.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdrl zzdrlVar16 = new zzdrl("l.render.cfg-wv", zzdrkVar16, zzdrkVar17);
        zzdrk zzdrkVar18 = zzdrk.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdrk zzdrkVar19 = zzdrk.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzfyf.zzt(zzdrlVar, zzdrlVar2, zzdrlVar3, zzdrlVar4, zzdrlVar5, zzdrlVar6, zzdrlVar7, zzdrlVar8, zzdrlVar9, zzdrlVar10, zzdrlVar11, zzdrlVar12, zzdrlVar13, zzdrlVar14, zzdrlVar15, zzdrlVar16, new zzdrl("l.render.wvlh", zzdrkVar18, zzdrkVar19), new zzdrl("l.render.post", zzdrkVar19, zzdrkVar2), new zzdrl("l.sodv", zzdrk.SIGNAL_ON_DISK_VALIDATION_START, zzdrk.SIGNAL_ON_DISK_VALIDATION_END), new zzdrl("l.sodck", zzdrk.SIGNAL_ON_DISK_CACHE_KEY_START, zzdrk.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdrl("l.sodrar", zzdrk.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdrk.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdrl("l.soddc", zzdrk.SIGNAL_ON_DISK_DECODE_START, zzdrk.SIGNAL_ON_DISK_DECODE_END));
        zzdrl zzdrlVar17 = new zzdrl("l.al", zzdrkVar, zzdrkVar2);
        zzdrl zzdrlVar18 = new zzdrl("l.al2", zzdrkVar3, zzdrkVar2);
        zzdrl zzdrlVar19 = new zzdrl("l.dl", zzdrkVar, zzdrkVar3);
        zzdrl zzdrlVar20 = new zzdrl("l.rcc", zzdrkVar3, zzdrkVar5);
        zzdrl zzdrlVar21 = new zzdrl("l.cs", zzdrkVar5, zzdrkVar6);
        zzdrl zzdrlVar22 = new zzdrl("l.cts", zzdrkVar6, zzdrkVar7);
        zzdrl zzdrlVar23 = new zzdrl("l.gs", zzdrkVar8, zzdrkVar9);
        zzdrk zzdrkVar20 = zzdrk.GET_AD_DICTIONARY_SDKCORE_START;
        zzdrl zzdrlVar24 = new zzdrl("l.jse", zzdrkVar9, zzdrkVar20);
        zzdrk zzdrkVar21 = zzdrk.GET_AD_DICTIONARY_SDKCORE_END;
        zzdrl zzdrlVar25 = new zzdrl("l.gad-js", zzdrkVar20, zzdrkVar21);
        zzdrk zzdrkVar22 = zzdrk.HTTP_RESPONSE_READY;
        zzdrl zzdrlVar26 = new zzdrl("l.http", zzdrkVar21, zzdrkVar22);
        zzdrk zzdrkVar23 = zzdrk.SCAR_PRELOADER_READY;
        zzdrl zzdrlVar27 = new zzdrl("l.slas.pre", zzdrkVar, zzdrkVar23);
        zzdrk zzdrkVar24 = zzdrk.SCAR_PRELOADER_PROCESSING_DONE;
        zzdrl zzdrlVar28 = new zzdrl("l.slas.prel.p", zzdrkVar23, zzdrkVar24);
        zzdrk zzdrkVar25 = zzdrk.NORMALIZATION_AD_RESPONSE_START;
        zzdrl zzdrlVar29 = new zzdrl("l.jse-nml", zzdrkVar22, zzdrkVar25);
        zzdrl zzdrlVar30 = new zzdrl("l.jse-nml", zzdrkVar24, zzdrkVar25);
        zzdrk zzdrkVar26 = zzdrk.NORMALIZATION_AD_RESPONSE_END;
        zzdrl zzdrlVar31 = new zzdrl("l.nml-js", zzdrkVar25, zzdrkVar26);
        zzdrk zzdrkVar27 = zzdrk.BINDER_CALL_START;
        zzdrl zzdrlVar32 = new zzdrl("l.nml-gmsg", zzdrkVar26, zzdrkVar27);
        zzdrk zzdrkVar28 = zzdrk.SERVER_RESPONSE_PARSE_START;
        zzdrl zzdrlVar33 = new zzdrl("l.nml-gmsg.s2s", zzdrkVar26, zzdrkVar28);
        zzdrl zzdrlVar34 = new zzdrl("l.binder", zzdrkVar27, zzdrkVar28);
        zzdrl zzdrlVar35 = new zzdrl("l.sr", zzdrkVar28, zzdrkVar12);
        zzdrl zzdrlVar36 = new zzdrl("l.render", zzdrkVar12, zzdrkVar2);
        zzdrl zzdrlVar37 = new zzdrl("l.t2", zzdrk.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdrk.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzdrk zzdrkVar29 = zzdrk.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzdrk zzdrkVar30 = zzdrk.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdrl zzdrlVar38 = new zzdrl("l.render.na.js", zzdrkVar29, zzdrkVar30);
        zzdrl zzdrlVar39 = new zzdrl("l.render.na.prep", zzdrkVar30, zzdrk.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzdrl zzdrlVar40 = new zzdrl("l.render.na.lna", zzdrk.RENDERING_NATIVE_ASSETS_LOADING_START, zzdrk.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzdrl zzdrlVar41 = new zzdrl("l.render.wvc", zzdrkVar13, zzdrkVar14);
        zzdrl zzdrlVar42 = new zzdrl("l.render.acc", zzdrkVar14, zzdrkVar15);
        zzdrl zzdrlVar43 = new zzdrl("l.render.cfg-wv", zzdrkVar16, zzdrkVar17);
        zzdrl zzdrlVar44 = new zzdrl("l.render.pre", zzdrkVar12, zzdrkVar13);
        zzdrl zzdrlVar45 = new zzdrl("l.render.post", zzdrkVar19, zzdrkVar2);
        zzdrl zzdrlVar46 = new zzdrl("l.render.na.post", zzdrkVar17, zzdrkVar2);
        zzdrl zzdrlVar47 = new zzdrl("l.render.wvlh", zzdrkVar18, zzdrkVar19);
        zzdrl zzdrlVar48 = new zzdrl("l.na.b", zzdrk.NATIVE_ASSETS_LOADING_BASIC_START, zzdrk.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdrl zzdrlVar49 = new zzdrl("l.na.im", zzdrk.NATIVE_ASSETS_LOADING_IMAGE_START, zzdrk.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzdrl zzdrlVar50 = new zzdrl("l.na.imc", zzdrk.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzdrk.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzdrl zzdrlVar51 = new zzdrl("l.na.l", zzdrk.NATIVE_ASSETS_LOADING_LOGO_START, zzdrk.NATIVE_ASSETS_LOADING_LOGO_END);
        zzdrl zzdrlVar52 = new zzdrl("l.na.ic", zzdrk.NATIVE_ASSETS_LOADING_ICON_START, zzdrk.NATIVE_ASSETS_LOADING_ICON_END);
        zzdrl zzdrlVar53 = new zzdrl("l.na.a", zzdrk.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzdrk.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzdrk zzdrkVar31 = zzdrk.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzdrk zzdrkVar32 = zzdrk.NATIVE_ASSETS_LOADING_VIDEO_END;
        zzb = zzfyf.zzt(zzdrlVar17, zzdrlVar18, zzdrlVar19, zzdrlVar20, zzdrlVar21, zzdrlVar22, zzdrlVar23, zzdrlVar24, zzdrlVar25, zzdrlVar26, zzdrlVar27, zzdrlVar28, zzdrlVar29, zzdrlVar30, zzdrlVar31, zzdrlVar32, zzdrlVar33, zzdrlVar34, zzdrlVar35, zzdrlVar36, zzdrlVar37, zzdrlVar38, zzdrlVar39, zzdrlVar40, zzdrlVar41, zzdrlVar42, zzdrlVar43, zzdrlVar44, zzdrlVar45, zzdrlVar46, zzdrlVar47, zzdrlVar48, zzdrlVar49, zzdrlVar50, zzdrlVar51, zzdrlVar52, zzdrlVar53, new zzdrl("l.na.v", zzdrkVar31, zzdrkVar32), new zzdrl("l.na.vc", zzdrk.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzdrkVar32), new zzdrl("l.na.m", zzdrk.NATIVE_ASSETS_LOADING_MEDIA_START, zzdrk.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdrl("l.na.c", zzdrk.NATIVE_ASSETS_LOADING_CUSTOM_START, zzdrk.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdrl("l.na.o", zzdrk.NATIVE_ASSETS_LOADING_OMID_START, zzdrk.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzdrl(String str, zzdrk zzdrkVar, zzdrk zzdrkVar2) {
        this.zzc = str;
        this.zzd = zzdrkVar;
        this.zze = zzdrkVar2;
    }

    public final zzdrk zza() {
        return this.zzd;
    }

    public final zzdrk zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
