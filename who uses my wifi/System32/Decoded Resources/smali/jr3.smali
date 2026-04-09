.class public final Ljr3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lnp2;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    iput p1, p0, Ljr3;->f:I

    packed-switch p1, :pswitch_data_0

    const/16 p1, 0xa

    .line 4
    new-array v0, p1, [J

    new-array v1, p1, [J

    new-array p1, p1, [J

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, p1, v2}, Ljr3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-void

    .line 5
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Ljr3;->g:Ljava/lang/Object;

    iput-object p1, p0, Ljr3;->h:Ljava/lang/Object;

    sget-object p1, Lgs3;->n:Lgs3;

    iput-object p1, p0, Ljr3;->i:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Ljr3;->f:I

    const/4 p1, 0x0

    iput-object p1, p0, Ljr3;->g:Ljava/lang/Object;

    iput-object p1, p0, Ljr3;->h:Ljava/lang/Object;

    iput-object p1, p0, Ljr3;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Ljr3;->f:I

    iput-object p1, p0, Ljr3;->g:Ljava/lang/Object;

    iput-object p2, p0, Ljr3;->h:Ljava/lang/Object;

    iput-object p3, p0, Ljr3;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljr3;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Ljr3;->f:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ljr3;->g:Ljava/lang/Object;

    check-cast v0, [J

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    iget-object v0, p1, Ljr3;->h:Ljava/lang/Object;

    check-cast v0, [J

    .line 35
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Ljr3;->h:Ljava/lang/Object;

    iget-object p1, p1, Ljr3;->i:Ljava/lang/Object;

    check-cast p1, [J

    .line 36
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Ljr3;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lof1;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Ljr3;->f:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljr3;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvz3;Ljava/util/List;Lhv3;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ljr3;->f:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ljr3;->g:Ljava/lang/Object;

    iput-object p3, p0, Ljr3;->h:Ljava/lang/Object;

    sget-object p2, Llu3;->a:Lbi3;

    .line 7
    iget-object p2, p2, Lbi3;->g:Ljava/lang/Object;

    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 9
    new-instance p2, Ljava/util/HashSet;

    .line 10
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 11
    invoke-virtual {p1}, Lvz3;->B()Lx54;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luz3;

    .line 12
    invoke-virtual {v0}, Luz3;->C()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 13
    invoke-virtual {v0}, Luz3;->C()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 15
    invoke-virtual {v0}, Luz3;->C()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    new-instance v0, Ljava/lang/StringBuilder;

    add-int/lit8 p3, p3, 0x79

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p3, "KeyID "

    const-string v1, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."

    .line 16
    invoke-static {v0, p3, p2, v1}, Lga1;->k(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 17
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_1
    invoke-virtual {p1}, Lvz3;->A()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 19
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    iput-object p1, p0, Ljr3;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwt2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ljr3;->f:I

    .line 32
    invoke-direct {p0, v0}, Ljr3;-><init>(I)V

    .line 33
    invoke-static {p1, p0}, Ljr3;->d(Lwt2;Ljr3;)V

    return-void
.end method

.method public constructor <init>([Lqf2;)V
    .locals 5

    const/4 v0, 0x7

    iput v0, p0, Ljr3;->f:I

    .line 24
    new-instance v0, Lff4;

    .line 25
    invoke-direct {v0}, Lbg2;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Lff4;->m:I

    iput v1, v0, Lff4;->o:I

    iput v1, v0, Lff4;->p:I

    .line 26
    sget-object v2, Lv23;->b:[B

    iput-object v2, v0, Lff4;->n:[B

    iput-object v2, v0, Lff4;->q:[B

    .line 27
    new-instance v2, Lxg2;

    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Lxg2;->c:F

    iput v3, v2, Lxg2;->d:F

    sget-object v3, Lce2;->e:Lce2;

    iput-object v3, v2, Lxg2;->e:Lce2;

    iput-object v3, v2, Lxg2;->f:Lce2;

    iput-object v3, v2, Lxg2;->g:Lce2;

    iput-object v3, v2, Lxg2;->h:Lce2;

    sget-object v3, Lqf2;->a:Ljava/nio/ByteBuffer;

    iput-object v3, v2, Lxg2;->k:Ljava/nio/ByteBuffer;

    .line 29
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v4

    iput-object v4, v2, Lxg2;->l:Ljava/nio/ShortBuffer;

    iput-object v3, v2, Lxg2;->m:Ljava/nio/ByteBuffer;

    const/4 v3, -0x1

    iput v3, v2, Lxg2;->b:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x2

    new-array v3, v3, [Lqf2;

    iput-object v3, p0, Ljr3;->g:Ljava/lang/Object;

    .line 31
    invoke-static {p1, v1, v3, v1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Ljr3;->h:Ljava/lang/Object;

    iput-object v2, p0, Ljr3;->i:Ljava/lang/Object;

    aput-object v0, v3, v1

    const/4 p1, 0x1

    aput-object v2, v3, p1

    return-void
.end method

.method public static final a(Lvz3;)Ljr3;
    .locals 12

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz3;->C()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_6

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Lvz3;->C()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lvz3;->B()Lx54;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_5

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v3, v0

    .line 37
    check-cast v3, Luz3;

    .line 38
    .line 39
    invoke-virtual {v3}, Luz3;->C()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    const/4 v4, 0x1

    .line 44
    const/4 v5, 0x0

    .line 45
    :try_start_0
    invoke-static {v3}, Ljr3;->s(Luz3;)Lfw3;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v6, Lrv3;->b:Lrv3;

    .line 50
    .line 51
    iget-object v8, v6, Lrv3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 52
    .line 53
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    check-cast v8, Lnw3;

    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v9, Llw3;

    .line 63
    .line 64
    const-class v10, Lfw3;

    .line 65
    .line 66
    iget-object v11, v0, Lfw3;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v11, Lv34;

    .line 69
    .line 70
    invoke-direct {v9, v10, v11}, Llw3;-><init>(Ljava/lang/Class;Lv34;)V

    .line 71
    .line 72
    .line 73
    iget-object v8, v8, Lnw3;->b:Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-nez v8, :cond_0

    .line 80
    .line 81
    new-instance v6, Lfv3;

    .line 82
    .line 83
    invoke-direct {v6, v0}, Lfv3;-><init>(Lfw3;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catch_0
    move-exception v0

    .line 88
    goto :goto_2

    .line 89
    :cond_0
    invoke-virtual {v6, v0}, Lrv3;->e(Lfw3;)Lgi2;

    .line 90
    .line 91
    .line 92
    move-result-object v6
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    :goto_1
    move v9, v5

    .line 94
    goto :goto_3

    .line 95
    :goto_2
    sget-object v6, Llu3;->a:Lbi3;

    .line 96
    .line 97
    iget-object v6, v6, Lbi3;->g:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v6, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-nez v6, :cond_4

    .line 106
    .line 107
    new-instance v6, Lfv3;

    .line 108
    .line 109
    invoke-static {v3}, Ljr3;->s(Luz3;)Lfw3;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-direct {v6, v0}, Lfv3;-><init>(Lfw3;)V

    .line 114
    .line 115
    .line 116
    move v9, v4

    .line 117
    :goto_3
    sget-object v0, Llu3;->a:Lbi3;

    .line 118
    .line 119
    iget-object v0, v0, Lbi3;->g:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_1

    .line 128
    .line 129
    invoke-virtual {v3}, Luz3;->I()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-static {v0}, Ljr3;->t(I)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_2

    .line 138
    .line 139
    :cond_1
    move v8, v4

    .line 140
    goto :goto_4

    .line 141
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 142
    .line 143
    const-string v0, "Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets."

    .line 144
    .line 145
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0

    .line 149
    :goto_4
    new-instance v4, Lir3;

    .line 150
    .line 151
    invoke-virtual {v3}, Luz3;->I()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-virtual {p0}, Lvz3;->A()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-ne v7, v3, :cond_3

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_3
    move v8, v5

    .line 163
    :goto_5
    sget-object v10, Ltv2;->n:Ltv2;

    .line 164
    .line 165
    move-object v5, v6

    .line 166
    move v6, v0

    .line 167
    invoke-direct/range {v4 .. v10}, Lir3;-><init>(Lgi2;IIZZLhr3;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto/16 :goto_0

    .line 174
    .line 175
    :cond_4
    throw v0

    .line 176
    :cond_5
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    new-instance v1, Ljr3;

    .line 181
    .line 182
    sget-object v2, Lhv3;->b:Lhv3;

    .line 183
    .line 184
    invoke-direct {v1, p0, v0, v2}, Ljr3;-><init>(Lvz3;Ljava/util/List;Lhv3;)V

    .line 185
    .line 186
    .line 187
    return-object v1

    .line 188
    :cond_6
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 189
    .line 190
    const-string v0, "empty keyset"

    .line 191
    .line 192
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p0
.end method

.method public static d(Lwt2;Ljr3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lwt2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljr3;

    .line 4
    .line 5
    iget-object v1, p1, Ljr3;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [J

    .line 8
    .line 9
    iget-object v2, v0, Ljr3;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, [J

    .line 12
    .line 13
    iget-object p0, p0, Lwt2;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, [J

    .line 16
    .line 17
    invoke-static {v1, v2, p0}, Lpu1;->G([J[J[J)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p1, Ljr3;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, [J

    .line 23
    .line 24
    iget-object v2, v0, Ljr3;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, [J

    .line 27
    .line 28
    iget-object v0, v0, Ljr3;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, [J

    .line 31
    .line 32
    invoke-static {v1, v2, v0}, Lpu1;->G([J[J[J)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p1, Ljr3;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, [J

    .line 38
    .line 39
    invoke-static {p1, v0, p0}, Lpu1;->G([J[J[J)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static final p(Lmr3;)Ljr3;
    .locals 25

    .line 1
    new-instance v0, Lwy0;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Lwy0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, v0, Lwy0;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v2, Lfr3;

    .line 12
    .line 13
    move-object/from16 v3, p0

    .line 14
    .line 15
    invoke-direct {v2, v3}, Lfr3;-><init>(Lmr3;)V

    .line 16
    .line 17
    .line 18
    sget-object v3, Lpz;->p:Lpz;

    .line 19
    .line 20
    iput-object v3, v2, Lfr3;->c:Lpz;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    iput-boolean v4, v2, Lfr3;->a:Z

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/4 v6, 0x0

    .line 30
    move v7, v6

    .line 31
    :goto_0
    if-ge v7, v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    add-int/lit8 v7, v7, 0x1

    .line 38
    .line 39
    check-cast v8, Lfr3;

    .line 40
    .line 41
    iput-boolean v6, v8, Lfr3;->a:Z

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iget-boolean v2, v0, Lwy0;->f:Z

    .line 48
    .line 49
    if-nez v2, :cond_12

    .line 50
    .line 51
    iput-boolean v4, v0, Lwy0;->f:Z

    .line 52
    .line 53
    invoke-static {}, Lvz3;->G()Lsz3;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v5, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    move v7, v6

    .line 67
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    add-int/lit8 v8, v8, -0x1

    .line 72
    .line 73
    if-ge v7, v8, :cond_3

    .line 74
    .line 75
    add-int/lit8 v8, v7, 0x1

    .line 76
    .line 77
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    check-cast v7, Lfr3;

    .line 82
    .line 83
    iget-object v7, v7, Lfr3;->c:Lpz;

    .line 84
    .line 85
    if-ne v7, v3, :cond_2

    .line 86
    .line 87
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    check-cast v7, Lfr3;

    .line 92
    .line 93
    iget-object v7, v7, Lfr3;->c:Lpz;

    .line 94
    .line 95
    if-ne v7, v3, :cond_1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 99
    .line 100
    const-string v1, "Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'."

    .line 101
    .line 102
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v0

    .line 106
    :cond_2
    :goto_2
    move v7, v8

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    new-instance v7, Ljava/util/HashSet;

    .line 109
    .line 110
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    move v11, v6

    .line 118
    const/4 v10, 0x0

    .line 119
    :goto_3
    if-ge v11, v8, :cond_d

    .line 120
    .line 121
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    add-int/lit8 v11, v11, 0x1

    .line 126
    .line 127
    check-cast v12, Lfr3;

    .line 128
    .line 129
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v13, v12, Lfr3;->b:Lmr3;

    .line 133
    .line 134
    iget-object v14, v12, Lfr3;->c:Lpz;

    .line 135
    .line 136
    if-eqz v14, :cond_c

    .line 137
    .line 138
    if-ne v14, v3, :cond_7

    .line 139
    .line 140
    move v14, v6

    .line 141
    :cond_4
    if-eqz v14, :cond_6

    .line 142
    .line 143
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    invoke-virtual {v7, v15}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v15

    .line 151
    if-eqz v15, :cond_5

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    move/from16 v20, v14

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_6
    :goto_4
    sget v14, Low3;->a:I

    .line 158
    .line 159
    move v14, v6

    .line 160
    :goto_5
    if-nez v14, :cond_4

    .line 161
    .line 162
    const/4 v14, 0x4

    .line 163
    invoke-static {v14}, Lhw3;->a(I)[B

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    aget-byte v15, v14, v6

    .line 168
    .line 169
    and-int/lit16 v15, v15, 0xff

    .line 170
    .line 171
    aget-byte v9, v14, v4

    .line 172
    .line 173
    and-int/lit16 v9, v9, 0xff

    .line 174
    .line 175
    const/16 v16, 0x2

    .line 176
    .line 177
    aget-byte v6, v14, v16

    .line 178
    .line 179
    and-int/lit16 v6, v6, 0xff

    .line 180
    .line 181
    const/16 v16, 0x3

    .line 182
    .line 183
    aget-byte v14, v14, v16

    .line 184
    .line 185
    and-int/lit16 v14, v14, 0xff

    .line 186
    .line 187
    shl-int/lit8 v15, v15, 0x18

    .line 188
    .line 189
    shl-int/lit8 v9, v9, 0x10

    .line 190
    .line 191
    or-int/2addr v9, v15

    .line 192
    shl-int/lit8 v6, v6, 0x8

    .line 193
    .line 194
    or-int/2addr v6, v9

    .line 195
    or-int/2addr v14, v6

    .line 196
    const/4 v6, 0x0

    .line 197
    goto :goto_5

    .line 198
    :cond_7
    const/16 v20, 0x0

    .line 199
    .line 200
    :goto_6
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    if-nez v9, :cond_b

    .line 209
    .line 210
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    invoke-virtual {v13}, Lmr3;->a()Z

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    if-eq v4, v9, :cond_8

    .line 218
    .line 219
    const/4 v9, 0x0

    .line 220
    goto :goto_7

    .line 221
    :cond_8
    move-object v9, v6

    .line 222
    :goto_7
    sget-object v14, Ljv3;->b:Ljv3;

    .line 223
    .line 224
    invoke-virtual {v14, v13, v9}, Ljv3;->b(Lmr3;Ljava/lang/Integer;)Lgi2;

    .line 225
    .line 226
    .line 227
    move-result-object v18

    .line 228
    new-instance v17, Lir3;

    .line 229
    .line 230
    invoke-static {}, Ljr3;->r()I

    .line 231
    .line 232
    .line 233
    move-result v19

    .line 234
    iget-boolean v9, v12, Lfr3;->a:Z

    .line 235
    .line 236
    const/16 v22, 0x0

    .line 237
    .line 238
    sget-object v23, Ltv2;->n:Ltv2;

    .line 239
    .line 240
    move/from16 v21, v9

    .line 241
    .line 242
    invoke-direct/range {v17 .. v23}, Lir3;-><init>(Lgi2;IIZZLhr3;)V

    .line 243
    .line 244
    .line 245
    move-object/from16 v13, v17

    .line 246
    .line 247
    move-object/from16 v9, v18

    .line 248
    .line 249
    move/from16 v14, v20

    .line 250
    .line 251
    invoke-static {}, Ljr3;->r()I

    .line 252
    .line 253
    .line 254
    move-result v15

    .line 255
    invoke-static {v9, v15, v14}, Ljr3;->u(Lgi2;II)Luz3;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-virtual {v2}, Ln54;->b()V

    .line 260
    .line 261
    .line 262
    iget-object v14, v2, Ln54;->g:Lp54;

    .line 263
    .line 264
    check-cast v14, Lvz3;

    .line 265
    .line 266
    invoke-virtual {v14, v9}, Lvz3;->I(Luz3;)V

    .line 267
    .line 268
    .line 269
    iget-boolean v9, v12, Lfr3;->a:Z

    .line 270
    .line 271
    if-eqz v9, :cond_a

    .line 272
    .line 273
    if-nez v10, :cond_9

    .line 274
    .line 275
    move-object v10, v6

    .line 276
    goto :goto_8

    .line 277
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 278
    .line 279
    const-string v1, "Two primaries were set"

    .line 280
    .line 281
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    throw v0

    .line 285
    :cond_a
    :goto_8
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    const/4 v6, 0x0

    .line 289
    goto/16 :goto_3

    .line 290
    .line 291
    :cond_b
    move/from16 v14, v20

    .line 292
    .line 293
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 294
    .line 295
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    new-instance v2, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    add-int/lit8 v1, v1, 0x1f

    .line 306
    .line 307
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 308
    .line 309
    .line 310
    const-string v1, "Id "

    .line 311
    .line 312
    const-string v3, " is used twice in the keyset"

    .line 313
    .line 314
    invoke-static {v2, v1, v14, v3}, Lga1;->k(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v0

    .line 322
    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 323
    .line 324
    const-string v1, "No ID was set (with withFixedId or withRandomId)"

    .line 325
    .line 326
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw v0

    .line 330
    :cond_d
    if-eqz v10, :cond_11

    .line 331
    .line 332
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    invoke-virtual {v2}, Ln54;->b()V

    .line 337
    .line 338
    .line 339
    iget-object v3, v2, Ln54;->g:Lp54;

    .line 340
    .line 341
    check-cast v3, Lvz3;

    .line 342
    .line 343
    invoke-virtual {v3, v1}, Lvz3;->H(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Ln54;->d()Lp54;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    check-cast v1, Lvz3;

    .line 351
    .line 352
    invoke-virtual {v1}, Lvz3;->C()I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-lez v2, :cond_10

    .line 357
    .line 358
    iget-object v0, v0, Lwy0;->h:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Lhv3;

    .line 361
    .line 362
    new-instance v2, Ljr3;

    .line 363
    .line 364
    invoke-direct {v2, v1, v5, v0}, Ljr3;-><init>(Lvz3;Ljava/util/List;Lhv3;)V

    .line 365
    .line 366
    .line 367
    iget-object v1, v0, Lhv3;->a:Ljava/util/Map;

    .line 368
    .line 369
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-nez v1, :cond_f

    .line 374
    .line 375
    new-instance v12, Lsu2;

    .line 376
    .line 377
    const/16 v1, 0xe

    .line 378
    .line 379
    invoke-direct {v12, v1}, Lsu2;-><init>(I)V

    .line 380
    .line 381
    .line 382
    new-instance v1, Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    const/4 v4, 0x0

    .line 396
    :goto_9
    if-ge v4, v3, :cond_e

    .line 397
    .line 398
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    add-int/lit8 v4, v4, 0x1

    .line 403
    .line 404
    check-cast v6, Lir3;

    .line 405
    .line 406
    new-instance v7, Lir3;

    .line 407
    .line 408
    move-object v8, v7

    .line 409
    iget-object v7, v6, Lir3;->a:Lgi2;

    .line 410
    .line 411
    move-object v9, v8

    .line 412
    iget v8, v6, Lir3;->g:I

    .line 413
    .line 414
    move-object v10, v9

    .line 415
    iget v9, v6, Lir3;->c:I

    .line 416
    .line 417
    move-object v11, v10

    .line 418
    iget-boolean v10, v6, Lir3;->d:Z

    .line 419
    .line 420
    iget-boolean v6, v6, Lir3;->e:Z

    .line 421
    .line 422
    move-object/from16 v24, v11

    .line 423
    .line 424
    move v11, v6

    .line 425
    move-object/from16 v6, v24

    .line 426
    .line 427
    invoke-direct/range {v6 .. v12}, Lir3;-><init>(Lgi2;IIZZLhr3;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_e
    new-instance v3, Ljr3;

    .line 435
    .line 436
    const/4 v4, 0x0

    .line 437
    invoke-direct {v3, v1, v0, v2, v4}, Ljr3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 438
    .line 439
    .line 440
    return-object v3

    .line 441
    :cond_f
    return-object v2

    .line 442
    :cond_10
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 443
    .line 444
    const-string v1, "empty keyset"

    .line 445
    .line 446
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v0

    .line 450
    :cond_11
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 451
    .line 452
    const-string v1, "No primary was set"

    .line 453
    .line 454
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    throw v0

    .line 458
    :cond_12
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 459
    .line 460
    const-string v1, "KeysetHandle.Builder#build must only be called once"

    .line 461
    .line 462
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    throw v0
.end method

.method public static synthetic r()I
    .locals 2

    .line 1
    sget-object v0, Ler3;->h:Ler3;

    .line 2
    .line 3
    invoke-virtual {v0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    return v0

    .line 11
    :cond_0
    sget-object v1, Ler3;->i:Ler3;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    return v0

    .line 21
    :cond_1
    sget-object v1, Ler3;->j:Ler3;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x5

    .line 30
    return v0

    .line 31
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v1, "Unknown key status"

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public static s(Luz3;)Lfw3;
    .locals 4

    .line 1
    invoke-virtual {p0}, Luz3;->C()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Luz3;->D()Li04;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Li04;->j:Li04;

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-virtual {p0}, Luz3;->B()Loz3;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Loz3;->A()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p0}, Luz3;->B()Loz3;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Loz3;->B()La54;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p0}, Luz3;->B()Loz3;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Loz3;->C()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-virtual {p0}, Luz3;->D()Li04;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {v1, v2, v3, p0, v0}, Lfw3;->v(Ljava/lang/String;La54;ILi04;Ljava/lang/Integer;)Lfw3;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method public static t(I)Z
    .locals 2

    .line 1
    add-int/lit8 p0, p0, -0x2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p0, v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq p0, v1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    return v0
.end method

.method public static u(Lgi2;II)Luz3;
    .locals 4

    .line 1
    sget-object v0, Lrv3;->b:Lrv3;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lrv3;->f(Lgi2;)Lkw3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lfw3;

    .line 8
    .line 9
    iget-object v0, p0, Lfw3;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne v0, p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 23
    .line 24
    const-string p1, "Wrong ID set for key with ID requirement"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_0
    invoke-static {}, Luz3;->E()Ltz3;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {}, Loz3;->D()Lnz3;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Lfw3;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1}, Ln54;->b()V

    .line 43
    .line 44
    .line 45
    iget-object v3, v1, Ln54;->g:Lp54;

    .line 46
    .line 47
    check-cast v3, Loz3;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Loz3;->F(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lfw3;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, La54;

    .line 55
    .line 56
    invoke-virtual {v1}, Ln54;->b()V

    .line 57
    .line 58
    .line 59
    iget-object v3, v1, Ln54;->g:Lp54;

    .line 60
    .line 61
    check-cast v3, Loz3;

    .line 62
    .line 63
    invoke-virtual {v3, v2}, Loz3;->G(La54;)V

    .line 64
    .line 65
    .line 66
    iget v2, p0, Lfw3;->f:I

    .line 67
    .line 68
    invoke-virtual {v1}, Ln54;->b()V

    .line 69
    .line 70
    .line 71
    iget-object v3, v1, Ln54;->g:Lp54;

    .line 72
    .line 73
    check-cast v3, Loz3;

    .line 74
    .line 75
    invoke-virtual {v3, v2}, Loz3;->H(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ln54;->b()V

    .line 79
    .line 80
    .line 81
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 82
    .line 83
    check-cast v2, Luz3;

    .line 84
    .line 85
    invoke-virtual {v1}, Ln54;->d()Lp54;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Loz3;

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Luz3;->F(Loz3;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ln54;->b()V

    .line 95
    .line 96
    .line 97
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 98
    .line 99
    check-cast v1, Luz3;

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Luz3;->J(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ln54;->b()V

    .line 105
    .line 106
    .line 107
    iget-object p1, v0, Ln54;->g:Lp54;

    .line 108
    .line 109
    check-cast p1, Luz3;

    .line 110
    .line 111
    invoke-virtual {p1, p2}, Luz3;->G(I)V

    .line 112
    .line 113
    .line 114
    iget-object p0, p0, Lfw3;->j:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Li04;

    .line 117
    .line 118
    invoke-virtual {v0}, Ln54;->b()V

    .line 119
    .line 120
    .line 121
    iget-object p1, v0, Ln54;->g:Lp54;

    .line 122
    .line 123
    check-cast p1, Luz3;

    .line 124
    .line 125
    invoke-virtual {p1, p0}, Luz3;->H(Li04;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, Luz3;

    .line 133
    .line 134
    return-object p0
.end method


# virtual methods
.method public b(I)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    mul-int/lit8 p1, p1, 0x8

    .line 11
    .line 12
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "Invalid key size %d; only 128-bit and 256-bit AES keys are supported"

    .line 23
    .line 24
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Ljr3;->g:Ljava/lang/Object;

    .line 37
    .line 38
    return-void
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwt2;

    .line 4
    .line 5
    iget-object v0, v0, Lwt2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lkh4;

    .line 8
    .line 9
    check-cast p1, Lrh4;

    .line 10
    .line 11
    iget-object v1, p0, Ljr3;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lch4;

    .line 14
    .line 15
    iget-object v2, p0, Ljr3;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lhh4;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-interface {p1, v3, v0, v1, v2}, Lrh4;->j(ILkh4;Lch4;Lhh4;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public e(Lth3;Landroid/net/Uri;Ljava/util/Map;JJLbi4;)V
    .locals 7

    .line 1
    new-instance v1, Ldf1;

    .line 2
    .line 3
    move-object v2, p1

    .line 4
    move-wide v3, p4

    .line 5
    move-wide v5, p6

    .line 6
    invoke-direct/range {v1 .. v6}, Ldf1;-><init>(Lua4;JJ)V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Ljr3;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p1, p0, Ljr3;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Llf1;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p1, p0, Ljr3;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lof1;

    .line 21
    .line 22
    invoke-interface {p1, p2, p3}, Lof1;->d(Landroid/net/Uri;Ljava/util/Map;)[Llf1;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    array-length p2, p1

    .line 27
    sget-object p3, Lxm3;->g:Lvm3;

    .line 28
    .line 29
    const-string p3, "expectedSize"

    .line 30
    .line 31
    invoke-static {p3, p2}, Lob1;->z(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    new-instance p3, Lum3;

    .line 35
    .line 36
    invoke-direct {p3, p2}, Lrm3;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const/4 p4, 0x1

    .line 40
    const/4 p5, 0x0

    .line 41
    if-ne p2, p4, :cond_1

    .line 42
    .line 43
    aget-object p1, p1, p5

    .line 44
    .line 45
    iput-object p1, p0, Ljr3;->h:Ljava/lang/Object;

    .line 46
    .line 47
    goto :goto_7

    .line 48
    :cond_1
    move p6, p5

    .line 49
    :goto_0
    if-ge p6, p2, :cond_7

    .line 50
    .line 51
    aget-object p7, p1, p6

    .line 52
    .line 53
    :try_start_0
    invoke-interface {p7, v1}, Llf1;->b(Lmf1;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iput-object p7, p0, Ljr3;->h:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    iput p5, v1, Ldf1;->k:I

    .line 62
    .line 63
    goto :goto_6

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    :try_start_1
    invoke-interface {p7}, Llf1;->d()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p7

    .line 71
    invoke-virtual {p3, p7}, Lrm3;->b(Ljava/lang/Iterable;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    iget-object p7, p0, Ljr3;->h:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p7, Llf1;

    .line 77
    .line 78
    if-nez p7, :cond_3

    .line 79
    .line 80
    iget-wide v5, v1, Ldf1;->i:J

    .line 81
    .line 82
    cmp-long p7, v5, v3

    .line 83
    .line 84
    if-nez p7, :cond_4

    .line 85
    .line 86
    :cond_3
    :goto_1
    move p7, p4

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move p7, p5

    .line 89
    :goto_2
    invoke-static {p7}, Lzt0;->b0(Z)V

    .line 90
    .line 91
    .line 92
    iput p5, v1, Ldf1;->k:I

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :goto_3
    iget-object p2, p0, Ljr3;->h:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p2, Llf1;

    .line 98
    .line 99
    if-nez p2, :cond_6

    .line 100
    .line 101
    iget-wide p2, v1, Ldf1;->i:J

    .line 102
    .line 103
    cmp-long p2, p2, v3

    .line 104
    .line 105
    if-nez p2, :cond_5

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_5
    move p4, p5

    .line 109
    :cond_6
    :goto_4
    invoke-static {p4}, Lzt0;->b0(Z)V

    .line 110
    .line 111
    .line 112
    iput p5, v1, Ldf1;->k:I

    .line 113
    .line 114
    throw p1

    .line 115
    :catch_0
    iget-object p7, p0, Ljr3;->h:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p7, Llf1;

    .line 118
    .line 119
    if-nez p7, :cond_3

    .line 120
    .line 121
    iget-wide v5, v1, Ldf1;->i:J

    .line 122
    .line 123
    cmp-long p7, v5, v3

    .line 124
    .line 125
    if-nez p7, :cond_4

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :goto_5
    add-int/lit8 p6, p6, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_7
    :goto_6
    iget-object p2, p0, Ljr3;->h:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p2, Llf1;

    .line 134
    .line 135
    if-eqz p2, :cond_8

    .line 136
    .line 137
    :goto_7
    iget-object p1, p0, Ljr3;->h:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p1, Llf1;

    .line 140
    .line 141
    invoke-interface {p1, p8}, Llf1;->f(Lnf1;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_8
    new-instance p2, Lsi4;

    .line 146
    .line 147
    invoke-static {p1}, Lxm3;->n([Ljava/lang/Object;)Lsn3;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    sget-object p4, Ldj3;->f:Ldj3;

    .line 152
    .line 153
    invoke-static {p1, p4}, Lgi2;->O(Ljava/util/List;Lzk3;)Ljava/util/AbstractList;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-instance p4, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string p5, ", "

    .line 167
    .line 168
    invoke-static {p4, p1, p5}, Li30;->k0(Ljava/lang/StringBuilder;Ljava/util/Iterator;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 176
    .line 177
    .line 178
    move-result p4

    .line 179
    new-instance p5, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    add-int/lit8 p4, p4, 0x3a

    .line 182
    .line 183
    invoke-direct {p5, p4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 184
    .line 185
    .line 186
    const-string p4, "None of the available extractors ("

    .line 187
    .line 188
    const-string p6, ") could read the stream."

    .line 189
    .line 190
    invoke-static {p5, p4, p1, p6}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p3}, Lum3;->f()Lsn3;

    .line 195
    .line 196
    .line 197
    move-result-object p3

    .line 198
    invoke-direct {p2, p1, p3}, Lsi4;-><init>(Ljava/lang/String;Lsn3;)V

    .line 199
    .line 200
    .line 201
    throw p2
.end method

.method public f()Lvz3;
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Lvz3;->G()Lsz3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ljr3;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lir3;

    .line 24
    .line 25
    invoke-virtual {v2}, Lir3;->a()Lgi2;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget v4, v2, Lir3;->c:I

    .line 30
    .line 31
    iget v5, v2, Lir3;->g:I

    .line 32
    .line 33
    invoke-static {v3, v5, v4}, Ljr3;->u(Lgi2;II)Luz3;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0}, Ln54;->b()V

    .line 38
    .line 39
    .line 40
    iget-object v5, v0, Ln54;->g:Lp54;

    .line 41
    .line 42
    check-cast v5, Lvz3;

    .line 43
    .line 44
    invoke-virtual {v5, v3}, Lvz3;->I(Luz3;)V

    .line 45
    .line 46
    .line 47
    iget-boolean v2, v2, Lir3;->d:Z

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Ln54;->b()V

    .line 52
    .line 53
    .line 54
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 55
    .line 56
    check-cast v2, Lvz3;

    .line 57
    .line 58
    invoke-virtual {v2, v4}, Lvz3;->H(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception v0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lvz3;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    return-object v0

    .line 71
    :goto_1
    new-instance v1, Lrg;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw v1
.end method

.method public g(I)V
    .locals 3

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Ljr3;->h:Ljava/lang/Object;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x28

    .line 29
    .line 30
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const-string v1, "Invalid tag size for AesCmacParameters: "

    .line 34
    .line 35
    invoke-static {v2, v1, p1}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public h()[B
    .locals 15

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v1, v0, [J

    .line 4
    .line 5
    new-array v2, v0, [J

    .line 6
    .line 7
    new-array v3, v0, [J

    .line 8
    .line 9
    new-array v4, v0, [J

    .line 10
    .line 11
    new-array v5, v0, [J

    .line 12
    .line 13
    new-array v6, v0, [J

    .line 14
    .line 15
    new-array v7, v0, [J

    .line 16
    .line 17
    new-array v8, v0, [J

    .line 18
    .line 19
    new-array v9, v0, [J

    .line 20
    .line 21
    new-array v10, v0, [J

    .line 22
    .line 23
    new-array v11, v0, [J

    .line 24
    .line 25
    new-array v12, v0, [J

    .line 26
    .line 27
    new-array v13, v0, [J

    .line 28
    .line 29
    iget-object v14, p0, Ljr3;->i:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v14, [J

    .line 32
    .line 33
    invoke-static {v4, v14}, Lpu1;->I([J[J)V

    .line 34
    .line 35
    .line 36
    invoke-static {v13, v4}, Lpu1;->I([J[J)V

    .line 37
    .line 38
    .line 39
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 40
    .line 41
    .line 42
    invoke-static {v5, v12, v14}, Lpu1;->G([J[J[J)V

    .line 43
    .line 44
    .line 45
    invoke-static {v6, v5, v4}, Lpu1;->G([J[J[J)V

    .line 46
    .line 47
    .line 48
    invoke-static {v12, v6}, Lpu1;->I([J[J)V

    .line 49
    .line 50
    .line 51
    invoke-static {v7, v12, v5}, Lpu1;->G([J[J[J)V

    .line 52
    .line 53
    .line 54
    invoke-static {v12, v7}, Lpu1;->I([J[J)V

    .line 55
    .line 56
    .line 57
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 58
    .line 59
    .line 60
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 61
    .line 62
    .line 63
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 64
    .line 65
    .line 66
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 67
    .line 68
    .line 69
    invoke-static {v8, v12, v7}, Lpu1;->G([J[J[J)V

    .line 70
    .line 71
    .line 72
    invoke-static {v12, v8}, Lpu1;->I([J[J)V

    .line 73
    .line 74
    .line 75
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 76
    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    move v5, v4

    .line 80
    :goto_0
    if-ge v5, v0, :cond_0

    .line 81
    .line 82
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 83
    .line 84
    .line 85
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 86
    .line 87
    .line 88
    add-int/lit8 v5, v5, 0x2

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-static {v9, v13, v8}, Lpu1;->G([J[J[J)V

    .line 92
    .line 93
    .line 94
    invoke-static {v12, v9}, Lpu1;->I([J[J)V

    .line 95
    .line 96
    .line 97
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 98
    .line 99
    .line 100
    move v5, v4

    .line 101
    :goto_1
    const/16 v7, 0x14

    .line 102
    .line 103
    if-ge v5, v7, :cond_1

    .line 104
    .line 105
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 106
    .line 107
    .line 108
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 v5, v5, 0x2

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    invoke-static {v12, v13, v9}, Lpu1;->G([J[J[J)V

    .line 115
    .line 116
    .line 117
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 118
    .line 119
    .line 120
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 121
    .line 122
    .line 123
    move v5, v4

    .line 124
    :goto_2
    if-ge v5, v0, :cond_2

    .line 125
    .line 126
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 127
    .line 128
    .line 129
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 130
    .line 131
    .line 132
    add-int/lit8 v5, v5, 0x2

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_2
    invoke-static {v10, v12, v8}, Lpu1;->G([J[J[J)V

    .line 136
    .line 137
    .line 138
    invoke-static {v12, v10}, Lpu1;->I([J[J)V

    .line 139
    .line 140
    .line 141
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 142
    .line 143
    .line 144
    move v0, v4

    .line 145
    :goto_3
    const/16 v5, 0x32

    .line 146
    .line 147
    if-ge v0, v5, :cond_3

    .line 148
    .line 149
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 150
    .line 151
    .line 152
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 153
    .line 154
    .line 155
    add-int/lit8 v0, v0, 0x2

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_3
    invoke-static {v11, v13, v10}, Lpu1;->G([J[J[J)V

    .line 159
    .line 160
    .line 161
    invoke-static {v13, v11}, Lpu1;->I([J[J)V

    .line 162
    .line 163
    .line 164
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 165
    .line 166
    .line 167
    move v0, v4

    .line 168
    :goto_4
    const/16 v7, 0x64

    .line 169
    .line 170
    if-ge v0, v7, :cond_4

    .line 171
    .line 172
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 173
    .line 174
    .line 175
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 176
    .line 177
    .line 178
    add-int/lit8 v0, v0, 0x2

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_4
    invoke-static {v13, v12, v11}, Lpu1;->G([J[J[J)V

    .line 182
    .line 183
    .line 184
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 185
    .line 186
    .line 187
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 188
    .line 189
    .line 190
    :goto_5
    if-ge v4, v5, :cond_5

    .line 191
    .line 192
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 193
    .line 194
    .line 195
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 196
    .line 197
    .line 198
    add-int/lit8 v4, v4, 0x2

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_5
    invoke-static {v12, v13, v10}, Lpu1;->G([J[J[J)V

    .line 202
    .line 203
    .line 204
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 205
    .line 206
    .line 207
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 208
    .line 209
    .line 210
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 211
    .line 212
    .line 213
    invoke-static {v12, v13}, Lpu1;->I([J[J)V

    .line 214
    .line 215
    .line 216
    invoke-static {v13, v12}, Lpu1;->I([J[J)V

    .line 217
    .line 218
    .line 219
    invoke-static {v1, v13, v6}, Lpu1;->G([J[J[J)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, [J

    .line 225
    .line 226
    invoke-static {v2, v0, v1}, Lpu1;->G([J[J[J)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Ljr3;->h:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v0, [J

    .line 232
    .line 233
    invoke-static {v3, v0, v1}, Lpu1;->G([J[J[J)V

    .line 234
    .line 235
    .line 236
    invoke-static {v3}, Lpu1;->M([J)[B

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    const/16 v1, 0x1f

    .line 241
    .line 242
    aget-byte v3, v0, v1

    .line 243
    .line 244
    invoke-static {v2}, Lpu1;->M([J)[B

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    const/4 v4, 0x0

    .line 249
    aget-byte v2, v2, v4

    .line 250
    .line 251
    and-int/lit8 v2, v2, 0x1

    .line 252
    .line 253
    shl-int/lit8 v2, v2, 0x7

    .line 254
    .line 255
    xor-int/2addr v2, v3

    .line 256
    int-to-byte v2, v2

    .line 257
    aput-byte v2, v0, v1

    .line 258
    .line 259
    return-object v0
.end method

.method public i()Lir3;
    .locals 3

    .line 1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lir3;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-boolean v2, v1, Lir3;->d:Z

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v0, v1, Lir3;->b:Ler3;

    .line 28
    .line 29
    sget-object v2, Ler3;->h:Ler3;

    .line 30
    .line 31
    if-ne v0, v2, :cond_1

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v1, "Keyset has primary which isn\'t enabled"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v1, "Keyset has no valid primary"

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldf1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, v0, Ldf1;->i:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
.end method

.method public k()Lis3;
    .locals 5

    .line 1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lms3;

    .line 4
    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    iget-object v1, p0, Ljr3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lyf3;

    .line 10
    .line 11
    if-eqz v1, :cond_8

    .line 12
    .line 13
    iget v2, v0, Lms3;->a:I

    .line 14
    .line 15
    iget-object v1, v1, Lyf3;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lv34;

    .line 18
    .line 19
    iget-object v1, v1, Lv34;->a:[B

    .line 20
    .line 21
    array-length v1, v1

    .line 22
    if-ne v2, v1, :cond_7

    .line 23
    .line 24
    invoke-virtual {v0}, Lms3;->a()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 38
    .line 39
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    :goto_0
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lms3;

    .line 48
    .line 49
    invoke-virtual {v0}, Lms3;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Ljava/lang/Integer;

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 63
    .line 64
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_3
    :goto_1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lms3;

    .line 73
    .line 74
    iget-object v0, v0, Lms3;->b:Lls3;

    .line 75
    .line 76
    sget-object v1, Lls3;->e:Lls3;

    .line 77
    .line 78
    if-ne v0, v1, :cond_4

    .line 79
    .line 80
    sget-object v0, Lsv3;->a:Lv34;

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    sget-object v1, Lls3;->d:Lls3;

    .line 84
    .line 85
    if-ne v0, v1, :cond_5

    .line 86
    .line 87
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0}, Lsv3;->a(I)Lv34;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_2

    .line 100
    :cond_5
    sget-object v1, Lls3;->c:Lls3;

    .line 101
    .line 102
    if-ne v0, v1, :cond_6

    .line 103
    .line 104
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-static {v0}, Lsv3;->b(I)Lv34;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_2
    new-instance v1, Lis3;

    .line 117
    .line 118
    iget-object v2, p0, Ljr3;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Lms3;

    .line 121
    .line 122
    iget-object v3, p0, Ljr3;->h:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v3, Lyf3;

    .line 125
    .line 126
    iget-object v4, p0, Ljr3;->i:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v4, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-direct {v1, v2, v3, v0, v4}, Lis3;-><init>(Lms3;Lyf3;Lv34;Ljava/lang/Integer;)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    iget-object v1, p0, Ljr3;->g:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, Lms3;

    .line 139
    .line 140
    iget-object v1, v1, Lms3;->b:Lls3;

    .line 141
    .line 142
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const-string v2, "Unknown AesGcmParameters.Variant: "

    .line 147
    .line 148
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 157
    .line 158
    const-string v1, "Key size mismatch"

    .line 159
    .line 160
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0

    .line 164
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 165
    .line 166
    const-string v1, "Cannot build without parameters and/or key material"

    .line 167
    .line 168
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v0
.end method

.method public l()Lrw3;
    .locals 4

    .line 1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Ljr3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lrw3;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v2, p0, Ljr3;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iget-object v3, p0, Ljr3;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Lgs3;

    .line 30
    .line 31
    invoke-direct {v1, v0, v2, v3}, Lrw3;-><init>(IILgs3;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 36
    .line 37
    const-string v1, "tag size not set"

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 44
    .line 45
    const-string v1, "key size not set"

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public m()Ln14;
    .locals 5

    .line 1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll14;

    .line 4
    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-object v1, p0, Ljr3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/security/spec/ECPoint;

    .line 10
    .line 11
    if-eqz v1, :cond_8

    .line 12
    .line 13
    iget-object v0, v0, Ll14;->b:Lj14;

    .line 14
    .line 15
    iget-object v0, v0, Lj14;->b:Ljava/security/spec/ECParameterSpec;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v1, v0}, Lru3;->a(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ll14;

    .line 27
    .line 28
    invoke-virtual {v0}, Ll14;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Integer;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 42
    .line 43
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    :goto_0
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ll14;

    .line 52
    .line 53
    invoke-virtual {v0}, Ll14;->a()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/lang/Integer;

    .line 62
    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 67
    .line 68
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_3
    :goto_1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ll14;

    .line 77
    .line 78
    iget-object v0, v0, Ll14;->d:Lts3;

    .line 79
    .line 80
    sget-object v1, Lts3;->n:Lts3;

    .line 81
    .line 82
    if-ne v0, v1, :cond_4

    .line 83
    .line 84
    sget-object v0, Lsv3;->a:Lv34;

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    sget-object v1, Lts3;->m:Lts3;

    .line 88
    .line 89
    if-eq v0, v1, :cond_7

    .line 90
    .line 91
    sget-object v1, Lts3;->l:Lts3;

    .line 92
    .line 93
    if-ne v0, v1, :cond_5

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    sget-object v1, Lts3;->k:Lts3;

    .line 97
    .line 98
    if-ne v0, v1, :cond_6

    .line 99
    .line 100
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {v0}, Lsv3;->b(I)Lv34;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_3

    .line 113
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    iget-object v1, p0, Ljr3;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Ll14;

    .line 118
    .line 119
    iget-object v1, v1, Ll14;->d:Lts3;

    .line 120
    .line 121
    iget-object v1, v1, Lts3;->g:Ljava/lang/String;

    .line 122
    .line 123
    const-string v2, "Unknown EcdsaParameters.Variant: "

    .line 124
    .line 125
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :cond_7
    :goto_2
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-static {v0}, Lsv3;->a(I)Lv34;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :goto_3
    new-instance v1, Ln14;

    .line 146
    .line 147
    iget-object v2, p0, Ljr3;->g:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Ll14;

    .line 150
    .line 151
    iget-object v3, p0, Ljr3;->h:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v3, Ljava/security/spec/ECPoint;

    .line 154
    .line 155
    iget-object v4, p0, Ljr3;->i:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v4, Ljava/lang/Integer;

    .line 158
    .line 159
    invoke-direct {v1, v2, v3, v0, v4}, Ln14;-><init>(Ll14;Ljava/security/spec/ECPoint;Lv34;Ljava/lang/Integer;)V

    .line 160
    .line 161
    .line 162
    return-object v1

    .line 163
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 164
    .line 165
    const-string v1, "Cannot build without public point"

    .line 166
    .line 167
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 172
    .line 173
    const-string v1, "Cannot build without parameters"

    .line 174
    .line 175
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0
.end method

.method public n()Ll24;
    .locals 6

    .line 1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj24;

    .line 4
    .line 5
    if-eqz v0, :cond_a

    .line 6
    .line 7
    iget-object v0, p0, Ljr3;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/math/BigInteger;

    .line 10
    .line 11
    if-eqz v0, :cond_9

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Ljr3;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lj24;

    .line 20
    .line 21
    iget v2, v1, Lj24;->a:I

    .line 22
    .line 23
    if-ne v0, v2, :cond_8

    .line 24
    .line 25
    invoke-virtual {v1}, Lj24;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 39
    .line 40
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    :goto_0
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lj24;

    .line 49
    .line 50
    invoke-virtual {v0}, Lj24;->a()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/lang/Integer;

    .line 59
    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 64
    .line 65
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 66
    .line 67
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_3
    :goto_1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lj24;

    .line 74
    .line 75
    iget-object v0, v0, Lj24;->c:Li24;

    .line 76
    .line 77
    sget-object v1, Li24;->e:Li24;

    .line 78
    .line 79
    if-ne v0, v1, :cond_4

    .line 80
    .line 81
    sget-object v0, Lsv3;->a:Lv34;

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    sget-object v1, Li24;->d:Li24;

    .line 85
    .line 86
    if-eq v0, v1, :cond_7

    .line 87
    .line 88
    sget-object v1, Li24;->c:Li24;

    .line 89
    .line 90
    if-ne v0, v1, :cond_5

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    sget-object v1, Li24;->b:Li24;

    .line 94
    .line 95
    if-ne v0, v1, :cond_6

    .line 96
    .line 97
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v0}, Lsv3;->b(I)Lv34;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_3

    .line 110
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    iget-object v1, p0, Ljr3;->g:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Lj24;

    .line 115
    .line 116
    iget-object v1, v1, Lj24;->c:Li24;

    .line 117
    .line 118
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v2, "Unknown RsaSsaPssParameters.Variant: "

    .line 123
    .line 124
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_7
    :goto_2
    iget-object v0, p0, Ljr3;->i:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Ljava/lang/Integer;

    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    invoke-static {v0}, Lsv3;->a(I)Lv34;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_3
    new-instance v1, Ll24;

    .line 145
    .line 146
    iget-object v2, p0, Ljr3;->g:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Lj24;

    .line 149
    .line 150
    iget-object v3, p0, Ljr3;->h:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v3, Ljava/math/BigInteger;

    .line 153
    .line 154
    iget-object v4, p0, Ljr3;->i:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v4, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-direct {v1, v2, v3, v0, v4}, Ll24;-><init>(Lj24;Ljava/math/BigInteger;Lv34;Ljava/lang/Integer;)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 163
    .line 164
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    add-int/lit8 v3, v3, 0x38

    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    new-instance v5, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    add-int/2addr v3, v4

    .line 185
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 186
    .line 187
    .line 188
    const-string v3, "Got modulus size "

    .line 189
    .line 190
    const-string v4, ", but parameters requires modulus size "

    .line 191
    .line 192
    invoke-static {v5, v3, v0, v4, v2}, Lga1;->l(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v1

    .line 200
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 201
    .line 202
    const-string v1, "Cannot build without modulus"

    .line 203
    .line 204
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v0

    .line 208
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 209
    .line 210
    const-string v1, "Cannot build without parameters"

    .line 211
    .line 212
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v0
.end method

.method public o(I)Lir3;
    .locals 5

    .line 1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    if-ltz p1, :cond_2

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lir3;

    .line 18
    .line 19
    iget v2, v1, Lir3;->g:I

    .line 20
    .line 21
    invoke-static {v2}, Ljr3;->t(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const-string v3, "Keyset-Entry at position "

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget-boolean v1, v1, Lir3;->e:Z

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lir3;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x30

    .line 53
    .line 54
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 55
    .line 56
    .line 57
    const-string v1, " didn\'t parse correctly"

    .line 58
    .line 59
    invoke-static {v2, v3, p1, v1}, Lga1;->k(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    add-int/lit8 v1, v1, 0x2a

    .line 80
    .line 81
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 82
    .line 83
    .line 84
    const-string v1, " has wrong status"

    .line 85
    .line 86
    invoke-static {v2, v3, p1, v1}, Lga1;->k(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_2
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 95
    .line 96
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    add-int/lit8 v2, v2, 0x22

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    new-instance v4, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    add-int/2addr v2, v3

    .line 121
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 122
    .line 123
    .line 124
    const-string v2, "Invalid index "

    .line 125
    .line 126
    const-string v3, " for keyset of size "

    .line 127
    .line 128
    invoke-static {v4, v2, p1, v3, v0}, Lga1;->l(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v1
.end method

.method public q(Lyc0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Ljr3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Ljr3;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljr3;

    .line 8
    .line 9
    if-eqz p1, :cond_f

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    move-object v2, p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v2, v1

    .line 16
    :goto_0
    invoke-virtual {v2}, Ljr3;->f()Lvz3;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget v3, Lpr3;->a:I

    .line 21
    .line 22
    invoke-virtual {v2}, Lvz3;->A()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {v2}, Lvz3;->B()Lx54;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    move v9, v5

    .line 37
    move v7, v6

    .line 38
    move v8, v7

    .line 39
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    if-eqz v10, :cond_8

    .line 44
    .line 45
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    check-cast v10, Luz3;

    .line 50
    .line 51
    invoke-virtual {v10}, Luz3;->I()I

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    const/4 v12, 0x3

    .line 56
    if-ne v11, v12, :cond_1

    .line 57
    .line 58
    invoke-virtual {v10}, Luz3;->A()Z

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    if-eqz v11, :cond_7

    .line 63
    .line 64
    invoke-virtual {v10}, Luz3;->D()Li04;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    sget-object v12, Li04;->g:Li04;

    .line 69
    .line 70
    if-eq v11, v12, :cond_6

    .line 71
    .line 72
    invoke-virtual {v10}, Luz3;->I()I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    const/4 v12, 0x2

    .line 77
    if-eq v11, v12, :cond_5

    .line 78
    .line 79
    invoke-virtual {v10}, Luz3;->C()I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    if-ne v11, v3, :cond_3

    .line 84
    .line 85
    if-nez v8, :cond_2

    .line 86
    .line 87
    move v8, v5

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 90
    .line 91
    const-string p2, "keyset contains multiple primary keys"

    .line 92
    .line 93
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_3
    :goto_2
    invoke-virtual {v10}, Luz3;->B()Loz3;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-virtual {v10}, Loz3;->C()I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    const/4 v11, 0x4

    .line 106
    if-eq v10, v11, :cond_4

    .line 107
    .line 108
    move v10, v6

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    move v10, v5

    .line 111
    :goto_3
    and-int/2addr v9, v10

    .line 112
    add-int/lit8 v7, v7, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 116
    .line 117
    invoke-virtual {v10}, Luz3;->C()I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    const-string v0, "key %d has unknown status"

    .line 130
    .line 131
    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1

    .line 139
    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 140
    .line 141
    invoke-virtual {v10}, Luz3;->C()I

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    const-string v0, "key %d has unknown prefix"

    .line 154
    .line 155
    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw p1

    .line 163
    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 164
    .line 165
    invoke-virtual {v10}, Luz3;->C()I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    const-string v0, "key %d has no key data"

    .line 178
    .line 179
    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1

    .line 187
    :cond_8
    if-eqz v7, :cond_e

    .line 188
    .line 189
    if-nez v8, :cond_a

    .line 190
    .line 191
    if-eqz v9, :cond_9

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 195
    .line 196
    const-string p2, "keyset doesn\'t contain a valid primary key"

    .line 197
    .line 198
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p1

    .line 202
    :cond_a
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-ge v6, v3, :cond_c

    .line 207
    .line 208
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    check-cast v3, Lir3;

    .line 213
    .line 214
    iget-boolean v3, v3, Lir3;->e:Z

    .line 215
    .line 216
    if-nez v3, :cond_b

    .line 217
    .line 218
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Lir3;

    .line 223
    .line 224
    iget v3, v3, Lir3;->g:I

    .line 225
    .line 226
    invoke-static {v3}, Ljr3;->t(I)Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-eqz v3, :cond_b

    .line 231
    .line 232
    add-int/lit8 v6, v6, 0x1

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_b
    invoke-virtual {v2, v6}, Lvz3;->D(I)Luz3;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    new-instance p2, Ljava/security/GeneralSecurityException;

    .line 240
    .line 241
    invoke-virtual {p1}, Luz3;->B()Loz3;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-virtual {p1}, Loz3;->A()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    add-int/lit8 v0, v0, 0x2c

    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    add-int/2addr v1, v0

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    add-int/lit8 v1, v1, 0x20

    .line 271
    .line 272
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 273
    .line 274
    .line 275
    const-string v1, "Key parsing of key with index "

    .line 276
    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v1, " and type_url "

    .line 284
    .line 285
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const-string p1, " failed, unable to get primitive"

    .line 292
    .line 293
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw p2

    .line 304
    :cond_c
    if-nez v1, :cond_d

    .line 305
    .line 306
    move-object v1, p0

    .line 307
    :cond_d
    iget-object v0, p0, Ljr3;->h:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v0, Lhv3;

    .line 310
    .line 311
    invoke-virtual {p1, v1, v0, p2}, Lyc0;->n(Ljr3;Lhv3;Ljava/lang/Class;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    return-object p1

    .line 316
    :cond_e
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 317
    .line 318
    const-string p2, "keyset must contain at least one ENABLED key"

    .line 319
    .line 320
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw p1

    .line 324
    :cond_f
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 325
    .line 326
    const-string p2, "Currently only subclasses of InternalConfiguration are accepted"

    .line 327
    .line 328
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Ljr3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Ljr3;->f()Lvz3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget v1, Lpr3;->a:I

    .line 16
    .line 17
    invoke-static {}, Lzz3;->A()Lwz3;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Lvz3;->A()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v1}, Ln54;->b()V

    .line 26
    .line 27
    .line 28
    iget-object v3, v1, Ln54;->g:Lp54;

    .line 29
    .line 30
    check-cast v3, Lzz3;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Lzz3;->B(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lvz3;->B()Lx54;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Luz3;

    .line 54
    .line 55
    invoke-static {}, Lyz3;->A()Lxz3;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v2}, Luz3;->B()Loz3;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Loz3;->A()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v3}, Ln54;->b()V

    .line 68
    .line 69
    .line 70
    iget-object v5, v3, Ln54;->g:Lp54;

    .line 71
    .line 72
    check-cast v5, Lyz3;

    .line 73
    .line 74
    invoke-virtual {v5, v4}, Lyz3;->B(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Luz3;->I()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-virtual {v3}, Ln54;->b()V

    .line 82
    .line 83
    .line 84
    iget-object v5, v3, Ln54;->g:Lp54;

    .line 85
    .line 86
    check-cast v5, Lyz3;

    .line 87
    .line 88
    invoke-virtual {v5, v4}, Lyz3;->E(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Luz3;->D()Li04;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v3}, Ln54;->b()V

    .line 96
    .line 97
    .line 98
    iget-object v5, v3, Ln54;->g:Lp54;

    .line 99
    .line 100
    check-cast v5, Lyz3;

    .line 101
    .line 102
    invoke-virtual {v5, v4}, Lyz3;->D(Li04;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Luz3;->C()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {v3}, Ln54;->b()V

    .line 110
    .line 111
    .line 112
    iget-object v4, v3, Ln54;->g:Lp54;

    .line 113
    .line 114
    check-cast v4, Lyz3;

    .line 115
    .line 116
    invoke-virtual {v4, v2}, Lyz3;->C(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Ln54;->d()Lp54;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Lyz3;

    .line 124
    .line 125
    invoke-virtual {v1}, Ln54;->b()V

    .line 126
    .line 127
    .line 128
    iget-object v3, v1, Ln54;->g:Lp54;

    .line 129
    .line 130
    check-cast v3, Lzz3;

    .line 131
    .line 132
    invoke-virtual {v3, v2}, Lzz3;->C(Lyz3;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {v1}, Ln54;->d()Lp54;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lzz3;

    .line 141
    .line 142
    invoke-virtual {v0}, Lp54;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
