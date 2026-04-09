.class public final Lka4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lpz;

.field public final c:Lrc3;

.field public final d:Lcy2;

.field public e:Lll3;

.field public f:Lll3;

.field public final g:Llz1;

.field public final h:Landroid/os/Looper;

.field public final i:I

.field public final j:Lin2;

.field public final k:I

.field public final l:Z

.field public final m:Llc4;

.field public final n:Lkc4;

.field public final o:J

.field public final p:J

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:I

.field public final u:Z

.field public v:Z

.field public final w:Ljava/lang/String;

.field public final x:Lm44;


# direct methods
.method public constructor <init>(Lug0;Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v0, Lrc3;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1, p1}, Lrc3;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lcy2;

    .line 8
    .line 9
    invoke-direct {p1, p2}, Lcy2;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lk34;

    .line 13
    .line 14
    invoke-direct {v1, p2}, Lk34;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object v2, Lt24;->n:Lt24;

    .line 18
    .line 19
    new-instance v3, Llz1;

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-direct {v3, p2, v4}, Llz1;-><init>(Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, Lka4;->a:Landroid/content/Context;

    .line 32
    .line 33
    iput-object v0, p0, Lka4;->c:Lrc3;

    .line 34
    .line 35
    iput-object p1, p0, Lka4;->d:Lcy2;

    .line 36
    .line 37
    iput-object v1, p0, Lka4;->e:Lll3;

    .line 38
    .line 39
    iput-object v2, p0, Lka4;->f:Lll3;

    .line 40
    .line 41
    iput-object v3, p0, Lka4;->g:Llz1;

    .line 42
    .line 43
    sget-object p1, Lv23;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_0
    iput-object p1, p0, Lka4;->h:Landroid/os/Looper;

    .line 57
    .line 58
    sget-object p1, Lin2;->b:Lin2;

    .line 59
    .line 60
    iput-object p1, p0, Lka4;->j:Lin2;

    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    iput p1, p0, Lka4;->k:I

    .line 64
    .line 65
    iput-boolean p1, p0, Lka4;->l:Z

    .line 66
    .line 67
    sget-object p2, Llc4;->d:Llc4;

    .line 68
    .line 69
    iput-object p2, p0, Lka4;->m:Llc4;

    .line 70
    .line 71
    sget-object p2, Lkc4;->b:Lkc4;

    .line 72
    .line 73
    iput-object p2, p0, Lka4;->n:Lkc4;

    .line 74
    .line 75
    new-instance p2, Lm44;

    .line 76
    .line 77
    const-wide/16 v0, 0x14

    .line 78
    .line 79
    invoke-static {v0, v1}, Lv23;->r(J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    const-wide/16 v2, 0x1f4

    .line 84
    .line 85
    invoke-static {v2, v3}, Lv23;->r(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    invoke-direct {p2, v0, v1, v4, v5}, Lm44;-><init>(JJ)V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lka4;->x:Lm44;

    .line 93
    .line 94
    sget-object p2, Lpz;->o:Lpz;

    .line 95
    .line 96
    iput-object p2, p0, Lka4;->b:Lpz;

    .line 97
    .line 98
    iput-wide v2, p0, Lka4;->o:J

    .line 99
    .line 100
    const-wide/16 v0, 0x7d0

    .line 101
    .line 102
    iput-wide v0, p0, Lka4;->p:J

    .line 103
    .line 104
    const p2, 0x927c0

    .line 105
    .line 106
    .line 107
    iput p2, p0, Lka4;->q:I

    .line 108
    .line 109
    const v0, 0x7fffffff

    .line 110
    .line 111
    .line 112
    iput v0, p0, Lka4;->r:I

    .line 113
    .line 114
    iput v0, p0, Lka4;->s:I

    .line 115
    .line 116
    iput p2, p0, Lka4;->t:I

    .line 117
    .line 118
    iput-boolean p1, p0, Lka4;->u:Z

    .line 119
    .line 120
    const-string p1, ""

    .line 121
    .line 122
    iput-object p1, p0, Lka4;->w:Ljava/lang/String;

    .line 123
    .line 124
    const/16 p1, -0x3e8

    .line 125
    .line 126
    iput p1, p0, Lka4;->i:I

    .line 127
    .line 128
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 129
    .line 130
    const/16 p2, 0x23

    .line 131
    .line 132
    if-lt p1, p2, :cond_1

    .line 133
    .line 134
    sget p1, Lo74;->a:I

    .line 135
    .line 136
    :cond_1
    return-void
.end method
