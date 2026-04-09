.class final LSd/e$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e;-><init>(LDc/e;LLd/f;LSd/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LSd/e;


# direct methods
.method constructor <init>(LSd/e;)V
    .locals 0

    iput-object p1, p0, LSd/e$r;->a:LSd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LSd/e$b$a;

    if-nez p1, :cond_0

    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LSd/e$r;->a:LSd/e;

    invoke-static {v0}, LSd/e;->d(LSd/e;)LSd/a;

    move-result-object v0

    invoke-virtual {p1}, LSd/e$b$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LSd/a;->b(Ljava/lang/String;)Lgg/i;

    move-result-object v0

    new-instance v1, LSd/e$r$a;

    invoke-direct {v1, p1}, LSd/e$r$a;-><init>(LSd/e$b$a;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LSd/e$r;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
