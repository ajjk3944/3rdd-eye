.class public final Lf50;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lu80;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:I

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Ljava/util/List;

.field public final i:Lh4;

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:F

.field public final n:F

.field public final o:F

.field public final p:F

.field public final q:Lb4;

.field public final r:Lgw3;

.field public final s:Lc4;

.field public final t:Ljava/util/List;

.field public final u:I

.field public final v:Z

.field public final w:Lkf3;

.field public final x:Lg4;

.field public final y:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lu80;Ljava/lang/String;JIJLjava/lang/String;Ljava/util/List;Lh4;IIIFFFFLb4;Lgw3;Ljava/util/List;ILc4;ZLkf3;Lg4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf50;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lf50;->b:Lu80;

    .line 7
    .line 8
    iput-object p3, p0, Lf50;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-wide p4, p0, Lf50;->d:J

    .line 11
    .line 12
    iput p6, p0, Lf50;->e:I

    .line 13
    .line 14
    iput-wide p7, p0, Lf50;->f:J

    .line 15
    .line 16
    iput-object p9, p0, Lf50;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p10, p0, Lf50;->h:Ljava/util/List;

    .line 19
    .line 20
    iput-object p11, p0, Lf50;->i:Lh4;

    .line 21
    .line 22
    iput p12, p0, Lf50;->j:I

    .line 23
    .line 24
    iput p13, p0, Lf50;->k:I

    .line 25
    .line 26
    iput p14, p0, Lf50;->l:I

    .line 27
    .line 28
    iput p15, p0, Lf50;->m:F

    .line 29
    .line 30
    move/from16 p1, p16

    .line 31
    .line 32
    iput p1, p0, Lf50;->n:F

    .line 33
    .line 34
    move/from16 p1, p17

    .line 35
    .line 36
    iput p1, p0, Lf50;->o:F

    .line 37
    .line 38
    move/from16 p1, p18

    .line 39
    .line 40
    iput p1, p0, Lf50;->p:F

    .line 41
    .line 42
    move-object/from16 p1, p19

    .line 43
    .line 44
    iput-object p1, p0, Lf50;->q:Lb4;

    .line 45
    .line 46
    move-object/from16 p1, p20

    .line 47
    .line 48
    iput-object p1, p0, Lf50;->r:Lgw3;

    .line 49
    .line 50
    move-object/from16 p1, p21

    .line 51
    .line 52
    iput-object p1, p0, Lf50;->t:Ljava/util/List;

    .line 53
    .line 54
    move/from16 p1, p22

    .line 55
    .line 56
    iput p1, p0, Lf50;->u:I

    .line 57
    .line 58
    move-object/from16 p1, p23

    .line 59
    .line 60
    iput-object p1, p0, Lf50;->s:Lc4;

    .line 61
    .line 62
    move/from16 p1, p24

    .line 63
    .line 64
    iput-boolean p1, p0, Lf50;->v:Z

    .line 65
    .line 66
    move-object/from16 p1, p25

    .line 67
    .line 68
    iput-object p1, p0, Lf50;->w:Lkf3;

    .line 69
    .line 70
    move-object/from16 p1, p26

    .line 71
    .line 72
    iput-object p1, p0, Lf50;->x:Lg4;

    .line 73
    .line 74
    move/from16 p1, p27

    .line 75
    .line 76
    iput p1, p0, Lf50;->y:I

    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lf50;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "\n"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-wide v2, p0, Lf50;->f:J

    .line 20
    .line 21
    iget-object v4, p0, Lf50;->b:Lu80;

    .line 22
    .line 23
    iget-object v5, v4, Lu80;->i:Ll80;

    .line 24
    .line 25
    invoke-virtual {v5, v2, v3}, Ll80;->b(J)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lf50;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const-string v3, "\t\tParents: "

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v3, v2, Lf50;->c:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-wide v2, v2, Lf50;->f:J

    .line 44
    .line 45
    iget-object v5, v4, Lu80;->i:Ll80;

    .line 46
    .line 47
    invoke-virtual {v5, v2, v3}, Ll80;->b(J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lf50;

    .line 52
    .line 53
    :goto_0
    if-eqz v2, :cond_0

    .line 54
    .line 55
    const-string v3, "->"

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v3, v2, Lf50;->c:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-wide v2, v2, Lf50;->f:J

    .line 66
    .line 67
    iget-object v5, v4, Lu80;->i:Ll80;

    .line 68
    .line 69
    invoke-virtual {v5, v2, v3}, Ll80;->b(J)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lf50;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_1
    iget-object v2, p0, Lf50;->h:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_2

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v3, "\tMasks: "

    .line 94
    .line 95
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :cond_2
    iget v2, p0, Lf50;->j:I

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    iget v3, p0, Lf50;->k:I

    .line 113
    .line 114
    if-eqz v3, :cond_3

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v4, "\tBackground: "

    .line 120
    .line 121
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 125
    .line 126
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget v5, p0, Lf50;->l:I

    .line 135
    .line 136
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    filled-new-array {v2, v3, v5}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const-string v3, "%dx%d %X\n"

    .line 145
    .line 146
    invoke-static {v4, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    :cond_3
    iget-object v2, p0, Lf50;->a:Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-nez v3, :cond_4

    .line 160
    .line 161
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v3, "\tShapes:\n"

    .line 165
    .line 166
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eqz v3, :cond_4

    .line 178
    .line 179
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v4, "\t\t"

    .line 187
    .line 188
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf50;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
