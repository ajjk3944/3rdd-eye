.class public final Lti/c$b;
.super Lpi/w0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lti/c;->h(Lpi/B0;)Lpi/B0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpi/w0;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Lpi/v0;)Lpi/B0;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lci/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lci/b;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p1}, Lci/b;->e()Lpi/B0;

    move-result-object v0

    invoke-interface {v0}, Lpi/B0;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lpi/D0;

    sget-object v1, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    invoke-interface {p1}, Lci/b;->e()Lpi/B0;

    move-result-object p1

    invoke-interface {p1}, Lpi/B0;->getType()Lpi/S;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lpi/D0;-><init>(Lpi/N0;Lpi/S;)V

    return-object v0

    :cond_2
    invoke-interface {p1}, Lci/b;->e()Lpi/B0;

    move-result-object p1

    return-object p1
.end method
