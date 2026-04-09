.class final LSe/e$a$a$b;
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

    iput-object p1, p0, LSe/e$a$a$b;->a:LSe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/q0;LSe/c;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LSe/e$a$a$b;->e(LT/q0;LSe/c;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/z1;)Ljava/lang/String;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final e(LT/q0;LSe/c;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, LSe/c;->W0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LA9/i;LT/l;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v4, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:199)"

    const v3, 0x51214827

    move/from16 v5, p3

    invoke-static {v3, v5, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, v0, LSe/e$a$a$b;->a:LSe/c;

    invoke-virtual {v1}, LSe/c;->B0()LLi/N;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v2, v4, v3, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-static {v1}, LSe/e$a$a$b;->c(LT/z1;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, v0, LSe/e$a$a$b;->a:LSe/c;

    invoke-virtual {v1}, LSe/c;->B0()LLi/N;

    move-result-object v1

    invoke-static {v1, v2, v4, v3, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const v3, -0xeebb83c

    invoke-interface {v4, v3}, LT/l;->U(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v3, v6, :cond_2

    if-nez v1, :cond_1

    const-string v1, "1"

    :cond_1
    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v3

    invoke-interface {v4, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, LT/q0;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-interface {v3}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v23, v1

    check-cast v23, Ljava/lang/String;

    const v1, -0xeeb855b

    invoke-interface {v4, v1}, LT/l;->U(I)V

    iget-object v1, v0, LSe/e$a$a$b;->a:LSe/c;

    invoke-interface {v4, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, LSe/e$a$a$b;->a:LSe/c;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_3

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v6, v1, :cond_4

    :cond_3
    new-instance v6, LSe/f;

    invoke-direct {v6, v3, v2}, LSe/f;-><init>(LT/q0;LSe/c;)V

    invoke-interface {v4, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v5, v6

    check-cast v5, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v26, 0x0

    const v27, 0x1ff7e5

    const/4 v1, 0x0

    const-string v2, "Infinite speedtest coefficient"

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "How many times throughput on Signal -> Throughput will be faster"

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x30

    const/16 v25, 0x30

    move-object/from16 v4, v23

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v27}, LF9/k0;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Lmh/a;Ljava/lang/Boolean;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZZLm0/l0;LF/D;LF/C;Landroidx/compose/ui/focus/o;LT/l;IIII)V

    :cond_5
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LSe/e$a$a$b;->b(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
