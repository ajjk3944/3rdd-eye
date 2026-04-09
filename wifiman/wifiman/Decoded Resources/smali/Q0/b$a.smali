.class public final LQ0/b$a;
.super Lv1/h$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ0/b;->d(LQ0/N;Landroid/content/Context;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LIi/n;

.field final synthetic b:LQ0/N;


# direct methods
.method constructor <init>(LIi/n;LQ0/N;)V
    .locals 0

    iput-object p1, p0, LQ0/b$a;->a:LIi/n;

    iput-object p2, p0, LQ0/b$a;->b:LQ0/N;

    invoke-direct {p0}, Lv1/h$e;-><init>()V

    return-void
.end method


# virtual methods
.method public h(I)V
    .locals 4

    iget-object v0, p0, LQ0/b$a;->a:LIi/n;

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to load font "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LQ0/b$a;->b:LQ0/N;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " (reason="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LIi/n;->cancel(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public i(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, LQ0/b$a;->a:LIi/n;

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
