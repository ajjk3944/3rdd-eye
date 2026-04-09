.class final LP8/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/e;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/e;


# direct methods
.method constructor <init>(LP8/e;)V
    .locals 0

    iput-object p1, p0, LP8/e$b;->a:LP8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP8/e$a;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    iget-object v1, p0, LP8/e$b;->a:LP8/e;

    invoke-static {v1, p1}, LP8/e;->p0(LP8/e;LP8/e$a;)Ls9/d;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP8/e$a;

    invoke-virtual {p0, p1}, LP8/e$b;->a(LP8/e$a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
