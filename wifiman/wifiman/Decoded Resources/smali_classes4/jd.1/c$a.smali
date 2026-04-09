.class final Ljd/c$a;
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
.field final synthetic a:Lbe/e;

.field final synthetic b:Ljd/c;


# direct methods
.method constructor <init>(Lbe/e;Ljd/c;)V
    .locals 0

    iput-object p1, p0, Ljd/c$a;->a:Lbe/e;

    iput-object p2, p0, Ljd/c$a;->b:Ljd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 5

    const-string v0, "connected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ljd/c$a;->a:Lbe/e;

    invoke-interface {p1}, Lbe/e;->a()Lgg/i;

    move-result-object p1

    sget-object v0, Ljd/c$a$a;->a:Ljd/c$a$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    iget-object v0, p0, Ljd/c$a;->a:Lbe/e;

    invoke-interface {v0}, Lbe/e;->a()Lgg/i;

    move-result-object v0

    sget-object v1, Ljd/c$a$b;->a:Ljd/c$a$b;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    iget-object v1, p0, Ljd/c$a;->b:Ljd/c;

    invoke-static {v1}, Ljd/c;->f(Ljd/c;)Lgg/i;

    move-result-object v1

    iget-object v2, p0, Ljd/c$a;->b:Ljd/c;

    invoke-virtual {v2}, Ljd/c;->d()Lgg/i;

    move-result-object v2

    new-instance v3, Ljd/c$a$c;

    iget-object v4, p0, Ljd/c$a;->b:Ljd/c;

    invoke-direct {v3, v4}, Ljd/c$a$c;-><init>(Ljd/c;)V

    invoke-static {p1, v0, v1, v2, v3}, Lgg/i;->t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;

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

    invoke-virtual {p0, p1}, Ljd/c$a;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
