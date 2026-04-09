.class public final La03;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzz2;


# instance fields
.field public final a:Lzz2;

.field public final b:Lzk3;


# direct methods
.method public constructor <init>(Lzz2;Lzk3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La03;->a:Lzz2;

    .line 5
    .line 6
    iput-object p2, p0, La03;->b:Lzk3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lh83;La83;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La03;->a:Lzz2;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lzz2;->a(Lh83;La83;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final b(Lh83;La83;)Ln70;
    .locals 1

    .line 1
    iget-object v0, p0, La03;->a:Lzz2;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lzz2;->b(Lh83;La83;)Ln70;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, La03;->b:Lzk3;

    .line 8
    .line 9
    sget-object v0, Lmd2;->a:Lld2;

    .line 10
    .line 11
    invoke-static {p1, p2, v0}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
