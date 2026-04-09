.class public final Lx21;
.super Lw21;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:Ls8;

.field public final synthetic b:Ly21;


# direct methods
.method public constructor <init>(Ly21;Ls8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx21;->b:Ly21;

    .line 5
    .line 6
    iput-object p2, p0, Lx21;->a:Ls8;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Lv21;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx21;->b:Ly21;

    .line 2
    .line 3
    iget-object v0, v0, Ly21;->g:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iget-object v1, p0, Lx21;->a:Ls8;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lbw0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lv21;->x(Lu21;)Lv21;

    .line 17
    .line 18
    .line 19
    return-void
.end method
