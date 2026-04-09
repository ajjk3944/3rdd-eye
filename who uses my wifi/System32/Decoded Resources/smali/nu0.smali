.class public final Lnu0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final d:Lnu0;

.field public static final e:Lnu0;

.field public static final f:Lnu0;

.field public static final g:Lnu0;

.field public static final h:Lnu0;

.field public static final i:Lnu0;


# instance fields
.field public final a:I

.field public b:Z

.field public c:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnu0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v3}, Lnu0;-><init>(ILkn0;Z)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnu0;->d:Lnu0;

    .line 10
    .line 11
    new-instance v0, Lnu0;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v1}, Lnu0;-><init>(ILkn0;Z)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lnu0;->e:Lnu0;

    .line 17
    .line 18
    new-instance v0, Lnu0;

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    invoke-direct {v0, v4, v2, v3}, Lnu0;-><init>(ILkn0;Z)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lnu0;->f:Lnu0;

    .line 25
    .line 26
    new-instance v0, Lnu0;

    .line 27
    .line 28
    invoke-direct {v0, v4, v2, v1}, Lnu0;-><init>(ILkn0;Z)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lnu0;->g:Lnu0;

    .line 32
    .line 33
    new-instance v0, Lnu0;

    .line 34
    .line 35
    const/4 v4, 0x3

    .line 36
    invoke-direct {v0, v4, v2, v3}, Lnu0;-><init>(ILkn0;Z)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lnu0;->h:Lnu0;

    .line 40
    .line 41
    new-instance v0, Lnu0;

    .line 42
    .line 43
    invoke-direct {v0, v4, v2, v1}, Lnu0;-><init>(ILkn0;Z)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lnu0;->i:Lnu0;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(ILkn0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnu0;->a:I

    .line 5
    .line 6
    iput-boolean p3, p0, Lnu0;->b:Z

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p2}, Lnu0;->a(Lkn0;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public static b(ILkn0;Z)Lnu0;
    .locals 1

    .line 1
    invoke-static {p0}, Lex0;->s(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string p1, "invalid type"

    .line 11
    .line 12
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0

    .line 16
    :pswitch_0
    new-instance v0, Lnu0;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1, p2}, Lnu0;-><init>(ILkn0;Z)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    if-eqz p2, :cond_0

    .line 23
    .line 24
    sget-object p0, Lnu0;->i:Lnu0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object p0, Lnu0;->h:Lnu0;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_2
    if-eqz p2, :cond_1

    .line 31
    .line 32
    sget-object p0, Lnu0;->g:Lnu0;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, Lnu0;->f:Lnu0;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_3
    if-eqz p2, :cond_2

    .line 39
    .line 40
    sget-object p0, Lnu0;->e:Lnu0;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    sget-object p0, Lnu0;->d:Lnu0;

    .line 44
    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lkn0;)V
    .locals 3

    .line 1
    iget v0, p0, Lnu0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    throw p1

    .line 10
    :pswitch_0
    move v1, v2

    .line 11
    :pswitch_1
    if-nez v1, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lnu0;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lnu0;->c:Ljava/util/ArrayList;

    .line 23
    .line 24
    instance-of v0, p1, Lqc;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    check-cast v0, Lqc;

    .line 30
    .line 31
    iget-boolean v0, v0, Lqc;->l:Z

    .line 32
    .line 33
    iput-boolean v0, p0, Lnu0;->b:Z

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    instance-of v0, p1, Lqc;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-boolean v0, p0, Lnu0;->b:Z

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    move-object v0, p1

    .line 45
    check-cast v0, Lqc;

    .line 46
    .line 47
    iget-boolean v0, v0, Lqc;->l:Z

    .line 48
    .line 49
    iput-boolean v0, p0, Lnu0;->b:Z

    .line 50
    .line 51
    :cond_1
    :goto_0
    iget-object v0, p0, Lnu0;->c:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    invoke-static {v0}, Lex0;->u(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const-string v1, "Attempted to add RRset to sealed response of type "

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lnu0;->a:I

    .line 7
    .line 8
    invoke-static {v1}, Lex0;->u(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    throw v0

    .line 22
    :pswitch_0
    move v2, v3

    .line 23
    :pswitch_1
    if-eqz v2, :cond_0

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, ": "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lnu0;->c:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string v1, ""

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
