.class final Li8/r$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/r$b;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/r;


# direct methods
.method constructor <init>(Li8/r;)V
    .locals 0

    iput-object p1, p0, Li8/r$b$a;->a:Li8/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)Lgg/r;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li8/r$b$a;->a:Li8/r;

    invoke-static {p1}, Li8/r;->c(Li8/r;)Li8/s$d;

    move-result-object p1

    invoke-interface {p1}, Li8/s$d;->a()Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Li8/r$b$a;->a(LYg/J;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
