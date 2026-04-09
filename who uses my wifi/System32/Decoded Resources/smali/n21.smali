.class public abstract Ln21;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/adservices/topics/TopicsManager;


# direct methods
.method public constructor <init>(Landroid/adservices/topics/TopicsManager;)V
    .locals 1

    .line 1
    const-string v0, "mTopicsManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ln21;->a:Landroid/adservices/topics/TopicsManager;

    .line 10
    .line 11
    return-void
.end method

.method public static c(Ln21;Lzy;Loj;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln21;",
            "Lzy;",
            "Loj;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lm21;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lm21;

    .line 7
    .line 8
    iget v1, v0, Lm21;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lm21;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm21;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lm21;-><init>(Ln21;Loj;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lm21;->j:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm21;->l:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Lm21;->i:Ln21;

    .line 35
    .line 36
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    invoke-static {p2}, Lbd2;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ln21;->a(Lzy;)Landroid/adservices/topics/GetTopicsRequest;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p0, v0, Lm21;->i:Ln21;

    .line 56
    .line 57
    iput v2, v0, Lm21;->l:I

    .line 58
    .line 59
    new-instance p2, Lkd;

    .line 60
    .line 61
    invoke-static {v0}, Luk2;->r(Loj;)Loj;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-direct {p2, v2, v0}, Lkd;-><init>(ILoj;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lkd;->u()V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Ln21;->a:Landroid/adservices/topics/TopicsManager;

    .line 72
    .line 73
    new-instance v1, Li8;

    .line 74
    .line 75
    const/4 v2, 0x1

    .line 76
    invoke-direct {v1, v2}, Li8;-><init>(I)V

    .line 77
    .line 78
    .line 79
    new-instance v2, Lsj;

    .line 80
    .line 81
    invoke-direct {v2, p2}, Lsj;-><init>(Lkd;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0, p1, v1, v2}, Ltc0;->s(Landroid/adservices/topics/TopicsManager;Landroid/adservices/topics/GetTopicsRequest;Li8;Landroid/os/OutcomeReceiver;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Lkd;->t()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    sget-object p1, Lrk;->f:Lrk;

    .line 92
    .line 93
    if-ne p2, p1, :cond_3

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_3
    :goto_1
    invoke-static {p2}, Ltc0;->i(Ljava/lang/Object;)Landroid/adservices/topics/GetTopicsResponse;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const-string p0, "response"

    .line 104
    .line 105
    invoke-static {p1, p0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    new-instance p0, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, Ltc0;->n(Landroid/adservices/topics/GetTopicsResponse;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_4

    .line 126
    .line 127
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-static {p2}, Ltc0;->j(Ljava/lang/Object;)Landroid/adservices/topics/Topic;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    new-instance v0, Lj21;

    .line 136
    .line 137
    invoke-static {p2}, Ltc0;->c(Landroid/adservices/topics/Topic;)J

    .line 138
    .line 139
    .line 140
    move-result-wide v2

    .line 141
    invoke-static {p2}, Ltc0;->u(Landroid/adservices/topics/Topic;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v4

    .line 145
    invoke-static {p2}, Ltc0;->a(Landroid/adservices/topics/Topic;)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-direct/range {v0 .. v5}, Lj21;-><init>(IJJ)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    new-instance p1, Laz;

    .line 157
    .line 158
    invoke-direct {p1, p0}, Laz;-><init>(Ljava/util/List;)V

    .line 159
    .line 160
    .line 161
    return-object p1
.end method


# virtual methods
.method public a(Lzy;)Landroid/adservices/topics/GetTopicsRequest;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ltc0;->e()Landroid/adservices/topics/GetTopicsRequest$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Ltc0;->f(Landroid/adservices/topics/GetTopicsRequest$Builder;)Landroid/adservices/topics/GetTopicsRequest$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Ltc0;->h(Landroid/adservices/topics/GetTopicsRequest$Builder;)Landroid/adservices/topics/GetTopicsRequest;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "Builder()\n            .s\u2026ame)\n            .build()"

    .line 19
    .line 20
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public b(Lzy;Loj;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzy;",
            "Loj;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Ln21;->c(Ln21;Lzy;Loj;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
