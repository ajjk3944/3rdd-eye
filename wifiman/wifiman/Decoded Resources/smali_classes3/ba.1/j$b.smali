.class final Lba/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/j;->f(Lba/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lba/l;


# direct methods
.method constructor <init>(Lba/l;)V
    .locals 0

    iput-object p1, p0, Lba/j$b;->a:Lba/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA9/i;LT/l;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    const-string v1, "$this$UiColumnWithDividers"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.password.UiResetPasswordLayout.<anonymous>.<anonymous> (UiResetPasswordLayout.kt:99)"

    const v3, 0x51076f66

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget v1, LP9/b;->K0:I

    const/4 v2, 0x0

    invoke-static {v1, v15, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v10

    iget-object v1, v0, Lba/j$b;->a:Lba/l;

    invoke-virtual {v1}, Lba/l;->h0()LH/l;

    move-result-object v4

    iget-object v1, v0, Lba/j$b;->a:Lba/l;

    invoke-virtual {v1}, Lba/l;->i0()LLi/z;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v3, v15, v2, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    sget-object v1, LW0/j;->b:LW0/j$a;

    invoke-virtual {v1}, LW0/j$a;->f()I

    move-result v9

    new-instance v18, LF/D;

    move-object/from16 v17, v18

    sget-object v1, LR0/y;->b:LR0/y$a;

    invoke-virtual {v1}, LR0/y$a;->c()I

    move-result v21

    const/16 v26, 0x7b

    const/16 v27, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v18 .. v27}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v22, 0x30000

    const v23, 0x37cb5

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x30

    move-object/from16 v20, p2

    invoke-static/range {v1 .. v23}, LF9/c0;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lba/j$b;->a(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
