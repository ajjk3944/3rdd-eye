package androidx.loader.content;

import B4.i;
import E.u;
import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l1.C5267b;

/* compiled from: Loader.java */
/* loaded from: classes.dex */
public class b<D> {
    Context mContext;
    int mId;
    InterfaceC0249b<D> mListener;
    a<D> mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    /* compiled from: Loader.java */
    public interface a<D> {
    }

    /* compiled from: Loader.java */
    /* renamed from: androidx.loader.content.b$b, reason: collision with other inner class name */
    public interface InterfaceC0249b<D> {
    }

    public b(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(D d10) {
        StringBuilder sb = new StringBuilder(64);
        u.p(sb, d10);
        sb.append("}");
        return sb.toString();
    }

    public void deliverResult(D d10) {
        InterfaceC0249b<D> interfaceC0249b = this.mListener;
        if (interfaceC0249b != null) {
            C5267b.a aVar = (C5267b.a) interfaceC0249b;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aVar.j(d10);
            } else {
                aVar.k(d10);
            }
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public boolean onCancelLoad() {
        return false;
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public void registerListener(int i, InterfaceC0249b<D> interfaceC0249b) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = interfaceC0249b;
        this.mId = i;
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z10 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z10;
        return z10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        u.p(sb, this);
        sb.append(" id=");
        return i.j(sb, this.mId, "}");
    }

    public void unregisterListener(InterfaceC0249b<D> interfaceC0249b) {
        InterfaceC0249b<D> interfaceC0249b2 = this.mListener;
        if (interfaceC0249b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0249b2 != interfaceC0249b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    public void unregisterOnLoadCanceledListener(a<D> aVar) {
        throw new IllegalStateException("No listener register");
    }

    public void deliverCancellation() {
    }

    public void onAbandon() {
    }

    public void onForceLoad() {
    }

    public void onReset() {
    }

    public void onStartLoading() {
    }

    public void onStopLoading() {
    }

    public void registerOnLoadCanceledListener(a<D> aVar) {
    }
}
