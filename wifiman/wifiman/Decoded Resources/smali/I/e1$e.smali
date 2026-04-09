.class final LI/e1$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;->q(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;


# direct methods
.method constructor <init>(LI/e1;)V
    .locals 0

    iput-object p1, p0, LI/e1$e;->a:LI/e1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IIZ)Ljava/lang/Boolean;
    .locals 4

    if-eqz p3, :cond_0

    iget-object v0, p0, LI/e1$e;->a:LI/e1;

    invoke-virtual {v0}, LI/e1;->f3()LI/o1;

    move-result-object v0

    invoke-virtual {v0}, LI/o1;->k()LH/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LI/e1$e;->a:LI/e1;

    invoke-virtual {v0}, LI/e1;->f3()LI/o1;

    move-result-object v0

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v1

    iget-object v3, p0, LI/e1$e;->a:LI/e1;

    invoke-virtual {v3}, LI/e1;->Y2()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ltz v3, :cond_6

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v0}, LH/h;->length()I

    move-result v0

    if-le v3, v0, :cond_1

    goto :goto_4

    :cond_1
    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v0

    if-ne p1, v0, :cond_2

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v0

    if-ne p2, v0, :cond_2

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_2
    invoke-static {p1, p2}, LL0/T;->b(II)J

    move-result-wide v0

    if-nez p3, :cond_4

    if-ne p1, p2, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, LI/e1$e;->a:LI/e1;

    invoke-virtual {p1}, LI/e1;->e3()LJ/j;

    move-result-object p1

    sget-object p2, LJ/n;->Selection:LJ/n;

    invoke-virtual {p1, p2}, LJ/j;->I0(LJ/n;)V

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, LI/e1$e;->a:LI/e1;

    invoke-virtual {p1}, LI/e1;->e3()LJ/j;

    move-result-object p1

    sget-object p2, LJ/n;->None:LJ/n;

    invoke-virtual {p1, p2}, LJ/j;->I0(LJ/n;)V

    :goto_2
    if-eqz p3, :cond_5

    iget-object p1, p0, LI/e1$e;->a:LI/e1;

    invoke-virtual {p1}, LI/e1;->f3()LI/o1;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, LI/o1;->z(J)V

    goto :goto_3

    :cond_5
    iget-object p1, p0, LI/e1$e;->a:LI/e1;

    invoke-virtual {p1}, LI/e1;->f3()LI/o1;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, LI/o1;->y(J)V

    :goto_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_6
    :goto_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

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

    invoke-virtual {p0, p1, p2, p3}, LI/e1$e;->a(IIZ)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
