.class final Lxe/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/e;->d(Landroidx/compose/ui/e;Lxe/w0;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field static final synthetic j:[Lth/l;


# instance fields
.field final synthetic a:Lorg/kodein/di/DI;

.field final synthetic b:Landroidx/lifecycle/o;

.field final synthetic c:LN/n0;

.field final synthetic d:LIi/N;

.field final synthetic e:Lf2/w;

.field final synthetic f:Lf2/w;

.field final synthetic g:LT/z1;

.field final synthetic h:Landroidx/compose/ui/e;

.field final synthetic i:Lxe/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/D;

    const-string v1, "<v#1>"

    const/4 v2, 0x1

    const-class v3, Lxe/e;

    const-string v4, "navigation"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->g(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object v0

    new-array v1, v2, [Lth/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lxe/e$a;->j:[Lth/l;

    return-void
.end method

.method constructor <init>(Lorg/kodein/di/DI;Landroidx/lifecycle/o;LN/n0;LIi/N;Lf2/w;Lf2/w;LT/z1;Landroidx/compose/ui/e;Lxe/r0;)V
    .locals 0

    iput-object p1, p0, Lxe/e$a;->a:Lorg/kodein/di/DI;

    iput-object p2, p0, Lxe/e$a;->b:Landroidx/lifecycle/o;

    iput-object p3, p0, Lxe/e$a;->c:LN/n0;

    iput-object p4, p0, Lxe/e$a;->d:LIi/N;

    iput-object p5, p0, Lxe/e$a;->e:Lf2/w;

    iput-object p6, p0, Lxe/e$a;->f:Lf2/w;

    iput-object p7, p0, Lxe/e$a;->g:LT/z1;

    iput-object p8, p0, Lxe/e$a;->h:Landroidx/compose/ui/e;

    iput-object p9, p0, Lxe/e$a;->i:Lxe/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LYg/m;)Lxe/f;
    .locals 0

    invoke-static {p0}, Lxe/e$a;->c(LYg/m;)Lxe/f;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LYg/m;)Lxe/f;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxe/f;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v9, p1

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

    const-string v3, "com.ui.wifiman.ui.WifimanAppUi.<anonymous> (WiFiManAppUi.kt:112)"

    const v4, 0x2658b24f

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lxe/e$a;->a:Lorg/kodein/di/DI;

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, Lxe/e$a$c;

    invoke-direct {v3}, Lxe/e$a$c;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lxe/f;

    invoke-direct {v2, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lorg/kodein/di/d;->a(Lorg/kodein/di/c;Lorg/kodein/type/q;Ljava/lang/Object;)Lrj/x2;

    move-result-object v1

    sget-object v2, Lxe/e$a;->j:[Lth/l;

    const/4 v10, 0x0

    aget-object v2, v2, v10

    invoke-interface {v1, v3, v2}, Lrj/x2;->a(Ljava/lang/Object;Lth/l;)LYg/m;

    move-result-object v13

    const/4 v6, 0x0

    const/16 v7, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, Lze/a;->b(Lorg/kodein/di/DI;Lq2/f;Landroid/os/Bundle;Ljava/lang/String;LT/l;II)Landroidx/lifecycle/a;

    move-result-object v19

    const v11, -0x72e5f4af

    invoke-interface {v9, v11}, LT/l;->U(I)V

    sget-object v12, Lc2/a;->a:Lc2/a;

    sget v14, Lc2/a;->c:I

    invoke-virtual {v12, v9, v14}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v2

    const-string v15, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    if-eqz v2, :cond_b

    const/16 v8, 0x10

    const-class v1, Lxe/h;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v16, 0x0

    move-object/from16 v4, v19

    move-object/from16 v6, p1

    move/from16 v7, v16

    invoke-static/range {v1 .. v8}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v2

    invoke-interface {v9, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v3

    invoke-interface {v9, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    const-string v8, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v4

    invoke-interface {v9, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    const v7, 0x318a4a49

    invoke-interface {v9, v7}, LT/l;->U(I)V

    invoke-interface {v9, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v9, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {v9, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_3

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_4

    :cond_3
    new-instance v6, Lye/i;

    invoke-direct {v6, v1, v2, v3}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {v4, v6, v9, v10}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    move-object/from16 v21, v1

    check-cast v21, Lxe/h;

    invoke-interface {v9, v11}, LT/l;->U(I)V

    invoke-virtual {v12, v9, v14}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v2

    if-eqz v2, :cond_a

    const/4 v5, 0x0

    const/16 v11, 0x10

    const-class v1, LGe/g$a;

    const/4 v3, 0x0

    move-object/from16 v4, v19

    move-object/from16 v6, p1

    move v12, v7

    move/from16 v7, v16

    move-object v14, v8

    move v8, v11

    invoke-static/range {v1 .. v8}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v1

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v2

    invoke-interface {v9, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v3

    invoke-interface {v9, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v14}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v4

    invoke-interface {v9, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v9, v12}, LT/l;->U(I)V

    invoke-interface {v9, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v9, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {v9, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_5

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_6

    :cond_5
    new-instance v6, Lye/i;

    invoke-direct {v6, v1, v2, v3}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {v4, v6, v9, v10}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    move-object/from16 v20, v1

    check-cast v20, LGe/g$a;

    new-instance v1, Lxe/e$a$a;

    iget-object v15, v0, Lxe/e$a;->h:Landroidx/compose/ui/e;

    iget-object v2, v0, Lxe/e$a;->i:Lxe/r0;

    iget-object v3, v0, Lxe/e$a;->e:Lf2/w;

    iget-object v4, v0, Lxe/e$a;->f:Lf2/w;

    move-object v14, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    invoke-direct/range {v14 .. v21}, Lxe/e$a$a;-><init>(Landroidx/compose/ui/e;Lxe/r0;Lf2/w;Lf2/w;Landroidx/lifecycle/a;LGe/g$a;Lxe/h;)V

    const/16 v2, 0x36

    const v3, 0x4cbd20bc

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, v9, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v3

    const/16 v5, 0x180

    const/4 v6, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v1 .. v6}, Ltf/c;->b(ZLra/d;Lmh/p;LT/l;II)V

    invoke-static {v13}, Lxe/e$a;->c(LYg/m;)Lxe/f;

    move-result-object v1

    const v2, -0x540b8ce

    invoke-interface {v9, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lxe/e$a;->b:Landroidx/lifecycle/o;

    invoke-interface {v9, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v9, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Lxe/e$a;->c:LN/n0;

    invoke-interface {v9, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Lxe/e$a;->d:LIi/N;

    invoke-interface {v9, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Lxe/e$a;->e:Lf2/w;

    invoke-interface {v9, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Lxe/e$a;->f:Lf2/w;

    invoke-interface {v9, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Lxe/e$a;->g:LT/z1;

    invoke-interface {v9, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v12, v0, Lxe/e$a;->b:Landroidx/lifecycle/o;

    iget-object v14, v0, Lxe/e$a;->c:LN/n0;

    iget-object v15, v0, Lxe/e$a;->d:LIi/N;

    iget-object v3, v0, Lxe/e$a;->e:Lf2/w;

    iget-object v4, v0, Lxe/e$a;->f:Lf2/w;

    iget-object v5, v0, Lxe/e$a;->g:LT/z1;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_7

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_8

    :cond_7
    new-instance v6, Lxe/e$a$b;

    const/16 v19, 0x0

    move-object v11, v6

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    invoke-direct/range {v11 .. v19}, Lxe/e$a$b;-><init>(Landroidx/lifecycle/o;LYg/m;LN/n0;LIi/N;Lf2/w;Lf2/w;LT/z1;Ldh/e;)V

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lmh/p;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {v1, v6, v9, v10}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_1
    return-void

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v15}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v15}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lxe/e$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
