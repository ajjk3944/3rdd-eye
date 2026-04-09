.class public final Lix2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljo2;
.implements Ldq2;
.implements Lrn2;


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:Lmv2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lmv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lix2;->f:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lix2;->g:Lmv2;

    .line 7
    .line 8
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
    .locals 1

    .line 1
    sget-object p1, Lmz1;->b5:Liz1;

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
    iget-object p1, p0, Lix2;->f:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lix2;->b(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final a(Ll22;)V
    .locals 1

    .line 1
    sget-object p1, Lmz1;->c5:Liz1;

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
    iget-object p1, p0, Lix2;->f:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lix2;->b(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget-object v0, Lmz1;->Z4:Liz1;

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
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lmd2;->a:Lld2;

    .line 20
    .line 21
    new-instance v1, Ln62;

    .line 22
    .line 23
    const/16 v2, 0x19

    .line 24
    .line 25
    invoke-direct {v1, p0, p1, v2}, Ln62;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    sget-object v0, Lmz1;->d5:Liz1;

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
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lix2;->f:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lix2;->b(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method
