.class public abstract LT0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT0/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT0/c$a;

    invoke-direct {v0}, LT0/c$a;-><init>()V

    sput-object v0, LT0/c;->a:LT0/c$a;

    return-void
.end method

.method public static final a(Ljava/lang/String;FLL0/U;Ljava/util/List;Ljava/util/List;LY0/d;Lmh/r;Z)Ljava/lang/CharSequence;
    .locals 8

    const/4 v0, 0x0

    if-eqz p7, :cond_2

    invoke-static {}, Landroidx/emoji2/text/f;->k()Z

    move-result p7

    if-eqz p7, :cond_2

    invoke-virtual {p2}, LL0/U;->w()LL0/B;

    move-result-object p7

    if-eqz p7, :cond_0

    invoke-virtual {p7}, LL0/B;->a()LL0/z;

    move-result-object p7

    if-eqz p7, :cond_0

    invoke-virtual {p7}, LL0/z;->b()I

    move-result p7

    invoke-static {p7}, LL0/h;->d(I)LL0/h;

    move-result-object p7

    goto :goto_0

    :cond_0
    const/4 p7, 0x0

    :goto_0
    sget-object v1, LL0/h;->b:LL0/h$a;

    invoke-virtual {v1}, LL0/h$a;->a()I

    move-result v1

    if-nez p7, :cond_1

    move v6, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p7}, LL0/h;->j()I

    move-result p7

    invoke-static {p7, v1}, LL0/h;->g(II)Z

    move-result p7

    move v6, p7

    :goto_1
    invoke-static {}, Landroidx/emoji2/text/f;->c()Landroidx/emoji2/text/f;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const v5, 0x7fffffff

    const/4 v3, 0x0

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Landroidx/emoji2/text/f;->u(Ljava/lang/CharSequence;IIII)Ljava/lang/CharSequence;

    move-result-object p7

    invoke-static {p7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    move-object p7, p0

    :goto_2
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p2}, LL0/U;->D()LW0/q;

    move-result-object v1

    sget-object v2, LW0/q;->c:LW0/q$a;

    invoke-virtual {v2}, LW0/q$a;->a()LW0/q;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p2}, LL0/U;->s()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/w;->h(J)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object p7

    :cond_3
    instance-of v1, p7, Landroid/text/Spannable;

    if-eqz v1, :cond_4

    check-cast p7, Landroid/text/Spannable;

    goto :goto_3

    :cond_4
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, p7}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p7, v1

    :goto_3
    invoke-virtual {p2}, LL0/U;->A()LW0/k;

    move-result-object v1

    sget-object v2, LW0/k;->b:LW0/k$a;

    invoke-virtual {v2}, LW0/k$a;->d()LW0/k;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, LT0/c;->a:LT0/c$a;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-static {p7, v1, v0, p0}, LU0/c;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_5
    invoke-static {p2}, LT0/c;->b(LL0/U;)Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-virtual {p2}, LL0/U;->t()LW0/h;

    move-result-object p0

    if-nez p0, :cond_6

    invoke-virtual {p2}, LL0/U;->s()J

    move-result-wide v0

    invoke-static {p7, v0, v1, p1, p5}, LU0/c;->r(Landroid/text/Spannable;JFLY0/d;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p2}, LL0/U;->t()LW0/h;

    move-result-object p0

    if-nez p0, :cond_7

    sget-object p0, LW0/h;->c:LW0/h$b;

    invoke-virtual {p0}, LW0/h$b;->a()LW0/h;

    move-result-object p0

    :cond_7
    move-object v7, p0

    invoke-virtual {p2}, LL0/U;->s()J

    move-result-wide v3

    move-object v2, p7

    move v5, p1

    move-object v6, p5

    invoke-static/range {v2 .. v7}, LU0/c;->q(Landroid/text/Spannable;JFLY0/d;LW0/h;)V

    :goto_4
    invoke-virtual {p2}, LL0/U;->D()LW0/q;

    move-result-object p0

    invoke-static {p7, p0, p1, p5}, LU0/c;->y(Landroid/text/Spannable;LW0/q;FLY0/d;)V

    invoke-static {p7, p2, p3, p5, p6}, LU0/c;->w(Landroid/text/Spannable;LL0/U;Ljava/util/List;LY0/d;Lmh/r;)V

    invoke-static {p7, p4, p5}, LU0/b;->d(Landroid/text/Spannable;Ljava/util/List;LY0/d;)V

    return-object p7
.end method

.method public static final b(LL0/U;)Z
    .locals 0

    invoke-virtual {p0}, LL0/U;->w()LL0/B;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LL0/B;->a()LL0/z;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LL0/z;->c()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
