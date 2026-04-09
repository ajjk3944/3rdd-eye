.class public final Lhm0;
.super Lyo0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final f:Landroidx/recyclerview/widget/RecyclerView;

.field public final g:Lxo0;

.field public final h:Lsb;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lyo0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lyo0;->e:Lxo0;

    .line 5
    .line 6
    iput-object v0, p0, Lhm0;->g:Lxo0;

    .line 7
    .line 8
    new-instance v0, Lsb;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, v1, p0}, Lsb;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lhm0;->h:Lsb;

    .line 15
    .line 16
    iput-object p1, p0, Lhm0;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final j()Lp0;
    .locals 1

    .line 1
    iget-object v0, p0, Lhm0;->h:Lsb;

    .line 2
    .line 3
    return-object v0
.end method
