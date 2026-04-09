.class final Ln8/j$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j$j;->a(Le8/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/j;

.field final synthetic b:Le8/a;


# direct methods
.method constructor <init>(Ln8/j;Le8/a;)V
    .locals 0

    iput-object p1, p0, Ln8/j$j$a;->a:Ln8/j;

    iput-object p2, p0, Ln8/j$j$a;->b:Le8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "<destruct>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lae/b$a;

    instance-of v2, p1, Lae/b$a$b;

    if-eqz v2, :cond_0

    iget-object v2, p0, Ln8/j$j$a;->a:Ln8/j;

    invoke-static {v2}, Ln8/j;->G0(Ln8/j;)Li8/a;

    move-result-object v2

    new-instance v3, Li8/a$b$e$a;

    check-cast p1, Lae/b$a$b;

    invoke-virtual {p1}, Lae/b$a$b;->a()Lae/a;

    move-result-object p1

    invoke-direct {v3, p1}, Li8/a$b$e$a;-><init>(Lae/a;)V

    new-array p1, v1, [Li8/a$b;

    aput-object v3, p1, v0

    invoke-interface {v2, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v2, p1, Lae/b$a$c;

    if-nez v2, :cond_2

    instance-of v2, p1, Lae/b$a$a;

    if-nez v2, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object p1, p0, Ln8/j$j$a;->a:Ln8/j;

    invoke-static {p1}, Ln8/j;->G0(Ln8/j;)Li8/a;

    move-result-object p1

    new-instance v2, Li8/a$b$m;

    iget-object v3, p0, Ln8/j$j$a;->b:Le8/a;

    invoke-virtual {v3}, Le8/a;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Li8/a$b$m;-><init>(Ljava/lang/String;)V

    new-array v1, v1, [Li8/a$b;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ln8/j$j$a;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
