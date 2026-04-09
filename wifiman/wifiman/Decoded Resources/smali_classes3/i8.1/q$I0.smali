.class final Li8/q$I0;
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

    iput-object p1, p0, Li8/q$I0;->a:Li8/q;

    iput-object p2, p0, Li8/q$I0;->b:Li8/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Li8/a$a;
    .locals 10

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li8/q$I0;->a:Li8/q;

    invoke-static {p1}, Li8/q;->g(Li8/q;)Lnc/a;

    move-result-object p1

    new-instance v0, Lec/a$b;

    iget-object v1, p0, Li8/q$I0;->b:Li8/a$b;

    check-cast v1, Li8/a$b$D$c;

    invoke-virtual {v1}, Li8/a$b$D$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lec/a$b;-><init>(Ljava/lang/CharSequence;)V

    invoke-interface {p1, v0}, Lnc/a;->e(Lec/a;)Lmh/l;

    move-result-object v7

    iget-object p1, p0, Li8/q$I0;->a:Li8/q;

    invoke-static {p1}, Li8/q;->h(Li8/q;)Lnc/j;

    move-result-object p1

    invoke-interface {p1, v7}, Lnc/j;->a(Lmh/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Li8/a$a$h;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Li8/a$a$h;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    new-instance p1, Li8/a$a$g;

    new-instance v0, Lhc/a;

    new-instance v1, Lec/a$a;

    const v2, 0x7f110322

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-direct {v1, v2, v4}, Lec/a$a;-><init>(I[Ljava/lang/Object;)V

    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lhc/a;-><init>(Lec/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v0}, Li8/a$a$g;-><init>(Lhc/a;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Li8/q$I0;->a(Landroid/content/Context;)Li8/a$a;

    move-result-object p1

    return-object p1
.end method
