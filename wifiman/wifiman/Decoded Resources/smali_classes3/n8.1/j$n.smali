.class final Ln8/j$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/j;


# direct methods
.method constructor <init>(Ln8/j;)V
    .locals 0

    iput-object p1, p0, Ln8/j$n;->a:Ln8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$b;)Lgg/f;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "params"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, LCd/j$c;

    if-eqz v2, :cond_0

    iget-object v2, p0, Ln8/j$n;->a:Ln8/j;

    invoke-static {v2}, Ln8/j;->G0(Ln8/j;)Li8/a;

    move-result-object v2

    new-instance v3, Li8/a$b$B$c$d;

    check-cast p1, LCd/j$c;

    invoke-direct {v3, p1}, Li8/a$b$B$c$d;-><init>(LCd/j$c;)V

    new-array p1, v1, [Li8/a$b;

    aput-object v3, p1, v0

    invoke-interface {v2, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v2, p1, Lqd/a$a;

    if-eqz v2, :cond_1

    iget-object v2, p0, Ln8/j$n;->a:Ln8/j;

    invoke-static {v2}, Ln8/j;->G0(Ln8/j;)Li8/a;

    move-result-object v2

    new-instance v3, Li8/a$b$B$c$a;

    check-cast p1, Lqd/a$a;

    invoke-direct {v3, p1}, Li8/a$b$B$c$a;-><init>(Lqd/a$a;)V

    new-array p1, v1, [Li8/a$b;

    aput-object v3, p1, v0

    invoke-interface {v2, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$b;

    invoke-virtual {p0, p1}, Ln8/j$n;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
