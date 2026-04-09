.class final Ly8/t$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/t;-><init>(LZc/c;Lad/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/t;


# direct methods
.method constructor <init>(Ly8/t;)V
    .locals 0

    iput-object p1, p0, Ly8/t$b;->a:Ly8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldd/i;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/t$b;->a:Ly8/t;

    new-instance v1, Ly8/t$b$a;

    invoke-direct {v1, v0, p1}, Ly8/t$b$a;-><init>(Ly8/t;Ldd/i;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldd/i;

    invoke-virtual {p0, p1}, Ly8/t$b;->a(Ldd/i;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
