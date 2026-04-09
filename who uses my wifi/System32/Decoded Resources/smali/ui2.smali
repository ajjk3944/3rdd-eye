.class public final Lui2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lhm3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhm3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lui2;->a:Lhm3;

    .line 7
    .line 8
    new-instance v0, Lui2;

    .line 9
    .line 10
    sget-object v1, Lxm3;->g:Lvm3;

    .line 11
    .line 12
    sget-object v1, Lsn3;->j:Lsn3;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lui2;-><init>(Lsn3;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lv23;->a:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    const/16 v1, 0x24

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lsn3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lxm3;->g:Lvm3;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Lxm3;->p(I)Lvm3;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lgi2;->C(Lyq2;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    array-length v0, p1

    .line 23
    invoke-static {p1, v0}, Lwl2;->G([Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Lui2;->a:Lhm3;

    .line 27
    .line 28
    invoke-static {p1, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, Lxm3;->o([Ljava/lang/Object;I)Lsn3;

    .line 32
    .line 33
    .line 34
    return-void
.end method
