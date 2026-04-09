.class final LF9/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LF9/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF9/b$b;

    invoke-direct {v0}, LF9/b$b;-><init>()V

    sput-object v0, LF9/b$b;->a:LF9/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0}, LF9/b$b;->e(Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LF9/b$b;->f()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method private static final e(Ljava/lang/String;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public final c(LT/l;I)V
    .locals 27

    move-object/from16 v4, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.settings.ComposableSingletons$UiSettingsTextFieldKt.lambda-10.<anonymous> (UiSettingsTextField.kt:306)"

    const v3, -0x1dada485

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const v0, -0x74fdf936

    invoke-interface {v4, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_3

    new-instance v0, LF9/c;

    invoke-direct {v0}, LF9/c;-><init>()V

    invoke-interface {v4, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v22, v0

    check-cast v22, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v0, -0x74fdf536

    invoke-interface {v4, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_4

    new-instance v0, LF9/d;

    invoke-direct {v0}, LF9/d;-><init>()V

    invoke-interface {v4, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v7, v0

    check-cast v7, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v25, 0x0

    const v26, 0x1ffc65

    const/4 v0, 0x0

    const-string/jumbo v1, "Name"

    const/4 v2, 0x0

    const-string/jumbo v3, "enabled"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    const-string/jumbo v9, "Error text! Error text! Error text! Error text!"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v23, 0x36c06c30

    const/16 v24, 0x0

    move-object/from16 v4, v22

    move-object/from16 v22, p1

    invoke-static/range {v0 .. v26}, LF9/k0;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Lmh/a;Ljava/lang/Boolean;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZZLm0/l0;LF/D;LF/C;Landroidx/compose/ui/focus/o;LT/l;IIII)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

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

    invoke-virtual {p0, p1, p2}, LF9/b$b;->c(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
