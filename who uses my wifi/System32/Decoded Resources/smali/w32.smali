.class public final synthetic Lw32;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lgj2;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lgj2;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw32;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lw32;->b:Lgj2;

    .line 4
    .line 5
    iput-object p2, p0, Lw32;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 4

    .line 1
    iget v0, p0, Lw32;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lw32;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lw32;->b:Lgj2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    new-instance v0, Lfj2;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v0, v2, p1, v3}, Lfj2;-><init>(Lgj2;Ljava/lang/Throwable;I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v2, Lgj2;->e:Lpq3;

    .line 19
    .line 20
    check-cast p1, Lld2;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lld2;->a(Ljava/lang/Runnable;)Ln70;

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    sget-object v0, Lx32;->a:Lo32;

    .line 33
    .line 34
    sget-object v0, Lmz1;->Pa:Liz1;

    .line 35
    .line 36
    sget-object v3, Ltw1;->e:Ltw1;

    .line 37
    .line 38
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 39
    .line 40
    invoke-virtual {v3, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-static {v1}, Lgj2;->b(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    sget-object v0, Lsv1;->f:Lsv1;

    .line 61
    .line 62
    iget-object v0, v0, Lsv1;->e:Ljava/util/Random;

    .line 63
    .line 64
    invoke-virtual {v2, p1, v0}, Lgj2;->a(Ljava/lang/String;Ljava/util/Random;)Ln70;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_0
    return-object p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
