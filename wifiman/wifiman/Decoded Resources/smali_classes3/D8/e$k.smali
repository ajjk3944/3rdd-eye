.class final LD8/e$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/e;->p0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/e;


# direct methods
.method constructor <init>(LD8/e;)V
    .locals 0

    iput-object p1, p0, LD8/e$k;->a:LD8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lae/b$a;)Lgg/f;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string/jumbo v3, "deepLink"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, p1, Lae/b$a$b;

    if-eqz v3, :cond_0

    iget-object v3, p0, LD8/e$k;->a:LD8/e;

    invoke-static {v3}, LD8/e;->v0(LD8/e;)Li8/a;

    move-result-object v3

    new-instance v4, Li8/a$b$e$a;

    check-cast p1, Lae/b$a$b;

    invoke-virtual {p1}, Lae/b$a$b;->a()Lae/a;

    move-result-object p1

    invoke-direct {v4, p1}, Li8/a$b$e$a;-><init>(Lae/a;)V

    new-array p1, v2, [Li8/a$b;

    sget-object v2, Li8/a$b$n;->a:Li8/a$b$n;

    aput-object v2, p1, v1

    aput-object v4, p1, v0

    invoke-interface {v3, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v3, p1, Lae/b$a$a;

    if-eqz v3, :cond_1

    iget-object p1, p0, LD8/e$k;->a:LD8/e;

    invoke-static {p1}, LD8/e;->v0(LD8/e;)Li8/a;

    move-result-object p1

    new-instance v3, Li8/a$b$C;

    sget-object v4, Le8/a;->NETWORK:Le8/a;

    invoke-virtual {v4}, Le8/a;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Li8/a$b$C;-><init>(Ljava/lang/String;)V

    new-array v2, v2, [Li8/a$b;

    sget-object v4, Li8/a$b$n;->a:Li8/a$b$n;

    aput-object v4, v2, v1

    aput-object v3, v2, v0

    invoke-interface {p1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lae/b$a$c;

    if-eqz p1, :cond_2

    iget-object p1, p0, LD8/e$k;->a:LD8/e;

    invoke-static {p1}, LD8/e;->v0(LD8/e;)Li8/a;

    move-result-object p1

    new-instance v3, Li8/a$b$m;

    sget-object v4, Le8/a;->NETWORK:Le8/a;

    invoke-virtual {v4}, Le8/a;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Li8/a$b$m;-><init>(Ljava/lang/String;)V

    new-array v2, v2, [Li8/a$b;

    sget-object v4, Li8/a$b$n;->a:Li8/a$b$n;

    aput-object v4, v2, v1

    aput-object v3, v2, v0

    invoke-interface {p1, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lae/b$a;

    invoke-virtual {p0, p1}, LD8/e$k;->a(Lae/b$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
