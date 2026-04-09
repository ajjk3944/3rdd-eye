.class public final Lhk2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lba4;

.field public final b:Lba4;

.field public final c:Lba4;


# direct methods
.method public constructor <init>(Lba4;Lba4;Lba4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhk2;->a:Lba4;

    .line 5
    .line 6
    iput-object p2, p0, Lhk2;->b:Lba4;

    .line 7
    .line 8
    iput-object p3, p0, Lhk2;->c:Lba4;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Lgo2;
    .locals 4

    .line 1
    iget-object v0, p0, Lhk2;->a:Lba4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    iget-object v1, p0, Lhk2;->b:Lba4;

    .line 10
    .line 11
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lym;

    .line 16
    .line 17
    iget-object v2, p0, Lhk2;->c:Lba4;

    .line 18
    .line 19
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lmv2;

    .line 24
    .line 25
    new-instance v3, Lgo2;

    .line 26
    .line 27
    invoke-direct {v3, v0, v1, v2}, Lgo2;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lym;Lmv2;)V

    .line 28
    .line 29
    .line 30
    return-object v3
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhk2;->a()Lgo2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
