.class public final synthetic Lqz2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lxb3;


# direct methods
.method public synthetic constructor <init>(Lxb3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqz2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lqz2;->g:Lxb3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lqz2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lmz1;->G5:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lm54;->f:Lkj1;

    .line 25
    .line 26
    iget-boolean v0, v0, Lkj1;->g:Z

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lqz2;->g:Lxb3;

    .line 32
    .line 33
    invoke-virtual {v0}, Lxb3;->c()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void

    .line 37
    :pswitch_0
    iget-object v0, p0, Lqz2;->g:Lxb3;

    .line 38
    .line 39
    invoke-virtual {v0}, Lxb3;->a()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
