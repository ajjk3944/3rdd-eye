.class public final Lrh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lhh2;

.field public final b:Lba4;


# direct methods
.method public constructor <init>(Lhh2;Lba4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrh2;->a:Lhh2;

    .line 5
    .line 6
    iput-object p2, p0, Lrh2;->b:Lba4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lg4;
    .locals 5

    .line 1
    iget-object v0, p0, Lrh2;->a:Lhh2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lrh2;->b:Lba4;

    .line 8
    .line 9
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lea3;

    .line 14
    .line 15
    sget-object v2, Lhg4;->C:Lhg4;

    .line 16
    .line 17
    iget-object v3, v2, Lhg4;->r:Lp21;

    .line 18
    .line 19
    invoke-static {}, Le51;->a()Le51;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v3, v0, v4, v1}, Lp21;->z(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sget-object v4, Lh62;->b:Lus0;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v2, v2, Lhg4;->r:Lp21;

    .line 33
    .line 34
    invoke-static {}, Le51;->a()Le51;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v2, v0, v3, v1}, Lp21;->z(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "google.afma.sdkConstants.getSdkConstants"

    .line 43
    .line 44
    invoke-virtual {v1, v2, v4, v4}, Li62;->a(Ljava/lang/String;Lg62;Lf62;)Lk62;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v2, Lg4;

    .line 49
    .line 50
    invoke-static {}, Le51;->a()Le51;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-direct {v2, v0, v1, v3}, Lg4;-><init>(Landroid/content/Context;Lk62;Le51;)V

    .line 55
    .line 56
    .line 57
    return-object v2
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrh2;->a()Lg4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
