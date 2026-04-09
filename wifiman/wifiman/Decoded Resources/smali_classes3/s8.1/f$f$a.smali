.class final Ls8/f$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/f$f;->a(Lhd/a;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhd/a;

.field final synthetic b:Ls8/f;


# direct methods
.method constructor <init>(Lhd/a;Ls8/f;)V
    .locals 0

    iput-object p1, p0, Ls8/f$f$a;->a:Lhd/a;

    iput-object p2, p0, Ls8/f$f$a;->b:Ls8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La8/a;)Lgg/r;
    .locals 3

    const-string/jumbo v0, "devices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls8/f$f$a;->a:Lhd/a;

    iget-object v1, p0, Ls8/f$f$a;->b:Ls8/f;

    new-instance v2, Ls8/f$f$a$a;

    invoke-direct {v2, v0, v1, p1}, Ls8/f$f$a$a;-><init>(Lhd/a;Ls8/f;La8/a;)V

    invoke-static {v2}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La8/a;

    invoke-virtual {p0, p1}, Ls8/f$f$a;->a(La8/a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
