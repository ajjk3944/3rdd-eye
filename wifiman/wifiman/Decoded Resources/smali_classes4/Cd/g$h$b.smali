.class final LCd/g$h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/g$h;->c(LCd/g$b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCd/g;


# direct methods
.method constructor <init>(LCd/g;)V
    .locals 0

    iput-object p1, p0, LCd/g$h$b;->a:LCd/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;)V
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCd/g$h$b;->a:LCd/g;

    invoke-static {v0}, LCd/g;->f(LCd/g;)LFg/a;

    move-result-object v0

    new-instance v1, Ll9/a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v1, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    iget-object v0, p0, LCd/g$h$b;->a:LCd/g;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;->a()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LCd/g;->c(LCd/g;J)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;

    invoke-virtual {p0, p1}, LCd/g$h$b;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;)V

    return-void
.end method
