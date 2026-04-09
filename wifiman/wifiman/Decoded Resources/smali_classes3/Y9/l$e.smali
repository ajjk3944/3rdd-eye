.class final LY9/l$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY9/l;->N0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY9/l;


# direct methods
.method constructor <init>(LY9/l;)V
    .locals 0

    iput-object p1, p0, LY9/l$e;->a:LY9/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LY9/l$e;->a:LY9/l;

    invoke-static {p1}, LY9/l;->K0(LY9/l;)Lcom/ui/core/ui/sso/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LAb/a$a;->a(LAb/a;Ljava/lang/String;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    new-instance v0, LY9/l$e$a;

    iget-object v1, p0, LY9/l$e;->a:LY9/l;

    invoke-direct {v0, v1}, LY9/l$e$a;-><init>(LY9/l;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    new-instance v0, LY9/l$e$b;

    iget-object v1, p0, LY9/l$e;->a:LY9/l;

    invoke-direct {v0, v1}, LY9/l$e$b;-><init>(LY9/l;)V

    invoke-virtual {p1, v0}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    sget-object v0, LY9/l$e$c;->a:LY9/l$e$c;

    invoke-virtual {p1, v0}, Lgg/b;->Q(Lkg/n;)Lgg/b;

    move-result-object p1

    sget-object v0, LY9/l$e$d;->a:LY9/l$e$d;

    invoke-virtual {p1, v0}, Lgg/b;->P(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, LY9/l$e;->a(LYg/J;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
