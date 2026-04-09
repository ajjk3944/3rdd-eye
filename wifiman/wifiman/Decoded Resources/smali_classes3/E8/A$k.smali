.class final LE8/A$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;->W()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/A;


# direct methods
.method constructor <init>(LE8/A;)V
    .locals 0

    iput-object p1, p0, LE8/A$k;->a:LE8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/A$k;->a:LE8/A;

    invoke-static {v0}, LE8/A;->I0(LE8/A;)LDd/b;

    move-result-object v0

    invoke-interface {v0}, Lee/c;->b()Lgg/i;

    move-result-object v0

    sget-object v1, LE8/A$k$a;->a:LE8/A$k$a;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LE8/A$k$b;

    iget-object v2, p0, LE8/A$k;->a:LE8/A;

    invoke-direct {v1, v2, p1}, LE8/A$k$b;-><init>(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p0, p1}, LE8/A$k;->a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
