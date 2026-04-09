.class public final Lm21;
.super Lqj;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public i:Ln21;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ln21;

.field public l:I


# direct methods
.method public constructor <init>(Ln21;Loj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm21;->k:Ln21;

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
    iput-object p1, p0, Lm21;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lm21;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lm21;->l:I

    .line 9
    .line 10
    iget-object p1, p0, Lm21;->k:Ln21;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Ln21;->c(Ln21;Lzy;Loj;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
