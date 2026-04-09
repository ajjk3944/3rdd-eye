.class final LFb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFb/a;->d(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:LFb/a;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;LFb/a;)V
    .locals 0

    iput-object p1, p0, LFb/a$a;->a:Lkotlin/jvm/internal/L;

    iput-object p2, p0, LFb/a$a;->b:LFb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LFb/a$a;->a:Lkotlin/jvm/internal/L;

    iget v1, v0, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, v0, Lkotlin/jvm/internal/L;->a:I

    iget-object v0, p0, LFb/a$a;->b:LFb/a;

    invoke-static {v0}, LFb/a;->b(LFb/a;)I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, LFb/a$a;->b:LFb/a;

    invoke-static {v0, p1}, LFb/a;->c(LFb/a;Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lig/a;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LFb/a$a;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method
