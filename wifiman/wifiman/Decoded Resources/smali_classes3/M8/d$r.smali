.class final LM8/d$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;->t0(Lh9/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/d;


# direct methods
.method constructor <init>(LM8/d;)V
    .locals 0

    iput-object p1, p0, LM8/d$r;->a:LM8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lle/i;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "accessPoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/d$r;->a:LM8/d;

    invoke-static {v0}, LM8/d;->x0(LM8/d;)Li8/a;

    move-result-object v0

    new-instance v1, Li8/a$b$K;

    new-instance v2, Lxf/d;

    invoke-virtual {p1}, Lle/i;->e()Lh9/a;

    move-result-object p1

    invoke-direct {v2, p1}, Lxf/d;-><init>(Lh9/a;)V

    invoke-direct {v1, v2}, Li8/a$b$K;-><init>(Lxf/d;)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-interface {v0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lle/i;

    invoke-virtual {p0, p1}, LM8/d$r;->a(Lle/i;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
