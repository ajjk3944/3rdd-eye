.class final LE8/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/h;-><init>(Lgg/i;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/h;


# direct methods
.method constructor <init>(LE8/h;)V
    .locals 0

    iput-object p1, p0, LE8/h$e;->a:LE8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/h$e;->a:LE8/h;

    invoke-static {v0, p1}, LE8/h;->m(LE8/h;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-virtual {p0, p1}, LE8/h$e;->a(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
