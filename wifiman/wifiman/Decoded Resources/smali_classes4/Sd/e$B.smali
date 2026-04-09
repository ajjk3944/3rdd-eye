.class final LSd/e$B;
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
.field final synthetic a:LLd/f;

.field final synthetic b:LSd/e;


# direct methods
.method constructor <init>(LLd/f;LSd/e;)V
    .locals 0

    iput-object p1, p0, LSd/e$B;->a:LLd/f;

    iput-object p2, p0, LSd/e$B;->b:LSd/e;

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

    check-cast p1, LSd/e$b$b;

    if-nez p1, :cond_0

    sget-object p1, LSd/e$c$b$c;->a:LSd/e$c$b$c;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LSd/e$B;->a:LLd/f;

    invoke-interface {v0}, LLd/f;->a()Lgg/i;

    move-result-object v0

    new-instance v1, LSd/e$B$a;

    iget-object v2, p0, LSd/e$B;->b:LSd/e;

    invoke-direct {v1, p1, v2}, LSd/e$B$a;-><init>(LSd/e$b$b;LSd/e;)V

    invoke-virtual {v0, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LSd/e$B;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
