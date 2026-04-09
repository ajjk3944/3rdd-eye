.class final Lcom/ui/wifiman/model/speedtest/internet/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b;->n(Ljava/util/List;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$e;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LKa/f$a;)LDj/a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKa/f$c$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$e;->a:Ljava/util/List;

    invoke-direct {v0, v1}, LKa/f$c$a;-><init>(Ljava/util/List;)V

    invoke-interface {p1, v0}, LKa/a;->a(Ljava/lang/Object;)LLi/g;

    move-result-object p1

    invoke-static {p1}, Ltd/g;->a(LLi/g;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKa/f$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$e;->a(LKa/f$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
