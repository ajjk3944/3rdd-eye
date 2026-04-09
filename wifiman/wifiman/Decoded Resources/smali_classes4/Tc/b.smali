.class public final LTc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTc/a;


# instance fields
.field private final a:Lgg/i;


# direct methods
.method public constructor <init>(Lxa/o;Lbe/e;Lcom/ui/wifiman/model/vendor/d$b;)V
    .locals 1

    const-string v0, "productCatalog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifiApiManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vendorManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lxa/o;->b()Lgg/i;

    move-result-object p1

    invoke-interface {p3}, Lcom/ui/wifiman/model/vendor/d$b;->a()Lgg/z;

    move-result-object p3

    invoke-virtual {p3}, Lgg/z;->W()Lgg/i;

    move-result-object p3

    invoke-interface {p2}, Lbe/e;->b()Lgg/i;

    move-result-object p2

    sget-object v0, LTc/b$a;->a:LTc/b$a;

    invoke-static {p1, p3, p2, v0}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LTc/b;->a:Lgg/i;

    return-void
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LTc/b;->a:Lgg/i;

    return-object v0
.end method
