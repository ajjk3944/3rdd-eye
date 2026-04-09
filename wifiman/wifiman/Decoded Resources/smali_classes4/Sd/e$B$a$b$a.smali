.class final LSd/e$B$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e$B$a$b;->a(Lgg/i;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LSd/e;


# direct methods
.method constructor <init>(LSd/e;)V
    .locals 0

    iput-object p1, p0, LSd/e$B$a$b$a;->a:LSd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    if-eqz v0, :cond_1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v0, p0, LSd/e$B$a$b$a;->a:LSd/e;

    invoke-static {v0}, LSd/e;->e(LSd/e;)Lfe/u;

    move-result-object v0

    invoke-interface {v0}, Lfe/u;->a()Lgg/y;

    move-result-object v0

    const-wide/16 v1, 0x1388

    invoke-static {v1, v2, p1, v0}, Lgg/i;->e2(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LSd/e$B$a$b$a;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
