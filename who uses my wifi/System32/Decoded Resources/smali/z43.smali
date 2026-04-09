.class public final Lz43;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lga4;

.field public final b:Lga4;

.field public final c:Lga4;


# direct methods
.method public constructor <init>(Lba4;Lba4;Lhh2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz43;->a:Lga4;

    .line 5
    .line 6
    iput-object p2, p0, Lz43;->b:Lga4;

    .line 7
    .line 8
    iput-object p3, p0, Lz43;->c:Lga4;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Lk33;
    .locals 5

    .line 1
    iget-object v0, p0, Lz43;->a:Lga4;

    .line 2
    .line 3
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    iget-object v1, p0, Lz43;->b:Lga4;

    .line 10
    .line 11
    invoke-interface {v1}, Lga4;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    iget-object v2, p0, Lz43;->c:Lga4;

    .line 18
    .line 19
    check-cast v2, Lhh2;

    .line 20
    .line 21
    invoke-virtual {v2}, Lhh2;->a()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Lk33;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    invoke-direct {v3, v0, v1, v2, v4}, Lk33;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    return-object v3
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz43;->a()Lk33;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
