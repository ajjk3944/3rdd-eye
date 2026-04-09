.class public final Li8/q$F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/q;->m(Li8/a$b;)Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/a$b;


# direct methods
.method public constructor <init>(Li8/a$b;)V
    .locals 0

    iput-object p1, p0, Li8/q$F;->a:Li8/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 5

    :try_start_0
    new-instance v0, Li8/a$a$f;

    new-instance v1, Lxe/F$l$e;

    new-instance v2, Lnf/e$b;

    iget-object v3, p0, Li8/q$F;->a:Li8/a$b;

    check-cast v3, Li8/a$b$B$c$b;

    invoke-virtual {v3}, Li8/a$b$B$c$b;->b()Linet/ipaddr/g;

    move-result-object v3

    iget-object v4, p0, Li8/q$F;->a:Li8/a$b;

    check-cast v4, Li8/a$b$B$c$b;

    invoke-virtual {v4}, Li8/a$b$B$c$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lnf/e$b;-><init>(Linet/ipaddr/g;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lxe/F$l$e;-><init>(Lnf/e;)V

    invoke-direct {v0, v1}, Li8/a$a$f;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
