.class public Lgd3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static volatile e:I = 0x1


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lgi4;

.field public final d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lgi4;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgd3;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lgd3;->b:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Lgd3;->c:Lgi4;

    .line 9
    .line 10
    iput-boolean p4, p0, Lgd3;->d:Z

    .line 11
    .line 12
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Lgd3;
    .locals 3

    .line 1
    new-instance v0, Lk01;

    .line 2
    .line 3
    invoke-direct {v0}, Lk01;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    new-instance v1, Lsz2;

    .line 9
    .line 10
    const/16 v2, 0xe

    .line 11
    .line 12
    invoke-direct {v1, p0, v0, v2}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v1, Lbs2;

    .line 20
    .line 21
    const/16 v2, 0x1c

    .line 22
    .line 23
    invoke-direct {v1, v2, v0}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    new-instance v1, Lgd3;

    .line 30
    .line 31
    iget-object v0, v0, Lk01;->a:Lgi4;

    .line 32
    .line 33
    invoke-direct {v1, p0, p1, v0, p2}, Lgd3;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lgi4;Z)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method


# virtual methods
.method public b(IJ)V
    .locals 7

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x0

    .line 3
    const/4 v4, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    invoke-virtual/range {v0 .. v6}, Lgd3;->e(IJLjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lgi4;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c(IJLjava/lang/Exception;)V
    .locals 7

    .line 1
    const/4 v5, 0x0

    .line 2
    const/4 v6, 0x0

    .line 3
    move-object v0, p0

    .line 4
    move v1, p1

    .line 5
    move-wide v2, p2

    .line 6
    move-object v4, p4

    .line 7
    invoke-virtual/range {v0 .. v6}, Lgd3;->e(IJLjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lgi4;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(Ljava/lang/String;I)V
    .locals 7

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    move-object v6, p1

    .line 7
    move v1, p2

    .line 8
    invoke-virtual/range {v0 .. v6}, Lgd3;->e(IJLjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lgi4;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e(IJLjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)Lgi4;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lgd3;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lgd3;->c:Lgi4;

    .line 7
    .line 8
    iget-object p2, p0, Lgd3;->b:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    sget-object p3, Lsu2;->l:Lsu2;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p4, Lgi4;

    .line 16
    .line 17
    invoke-direct {p4}, Lgi4;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance p5, Lmn2;

    .line 21
    .line 22
    invoke-direct {p5, p2, p3, p4, v1}, Lmn2;-><init>(Ljava/util/concurrent/Executor;Lpj;Lgi4;I)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p1, Lgi4;->b:Lwy0;

    .line 26
    .line 27
    invoke-virtual {p2, p5}, Lwy0;->c(Lje4;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lgi4;->h()V

    .line 31
    .line 32
    .line 33
    return-object p4

    .line 34
    :cond_0
    iget-object v0, p0, Lgd3;->a:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {}, Lxq1;->A()Luq1;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v2}, Ln54;->b()V

    .line 45
    .line 46
    .line 47
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 48
    .line 49
    check-cast v3, Lxq1;

    .line 50
    .line 51
    invoke-virtual {v3, v0}, Lxq1;->B(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ln54;->b()V

    .line 55
    .line 56
    .line 57
    iget-object v0, v2, Ln54;->g:Lp54;

    .line 58
    .line 59
    check-cast v0, Lxq1;

    .line 60
    .line 61
    invoke-virtual {v0, p2, p3}, Lxq1;->C(J)V

    .line 62
    .line 63
    .line 64
    sget p2, Lgd3;->e:I

    .line 65
    .line 66
    invoke-virtual {v2}, Ln54;->b()V

    .line 67
    .line 68
    .line 69
    iget-object p3, v2, Ln54;->g:Lp54;

    .line 70
    .line 71
    check-cast p3, Lxq1;

    .line 72
    .line 73
    invoke-virtual {p3, p2}, Lxq1;->H(I)V

    .line 74
    .line 75
    .line 76
    if-eqz p4, :cond_1

    .line 77
    .line 78
    sget-object p2, Lpl3;->a:Ljava/lang/Object;

    .line 79
    .line 80
    new-instance p2, Ljava/io/StringWriter;

    .line 81
    .line 82
    invoke-direct {p2}, Ljava/io/StringWriter;-><init>()V

    .line 83
    .line 84
    .line 85
    new-instance p3, Ljava/io/PrintWriter;

    .line 86
    .line 87
    invoke-direct {p3, p2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p4, p3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {v2}, Ln54;->b()V

    .line 98
    .line 99
    .line 100
    iget-object p3, v2, Ln54;->g:Lp54;

    .line 101
    .line 102
    check-cast p3, Lxq1;

    .line 103
    .line 104
    invoke-virtual {p3, p2}, Lxq1;->D(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {v2}, Ln54;->b()V

    .line 116
    .line 117
    .line 118
    iget-object p3, v2, Ln54;->g:Lp54;

    .line 119
    .line 120
    check-cast p3, Lxq1;

    .line 121
    .line 122
    invoke-virtual {p3, p2}, Lxq1;->E(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_1
    if-eqz p6, :cond_2

    .line 126
    .line 127
    invoke-virtual {v2}, Ln54;->b()V

    .line 128
    .line 129
    .line 130
    iget-object p2, v2, Ln54;->g:Lp54;

    .line 131
    .line 132
    check-cast p2, Lxq1;

    .line 133
    .line 134
    invoke-virtual {p2, p6}, Lxq1;->F(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_2
    if-eqz p5, :cond_3

    .line 138
    .line 139
    invoke-virtual {v2}, Ln54;->b()V

    .line 140
    .line 141
    .line 142
    iget-object p2, v2, Ln54;->g:Lp54;

    .line 143
    .line 144
    check-cast p2, Lxq1;

    .line 145
    .line 146
    invoke-virtual {p2, p5}, Lxq1;->G(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    :cond_3
    iget-object p2, p0, Lgd3;->c:Lgi4;

    .line 150
    .line 151
    iget-object p3, p0, Lgd3;->b:Ljava/util/concurrent/Executor;

    .line 152
    .line 153
    new-instance p4, Lt3;

    .line 154
    .line 155
    const/16 p5, 0xf

    .line 156
    .line 157
    invoke-direct {p4, v2, p1, p5}, Lt3;-><init>(Ljava/lang/Object;II)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance p1, Lgi4;

    .line 164
    .line 165
    invoke-direct {p1}, Lgi4;-><init>()V

    .line 166
    .line 167
    .line 168
    new-instance p5, Lmn2;

    .line 169
    .line 170
    invoke-direct {p5, p3, p4, p1, v1}, Lmn2;-><init>(Ljava/util/concurrent/Executor;Lpj;Lgi4;I)V

    .line 171
    .line 172
    .line 173
    iget-object p3, p2, Lgi4;->b:Lwy0;

    .line 174
    .line 175
    invoke-virtual {p3, p5}, Lwy0;->c(Lje4;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Lgi4;->h()V

    .line 179
    .line 180
    .line 181
    return-object p1
.end method
