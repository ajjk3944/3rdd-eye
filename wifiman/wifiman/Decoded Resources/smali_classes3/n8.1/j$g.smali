.class final Ln8/j$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j;->s0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/j;


# direct methods
.method constructor <init>(Ln8/j;)V
    .locals 0

    iput-object p1, p0, Ln8/j$g;->a:Ln8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, LCc/a;->l()Lh9/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Ln8/j$g;->a:Ln8/j;

    invoke-static {v0}, Ln8/j;->G0(Ln8/j;)Li8/a;

    move-result-object v0

    new-instance v1, Li8/a$b$h;

    new-instance v2, LJe/m;

    invoke-direct {v2, p1}, LJe/m;-><init>(Lh9/a;)V

    invoke-direct {v1, v2}, Li8/a$b$h;-><init>(LJe/m;)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-interface {v0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ln8/j$g;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
