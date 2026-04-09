.class final Li8/q$D0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/q;->m(Li8/a$b;)Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/q;

.field final synthetic b:Li8/a$b;


# direct methods
.method constructor <init>(Li8/q;Li8/a$b;)V
    .locals 0

    iput-object p1, p0, Li8/q$D0;->a:Li8/q;

    iput-object p2, p0, Li8/q$D0;->b:Li8/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Li8/a$a;
    .locals 11

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li8/q$D0;->a:Li8/q;

    invoke-static {p1}, Li8/q;->g(Li8/q;)Lnc/a;

    move-result-object p1

    iget-object v0, p0, Li8/q$D0;->b:Li8/a$b;

    check-cast v0, Li8/a$b$x;

    invoke-virtual {v0}, Li8/a$b$x;->a()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lnc/a$a;->b(Lnc/a;Lec/a;Ljava/io/File;ILjava/lang/Object;)Lmh/l;

    move-result-object v8

    iget-object p1, p0, Li8/q$D0;->a:Li8/q;

    invoke-static {p1}, Li8/q;->h(Li8/q;)Lnc/j;

    move-result-object p1

    invoke-interface {p1, v8}, Lnc/j;->a(Lmh/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Li8/a$a$h;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, Li8/a$a$h;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    new-instance p1, Li8/a$a$g;

    new-instance v0, Lhc/a;

    new-instance v1, Lec/a$a;

    const v3, 0x7f110326

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-direct {v1, v3, v5}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    const/4 v3, 0x2

    invoke-direct {v0, v1, v4, v3, v2}, Lhc/a;-><init>(Lec/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v0}, Li8/a$a$g;-><init>(Lhc/a;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Li8/q$D0;->a(Landroid/content/Context;)Li8/a$a;

    move-result-object p1

    return-object p1
.end method
