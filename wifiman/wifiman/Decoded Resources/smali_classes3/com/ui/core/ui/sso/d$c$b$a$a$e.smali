.class final Lcom/ui/core/ui/sso/d$c$b$a$a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/d$c$b$a$a;->e(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/d;

.field final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/d;Lcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$e;->a:Lcom/ui/core/ui/sso/d;

    iput-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$e;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/b;Lf2/k;LT/l;I)V
    .locals 1

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo p2, "com.ui.core.ui.sso.UiSSOAccountFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UiSSOAccountFragment.kt:186)"

    const v0, -0x8ca81b3

    invoke-static {v0, p4, p1, p2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$e;->a:Lcom/ui/core/ui/sso/d;

    iget-object p2, p0, Lcom/ui/core/ui/sso/d$c$b$a$a$e;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    const/4 p4, 0x0

    invoke-static {p1, p2, p3, p4}, Lfa/d;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Lf2/k;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/core/ui/sso/d$c$b$a$a$e;->a(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
