.class public final synthetic Ldj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzk3;


# static fields
.field public static final synthetic b:Ldj3;

.field public static final synthetic c:Ldj3;

.field public static final synthetic d:Ldj3;

.field public static final synthetic e:Ldj3;

.field public static final synthetic f:Ldj3;

.field public static final synthetic g:Ldj3;

.field public static final synthetic h:Ldj3;

.field public static final synthetic i:Ldj3;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldj3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldj3;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldj3;->b:Ldj3;

    .line 8
    .line 9
    new-instance v0, Ldj3;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Ldj3;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ldj3;->c:Ldj3;

    .line 16
    .line 17
    new-instance v0, Ldj3;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Ldj3;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ldj3;->d:Ldj3;

    .line 24
    .line 25
    new-instance v0, Ldj3;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Ldj3;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Ldj3;->e:Ldj3;

    .line 32
    .line 33
    new-instance v0, Ldj3;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Ldj3;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ldj3;->f:Ldj3;

    .line 40
    .line 41
    new-instance v0, Ldj3;

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {v0, v1}, Ldj3;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Ldj3;->g:Ldj3;

    .line 48
    .line 49
    new-instance v0, Ldj3;

    .line 50
    .line 51
    const/4 v1, 0x6

    .line 52
    invoke-direct {v0, v1}, Ldj3;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Ldj3;->h:Ldj3;

    .line 56
    .line 57
    new-instance v0, Ldj3;

    .line 58
    .line 59
    const/4 v1, 0x7

    .line 60
    invoke-direct {v0, v1}, Ldj3;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Ldj3;->i:Ldj3;

    .line 64
    .line 65
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldj3;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ldj3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ld02;

    .line 8
    .line 9
    sget-object v0, Lri4;->d:Lri4;

    .line 10
    .line 11
    iget p1, p1, Ld02;->c:I

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :pswitch_0
    check-cast p1, Ljh4;

    .line 19
    .line 20
    invoke-interface {p1}, Ljh4;->l()Lri4;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, Lri4;->b:Lsn3;

    .line 25
    .line 26
    sget-object v0, Ldj3;->i:Ldj3;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lgi2;->O(Ljava/util/List;Lzk3;)Ljava/util/AbstractList;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lxm3;->m(Ljava/util/Collection;)Lxm3;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :pswitch_1
    check-cast p1, Lui4;

    .line 38
    .line 39
    sget v0, Lph4;->N:I

    .line 40
    .line 41
    iget-object v0, p1, Lui4;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, p1, Lui4;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x2

    .line 64
    .line 65
    add-int/2addr v1, v2

    .line 66
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 67
    .line 68
    .line 69
    const-string v1, ": "

    .line 70
    .line 71
    invoke-static {v3, v0, v1, p1}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :pswitch_2
    check-cast p1, Llf1;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :pswitch_3
    check-cast p1, Lnj3;

    .line 91
    .line 92
    const/4 p1, 0x5

    .line 93
    invoke-static {p1}, Lpj3;->b(I)Lyg3;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 99
    .line 100
    return-object v1

    .line 101
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 102
    .line 103
    return-object v1

    .line 104
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 105
    .line 106
    return-object v1

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
