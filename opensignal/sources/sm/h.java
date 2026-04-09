package sm;

import com.staircase3.opensignal.models.PlaceType;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h {
    public static PlaceType a(int i10) {
        Object next;
        Iterator<E> it = PlaceType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (i10 == ((PlaceType) next).getIntValue()) {
                break;
            }
        }
        PlaceType placeType = (PlaceType) next;
        return placeType == null ? PlaceType.UNKNOWN : placeType;
    }
}
