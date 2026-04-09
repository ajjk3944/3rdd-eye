package g8;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes3.dex */
public abstract class n {
    public static synchronized Object a(Context context, String str) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(new File(context.getFilesDir(), str));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        g.a(fileInputStream);
        g.a(objectInputStream);
        return object;
    }

    public static synchronized void b(Context context, String str, Object obj) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), str));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            g.a(fileOutputStream);
            g.a(objectOutputStream);
        }
    }
}
