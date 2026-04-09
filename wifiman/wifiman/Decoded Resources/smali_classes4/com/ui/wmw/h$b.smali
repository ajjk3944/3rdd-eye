.class final Lcom/ui/wmw/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/h;->e()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/h;


# direct methods
.method constructor <init>(Lcom/ui/wmw/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/h$b;->a:Lcom/ui/wmw/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/ApiVersion;)Lgg/D;
    .locals 7

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wmw/h$b;->a:Lcom/ui/wmw/h;

    invoke-static {v0}, Lcom/ui/wmw/h;->a(Lcom/ui/wmw/h;)Lcom/ui/wmw/api/v1/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wmw/api/v1/a;->a()Lgg/z;

    move-result-object v1

    iget-object v0, p0, Lcom/ui/wmw/h$b;->a:Lcom/ui/wmw/h;

    invoke-static {v0}, Lcom/ui/wmw/h;->a(Lcom/ui/wmw/h;)Lcom/ui/wmw/api/v1/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wmw/api/v1/a;->i()Lgg/z;

    move-result-object v2

    iget-object v0, p0, Lcom/ui/wmw/h$b;->a:Lcom/ui/wmw/h;

    invoke-static {v0}, Lcom/ui/wmw/h;->a(Lcom/ui/wmw/h;)Lcom/ui/wmw/api/v1/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wmw/api/v1/a;->m()Lgg/z;

    move-result-object v3

    iget-object v0, p0, Lcom/ui/wmw/h$b;->a:Lcom/ui/wmw/h;

    invoke-static {v0}, Lcom/ui/wmw/h;->a(Lcom/ui/wmw/h;)Lcom/ui/wmw/api/v1/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wmw/api/v1/a;->c()Lgg/z;

    move-result-object v4

    iget-object v0, p0, Lcom/ui/wmw/h$b;->a:Lcom/ui/wmw/h;

    invoke-static {v0}, Lcom/ui/wmw/h;->a(Lcom/ui/wmw/h;)Lcom/ui/wmw/api/v1/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wmw/api/v1/a;->f()Lgg/z;

    move-result-object v5

    new-instance v6, Lcom/ui/wmw/h$b$a;

    iget-object v0, p0, Lcom/ui/wmw/h$b;->a:Lcom/ui/wmw/h;

    invoke-direct {v6, v0, p1}, Lcom/ui/wmw/h$b$a;-><init>(Lcom/ui/wmw/h;Lcom/ui/wmw/api/ApiVersion;)V

    invoke-static/range {v1 .. v6}, Lgg/z;->c0(Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lkg/i;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/ApiVersion;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/h$b;->a(Lcom/ui/wmw/api/ApiVersion;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
