.class public final synthetic Lsj3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lgk3;


# direct methods
.method public synthetic constructor <init>(Lgk3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsj3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsj3;->b:Lgk3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lsj3;->a:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lsj3;->b:Lgk3;

    .line 9
    .line 10
    const/16 v1, 0x4f54

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Lgk3;->c(ILjava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Ljh3;->E()Ljh3;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :pswitch_0
    iget-object v0, p0, Lsj3;->b:Lgk3;

    .line 21
    .line 22
    const/16 v1, 0x4f55

    .line 23
    .line 24
    invoke-virtual {v0, v1, p1}, Lgk3;->c(ILjava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    new-array p1, p1, [B

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_1
    iget-object v0, p0, Lsj3;->b:Lgk3;

    .line 32
    .line 33
    const/16 v1, 0x4f56

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, Lgk3;->c(ILjava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    new-array p1, p1, [B

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_2
    iget-object v0, p0, Lsj3;->b:Lgk3;

    .line 43
    .line 44
    const/16 v1, 0x3bcc

    .line 45
    .line 46
    invoke-virtual {v0, v1, p1}, Lgk3;->c(ILjava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Ljh3;->E()Ljh3;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :pswitch_3
    iget-object v0, p0, Lsj3;->b:Lgk3;

    .line 55
    .line 56
    const/16 v1, 0x3bcd

    .line 57
    .line 58
    invoke-virtual {v0, v1, p1}, Lgk3;->c(ILjava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    new-array p1, p1, [B

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_4
    iget-object v0, p0, Lsj3;->b:Lgk3;

    .line 66
    .line 67
    const/16 v1, 0x3bce

    .line 68
    .line 69
    invoke-virtual {v0, v1, p1}, Lgk3;->c(ILjava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    new-array p1, p1, [B

    .line 74
    .line 75
    return-object p1

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
