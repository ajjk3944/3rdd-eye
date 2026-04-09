.class final LNe/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNe/j;->c(LS8/f;Z)Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNe/j$b$a;
    }
.end annotation


# instance fields
.field final synthetic a:LS8/f;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LS8/f;Z)V
    .locals 0

    iput-object p1, p0, LNe/j$b;->a:LS8/f;

    iput-boolean p2, p0, LNe/j$b;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x32048bb6

    invoke-interface {v2, v3}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.domain.text.<anonymous> (WifiChannelQualityExtensions.kt:29)"

    move/from16 v6, p3

    invoke-static {v3, v6, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, v1, LNe/j$b;->a:LS8/f;

    invoke-virtual {v3}, LS8/f;->b()LS8/f$a;

    move-result-object v3

    sget-object v4, LNe/j$b$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_4

    const/4 v5, 0x2

    if-eq v3, v5, :cond_3

    const/4 v5, 0x3

    if-eq v3, v5, :cond_2

    const/4 v5, 0x4

    if-ne v3, v5, :cond_1

    sget v3, Lm8/c;->K2:I

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    sget v3, Lm8/c;->I2:I

    goto :goto_0

    :cond_3
    sget v3, Lm8/c;->J2:I

    goto :goto_0

    :cond_4
    sget v3, Lm8/c;->H2:I

    :goto_0
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "getString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v3, v1, LNe/j$b;->b:Z

    if-eqz v3, :cond_5

    iget-object v3, v1, LNe/j$b;->a:LS8/f;

    new-instance v5, LL0/d$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, v7, v4, v6}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, LL0/D;

    move-object v8, v4

    invoke-static {v3, v2, v7}, LNe/j;->b(LS8/f;LT/l;I)J

    move-result-wide v9

    const v29, 0xfffe

    const/16 v30, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v8 .. v30}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v4}, LL0/d$a;->n(LL0/D;)I

    move-result v3

    :try_start_0
    invoke-virtual {v5, v0}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v5, v3}, LL0/d$a;->l(I)V

    invoke-virtual {v5}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v5, v3}, LL0/d$a;->l(I)V

    throw v0

    :cond_5
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LNe/j$b;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
