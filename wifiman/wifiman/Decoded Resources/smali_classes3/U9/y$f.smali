.class final LU9/y$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


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

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lf2/w;

.field final synthetic d:LN/n0;


# direct methods
.method constructor <init>(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;)V
    .locals 0

    iput-object p1, p0, LU9/y$f;->a:Landroid/app/Activity;

    iput-object p2, p0, LU9/y$f;->b:Ljava/lang/String;

    iput-object p3, p0, LU9/y$f;->c:Lf2/w;

    iput-object p4, p0, LU9/y$f;->d:LN/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 9

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

    const-string/jumbo v1, "com.ui.core.ui.sso.mfa.ModalSheet.<anonymous>.<anonymous> (UiMFA.kt:305)"

    const v2, 0x3be93e0f

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, LU9/y$f;->a:Landroid/app/Activity;

    iget-object v4, p0, LU9/y$f;->b:Ljava/lang/String;

    iget-object v5, p0, LU9/y$f;->c:Lf2/w;

    iget-object v6, p0, LU9/y$f;->d:LN/n0;

    sget p2, LN/n0;->e:I

    shl-int/lit8 v8, p2, 0x9

    move-object v7, p1

    invoke-static/range {v3 .. v8}, LU9/y;->y(Landroid/app/Activity;Ljava/lang/String;Lf2/w;LN/n0;LT/l;I)V

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

    invoke-virtual {p0, p1, p2}, LU9/y$f;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
