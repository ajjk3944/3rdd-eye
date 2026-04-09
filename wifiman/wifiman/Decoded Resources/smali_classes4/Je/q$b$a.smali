.class final LJe/q$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJe/q$b;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJe/n;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(LJe/n;LT/q0;)V
    .locals 0

    iput-object p1, p0, LJe/q$b$a;->a:LJe/n;

    iput-object p2, p0, LJe/q$b$a;->b:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/q0;LJe/n;Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LJe/q$b$a;->c(LT/q0;LJe/n;Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/q0;LJe/n;Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, LJe/n;->q0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LA9/i;LT/l;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.device.DeviceEditUi.<anonymous>.<anonymous>.<anonymous> (DeviceEditUi.kt:72)"

    const v3, -0xd7c664d

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget v1, Lm8/c;->t1:I

    const/4 v2, 0x0

    invoke-static {v1, v12, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v4

    iget-object v1, v0, LJe/q$b$a;->a:LJe/n;

    invoke-virtual {v1}, LJe/n;->o0()LLi/N;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v3, v12, v2, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls9/d;

    invoke-static {v1, v12, v2}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v23

    iget-object v1, v0, LJe/q$b$a;->b:LT/q0;

    invoke-interface {v1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v28, v1

    check-cast v28, Ljava/lang/String;

    const v1, 0x67d64571

    invoke-interface {v12, v1}, LT/l;->U(I)V

    iget-object v1, v0, LJe/q$b$a;->b:LT/q0;

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, LJe/q$b$a;->a:LJe/n;

    invoke-interface {v12, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, LJe/q$b$a;->b:LT/q0;

    iget-object v3, v0, LJe/q$b$a;->a:LJe/n;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_1

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_2

    :cond_1
    new-instance v5, LJe/r;

    invoke-direct {v5, v2, v3}, LJe/r;-><init>(LT/q0;LJe/n;)V

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v5, Lmh/l;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    const/16 v26, 0x0

    const v27, 0x1ff7e5

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object v2, v4

    move-object/from16 v4, v28

    move-object/from16 v12, v23

    move-object/from16 v23, p2

    invoke-static/range {v1 .. v27}, LF9/k0;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Lmh/a;Ljava/lang/Boolean;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZZLm0/l0;LF/D;LF/C;Landroidx/compose/ui/focus/o;LT/l;IIII)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LJe/q$b$a;->b(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
