.class final LL9/O$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL9/O;->c(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Z

.field final synthetic c:Lmh/a;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;ZLmh/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LL9/O$a;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, LL9/O$a;->b:Z

    iput-object p3, p0, LL9/O$a;->c:Lmh/a;

    iput-object p4, p0, LL9/O$a;->d:Ljava/lang/String;

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.toolbar.UiToolbarTextButton.<anonymous> (UiToolbarTextButton.kt:24)"

    const v2, 0x65b57c72

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, LL9/O$a;->a:Landroidx/compose/ui/e;

    iget-boolean v4, p0, LL9/O$a;->b:Z

    iget-object v5, p0, LL9/O$a;->c:Lmh/a;

    new-instance p2, LL9/O$a$a;

    iget-object v0, p0, LL9/O$a;->d:Ljava/lang/String;

    invoke-direct {p2, v0}, LL9/O$a$a;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x36

    const v1, -0x2642f82a

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    const/high16 v10, 0x30000

    const/16 v11, 0x18

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, p1

    invoke-static/range {v3 .. v11}, LL9/g;->c(Landroidx/compose/ui/e;ZLmh/a;Ly/m;Ls/G;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

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

    invoke-virtual {p0, p1, p2}, LL9/O$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
