.class final Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->b(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/settings/preferences/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/settings/preferences/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA9/i;LT/l;I)V
    .locals 9

    const-string v0, "$this$UiSettingsCard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:58)"

    const v1, 0x265f3dc3

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x3

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p3, v0}, Landroidx/compose/animation/f;->b(Landroidx/compose/ui/e;Lr/H;Lmh/p;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/settings/preferences/a;->u0()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v0, p2, p3, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v3, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-virtual {v3}, Lcom/ui/wifiman/ui/settings/preferences/a;->t0()LLi/N;

    move-result-object v3

    invoke-static {v3, v0, p2, p3, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p3

    invoke-interface {p3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget-object p3, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    const v0, 0x59d2183

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_2

    :cond_1
    new-instance v2, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a$a;

    invoke-direct {v2, p3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v4, v2

    check-cast v4, Lmh/l;

    iget-object p3, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    const v0, 0x59d2b7b

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_4

    :cond_3
    new-instance v2, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a$b;

    invoke-direct {v2, p3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lth/g;

    invoke-interface {p2}, LT/l;->J()V

    move-object v5, v2

    check-cast v5, Lmh/l;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v2, p1

    move-object v6, p2

    invoke-static/range {v1 .. v8}, LK9/g;->h(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a;->a(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
