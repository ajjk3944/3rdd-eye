.class final LF9/k0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/k0$a;->f(Lz/Y;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;


# direct methods
.method constructor <init>(LT/q0;)V
    .locals 0

    iput-object p1, p0, LF9/k0$a$a;->a:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.settings.UiSettingsTextField.<anonymous>.<anonymous>.<anonymous> (UiSettingsTextField.kt:172)"

    const v2, 0x2c6377b0

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LF9/k0$a$a;->a:LT/q0;

    invoke-static {p2}, LF9/k0;->j(LT/q0;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, LN9/b;->a:LN9/b;

    invoke-virtual {p2}, LN9/b;->w()Ls9/b;

    move-result-object p2

    new-instance v0, Ls9/d$b;

    sget v1, Lt9/b;->c:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-virtual {p2, v0}, Ls9/b;->g(Ls9/d;)Ls9/b;

    move-result-object p2

    :goto_1
    move-object v0, p2

    goto :goto_2

    :cond_3
    sget-object p2, LN9/b;->a:LN9/b;

    invoke-virtual {p2}, LN9/b;->x()Ls9/b;

    move-result-object p2

    new-instance v0, Ls9/d$b;

    sget v1, Lt9/b;->d:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-virtual {p2, v0}, Ls9/b;->g(Ls9/d;)Ls9/b;

    move-result-object p2

    goto :goto_1

    :goto_2
    sget-object p2, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {p2, p1, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a;->a()Lma/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p2

    invoke-virtual {p2}, Lr9/a$b;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF9/k0$a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
