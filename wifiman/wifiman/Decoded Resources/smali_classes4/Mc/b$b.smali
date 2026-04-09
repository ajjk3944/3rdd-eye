.class final LMc/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMc/b;-><init>(LZc/f;Lmc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LMc/b;


# direct methods
.method constructor <init>(LMc/b;)V
    .locals 0

    iput-object p1, p0, LMc/b$b;->a:LMc/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)LDj/a;
    .locals 2

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMc/b$b;->a:LMc/b;

    new-instance v1, LMc/b$b$b;

    invoke-direct {v1, p1, v0}, LMc/b$b$b;-><init>(LZc/e;LMc/b;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LMc/b$b$a;->a:LMc/b$b$a;

    invoke-virtual {p1, v0}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, LMc/b$b;->a(LZc/e;)LDj/a;

    move-result-object p1

    return-object p1
.end method
