.class final LD8/v$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/v;->c(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/v;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(LD8/v;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LD8/v$d;->a:LD8/v;

    iput-object p2, p0, LD8/v$d;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljd/a;)Lgg/r;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/v$d;->a:LD8/v;

    iget-object v1, p0, LD8/v$d;->b:Ljava/lang/String;

    new-instance v2, LD8/v$d$a;

    invoke-direct {v2, p1, v0, v1}, LD8/v$d$a;-><init>(Ljd/a;LD8/v;Ljava/lang/String;)V

    invoke-static {v2}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljd/a;

    invoke-virtual {p0, p1}, LD8/v$d;->a(Ljd/a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
