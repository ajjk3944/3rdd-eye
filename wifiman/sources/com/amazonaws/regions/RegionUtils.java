package com.amazonaws.regions;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public abstract class RegionUtils {

    /* renamed from: a, reason: collision with root package name */
    private static List f34147a;

    /* renamed from: b, reason: collision with root package name */
    private static final Log f34148b = LogFactory.c("com.amazonaws.request");

    public static Region a(String str) {
        for (Region region : b()) {
            if (region.d().equals(str)) {
                return region;
            }
        }
        return null;
    }

    public static synchronized List b() {
        try {
            if (f34147a == null) {
                c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f34147a;
    }

    public static synchronized void c() {
        if (System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride") != null) {
            try {
                f();
            } catch (FileNotFoundException e10) {
                throw new RuntimeException("Couldn't find regions override file specified", e10);
            }
        }
        if (f34147a == null) {
            e();
        }
        if (f34147a == null) {
            throw new RuntimeException("Failed to initialize the regions.");
        }
    }

    private static void d(InputStream inputStream) {
        try {
            f34147a = new RegionMetadataParser().e(inputStream);
        } catch (Exception e10) {
            f34148b.c("Failed to parse regional endpoints", e10);
        }
    }

    private static void e() {
        Log log = f34148b;
        if (log.isDebugEnabled()) {
            log.a("Initializing the regions with default regions");
        }
        f34147a = RegionDefaults.a();
    }

    private static void f() {
        String property = System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride");
        Log log = f34148b;
        if (log.isDebugEnabled()) {
            log.a("Using local override of the regions file (" + property + ") to initiate regions data...");
        }
        d(new FileInputStream(new File(property)));
    }
}
