.class final Ly9/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/q;->q(Landroidx/compose/ui/e;Ljava/lang/String;IIJLs9/d;Lmh/l;Ls9/b;Lmh/a;Ljava/lang/String;Lmh/s;Lmh/a;Ljava/lang/String;Lmh/s;Lmh/a;Ljava/lang/String;Ljava/lang/String;Lmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    iput-object p1, p0, Ly9/q$b;->a:Ljava/lang/String;

    iput-object p2, p0, Ly9/q$b;->b:Ljava/lang/String;

    iput p3, p0, Ly9/q$b;->c:I

    iput p4, p0, Ly9/q$b;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.dialog.UiDialogContent.<anonymous>.<anonymous> (UiDialogAlertBottom.kt:80)"

    const v2, 0x31243d8f

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v8, p0, Ly9/q$b;->a:Ljava/lang/String;

    if-nez v8, :cond_3

    goto :goto_1

    :cond_3
    iget-object p2, p0, Ly9/q$b;->b:Ljava/lang/String;

    iget v4, p0, Ly9/q$b;->c:I

    iget v5, p0, Ly9/q$b;->d:I

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, p2}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v10, 0x0

    const/16 v11, 0x8

    const-wide/16 v6, 0x0

    move-object v9, p1

    invoke-static/range {v3 .. v11}, LL9/T;->b(Landroidx/compose/ui/e;IIJLjava/lang/String;LT/l;II)V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ly9/q$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
