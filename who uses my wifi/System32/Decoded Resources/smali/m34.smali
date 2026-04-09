.class public final Lm34;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final b:Lm34;

.field public static final c:Lm34;

.field public static final d:Lm34;

.field public static final e:Lm34;

.field public static final f:Lm34;

.field public static final g:Lm34;


# instance fields
.field public final a:Ll34;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lm34;

    .line 2
    .line 3
    new-instance v1, Ly24;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v1, v2}, Ly24;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lm34;-><init>(Lo34;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lm34;->b:Lm34;

    .line 13
    .line 14
    new-instance v0, Lm34;

    .line 15
    .line 16
    new-instance v1, Ly24;

    .line 17
    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ly24;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Lm34;-><init>(Lo34;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lm34;->c:Lm34;

    .line 27
    .line 28
    new-instance v0, Lm34;

    .line 29
    .line 30
    new-instance v1, Ly24;

    .line 31
    .line 32
    const/16 v2, 0x9

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ly24;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1}, Lm34;-><init>(Lo34;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lm34;->d:Lm34;

    .line 41
    .line 42
    new-instance v0, Lm34;

    .line 43
    .line 44
    new-instance v1, Lt24;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct {v1, v2, v3}, Lt24;-><init>(IB)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1}, Lm34;-><init>(Lo34;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lm34;->e:Lm34;

    .line 54
    .line 55
    new-instance v0, Lm34;

    .line 56
    .line 57
    new-instance v1, Lt24;

    .line 58
    .line 59
    const/4 v2, 0x7

    .line 60
    invoke-direct {v1, v2, v3}, Lt24;-><init>(IB)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v1}, Lm34;-><init>(Lo34;)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Lm34;

    .line 67
    .line 68
    new-instance v1, Lt24;

    .line 69
    .line 70
    const/16 v2, 0x8

    .line 71
    .line 72
    invoke-direct {v1, v2, v3}, Lt24;-><init>(IB)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v1}, Lm34;-><init>(Lo34;)V

    .line 76
    .line 77
    .line 78
    sput-object v0, Lm34;->f:Lm34;

    .line 79
    .line 80
    new-instance v0, Lm34;

    .line 81
    .line 82
    new-instance v1, Ly24;

    .line 83
    .line 84
    const/4 v2, 0x7

    .line 85
    invoke-direct {v1, v2}, Ly24;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v1}, Lm34;-><init>(Lo34;)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lm34;->g:Lm34;

    .line 92
    .line 93
    return-void
.end method

.method public constructor <init>(Lo34;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lmu3;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "The Android Project"

    .line 11
    .line 12
    const-string v1, "java.vendor"

    .line 13
    .line 14
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Lil3;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, v1, p1}, Lil3;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iput-object v0, p0, Lm34;->a:Ll34;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance v0, Lk34;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Lk34;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v0, Lsq0;

    .line 40
    .line 41
    const/16 v1, 0x16

    .line 42
    .line 43
    invoke-direct {v0, v1, p1}, Lsq0;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0
.end method
