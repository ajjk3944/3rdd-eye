.class final LPf/d$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPf/d$e;->a(Ljava/lang/Boolean;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LPf/d;


# direct methods
.method constructor <init>(LPf/d;)V
    .locals 0

    iput-object p1, p0, LPf/d$e$b;->a:LPf/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V
    .locals 1

    const-string v0, "stats"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LPf/d$e$b;->a:LPf/d;

    invoke-static {v0, p1}, LPf/d;->e(LPf/d;Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    invoke-virtual {p0, p1}, LPf/d$e$b;->a(Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)V

    return-void
.end method
