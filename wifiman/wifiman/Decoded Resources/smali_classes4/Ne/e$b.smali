.class final LNe/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNe/e;->d(LW7/e;Z)Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LW7/e;


# direct methods
.method constructor <init>(LW7/e;)V
    .locals 0

    iput-object p1, p0, LNe/e$b;->a:LW7/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 30

    move-object/from16 v0, p2

    const-string v1, "$unused$var$"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7a62bf45

    invoke-interface {v0, v1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.domain.text.<anonymous> (RatingCategoryExtensions.kt:37)"

    move/from16 v4, p3

    invoke-static {v1, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    move-object/from16 v1, p0

    iget-object v2, v1, LNe/e$b;->a:LW7/e;

    new-instance v3, LL0/d$a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v3, v6, v4, v5}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v4, 0x48dc60b3

    invoke-interface {v0, v4}, LT/l;->U(I)V

    new-instance v4, LL0/D;

    move-object v7, v4

    invoke-static {v2, v0, v6}, LNe/e;->b(LW7/e;LT/l;I)J

    move-result-wide v8

    const v28, 0xfffe

    const/16 v29, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v7 .. v29}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v4}, LL0/d$a;->n(LL0/D;)I

    move-result v4

    :try_start_0
    invoke-static {v2}, LNe/e;->a(LW7/e;)I

    move-result v2

    invoke-static {v2, v0, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v2, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3, v4}, LL0/d$a;->l(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v3}, LL0/d$a;->p()LL0/d;

    move-result-object v2

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v2

    :catchall_0
    move-exception v0

    invoke-virtual {v3, v4}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LNe/e$b;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
