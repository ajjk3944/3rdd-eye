.class final LM/a$b$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/a$b$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/j;


# direct methods
.method constructor <init>(LM/j;)V
    .locals 0

    iput-object p1, p0, LM/a$b$a$a;->a:LM/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, LM/a$b$a$a;->a:LM/j;

    invoke-interface {v0}, LM/j;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/h;->c(J)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM/a$b$a$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
