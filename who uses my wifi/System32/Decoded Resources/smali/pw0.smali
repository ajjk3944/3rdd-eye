.class public final Lpw0;
.super Lqj;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public i:Lyw0;

.field public j:Ljava/lang/Object;

.field public k:Ljava/io/Serializable;

.field public l:Ljava/lang/Object;

.field public m:Lrw0;

.field public n:Ljava/util/Iterator;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lyw0;

.field public q:I


# direct methods
.method public constructor <init>(Lyw0;Lqj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpw0;->p:Lyw0;

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
    iput-object p1, p0, Lpw0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lpw0;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lpw0;->q:I

    .line 9
    .line 10
    iget-object p1, p0, Lpw0;->p:Lyw0;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lyw0;->c(Lqj;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
