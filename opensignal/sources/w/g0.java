package w;

/* loaded from: classes.dex */
public interface g0 {
    l E(long j, l lVar, l lVar2, l lVar3);

    long L(l lVar, l lVar2, l lVar3);

    default l n(l lVar, l lVar2, l lVar3) {
        return E(L(lVar, lVar2, lVar3), lVar, lVar2, lVar3);
    }

    l v(long j, l lVar, l lVar2, l lVar3);

    default void H() {
    }
}
