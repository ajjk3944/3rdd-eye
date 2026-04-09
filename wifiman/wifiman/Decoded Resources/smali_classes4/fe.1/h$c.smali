.class final Lfe/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/h;->j(Lgg/i;Lmh/l;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lfe/h$c;->a:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)LWc/b;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LWc/b$a$b;

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, LWc/b$a$b;

    iget-object v1, p0, Lfe/h$c;->a:Lmh/l;

    check-cast p1, LWc/b$a$b;

    invoke-virtual {p1}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, LWc/b$a$b;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, LWc/b$a$a;

    invoke-direct {v0, p1}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LWc/b$a$a;

    if-eqz v0, :cond_1

    new-instance v0, LWc/b$a$a;

    check-cast p1, LWc/b$a$a;

    invoke-virtual {p1}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, LWc/b$b;

    if-eqz v0, :cond_2

    new-instance v0, LWc/b$b;

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, v1}, LWc/b$b;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    instance-of p1, p1, LWc/b$c;

    if-eqz p1, :cond_3

    new-instance v0, LWc/b$c;

    invoke-direct {v0}, LWc/b$c;-><init>()V

    :goto_0
    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, Lfe/h$c;->a(LWc/b;)LWc/b;

    move-result-object p1

    return-object p1
.end method
