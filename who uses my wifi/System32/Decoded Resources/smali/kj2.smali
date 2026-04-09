.class public final Lkj2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lwm2;


# instance fields
.field public final f:Lc83;

.field public final g:Lh83;

.field public final h:Ldb3;

.field public final i:Leb3;


# direct methods
.method public constructor <init>(Lh83;Leb3;Ldb3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkj2;->g:Lh83;

    .line 5
    .line 6
    iput-object p2, p0, Lkj2;->i:Leb3;

    .line 7
    .line 8
    iput-object p3, p0, Lkj2;->h:Ldb3;

    .line 9
    .line 10
    iget-object p1, p1, Lh83;->b:Lp21;

    .line 11
    .line 12
    iget-object p1, p1, Lp21;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lc83;

    .line 15
    .line 16
    iput-object p1, p0, Lkj2;->f:Lc83;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final d0(Lnx2;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lkj2;->f:Lc83;

    .line 2
    .line 3
    iget-object p1, p1, Lc83;->a:Ljava/util/List;

    .line 4
    .line 5
    iget-object v0, p0, Lkj2;->h:Ldb3;

    .line 6
    .line 7
    iget-object v1, p0, Lkj2;->g:Lh83;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2, p1}, Ldb3;->a(Lh83;La83;Ljava/util/List;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lkj2;->i:Leb3;

    .line 15
    .line 16
    invoke-virtual {v0, p1, v2}, Leb3;->a(Ljava/util/List;Lx34;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
