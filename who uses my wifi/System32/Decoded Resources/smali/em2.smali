.class public final Lem2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lga4;

.field public final c:Lqm2;

.field public final d:Lba4;


# direct methods
.method public constructor <init>(Lba4;Lga4;Lqm2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lem2;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lem2;->d:Lba4;

    iput-object p2, p0, Lem2;->b:Lga4;

    iput-object p3, p0, Lem2;->c:Lqm2;

    return-void
.end method

.method public constructor <init>(Lba4;Lqm2;Lba4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lem2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lem2;->b:Lga4;

    iput-object p2, p0, Lem2;->c:Lqm2;

    iput-object p3, p0, Lem2;->d:Lba4;

    return-void
.end method

.method public constructor <init>(Lqm2;Lba4;Lba4;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lem2;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lem2;->c:Lqm2;

    iput-object p2, p0, Lem2;->b:Lga4;

    iput-object p3, p0, Lem2;->d:Lba4;

    return-void
.end method


# virtual methods
.method public a()Li33;
    .locals 4

    .line 1
    sget-object v0, Lmd2;->a:Lld2;

    .line 2
    .line 3
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lem2;->c:Lqm2;

    .line 7
    .line 8
    invoke-virtual {v1}, Lqm2;->a()Ll83;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Lem2;->b:Lga4;

    .line 13
    .line 14
    invoke-interface {v2}, Lga4;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lr83;

    .line 19
    .line 20
    iget-object v2, p0, Lem2;->d:Lba4;

    .line 21
    .line 22
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    new-instance v3, Li33;

    .line 33
    .line 34
    invoke-direct {v3, v0, v1, v2}, Li33;-><init>(Lpq3;Ll83;I)V

    .line 35
    .line 36
    .line 37
    return-object v3
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lem2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lem2;->a()Li33;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lem2;->b:Lga4;

    .line 12
    .line 13
    invoke-interface {v0}, Lga4;->d()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lzw2;

    .line 18
    .line 19
    iget-object v1, p0, Lem2;->c:Lqm2;

    .line 20
    .line 21
    invoke-virtual {v1}, Lqm2;->a()Ll83;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lem2;->d:Lba4;

    .line 26
    .line 27
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    new-instance v3, Lrw2;

    .line 34
    .line 35
    invoke-direct {v3, v0, v1, v2}, Lrw2;-><init>(Lzw2;Ll83;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v3

    .line 39
    :pswitch_1
    iget-object v0, p0, Lem2;->d:Lba4;

    .line 40
    .line 41
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroid/content/Context;

    .line 46
    .line 47
    iget-object v1, p0, Lem2;->b:Lga4;

    .line 48
    .line 49
    check-cast v1, Lph2;

    .line 50
    .line 51
    invoke-virtual {v1}, Lph2;->a()Le51;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v2, p0, Lem2;->c:Lqm2;

    .line 56
    .line 57
    invoke-virtual {v2}, Lqm2;->a()Ll83;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v3, Ldm2;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-direct {v3, v0, v1, v2, v4}, Ldm2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    return-object v3

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
