.class public final Laa/c$b$c$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/c$b$c;->a(LA/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LIi/N;

.field final synthetic c:Laa/d;


# direct methods
.method public constructor <init>(Ljava/util/List;LIi/N;Laa/d;)V
    .locals 0

    iput-object p1, p0, Laa/c$b$c$f;->a:Ljava/util/List;

    iput-object p2, p0, Laa/c$b$c$f;->b:LIi/N;

    iput-object p3, p0, Laa/c$b$c$f;->c:Laa/d;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/c;ILT/l;I)V
    .locals 7

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, LT/l;->i(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x93

    const/16 v0, 0x92

    if-ne p4, v0, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string/jumbo v0, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v1, -0x25b7f321

    invoke-static {v1, p1, p4, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    iget-object p1, p0, Laa/c$b$c$f;->a:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, LZ9/a;

    const p1, 0x7143c2f7

    invoke-interface {p3, p1}, LT/l;->U(I)V

    const p1, 0x5e7e1a16

    invoke-interface {p3, p1}, LT/l;->U(I)V

    iget-object p1, p0, Laa/c$b$c$f;->b:LIi/N;

    invoke-interface {p3, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    iget-object p2, p0, Laa/c$b$c$f;->c:Laa/d;

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_7

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_8

    :cond_7
    new-instance p2, Laa/c$b$c$b;

    iget-object p1, p0, Laa/c$b$c$f;->b:LIi/N;

    iget-object p4, p0, Laa/c$b$c$f;->c:Laa/d;

    invoke-direct {p2, p1, p4}, Laa/c$b$c$b;-><init>(LIi/N;Laa/d;)V

    invoke-interface {p3, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v2, p2

    check-cast v2, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v4, p3

    invoke-static/range {v0 .. v6}, LZ9/e;->d(Landroidx/compose/ui/e;ZLmh/l;LZ9/a;LT/l;II)V

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_4
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/c;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Laa/c$b$c$f;->a(LA/c;ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
