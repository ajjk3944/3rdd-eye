.class public final synthetic Ldk;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzc;
.implements Lth;


# instance fields
.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldk;->f:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(Lbw;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldk;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmz;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lmz;->a(Lbw;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(Lyc;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ldk;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyn;

    .line 4
    .line 5
    new-instance v1, Lek;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v0, v2}, Lek;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Le30;

    .line 12
    .line 13
    invoke-direct {p1, v1}, Le30;-><init>(Ldy;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, v1, v2, p1}, Lg40;->E(ZZLf30;)Ljp;

    .line 19
    .line 20
    .line 21
    const-string p1, "Deferred.asListenableFuture"

    .line 22
    .line 23
    return-object p1
.end method
