.class public final Lvc0;
.super Lmz0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhy;


# instance fields
.field public j:I

.field public final synthetic k:Lwc0;

.field public final synthetic l:Landroid/net/Uri;

.field public final synthetic m:Landroid/view/InputEvent;


# direct methods
.method public constructor <init>(Lwc0;Landroid/net/Uri;Landroid/view/InputEvent;Loj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvc0;->k:Lwc0;

    .line 2
    .line 3
    iput-object p2, p0, Lvc0;->l:Landroid/net/Uri;

    .line 4
    .line 5
    iput-object p3, p0, Lvc0;->m:Landroid/view/InputEvent;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lmz0;-><init>(ILoj;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqk;

    .line 2
    .line 3
    check-cast p2, Loj;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lvc0;->h(Loj;Ljava/lang/Object;)Loj;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lvc0;

    .line 10
    .line 11
    sget-object p2, Lz31;->a:Lz31;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lvc0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final h(Loj;Ljava/lang/Object;)Loj;
    .locals 3

    .line 1
    new-instance p2, Lvc0;

    .line 2
    .line 3
    iget-object v0, p0, Lvc0;->l:Landroid/net/Uri;

    .line 4
    .line 5
    iget-object v1, p0, Lvc0;->m:Landroid/view/InputEvent;

    .line 6
    .line 7
    iget-object v2, p0, Lvc0;->k:Lwc0;

    .line 8
    .line 9
    invoke-direct {p2, v2, v0, v1, p1}, Lvc0;-><init>(Lwc0;Landroid/net/Uri;Landroid/view/InputEvent;Loj;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lvc0;->j:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, Lbd2;->x(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lvc0;->k:Lwc0;

    .line 24
    .line 25
    iget-object p1, p1, Lwc0;->a:Luc0;

    .line 26
    .line 27
    iput v1, p0, Lvc0;->j:I

    .line 28
    .line 29
    iget-object v0, p0, Lvc0;->l:Landroid/net/Uri;

    .line 30
    .line 31
    iget-object v1, p0, Lvc0;->m:Landroid/view/InputEvent;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1, p0}, Luc0;->c(Landroid/net/Uri;Landroid/view/InputEvent;Loj;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Lrk;->f:Lrk;

    .line 38
    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    sget-object p1, Lz31;->a:Lz31;

    .line 43
    .line 44
    return-object p1
.end method
