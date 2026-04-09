.class final LY9/l$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY9/l$e;->a(LYg/J;)Lgg/f;
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

    iput-object p1, p0, LY9/l$e$b;->a:LY9/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, LY9/l$e$b;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "MFA PUSH DENIED"

    return-object v0
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LY9/l$e$b;->b(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    if-eqz p1, :cond_0

    new-instance p1, LY9/n;

    invoke-direct {p1}, LY9/n;-><init>()V

    invoke-static {p1}, LS9/a;->d(Lmh/a;)V

    iget-object p1, p0, LY9/l$e$b;->a:LY9/l;

    invoke-static {p1}, LY9/l;->L0(LY9/l;)Lka/a;

    move-result-object p1

    sget-object v0, Lka/a$a;->TICK:Lka/a$a;

    invoke-interface {p1, v0}, Lka/a;->a(Lka/a$a;)V

    iget-object p1, p0, LY9/l$e$b;->a:LY9/l;

    invoke-virtual {p1}, LY9/l;->M0()LLi/z;

    move-result-object p1

    sget-object v0, LY9/k$a;->DENIED:LY9/k$a;

    invoke-interface {p1, v0}, LLi/z;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
