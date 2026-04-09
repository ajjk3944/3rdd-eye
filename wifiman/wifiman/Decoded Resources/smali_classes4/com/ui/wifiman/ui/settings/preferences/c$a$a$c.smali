.class final Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;
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

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/settings/preferences/a;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;->c(Lcom/ui/wifiman/ui/settings/preferences/a;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wifiman/ui/settings/preferences/a;Z)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/a;->v0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LA9/i;LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v11, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:86)"

    const v3, 0x5c16db4b

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget v1, Lm8/c;->U:I

    const/4 v2, 0x0

    invoke-static {v1, v11, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/settings/preferences/a;->o0()LLi/N;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v4, v11, v2, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/settings/preferences/a;->n0()LLi/N;

    move-result-object v1

    invoke-static {v1, v4, v11, v2, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    const v2, 0x59dd703

    invoke-interface {v11, v2}, LT/l;->U(I)V

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_2

    :cond_1
    new-instance v4, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c$a;

    invoke-direct {v4, v1}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v1, 0x59ddff0

    invoke-interface {v11, v1}, LT/l;->U(I)V

    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_4

    :cond_3
    new-instance v5, Lcom/ui/wifiman/ui/settings/preferences/d;

    invoke-direct {v5, v2}, Lcom/ui/wifiman/ui/settings/preferences/d;-><init>(Lcom/ui/wifiman/ui/settings/preferences/a;)V

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v7, v5

    check-cast v7, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v8, v4

    check-cast v8, Lmh/a;

    const/4 v12, 0x0

    const/16 v13, 0x24b

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    move v5, v6

    move-object v6, v7

    move-object v7, v10

    move-object v10, v14

    move-object/from16 v11, p2

    invoke-static/range {v1 .. v13}, LF9/u0;->c(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;Ljava/lang/String;ZLmh/l;Ls9/b;Lmh/a;ZLjava/lang/String;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;->b(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
