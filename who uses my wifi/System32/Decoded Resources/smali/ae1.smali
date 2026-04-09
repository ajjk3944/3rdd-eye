.class public final Lae1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lyd1;

.field public final c:Landroid/util/SparseArray;

.field public final d:Z

.field public final e:Lmd1;

.field public final f:Lpz;

.field public final g:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final h:J

.field public final i:Lee1;

.field public j:Lts;

.field public k:Ld13;

.field public l:Landroid/util/Pair;

.field public m:I

.field public n:I

.field public o:J

.field public p:I


# direct methods
.method public constructor <init>(Lvd1;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lvd1;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object v0, p0, Lae1;->a:Landroid/content/Context;

    .line 7
    .line 8
    new-instance v0, Lts;

    .line 9
    .line 10
    invoke-direct {v0}, Lts;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lae1;->j:Lts;

    .line 14
    .line 15
    iget-object v0, p1, Lvd1;->c:Lyd1;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lae1;->b:Lyd1;

    .line 21
    .line 22
    new-instance v0, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lae1;->c:Landroid/util/SparseArray;

    .line 28
    .line 29
    sget-object v0, Lxm3;->g:Lvm3;

    .line 30
    .line 31
    sget-object v0, Lsn3;->j:Lsn3;

    .line 32
    .line 33
    iget-boolean v0, p1, Lvd1;->d:Z

    .line 34
    .line 35
    iput-boolean v0, p0, Lae1;->d:Z

    .line 36
    .line 37
    iget-object v0, p1, Lvd1;->e:Lpz;

    .line 38
    .line 39
    iput-object v0, p0, Lae1;->f:Lpz;

    .line 40
    .line 41
    iget-wide v1, p1, Lvd1;->g:J

    .line 42
    .line 43
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    cmp-long v5, v1, v3

    .line 49
    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    neg-long v1, v1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-wide v1, v3

    .line 55
    :goto_0
    iput-wide v1, p0, Lae1;->h:J

    .line 56
    .line 57
    iget-object v1, p1, Lvd1;->h:Lee1;

    .line 58
    .line 59
    iput-object v1, p0, Lae1;->i:Lee1;

    .line 60
    .line 61
    iget-object p1, p1, Lvd1;->b:Lde1;

    .line 62
    .line 63
    new-instance v2, Lmd1;

    .line 64
    .line 65
    invoke-direct {v2, p1, v1, v0}, Lmd1;-><init>(Lde1;Lee1;Lpz;)V

    .line 66
    .line 67
    .line 68
    iput-object v2, p0, Lae1;->e:Lmd1;

    .line 69
    .line 70
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lae1;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 76
    .line 77
    new-instance p1, Lgg4;

    .line 78
    .line 79
    invoke-direct {p1}, Lgg4;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v0, Lph4;

    .line 83
    .line 84
    invoke-direct {v0, p1}, Lph4;-><init>(Lgg4;)V

    .line 85
    .line 86
    .line 87
    iput-wide v3, p0, Lae1;->o:J

    .line 88
    .line 89
    const/4 p1, -0x1

    .line 90
    iput p1, p0, Lae1;->p:I

    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    iput p1, p0, Lae1;->n:I

    .line 94
    .line 95
    return-void
.end method
