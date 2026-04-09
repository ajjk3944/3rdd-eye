.class final Lj8/c$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj8/c;-><init>(Landroid/content/Context;Lmd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj8/c;


# direct methods
.method constructor <init>(Lj8/c;)V
    .locals 0

    iput-object p1, p0, Lj8/c$f;->a:Lj8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT7/b;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "daynight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj8/c$f;->a:Lj8/c;

    new-instance v1, Lj8/c$f$a;

    invoke-direct {v1, v0, p1}, Lj8/c$f$a;-><init>(Lj8/c;LT7/b;)V

    invoke-static {v1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT7/b;

    invoke-virtual {p0, p1}, Lj8/c$f;->a(LT7/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
