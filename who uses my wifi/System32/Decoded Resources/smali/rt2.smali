.class public final Lrt2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lll2;

.field public final c:Lu43;

.field public final d:Lu12;


# direct methods
.method public synthetic constructor <init>(Lll2;Lu43;Lu12;I)V
    .locals 0

    .line 1
    iput p4, p0, Lrt2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lrt2;->b:Lll2;

    .line 4
    .line 5
    iput-object p2, p0, Lrt2;->c:Lu43;

    .line 6
    .line 7
    iput-object p3, p0, Lrt2;->d:Lu12;

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
    .locals 4

    .line 1
    iget v0, p0, Lrt2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrt2;->b:Lll2;

    .line 7
    .line 8
    iget-object v0, v0, Lll2;->b:Lxb4;

    .line 9
    .line 10
    iget-object v0, v0, Lxb4;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p0, Lrt2;->c:Lu43;

    .line 15
    .line 16
    invoke-virtual {v1}, Lu43;->d()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lpr2;

    .line 21
    .line 22
    iget-object v2, p0, Lrt2;->d:Lu12;

    .line 23
    .line 24
    invoke-virtual {v2}, Lu12;->a()Ltr2;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Lst2;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1, v2}, Lst2;-><init>(Ljava/lang/String;Lpr2;Ltr2;)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :pswitch_0
    iget-object v0, p0, Lrt2;->b:Lll2;

    .line 35
    .line 36
    iget-object v0, v0, Lll2;->b:Lxb4;

    .line 37
    .line 38
    iget-object v0, v0, Lxb4;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p0, Lrt2;->c:Lu43;

    .line 43
    .line 44
    invoke-virtual {v1}, Lu43;->d()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lpr2;

    .line 49
    .line 50
    iget-object v2, p0, Lrt2;->d:Lu12;

    .line 51
    .line 52
    invoke-virtual {v2}, Lu12;->a()Ltr2;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Lqt2;

    .line 57
    .line 58
    invoke-direct {v3, v0, v1, v2}, Lqt2;-><init>(Ljava/lang/String;Lpr2;Ltr2;)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
