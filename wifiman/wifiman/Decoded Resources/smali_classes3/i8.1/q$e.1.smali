.class final Li8/q$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/q;-><init>(LP8/f;Lnc/j;Lnc/a;Lcom/ubnt/usurvey/a$b;Ldc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/q;


# direct methods
.method constructor <init>(Li8/q;)V
    .locals 0

    iput-object p1, p0, Li8/q$e;->a:Li8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li8/q$b;)Lgg/r;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li8/q$e;->a:Li8/q;

    invoke-virtual {p1}, Li8/q$b;->a()Li8/a$b;

    move-result-object p1

    invoke-static {v0, p1}, Li8/q;->j(Li8/q;Li8/a$b;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li8/q$b;

    invoke-virtual {p0, p1}, Li8/q$e;->a(Li8/q$b;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
