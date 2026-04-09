.class final Lx8/j$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lx8/j$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/j$n;

    invoke-direct {v0}, Lx8/j$n;-><init>()V

    sput-object v0, Lx8/j$n;->a:Lx8/j$n;

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

    check-cast p1, Lgc/c;

    check-cast p2, Lcom/ubnt/usurvey/ui/signal/strength/a$a;

    check-cast p3, Lcom/ubnt/usurvey/ui/signal/strength/a$a;

    invoke-virtual {p0, p1, p2, p3}, Lx8/j$n;->b(Lgc/c;Lcom/ubnt/usurvey/ui/signal/strength/a$a;Lcom/ubnt/usurvey/ui/signal/strength/a$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lgc/c;Lcom/ubnt/usurvey/ui/signal/strength/a$a;Lcom/ubnt/usurvey/ui/signal/strength/a$a;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "signalType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiDeviceState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cellularDeviceState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v0

    instance-of p2, p2, Lcom/ubnt/usurvey/ui/signal/strength/a$a$a;

    if-eqz p2, :cond_0

    sget-object p2, Lgc/c;->WIFI:Lgc/c;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    instance-of p2, p3, Lcom/ubnt/usurvey/ui/signal/strength/a$a$a;

    if-eqz p2, :cond_1

    sget-object p2, Lgc/c;->CELLULAR:Lgc/c;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v0}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-le p3, v0, :cond_2

    new-instance p3, LTe/x0;

    invoke-direct {p3, p1, p2}, LTe/x0;-><init>(Lgc/c;Ljava/util/List;)V

    goto :goto_0

    :cond_2
    move-object p3, v1

    :goto_0
    if-eqz p3, :cond_3

    new-instance v1, LEe/g$a$b;

    new-instance p1, LTe/K0$j;

    invoke-direct {p1, p3}, LTe/K0$j;-><init>(LTe/x0;)V

    invoke-direct {v1, p1}, LEe/g$a$b;-><init>(LEe/g$b;)V

    :cond_3
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
