.class final LU9/y$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU9/y;->u(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LU9/h;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:LN/n0;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/app/Activity;LN/n0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LU9/y$e;->a:Landroid/app/Activity;

    iput-object p2, p0, LU9/y$e;->b:LN/n0;

    iput-object p3, p0, LU9/y$e;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 2

    const-string v0, "$this$ModalBottomSheetLayout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.sso.mfa.ModalSheet.<anonymous>.<anonymous> (UiMFA.kt:298)"

    const v1, -0x8c4d858

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, LU9/y$e;->a:Landroid/app/Activity;

    iget-object p3, p0, LU9/y$e;->b:LN/n0;

    iget-object v0, p0, LU9/y$e;->c:Ljava/lang/String;

    sget v1, LN/n0;->e:I

    shl-int/lit8 v1, v1, 0x3

    invoke-static {p1, p3, v0, p2, v1}, LU9/y;->n(Landroid/app/Activity;LN/n0;Ljava/lang/String;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LU9/y$e;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
