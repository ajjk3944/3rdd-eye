.class public final Lub/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/d;


# instance fields
.field private final a:LGb/f;

.field private final b:Lcom/ui/unifi/core/base/net/traces/TracesClient;

.field private final c:Laj/b$a;


# direct methods
.method public constructor <init>(LGb/f;Lcom/ui/unifi/core/base/net/traces/TracesClient;)V
    .locals 1

    const-string/jumbo v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tracesClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lub/e;->a:LGb/f;

    iput-object p2, p0, Lub/e;->b:Lcom/ui/unifi/core/base/net/traces/TracesClient;

    sget-object p1, Laj/b;->d:Laj/b$a;

    iput-object p1, p0, Lub/e;->c:Laj/b$a;

    return-void
.end method
