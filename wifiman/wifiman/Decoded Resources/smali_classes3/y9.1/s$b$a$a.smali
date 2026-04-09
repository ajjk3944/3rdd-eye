.class final Ly9/s$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/s$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/r;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:LT/q0;

.field final synthetic d:LT/q0;


# direct methods
.method constructor <init>(Lmh/r;Ljava/lang/Object;LT/q0;LT/q0;)V
    .locals 0

    iput-object p1, p0, Ly9/s$b$a$a;->a:Lmh/r;

    iput-object p2, p0, Ly9/s$b$a$a;->b:Ljava/lang/Object;

    iput-object p3, p0, Ly9/s$b$a$a;->c:LT/q0;

    iput-object p4, p0, Ly9/s$b$a$a;->d:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/q0;LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Ly9/s$b$a$a;->c(LT/q0;LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/q0;LT/q0;)LYg/J;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 5

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

    const-string/jumbo v1, "com.ui.core.ui.component.dialog.UiDialogEventHelper.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiDialog.kt:153)"

    const v2, 0x158e1a4f

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Ly9/s$b$a$a;->a:Lmh/r;

    iget-object v0, p0, Ly9/s$b$a$a;->b:Ljava/lang/Object;

    const v1, -0x65cd5cc6

    invoke-interface {p1, v1}, LT/l;->U(I)V

    iget-object v1, p0, Ly9/s$b$a$a;->c:LT/q0;

    iget-object v2, p0, Ly9/s$b$a$a;->d:LT/q0;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_3

    new-instance v3, Ly9/t;

    invoke-direct {v3, v1, v2}, Ly9/t;-><init>(LT/q0;LT/q0;)V

    invoke-interface {p1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const/16 v1, 0x30

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v3, p1, v1}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

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

    invoke-virtual {p0, p1, p2}, Ly9/s$b$a$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
