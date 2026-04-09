.class final LM8/b$v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/b;


# direct methods
.method constructor <init>(LM8/b;)V
    .locals 0

    iput-object p1, p0, LM8/b$v;->a:LM8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxf/d;

    check-cast p2, Ll9/a;

    check-cast p3, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, LM8/b$v;->b(Lxf/d;Ll9/a;Ljava/util/Map;)LBe/A0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lxf/d;Ll9/a;Ljava/util/Map;)LBe/A0;
    .locals 2

    const-string/jumbo v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiSignalStats"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lle/i;

    if-eqz p2, :cond_0

    iget-object v0, p0, LM8/b$v;->a:LM8/b;

    invoke-virtual {p2}, Lle/i;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LS8/k;->a(Ljava/lang/String;)LS8/k;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lne/a;

    invoke-static {v0, p2, p3}, LM8/b;->C0(LM8/b;Lle/i;Lne/a;)LBe/A0;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    iget-object p2, p0, LM8/b$v;->a:LM8/b;

    invoke-virtual {p1}, Lxf/d;->a()Lh9/a;

    move-result-object p1

    invoke-static {p2, p1}, LM8/b;->D0(LM8/b;Lh9/a;)LBe/A0;

    move-result-object p2

    :cond_1
    return-object p2
.end method
