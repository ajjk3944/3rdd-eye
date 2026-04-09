.class final LSd/e$u$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e$u;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LSd/e$b$a;


# direct methods
.method constructor <init>(LSd/e$b$a;)V
    .locals 0

    iput-object p1, p0, LSd/e$u$c;->a:LSd/e$b$a;

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

    new-instance v0, LSd/e$c$b$d;

    iget-object v1, p0, LSd/e$u$c;->a:LSd/e$b$a;

    invoke-virtual {v1}, LSd/e$b$a;->c()Ljava/lang/String;

    move-result-object v1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$UntrustedCertificate;->a()Ljava/util/Set;

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, LSd/e$c$b$d;-><init>(Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$Unauthorized;

    if-eqz v0, :cond_1

    sget-object p1, LSd/e$c$b$b;->a:LSd/e$c$b$b;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

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

    invoke-virtual {p0, p1}, LSd/e$u$c;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
