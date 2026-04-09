.class public final Lse4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lph4;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lnd2;


# direct methods
.method public constructor <init>(Lph4;IIIIIIILnd2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lse4;->a:Lph4;

    .line 5
    .line 6
    iput p2, p0, Lse4;->b:I

    .line 7
    .line 8
    iput p3, p0, Lse4;->c:I

    .line 9
    .line 10
    iput p4, p0, Lse4;->d:I

    .line 11
    .line 12
    iput p5, p0, Lse4;->e:I

    .line 13
    .line 14
    iput p6, p0, Lse4;->f:I

    .line 15
    .line 16
    iput p7, p0, Lse4;->g:I

    .line 17
    .line 18
    iput p8, p0, Lse4;->h:I

    .line 19
    .line 20
    iput-object p9, p0, Lse4;->i:Lnd2;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()Lle4;
    .locals 6

    .line 1
    new-instance v0, Lle4;

    .line 2
    .line 3
    iget v1, p0, Lse4;->c:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    :goto_0
    move v1, v2

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    goto :goto_0

    .line 12
    :goto_1
    iget v2, p0, Lse4;->g:I

    .line 13
    .line 14
    iget v5, p0, Lse4;->h:I

    .line 15
    .line 16
    iget v3, p0, Lse4;->e:I

    .line 17
    .line 18
    iget v4, p0, Lse4;->f:I

    .line 19
    .line 20
    invoke-direct/range {v0 .. v5}, Lle4;-><init>(ZIIII)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method
