.class final Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b;
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b$c;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/settings/preferences/a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/settings/preferences/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA9/i;LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:68)"

    const v3, -0x66199ed4

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v1, 0x59d396b

    invoke-interface {v15, v1}, LT/l;->U(I)V

    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/settings/preferences/a;->s0()LLi/N;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v3, 0x0

    const/4 v14, 0x1

    invoke-static {v1, v5, v15, v3, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    sget v1, Lm8/c;->v:I

    invoke-static {v1, v15, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v19

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getDisplayName()Ljava/lang/String;

    move-result-object v20

    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    const v2, 0x59d5d3a

    invoke-interface {v15, v2}, LT/l;->U(I)V

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_2

    :cond_1
    new-instance v4, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b$a;

    invoke-direct {v4, v1}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v11, v4

    check-cast v11, Lmh/a;

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

    const/16 v16, 0x0

    move-object/from16 v14, v16

    const/16 v16, 0x0

    move-object/from16 v3, v19

    move-object/from16 v5, v20

    move-object v0, v15

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LF9/u;->c(Landroidx/compose/ui/e;Ls9/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls9/b;LF9/r;ZLjava/lang/Boolean;Ljava/lang/String;Lmh/a;Lmh/a;FLmh/q;LT/l;III)V

    goto :goto_0

    :cond_3
    move-object v0, v15

    :goto_0
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    sget v1, Lm8/c;->s:I

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    move-object v15, v0

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/settings/preferences/a;->r0()LLi/N;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v4, v15, v2, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT7/c;

    sget-object v4, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b$c;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v4, v1

    if-eq v1, v5, :cond_5

    const/4 v4, 0x2

    if-ne v1, v4, :cond_4

    const v1, 0x59d944b

    invoke-interface {v15, v1}, LT/l;->U(I)V

    sget v1, Lm8/c;->t:I

    invoke-static {v1, v15, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_1
    move-object v5, v1

    goto :goto_2

    :cond_4
    const v1, 0x59d7960

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    const v1, 0x59d84c9

    invoke-interface {v15, v1}, LT/l;->U(I)V

    sget v1, Lm8/c;->u:I

    invoke-static {v1, v15, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    goto :goto_1

    :goto_2
    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    const v2, 0x59da39c

    invoke-interface {v15, v2}, LT/l;->U(I)V

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_6

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_7

    :cond_6
    new-instance v4, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b$b;

    invoke-direct {v4, v1}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v11, v4

    check-cast v11, Lmh/a;

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

    if-eqz v1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b;->a(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
