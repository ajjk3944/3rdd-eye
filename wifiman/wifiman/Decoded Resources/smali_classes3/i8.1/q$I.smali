.class public final Li8/q$I;
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

    iput-object p1, p0, Li8/q$I;->a:Li8/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 5

    :try_start_0
    new-instance v0, Li8/a$a$f;

    new-instance v1, Lxe/F$l$f;

    new-instance v2, Lif/a;

    iget-object v3, p0, Li8/q$I;->a:Li8/a$b;

    check-cast v3, Li8/a$b$B$b$b;

    invoke-virtual {v3}, Li8/a$b$B$b$b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v3

    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Internal;

    if-eqz v4, :cond_0

    sget-object v3, Lff/b;->INTERNAL:Lff/b;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$NetworkConnection;

    if-eqz v4, :cond_1

    sget-object v3, Lff/b;->SERVER_UNREACHABLE:Lff/b;

    goto :goto_0

    :cond_1
    instance-of v3, v3, Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Unexpected;

    if-eqz v3, :cond_2

    sget-object v3, Lff/b;->UNEXPECTED:Lff/b;

    :goto_0
    invoke-direct {v2, v3}, Lif/a;-><init>(Lff/b;)V

    invoke-direct {v1, v2}, Lxe/F$l$f;-><init>(Lif/a;)V

    invoke-direct {v0, v1}, Li8/a$a$f;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
