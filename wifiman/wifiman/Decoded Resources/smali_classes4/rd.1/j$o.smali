.class final Lrd/j$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j;-><init>(LZc/f;Lmc/a;Lld/b;Lvc/b;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;Ldc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd/j;


# direct methods
.method constructor <init>(Lrd/j;)V
    .locals 0

    iput-object p1, p0, Lrd/j$o;->a:Lrd/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrd/j$o;->a:Lrd/j;

    invoke-static {v0}, Lrd/j;->i(Lrd/j;)LFg/b;

    move-result-object v0

    sget-object v1, Lrd/a$a$b$b;->a:Lrd/a$a$b$b;

    invoke-interface {v0, v1}, LDj/b;->h(Ljava/lang/Object;)V

    const/4 v0, 0x0

    const/4 v1, 0x4

    const-string v2, "Speedtest SERVER failed, retrying in 5000ms"

    invoke-static {v2, p1, v0, v1, v0}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lrd/j$o;->a(Ljava/lang/Throwable;)V

    return-void
.end method
