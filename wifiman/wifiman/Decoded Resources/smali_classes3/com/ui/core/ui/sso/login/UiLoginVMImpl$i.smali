.class final Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->H0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;->c(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    return-void
.end method

.method private static final c(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V
    .locals 1

    sget-object v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;->IDLE:Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;

    invoke-static {p0, v0}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->z0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/login/UiLoginVMImpl$b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d;

    invoke-virtual {p0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;->b(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d;)Lgg/f;
    .locals 3

    instance-of v0, p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    check-cast p1, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;

    invoke-static {v0, p1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl;->t0(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;Lcom/ui/core/ui/sso/login/UiLoginVMImpl$d$a;)Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a;

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {v0, v1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$a;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$b;

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {v0, v1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$b;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-virtual {p1, v0}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    invoke-direct {v0, v1}, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i$c;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-virtual {p1, v0}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-wide/16 v0, 0x1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/core/ui/sso/login/UiLoginVMImpl$i;->a:Lcom/ui/core/ui/sso/login/UiLoginVMImpl;

    new-instance v1, Lcom/ui/core/ui/sso/login/i;

    invoke-direct {v1, v0}, Lcom/ui/core/ui/sso/login/i;-><init>(Lcom/ui/core/ui/sso/login/UiLoginVMImpl;)V

    invoke-virtual {p1, v1}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
