.class final Lpf/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpf/d$a;->a(Lpf/b$a;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lpf/b$a;

.field final synthetic b:Lmh/a;

.field final synthetic c:LIi/N;

.field final synthetic d:Lpf/b;


# direct methods
.method constructor <init>(Lpf/b$a;Lmh/a;LIi/N;Lpf/b;)V
    .locals 0

    iput-object p1, p0, Lpf/d$a$a;->a:Lpf/b$a;

    iput-object p2, p0, Lpf/d$a$a;->b:Lmh/a;

    iput-object p3, p0, Lpf/d$a$a;->c:LIi/N;

    iput-object p4, p0, Lpf/d$a$a;->d:Lpf/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;Lpf/b;Lpf/b$a;Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpf/d$a$a;->c(LIi/N;Lpf/b;Lpf/b$a;Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;Lpf/b;Lpf/b$a;Lmh/a;)LYg/J;
    .locals 6

    new-instance v3, Lpf/d$a$a$b;

    const/4 v0, 0x0

    invoke-direct {v3, p1, p2, p3, v0}, Lpf/d$a$a$b;-><init>(Lpf/b;Lpf/b$a;Lmh/a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.sso.account.accountPickerDialogs.<anonymous>.<anonymous> (SSOAccountPickerDialogs.kt:24)"

    const v4, -0x5bd122f9

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget v1, Lm8/c;->Y1:I

    const/4 v2, 0x0

    invoke-static {v1, v14, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ls9/d$a;

    iget-object v1, v0, Lpf/d$a$a;->a:Lpf/b$a;

    check-cast v1, Lpf/b$a$a;

    invoke-virtual {v1}, Lpf/b$a$a;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lpf/d$a$a$a;

    iget-object v4, v0, Lpf/d$a$a;->a:Lpf/b$a;

    invoke-direct {v3, v4}, Lpf/d$a$a$a;-><init>(Lpf/b$a;)V

    invoke-direct {v12, v1, v3}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    sget v1, Lm8/c;->W1:I

    invoke-static {v1, v14, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v13

    sget v1, Lm8/c;->V1:I

    invoke-static {v1, v14, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v16

    iget-object v2, v0, Lpf/d$a$a;->b:Lmh/a;

    sget-object v1, Lpf/a;->a:Lpf/a;

    invoke-virtual {v1}, Lpf/a;->a()Lmh/s;

    move-result-object v21

    const v1, -0x7beb5558

    invoke-interface {v14, v1}, LT/l;->U(I)V

    iget-object v1, v0, Lpf/d$a$a;->c:LIi/N;

    invoke-interface {v14, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, v0, Lpf/d$a$a;->d:Lpf/b;

    invoke-interface {v14, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    iget-object v3, v0, Lpf/d$a$a;->a:Lpf/b$a;

    invoke-interface {v14, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    iget-object v3, v0, Lpf/d$a$a;->b:Lmh/a;

    invoke-interface {v14, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    iget-object v3, v0, Lpf/d$a$a;->c:LIi/N;

    iget-object v4, v0, Lpf/d$a$a;->d:Lpf/b;

    iget-object v5, v0, Lpf/d$a$a;->a:Lpf/b$a;

    iget-object v6, v0, Lpf/d$a$a;->b:Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_4

    :cond_3
    new-instance v7, Lpf/c;

    invoke-direct {v7, v3, v4, v5, v6}, Lpf/c;-><init>(LIi/N;Lpf/b;Lpf/b$a;Lmh/a;)V

    invoke-interface {v14, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v15, v7

    check-cast v15, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    iget-object v1, v0, Lpf/d$a$a;->b:Lmh/a;

    move-object/from16 v18, v1

    const/16 v23, 0x180

    const v24, 0x6837d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v25, v2

    move-object v2, v9

    move-object v9, v12

    move-object/from16 v12, v25

    move-object/from16 v14, v21

    move-object/from16 v21, p1

    invoke-static/range {v1 .. v24}, Ly9/q;->k(Landroidx/compose/ui/e;Ljava/lang/String;IIJLs9/c;Lmh/r;Ls9/d;Lmh/l;Ls9/b;Lmh/a;Ljava/lang/String;Lmh/s;Lmh/a;Ljava/lang/String;Lmh/s;Lmh/a;Ljava/lang/String;Ljava/lang/String;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lpf/d$a$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
