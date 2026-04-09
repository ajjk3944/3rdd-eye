package j9;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.jvm.internal.p;
import org.slf4j.Marker;
import z8.z;

/* loaded from: classes4.dex */
public abstract class e extends b {
    public static final List a(Path path, String glob) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(path, "<this>");
        p.e(glob, "glob");
        DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream directoryStreamA = d.a(directoryStreamNewDirectoryStream);
            p.b(directoryStreamA);
            List listE0 = z.e0(directoryStreamA);
            i9.b.a(directoryStreamNewDirectoryStream, null);
            return listE0;
        } finally {
        }
    }

    public static /* synthetic */ List b(Path path, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = Marker.ANY_MARKER;
        }
        return a(path, str);
    }
}
