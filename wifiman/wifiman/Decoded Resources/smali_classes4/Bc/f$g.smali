.class final LBc/f$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f;->r(I)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LBc/f;


# direct methods
.method constructor <init>(LBc/f;)V
    .locals 0

    iput-object p1, p0, LBc/f$g;->a:LBc/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/f$e;)LDj/a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LBc/f$e$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, LBc/f$g;->a:LBc/f;

    check-cast p1, LBc/f$e$a;

    invoke-virtual {p1}, LBc/f$e$a;->a()LBc/f$f;

    move-result-object p1

    invoke-static {v0, p1}, LBc/f;->k(LBc/f;LBc/f$f;)Lgg/s;

    move-result-object p1

    sget-object v0, Lgg/a;->BUFFER:Lgg/a;

    invoke-virtual {p1, v0}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, LBc/f$e$b;

    if-eqz p1, :cond_1

    new-instance p1, LBc/f$b$a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LBc/f$b$a;-><init>(ZLV7/b;)V

    new-instance v0, LBc/f$b$c;

    invoke-direct {v0, v1}, LBc/f$b$c;-><init>(Ljava/lang/Integer;)V

    invoke-static {p1, v0}, Lgg/i;->L0(Ljava/lang/Object;Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/f$e;

    invoke-virtual {p0, p1}, LBc/f$g;->a(LBc/f$e;)LDj/a;

    move-result-object p1

    return-object p1
.end method
