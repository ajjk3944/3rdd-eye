.class public final LUc/i$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUc/i;-><init>(Landroid/net/wifi/WifiManager;Lcom/ui/wifiman/model/vendor/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 4

    :try_start_0
    new-instance v0, LMj/x$b;

    invoke-direct {v0}, LMj/x$b;-><init>()V

    new-instance v1, Lb7/a$b;

    invoke-direct {v1}, Lb7/a$b;-><init>()V

    const-class v2, LVc/g;

    new-instance v3, LVc/f;

    invoke-direct {v3}, LVc/f;-><init>()V

    invoke-virtual {v1, v2, v3}, Lb7/a$b;->a(Ljava/lang/reflect/Type;Ld7/a;)Lb7/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lb7/a$b;->b()Lb7/a;

    move-result-object v1

    invoke-static {v1}, Lc7/a;->f(Lb7/a;)Lc7/a;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object v0

    const-string v1, "http://localhost/"

    invoke-virtual {v0, v1}, LMj/x$b;->c(Ljava/lang/String;)LMj/x$b;

    move-result-object v0

    invoke-static {}, LNj/g;->e()LNj/g;

    move-result-object v1

    invoke-virtual {v0, v1}, LMj/x$b;->a(LMj/e$a;)LMj/x$b;

    move-result-object v0

    invoke-virtual {v0}, LMj/x$b;->e()LMj/x;

    move-result-object v0

    const-class v1, LUc/i$b;

    invoke-virtual {v0, v1}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUc/i$b;

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
