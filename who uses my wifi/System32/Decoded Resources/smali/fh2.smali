.class public final Lfh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lba4;


# direct methods
.method public constructor <init>(Lba4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfh2;->a:Lba4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lra4;
    .locals 1

    .line 1
    iget-object v0, p0, Lfh2;->a:Lba4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lgd2;

    .line 8
    .line 9
    invoke-virtual {v0}, Lgd2;->g()Lra4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfh2;->a()Lra4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
