.class final LF9/M$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF9/M$b$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/q;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lmh/q;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LF9/M$b$a$a;->a:Lmh/q;

    iput-object p2, p0, LF9/M$b$a$a;->b:Ljava/lang/Object;

    iput p3, p0, LF9/M$b$a$a;->c:I

    iput-object p4, p0, LF9/M$b$a$a;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    move/from16 v1, p3

    const-string v2, "$this$DropdownMenuItem"

    move-object/from16 v4, p1

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v4, 0x10

    if-ne v2, v4, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.settings.UiSettingsDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSettingsDropdown.kt:86)"

    const v5, 0x2a63d592

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v4, v2, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v6, 0x3

    invoke-static {v1, v5, v2, v6, v5}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v2, 0x20

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    const/4 v6, 0x2

    invoke-static {v1, v2, v4, v6, v5}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v1, v0, LF9/M$b$a$a;->a:Lmh/q;

    iget-object v4, v0, LF9/M$b$a$a;->b:Ljava/lang/Object;

    iget v5, v0, LF9/M$b$a$a;->c:I

    shr-int/lit8 v5, v5, 0x12

    and-int/lit8 v5, v5, 0x8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v4, v3, v5}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LL0/d;

    sget-object v4, LW0/t;->a:LW0/t$a;

    invoke-virtual {v4}, LW0/t$a;->b()I

    move-result v16

    sget-object v4, LW0/j;->b:LW0/j$a;

    invoke-virtual {v4}, LW0/j$a;->a()I

    move-result v4

    const v5, -0x67d37478

    invoke-interface {v3, v5}, LT/l;->U(I)V

    iget-object v5, v0, LF9/M$b$a$a;->d:Ljava/lang/Object;

    iget-object v6, v0, LF9/M$b$a$a;->b:Ljava/lang/Object;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v5, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v5}, Lm0/v0$a;->e()J

    move-result-wide v5

    :goto_1
    move-wide/from16 v27, v5

    goto :goto_2

    :cond_3
    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, v3, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->c()J

    move-result-wide v5

    goto :goto_1

    :goto_2
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-static {v4}, LW0/j;->h(I)LW0/j;

    move-result-object v13

    const/16 v25, 0x30

    const v26, 0x3f5f8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x30

    move-wide/from16 v3, v27

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v26}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF9/M$b$a$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
