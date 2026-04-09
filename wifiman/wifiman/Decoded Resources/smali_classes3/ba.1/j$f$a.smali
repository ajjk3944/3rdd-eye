.class final Lba/j$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/j$f;->a(Lba/l$a;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lba/l;

.field final synthetic b:Lmh/a;


# direct methods
.method constructor <init>(Lba/l;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lba/j$f$a;->a:Lba/l;

    iput-object p2, p0, Lba/j$f$a;->b:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lba/l;)LYg/J;
    .locals 0

    invoke-static {p0}, Lba/j$f$a;->c(Lba/l;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lba/l;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lba/l;->v0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v13, p1

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

    const-string/jumbo v3, "com.ui.core.ui.sso.password.UiResetPasswordLayout.<anonymous>.<anonymous> (UiResetPasswordLayout.kt:190)"

    const v4, 0x6ca12d96

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lba/j$f$a;->a:Lba/l;

    invoke-virtual {v1}, Lba/l;->g0()LLi/z;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v13, v3, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    invoke-static {v1, v13, v3}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ls9/d$c;

    iget-object v1, v0, Lba/j$f$a;->a:Lba/l;

    invoke-virtual {v1}, Lba/l;->f0()LLi/z;

    move-result-object v1

    invoke-static {v1, v2, v13, v3, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    invoke-static {v1, v13, v3}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v1

    iget-object v5, v0, Lba/j$f$a;->a:Lba/l;

    invoke-virtual {v5}, Lba/l;->h0()LH/l;

    move-result-object v5

    invoke-virtual {v5}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v5, "format(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v14, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lba/j$f$a;->a:Lba/l;

    invoke-virtual {v1}, Lba/l;->g0()LLi/z;

    move-result-object v1

    invoke-static {v1, v2, v13, v3, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    invoke-static {v1, v13, v3}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v21

    const v1, -0x34de9b17    # -1.0577129E7f

    invoke-interface {v13, v1}, LT/l;->U(I)V

    iget-object v1, v0, Lba/j$f$a;->a:Lba/l;

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lba/j$f$a;->a:Lba/l;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_4

    :cond_3
    new-instance v4, Lba/k;

    invoke-direct {v4, v2}, Lba/k;-><init>(Lba/l;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v15, v4

    check-cast v15, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    sget v1, LP9/b;->G0:I

    invoke-static {v1, v13, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v16

    iget-object v1, v0, Lba/j$f$a;->b:Lmh/a;

    move-object/from16 v18, v1

    const/16 v23, 0x0

    const v24, 0x6957d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v2, 0x0

    move-object/from16 v25, v14

    move-object v14, v2

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/high16 v22, 0x30000000

    move-object v2, v9

    move-object/from16 v9, v25

    move-object/from16 v13, v21

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

    invoke-virtual {p0, p1, p2}, Lba/j$f$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
