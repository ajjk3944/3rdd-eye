.class public Lfn3;
.super Lgm3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final transient i:Lxn3;

.field public final transient j:I

.field public transient k:Len3;


# direct methods
.method public constructor <init>(Lxn3;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfn3;->i:Lxn3;

    .line 5
    .line 6
    iput p2, p0, Lfn3;->j:I

    .line 7
    .line 8
    sget-object p1, Lyn3;->n:[Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/util/Collection;
    .locals 1

    .line 1
    new-instance v0, Lbn3;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lbn3;-><init>(Lfn3;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    const-string v1, "should never be called"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0, p1}, Lem3;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public synthetic d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lfn3;->i:Lxn3;

    .line 2
    .line 3
    return-object v0
.end method
