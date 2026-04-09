.class final Lcom/ui/wifiman/ui/settings/preferences/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/c$a;->a(Lz/N;LT/l;I)V
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

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LT/z1;)Z
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->e(LT/z1;)Z

    move-result p0

    return p0
.end method

.method private static final c(LT/z1;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final e(LT/z1;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v14, p2

    const-string v2, "$this$UiSettings"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    move v15, v2

    goto :goto_1

    :cond_1
    move/from16 v15, p3

    :goto_1
    and-int/lit8 v2, v15, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous> (AppPreferencesUi.kt:57)"

    const v4, -0x328259c5

    invoke-static {v4, v15, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    new-instance v2, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a;

    iget-object v3, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$a;-><init>(Lcom/ui/wifiman/ui/settings/preferences/a;)V

    const v3, 0x265f3dc3

    const/4 v13, 0x1

    const/16 v12, 0x36

    invoke-static {v3, v13, v2, v14, v12}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const/high16 v16, 0x6000000

    const/16 v17, 0xff

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v11, p2

    move/from16 v12, v16

    move v1, v13

    move/from16 v13, v17

    invoke-static/range {v2 .. v13}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v2, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b;

    iget-object v3, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$b;-><init>(Lcom/ui/wifiman/ui/settings/preferences/a;)V

    const v3, -0x66199ed4

    const/16 v13, 0x36

    invoke-static {v3, v1, v2, v14, v13}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const/high16 v12, 0x6000000

    const/16 v16, 0xff

    const/4 v2, 0x0

    const/4 v3, 0x0

    move/from16 p3, v15

    move v15, v13

    move/from16 v13, v16

    invoke-static/range {v2 .. v13}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v2, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;

    iget-object v3, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-direct {v2, v3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$c;-><init>(Lcom/ui/wifiman/ui/settings/preferences/a;)V

    const v3, 0x5c16db4b

    invoke-static {v3, v1, v2, v14, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const/16 v13, 0xff

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v13}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    iget-object v2, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/settings/preferences/a;->p0()LLi/N;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v2, v3, v14, v4, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    iget-object v5, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-virtual {v5}, Lcom/ui/wifiman/ui/settings/preferences/a;->q0()LLi/N;

    move-result-object v5

    invoke-static {v5, v3, v14, v4, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-static {v2}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->c(LT/z1;)Z

    move-result v2

    new-instance v4, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d;

    iget-object v5, v0, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/a;

    invoke-direct {v4, v5, v3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a$d;-><init>(Lcom/ui/wifiman/ui/settings/preferences/a;LT/z1;)V

    const v3, -0x40ee099d

    invoke-static {v3, v1, v4, v14, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    and-int/lit8 v1, p3, 0xe

    const/high16 v3, 0x180000

    or-int v9, v1, v3

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/c$a$a;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
