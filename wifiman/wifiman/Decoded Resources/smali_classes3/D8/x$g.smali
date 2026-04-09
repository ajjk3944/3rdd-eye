.class final LD8/x$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/x;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/x;


# direct methods
.method constructor <init>(LD8/x;)V
    .locals 0

    iput-object p1, p0, LD8/x$g;->a:LD8/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/c;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/a;

    iget-object v1, p0, LD8/x$g;->a:LD8/x;

    invoke-static {v1}, LD8/x;->I0(LD8/x;)Lcom/ui/wifiman/model/speedtest/result/e;

    move-result-object v1

    invoke-virtual {p1}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lke/c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lke/c;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v0, p1, v2}, Lcom/ui/wifiman/model/speedtest/result/e;->e(Lb8/c;Ljava/lang/String;Ljava/lang/Integer;)Lgg/i;

    move-result-object p1

    new-instance v0, LD8/x$g$a;

    iget-object v1, p0, LD8/x$g;->a:LD8/x;

    invoke-direct {v0, v1}, LD8/x$g$a;-><init>(LD8/x;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LD8/x$g;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
