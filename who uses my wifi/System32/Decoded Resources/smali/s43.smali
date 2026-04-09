.class public final Ls43;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lga4;

.field public final b:Lga4;


# direct methods
.method public constructor <init>(Lhh2;Lba4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls43;->a:Lga4;

    .line 5
    .line 6
    iput-object p2, p0, Ls43;->b:Lga4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lg33;
    .locals 4

    .line 1
    iget-object v0, p0, Ls43;->a:Lga4;

    .line 2
    .line 3
    check-cast v0, Lhh2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Ls43;->b:Lga4;

    .line 10
    .line 11
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/content/Intent;

    .line 16
    .line 17
    new-instance v2, Lg33;

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-direct {v2, v0, v1, v3}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    return-object v2
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls43;->a()Lg33;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
