.class public final Lx33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lga4;


# direct methods
.method public constructor <init>(Lph2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx33;->a:Lga4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lg33;
    .locals 3

    .line 1
    iget-object v0, p0, Lx33;->a:Lga4;

    .line 2
    .line 3
    check-cast v0, Lph2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lph2;->a()Le51;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lmd2;->a:Lld2;

    .line 10
    .line 11
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lg33;

    .line 15
    .line 16
    invoke-direct {v2, v0, v1}, Lg33;-><init>(Le51;Lpq3;)V

    .line 17
    .line 18
    .line 19
    return-object v2
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx33;->a()Lg33;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
