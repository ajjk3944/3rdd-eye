.class public Lue0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ltz2;


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:I

.field public h:Ljava/lang/String;

.field public i:I

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(IILandroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lue0;->f:Ljava/lang/String;

    iput p1, p0, Lue0;->g:I

    iput-object p5, p0, Lue0;->h:Ljava/lang/String;

    iput-object p3, p0, Lue0;->j:Ljava/lang/Object;

    iput-object p6, p0, Lue0;->k:Ljava/io/Serializable;

    iput p2, p0, Lue0;->i:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lue0;->f:Ljava/lang/String;

    .line 4
    iput p2, p0, Lue0;->g:I

    .line 5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lue0;->j:Ljava/lang/Object;

    .line 6
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lue0;->k:Ljava/io/Serializable;

    const p1, 0x7fffffff

    .line 7
    iput p1, p0, Lue0;->i:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lue0;->h:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lue0;->j:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v4, v1

    .line 6
    check-cast v4, Landroid/webkit/WebView;

    .line 7
    .line 8
    iget-object v1, p0, Lue0;->k:Ljava/io/Serializable;

    .line 9
    .line 10
    move-object v5, v1

    .line 11
    check-cast v5, Ljava/lang/String;

    .line 12
    .line 13
    iget v1, p0, Lue0;->i:I

    .line 14
    .line 15
    const-string v2, "Google"

    .line 16
    .line 17
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_5

    .line 22
    .line 23
    iget-object v3, p0, Lue0;->f:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-nez v6, :cond_4

    .line 30
    .line 31
    move-object v6, v3

    .line 32
    new-instance v3, Lof0;

    .line 33
    .line 34
    invoke-direct {v3, v2, v6}, Lof0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v2, "javascript"

    .line 38
    .line 39
    invoke-static {v2}, Lsu2;->n(Ljava/lang/String;)Ldc3;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    iget v2, p0, Lue0;->g:I

    .line 44
    .line 45
    invoke-static {v2}, Lga1;->c(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-static {v6}, Lsu2;->q(Ljava/lang/String;)Lyb3;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    const/4 v6, 0x0

    .line 54
    sget-object v7, Ldc3;->i:Ldc3;

    .line 55
    .line 56
    if-ne v8, v7, :cond_0

    .line 57
    .line 58
    const-string v0, "Omid html session error; Unable to parse impression owner: javascript"

    .line 59
    .line 60
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v6

    .line 64
    :cond_0
    if-nez v9, :cond_1

    .line 65
    .line 66
    invoke-static {v2}, Lga1;->s(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "Omid html session error; Unable to parse creative type: "

    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v6

    .line 80
    :cond_1
    invoke-static {v0}, Lsu2;->n(Ljava/lang/String;)Ldc3;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    sget-object v2, Lyb3;->j:Lyb3;

    .line 85
    .line 86
    if-ne v9, v2, :cond_2

    .line 87
    .line 88
    if-ne v10, v7, :cond_2

    .line 89
    .line 90
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v1, "Omid html session error; Video events owner unknown for video creative: "

    .line 95
    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v6

    .line 104
    :cond_2
    new-instance v2, Luk1;

    .line 105
    .line 106
    sget-object v7, Lwb3;->g:Lwb3;

    .line 107
    .line 108
    const-string v6, ""

    .line 109
    .line 110
    invoke-direct/range {v2 .. v7}, Luk1;-><init>(Lof0;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Lwb3;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v1}, Lga1;->d(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0}, Lsu2;->o(Ljava/lang/String;)Lbc3;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const/4 v1, 0x1

    .line 122
    invoke-static {v9, v0, v8, v10, v1}, Lde3;->b(Lyb3;Lbc3;Ldc3;Ldc3;Z)Lde3;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget-object v1, Lm54;->f:Lkj1;

    .line 127
    .line 128
    iget-boolean v1, v1, Lkj1;->g:Z

    .line 129
    .line 130
    if-eqz v1, :cond_3

    .line 131
    .line 132
    new-instance v1, Lxb3;

    .line 133
    .line 134
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-direct {v1, v0, v2, v3}, Lxb3;-><init>(Lde3;Luk1;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    new-instance v0, Lxz2;

    .line 146
    .line 147
    invoke-direct {v0, v1, v2}, Lxz2;-><init>(Lxb3;Luk1;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    const-string v1, "Method called before OM SDK activation"

    .line 154
    .line 155
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 160
    .line 161
    const-string v1, "Version is null or empty"

    .line 162
    .line 163
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v0

    .line 167
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    const-string v1, "Name is null or empty"

    .line 170
    .line 171
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v0
.end method

.method public b(Ljava/lang/String;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Lue0;->d(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lue0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lue0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lue0;->k:Ljava/io/Serializable;

    .line 20
    .line 21
    check-cast v0, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public c(Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lue0;->d(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lue0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lue0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public d(I)V
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lue0;->i:I

    .line 4
    .line 5
    if-gt p1, v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lue0;->f:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p1, " is out of range"

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

.method public e(I)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lue0;->d(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lue0;->k:Ljava/io/Serializable;

    .line 5
    .line 6
    check-cast v0, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lue0;->h:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lue0;->h:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, p1}, Lex0;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :cond_1
    return-object p1
.end method

.method public f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iget v1, p0, Lue0;->g:I

    .line 3
    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :cond_0
    const/4 v0, 0x3

    .line 12
    if-ne v1, v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_1
    return-object p1
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lue0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lue0;->h:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method
