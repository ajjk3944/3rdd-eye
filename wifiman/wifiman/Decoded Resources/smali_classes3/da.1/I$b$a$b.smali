.class final Lda/I$b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I$b$a;->a(LEb/s;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/I;


# direct methods
.method constructor <init>(Lda/I;)V
    .locals 0

    iput-object p1, p0, Lda/I$b$a$b;->a:Lda/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lda/I;)V
    .locals 0

    invoke-static {p0}, Lda/I$b$a$b;->c(Lda/I;)V

    return-void
.end method

.method private static final c(Lda/I;)V
    .locals 1

    invoke-virtual {p0}, Lda/I;->Y0()LLi/y;

    move-result-object p0

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-interface {p0, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEb/c;

    invoke-virtual {p0, p1}, Lda/I$b$a$b;->b(LEb/c;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(LEb/c;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lda/I$b$a$b;->a:Lda/I;

    invoke-static {v0}, Lda/I;->P0(Lda/I;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-interface {v0, p1}, LAb/a;->e(LEb/c;)Lgg/z;

    move-result-object p1

    new-instance v0, Lda/I$b$a$b$a;

    iget-object v1, p0, Lda/I$b$a$b;->a:Lda/I;

    invoke-direct {v0, v1}, Lda/I$b$a$b$a;-><init>(Lda/I;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    iget-object v0, p0, Lda/I$b$a$b;->a:Lda/I;

    new-instance v1, Lda/J;

    invoke-direct {v1, v0}, Lda/J;-><init>(Lda/I;)V

    invoke-virtual {p1, v1}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
