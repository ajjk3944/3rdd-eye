.class final LAb/g$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAb/g;->i(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LAb/g;


# direct methods
.method constructor <init>(LAb/g;)V
    .locals 0

    iput-object p1, p0, LAb/g$p;->a:LAb/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/r;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LAb/g$p;->a:LAb/g;

    invoke-static {p1}, LAb/g;->B(LAb/g;)LGb/f;

    move-result-object p1

    invoke-interface {p1}, LGb/f;->r()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p1, v1, v1, v0, v1}, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEb/r;

    invoke-virtual {p0, p1}, LAb/g$p;->a(LEb/r;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
