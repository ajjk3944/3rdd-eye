.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a;->c(LKg/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/j;


# direct methods
.method constructor <init>(Lgg/j;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;->a:Lgg/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LKg/c;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LKg/c;->h()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "service subtype found - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BonjourJMDNS"

    invoke-static {p1, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(LKg/c;)V
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LKg/c;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "service type found - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BonjourJMDNS"

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LKg/c;->h()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/e$f$a$a;->a:Lgg/j;

    invoke-interface {v0, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
