.class abstract synthetic Lc2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/lifecycle/S;Lth/d;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;)Landroidx/lifecycle/N;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    sget-object v0, Landroidx/lifecycle/P;->b:Landroidx/lifecycle/P$b;

    invoke-interface {p0}, Landroidx/lifecycle/S;->o()Landroidx/lifecycle/Q;

    move-result-object p0

    invoke-virtual {v0, p0, p3, p4}, Landroidx/lifecycle/P$b;->a(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)Landroidx/lifecycle/P;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of p3, p0, Landroidx/lifecycle/i;

    if-eqz p3, :cond_1

    sget-object p3, Landroidx/lifecycle/P;->b:Landroidx/lifecycle/P$b;

    invoke-interface {p0}, Landroidx/lifecycle/S;->o()Landroidx/lifecycle/Q;

    move-result-object v0

    check-cast p0, Landroidx/lifecycle/i;

    invoke-interface {p0}, Landroidx/lifecycle/i;->g()Landroidx/lifecycle/P$c;

    move-result-object p0

    invoke-virtual {p3, v0, p0, p4}, Landroidx/lifecycle/P$b;->a(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)Landroidx/lifecycle/P;

    move-result-object p0

    goto :goto_0

    :cond_1
    sget-object v0, Landroidx/lifecycle/P;->b:Landroidx/lifecycle/P$b;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/P$b;->c(Landroidx/lifecycle/P$b;Landroidx/lifecycle/S;Landroidx/lifecycle/P$c;Lb2/a;ILjava/lang/Object;)Landroidx/lifecycle/P;

    move-result-object p0

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/P;->c(Ljava/lang/String;Lth/d;)Landroidx/lifecycle/N;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/lifecycle/P;->d(Lth/d;)Landroidx/lifecycle/N;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public static final b(Lth/d;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;
    .locals 3

    const-string v0, "modelClass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x63c16600

    invoke-interface {p5, v0}, LT/l;->e(I)V

    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_1

    sget-object p1, Lc2/a;->a:Lc2/a;

    const/4 v1, 0x6

    invoke-virtual {p1, p5, v1}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    and-int/lit8 v1, p7, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object p2, v2

    :cond_2
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_3

    move-object p3, v2

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_5

    instance-of p4, p1, Landroidx/lifecycle/i;

    if-eqz p4, :cond_4

    move-object p4, p1

    check-cast p4, Landroidx/lifecycle/i;

    invoke-interface {p4}, Landroidx/lifecycle/i;->h()Lb2/a;

    move-result-object p4

    goto :goto_1

    :cond_4
    sget-object p4, Lb2/a$a;->b:Lb2/a$a;

    :cond_5
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p7

    if-eqz p7, :cond_6

    const/4 p7, -0x1

    const-string v1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)"

    invoke-static {v0, p6, p7, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-static {p1, p0, p2, p3, p4}, Lc2/c;->a(Landroidx/lifecycle/S;Lth/d;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;)Landroidx/lifecycle/N;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    invoke-interface {p5}, LT/l;->P()V

    return-object p0
.end method
