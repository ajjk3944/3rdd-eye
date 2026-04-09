.class final LM8/b$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;->y0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/b;


# direct methods
.method constructor <init>(LM8/b;)V
    .locals 0

    iput-object p1, p0, LM8/b$u;->a:LM8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh9/a;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/b$u;->a:LM8/b;

    invoke-static {v0}, LM8/b;->A0(LM8/b;)Li8/a;

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

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh9/a;

    invoke-virtual {p0, p1}, LM8/b$u;->a(Lh9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
