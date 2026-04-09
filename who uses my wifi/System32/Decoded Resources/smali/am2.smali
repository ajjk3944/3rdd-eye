.class public final Lam2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljo2;
.implements Ldq2;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Ll83;

.field public final h:Le51;

.field public final i:Lra4;

.field public final j:Lmw2;

.field public final k:Lea3;

.field public final l:Lzw2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll83;Le51;Lra4;Lmw2;Lea3;Lzw2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lam2;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lam2;->g:Ll83;

    .line 7
    .line 8
    iput-object p3, p0, Lam2;->h:Le51;

    .line 9
    .line 10
    iput-object p4, p0, Lam2;->i:Lra4;

    .line 11
    .line 12
    iput-object p5, p0, Lam2;->j:Lmw2;

    .line 13
    .line 14
    iput-object p6, p0, Lam2;->k:Lea3;

    .line 15
    .line 16
    iput-object p7, p0, Lam2;->l:Lzw2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final B(Lh83;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final G0(Lfa2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lam2;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final a(Ll22;)V
    .locals 1

    .line 1
    sget-object p1, Lmz1;->t4:Liz1;

    .line 2
    .line 3
    sget-object v0, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v0, v0, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lam2;->b()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 13

    .line 1
    sget-object v0, Lmz1;->s4:Liz1;

    .line 2
    .line 3
    sget-object v1, Ltw1;->e:Ltw1;

    .line 4
    .line 5
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lam2;->g:Ll83;

    .line 20
    .line 21
    iget-object v7, v0, Ll83;->g:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p0, Lam2;->i:Lra4;

    .line 24
    .line 25
    invoke-virtual {v0}, Lra4;->m()Led2;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    sget-object v0, Lhg4;->C:Lhg4;

    .line 30
    .line 31
    iget-object v1, v0, Lhg4;->l:Lue;

    .line 32
    .line 33
    iget-object v0, p0, Lam2;->l:Lzw2;

    .line 34
    .line 35
    invoke-virtual {v0}, Lzw2;->f()Z

    .line 36
    .line 37
    .line 38
    move-result v12

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v0, v5, Led2;->d:Ljava/lang/String;

    .line 45
    .line 46
    :goto_0
    move-object v6, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    iget-object v2, p0, Lam2;->f:Landroid/content/Context;

    .line 53
    .line 54
    iget-object v3, p0, Lam2;->h:Le51;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    iget-object v9, p0, Lam2;->k:Lea3;

    .line 59
    .line 60
    invoke-virtual/range {v1 .. v12}, Lue;->F(Landroid/content/Context;Le51;ZLed2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;Lea3;Lmv2;Ljava/lang/Long;Z)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object v0, p0, Lam2;->j:Lmw2;

    .line 64
    .line 65
    invoke-virtual {v0}, Lmw2;->a()V

    .line 66
    .line 67
    .line 68
    return-void
.end method
