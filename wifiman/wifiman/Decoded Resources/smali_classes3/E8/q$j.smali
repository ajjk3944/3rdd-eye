.class public final LE8/q$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/q;->M0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/q;


# direct methods
.method public constructor <init>(LE8/q;)V
    .locals 0

    iput-object p1, p0, LE8/q$j;->a:LE8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, LE8/q$j;->a:LE8/q;

    invoke-static {v0}, LE8/q;->B0(LE8/q;)Lcom/ui/wifiman/ui/speedtest/feedback/d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, LE8/q$j;->a:LE8/q;

    invoke-static {v2}, LE8/q;->x0(LE8/q;)Lcom/ui/wifiman/ui/speedtest/feedback/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/speedtest/feedback/c;->a()J

    move-result-wide v2

    iget-object v4, p0, LE8/q$j;->a:LE8/q;

    invoke-static {v4, v0}, LE8/q;->v0(LE8/q;Lcom/ui/wifiman/ui/speedtest/feedback/d;)LAd/a$a;

    move-result-object v0

    iget-object v4, p0, LE8/q$j;->a:LE8/q;

    invoke-static {v4}, LE8/q;->A0(LE8/q;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v4}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    move-object v1, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance v4, LAd/a$b$a;

    invoke-direct {v4, v0, v1}, LAd/a$b$a;-><init>(LAd/a$a;Ljava/lang/String;)V

    new-instance v1, LAd/a$b;

    invoke-direct {v1, v2, v3, v4}, LAd/a$b;-><init>(JLAd/a$b$a;)V

    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {p1, v1}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
