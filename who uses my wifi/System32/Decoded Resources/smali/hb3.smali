.class public final Lhb3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lnh2;

.field public final d:Lhh2;

.field public final e:Lba4;


# direct methods
.method public synthetic constructor <init>(Lba4;Lnh2;Lhh2;Lba4;I)V
    .locals 0

    .line 1
    iput p5, p0, Lhb3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lhb3;->b:Lba4;

    .line 4
    .line 5
    iput-object p2, p0, Lhb3;->c:Lnh2;

    .line 6
    .line 7
    iput-object p3, p0, Lhb3;->d:Lhh2;

    .line 8
    .line 9
    iput-object p4, p0, Lhb3;->e:Lba4;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lhb3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb3;->b:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lub3;

    .line 13
    .line 14
    iget-object v1, p0, Lhb3;->c:Lnh2;

    .line 15
    .line 16
    invoke-virtual {v1}, Lnh2;->a()Lsq0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lhb3;->d:Lhh2;

    .line 21
    .line 22
    invoke-virtual {v2}, Lhh2;->a()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v3, p0, Lhb3;->e:Lba4;

    .line 27
    .line 28
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lym;

    .line 33
    .line 34
    new-instance v4, Lnb3;

    .line 35
    .line 36
    invoke-direct {v4, v0, v1, v2, v3}, Lnb3;-><init>(Lub3;Lsq0;Landroid/content/Context;Lym;)V

    .line 37
    .line 38
    .line 39
    return-object v4

    .line 40
    :pswitch_0
    iget-object v0, p0, Lhb3;->b:Lba4;

    .line 41
    .line 42
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lub3;

    .line 47
    .line 48
    iget-object v1, p0, Lhb3;->c:Lnh2;

    .line 49
    .line 50
    invoke-virtual {v1}, Lnh2;->a()Lsq0;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, p0, Lhb3;->d:Lhh2;

    .line 55
    .line 56
    invoke-virtual {v2}, Lhh2;->a()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v3, p0, Lhb3;->e:Lba4;

    .line 61
    .line 62
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lym;

    .line 67
    .line 68
    new-instance v4, Lgb3;

    .line 69
    .line 70
    invoke-direct {v4, v0, v1, v2, v3}, Lgb3;-><init>(Lub3;Lsq0;Landroid/content/Context;Lym;)V

    .line 71
    .line 72
    .line 73
    return-object v4

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
