.class public final Lgd/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgd/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgd/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LG7/a$a;


# direct methods
.method constructor <init>(LG7/a$a;)V
    .locals 0

    iput-object p1, p0, Lgd/b$b;->a:LG7/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lgd/a;
    .locals 4

    iget-object v0, p0, Lgd/b$b;->a:LG7/a$a;

    invoke-interface {v0, p1}, LG7/a$a;->a(I)LG7/q;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LG7/q;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LG7/q;->b()I

    move-result v1

    invoke-virtual {p1}, LG7/q;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LG7/q;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lgd/a;

    invoke-direct {v3, v1, v0, v2, p1}, Lgd/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return-object v3
.end method
