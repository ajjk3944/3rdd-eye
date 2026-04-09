.class public final Lp;
.super Lqj;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public i:Lgs0;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lf20;

.field public l:I


# direct methods
.method public constructor <init>(Lf20;Lqj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp;->k:Lf20;

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
    iput-object p1, p0, Lp;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lp;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lp;->l:I

    .line 9
    .line 10
    iget-object p1, p0, Lp;->k:Lf20;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lf20;->b(Lav;Loj;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
