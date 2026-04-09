.class final LF/m$n$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$n;->a(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LR0/H;

.field final synthetic b:Z

.field final synthetic c:LR0/Q;

.field final synthetic d:LM/G;

.field final synthetic e:LF/E;


# direct methods
.method constructor <init>(LR0/H;ZLR0/Q;LM/G;LF/E;)V
    .locals 0

    iput-object p1, p0, LF/m$n$e;->a:LR0/H;

    iput-boolean p2, p0, LF/m$n$e;->b:Z

    iput-object p3, p0, LF/m$n$e;->c:LR0/Q;

    iput-object p4, p0, LF/m$n$e;->d:LM/G;

    iput-object p5, p0, LF/m$n$e;->e:LF/E;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IIZ)Ljava/lang/Boolean;
    .locals 9

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF/m$n$e;->a:LR0/H;

    invoke-interface {v0, p1}, LR0/H;->a(I)I

    move-result p1

    :goto_0
    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, LF/m$n$e;->a:LR0/H;

    invoke-interface {v0, p2}, LR0/H;->a(I)I

    move-result p2

    :goto_1
    iget-boolean v0, p0, LF/m$n$e;->b:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    iget-object v0, p0, LF/m$n$e;->c:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result v0

    if-ne p1, v0, :cond_3

    iget-object v0, p0, LF/m$n$e;->c:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result v0

    if-ne p2, v0, :cond_3

    goto :goto_4

    :cond_3
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ltz v0, :cond_6

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v2, p0, LF/m$n$e;->c:LR0/Q;

    invoke-virtual {v2}, LR0/Q;->f()LL0/d;

    move-result-object v2

    invoke-virtual {v2}, LL0/d;->length()I

    move-result v2

    if-gt v0, v2, :cond_6

    const/4 v0, 0x1

    if-nez p3, :cond_5

    if-ne p1, p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p3, p0, LF/m$n$e;->d:LM/G;

    const/4 v2, 0x0

    invoke-static {p3, v1, v0, v2}, LM/G;->w(LM/G;ZILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    :goto_2
    iget-object p3, p0, LF/m$n$e;->d:LM/G;

    invoke-virtual {p3}, LM/G;->x()V

    :goto_3
    iget-object p3, p0, LF/m$n$e;->e:LF/E;

    invoke-virtual {p3}, LF/E;->m()Lmh/l;

    move-result-object p3

    new-instance v8, LR0/Q;

    iget-object v1, p0, LF/m$n$e;->c:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->f()LL0/d;

    move-result-object v2

    invoke-static {p1, p2}, LL0/T;->b(II)J

    move-result-wide v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LR0/Q;-><init>(LL0/d;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p3, v8}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v0

    goto :goto_4

    :cond_6
    iget-object p1, p0, LF/m$n$e;->d:LM/G;

    invoke-virtual {p1}, LM/G;->x()V

    :goto_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF/m$n$e;->a(IIZ)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
