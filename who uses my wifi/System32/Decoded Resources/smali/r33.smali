.class public final Lr33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lga4;


# direct methods
.method public constructor <init>(Lba4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr33;->a:Lga4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lg33;
    .locals 4

    .line 1
    sget-object v0, Lmd2;->a:Lld2;

    .line 2
    .line 3
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr33;->a:Lga4;

    .line 7
    .line 8
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lgd2;

    .line 13
    .line 14
    new-instance v2, Lg33;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, v0, v1, v3}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    return-object v2
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr33;->a()Lg33;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
