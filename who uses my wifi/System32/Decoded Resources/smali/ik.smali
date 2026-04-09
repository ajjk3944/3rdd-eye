.class public final Lik;
.super Le50;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# static fields
.field public static final h:Lik;

.field public static final i:Lik;

.field public static final j:Lik;

.field public static final k:Lik;

.field public static final l:Lik;

.field public static final m:Lik;


# instance fields
.field public final synthetic g:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lik;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lik;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lik;->h:Lik;

    .line 9
    .line 10
    new-instance v0, Lik;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lik;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lik;->i:Lik;

    .line 17
    .line 18
    new-instance v0, Lik;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Lik;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lik;->j:Lik;

    .line 25
    .line 26
    new-instance v0, Lik;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, Lik;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lik;->k:Lik;

    .line 33
    .line 34
    new-instance v0, Lik;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, Lik;-><init>(II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lik;->l:Lik;

    .line 41
    .line 42
    new-instance v0, Lik;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v1, v2}, Lik;-><init>(II)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lik;->m:Lik;

    .line 49
    .line 50
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lik;->g:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Le50;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lik;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lhk;

    .line 7
    .line 8
    check-cast p2, Lfk;

    .line 9
    .line 10
    invoke-interface {p1, p2}, Lhk;->g(Lhk;)Lhk;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Lr11;

    .line 16
    .line 17
    check-cast p2, Lfk;

    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_1
    check-cast p1, Lo11;

    .line 21
    .line 22
    check-cast p2, Lfk;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    instance-of p1, p2, Lo11;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    move-object p1, p2

    .line 32
    check-cast p1, Lo11;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    :goto_0
    return-object p1

    .line 37
    :pswitch_2
    check-cast p2, Lfk;

    .line 38
    .line 39
    instance-of v0, p2, Lo11;

    .line 40
    .line 41
    if-eqz v0, :cond_5

    .line 42
    .line 43
    instance-of v0, p1, Ljava/lang/Integer;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    check-cast p1, Ljava/lang/Integer;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 p1, 0x0

    .line 51
    :goto_1
    const/4 v0, 0x1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move p1, v0

    .line 60
    :goto_2
    if-nez p1, :cond_4

    .line 61
    .line 62
    move-object p1, p2

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    add-int/2addr p1, v0

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :cond_5
    :goto_3
    return-object p1

    .line 70
    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    check-cast p2, Lfk;

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    check-cast p2, Lfk;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_5
    check-cast p1, Lhk;

    .line 94
    .line 95
    check-cast p2, Lfk;

    .line 96
    .line 97
    invoke-interface {p1, p2}, Lhk;->g(Lhk;)Lhk;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
