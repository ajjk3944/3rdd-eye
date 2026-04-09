.class public final Ldz1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lba4;

.field public final c:Lba4;

.field public final d:Lba4;


# direct methods
.method public synthetic constructor <init>(Lba4;Lba4;Lba4;I)V
    .locals 0

    .line 1
    iput p4, p0, Ldz1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldz1;->b:Lba4;

    .line 4
    .line 5
    iput-object p2, p0, Ldz1;->c:Lba4;

    .line 6
    .line 7
    iput-object p3, p0, Ldz1;->d:Lba4;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Ldz1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldz1;->b:Lba4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lv73;

    .line 13
    .line 14
    iget-object v1, p0, Ldz1;->c:Lba4;

    .line 15
    .line 16
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ls73;

    .line 21
    .line 22
    iget-object v2, p0, Ldz1;->d:Lba4;

    .line 23
    .line 24
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Li83;

    .line 29
    .line 30
    new-instance v3, Ly73;

    .line 31
    .line 32
    invoke-direct {v3, v0, v1, v2}, Ly73;-><init>(Lv73;Ls73;Li83;)V

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    :pswitch_0
    iget-object v0, p0, Ldz1;->b:Lba4;

    .line 37
    .line 38
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lei4;

    .line 43
    .line 44
    iget-object v1, p0, Ldz1;->c:Lba4;

    .line 45
    .line 46
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lq32;

    .line 51
    .line 52
    sget-object v2, Lmd2;->a:Lld2;

    .line 53
    .line 54
    invoke-static {v2}, Li41;->M(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, Ldz1;->d:Lba4;

    .line 58
    .line 59
    invoke-virtual {v3}, Lba4;->d()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    const/4 v4, 0x2

    .line 70
    if-ne v3, v4, :cond_0

    .line 71
    .line 72
    move-object v0, v1

    .line 73
    :cond_0
    new-instance v1, Lup2;

    .line 74
    .line 75
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
