.class final LD8/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d;->p0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/d;


# direct methods
.method constructor <init>(LD8/d;)V
    .locals 0

    iput-object p1, p0, LD8/d$e;->a:LD8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "hostId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/d$e;->a:LD8/d;

    invoke-static {v0}, LD8/d;->u0(LD8/d;)Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;->d(J)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LD8/d$e;->a(Ljava/lang/Long;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
