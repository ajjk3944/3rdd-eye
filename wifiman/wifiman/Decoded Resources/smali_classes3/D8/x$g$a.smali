.class final LD8/x$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/x$g;->a(LYg/s;)LDj/a;
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

    iput-object p1, p0, LD8/x$g$a;->a:LD8/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b;

    if-eqz p1, :cond_0

    iget-object v1, p0, LD8/x$g$a;->a:LD8/x;

    invoke-static {v1, p1}, LD8/x;->K0(LD8/x;Lcom/ui/wifiman/model/speedtest/result/b;)LD8/x$b;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LD8/x$g$a;->a(Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
