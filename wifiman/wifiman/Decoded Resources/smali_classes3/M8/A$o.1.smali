.class final LM8/A$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/A;


# direct methods
.method constructor <init>(LM8/A;)V
    .locals 0

    iput-object p1, p0, LM8/A$o;->a:LM8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;Lde/E;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "supportedBands"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lde/E;->c()Lic/e;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object v1, p0, LM8/A$o;->a:LM8/A;

    invoke-virtual {v1, p2}, LM8/A;->T0(Lic/e;)LS8/c;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    new-instance v1, Ll9/a;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, p2}, LZg/v;->f0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move-object v0, p2

    :cond_1
    invoke-direct {v1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    check-cast p2, Lde/E;

    invoke-virtual {p0, p1, p2}, LM8/A$o;->a(Ljava/util/Set;Lde/E;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
