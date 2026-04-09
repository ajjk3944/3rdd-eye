.class public final Lzx0;
.super Lqj;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public i:Lay0;

.field public j:Lav;

.field public k:Lby0;

.field public l:Lw30;

.field public m:Ljava/lang/Object;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lay0;

.field public p:I


# direct methods
.method public constructor <init>(Lay0;Lqj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzx0;->o:Lay0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lqj;-><init>(Loj;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lzx0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lzx0;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lzx0;->p:I

    .line 9
    .line 10
    iget-object p1, p0, Lzx0;->o:Lay0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lay0;->b(Lav;Loj;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lrk;->f:Lrk;

    .line 17
    .line 18
    return-object p1
.end method
