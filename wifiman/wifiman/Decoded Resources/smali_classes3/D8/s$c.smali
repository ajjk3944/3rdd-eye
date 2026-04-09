.class final LD8/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/s;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/s;


# direct methods
.method constructor <init>(LD8/s;)V
    .locals 0

    iput-object p1, p0, LD8/s$c;->a:LD8/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS8/c;

    check-cast p2, Lje/r;

    check-cast p3, Ljava/util/List;

    check-cast p4, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3, p4}, LD8/s$c;->b(LS8/c;Lje/r;Ljava/util/List;Ljava/util/Map;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LS8/c;Lje/r;Ljava/util/List;Ljava/util/Map;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "bandSelected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "affiliatedScanResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "affiliatedChannelEnvironment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    instance-of v1, p2, Lje/r$b$a$b;

    if-eqz v1, :cond_0

    iget-object p1, p0, LD8/s$c;->a:LD8/s;

    check-cast p2, Lje/r$b$a$b;

    invoke-static {p1, p2, p3, p4}, LD8/s;->n(LD8/s;Lje/r$b$a$b;Ljava/util/List;Ljava/util/Map;)Laf/P;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v1, p2, Lje/r$b$a$a;

    if-eqz v1, :cond_1

    iget-object v1, p0, LD8/s$c;->a:LD8/s;

    check-cast p2, Lje/r$b$a$a;

    invoke-static {v1, p2, p1, p3, p4}, LD8/s;->m(LD8/s;Lje/r$b$a$a;LS8/c;Ljava/util/List;Ljava/util/Map;)Laf/P;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of p1, p2, Lje/r$b$b;

    if-nez p1, :cond_3

    instance-of p1, p2, Lje/r$a;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    :goto_1
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
