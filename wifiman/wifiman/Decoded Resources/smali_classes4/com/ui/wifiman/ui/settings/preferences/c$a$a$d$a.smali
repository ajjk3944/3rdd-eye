.class final Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d;->a(Lq/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/settings/preferences/a;

.field final synthetic b:LT/z1;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    iput-object p2, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->b:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->c(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)LYg/J;
    .locals 0

    invoke-static {p1}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->a(LT/z1;)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/ui/settings/preferences/a;->y0(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LA9/i;LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:102)"

    const v3, -0x7f3bbe15

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget v1, Lm8/c;->a4:I

    const/4 v2, 0x0

    invoke-static {v1, v15, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->b:LT/z1;

    invoke-static {v1}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->a(LT/z1;)Z

    move-result v1

    const v4, -0x777b18a9

    invoke-interface {v15, v4}, LT/l;->U(I)V

    const/4 v4, 0x1

    if-ne v1, v4, :cond_1

    sget v1, Lm8/c;->Z3:I

    invoke-static {v1, v15, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_1
    if-nez v1, :cond_5

    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const v1, -0x777afa69

    invoke-interface {v15, v1}, LT/l;->U(I)V

    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->b:LT/z1;

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    iget-object v4, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->b:LT/z1;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_2

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v6, v1, :cond_3

    :cond_2
    new-instance v6, Lcom/ui/wifiman/ui/settings/preferences/e;

    invoke-direct {v6, v2, v4}, Lcom/ui/wifiman/ui/settings/preferences/e;-><init>(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)V

    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v11, v6

    check-cast v11, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v17, 0x0

    const/16 v18, 0x3beb

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d$a;->b(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
