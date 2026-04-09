.class final Lhb/c$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c;-><init>(Ljava/lang/String;Ljava/lang/String;ZLGb/f;Llb/c;Ljb/a;Ljb/i;Leb/g$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhb/c;


# direct methods
.method constructor <init>(Lhb/c;)V
    .locals 0

    iput-object p1, p0, Lhb/c$g;->a:Lhb/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpb/l;)Lgg/v;
    .locals 3

    const-string/jumbo v0, "mqttClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhb/c$g;->a:Lhb/c;

    invoke-static {v0}, Lhb/c;->s(Lhb/c;)Ljb/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljb/a;->b(Z)Lgg/z;

    move-result-object v0

    new-instance v1, Lhb/c$g$a;

    iget-object v2, p0, Lhb/c$g;->a:Lhb/c;

    invoke-direct {v1, v2, p1}, Lhb/c$g$a;-><init>(Lhb/c;Lpb/l;)V

    invoke-virtual {v0, v1}, Lgg/z;->v(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpb/l;

    invoke-virtual {p0, p1}, Lhb/c$g;->a(Lpb/l;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
