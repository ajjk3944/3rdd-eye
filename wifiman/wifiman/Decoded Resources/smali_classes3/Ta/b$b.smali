.class final LTa/b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTa/b;-><init>(Landroid/content/ContentResolver;LIi/J;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LTa/b;

.field final synthetic b:Landroid/content/ContentResolver;


# direct methods
.method constructor <init>(LTa/b;Landroid/content/ContentResolver;)V
    .locals 0

    iput-object p1, p0, LTa/b$b;->a:LTa/b;

    iput-object p2, p0, LTa/b$b;->b:Landroid/content/ContentResolver;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/UUID;
    .locals 3

    iget-object v0, p0, LTa/b$b;->a:LTa/b;

    iget-object v1, p0, LTa/b$b;->b:Landroid/content/ContentResolver;

    invoke-virtual {v0, v1}, LTa/b;->c(Landroid/content/ContentResolver;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_1
    const-string v2, "9774d56d682e549c"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    sget-object v1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string/jumbo v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/UUID;->nameUUIDFromBytes([B)Ljava/util/UUID;

    move-result-object v0

    new-instance v1, LTa/b$b$a;

    invoke-direct {v1, v0}, LTa/b$b$a;-><init>(Ljava/util/UUID;)V

    invoke-static {v1}, LUa/a;->e(Lmh/a;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LTa/b$b;->a()Ljava/util/UUID;

    move-result-object v0

    return-object v0
.end method
