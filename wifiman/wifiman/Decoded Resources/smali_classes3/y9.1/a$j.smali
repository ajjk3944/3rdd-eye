.class final Ly9/a$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly9/a$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly9/a$j;

    invoke-direct {v0}, Ly9/a$j;-><init>()V

    sput-object v0, Ly9/a$j;->a:Ly9/a$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 25

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

    const-string/jumbo v2, "com.ui.core.ui.component.dialog.ComposableSingletons$UiDialogAlertBottomKt.lambda-8.<anonymous> (UiDialogAlertBottom.kt:264)"

    const v3, -0x180f06dd

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const v1, 0x3f666666    # 0.9f

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->c(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v0, Ly9/a;->a:Ly9/a;

    invoke-virtual {v0}, Ly9/a;->f()Lmh/s;

    move-result-object v13

    invoke-virtual {v0}, Ly9/a;->g()Lmh/q;

    move-result-object v20

    const v23, 0xc00006

    const v24, 0x1f9fc

    const-string v3, "Dialog with custom content"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string/jumbo v12, "Submit"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v22, 0x30000036

    move-object/from16 v21, p1

    invoke-static/range {v2 .. v24}, Ly9/q;->q(Landroidx/compose/ui/e;Ljava/lang/String;IIJLs9/d;Lmh/l;Ls9/b;Lmh/a;Ljava/lang/String;Lmh/s;Lmh/a;Ljava/lang/String;Lmh/s;Lmh/a;Ljava/lang/String;Ljava/lang/String;Lmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

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

    invoke-virtual {p0, p1, p2}, Ly9/a$j;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
