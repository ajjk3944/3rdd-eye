.class final LC/m$b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/m$b;->a(LJ0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;

.field final synthetic b:LIi/N;


# direct methods
.method constructor <init>(LC/C;LIi/N;)V
    .locals 0

    iput-object p1, p0, LC/m$b$b;->a:LC/C;

    iput-object p2, p0, LC/m$b$b;->b:LIi/N;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, LC/m$b$b;->a:LC/C;

    iget-object v1, p0, LC/m$b$b;->b:LIi/N;

    invoke-static {v0, v1}, LC/m;->c(LC/C;LIi/N;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC/m$b$b;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
