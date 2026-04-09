.class public final Lmm0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lb60;


# static fields
.field public static final n:Lmm0;


# instance fields
.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:Landroid/os/Handler;

.field public final k:Ld60;

.field public final l:Le2;

.field public final m:Lof3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lmm0;

    .line 2
    .line 3
    invoke-direct {v0}, Lmm0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lmm0;->n:Lmm0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lmm0;->h:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lmm0;->i:Z

    .line 8
    .line 9
    new-instance v0, Ld60;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ld60;-><init>(Lb60;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lmm0;->k:Ld60;

    .line 15
    .line 16
    new-instance v0, Le2;

    .line 17
    .line 18
    const/16 v1, 0xd

    .line 19
    .line 20
    invoke-direct {v0, v1, p0}, Le2;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lmm0;->l:Le2;

    .line 24
    .line 25
    new-instance v0, Lof3;

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    invoke-direct {v0, v1, p0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lmm0;->m:Lof3;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget v0, p0, Lmm0;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lmm0;->g:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lmm0;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lmm0;->k:Ld60;

    .line 14
    .line 15
    sget-object v1, Lt50;->ON_RESUME:Lt50;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ld60;->d(Lt50;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lmm0;->h:Z

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lmm0;->j:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {v0}, Li30;->j(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lmm0;->l:Le2;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final e()Ld60;
    .locals 1

    .line 1
    iget-object v0, p0, Lmm0;->k:Ld60;

    .line 2
    .line 3
    return-object v0
.end method
