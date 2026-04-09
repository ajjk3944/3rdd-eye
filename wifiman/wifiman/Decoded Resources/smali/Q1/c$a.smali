.class final LQ1/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ1/c;->d(Landroid/content/Context;Lth/l;)LO1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:LQ1/c;


# direct methods
.method constructor <init>(Landroid/content/Context;LQ1/c;)V
    .locals 0

    iput-object p1, p0, LQ1/c$a;->a:Landroid/content/Context;

    iput-object p2, p0, LQ1/c$a;->b:LQ1/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 2

    iget-object v0, p0, LQ1/c$a;->a:Landroid/content/Context;

    const-string v1, "applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LQ1/c$a;->b:LQ1/c;

    invoke-static {v1}, LQ1/c;->c(LQ1/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LQ1/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ1/c$a;->a()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
