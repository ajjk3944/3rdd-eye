.class final Lcom/ui/comm/v4/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/ui/comm/v4/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/ui/comm/v4/a;)V
    .locals 1

    const-string/jumbo v0, "guid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/comm/v4/d$c;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/comm/v4/d$c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/comm/v4/d$c;->c:Lcom/ui/comm/v4/a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/d$c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/ui/comm/v4/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/d$c;->c:Lcom/ui/comm/v4/a;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/d$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic getMessage()Le9/a;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/comm/v4/d$c;->b()Lcom/ui/comm/v4/a;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/ui/comm/v4/d$c;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/comm/v4/d$c;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/ui/comm/v4/d$c;->b()Lcom/ui/comm/v4/a;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "UNPACKED ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "] --- "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -- "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
