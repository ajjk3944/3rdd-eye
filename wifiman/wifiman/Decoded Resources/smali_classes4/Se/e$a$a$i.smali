.class final LSe/e$a$a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSe/e$a$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LSe/c;


# direct methods
.method constructor <init>(LSe/c;)V
    .locals 0

    iput-object p1, p0, LSe/e$a$a$i;->a:LSe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA9/i;LT/l;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v14, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:169)"

    const v3, -0x7adeca17

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, v0, LSe/e$a$a$i;->a:LSe/c;

    invoke-virtual {v1}, LSe/c;->q0()LLi/N;

    move-result-object v1

    const/4 v15, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x1

    invoke-static {v1, v15, v14, v13, v12}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v1, v0, LSe/e$a$a$i;->a:LSe/c;

    const v2, -0xeec5f64

    invoke-interface {v14, v2}, LT/l;->U(I)V

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, LSe/e$a$a$i$a;

    invoke-direct {v3, v1}, LSe/e$a$a$i$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v14, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v6, v3

    check-cast v6, Lmh/l;

    const/16 v16, 0x180

    const/16 v17, 0x3cb

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "Bluetoth Classic"

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v11, p2

    move/from16 v12, v16

    move/from16 v13, v17

    invoke-static/range {v1 .. v13}, LF9/u0;->c(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;Ljava/lang/String;ZLmh/l;Ls9/b;Lmh/a;ZLjava/lang/String;LT/l;II)V

    iget-object v1, v0, LSe/e$a$a$i;->a:LSe/c;

    invoke-virtual {v1}, LSe/c;->p0()LLi/N;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v15, v14, v2, v3}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v1, v0, LSe/e$a$a$i;->a:LSe/c;

    const v2, -0xeec3f88

    invoke-interface {v14, v2}, LT/l;->U(I)V

    invoke-interface {v14, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_4

    :cond_3
    new-instance v3, LSe/e$a$a$i$b;

    invoke-direct {v3, v1}, LSe/e$a$a$i$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v14, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v6, v3

    check-cast v6, Lmh/l;

    const/16 v12, 0x180

    const/16 v13, 0x3cb

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "Bluetoth LE"

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

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

    invoke-virtual {p0, p1, p2, p3}, LSe/e$a$a$i;->a(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
