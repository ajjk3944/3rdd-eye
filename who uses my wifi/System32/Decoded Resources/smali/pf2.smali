.class public final synthetic Lpf2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhh3;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lsf2;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lsf2;Ljava/lang/String;ZI)V
    .locals 0

    .line 1
    iput p4, p0, Lpf2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lpf2;->g:Lsf2;

    .line 4
    .line 5
    iput-object p2, p0, Lpf2;->h:Ljava/lang/String;

    .line 6
    .line 7
    iput-boolean p3, p0, Lpf2;->i:Z

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Lth3;
    .locals 12

    .line 1
    iget v0, p0, Lpf2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lpf2;->i:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iget-object v2, p0, Lpf2;->g:Lsf2;

    .line 10
    .line 11
    if-eq v1, v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    move-object v5, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v5, v2

    .line 17
    :goto_0
    iget-object v0, v2, Lsf2;->i:Lje2;

    .line 18
    .line 19
    new-instance v3, Llf2;

    .line 20
    .line 21
    iget v6, v0, Lje2;->d:I

    .line 22
    .line 23
    iget v7, v0, Lje2;->e:I

    .line 24
    .line 25
    iget v8, v0, Lje2;->h:I

    .line 26
    .line 27
    iget-object v4, p0, Lpf2;->h:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct/range {v3 .. v8}, Llf2;-><init>(Ljava/lang/String;Lsf2;III)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v2, Lsf2;->y:Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :pswitch_0
    new-instance v9, Lmr2;

    .line 44
    .line 45
    const/16 v0, 0xc

    .line 46
    .line 47
    invoke-direct {v9, v0}, Lmr2;-><init>(I)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    iget-object v1, p0, Lpf2;->g:Lsf2;

    .line 52
    .line 53
    iget-boolean v2, p0, Lpf2;->i:Z

    .line 54
    .line 55
    if-eq v0, v2, :cond_1

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move-object v0, v1

    .line 60
    :goto_1
    iget-object v1, v1, Lsf2;->i:Lje2;

    .line 61
    .line 62
    iget v6, v1, Lje2;->d:I

    .line 63
    .line 64
    iget v7, v1, Lje2;->e:I

    .line 65
    .line 66
    new-instance v4, Lbl3;

    .line 67
    .line 68
    iget-object v5, p0, Lpf2;->h:Ljava/lang/String;

    .line 69
    .line 70
    const/4 v8, 0x1

    .line 71
    invoke-direct/range {v4 .. v9}, Lbl3;-><init>(Ljava/lang/String;IIZLmr2;)V

    .line 72
    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-virtual {v4, v0}, Lzd3;->b(Lws3;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-object v4

    .line 80
    :pswitch_1
    iget-boolean v0, p0, Lpf2;->i:Z

    .line 81
    .line 82
    const/4 v1, 0x1

    .line 83
    iget-object v2, p0, Lpf2;->g:Lsf2;

    .line 84
    .line 85
    if-eq v1, v0, :cond_3

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    move-object v5, v0

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    move-object v5, v2

    .line 91
    :goto_2
    iget-object v0, v2, Lsf2;->i:Lje2;

    .line 92
    .line 93
    new-instance v3, Luf2;

    .line 94
    .line 95
    iget v6, v0, Lje2;->d:I

    .line 96
    .line 97
    iget v7, v0, Lje2;->e:I

    .line 98
    .line 99
    iget-wide v8, v0, Lje2;->m:J

    .line 100
    .line 101
    iget-wide v10, v0, Lje2;->n:J

    .line 102
    .line 103
    iget-object v4, p0, Lpf2;->h:Ljava/lang/String;

    .line 104
    .line 105
    invoke-direct/range {v3 .. v11}, Luf2;-><init>(Ljava/lang/String;Lsf2;IIJJ)V

    .line 106
    .line 107
    .line 108
    return-object v3

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
