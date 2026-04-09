.class final LM8/b$r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b$r;->b(Ll9/a;Lmd/a;Ll9/a;Ll9/a;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lle/i;


# direct methods
.method constructor <init>(Lle/i;)V
    .locals 0

    iput-object p1, p0, LM8/b$r$c;->a:Lle/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 5

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6400cafc

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ubnt.usurvey.ui.wifi.WifiAccessPointDetailVM.infoKeyVal.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailVM.kt:354)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {p3}, Lle/i;->f()LS8/e;

    move-result-object p3

    invoke-virtual {p3}, LS8/e;->a()LS8/c;

    move-result-object p3

    sget-object v0, LS8/c;->GHZ_2_4:LS8/c;

    const/4 v1, 0x3

    const v2, 0x7f1103e4

    const-string/jumbo v3, "format(...)"

    const-string/jumbo v4, "getString(...)"

    if-ne p3, v0, :cond_1

    iget-object p3, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {p3}, Lle/i;->f()LS8/e;

    move-result-object p3

    invoke-virtual {p3}, LS8/e;->e()LS8/e$b;

    move-result-object p3

    instance-of p3, p3, LS8/e$b$a;

    if-eqz p3, :cond_1

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {p3}, Lle/i;->f()LS8/e;

    move-result-object p3

    invoke-virtual {p3}, LS8/e;->d()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget-object v0, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->e()LS8/e$b;

    move-result-object v0

    invoke-virtual {v0}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {v2}, Lle/i;->f()LS8/e;

    move-result-object v2

    invoke-virtual {v2}, LS8/e;->e()LS8/e$b;

    move-result-object v2

    invoke-virtual {v2}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsh/i;

    invoke-virtual {v2}, Lsh/g;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {p3, v0, v2}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1
    iget-object p3, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {p3}, Lle/i;->f()LS8/e;

    move-result-object p3

    invoke-virtual {p3}, LS8/e;->e()LS8/e$b;

    move-result-object p3

    instance-of v0, p3, LS8/e$b$b;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {p3}, Lle/i;->f()LS8/e;

    move-result-object p3

    invoke-virtual {p3}, LS8/e;->d()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget-object v0, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->e()LS8/e$b;

    move-result-object v0

    invoke-virtual {v0}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {v2}, Lle/i;->f()LS8/e;

    move-result-object v2

    invoke-virtual {v2}, LS8/e;->e()LS8/e$b;

    move-result-object v2

    invoke-virtual {v2}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsh/i;

    invoke-virtual {v2}, Lsh/g;->j()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {p3, v0, v2}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2
    instance-of p3, p3, LS8/e$b$a;

    if-eqz p3, :cond_4

    const p3, 0x7f1103e5

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {p3}, Lle/i;->f()LS8/e;

    move-result-object p3

    invoke-virtual {p3}, LS8/e;->d()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iget-object v0, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->e()LS8/e$b;

    move-result-object v0

    invoke-virtual {v0}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {v1}, Lle/i;->f()LS8/e;

    move-result-object v1

    invoke-virtual {v1}, LS8/e;->e()LS8/e$b;

    move-result-object v1

    invoke-virtual {v1}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsh/i;

    invoke-virtual {v1}, Lsh/g;->j()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {v2}, Lle/i;->f()LS8/e;

    move-result-object v2

    invoke-virtual {v2}, LS8/e;->e()LS8/e$b;

    move-result-object v2

    invoke-virtual {v2}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsh/i;

    invoke-virtual {v2}, Lsh/g;->i()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v4, p0, LM8/b$r$c;->a:Lle/i;

    invoke-virtual {v4}, Lle/i;->f()LS8/e;

    move-result-object v4

    invoke-virtual {v4}, LS8/e;->e()LS8/e$b;

    move-result-object v4

    invoke-virtual {v4}, LS8/e$b;->b()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsh/i;

    invoke-virtual {v4}, Lsh/g;->j()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {p3, v0, v1, v2, v4}, [Ljava/lang/Object;

    move-result-object p3

    const/4 v0, 0x5

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LM8/b$r$c;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
