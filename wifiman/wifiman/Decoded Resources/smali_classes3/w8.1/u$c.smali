.class final Lw8/u$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/u;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/u;


# direct methods
.method constructor <init>(Lw8/u;)V
    .locals 0

    iput-object p1, p0, Lw8/u$c;->a:Lw8/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->n()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lw8/u$c;->a:Lw8/u;

    invoke-static {v0}, Lw8/u;->o0(Lw8/u;)LSd/a;

    move-result-object v0

    invoke-interface {v0, p1}, LSd/a;->b(Ljava/lang/String;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lw8/u$c;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
