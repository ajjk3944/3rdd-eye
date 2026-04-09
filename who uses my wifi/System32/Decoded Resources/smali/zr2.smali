.class public final Lzr2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lqm2;


# direct methods
.method public synthetic constructor <init>(Lga4;Lqm2;I)V
    .locals 0

    .line 2
    iput p3, p0, Lzr2;->a:I

    iput-object p1, p0, Lzr2;->b:Lga4;

    iput-object p2, p0, Lzr2;->c:Lqm2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lqm2;Lga4;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lzr2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzr2;->c:Lqm2;

    iput-object p2, p0, Lzr2;->b:Lga4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lzr2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lmd2;->a:Lld2;

    .line 7
    .line 8
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lzr2;->c:Lqm2;

    .line 12
    .line 13
    invoke-virtual {v1}, Lqm2;->a()Ll83;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lzr2;->b:Lga4;

    .line 18
    .line 19
    check-cast v2, Lqh2;

    .line 20
    .line 21
    invoke-virtual {v2}, Lqh2;->a()Lid2;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Lk33;

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-direct {v3, v0, v1, v2, v4}, Lk33;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    return-object v3

    .line 32
    :pswitch_0
    iget-object v0, p0, Lzr2;->b:Lga4;

    .line 33
    .line 34
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lym;

    .line 39
    .line 40
    iget-object v1, p0, Lzr2;->c:Lqm2;

    .line 41
    .line 42
    invoke-virtual {v1}, Lqm2;->a()Ll83;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v2, Lg33;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v2, v0, v1, v3}, Lg33;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :pswitch_1
    iget-object v0, p0, Lzr2;->b:Lga4;

    .line 54
    .line 55
    check-cast v0, Lhh2;

    .line 56
    .line 57
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, p0, Lzr2;->c:Lqm2;

    .line 62
    .line 63
    invoke-virtual {v1}, Lqm2;->a()Ll83;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v1, v1, Ll83;->g:Ljava/lang/String;

    .line 68
    .line 69
    new-instance v2, Lnc2;

    .line 70
    .line 71
    invoke-direct {v2, v0, v1}, Lnc2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v2

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
