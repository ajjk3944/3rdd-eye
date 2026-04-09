.class final LE8/x$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/x;->Z0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/x;


# direct methods
.method constructor <init>(LE8/x;)V
    .locals 0

    iput-object p1, p0, LE8/x$e;->a:LE8/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/r;
    .locals 2

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/x$e;->a:LE8/x;

    new-instance v1, LE8/x$e$a;

    invoke-direct {v1, p1, v0}, LE8/x$e$a;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;LE8/x;)V

    invoke-static {v1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {p0, p1}, LE8/x$e;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
