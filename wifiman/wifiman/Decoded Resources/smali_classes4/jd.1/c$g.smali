.class final Ljd/c$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljd/c;-><init>(LZc/f;LZc/a;Lje/u;LDc/e;Lbe/e;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljd/c;

.field final synthetic b:Lbe/e;


# direct methods
.method constructor <init>(Ljd/c;Lbe/e;)V
    .locals 0

    iput-object p1, p0, Ljd/c$g;->a:Ljd/c;

    iput-object p2, p0, Ljd/c$g;->b:Lbe/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 4

    const-string v0, "connected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ljd/c$g;->a:Ljd/c;

    invoke-static {p1}, Ljd/c;->i(Ljd/c;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, Ljd/c$g;->a:Ljd/c;

    invoke-static {v0}, Ljd/c;->g(Ljd/c;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Ljd/c$g;->b:Lbe/e;

    invoke-interface {v1}, Lbe/e;->a()Lgg/i;

    move-result-object v1

    sget-object v2, Ljd/c$g$a;->a:Ljd/c$g$a;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    new-instance v2, Ljd/c$g$b;

    iget-object v3, p0, Ljd/c$g;->a:Ljd/c;

    invoke-direct {v2, v3}, Ljd/c$g$b;-><init>(Ljd/c;)V

    invoke-static {p1, v0, v1, v2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Ljd/c$g;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
