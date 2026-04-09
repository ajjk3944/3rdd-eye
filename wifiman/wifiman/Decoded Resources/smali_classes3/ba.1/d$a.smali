.class final Lba/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/d;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic b:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;Landroidx/fragment/app/Fragment;)V
    .locals 0

    iput-object p1, p0, Lba/d$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, Lba/d$a;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v10, p1

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.password.UiResetPassword.<anonymous> (UiResetPassword.kt:21)"

    const v4, 0x360d0049

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, LN/f0;->a:LN/f0;

    sget v3, LN/f0;->b:I

    invoke-virtual {v2, v10, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->c()J

    move-result-wide v5

    new-instance v2, Lba/d$a$a;

    iget-object v3, v0, Lba/d$a;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v7, v0, Lba/d$a;->b:Landroidx/fragment/app/Fragment;

    invoke-direct {v2, v3, v7}, Lba/d$a$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Landroidx/fragment/app/Fragment;)V

    const/16 v3, 0x36

    const v7, -0x44d0d7b

    invoke-static {v7, v4, v2, v10, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v11, 0x180006

    const/16 v12, 0x3a

    const/4 v2, 0x0

    const-wide/16 v7, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide v3, v5

    move-wide v5, v7

    move-object v7, v13

    move v8, v14

    move-object/from16 v10, p1

    invoke-static/range {v1 .. v12}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lba/d$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
