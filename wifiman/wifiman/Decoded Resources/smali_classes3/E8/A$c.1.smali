.class final LE8/A$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/A$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/A$c;

    invoke-direct {v0}, LE8/A$c;-><init>()V

    sput-object v0, LE8/A$c;->a:LE8/A$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljf/f;

    check-cast p2, Ll9/a;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, LE8/A$c;->b(Ljf/f;Ll9/a;Ljava/lang/Boolean;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljf/f;Ll9/a;Ljava/lang/Boolean;)Ll9/a;
    .locals 6

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "isFeedbackServiceAvailable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p1}, Ljf/f;->b()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v4

    sget-object v5, Lpd/s;->INTERNET:Lpd/s;

    if-ne v4, v5, :cond_1

    invoke-virtual {p2}, Lcom/ui/wifiman/model/speedtest/result/b;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    move p2, v2

    goto :goto_1

    :cond_2
    :goto_0
    move p2, v1

    :goto_1
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-virtual {p1}, Ljf/f;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    move v1, v2

    :cond_3
    new-instance p1, Ll9/a;

    if-nez v0, :cond_5

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    goto :goto_3

    :cond_5
    :goto_2
    new-instance p3, Ljf/c;

    invoke-direct {p3, v0, v1, p2}, Ljf/c;-><init>(ZZZ)V

    move-object p2, p3

    :goto_3
    invoke-direct {p1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
