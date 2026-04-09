.class public final Lgn3;
.super Lyq2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public g:Ljava/lang/Object;

.field public h:I

.field public final synthetic i:I

.field public final j:Ljava/util/Iterator;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lyq2;-><init>(I)V

    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lgn3;->h:I

    return-void
.end method

.method public constructor <init>(Lao3;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lgn3;->i:I

    .line 4
    iput-object p3, p0, Lgn3;->k:Ljava/lang/Object;

    invoke-direct {p0}, Lgn3;-><init>()V

    .line 5
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lgn3;->j:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Ljava/util/Iterator;Lcl3;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lgn3;->i:I

    .line 3
    iput-object p1, p0, Lgn3;->j:Ljava/util/Iterator;

    iput-object p2, p0, Lgn3;->k:Ljava/lang/Object;

    invoke-direct {p0}, Lgn3;-><init>()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 5

    .line 1
    iget v0, p0, Lgn3;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x4

    .line 6
    if-eq v0, v3, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    invoke-static {v0}, Lzt0;->b0(Z)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, Lgn3;->h:I

    .line 15
    .line 16
    add-int/lit8 v4, v0, -0x1

    .line 17
    .line 18
    if-eqz v0, :cond_7

    .line 19
    .line 20
    if-eqz v4, :cond_6

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    if-eq v4, v0, :cond_5

    .line 24
    .line 25
    iput v3, p0, Lgn3;->h:I

    .line 26
    .line 27
    iget v0, p0, Lgn3;->i:I

    .line 28
    .line 29
    packed-switch v0, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lgn3;->j:Ljava/util/Iterator;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Lgn3;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/4 v0, 0x3

    .line 56
    iput v0, p0, Lgn3;->h:I

    .line 57
    .line 58
    :goto_1
    const/4 v0, 0x0

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    :pswitch_0
    iget-object v0, p0, Lgn3;->j:Ljava/util/Iterator;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    iget-object v3, p0, Lgn3;->k:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Lcl3;

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v3, v0}, Lcl3;->c(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    const/4 v0, 0x3

    .line 84
    iput v0, p0, Lgn3;->h:I

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :goto_2
    iput-object v0, p0, Lgn3;->g:Ljava/lang/Object;

    .line 88
    .line 89
    iget v0, p0, Lgn3;->h:I

    .line 90
    .line 91
    const/4 v3, 0x3

    .line 92
    if-eq v0, v3, :cond_5

    .line 93
    .line 94
    iput v2, p0, Lgn3;->h:I

    .line 95
    .line 96
    return v2

    .line 97
    :cond_5
    return v1

    .line 98
    :cond_6
    return v2

    .line 99
    :cond_7
    const/4 v0, 0x0

    .line 100
    throw v0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgn3;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    iput v0, p0, Lgn3;->h:I

    .line 9
    .line 10
    iget-object v0, p0, Lgn3;->g:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lgn3;->g:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0
.end method
