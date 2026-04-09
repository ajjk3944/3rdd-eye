.class public final Lit1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljt1;


# direct methods
.method public synthetic constructor <init>(Ljt1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lit1;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lit1;->g:Ljt1;

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
    .locals 6

    .line 1
    iget v0, p0, Lit1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lit1;->g:Ljt1;

    .line 7
    .line 8
    iget-object v0, v0, Ljt1;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v0}, Lmz1;->a(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lit1;->g:Ljt1;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-object v1, v0, Ljt1;->f:Lk3;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-boolean v1, v0, Ljt1;->g:Z

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v1, Lk3;

    .line 28
    .line 29
    iget-object v2, v0, Ljt1;->a:Landroid/content/Context;

    .line 30
    .line 31
    const-wide/16 v3, 0x7530

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-direct {v1, v2, v3, v4, v5}, Lk3;-><init>(Landroid/content/Context;JZ)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-virtual {v1, v2}, Lk3;->d(Z)V

    .line 39
    .line 40
    .line 41
    iput-object v1, v0, Ljt1;->f:Lk3;
    :try_end_0
    .catch Lnz; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    const/4 v1, 0x0

    .line 45
    iput-object v1, v0, Ljt1;->f:Lk3;

    .line 46
    .line 47
    :cond_0
    :goto_0
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
