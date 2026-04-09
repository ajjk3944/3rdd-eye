.class final Lx0/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx0/b;


# direct methods
.method constructor <init>(Lx0/b;)V
    .locals 0

    iput-object p1, p0, Lx0/b$a;->a:Lx0/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LIi/N;
    .locals 1

    iget-object v0, p0, Lx0/b$a;->a:Lx0/b;

    invoke-virtual {v0}, Lx0/b;->h()LIi/N;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx0/b$a;->a()LIi/N;

    move-result-object v0

    return-object v0
.end method
