.class public final Lnk2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lga4;

.field public final d:Lll2;

.field public final e:Lga4;


# direct methods
.method public constructor <init>(Lba4;Lph2;Lll2;Lqm2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lnk2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnk2;->b:Lga4;

    iput-object p2, p0, Lnk2;->c:Lga4;

    iput-object p3, p0, Lnk2;->d:Lll2;

    iput-object p4, p0, Lnk2;->e:Lga4;

    return-void
.end method

.method public constructor <init>(Lp21;Lba4;Lph2;Lll2;Lqm2;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lnk2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnk2;->b:Lga4;

    iput-object p3, p0, Lnk2;->c:Lga4;

    iput-object p4, p0, Lnk2;->d:Lll2;

    iput-object p5, p0, Lnk2;->e:Lga4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lnk2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnk2;->b:Lga4;

    .line 7
    .line 8
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Landroid/content/Context;

    .line 14
    .line 15
    iget-object v0, p0, Lnk2;->c:Lga4;

    .line 16
    .line 17
    check-cast v0, Lph2;

    .line 18
    .line 19
    invoke-virtual {v0}, Lph2;->a()Le51;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v0, p0, Lnk2;->d:Lll2;

    .line 24
    .line 25
    invoke-virtual {v0}, Lll2;->a()La83;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget-object v0, p0, Lnk2;->e:Lga4;

    .line 30
    .line 31
    check-cast v0, Lqm2;

    .line 32
    .line 33
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    new-instance v0, Lup2;

    .line 38
    .line 39
    new-instance v1, Llk2;

    .line 40
    .line 41
    const/4 v6, 0x1

    .line 42
    invoke-direct/range {v1 .. v6}, Llk2;-><init>(Landroid/content/Context;Le51;La83;Ll83;I)V

    .line 43
    .line 44
    .line 45
    sget-object v2, Lmd2;->g:Lld2;

    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_0
    iget-object v0, p0, Lnk2;->b:Lga4;

    .line 52
    .line 53
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v2, v0

    .line 58
    check-cast v2, Landroid/content/Context;

    .line 59
    .line 60
    iget-object v0, p0, Lnk2;->c:Lga4;

    .line 61
    .line 62
    check-cast v0, Lph2;

    .line 63
    .line 64
    invoke-virtual {v0}, Lph2;->a()Le51;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v0, p0, Lnk2;->d:Lll2;

    .line 69
    .line 70
    invoke-virtual {v0}, Lll2;->a()La83;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iget-object v0, p0, Lnk2;->e:Lga4;

    .line 75
    .line 76
    check-cast v0, Lqm2;

    .line 77
    .line 78
    invoke-virtual {v0}, Lqm2;->a()Ll83;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    new-instance v0, Lup2;

    .line 83
    .line 84
    new-instance v1, Llk2;

    .line 85
    .line 86
    const/4 v6, 0x0

    .line 87
    invoke-direct/range {v1 .. v6}, Llk2;-><init>(Landroid/content/Context;Le51;La83;Ll83;I)V

    .line 88
    .line 89
    .line 90
    sget-object v2, Lmd2;->g:Lld2;

    .line 91
    .line 92
    invoke-direct {v0, v1, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
