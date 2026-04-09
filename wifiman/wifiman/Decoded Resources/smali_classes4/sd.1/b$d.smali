.class final Lsd/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd/b;-><init>(Ljd/b;LSd/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lsd/b;


# direct methods
.method constructor <init>(Lsd/b;)V
    .locals 0

    iput-object p1, p0, Lsd/b$d;->a:Lsd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LTd/a;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lsd/b$d;->a:Lsd/b;

    invoke-static {v0}, Lsd/b;->b(Lsd/b;)Lgg/i;

    move-result-object v0

    invoke-interface {p1}, LTd/a;->a()Lgg/i;

    move-result-object v1

    sget-object v2, Lsd/b$d$a;->a:Lsd/b$d$a;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    new-instance v2, Lsd/b$d$b;

    invoke-direct {v2, p1}, Lsd/b$d$b;-><init>(LTd/a;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lsd/b$d;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
