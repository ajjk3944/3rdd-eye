.class public final Lqi2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lhh2;


# direct methods
.method public constructor <init>(Lhh2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqi2;->a:Lhh2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lqi2;->a:Lhh2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lmc2;->m(Landroid/content/Context;)Lmc2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, v0, Lmc2;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lba4;

    .line 14
    .line 15
    new-instance v2, Lgw3;

    .line 16
    .line 17
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lvb2;

    .line 22
    .line 23
    iget-object v0, v0, Lmc2;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lym;

    .line 26
    .line 27
    const/16 v3, 0x18

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v2, v0, v1, v3, v4}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 31
    .line 32
    .line 33
    return-object v2
.end method
