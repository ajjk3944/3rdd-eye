.class final LRe/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRe/e;->c(Landroidx/compose/ui/e;LRe/a;Lof/a$c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRe/e$b$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lof/a$a;

.field final synthetic b:LIi/N;

.field final synthetic c:LRe/a;


# direct methods
.method constructor <init>(Lof/a$a;LIi/N;LRe/a;)V
    .locals 0

    iput-object p1, p0, LRe/e$b;->a:Lof/a$a;

    iput-object p2, p0, LRe/e$b;->b:LIi/N;

    iput-object p3, p0, LRe/e$b;->c:LRe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;LRe/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LRe/e$b;->c(LIi/N;LRe/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;LRe/a;)LYg/J;
    .locals 6

    new-instance v3, LRe/e$b$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, LRe/e$b$a;-><init>(LRe/a;Ldh/e;)V

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
.method public final b(Lq/e;LT/l;I)V
    .locals 13

    move-object v0, p0

    move-object v9, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.settings.AppSettingsAccountLayout.<anonymous>.<anonymous> (AppSettingsAccountLayout.kt:121)"

    const v3, -0x66a10d2b

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v1, v0, LRe/e$b;->a:Lof/a$a;

    sget-object v2, LRe/e$b$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eq v1, v7, :cond_3

    if-eq v1, v6, :cond_3

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-ne v1, v3, :cond_1

    sget v1, Lm8/c;->N1:I

    goto :goto_0

    :cond_1
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_2
    sget v1, Lm8/c;->O1:I

    goto :goto_0

    :cond_3
    sget v1, Lm8/c;->P1:I

    :goto_0
    const/4 v8, 0x0

    invoke-static {v1, p2, v8}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v10

    iget-object v1, v0, LRe/e$b;->a:Lof/a$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    if-eq v1, v7, :cond_5

    if-eq v1, v6, :cond_5

    if-eq v1, v5, :cond_5

    if-eq v1, v4, :cond_5

    if-ne v1, v3, :cond_4

    move v3, v8

    goto :goto_1

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    move v3, v7

    :goto_1
    const v1, -0xc6d83cd

    invoke-interface {p2, v1}, LT/l;->U(I)V

    iget-object v1, v0, LRe/e$b;->b:LIi/N;

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, LRe/e$b;->c:LRe/a;

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LRe/e$b;->b:LIi/N;

    iget-object v4, v0, LRe/e$b;->c:LRe/a;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_6

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_7

    :cond_6
    new-instance v5, LRe/f;

    invoke-direct {v5, v2, v4}, LRe/f;-><init>(LIi/N;LRe/a;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v2, v5

    check-cast v2, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v11, 0x0

    const/16 v12, 0xb9

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v7, v10

    move-object v9, p2

    move v10, v11

    move v11, v12

    invoke-static/range {v1 .. v11}, Lw9/k;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/h;Ljava/lang/String;Lz/c$e;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LRe/e$b;->b(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
