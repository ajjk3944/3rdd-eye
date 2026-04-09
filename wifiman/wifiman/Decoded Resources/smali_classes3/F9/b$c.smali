.class final LF9/b$c;
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
.field public static final a:LF9/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF9/b$c;

    invoke-direct {v0}, LF9/b$c;-><init>()V

    sput-object v0, LF9/b$c;->a:LF9/b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0}, LF9/b$c;->c(Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/String;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 27

    move-object/from16 v15, p1

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.settings.ComposableSingletons$UiSettingsTextFieldKt.lambda-11.<anonymous> (UiSettingsTextField.kt:321)"

    const v3, 0x8886954

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const v0, -0x1b2265f5

    invoke-interface {v15, v0}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    new-instance v0, LF9/e;

    invoke-direct {v0}, LF9/e;-><init>()V

    invoke-interface {v15, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v4, v0

    check-cast v4, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v25, 0x0

    const v26, 0x1ffee5

    const/4 v0, 0x0

    const-string/jumbo v1, "Name"

    const/4 v2, 0x0

    const-string/jumbo v3, "disabled"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v15, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v23, 0x6006c30

    const/16 v24, 0x0

    move-object/from16 v22, p1

    invoke-static/range {v0 .. v26}, LF9/k0;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmh/l;Lmh/a;Ljava/lang/Boolean;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZZLm0/l0;LF/D;LF/C;Landroidx/compose/ui/focus/o;LT/l;IIII)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF9/b$c;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
