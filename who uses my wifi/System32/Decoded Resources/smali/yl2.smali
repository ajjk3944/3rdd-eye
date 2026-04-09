.class public final Lyl2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lhh2;

.field public final c:Lph2;

.field public final d:Lba4;


# direct methods
.method public constructor <init>(Lhh2;Lba4;Lph2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyl2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyl2;->b:Lhh2;

    iput-object p2, p0, Lyl2;->d:Lba4;

    iput-object p3, p0, Lyl2;->c:Lph2;

    return-void
.end method

.method public constructor <init>(Lhh2;Lph2;Lba4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyl2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyl2;->b:Lhh2;

    iput-object p2, p0, Lyl2;->c:Lph2;

    iput-object p3, p0, Lyl2;->d:Lba4;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lyl2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyl2;->b:Lhh2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lyl2;->c:Lph2;

    .line 13
    .line 14
    invoke-virtual {v1}, Lph2;->a()Le51;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lyl2;->d:Lba4;

    .line 19
    .line 20
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lea3;

    .line 25
    .line 26
    new-instance v3, Lp21;

    .line 27
    .line 28
    const/16 v4, 0xb

    .line 29
    .line 30
    invoke-direct {v3, v4}, Lp21;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v0, v1, v2}, Lp21;->C(Landroid/content/Context;Le51;Lea3;)Li62;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    iget-object v0, p0, Lyl2;->b:Lhh2;

    .line 42
    .line 43
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, p0, Lyl2;->d:Lba4;

    .line 48
    .line 49
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lea3;

    .line 54
    .line 55
    iget-object v2, p0, Lyl2;->c:Lph2;

    .line 56
    .line 57
    invoke-virtual {v2}, Lph2;->a()Le51;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    sget-object v3, Lmd2;->a:Lld2;

    .line 62
    .line 63
    invoke-static {v3}, Li41;->M(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v4, Lvl2;

    .line 67
    .line 68
    invoke-direct {v4, v0, v1, v2, v3}, Lvl2;-><init>(Landroid/content/Context;Lea3;Le51;Lld2;)V

    .line 69
    .line 70
    .line 71
    return-object v4

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
